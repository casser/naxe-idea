package org.carracoo.naxe.idea.completion;


import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PsiElementPattern;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiErrorElement;
import com.intellij.util.ProcessingContext;
import org.carracoo.naxe.idea.lang.NaxeFileImpl;
import org.carracoo.naxe.idea.lang.psi.*;
import org.carracoo.naxe.idea.utils.NaxePsiUtil;
import org.jetbrains.annotations.NotNull;

import static com.intellij.patterns.PlatformPatterns.psiElement;


/**
 * Created by Sergey on 1/31/14.
 */
public class NaxeKeywordCompletionContributor extends CompletionContributor {
    public NaxeKeywordCompletionContributor(){
        final PsiElementPattern.Capture<PsiElement> inFile       = psiElement()
                .withSuperParent(1, PsiErrorElement.class)
                .withSuperParent(2, NaxeFileImpl.class);

        final PsiElementPattern.Capture<PsiElement> inImportRoot = psiElement()
                .withSuperParent(1, NaxeIdentifier.class)
                .withSuperParent(2, NaxeQualifier.class);
        final PsiElementPattern.Capture<PsiElement> inClass      = psiElement()
                .withSuperParent(1, PsiErrorElement.class)
                .withSuperParent(2, NaxeClassBody.class);

        final PsiElementPattern.Capture<PsiElement> inMethod   = psiElement()
                .withSuperParent(1, PsiErrorElement.class)
                .withSuperParent(2, NaxeMethodBody.class);

        final PsiElementPattern.Capture<PsiElement> inProperty   = psiElement()
                .withSuperParent(1, PsiErrorElement.class)
                .withSuperParent(2, NaxePropertyBody.class);

        extend(CompletionType.BASIC,inFile,new CompletionProvider<CompletionParameters>() {
            @Override
            protected void addCompletions(@NotNull CompletionParameters parameters,ProcessingContext context, @NotNull CompletionResultSet result) {
                result.addElement(LookupElementBuilder.create("package"));
                result.addElement(LookupElementBuilder.create("class"));
                result.addElement(LookupElementBuilder.create("import"));
            }
        });
        extend(CompletionType.BASIC,inImportRoot,new CompletionProvider<CompletionParameters>() {
            @Override
            protected void addCompletions(@NotNull CompletionParameters parameters,ProcessingContext context, @NotNull CompletionResultSet result) {
               for(String identifier: NaxePsiUtil.getFiles(parameters.getOriginalPosition().getProject(), null)){
                   result.addElement(LookupElementBuilder.create(identifier));
               }
            }
        });

        extend(CompletionType.BASIC,inClass,new CompletionProvider<CompletionParameters>() {
            @Override
            protected void addCompletions(@NotNull CompletionParameters parameters,ProcessingContext context, @NotNull CompletionResultSet result) {
            result.addElement(LookupElementBuilder.create("variable"));
            result.addElement(LookupElementBuilder.create("function"));
            result.addElement(LookupElementBuilder.create("inherits"));
            }
        });
        extend(CompletionType.BASIC,inMethod,new CompletionProvider<CompletionParameters>() {
            @Override
            protected void addCompletions(@NotNull CompletionParameters parameters,ProcessingContext context, @NotNull CompletionResultSet result) {
                result.addElement(LookupElementBuilder.create("arg"));
                result.addElement(LookupElementBuilder.create("var"));
                result.addElement(LookupElementBuilder.create("if"));
                result.addElement(LookupElementBuilder.create("for"));
                result.addElement(LookupElementBuilder.create("this"));
            }
        });
        extend(CompletionType.BASIC,inProperty,new CompletionProvider<CompletionParameters>() {
            @Override
            protected void addCompletions(@NotNull CompletionParameters parameters,ProcessingContext context, @NotNull CompletionResultSet result) {
                result.addElement(LookupElementBuilder.create("getter"));
                result.addElement(LookupElementBuilder.create("setter"));
            }
        });
    }
    @Override
    public void fillCompletionVariants(CompletionParameters parameters, CompletionResultSet result) {
        super.fillCompletionVariants(parameters, result);
        System.out.println(NaxePsiUtil.getStringPathToParentOfType(parameters.getPosition(), NaxeFileImpl.class));
    }

}
