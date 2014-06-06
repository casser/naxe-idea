package org.carracoo.naxe.idea.lang;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static org.carracoo.naxe.idea.lang.lexer.NaxeElements.*;

%%

%{
  public _NaxeLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _NaxeLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]

WORD      = [:jletter:][:jletterdigit:]*
SMETA     = "@"[:jletter:][:jletterdigit:]*
EMETA     = "@:"[:jletter:][:jletterdigit:]*



COMMENT_TAIL        =([^"*"]*("*"+[^"*""/"])?)*("*"+"/")?


DIGIT = [0-9]
DIGIT_OR_UNDERSCORE = [_0-9]
DIGITS = {DIGIT} | {DIGIT} {DIGIT_OR_UNDERSCORE}*
HEX_DIGIT_OR_UNDERSCORE = [_0-9A-Fa-f]


HEX_LINTEGER = 0 [Xx] {HEX_DIGIT_OR_UNDERSCORE}*
BIN_LINTEGER = 0 [Bb] {DIGIT_OR_UNDERSCORE}*


DEC_FP_LITERAL      = {DIGITS} {DEC_EXPONENT} | {DEC_SIGNIFICAND} {DEC_EXPONENT}?
DEC_SIGNIFICAND     = "." {DIGITS} | {DIGITS} "." {DIGIT_OR_UNDERSCORE}*
DEC_EXPONENT        = [Ee] [+-]? {DIGIT_OR_UNDERSCORE}*
HEX_FP_LITERAL      = {HEX_SIGNIFICAND} {HEX_EXPONENT}
HEX_SIGNIFICAND     = 0 [Xx] ({HEX_DIGIT_OR_UNDERSCORE}+ "."? | {HEX_DIGIT_OR_UNDERSCORE}* "." {HEX_DIGIT_OR_UNDERSCORE}+)
HEX_EXPONENT        = [Pp] [+-]? {DIGIT_OR_UNDERSCORE}*


ESCAPE_SEQUENCE     =\\[^\r\n]



WHITE_SPACE  = ({LINE_WS}|{EOL})+
MCOMMENT     = ("/*"[^"*"]{COMMENT_TAIL})|"/*"
SCOMMENT     = "/""/"[^\r\n]*
DCOMMENT     = "/*""*"+("/"|([^"/""*"]{COMMENT_TAIL}))?

LINTEGER     = {DIGITS} | {HEX_LINTEGER} | {BIN_LINTEGER}
LLONG        = {LINTEGER} [Ll]
LFLOAT       = ({DEC_FP_LITERAL} | {HEX_FP_LITERAL}) [Ff] | {DIGITS} [Ff]
LDOUBLE      = ({DEC_FP_LITERAL} | {HEX_FP_LITERAL}) [Dd]? | {DIGITS} [Dd]

REGEXP       = "~""/"([^\\\'\r\n]|{ESCAPE_SEQUENCE})*("/"|\\)?
SSTRING      = "'"([^\\\'\r\n]|{ESCAPE_SEQUENCE})*("'"|\\)?
QSTRING      = \"([^\\\"\r\n]|{ESCAPE_SEQUENCE})*(\"|\\)?


%%
<YYINITIAL> {
  {WHITE_SPACE}      { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "package"          { return K_PACKAGE; }
  "using"            { return K_USING; }
  "import"           { return K_IMPORT; }
  "rename"           { return K_RENAME; }
  "enum"             { return K_ENUM; }
  "cast"             { return K_CAST; }
  "class"            { return K_CLASS; }
  "inherits"         { return K_INHERITS; }
  "with"             { return K_WITH; }
  "function"         { return K_FUNCTION; }
  "variable"         { return K_VARIABLE; }
  "getter"           { return K_GETTER; }
  "setter"           { return K_SETTER; }
  "end"              { return K_END; }
  "var"              { return K_VAR; }
  "arg"              { return K_ARG; }
  "args"             { return K_ARGS; }
  "if"               { return K_IF; }
  "else"             { return K_ELSE; }
  "switch"           { return K_SWITCH; }
  "case"             { return K_CASE; }
  "for"              { return K_FOR; }
  "until"            { return K_UNTIL; }
  "while"            { return K_WHILE; }
  "throw"            { return K_THROW; }
  "try"              { return K_TRY; }
  "catch"            { return K_CATCH; }
  "finally"          { return K_FINALLY; }
  "in"               { return K_IN; }
  "is"               { return K_IS; }
  "as"               { return K_AS; }
  "new"              { return K_NEW; }
  "static"           { return K_STATIC; }
  "break"            { return K_BREAK; }
  "continue"         { return K_CONTINUE; }
  "return"           { return K_RETURN; }
  "super"            { return K_SUPER; }
  "this"             { return K_THIS; }
  "true"             { return K_TRUE; }
  "false"            { return K_FALSE; }
  "null"             { return K_NULL; }
  "void"             { return K_VOID; }
  "any"              { return K_ANY; }
  ";"                { return O_SEM; }
  ","                { return O_COM; }
  ":"                { return O_COL; }
  "::"               { return O_NS; }
  "..."              { return O_PAR; }
  ".."               { return O_TO; }
  "."                { return O_DOT; }
  "#"                { return O_NUM; }
  "?"                { return O_QM; }
  "@"                { return O_SAT; }
  "@:"               { return O_EAT; }
  "<:"               { return O_FUN; }
  "="                { return O_ASG; }
  "+="               { return O_AADD; }
  "-="               { return O_ASUB; }
  "*="               { return O_AMUL; }
  "/="               { return O_ADIV; }
  "%="               { return O_AMOD; }
  "&="               { return O_AAND; }
  "|="               { return O_AOR; }
  "^="               { return O_AXOR; }
  "<<="              { return O_ALSH; }
  ">>="              { return O_ARSH; }
  ">>>="             { return O_AZSH; }
  "==="              { return O_EQS; }
  "=="               { return O_EQ; }
  "!=="              { return O_NES; }
  "!="               { return O_NE; }
  "++"               { return O_INC; }
  "--"               { return O_DEC; }
  "<"                { return O_INF; }
  ">"                { return O_SUP; }
  "<="               { return O_IEQ; }
  ">="               { return O_SEQ; }
  "!"                { return O_NOT; }
  "~"                { return O_NEG; }
  "&&"               { return O_BAND; }
  "||"               { return O_BOR; }
  "+"                { return O_SUM; }
  "-"                { return O_SUB; }
  "*"                { return O_MUL; }
  "/"                { return O_DIV; }
  "%"                { return O_MOD; }
  "&"                { return O_AND; }
  "|"                { return O_OR; }
  "^"                { return O_XOR; }
  "<<"               { return O_LSH; }
  ">>"               { return O_RSH; }
  ">>>"              { return O_ZSH; }
  "("                { return LP; }
  ")"                { return RP; }
  "{"                { return LB; }
  "}"                { return RB; }
  "["                { return LS; }
  "]"                { return RS; }

  {SCOMMENT}         { return SCOMMENT; }
  {DCOMMENT}         { return DCOMMENT; }
  {MCOMMENT}         { return MCOMMENT; }
  {REGEXP}           { return REGEXP; }
  {QSTRING}          { return QSTRING; }
  {SSTRING}          { return SSTRING; }
  {LINTEGER}         { return INTEGER; }
  {LLONG}            { return LONG; }
  {LFLOAT}           { return FLOAT; }
  {LDOUBLE}          { return DOUBLE; }
  {SMETA}            { return SMETA; }
  {EMETA}            { return EMETA; }
  {WORD}             { return WORD; }

  . { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
