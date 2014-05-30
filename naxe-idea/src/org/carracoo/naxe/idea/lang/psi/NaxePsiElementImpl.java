package org.carracoo.naxe.idea.lang.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.tree.IElementType;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Sergey on 1/25/14.
 */
public class NaxePsiElementImpl extends ASTWrapperPsiElement implements NaxePsiElement {

    public NaxePsiElementImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }

    @Override
    public IElementType getTokenType() {
        return getNode().getElementType();
    }

    @Override
    public ItemPresentation getPresentation() {
        return super.getPresentation();
    }
}



