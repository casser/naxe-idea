package org.carracoo.naxe.idea.lang;

import com.intellij.lang.Language;
import com.intellij.lang.javascript.DialectOptionHolder;
import com.intellij.lang.javascript.JSLanguageDialect;
import com.intellij.lang.javascript.JavascriptLanguage;
import com.intellij.lang.javascript.dialects.ECMA6LanguageDialect;
import com.intellij.lang.javascript.dialects.ECMAL4LanguageDialect;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergey on 1/24/14.
 */
public class NaxeLanguage extends Language {

    public static final String ID = "NAXE";
    public static final NaxeLanguage INSTANCE = new NaxeLanguage();

    public NaxeLanguage(){
        super(ID);
    }


    @Nullable
    @Override
    public LanguageFileType getAssociatedFileType() {
        return NaxeFileType.INSTANCE;
    }



}
