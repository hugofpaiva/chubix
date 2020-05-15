grammar chubix;

main: statList EOF;

statList: (stat? ';')*;

stat: print
    | assignment
    | conditional
    ;

print: 'print' '('expr')';

assignment: (ID '=')* expr;

conditional: 'if' '(' expr ')' trueSL=statList ('else' falseSL=statList)? 'end';
//
for : 'for' '(' ID '=' ';'  ')' statList 'end'

//              
while : 'while'


expr:
      sign=('+'|'-') expr                           #signExpr
    | <assoc=right> expr '^' expr                   #powExpr
    | expr op=('*' | '/' | '%' | '//') expr         #multDivRestExpr
    | expr op=('+' | '-') expr                      #addSubExpr
    | expr op=('==' | '!=' | '<' | '>') expr        #comparisonExpr
    | '(' expr ')'                                  #parenExpr
    | REAL                                          #realExpr
    | INTEGER                                       #integerExpr
    | BOOLEAN                                       #booleanExpr
    | ID                                            #idExpr
    ;

BOOLEAN: 'true' | 'false';
ID: [a-zA-Z_][a-zA-Z_0-9]*;
REAL: [0-9]+ '.' [0-9]*;
INTEGER: [0-9]+;
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '#' .*? '\n';
ERROR: .;