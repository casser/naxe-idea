package org.carracoo.naxe.idea.utils;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectBundle;
import com.intellij.openapi.roots.ProjectFileIndex;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.util.Pair;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.search.FilenameIndex;
import com.intellij.psi.search.PsiSearchHelper;
import com.intellij.psi.util.PsiTreeUtil;
import org.carracoo.naxe.idea.lang.psi.*;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Sergey on 1/31/14.
 */
public class NaxePsiUtil {
    public static String getPropertyAccessString(PsiElement psi) {
        StringBuilder out = new StringBuilder();
        if(PsiTreeUtil.getChildOfType(psi, NaxeGetterExp.class)!=null){
            out.append(",get");
        }
        if(PsiTreeUtil.getChildOfType(psi, NaxeSetterExp.class)!=null){
            out.append(",set");
        }
        if(out.length()>0){
            return out.substring(1);
        }else{
            return "...";
        }
    }

    public static String getScopeParamsString(PsiElement psi) {
        Collection<NaxeArgExp> args = PsiTreeUtil.findChildrenOfType(psi, NaxeArgExp.class);
        StringBuilder out = new StringBuilder();
        for(NaxeArgExp argExp:args){
            for(NaxeVarItem var:argExp.getVarItemList()){
                for(NaxeComponentName name:var.getComponentNameList()){
                    out.append(',').append(name.getText());
                }
                out.append(':').append(var.getComponentType().getText());
            }

        }
        if(out.length()>0){
            return out.substring(1);
        }else{
            return "...";
        }
    }

    public static List<PsiElement> getPathToParentOfType(
        @Nullable PsiElement element,
        @NotNull Class<? extends PsiElement> aClass
    ) {
        if (element == null) return null;
        final List<PsiElement> result = new ArrayList<PsiElement>();
        while (element != null) {
            result.add(element);
            if (aClass.isInstance(element)) {
                return result;
            }
            if (element instanceof PsiFile) return null;
            element = element.getParent();
        }
        return result;
    }

    public static String getStringPathToParentOfType(@Nullable PsiElement element,@NotNull Class<? extends PsiElement> aClass){
        final StringBuilder stringBuffer = new StringBuilder();
        final List<PsiElement> result = getPathToParentOfType(element,aClass);
        Collections.reverse(result);
        for(PsiElement el:result){
            stringBuffer.append("/").append(el.toString());
        }
        return stringBuffer.toString();
    }

    @NotNull
    @NonNls
    public static String getPackageName(final PsiFile psiFile) {
        VirtualFile file = psiFile.getVirtualFile();

        ProjectRootManager rootManager = ProjectRootManager.getInstance(psiFile.getProject());
        ProjectFileIndex fileIndex = rootManager.getFileIndex();
        VirtualFile root = fileIndex.getSourceRootForFile(file);


        if(root==null){
             return "";
        }

        String rootPath = root.getPath();
        String filePath = file.getPath();
        String packName = filePath.substring(rootPath.length()+1,filePath.length()-3);
        packName = packName.replaceAll("/",".");
        System.out.println(packName);

        return packName;
    }

    @NotNull
    @NonNls
    public static List<String> getFiles(final Project project,List<String> path) {
        List<String> files = new ArrayList<String>();
        for(VirtualFile file: FilenameIndex.getAllFilesByExt(project, "nx")){
            files.add(file.getName());
        }

        return files;
    }
    @NotNull
    public static Pair<String, String> splitQName(@NotNull String qName) {
        final int dotIndex = qName.lastIndexOf('.');
        final String packageName = dotIndex == -1 ? "" : qName.substring(0, dotIndex);
        final String className = dotIndex == -1 ? qName : qName.substring(dotIndex + 1);

        return new Pair<String, String>(packageName, className);
    }

    @NotNull
    public static String joinQName(@Nullable String packageName, @Nullable String className) {
        String result = "";
        if (packageName != null && !packageName.isEmpty()) {
            result = packageName;
            if (className != null) {
                result += ".";
            }
        }
        if (className != null) {
            result += className;
        }
        return result;
    }

}
