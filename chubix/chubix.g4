grammar chubix;

@parser::members{
  int insideLoop = 0;
  int insideFunc = 0;
  public static final HashMap<String, Symbol> symbolTable = new HashMap<String, Symbol>();
}
@parser::header{
  import java.util.HashMap;
}

main: instList EOF;

instList: (instruction? ';')* ;

instruction:  print 
            | assignment
            | conditional
            | forLoop
            | breakLoop
            | continueLoop
            | whileLoop
            | declare
            | callFunction
            | function
            | returnFunc
            | declAssig
            ;

print: 'print' '(' (expr)? ')';

returnFunc: {insideFunc > 0}? 'return' (expr)?;

function: {insideFunc==0}? {insideFunc++;} 
          'function' ret_type=type func_name=ID '(' (declare (',' declare)*)? ')' '{' instList '}'
          {insideFunc--;} 
          ;

callFunction: func_name=ID '(' (expr (',' expr)*)? ')' ;

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
	  'Integer'			#intType
	| 'Double'			#doubleType
	| 'Boolean'			#boolType
	| 'String'			#strType
  	| ID            		#dimensionType
	;

expr returns[Type exprType, String varName]:
      sign=('+'|'-') expr                                         #signExpr
    | <assoc=right> e1=expr '^' e2=expr                           #powExpr
    | e1=expr op=('*' | '/' | '%' | '//') e2=expr                 #multDivRestExpr
    | e1=expr op=('+' | '-') e2=expr                              #addSubExpr
    | e1=expr op=('==' | '!=' | '<' | '>' | '>=' | '<=') e2=expr  #conditionalExpr
    | '(' expr ')'                                                #parenExpr
    | ID op=('++' | '--')                                         #doubleSumMin
    | 'input' '(' STRING? ')' ('['unitdim']')?                    #inputExpr
    | DOUBLE ('['unitdim']')?                                     #doubleExpr
    | INTEGER ('['unitdim']')?                                    #integerExpr
    | BOOLEAN                                                     #booleanExpr
    | ID                                                          #idExpr
    | STRING                                                      #stringExpr
    | callFunction                                                #functionExpr
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
DOUBLE: [0-9]+ '.' [0-9]*;
INTEGER: [0-9]+;
STRING: '"' .*? '"';
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '#' .*? '\n' -> skip;
COMMENT: '/*' .*? '*/' -> skip;
ERROR: .;
