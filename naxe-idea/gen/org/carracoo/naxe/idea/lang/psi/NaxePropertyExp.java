// This is a generated file. Not intended for manual editing.
package org.carracoo.naxe.idea.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NaxePropertyExp extends NaxeExp {

  @NotNull
  NaxeComponentName getComponentName();

  @Nullable
  NaxeComponentType getComponentType();

  @Nullable
  NaxeMetaExp getMetaExp();

  @Nullable
  NaxePropertyBody getPropertyBody();

}
