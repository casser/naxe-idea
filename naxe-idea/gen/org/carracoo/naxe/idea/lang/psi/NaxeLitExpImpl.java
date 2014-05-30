// This is a generated file. Not intended for manual editing.
package org.carracoo.naxe.idea.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.carracoo.naxe.idea.lang.lexer.NaxeElements.*;

public class NaxeLitExpImpl extends NaxeExpImpl implements NaxeLitExp {

  public NaxeLitExpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NaxeVisitor) ((NaxeVisitor)visitor).visitLitExp(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NaxeBooleanLit getBooleanLit() {
    return findChildByClass(NaxeBooleanLit.class);
  }

  @Override
  @Nullable
  public NaxeNullLit getNullLit() {
    return findChildByClass(NaxeNullLit.class);
  }

  @Override
  @Nullable
  public NaxeNumberLit getNumberLit() {
    return findChildByClass(NaxeNumberLit.class);
  }

  @Override
  @Nullable
  public NaxeRegexpLit getRegexpLit() {
    return findChildByClass(NaxeRegexpLit.class);
  }

  @Override
  @Nullable
  public NaxeStringLit getStringLit() {
    return findChildByClass(NaxeStringLit.class);
  }

}
