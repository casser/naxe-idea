package org.carracoo.naxe.idea.syntax;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.carracoo.naxe.idea.utils.NaxeIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sergey on 1/25/14.
 */
public class NaxeSyntaxHighlighterSettings implements ColorSettingsPage {
    private static final AttributesDescriptor[] ATTRS = new AttributesDescriptor[]{
        new AttributesDescriptor("Single Line Comment", NaxeSyntaxHighlighterColors.SCOMMENT),
        new AttributesDescriptor("Multi Line Comment", NaxeSyntaxHighlighterColors.MCOMMENT),
        new AttributesDescriptor("Documentation Comment", NaxeSyntaxHighlighterColors.DCOMMENT),
        new AttributesDescriptor("Keyword", NaxeSyntaxHighlighterColors.KEYWORD),
        new AttributesDescriptor("Metadata", NaxeSyntaxHighlighterColors.METADATA),
        new AttributesDescriptor("Number", NaxeSyntaxHighlighterColors.NUMBER),
        new AttributesDescriptor("Boolean", NaxeSyntaxHighlighterColors.BOOLEAN),
        new AttributesDescriptor("String", NaxeSyntaxHighlighterColors.STRING),
        new AttributesDescriptor("Operator", NaxeSyntaxHighlighterColors.OPERATOR),
        new AttributesDescriptor("Parenths", NaxeSyntaxHighlighterColors.PARENTHS),
        new AttributesDescriptor("Brackets", NaxeSyntaxHighlighterColors.BRACKETS),
        new AttributesDescriptor("Braces", NaxeSyntaxHighlighterColors.BRACES),
    };
    private static final Map<String, TextAttributesKey> ourTags = new HashMap<String, TextAttributesKey>();
    @Nullable
    @Override
    public Icon getIcon() {
        return NaxeIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new NaxeSyntaxHighlighter(null,null);
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "package hello {\n\tpublic class Test{\n\t\tpublic function Test(){}\n\t}\n}";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return ourTags;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return ATTRS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Naxe Language";
    }
}
