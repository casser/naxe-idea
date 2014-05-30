// This is a generated file. Not intended for manual editing.
package org.carracoo.naxe.idea.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.carracoo.naxe.idea.lang.lexer.NaxeElements.*;

public class NaxeClassExpImpl extends NaxePsiClassImpl implements NaxeClassExp {

  public NaxeClassExpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NaxeVisitor) ((NaxeVisitor)visitor).visitClassExp(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NaxeClassBody getClassBody() {
    return findChildByClass(NaxeClassBody.class);
  }

  @Override
  @NotNull
  public NaxeComponentName getComponentName() {
    return findNotNullChildByClass(NaxeComponentName.class);
  }

  @Override
  @Nullable
  public NaxeMetaExp getMetaExp() {
    return findChildByClass(NaxeMetaExp.class);
  }

}
