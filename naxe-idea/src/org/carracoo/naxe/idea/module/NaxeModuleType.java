package org.carracoo.naxe.idea.module;

import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.module.ModuleTypeManager;
import org.carracoo.naxe.idea.utils.NaxeIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by Sergey on 1/24/14.
 */
public class NaxeModuleType extends ModuleType<NaxeModuleBuilder> {
    private static final String ID = "NaxeModule";
    private static final String NAME = "Naxe";
    private static final String DESC = "Naxe Module";

    public static NaxeModuleType getInstance(){
        return (NaxeModuleType) ModuleTypeManager.getInstance().findByID(ID);
    }

    public NaxeModuleType(){
        super(ID);
    }

    @NotNull
    @Override
    public NaxeModuleBuilder createModuleBuilder() {
        return new NaxeModuleBuilder();
    }

    @NotNull
    @Override
    public String getName() {
        return NAME;
    }

    @NotNull
    @Override
    public String getDescription() {
        return DESC;
    }

    @Override
    public Icon getBigIcon() {
        return NaxeIcons.FOLDER;
    }

    @Override
    public Icon getNodeIcon(@Deprecated boolean b) {
        return NaxeIcons.FOLDER;
    }
}
