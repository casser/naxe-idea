package org.carracoo.naxe.idea.structure;

import com.intellij.ide.structureView.StructureView;
import com.intellij.ide.structureView.StructureViewBuilder;
import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.TreeBasedStructureViewBuilder;
import com.intellij.lang.PsiStructureViewFactory;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileEditor.FileEditor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import org.carracoo.naxe.idea.lang.NaxeFileImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Sergey on 1/30/14.
 */
public class NaxeStructureViewFactory implements PsiStructureViewFactory {
    @Nullable
    @Override
    public StructureViewBuilder getStructureViewBuilder(final PsiFile psiFile) {
        return new TreeBasedStructureViewBuilder() {

            @NotNull
            @Override
            public StructureViewModel createStructureViewModel(@Nullable Editor editor) {
                return new NaxeStructureViewModel((NaxeFileImpl)psiFile);
            }

            @Override
            public boolean isRootNodeShown() {
                return false;
            }
        };
    }
}
