package org.carracoo.naxe.idea.lang;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LanguageUtil;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.carracoo.naxe.idea.lang.lexer.NaxeElements;
import org.carracoo.naxe.idea.lang.parser.NaxeParser;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Sergey on 1/25/14.
 */
public class NaxeParserDefinition implements ParserDefinition {
    public static final IFileElementType NAXE_FILE_ELEMENT_TYPE =new IFileElementType(NaxeLanguage.INSTANCE);

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new NaxeFileImpl(viewProvider);
    }

    @Override
    public IFileElementType getFileNodeType() {
        return NAXE_FILE_ELEMENT_TYPE;
    }

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new NaxeLexerAdapter();
    }

    @NotNull
    @Override
    public PsiParser createParser(Project project) {
        return new NaxeParser();
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return NaxeToken.WSS;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return NaxeToken.COMMENT;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return NaxeToken.STRING;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return NaxeElements.Factory.createElement(node);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        Lexer lexer = createLexer(left.getPsi().getProject());
        return LanguageUtil.canStickTokensTogetherByLexer(left, right, lexer);
    }
}
