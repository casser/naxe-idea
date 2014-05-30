// This is a generated file. Not intended for manual editing.
package org.carracoo.naxe.idea.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.carracoo.naxe.idea.lang.lexer.NaxeElements.*;

public class NaxeStringLitImpl extends NaxePsiElementImpl implements NaxeStringLit {

  public NaxeStringLitImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NaxeVisitor) ((NaxeVisitor)visitor).visitStringLit(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getQstring() {
    return findChildByType(QSTRING);
  }

  @Override
  @Nullable
  public PsiElement getSstring() {
    return findChildByType(SSTRING);
  }

}