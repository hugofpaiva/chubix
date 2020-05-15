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
    <assoc=right> expr '^' expr               #DimPower
    | expr op=('*'|'/') expr                  #DimMultDiv
    | expr op=('+'|'-') expr                  #DimSumMin
    | op=('+'|'-')? '(' expr ')'              #DimUnn
    | op=('+'|'-')? SYMB                      #DimSymb
;

