package org.carracoo.naxe.idea.lang.psi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Sergey on 5/27/14.
 */
public interface NaxePsiMethod extends NaxeExp, NaxeComponent{
    @Nullable
    NaxeMethodBody getMethodBody();

}
