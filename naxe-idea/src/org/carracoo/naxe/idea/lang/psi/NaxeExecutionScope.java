package org.carracoo.naxe.idea.lang.psi;

import java.util.List;

/**
 * Created by Sergey on 5/31/14.
 */
public interface NaxeExecutionScope extends NaxePsiElement {
    List<NaxeArgExp> getParameters();
    NaxeComponentType getReturnType();
}
