grammar JavaSubset;

// =====================================================================
//  Subset of Java for ProductController.java and Product.java
// =====================================================================

// ==========================================
// 1. Parser Rules
// ==========================================

compilationUnit   : packageDeclaration? importDeclaration* classDeclaration EOF ;

packageDeclaration: PACKAGE qualifiedName SEMI ;

importDeclaration : IMPORT qualifiedName (DOT STAR)? SEMI ;    // import java.util.List;  import x.y.*;

qualifiedName     : IDENTIFIER (DOT IDENTIFIER)* ;

// ---------- annotations & modifiers ----------
modifiers         : (annotation | modifier)* ;

modifier          : PUBLIC | PRIVATE | FINAL ;

annotation        : AT IDENTIFIER (LPAREN STRING_LITERAL RPAREN)? ;   // @Controller  @GetMapping("/{id}")

// ---------- class ----------
classDeclaration  : modifiers CLASS IDENTIFIER classBody ;

classBody         : LBRACE member* RBRACE ;

member            : fieldDeclaration
                  | constructorDeclaration
                  | methodDeclaration
                  ;

fieldDeclaration  : modifiers type IDENTIFIER (ASSIGN expression)? SEMI ;

constructorDeclaration : modifiers IDENTIFIER LPAREN parameterList? RPAREN block ;

methodDeclaration : modifiers (type | VOID) IDENTIFIER LPAREN parameterList? RPAREN block ;

parameterList     : parameter (COMMA parameter)* ;

parameter         : annotation* type IDENTIFIER ;     // @PathVariable("id") Long id

// ---------- types ----------
type              : DOUBLE                            // double
                  | IDENTIFIER typeArguments?         // String, Model, List<Product>
                  ;

typeArguments     : LT type? GT ;                     // <Product>  or  <> in new ArrayList<>()

// ---------- statements ----------
block             : LBRACE statement* RBRACE ;

statement         : type IDENTIFIER ASSIGN expression SEMI     # localVariableStatement
                  | IF LPAREN expression RPAREN block          # ifStatement
                  | RETURN expression SEMI                     # returnStatement
                  | expression SEMI                            # expressionStatement
                  ;

// ---------- expressions ----------
expression        : lambdaExpression
                  | assignmentExpression
                  ;

lambdaExpression  : IDENTIFIER ARROW expression ;                         // p -> p.getId().equals(id)

assignmentExpression : orExpression (ASSIGN expression)? ;                // this.id = id

orExpression      : equalityExpression (OR equalityExpression)* ;          // a || b

equalityExpression: postfixExpression (EQUAL postfixExpression)* ;        // a == null

postfixExpression : primary (DOT IDENTIFIER arguments?)* INC? ;           // products.stream().filter(...)   nextId++

primary           : literal
                  | THIS
                  | NEW IDENTIFIER typeArguments? arguments               // new Product(...)  new ArrayList<>()
                  | IDENTIFIER arguments?
                  ;

arguments         : LPAREN (expression (COMMA expression)*)? RPAREN ;

literal           : INTEGER_LITERAL
                  | FLOAT_LITERAL
                  | STRING_LITERAL
                  | NULL
                  ;


// ==========================================
// 2. Lexer Rules
// ==========================================

// keywords (before IDENTIFIER)
PACKAGE         : 'package' ;
IMPORT          : 'import' ;
CLASS           : 'class' ;
PUBLIC          : 'public' ;
PRIVATE         : 'private' ;
FINAL           : 'final' ;
VOID            : 'void' ;
DOUBLE          : 'double' ;
RETURN          : 'return' ;
IF              : 'if' ;
NEW             : 'new' ;
THIS            : 'this' ;
NULL            : 'null' ;

// literals
FLOAT_LITERAL   : [0-9]+ '.' [0-9]+ ;                // 1200.0
INTEGER_LITERAL : [0-9]+ [lL]? ;                     // 1L
STRING_LITERAL  : '"' (~["\\\r\n] | '\\' .)* '"' ;

// separators and operators
LPAREN          : '(' ;
RPAREN          : ')' ;
LBRACE          : '{' ;
RBRACE          : '}' ;
SEMI            : ';' ;
COMMA           : ',' ;
DOT             : '.' ;
AT              : '@' ;
ARROW           : '->' ;
EQUAL           : '==' ;
OR              : '||' ;
INC             : '++' ;
ASSIGN          : '=' ;
LT              : '<' ;
GT              : '>' ;
STAR            : '*' ;

IDENTIFIER      : [a-zA-Z_$] [a-zA-Z0-9_$]* ;

WS              : [ \t\r\n]+ -> skip ;
BLOCK_COMMENT   : '/*' .*? '*/' -> skip ;
LINE_COMMENT    : '//' ~[\r\n]* -> skip ;
