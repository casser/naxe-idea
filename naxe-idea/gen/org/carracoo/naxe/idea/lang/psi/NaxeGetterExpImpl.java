// This is a generated file. Not intended for manual editing.
package org.carracoo.naxe.idea.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.carracoo.naxe.idea.lang.lexer.NaxeElements.*;

public class NaxeGetterExpImpl extends NaxeExpImpl implements NaxeGetterExp {

  public NaxeGetterExpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NaxeVisitor) ((NaxeVisitor)visitor).visitGetterExp(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NaxeGetterBody getGetterBody() {
    return findChildByClass(NaxeGetterBody.class);
  }

  @Override
  @Nullable
  public NaxeMetaExp getMetaExp() {
    return findChildByClass(NaxeMetaExp.class);
  }

}
