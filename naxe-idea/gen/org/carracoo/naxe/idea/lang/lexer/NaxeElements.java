// This is a generated file. Not intended for manual editing.
package org.carracoo.naxe.idea.lang.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.carracoo.naxe.idea.lang.NaxeToken;
import org.carracoo.naxe.idea.lang.psi.*;

public interface NaxeElements {

  IElementType ACCESS_EXP = new NaxeToken("ACCESS_EXP");
  IElementType ANNOTATION = new NaxeToken("ANNOTATION");
  IElementType ARGS_EXP = new NaxeToken("ARGS_EXP");
  IElementType ARG_EXP = new NaxeToken("ARG_EXP");
  IElementType ARRAY_EXP = new NaxeToken("ARRAY_EXP");
  IElementType ASG_EXP = new NaxeToken("ASG_EXP");
  IElementType AS_EXP = new NaxeToken("AS_EXP");
  IElementType BIT_EXP = new NaxeToken("BIT_EXP");
  IElementType BOOLEAN_LIT = new NaxeToken("BOOLEAN_LIT");
  IElementType BSH_EXP = new NaxeToken("BSH_EXP");
  IElementType CALL_ARG = new NaxeToken("CALL_ARG");
  IElementType CALL_EXP = new NaxeToken("CALL_EXP");
  IElementType CAST_EXP = new NaxeToken("CAST_EXP");
  IElementType CLASS_BODY = new NaxeToken("CLASS_BODY");
  IElementType CLASS_EXP = new NaxeToken("CLASS_EXP");
  IElementType CLOSURE_EXP = new NaxeToken("CLOSURE_EXP");
  IElementType CLS_EXP = new NaxeToken("CLS_EXP");
  IElementType CMP_EXP = new NaxeToken("CMP_EXP");
  IElementType COMPONENT_NAME = new NaxeToken("COMPONENT_NAME");
  IElementType COMPONENT_TYPE = new NaxeToken("COMPONENT_TYPE");
  IElementType DEFINE_EXP = new NaxeToken("DEFINE_EXP");
  IElementType ELV_EXP = new NaxeToken("ELV_EXP");
  IElementType END_EXP = new NaxeToken("END_EXP");
  IElementType EXP = new NaxeToken("EXP");
  IElementType FOR_EXP = new NaxeToken("FOR_EXP");
  IElementType GETTER_BODY = new NaxeToken("GETTER_BODY");
  IElementType GETTER_EXP = new NaxeToken("GETTER_EXP");
  IElementType IDENTIFIER = new NaxeToken("IDENTIFIER");
  IElementType ID_EXP = new NaxeToken("ID_EXP");
  IElementType IF_EXP = new NaxeToken("IF_EXP");
  IElementType IMPORT_EXP = new NaxeToken("IMPORT_EXP");
  IElementType INHERITS_EXP = new NaxeToken("INHERITS_EXP");
  IElementType LIT_EXP = new NaxeToken("LIT_EXP");
  IElementType LOG_EXP = new NaxeToken("LOG_EXP");
  IElementType META_EXP = new NaxeToken("META_EXP");
  IElementType METHOD_BODY = new NaxeToken("METHOD_BODY");
  IElementType METHOD_EXP = new NaxeToken("METHOD_EXP");
  IElementType MUL_EXP = new NaxeToken("MUL_EXP");
  IElementType NEW_EXP = new NaxeToken("NEW_EXP");
  IElementType NULL_LIT = new NaxeToken("NULL_LIT");
  IElementType NUMBER_LIT = new NaxeToken("NUMBER_LIT");
  IElementType OBJECT_EXP = new NaxeToken("OBJECT_EXP");
  IElementType OBJECT_PAIR = new NaxeToken("OBJECT_PAIR");
  IElementType PACKAGE_EXP = new NaxeToken("PACKAGE_EXP");
  IElementType PAREN_EXP = new NaxeToken("PAREN_EXP");
  IElementType PROPERTY_BODY = new NaxeToken("PROPERTY_BODY");
  IElementType PROPERTY_EXP = new NaxeToken("PROPERTY_EXP");
  IElementType REF = new NaxeToken("REF");
  IElementType REF_EXP = new NaxeToken("REF_EXP");
  IElementType REGEXP_LIT = new NaxeToken("REGEXP_LIT");
  IElementType SETTER_BODY = new NaxeToken("SETTER_BODY");
  IElementType SETTER_EXP = new NaxeToken("SETTER_EXP");
  IElementType STRING_LIT = new NaxeToken("STRING_LIT");
  IElementType SUM_EXP = new NaxeToken("SUM_EXP");
  IElementType SUPER_EXP = new NaxeToken("SUPER_EXP");
  IElementType THIS_EXP = new NaxeToken("THIS_EXP");
  IElementType UNE_DEC_EXP = new NaxeToken("UNE_DEC_EXP");
  IElementType UNE_INC_EXP = new NaxeToken("UNE_INC_EXP");
  IElementType UNS_DEC_EXP = new NaxeToken("UNS_DEC_EXP");
  IElementType UNS_INC_EXP = new NaxeToken("UNS_INC_EXP");
  IElementType UNS_MIN_EXP = new NaxeToken("UNS_MIN_EXP");
  IElementType UNS_NEG_EXP = new NaxeToken("UNS_NEG_EXP");
  IElementType UNS_NOT_EXP = new NaxeToken("UNS_NOT_EXP");
  IElementType UNS_OPT_EXP = new NaxeToken("UNS_OPT_EXP");
  IElementType UNTIL_EXP = new NaxeToken("UNTIL_EXP");
  IElementType VAR_EXP = new NaxeToken("VAR_EXP");
  IElementType WHILE_EXP = new NaxeToken("WHILE_EXP");
  IElementType WITH_EXP = new NaxeToken("WITH_EXP");

