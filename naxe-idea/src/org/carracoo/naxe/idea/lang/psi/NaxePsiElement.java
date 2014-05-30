package org.carracoo.naxe.idea.lang.psi;

import com.intellij.psi.NavigatablePsiElement;
import com.intellij.psi.tree.IElementType;

/**
 * Created by Sergey on 1/25/14.
 */
public interface NaxePsiElement extends NavigatablePsiElement {
    IElementType getTokenType();
}
