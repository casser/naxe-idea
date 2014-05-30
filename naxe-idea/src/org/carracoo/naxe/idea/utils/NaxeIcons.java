package org.carracoo.naxe.idea.utils;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

/**
 * Created by Sergey on 1/24/14.
 */
public class NaxeIcons {

    private static Icon load(String path) {
        return IconLoader.getIcon(path, NaxeIcons.class);
    }

    public static final Icon FILE       = load("/icons/nx-file.png");
    public static final Icon FOLDER     = load("/icons/nx-folder.png");
    public static final Icon CLASS      = load("/icons/nx-class.png");
    public static final Icon ENUM       = load("/icons/nx-enum.png");
    public static final Icon INTERFACE  = load("/icons/nx-interface.png");
}