  IElementType ANNO = new NaxeToken("ANNO");
  IElementType DCOMMENT = new NaxeToken("DCOMMENT");
  IElementType DOUBLE = new NaxeToken("DOUBLE");
  IElementType FLOAT = new NaxeToken("FLOAT");
  IElementType INTEGER = new NaxeToken("INTEGER");
  IElementType K_ANY = new NaxeToken("any");
  IElementType K_ARG = new NaxeToken("arg");
  IElementType K_ARGS = new NaxeToken("args");
  IElementType K_AS = new NaxeToken("as");
  IElementType K_BREAK = new NaxeToken("break");
  IElementType K_CASE = new NaxeToken("case");
  IElementType K_CAST = new NaxeToken("cast");
  IElementType K_CATCH = new NaxeToken("catch");
  IElementType K_CLASS = new NaxeToken("class");
  IElementType K_CONTINUE = new NaxeToken("continue");
  IElementType K_ELSE = new NaxeToken("else");
  IElementType K_END = new NaxeToken("end");
  IElementType K_ENUM = new NaxeToken("enum");
  IElementType K_FALSE = new NaxeToken("false");
  IElementType K_FINALLY = new NaxeToken("finally");
  IElementType K_FOR = new NaxeToken("for");
  IElementType K_FUNCTION = new NaxeToken("function");
  IElementType K_GETTER = new NaxeToken("getter");
  IElementType K_IF = new NaxeToken("if");
  IElementType K_IMPORT = new NaxeToken("import");
  IElementType K_IN = new NaxeToken("in");
  IElementType K_INHERITS = new NaxeToken("inherits");
  IElementType K_IS = new NaxeToken("is");
  IElementType K_NEW = new NaxeToken("new");
  IElementType K_NULL = new NaxeToken("null");
  IElementType K_PACKAGE = new NaxeToken("package");
  IElementType K_RETURN = new NaxeToken("return");
  IElementType K_SETTER = new NaxeToken("setter");
  IElementType K_STATIC = new NaxeToken("static");
  IElementType K_SUPER = new NaxeToken("super");
  IElementType K_SWITCH = new NaxeToken("switch");
  IElementType K_THIS = new NaxeToken("this");
  IElementType K_THROW = new NaxeToken("throw");
  IElementType K_TRUE = new NaxeToken("true");
  IElementType K_TRY = new NaxeToken("try");
  IElementType K_UNTIL = new NaxeToken("until");
  IElementType K_USING = new NaxeToken("using");
  IElementType K_VAR = new NaxeToken("var");
  IElementType K_VARIABLE = new NaxeToken("variable");
  IElementType K_VOID = new NaxeToken("void");
  IElementType K_WHILE = new NaxeToken("while");
  IElementType K_WITH = new NaxeToken("with");
  IElementType LB = new NaxeToken("{");
  IElementType LONG = new NaxeToken("LONG");
  IElementType LP = new NaxeToken("(");
  IElementType LS = new NaxeToken("[");
  IElementType MCOMMENT = new NaxeToken("MCOMMENT");
  IElementType O_AADD = new NaxeToken("+=");
  IElementType O_AAND = new NaxeToken("&=");
  IElementType O_ADIV = new NaxeToken("/=");
  IElementType O_ALSH = new NaxeToken("<<=");
  IElementType O_AMOD = new NaxeToken("%=");
  IElementType O_AMUL = new NaxeToken("*=");
  IElementType O_AND = new NaxeToken("&");
  IElementType O_AOR = new NaxeToken("|=");
  IElementType O_ARSH = new NaxeToken(">>=");
  IElementType O_ASG = new NaxeToken("=");
  IElementType O_ASUB = new NaxeToken("-=");
  IElementType O_AT = new NaxeToken("@");
  IElementType O_AXOR = new NaxeToken("^=");
  IElementType O_AZSH = new NaxeToken(">>>=");
  IElementType O_BAND = new NaxeToken("&&");
  IElementType O_BOR = new NaxeToken("||");
  IElementType O_COL = new NaxeToken(":");
  IElementType O_COM = new NaxeToken(",");
  IElementType O_DEC = new NaxeToken("--");
  IElementType O_DIV = new NaxeToken("/");
  IElementType O_DOT = new NaxeToken(".");
  IElementType O_EQ = new NaxeToken("==");
  IElementType O_EQS = new NaxeToken("===");
  IElementType O_FUN = new NaxeToken("->");
  IElementType O_IEQ = new NaxeToken("<=");
  IElementType O_INC = new NaxeToken("++");
  IElementType O_INF = new NaxeToken("<");
  IElementType O_LSH = new NaxeToken("<<");
  IElementType O_MOD = new NaxeToken("%");
  IElementType O_MUL = new NaxeToken("*");
  IElementType O_NE = new NaxeToken("!=");
  IElementType O_NEG = new NaxeToken("~");
  IElementType O_NES = new NaxeToken("!==");
  IElementType O_NOT = new NaxeToken("!");
  IElementType O_NS = new NaxeToken("::");
  IElementType O_NUM = new NaxeToken("#");
  IElementType O_OR = new NaxeToken("|");
  IElementType O_PAR = new NaxeToken("...");
  IElementType O_QM = new NaxeToken("?");
  IElementType O_RSH = new NaxeToken(">>");
  IElementType O_SEM = new NaxeToken(";");
  IElementType O_SEQ = new NaxeToken(">=");
  IElementType O_SUB = new NaxeToken("-");
  IElementType O_SUM = new NaxeToken("+");
  IElementType O_SUP = new NaxeToken(">");
  IElementType O_TO = new NaxeToken("..");
  IElementType O_XOR = new NaxeToken("^");
  IElementType O_ZSH = new NaxeToken(">>>");
  IElementType QSTRING = new NaxeToken("QSTRING");
  IElementType RB = new NaxeToken("}");
  IElementType REGEXP = new NaxeToken("REGEXP");
  IElementType RP = new NaxeToken(")");
  IElementType RS = new NaxeToken("]");
  IElementType SCOMMENT = new NaxeToken("SCOMMENT");
  IElementType SSTRING = new NaxeToken("SSTRING");
  IElementType WORD = new NaxeToken("WORD");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ACCESS_EXP) {
        return new NaxeAccessExpImpl(node);
      }
      else if (type == ANNOTATION) {
        return new NaxeAnnotationImpl(node);
      }
      else if (type == ARGS_EXP) {
        return new NaxeArgsExpImpl(node);
      }
      else if (type == ARG_EXP) {
        return new NaxeArgExpImpl(node);
      }
      else if (type == ARRAY_EXP) {
        return new NaxeArrayExpImpl(node);
      }
      else if (type == ASG_EXP) {
        return new NaxeAsgExpImpl(node);
      }
      else if (type == AS_EXP) {
        return new NaxeAsExpImpl(node);
      }
      else if (type == BIT_EXP) {
        return new NaxeBitExpImpl(node);
      }
      else if (type == BOOLEAN_LIT) {
        return new NaxeBooleanLitImpl(node);
      }
      else if (type == BSH_EXP) {
        return new NaxeBshExpImpl(node);
      }
      else if (type == CALL_ARG) {
        return new NaxeCallArgImpl(node);
      }
      else if (type == CALL_EXP) {
        return new NaxeCallExpImpl(node);
      }
      else if (type == CAST_EXP) {
        return new NaxeCastExpImpl(node);
      }
      else if (type == CLASS_BODY) {
        return new NaxeClassBodyImpl(node);
      }
      else if (type == CLASS_EXP) {
        return new NaxeClassExpImpl(node);
      }
      else if (type == CLOSURE_EXP) {
        return new NaxeClosureExpImpl(node);
      }
      else if (type == CLS_EXP) {
        return new NaxeClsExpImpl(node);
      }
      else if (type == CMP_EXP) {
        return new NaxeCmpExpImpl(node);
      }
      else if (type == COMPONENT_NAME) {
        return new NaxeComponentNameImpl(node);
      }
      else if (type == COMPONENT_TYPE) {
        return new NaxeComponentTypeImpl(node);
      }
      else if (type == DEFINE_EXP) {
        return new NaxeDefineExpImpl(node);
      }
      else if (type == ELV_EXP) {
        return new NaxeElvExpImpl(node);
      }
      else if (type == END_EXP) {
        return new NaxeEndExpImpl(node);
      }
      else if (type == EXP) {
        return new NaxeExpImpl(node);
      }
      else if (type == FOR_EXP) {
        return new NaxeForExpImpl(node);
      }
      else if (type == GETTER_BODY) {
        return new NaxeGetterBodyImpl(node);
      }
      else if (type == GETTER_EXP) {
        return new NaxeGetterExpImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new NaxeIdentifierImpl(node);
      }
      else if (type == ID_EXP) {
        return new NaxeIdExpImpl(node);
      }
      else if (type == IF_EXP) {
        return new NaxeIfExpImpl(node);
      }
      else if (type == IMPORT_EXP) {
        return new NaxeImportExpImpl(node);
      }
      else if (type == INHERITS_EXP) {
        return new NaxeInheritsExpImpl(node);
      }
      else if (type == LIT_EXP) {
        return new NaxeLitExpImpl(node);
      }
      else if (type == LOG_EXP) {
        return new NaxeLogExpImpl(node);
      }
      else if (type == META_EXP) {
        return new NaxeMetaExpImpl(node);
      }
      else if (type == METHOD_BODY) {
        return new NaxeMethodBodyImpl(node);
      }
      else if (type == METHOD_EXP) {
        return new NaxeMethodExpImpl(node);
      }
      else if (type == MUL_EXP) {
        return new NaxeMulExpImpl(node);
      }
      else if (type == NEW_EXP) {
        return new NaxeNewExpImpl(node);
      }
      else if (type == NULL_LIT) {
        return new NaxeNullLitImpl(node);
      }
      else if (type == NUMBER_LIT) {
        return new NaxeNumberLitImpl(node);
      }
      else if (type == OBJECT_EXP) {
        return new NaxeObjectExpImpl(node);
      }
      else if (type == OBJECT_PAIR) {
        return new NaxeObjectPairImpl(node);
      }
      else if (type == PACKAGE_EXP) {
        return new NaxePackageExpImpl(node);
      }
      else if (type == PAREN_EXP) {
        return new NaxeParenExpImpl(node);
      }
      else if (type == PROPERTY_BODY) {
        return new NaxePropertyBodyImpl(node);
      }
      else if (type == PROPERTY_EXP) {
        return new NaxePropertyExpImpl(node);
      }
      else if (type == REF) {
        return new NaxeRefImpl(node);
      }
      else if (type == REF_EXP) {
        return new NaxeRefExpImpl(node);
      }
      else if (type == REGEXP_LIT) {
        return new NaxeRegexpLitImpl(node);
      }
      else if (type == SETTER_BODY) {
        return new NaxeSetterBodyImpl(node);
      }
      else if (type == SETTER_EXP) {
        return new NaxeSetterExpImpl(node);
      }
      else if (type == STRING_LIT) {
        return new NaxeStringLitImpl(node);
      }
      else if (type == SUM_EXP) {
        return new NaxeSumExpImpl(node);
      }
      else if (type == SUPER_EXP) {
        return new NaxeSuperExpImpl(node);
      }
      else if (type == THIS_EXP) {
        return new NaxeThisExpImpl(node);
      }
      else if (type == UNE_DEC_EXP) {
        return new NaxeUneDecExpImpl(node);
      }
      else if (type == UNE_INC_EXP) {
        return new NaxeUneIncExpImpl(node);
      }
      else if (type == UNS_DEC_EXP) {
        return new NaxeUnsDecExpImpl(node);
      }
      else if (type == UNS_INC_EXP) {
        return new NaxeUnsIncExpImpl(node);
      }
      else if (type == UNS_MIN_EXP) {
        return new NaxeUnsMinExpImpl(node);
      }
      else if (type == UNS_NEG_EXP) {
        return new NaxeUnsNegExpImpl(node);
      }
      else if (type == UNS_NOT_EXP) {
        return new NaxeUnsNotExpImpl(node);
      }
      else if (type == UNS_OPT_EXP) {
        return new NaxeUnsOptExpImpl(node);
      }
      else if (type == UNTIL_EXP) {
        return new NaxeUntilExpImpl(node);
      }
      else if (type == VAR_EXP) {
        return new NaxeVarExpImpl(node);
      }
      else if (type == WHILE_EXP) {
        return new NaxeWhileExpImpl(node);
      }
      else if (type == WITH_EXP) {
        return new NaxeWithExpImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
