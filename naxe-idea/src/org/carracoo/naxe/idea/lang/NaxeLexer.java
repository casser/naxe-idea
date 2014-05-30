package org.carracoo.naxe.idea.lang;

import com.intellij.lexer.FlexAdapter;

/**
 * Created by Sergey on 5/25/14.
 */
public class NaxeLexer extends FlexAdapter {
    public NaxeLexer() {
        super(new _NaxeLexer());
    }
}
