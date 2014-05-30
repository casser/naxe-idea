package org.carracoo.naxe.idea.module;

import com.intellij.ide.util.projectWizard.JavaModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.roots.ModifiableRootModel;

/**
 * Created by Sergey on 1/24/14.
 */
public class NaxeModuleBuilder extends JavaModuleBuilder {
    @Override
    public ModuleType getModuleType() {
        return NaxeModuleType.getInstance();
    }
}
