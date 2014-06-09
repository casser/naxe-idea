package org.carracoo.naxe.idea.lang.psi;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.util.PsiTreeUtil;
import org.carracoo.naxe.idea.lang.NaxeFileImpl;
import org.carracoo.naxe.idea.utils.NaxeIcons;
import org.carracoo.naxe.idea.utils.NaxePsiUtil;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Sergey on 5/27/14.
 */
public abstract class NaxePsiClassImpl extends NaxeExpImpl implements NaxePsiClass {
    public NaxePsiClassImpl(ASTNode node) {
        super(node);
    }

    @Override
    public String getName() {
        return getComponentName().getText();
    }

    @Override
    public NaxeComponentType getComponentType() {
        return null;
    }

    @Override
    public String getPackageName() {
        return NaxePsiUtil.getPackageName(this.getContainingFile());
    }

    @Override
    public String getQualifiedName() {
        return NaxePsiUtil.getPackageName(this.getContainingFile())+"."+getComponentName().getText();
    }


    @Override
    public ItemPresentation getPresentation() {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return getQualifiedName();
            }

            @Nullable
            @Override
            public String getLocationString() {
                return getPackageName();
            }

            @Nullable
            @Override
            public Icon getIcon(boolean unused) {
                return NaxeIcons.CLASS;
            }
        };
    }

    @Override
    public List<NaxePsiElement> getDefinitions() {
        List<NaxePsiElement> definitions = new ArrayList<NaxePsiElement>();
        definitions.addAll(PsiTreeUtil.findChildrenOfType(this, NaxePsiMethod.class));
        definitions.addAll(PsiTreeUtil.findChildrenOfType(this, NaxePsiProperty.class));
        definitions.addAll(PsiTreeUtil.findChildrenOfType(this, NaxePsiOperator.class));
        return definitions;
    }

    @Override
    public List<NaxeComponent> findComponentsByName(String text) {
        List<NaxeComponent> components = new ArrayList<NaxeComponent>();
        components.addAll(findMethodsByName(text));
        components.addAll(findPropertiesByName(text));
        return components;
    }

    @Override
    public List<NaxePsiMethod> findMethodsByName(String text) {
        Collection<NaxePsiMethod> collection = PsiTreeUtil.findChildrenOfType(this, NaxePsiMethod.class);
        List<NaxePsiMethod> methods = new ArrayList<NaxePsiMethod>();
        for(NaxePsiMethod method:collection){
            if(method.getComponentName().textMatches(text)){
                methods.add(method);
            }
        }
        return methods;
    }

    @Override
    public List<NaxePsiProperty> findPropertiesByName(String text) {
        Collection<NaxePsiProperty> collection = PsiTreeUtil.findChildrenOfType(this, NaxePsiProperty.class);
        List<NaxePsiProperty> properties = new ArrayList<NaxePsiProperty>();
        for(NaxePsiProperty property:collection){
            if(property.getComponentName().textMatches(text)){
                properties.add(property);
            }
        }
        return properties;
    }




}