grammar chubix;

@parser::members{
  int insideLoop = 0;
  int insideFunc = 0;
  public static final SymbolTable map = new SymbolTable();
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
            ;

print: 'print' '(' (expr|STRING)? ')';

input: 'input' '(' STRING? ')';

returnFunc: {insideFunc > 0}? 'return' (expr)?;

function: {insideFunc==0}? {insideFunc++;} 
          'function' ret_type=type func_name=ID '(' (declare (',' declare)*)? ')' '{' (instruction ';')* '}'
          {insideFunc--;} 
          ;

callFunction: func_name=ID '(' (expr (',' expr)*)? ')' ;

assignment: ID '=' (expr|input|STRING) ('['unitdim']')?              #assignVar
            | declare '=' (expr|input|STRING) ('['unitdim']')?       #defineVar
            ;

declare: type ID;

conditional: 'if' '(' expr ')' '{' trueSL=instList '}' ('else' falseSL=elseCond)?;

elseCond: conditional
        | '{' instList '}'
        ;

forLoop : {insideLoop++;}
          'for' '(' var=assignment ';' varBreak= expr ';' assignment ')' '{' instList '}'
          {insideLoop--;}
          ;

whileLoop : {insideLoop++;}
            'while' '(' expr ')' '{' condSL=instList '}'
            {insideLoop--;}
            ;

breakLoop: {insideLoop > 0}? 'break';

continueLoop: {insideLoop > 0}? 'continue';
           
type ://returns[Type res]:
	  'Integer'			#intType
	| 'Double'			#doubleType
	| 'Boolean'			#boolType
	| 'String'			#strType
  | ID            #dimensionType
	;

expr: //returns[Type exprType, String varName]:
      sign=('+'|'-') expr                                         #signExpr
    | <assoc=right> expr '^' expr                                 #powExpr
    | expr op=('*' | '/' | '%' | '//') expr                       #multDivRestExpr
    | expr op=('+' | '-') expr                                    #addSubExpr
    | expr op=('==' | '!=' | '<' | '>' | '>=' | '<=') expr        #conditionalExpr
    | '(' expr ')'                                                #parenExpr
    | ID op=('++' | '--')                                         #doubleSumMin
    | DOUBLE ('['unitdim']')?                                     #doubleExpr
    | INTEGER ('['unitdim']')?                                    #integerExpr
    | BOOLEAN                                                     #booleanExpr
    | ID                                                          #idExpr
    | callFunction                                                #functionExpr
    ;

unitdim: 
    <assoc=right> unitdim '^' (unitdim| op=('+'|'-')? INTEGER  | op=('+'|'-')? DOUBLE )   #DimPower
    | unitdim op=('*'|'/') unitdim                                                        #DimMultDiv
    | unitdim op=('+'|'-') unitdim                                                        #DimSumMin
    | op=('+'|'-')? '(' unitdim ')'                                                       #DimUnn
    | op=('+'|'-')? ID                                                                    #DimID
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