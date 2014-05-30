package org.carracoo.naxe.idea.lang.psi;

import com.intellij.psi.PsiClass;

import java.util.Collection;
import java.util.List;

/**
 * Created by Sergey on 5/27/14.
 */
public interface NaxePsiClass extends NaxeExp, NaxeComponent {
    NaxeClassBody getClassBody();
    String getPackageName();
    String getQualifiedName();
    List<NaxePsiElement> getDefinitions();

    List<NaxeComponent> findComponentsByName(String text);
    List<NaxePsiMethod> findMethodsByName(String text);
    List<NaxePsiProperty> findPropertiesByName(String text);
}
