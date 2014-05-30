package org.carracoo.naxe.idea.lang.psi;

import com.intellij.icons.AllIcons;
import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.util.PlatformIcons;
import org.carracoo.naxe.idea.utils.NaxeIcons;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by Sergey on 5/27/14.
 */
public abstract class NaxePsiMethodImpl extends NaxeExpImpl implements NaxePsiMethod {
    public NaxePsiMethodImpl(ASTNode node) {
        super(node);
    }


    @Override
    public ItemPresentation getPresentation() {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return getComponentName().getText();
            }

            @Nullable
            @Override
            public String getLocationString() {
                return getComponentType().getText();
            }

            @Nullable
            @Override
            public Icon getIcon(boolean unused) {
                return AllIcons.Nodes.Function;
            }
        };
    }
}
