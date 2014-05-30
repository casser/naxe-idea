// This is a generated file. Not intended for manual editing.
package org.carracoo.naxe.idea.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.carracoo.naxe.idea.lang.lexer.NaxeElements.*;

public class NaxeBinaryExpImpl extends NaxeExpImpl implements NaxeBinaryExp {

  public NaxeBinaryExpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NaxeVisitor) ((NaxeVisitor)visitor).visitBinaryExp(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NaxeExp> getExpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NaxeExp.class);
  }

  @Override
  @NotNull
  public NaxeExp getLeft() {
    List<NaxeExp> p1 = getExpList();
    return p1.get(0);
  }

  @Override
  @Nullable
  public NaxeExp getRight() {
    List<NaxeExp> p1 = getExpList();
    return p1.size() < 2 ? null : p1.get(1);
  }

}
