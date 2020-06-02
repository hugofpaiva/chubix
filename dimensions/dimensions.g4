grammar dimensions;

@parser::header {
    import java.util.Map;
    import java.util.HashMap;
}

@parser::members {
    static protected Map<String,DimensionsType> dimTable = new HashMap<>();
}

main: statList EOF;

statList: (stat? ';')*;

stat: dim
    | unit
    ;

dim : 'dim' ID '(' ID ':' (type) ')'      #PrimitiveDim
    | 'dim' ID '(' (ID ':')? unitdim ')'  #RelativeDim
    ;

unit : 'unit' ID '('  ID  ':' expr ')';

expr :  
    <assoc=right> expr '^' expr         #ExprPower
    | expr op=('*'|'/') expr            #ExprMultDiv
    | expr op=('+'|'-') expr            #ExprSumMin
    | op=('+'|'-')? '(' expr ')'        #ExprUnn
    | op=('+'|'-')? ID                  #ExprID
    | op=('+'|'-')? INTEGER             #ExprInt
    | op=('+'|'-')? DOUBLE              #ExprDouble
    ;

unitdim:
    <assoc=right> unitdim '^' (unitdim| op=('+'|'-')? INTEGER | op=('+'|'-')? DOUBLE )      #DimPower
    | unitdim op=('*'|'/') unitdim                                                          #DimMultDiv
    | op=('+'|'-')? '(' unitdim ')'                                                         #DimUnn
    | op=('+'|'-')? ID                                                                      #DimID
    ;

type returns[Type res]:
	  'Integer'			{$res = new IntegerType();}
	| 'Double'			{$res = new DoubleType();}    
    ;

ID: [a-zA-Z_][a-zA-Z_0-9]*;
INTEGER : [0-9]+;
DOUBLE: [0-9]+ ('.' [0-9]+)?;
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '#' .*? '\n' -> skip;
ERROR: .;