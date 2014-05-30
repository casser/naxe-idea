package org.carracoo.naxe.idea.lang;

import com.intellij.openapi.fileTypes.ExtensionFileNameMatcher;
import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Sergey on 1/24/14.
 */
public class NaxeFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(NaxeFileType.INSTANCE,new ExtensionFileNameMatcher(NaxeFileType.EXT));
    }
}
