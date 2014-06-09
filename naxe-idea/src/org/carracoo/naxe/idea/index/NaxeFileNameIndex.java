package org.carracoo.naxe.idea.index;

import com.intellij.openapi.externalSystem.model.project.ContentRootData;
import com.intellij.openapi.roots.FileIndexUtil;
import com.intellij.openapi.roots.ProjectFileIndex;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiJavaFile;
import com.intellij.psi.impl.source.PsiJavaFileImpl;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.util.Processor;
import com.intellij.util.indexing.*;
import com.intellij.util.io.EnumeratorStringDescriptor;
import com.intellij.util.io.KeyDescriptor;
import gnu.trove.THashMap;
import org.carracoo.naxe.idea.lang.NaxeFileType;
import org.carracoo.naxe.idea.lang.psi.NaxeComponent;
import org.carracoo.naxe.idea.utils.NaxeResolveUtil;
import org.carracoo.naxe.idea.utils.NaxeResolver;
import org.jetbrains.annotations.NotNull;

import javax.naming.spi.DirectoryManager;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by Sergey on 6/8/14.
 */
public class NaxeFileNameIndex extends ScalarIndexExtension<String> {
    private static final int INDEX_VERSION = 1;
    public static final ID<String, Void> INDEX_NAME = ID.create("NaxeFileNameIndex");

    private final NaxeDataIndexer indexer = new NaxeDataIndexer();
    private static class NaxeDataIndexer implements DataIndexer<String, Void, FileContent> {
        @NotNull
        @Override
        public Map<String, Void> map(FileContent inputData) {
            VirtualFile file = inputData.getFile();
            String path = file.getPath();
            ProjectRootManager rootManager = ProjectRootManager.getInstance(inputData.getProject());
            ProjectFileIndex fileIndex = rootManager.getFileIndex();
            VirtualFile root = fileIndex.getSourceRootForFile(file);

            String rootPath = root.getPath();
            String filePath = file.getPath();
            String packName = filePath.substring(rootPath.length()+1,filePath.length()-3);
            packName = packName.replaceAll("/",".");
            System.out.println(packName);
            final Map<String, Void> result = new THashMap<String, Void>();
            /*
            final PsiFile psiFile = inputData.getPsiFile();
            final List<NaxeComponent> components = NaxeResolveUtil.findTopComponents(psiFile);
            if (components.isEmpty()) {
                return Collections.emptyMap();
            }
            final Map<String, Void> result = new THashMap<String, Void>(components.size());
            for (NaxeComponent component : components) {
                result.put(component.getQualifiedName(), null);
            }
            */

            result.put(path,null);
            return result;
        }
    }
    @Override
    public int getVersion() {
        return INDEX_VERSION;
    }
    @NotNull
    @Override
    public ID<String, Void> getName() {
        return INDEX_NAME;
    }

    @NotNull
    @Override
    public DataIndexer<String, Void, FileContent> getIndexer() {
        return indexer;
    }

    @NotNull
    @Override
    public KeyDescriptor<String> getKeyDescriptor() {
        return new EnumeratorStringDescriptor();
    }

    @NotNull
    @Override
    public FileBasedIndex.InputFilter getInputFilter() {
        return new FileBasedIndex.InputFilter(){
            @Override
            public boolean acceptInput(@NotNull VirtualFile file) {
                return NaxeFileType.INSTANCE.equals(file.getFileType());
            }
        };
    }

    @Override
    public boolean dependsOnFileContent() {
        return true;
    }


    public static boolean getFileNames (
        @NotNull String qName,
        @NotNull Processor<VirtualFile> processor,
        @NotNull final GlobalSearchScope filter
    ){
        return FileBasedIndex.getInstance().getFilesWithKey(INDEX_NAME, Collections.<String>singleton(qName), processor, filter);
    }

}
