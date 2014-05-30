package org.carracoo.naxe.idea.structure;

import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.ActionPresentation;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.intellij.psi.PsiFile;

import org.carracoo.naxe.idea.lang.NaxeFileImpl;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

/**
 * Created by Sergey on 1/30/14.
 */
public class NaxeStructureViewModel extends StructureViewModelBase implements StructureViewModel.ElementInfoProvider{

    public NaxeStructureViewModel(@NotNull NaxeFileImpl psiFile) {
        super(psiFile, new NaxeStructureViewElement(psiFile));
        withSorters(KindSorter.INSTANCE, Sorter.ALPHA_SORTER);
        //withSuitableClasses(NaxePsiDeclaration.class);
    }

    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
        return false;
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement structureViewTreeElement) {
        return false;
    }
}

class KindSorter implements Sorter {
    public static final Sorter INSTANCE = new KindSorter();

    public static final String ID = "NS_KIND";
    private static final Comparator COMPARATOR = new Comparator() {
        public int compare(final Object o1, final Object o2) {
            return getWeight(o1) - getWeight(o2);
        }

        private int getWeight(final Object value) {
            Object target = value;
            if (value instanceof NaxeStructureViewElement) {
                target = ((NaxeStructureViewElement)value).getValue();
            }
            /*
            if (target instanceof NaxePsiClass) {
                return 10;
            }
            if (target instanceof NaxePsiFunction) {
                return 15;
            }
            if (target instanceof NaxePsiVariable) {
                return 20;
            }*/
            return 60;
        }
    };

    public Comparator getComparator() {
        return COMPARATOR;
    }

    public boolean isVisible() {
        return false;
    }

    @NotNull
    public ActionPresentation getPresentation() {
        throw new IllegalStateException();
    }

    @NotNull
    public String getName() {
        return ID;
    }
}