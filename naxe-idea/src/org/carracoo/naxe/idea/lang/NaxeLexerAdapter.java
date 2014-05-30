package org.carracoo.naxe.idea.lang;

import com.intellij.lexer.FlexAdapter;
import org.carracoo.naxe.idea.lang._NaxeLexer;

/**
 * Created by Sergey on 1/24/14.
 */
public class NaxeLexerAdapter extends FlexAdapter {
    public NaxeLexerAdapter() {
        super(new _NaxeLexer());
    }
}
