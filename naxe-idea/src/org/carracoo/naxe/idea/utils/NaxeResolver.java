package org.carracoo.naxe.idea.utils;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiSubstitutor;
import com.intellij.psi.ResolveResult;
import com.intellij.psi.impl.source.resolve.ResolveCache;
import com.intellij.psi.infos.CandidateInfo;
import com.intellij.psi.util.PsiTreeUtil;
import org.carracoo.naxe.idea.lang.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergey on 5/30/14.
 */
public class NaxeResolver implements ResolveCache.AbstractResolver<NaxePsiReference, List<? extends PsiElement>> {
    public static final NaxeResolver INSTANCE = new NaxeResolver();

    public static ResolveResult[] resolveCachedAsResults(Project project, NaxePsiReference reference, boolean needToPreventRecursion, boolean incompleteCode){
        return toResolveResults(resolveCachedAsElements(project,reference,needToPreventRecursion,incompleteCode));
    }

    public static List<? extends PsiElement> resolveCachedAsElements(Project project, NaxePsiReference reference, boolean needToPreventRecursion, boolean incompleteCode){
        return ResolveCache.getInstance(project).resolveWithCaching(reference, NaxeResolver.INSTANCE, needToPreventRecursion, incompleteCode);
    }

    @NotNull
    private static ResolveResult[] toResolveResults(List<? extends PsiElement> elements) {
        final ResolveResult[] result = new ResolveResult[elements.size()];
        for (int i = 0, size = elements.size(); i < size; i++) {
            result[i] = new CandidateInfo(elements.get(i), PsiSubstitutor.EMPTY);
        }
        return result;
    }

    @Override
    public List<? extends PsiElement> resolve(@NotNull NaxePsiReference reference, boolean incompleteCode) {
        System.out.println("RESOLVE "+reference);
        List<NaxeComponent> components = new ArrayList<NaxeComponent>();
        if(reference instanceof NaxeThisExp){
            components.add(PsiTreeUtil.getParentOfType(reference, NaxePsiClass.class));
        }else
        if(reference instanceof NaxeRef){
            NaxeRef ref = ((NaxeRef)reference);
            if(ref.getParent() instanceof NaxeRefExp){
                NaxeRefExp refExp = ((NaxeRefExp)ref.getParent());
                if(refExp.getExp() instanceof NaxeThisExp){
                    NaxeThisExp thisExp = (NaxeThisExp)refExp.getExp();
                    NaxePsiClass psiClass = ((NaxePsiClass)thisExp.resolve());
                    if(psiClass!=null) {
                        components = psiClass.findComponentsByName(ref.getText());
                    }
                }
            }

        }
        return components;
    }
}
