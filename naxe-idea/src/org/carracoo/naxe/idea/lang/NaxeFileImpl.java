package org.carracoo.naxe.idea.lang;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.javascript.psi.impl.JSFileImpl;
import com.intellij.navigation.ItemPresentation;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.roots.ProjectFileIndex;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.JavaDirectoryService;
import com.intellij.psi.PsiFile;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.util.indexing.FileBasedIndex;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Sergey on 1/25/14.
 */
public class NaxeFileImpl extends PsiFileBase {

    public NaxeFileImpl(FileViewProvider provider){
        super(provider,NaxeLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return NaxeFileType.INSTANCE;
    }

}
