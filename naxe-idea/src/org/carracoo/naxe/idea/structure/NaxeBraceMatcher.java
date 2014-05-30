package org.carracoo.naxe.idea.structure;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import org.carracoo.naxe.idea.lang.NaxeToken;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Sergey on 1/30/14.
 */
public class NaxeBraceMatcher implements PairedBraceMatcher {
    private static final BracePair[] PAIRS = new BracePair[]{
        new BracePair(NaxeToken.LB, NaxeToken.RB, false),
        new BracePair(NaxeToken.LS, NaxeToken.RS, false),
        new BracePair(NaxeToken.LP, NaxeToken.RP, false)
    };

    @Override
    public BracePair[] getPairs() {
        return PAIRS;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType iElementType, @Nullable IElementType iElementType2) {
        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile psiFile, int i) {
        return i;
    }
}
