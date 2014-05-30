package org.carracoo.naxe.idea.lang.psi;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiPolyVariantReference;
import com.intellij.psi.PsiReference;
import com.intellij.psi.ResolveResult;
import com.intellij.psi.impl.source.resolve.ResolveCache;
import com.intellij.psi.infos.CandidateInfo;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.IncorrectOperationException;
import org.carracoo.naxe.idea.utils.NaxeIcons;
import org.carracoo.naxe.idea.utils.NaxeResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sun.tools.tree.ThisExpression;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergey on 5/27/14.
 */
public class NaxePsiReferenceImpl extends NaxeExpImpl implements NaxePsiReference, PsiPolyVariantReference {
    public NaxePsiReferenceImpl(ASTNode node) {
        super(node);
    }

    @Override
    public PsiElement getElement() {
        return this;
    }

    @Override
    public PsiReference getReference() {
        return this;
    }

    @Override
    public TextRange getRangeInElement() {
        final TextRange textRange = getTextRange();
        return new TextRange(0, textRange.getEndOffset() - textRange.getStartOffset());
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        final ResolveResult[] resolveResults = multiResolve(true);

        return resolveResults.length == 0 ||
                resolveResults.length > 1 ||
                !resolveResults[0].isValidResult() ? null : resolveResults[0].getElement();

    }

    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        return NaxeResolver.resolveCachedAsResults(getProject(), this, true, incompleteCode);
    }

    @NotNull
    @Override
    public String getCanonicalText() {
        return getText();
    }

    @Override
    public PsiElement handleElementRename(String newElementName) throws IncorrectOperationException {
        return this;
    }

    @Override
    public PsiElement bindToElement(@NotNull PsiElement element) throws IncorrectOperationException {
        return this;
    }

    @Override
    public boolean isReferenceTo(PsiElement element) {
        return false;
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        return new Object[0];
    }

    @Override
    public boolean isSoft() {
        return false;
    }
}