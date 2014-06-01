package org.carracoo.naxe.idea.lang.psi;

import com.google.common.collect.Lists;
import com.intellij.lang.ASTNode;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;

/**
 * Created by Sergey on 5/31/14.
 */
public class NaxeExecutionScopeImpl extends NaxePsiElementImpl implements NaxeExecutionScope {
    public NaxeExecutionScopeImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }

    @Override
    public List<NaxeArgExp> getParameters() {
        return Lists.newArrayList(PsiTreeUtil.findChildrenOfType(this,NaxeArgExp.class));
    }

    @Override
    public NaxeComponentType getReturnType() {
        return null;
    }
}
