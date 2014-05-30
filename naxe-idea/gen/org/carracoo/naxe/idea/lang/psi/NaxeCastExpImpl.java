// This is a generated file. Not intended for manual editing.
package org.carracoo.naxe.idea.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.carracoo.naxe.idea.lang.lexer.NaxeElements.*;

public class NaxeCastExpImpl extends NaxeExpImpl implements NaxeCastExp {

  public NaxeCastExpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NaxeVisitor) ((NaxeVisitor)visitor).visitCastExp(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NaxeCallArg getCallArg() {
    return findChildByClass(NaxeCallArg.class);
  }

  @Override
  @NotNull
  public NaxeExp getExp() {
    return findNotNullChildByClass(NaxeExp.class);
  }

}
