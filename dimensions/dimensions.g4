grammar dimensions;

@parser::header {
import java.util.Map;
import java.util.HashMap;
}

@parser::members {
static protected Map<String,Symbol> symbolTable = new HashMap<>();
}
main: statList EOF;

statList: (stat? ';')*;

stat: dim
    | unit
    ;

dim : 'dim' ID '(' opdim ')'  ;

unit : 'unit' ID '('  SYMB  ':' expr ')' ;

expr :  
    <assoc=right> expr '^' expr               #ExprPower
    | expr op=('*'|'/') expr                  #ExprMultDiv
    | expr op=('+'|'-') expr                  #ExprSumMin
    | op=('+'|'-')? '(' expr ')'              #ExprUnn
    | op=('+'|'-')? SYMB                      #ExprSymb
    | op=('+'|'-')? INT                       #ExprInt
    | op=('+'|'-')? DOUBLE                    #ExprDouble
;

opdim: 
    <assoc=right> opdim '^' opdim               #DimPower
    | opdim op=('*'|'/') opdim                  #DimMultDiv
    | opdim op=('+'|'-') opdim                  #DimSumMin
    | op=('+'|'-')? '(' opdim ')'              #DimUnn
    | op=('+'|'-')? SYMB                      #DimSymb
;


ID: [a-zA-Z_][a-zA-Z_0-9]*;
SYMB :[a-zA-Z][a-zA-Z/*0-9-^]*;
INT : [0-9]+;
DOUBLE: [0-9]+ ('.' [0-9]+)?;
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '#' .*? '\n';
ERROR: .;


