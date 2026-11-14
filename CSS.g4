grammar CSS;

// =====================================================================
//  CSS for style.css
//  Whitespace goes to the HIDDEN channel, so "div.card" and "div .card"
//  give the same tokens; the Visitor can tell them apart by checking
//  whether the two tokens are adjacent in the source.
// =====================================================================

// ==========================================
// 1. Parser Rules
// ==========================================

stylesheet      : (ruleSet | mediaRule)* EOF ;

// .card { ... }
ruleSet         : selectorGroup LBRACE declarationList RBRACE ;

// .card-img, .details-img
selectorGroup   : selector (COMMA selector)* ;

// .form .field > label
selector        : compoundSelector (GT? compoundSelector)* ;

// input[type="text"]   .btn:hover   *   body
compoundSelector: (IDENT | STAR) simpleSelector*
                | simpleSelector+
                ;

simpleSelector  : DOT IDENT                              // .card
                | COLON IDENT                            // :hover  :root
                | LBRACK IDENT EQUALS STRING RBRACK      // [type="text"]
                ;

declarationList : declaration (SEMI declaration?)* ;

// color: #fff !important
declaration     : IDENT COLON value IMPORTANT? ;

// 0 2px 6px rgba(0, 0, 0, 0.1)
value           : term ((COMMA | MINUS)? term)* ;

term            : NUMBER                 // 0  0.9
                | PERCENTAGE             // 100%
                | DIMENSION              // 16px  1.2em  1fr
                | STRING                 // "Segoe UI"
                | IDENT                  // auto  bold  --main-color
                | HASH                   // #fff
                | FUNCTION value RPAREN  // var(..)  rgba(..)  calc(..)  repeat(..)
                ;

// @media (max-width: 600px) { ... }
mediaRule       : AT_KEYWORD (LPAREN declaration RPAREN)* LBRACE ruleSet* RBRACE ;


// ==========================================
// 2. Lexer Rules
// ==========================================

COMMENT         : '/*' .*? '*/' -> skip ;
WS              : [ \t\r\n]+ -> channel(HIDDEN) ;

IMPORTANT       : '!important' ;
AT_KEYWORD      : '@' [a-zA-Z\-]+ ;
HASH            : '#' [a-zA-Z0-9]+ ;
STRING          : '"' ~["\r\n]* '"' ;

DIMENSION       : NUM [a-zA-Z]+ ;
PERCENTAGE      : NUM '%' ;
NUMBER          : NUM ;

FUNCTION        : NAME '(' ;
IDENT           : NAME ;

LBRACE          : '{' ;
RBRACE          : '}' ;
LPAREN          : '(' ;
RPAREN          : ')' ;
LBRACK          : '[' ;
RBRACK          : ']' ;
SEMI            : ';' ;
COLON           : ':' ;
COMMA           : ',' ;
DOT             : '.' ;
GT              : '>' ;
STAR            : '*' ;
EQUALS          : '=' ;
MINUS           : '-' ;

fragment NAME   : '--'? [a-zA-Z_] [a-zA-Z0-9_\-]* ;     // color, font-size, --main-color
fragment NUM    : [0-9]+ ('.' [0-9]+)? | '.' [0-9]+ ;
