package org.carracoo.naxe.idea.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.carracoo.naxe.idea.utils.NaxeIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by Sergey on 1/24/14.
 */
public class NaxeFileType extends LanguageFileType {

    public static final String EXT = "nx";
    public static final String NAME = "Naxe File";
    public static final String DESC = "Naxe files";

    public static final NaxeFileType INSTANCE = new NaxeFileType();

    public NaxeFileType(){
        super(NaxeLanguage.INSTANCE);
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

    @NotNull
    @Override
    public String getDefaultExtension() {
        return EXT;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return NaxeIcons.FILE;
    }
}
