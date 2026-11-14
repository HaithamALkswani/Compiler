grammar HTML;

// =====================================================================
//  HTML + Thymeleaf templates (products, add-product, product-details)
// =====================================================================

// ==========================================
// 1. Parser Rules
// ==========================================

program     : node* EOF ;

node        : doctype
            | element
            | inlineExpression
            | text
            ;

doctype     : DOCTYPE ;

element     : TAG_OPEN IDENTIFIER attribute* TAG_CLOSE node* closingTag    # normalElement      // <div> ... </div>
            | TAG_OPEN (IDENTIFIER | VOID_TAG) attribute* TAG_SLASH_CLOSE  # selfClosingElement // <input ... />
            | TAG_OPEN VOID_TAG attribute* TAG_CLOSE                       # voidElement        // <img ...>
            ;

closingTag  : TAG_CLOSE_START IDENTIFIER TAG_CLOSE ;

// ---------- attributes ----------
attribute   : TH_PREFIX IDENTIFIER EQUALS QUOTE thValue QUOTE   # thymeleafAttribute   // th:text="${p.name}"
            | attrName EQUALS QUOTE attrValueToken* QUOTE       # htmlAttribute        // class="btn"
            | attrName                                          # booleanAttribute     // required
            ;

attrName    : IDENTIFIER (COLON IDENTIFIER)? ;                  // class, xmlns:th

thValue     : eachExpression
            | expression
            ;

// th:each="product, stat : ${products}"
eachExpression : IDENTIFIER (COMMA IDENTIFIER)? COLON expression ;

// ---------- Thymeleaf expressions ----------
// cond ? a : b
expression     : relationalExpr (QUESTION expression COLON expression)? ;

// a > b , a >= b
relationalExpr : additiveExpr ((TAG_CLOSE | GE) additiveExpr)? ;

// a + b
additiveExpr   : postfixExpr (PLUS postfixExpr)* ;

// product.name , product.description.length()
postfixExpr    : primary (DOT IDENTIFIER arguments?)* ;

primary     : variableExpr
            | selectionExpr
            | linkExpr
            | literalSubstitution
            | stringLiteral
            | NUMBER
            | HASH IDENTIFIER               // #lists, #fields, #numbers
            | IDENTIFIER
            ;

arguments   : LPAREN (expression (COMMA expression)*)? RPAREN ;

variableExpr  : VAR_START expression RBRACE ;      // ${...}
selectionExpr : SEL_START expression RBRACE ;      // *{...}

// @{/css/style.css}  @{/products/{id}(id=${product.id})}  @{${product.imageUrl}}
linkExpr    : LINK_START linkPart+ linkParams? RBRACE ;
linkPart    : SLASH
            | IDENTIFIER
            | DOT
            | LBRACE IDENTIFIER RBRACE      // {id}
            | variableExpr
            ;
linkParams  : LPAREN IDENTIFIER EQUALS expression RPAREN ;

stringLiteral       : SINGLE_QUOTE (~(SINGLE_QUOTE | QUOTE))* SINGLE_QUOTE ;   // '...'
literalSubstitution : PIPE (variableExpr | ~(PIPE | QUOTE | VAR_START))* PIPE ;   // |Price: ${p.price}|

// [[${products.size()}]]
inlineExpression : INLINE_START expression INLINE_END ;

// ---------- text ----------
text           : textToken+ ;
textToken      : ~(TAG_OPEN | TAG_CLOSE_START | INLINE_START) ;   // any token except these
attrValueToken : ~QUOTE ;                                          // any token except "


// ==========================================
// 2. Lexer Rules
// ==========================================

COMMENT         : '<!--' .*? '-->' -> skip ;
DOCTYPE         : '<!DOCTYPE' ~[>]* '>' ;

TAG_CLOSE_START : '</' ;
TAG_SLASH_CLOSE : '/>' ;
TAG_OPEN        : '<' ;
GE              : '>=' ;
TAG_CLOSE       : '>' ;

VAR_START       : '${' ;
SEL_START       : '*{' ;
LINK_START      : '@{' ;
INLINE_START    : '[[' ;
INLINE_END      : ']]' ;

TH_PREFIX       : 'th:' ;
VOID_TAG        : 'img' | 'input' | 'meta' | 'link' | 'br' | 'hr' ;

COLON           : ':' ;
EQUALS          : '=' ;
QUOTE           : '"' ;
SINGLE_QUOTE    : '\'' ;
DOT             : '.' ;
COMMA           : ',' ;
SLASH           : '/' ;
PLUS            : '+' ;
QUESTION        : '?' ;
PIPE            : '|' ;
LPAREN          : '(' ;
RPAREN          : ')' ;
LBRACE          : '{' ;
RBRACE          : '}' ;
HASH            : '#' ;
AT              : '@' ;
DOLLAR          : '$' ;
STAR            : '*' ;

NUMBER          : [0-9]+ ('.' [0-9]+)? ;
IDENTIFIER      : [a-zA-Z_][a-zA-Z0-9_\-]* ;
TEXT            : ~[<>"'=:${}/.,*#@()+?|\r\n\t ]+ ;
WS              : [ \t\r\n]+ -> skip ;
