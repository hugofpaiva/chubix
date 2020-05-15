grammar dimensions;

@parser::header {
import java.util.Map;
import java.util.HashMap;
}

/*
@parser::members {
static protected Map<String,Symbol> SymbolTable = new HashMap<>();
}
*/
main: statList EOF;

statList: (stat? ';')*;

stat: dim
    | unit
    ;

dim : 'dim' ID '(' opdim ')'  ;

unit : 'unit' ID '('  ID  ':' expr ')' ;

expr :  
    <assoc=right> expr '^' expr               #ExprPower
    | expr op=('*'|'/') expr                  #ExprMultDiv
    | expr op=('+'|'-') expr                  #ExprSumMin
    | op=('+'|'-')? '(' expr ')'              #ExprUnn
    | op=('+'|'-')? ID                        #ExprID
    | op=('+'|'-')? INT                       #ExprInt
    | op=('+'|'-')? DOUBLE                    #ExprDouble
;

opdim: 
    <assoc=right> opdim '^' opdim               #DimPower
    | opdim op=('*'|'/') opdim                  #DimMultDiv
    | opdim op=('+'|'-') opdim                  #DimSumMin
    | op=('+'|'-')? '(' opdim ')'               #DimUnn
    | op=('+'|'-')? ID                          #DimID
;


ID: [a-zA-Z][a-zA-Z_0-9]*;
INT : [0-9]+;
DOUBLE: [0-9]+ ('.' [0-9]+)?;
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '#' .*? '\n';
ERROR: .;




