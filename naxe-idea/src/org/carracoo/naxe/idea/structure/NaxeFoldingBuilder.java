package org.carracoo.naxe.idea.structure;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilder;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.util.TextRange;
import org.carracoo.naxe.idea.lang.lexer.NaxeElements;
import org.carracoo.naxe.idea.lang.psi.NaxeMetaExp;
import org.carracoo.naxe.idea.lang.psi.NaxeMethodBody;
import org.carracoo.naxe.idea.lang.psi.NaxeParenExp;
import org.carracoo.naxe.idea.lang.psi.NaxePropertyBody;
import org.carracoo.naxe.idea.utils.NaxePsiUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergey on 1/31/14.
 */
public class NaxeFoldingBuilder implements FoldingBuilder {

    @NotNull
    @Override
    public FoldingDescriptor[] buildFoldRegions(@NotNull ASTNode node, @NotNull Document document) {
        List<FoldingDescriptor> list = new ArrayList<FoldingDescriptor>();
        buildFolding(node, list);
        FoldingDescriptor[] descriptors = new FoldingDescriptor[list.size()];
        return list.toArray(descriptors);
    }

    private static void buildFolding(ASTNode node, List<FoldingDescriptor> list) {
        if (
            NaxeElements.PAREN_EXP.equals(node.getElementType())      ||
            NaxeElements.META_EXP.equals(node.getElementType())       ||
            NaxeElements.CLASS_BODY.equals(node.getElementType())     ||
            NaxeElements.PROPERTY_BODY.equals(node.getElementType())  ||
            NaxeElements.METHOD_BODY.equals(node.getElementType())    ||
            NaxeElements.CLOSURE_EXP.equals(node.getElementType())
        ) {
            final TextRange range = node.getTextRange();
            if(range.getLength()>3) {
                list.add(new FoldingDescriptor(node, range));
            }
        }
        for (ASTNode child : node.getChildren(null)) {
            buildFolding(child, list);
        }
    }

    @Nullable
    @Override
    public String getPlaceholderText(@NotNull ASTNode node) {
        if(node.getPsi() instanceof NaxeMethodBody){
            return "«("+NaxePsiUtils.getScopeParamsString(node.getPsi())+")";
        }
        if(node.getPsi() instanceof NaxePropertyBody){
            return "«("+NaxePsiUtils.getPropertyAccessString(node.getPsi())+")";
        }
        if(node.getPsi() instanceof NaxeMetaExp){
            return "@(...)";
        }
        if(node.getPsi() instanceof NaxeParenExp){
            return "(...)";
        }
        return "{...}";
    }

    @Override
    public boolean isCollapsedByDefault(@NotNull ASTNode node) {
        return false;
    }
}
