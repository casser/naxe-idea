package org.carracoo.naxe.idea.syntax;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

/**
 * Created by Sergey on 1/24/14.
 */
public class NaxeSyntaxHighlighterColors {
    public static final TextAttributesKey MCOMMENT               = TextAttributesKey.createTextAttributesKey("NX_MCOMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey SCOMMENT               = TextAttributesKey.createTextAttributesKey("NX_SCOMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey DCOMMENT               = TextAttributesKey.createTextAttributesKey("NX_DCOMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT);
    public static final TextAttributesKey KEYWORD                = TextAttributesKey.createTextAttributesKey("NX_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey METADATA               = TextAttributesKey.createTextAttributesKey("NX_METADATA", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey NUMBER                 = TextAttributesKey.createTextAttributesKey("NX_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey BOOLEAN                = TextAttributesKey.createTextAttributesKey("NX_BOOLEAN", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING                 = TextAttributesKey.createTextAttributesKey("NX_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey OPERATOR               = TextAttributesKey.createTextAttributesKey("NX_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey PARENTHS               = TextAttributesKey.createTextAttributesKey("NX_PARENTHS", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey BRACKETS               = TextAttributesKey.createTextAttributesKey("NX_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey BRACES                 = TextAttributesKey.createTextAttributesKey("NX_BRACES", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey ERROR                  = TextAttributesKey.createTextAttributesKey("NX_ERROR", HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey CLASS                  = TextAttributesKey.createTextAttributesKey("NX_CLASS", DefaultLanguageHighlighterColors.CLASS_NAME);
    public static final TextAttributesKey INTERFACE              = TextAttributesKey.createTextAttributesKey("NX_INTERFACE", DefaultLanguageHighlighterColors.INTERFACE_NAME);
    public static final TextAttributesKey PARAMETER              = TextAttributesKey.createTextAttributesKey("NX_PARAMETER", DefaultLanguageHighlighterColors.PARAMETER);
    public static final TextAttributesKey DEFINED_VAR            = TextAttributesKey.createTextAttributesKey("NX_DEFINED_VAR");
    public static final TextAttributesKey UNDEFINED_VAR          = TextAttributesKey.createTextAttributesKey("NX_UNDEFINED_VAR");
    public static final TextAttributesKey LOCAL_VARIABLE         = TextAttributesKey.createTextAttributesKey("NX_LOCAL_VARIABLE", DefaultLanguageHighlighterColors.LOCAL_VARIABLE);
    public static final TextAttributesKey STATIC_FUNCTION        = TextAttributesKey.createTextAttributesKey("NX_STATIC_FUNCTION", DefaultLanguageHighlighterColors.STATIC_METHOD);
    public static final TextAttributesKey STATIC_VARIABLE        = TextAttributesKey.createTextAttributesKey("NX_STATIC_VARIABLE", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey INSTANCE_FUNCTION      = TextAttributesKey.createTextAttributesKey("NX_INSTANCE_FUNCTION", DefaultLanguageHighlighterColors.INSTANCE_METHOD);
    public static final TextAttributesKey INSTANCE_VARIABLE      = TextAttributesKey.createTextAttributesKey("NX_INSTANCE_VARIABLE", DefaultLanguageHighlighterColors.INSTANCE_FIELD);
}
