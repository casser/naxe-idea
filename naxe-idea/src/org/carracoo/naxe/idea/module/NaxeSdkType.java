package org.carracoo.naxe.idea.module;

import com.intellij.openapi.projectRoots.*;
import org.carracoo.naxe.idea.utils.NaxeIcons;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by Sergey on 1/24/14.
 */
public class NaxeSdkType extends SdkType {

    public static final String NAME = "Naxe SDK";

    public NaxeSdkType(){
        super(NAME);
    }

    @Nullable
    @Override
    public String suggestHomePath() {
        return null;
    }

    @Override
    public boolean isValidSdkHome(String s) {
        return true;
    }

    @Override
    public String suggestSdkName(String s, String s2) {
        return NAME;
    }

    @Nullable
    @Override
    public String getVersionString(@NotNull Sdk sdk) {
        return "1.0";
    }

    @Nullable
    @Override
    public AdditionalDataConfigurable createAdditionalDataConfigurable(SdkModel sdkModel, SdkModificator sdkModificator) {
        return null;
    }

    @Override
    public Icon getIcon() {
        return NaxeIcons.FOLDER;
    }

    @Override
    public Icon getIconForAddAction() {
        return NaxeIcons.FOLDER;
    }

    @Override
    public String getPresentableName() {
        return NAME;
    }

    @Override
    public void saveAdditionalData(@NotNull SdkAdditionalData sdkAdditionalData, @NotNull Element element) {

    }
}
