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
            ;

print: 'print' '(' (expr|STRING)? ')';

input: 'input' '(' STRING? ')';


funcOp : print
      | assignment
      | conditional
      | forLoop
      | breakLoop
      | continueLoop
      | whileLoop
      | declare
      | returnFunc
      ;

returnFunc: {insideFunc > 0}? 'return' (expr)?;

function: {insideFunc++;} 
          'function' ret_type=type func_name=ID '(' (declare (',' declare)*)? ')' '{' (funcOp ';')* '}'
          {insideFunc--;} 
          ;

callFunction: func_name=ID '(' (expr (',' expr)*)? ')' ;


assignment: ID '=' (expr|input|STRING) ('['opdim']')?              #assignVar
            | declare '=' (expr|input|STRING) ('['opdim']')?       #defineVar
            ;

opdim: 
    <assoc=right> opdim '^' (opdim| op=('+'|'-')? INTEGER  | op=('+'|'-')? DOUBLE )   #DimPower
    | opdim op=('*'|'/') opdim                                                        #DimMultDiv
    | opdim op=('+'|'-') opdim                                                        #DimSumMin
    | op=('+'|'-')? '(' opdim ')'                                                     #DimUnn
    | op=('+'|'-')? ID                                                                #DimID
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
    | DOUBLE ('['opdim']')?                                       #doubleExpr
    | INTEGER ('['opdim']')?                                      #integerExpr
    | BOOLEAN                                                     #booleanExpr
    | ID                                                          #idExpr
    | callFunction                                                #functionExpr
    ;


BOOLEAN: 'true' | 'false';
ID: [a-zA-Z_][a-zA-Z_0-9]*;
DOUBLE: [0-9]+ '.' [0-9]*;
INTEGER: [0-9]+;
STRING: '"' .*? '"';
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '#' .*? '\n' -> skip;
ERROR: .;