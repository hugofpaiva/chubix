grammar dimensions;

main: statList EOF;

statList: (stat? ';')*;

stat: dim
    | unit
    ;

dim : 'dim' ID '(' unitdim ':' (unitdim|type) ')' ;

unit : 'unit' ID '('  unitdim  ':' expr ')' ;

expr :  
    <assoc=right> expr '^' expr               #ExprPower
    | expr op=('*'|'/') expr                  #ExprMultDiv
    | expr op=('+'|'-') expr                  #ExprSumMin
    | op=('+'|'-')? '(' expr ')'              #ExprUnn
    | op=('+'|'-')? ID                        #ExprID
    | op=('+'|'-')? INTEGER                   #ExprInt
    | op=('+'|'-')? DOUBLE                    #ExprDouble
;

unitdim: 
    <assoc=right> unitdim '^' (unitdim| op=('+'|'-')? INTEGER | op=('+'|'-')? DOUBLE )      #DimPower
    | unitdim op=('*'|'/') unitdim                                                          #DimMultDiv
    | unitdim op=('+'|'-') unitdim                                                          #DimSumMin
    | op=('+'|'-')? '(' unitdim ')'                                                         #DimUnn
    | op=('+'|'-')? ID                                                                      #DimID
;

type ://returns[Type res]:
	  'Integer'			#intType
	| 'Double'			#doubleType
    ;

ID: [a-zA-Z_][a-zA-Z_0-9]*;
INTEGER : [0-9]+;
DOUBLE: [0-9]+ ('.' [0-9]+)?;
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '#' .*? '\n' -> skip;
ERROR: .;