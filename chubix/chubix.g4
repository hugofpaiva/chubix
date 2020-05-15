grammar chubix;


main: statList EOF;

statList: (stat? ';')*;

stat: 
    ;


 

ID: [a-zA-Z_][a-zA-Z_0-9]*;
SYMB :[a-zA-Z][a-zA-Z/*0-9-^]*;
INT : [0-9]+;
DOUBLE: [0-9]+ ('.' [0-9]+)?;
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '#' .*? '\n';
ERROR: .;

