package org.carracoo.naxe.idea.structure;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.navigation.NavigationItem;
import com.intellij.psi.PsiElement;
import org.carracoo.naxe.idea.lang.NaxeFileImpl;
import org.carracoo.naxe.idea.lang.psi.*;
import org.jetbrains.annotations.NotNull;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergey on 1/30/14.
 */
public class NaxeStructureViewElement implements StructureViewTreeElement,SortableTreeElement {

    private final PsiElement element;
    public NaxeStructureViewElement(final PsiElement element) {
        this.element = element;
    }

    @Override
    public Object getValue() {
        return element;
    }

    @Override
    public void navigate(boolean focus) {
        if (element instanceof NavigationItem) {
            ((NavigationItem)element).navigate(focus);
        }
    }

    @Override
    public boolean canNavigate() {
        return element instanceof NavigationItem && ((NavigationItem)element).canNavigate();
    }

    @Override
    public boolean canNavigateToSource() {
        return element instanceof NavigationItem && ((NavigationItem)element).canNavigateToSource();
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        return ((NavigationItem)element).getPresentation();
    }

    @Override
    public TreeElement[] getChildren() {
        if (!element.isValid()) {
            return new TreeElement[0];
        }
        List<TreeElement> result = new ArrayList<TreeElement>();
        if(element instanceof NaxeFileImpl){
            for(PsiElement child:element.getChildren()){
                if(child instanceof NaxePsiClass){
                    result.add(new NaxeStructureViewElement(child));
                }
            }
        }else
        if(element instanceof NaxePsiClass){
            NaxePsiClass classElement = ((NaxePsiClass)element);
            for(PsiElement child:classElement.getDefinitions()){
                if(child instanceof NaxePsiMethod || child instanceof NaxePsiProperty || child instanceof NaxePsiOperator ){
                    result.add(new NaxeStructureViewElement(child));
                }
            }
        }
        return result.size()>0?result.toArray(new TreeElement[result.size()]):new TreeElement[0];
    }

    @Override
    public String getAlphaSortKey() {
        final String result = element instanceof NavigationItem ? ((NavigationItem)element).getName() : null;
        return result == null ? "" : result;
    }
}
