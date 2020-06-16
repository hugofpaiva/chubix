grammar chubix;

@parser::members{
  int insideLoop = 0;
  int insideFunc = 0;
  public static final SymbolTable global = new SymbolTable();
  public static SymbolTable current = global;
}
@parser::header{
  import java.util.HashMap;
}

main: (importDim? ';')* (function? ';')* instList EOF ;

instList: (instruction? ';')*;

instruction:  print 
            | assignment
            | conditional
            | forLoop
            | breakLoop
            | continueLoop
            | whileLoop
            | declare
            | callFunction
            | declAssig
            ;

importDim: 'import' FILENAME;

print: 'print' '(' (expr)? ')';

returnFunc returns[Type ret]: 'return' expr? ';';

function: {insideFunc==0}? {insideFunc++;}  
          'function' ret_type=type func_name=ID '(' (declare (',' declare)*)? ')' '{' instList returnFunc '}'
          {insideFunc--;}
          ;

callFunction returns [String varName]: func_name=ID '(' (expr (',' expr)*)? ')' ;

assignment: ID '=' expr ;

declAssig: declare '=' expr;

declare: type ID;

conditional: 'if' '(' expr ')' '{' trueSL=instList '}' ('else' falseSL=elseCond)?;

elseCond: conditional               #conditionalElse
        | '{' instList '}'          #instElse
        ;

forLoop : {insideLoop++;}
          'for' '(' (declAssig|var=assignment) ';' varBreak= expr ';' varInc=assignment ')' '{' instList '}'
          {insideLoop--;}
          ;

whileLoop : {insideLoop++;}
            'while' '(' expr ')' '{' condSL=instList '}'
            {insideLoop--;}
            ;

breakLoop: {insideLoop > 0}? 'break';

continueLoop: {insideLoop > 0}? 'continue';
           
type returns[Type res]:
	  'Integer'			            #intType
	| 'Double'			            #doubleType
	| 'Boolean'			            #boolType
	| 'String'			            #strType
  | {insideFunc > 0}? 'Void'  #voidType
  | ID                        #dimensionType
	;

expr returns[Type exprType, String varName]:
      expr '['unitdim']'                                          #exprConvUnit
    | <assoc=right> e1=expr '^' e2=expr                           #powExpr
    | sign=('+'|'-') expr                                         #signExpr
    | e1=expr op=('*' | '/') e2=expr                              #multDivRestExpr
    | e1=expr op=('+' | '-') e2=expr                              #addSubExpr
    | e1=expr op=('==' | '!=' | '<' | '>' | '>=' | '<=') e2=expr  #conditionalExpr
    | '(' expr ')'                                                #parenExpr
    | ID op=('++' | '--')                                         #doubleSumMin
    | 'input' '(' (STRING ',')? type')'                           #inputExpr
    | BOOLEAN                                                     #booleanExpr
    | ID                                                          #idExpr
    | STRING                                                      #stringExpr
    | callFunction                                                #functionExpr
    | DOUBLE                                                      #doubleExpr
    | INTEGER                                                     #integerExpr
    ;

unitdim returns [DimensionsType unitdimType]: 
    <assoc=right> unitdim '^' (op=('+'|'-')? INTEGER)   #DimPower
    | unitdim op=('*'|'/') unitdim                      #DimMultDiv
    | op=('+'|'-')? '(' unitdim ')'                     #DimUnn
    | op=('+'|'-')? ID                                  #DimID
    ;

/*
Reserved Words : ['print', 'for', 'while', 'break', 'if', 'else', 'return',
'function', 'input', 'Integer', 'Double', 'Boolean', 'continue']
*/

BOOLEAN: 'true' | 'false';
ID: [a-zA-Z_][a-zA-Z_0-9]*;
FILENAME: ('./'|'../')? ID ('/' ID)*'.ubi';
DOUBLE: [0-9]+ '.' [0-9]*;
INTEGER: [0-9]+;
STRING: '"' .*? '"';
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '#' .*? ('\n'|EOF) -> skip;
COMMENT: '/*' .*? '*/' -> skip;
ERROR: .;