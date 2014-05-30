package org.carracoo.naxe.idea.syntax;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.tree.IElementType;
import org.carracoo.naxe.idea.lang.NaxeLexerAdapter;
import org.carracoo.naxe.idea.lang.NaxeToken;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sergey on 1/24/14.
 */
public class NaxeSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<IElementType, TextAttributesKey>(){{
        fillMap(this, NaxeSyntaxHighlighterColors.MCOMMENT, NaxeToken.MCOMMENT);
        fillMap(this, NaxeSyntaxHighlighterColors.SCOMMENT, NaxeToken.SCOMMENT);
        fillMap(this, NaxeSyntaxHighlighterColors.DCOMMENT, NaxeToken.DCOMMENT);
        fillMap(this, NaxeSyntaxHighlighterColors.KEYWORD, NaxeToken.KEYWORD.getTypes());
        fillMap(this, NaxeSyntaxHighlighterColors.METADATA, NaxeToken.METADATA.getTypes());
        fillMap(this, NaxeSyntaxHighlighterColors.STRING, NaxeToken.STRING.getTypes());
        fillMap(this, NaxeSyntaxHighlighterColors.NUMBER, NaxeToken.NUMBER.getTypes());
        fillMap(this, NaxeSyntaxHighlighterColors.BOOLEAN, NaxeToken.BOOLEAN.getTypes());
        fillMap(this, NaxeSyntaxHighlighterColors.OPERATOR, NaxeToken.OPERATORS.getTypes());
        fillMap(this, NaxeSyntaxHighlighterColors.BRACES, NaxeToken.BRACES.getTypes());
        fillMap(this, NaxeSyntaxHighlighterColors.BRACKETS, NaxeToken.BRACKETS.getTypes());
        fillMap(this, NaxeSyntaxHighlighterColors.PARENTHS, NaxeToken.PARENTHS.getTypes());
    }};

    private Project project;
    private VirtualFile file;

    public NaxeSyntaxHighlighter(Project project,VirtualFile file) {
        this.project = project;
        this.file = file;
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new NaxeLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType element) {
         return pack(ATTRIBUTES.get(element));
    }

}
