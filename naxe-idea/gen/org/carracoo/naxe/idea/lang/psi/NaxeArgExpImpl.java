// This is a generated file. Not intended for manual editing.
package org.carracoo.naxe.idea.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.carracoo.naxe.idea.lang.lexer.NaxeElements.*;

public class NaxeArgExpImpl extends NaxeExpImpl implements NaxeArgExp {

  public NaxeArgExpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NaxeVisitor) ((NaxeVisitor)visitor).visitArgExp(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NaxeComponentName getComponentName() {
    return findChildByClass(NaxeComponentName.class);
  }

  @Override
  @Nullable
  public NaxeComponentType getComponentType() {
    return findChildByClass(NaxeComponentType.class);
  }

  @Override
  @Nullable
  public NaxeMetaExp getMetaExp() {
    return findChildByClass(NaxeMetaExp.class);
  }

}