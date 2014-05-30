package org.carracoo.naxe.idea.lang;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import org.carracoo.naxe.compiler.NxToken;
import org.carracoo.naxe.idea.lang.lexer.NaxeElements;

/**
 * Created by Sergey on 1/24/14.
 */
public class NaxeToken extends IElementType implements NaxeElements {
    public static final TokenSet WSS      = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet BOOLEAN  = TokenSet.create(K_FALSE,K_TRUE);
    public static final TokenSet STRING   = TokenSet.create(SSTRING,QSTRING);
    public static final TokenSet NUMBER   = TokenSet.create(FLOAT,INTEGER,LONG,DOUBLE);
    public static final TokenSet COMMENT  = TokenSet.create(DCOMMENT,SCOMMENT,MCOMMENT);

    public static final TokenSet METADATA = TokenSet.create(
        ANNO
    );
    public static final TokenSet OPERATORS  = TokenSet.create(
        O_NEG, O_NOT, O_SUM, O_SUB, O_MUL, O_DIV, O_MOD, O_AND, O_OR, O_ASG, O_SUP,
        O_INF, O_SEQ, O_IEQ, O_NE, O_NES, O_EQ, O_EQS, O_AT,  O_QM, O_SEM, O_COM,
        O_COL, O_NS,  O_DOT, O_TO,  O_PAR, O_INC, O_DEC
    );
    public static final TokenSet KEYWORD  = TokenSet.create(
        K_PACKAGE,
        K_USING,
        K_IMPORT,
        K_ENUM,
        K_CLASS,
        K_VARIABLE,
        K_FUNCTION,
        K_GETTER,
        K_SETTER,
        K_ARG,
        K_VAR,
        K_FOR,
        K_UNTIL,
        K_WHILE,
        K_IF,
        K_ELSE,
        K_SWITCH,
        K_CASE,
        K_THROW,
        K_TRY,
        K_CATCH,
        K_FINALLY,
        K_IS,
        K_AS,
        K_IN,
        K_BREAK,
        K_CONTINUE,
        K_RETURN,
        K_NEW,
        K_VOID,
        K_THIS,
        K_SUPER,
        K_NULL,
        K_ANY,
        K_ARGS,
        K_END,
        K_INHERITS
    );
    public static final TokenSet BRACKETS   = TokenSet.create(LB,RB);
    public static final TokenSet PARENTHS   = TokenSet.create(LP,RP);
    public static final TokenSet BRACES     = TokenSet.create(LS,RS);

    public NaxeToken(String name){
        super(name,NaxeLanguage.INSTANCE);
    }
}
