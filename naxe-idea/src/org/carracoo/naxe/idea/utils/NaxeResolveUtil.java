package org.carracoo.naxe.idea.utils;

import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;
import org.carracoo.naxe.idea.lang.psi.NaxeComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Sergey on 6/8/14.
 */
public class NaxeResolveUtil {

    @NotNull
    public static List<NaxeComponent> findTopComponents(@Nullable PsiFile file) {
        if (file == null) {
            return Collections.emptyList();
        }
        final NaxeComponent[] components = PsiTreeUtil.getChildrenOfType(file, NaxeComponent.class);
        if (components == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(components);
    }

}
