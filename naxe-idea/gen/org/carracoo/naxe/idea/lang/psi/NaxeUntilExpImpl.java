// This is a generated file. Not intended for manual editing.
package org.carracoo.naxe.idea.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.carracoo.naxe.idea.lang.lexer.NaxeElements.*;

public class NaxeUntilExpImpl extends NaxeExpImpl implements NaxeUntilExp {

  public NaxeUntilExpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NaxeVisitor) ((NaxeVisitor)visitor).visitUntilExp(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NaxeExp> getExpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NaxeExp.class);
  }

}
