grammar chubix;

@parser::members{
  int insideLoop = 0;
  public static final SymbolTable map = new SymbolTable();
}
main: instList EOF;

instList: (instruction? ';')*;

instruction:  print 
            | assignment
            | conditional
            | forLoop
            | breakLoop
            | continueLoop
            | whileLoop
            ;

print: 'print' '(' (expr|STRING)? ')';

assignment: ID '=' expr ('['ID']')?;  

conditional: 'if' '(' expr ')' '{' trueSL=instList '}' ('else' falseSL=elseCond)?;

elseCond: conditional
        | '{' instList '}'
        ;

forLoop : 'for' '(' var=assignment ';' varBreak= expr ';' varCond=expr ')' '{' {insideLoop++;} instList {insideLoop--;} '}';

whileLoop : 'while' '(' expr ')' '{' {insideLoop++;} condSL=instList {insideLoop--;} '}';

breakLoop: {insideLoop > 0}? 'break';

continueLoop: {insideLoop > 0}? 'continue';
           
type ://returns[Type res]:
	  'Integer'			#intType
	| 'Double'			#doubleType
	| 'Boolean'			#boolType
	| 'String'			#strType
	;

expr: //returns[Type exprType, String varName]:
      sign=('+'|'-') expr                           #signExpr
    | <assoc=right> expr '^' expr                   #powExpr
    | expr op=('*' | '/' | '%' | '//') expr         #multDivRestExpr
    | expr op=('+' | '-') expr                      #addSubExpr
    | expr op=('==' | '!=' | '<' | '>') expr        #conditionalExpr
    | '(' expr ')'                                  #parenExpr
    | ID op=('++' | '--')                           #doubleSumMin
    | DOUBLE ('['ID']')?                            #doubleExpr
    | INTEGER ('['ID']')?                           #integerExpr
    | BOOLEAN                                       #booleanExpr
    | ID                                            #idExpr
    ;

BOOLEAN: 'true' | 'false';
ID: [a-zA-Z_][a-zA-Z_0-9]*;
DOUBLE: [0-9]+ '.' [0-9]*;
INTEGER: [0-9]+;
STRING: '"' .*? '"';
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '#' .*? '\n' -> skip;
ERROR: .;