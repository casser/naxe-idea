package org.carracoo.naxe.idea.utils;

import com.intellij.openapi.project.ProjectBundle;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.util.Pair;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;
import org.carracoo.naxe.idea.lang.psi.NaxeArgExp;
import org.carracoo.naxe.idea.lang.psi.NaxeGetterExp;
import org.carracoo.naxe.idea.lang.psi.NaxeSetterExp;
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
public class NaxePsiUtils {
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
            out.append(',').append(argExp.getComponentName().getText());
            if(argExp.getComponentType()!=null){
                out.append(':').append(argExp.getComponentType().getText());
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
    public static String getPackageName(@Nullable final PsiFile file) {

        for(VirtualFile src:ProjectRootManager.getInstance(file.getProject()).getContentSourceRoots()){
            System.out.println(src);
        }
        return "";
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
