// This is a generated file. Not intended for manual editing.
package org.carracoo.naxe.idea.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NaxeClosureExp extends NaxeExp {

  @Nullable
  NaxeComponentName getComponentName();

  @Nullable
  NaxeComponentType getComponentType();

  @NotNull
  List<NaxeExp> getExpList();

}
