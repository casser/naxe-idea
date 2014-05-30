package org.carracoo.naxe.idea.lang.psi;

/**
 * Created by Sergey on 5/27/14.
 */
public interface NaxeComponent extends NaxeExp {
    NaxeComponentName getComponentName();
    NaxeComponentType getComponentType();
}
