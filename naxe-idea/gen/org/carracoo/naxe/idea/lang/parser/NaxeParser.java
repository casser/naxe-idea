// This is a generated file. Not intended for manual editing.
package org.carracoo.naxe.idea.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static org.carracoo.naxe.idea.lang.lexer.NaxeElements.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.lang.LighterASTNode;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import static org.carracoo.naxe.idea.lang.NaxeToken.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class NaxeParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("org.carracoo.naxe.idea.lang.parser.NaxeParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, EXTENDS_SETS_);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == ACCESS_EXP) {
      result_ = exp(builder_, 0, 17);
    }
    else if (root_ == ANNOTATION) {
      result_ = annotation(builder_, 0);
    }
    else if (root_ == ARG_EXP) {
      result_ = arg_exp(builder_, 0);
    }
    else if (root_ == ARGS_EXP) {
      result_ = args_exp(builder_, 0);
    }
    else if (root_ == ARRAY_EXP) {
      result_ = array_exp(builder_, 0);
    }
    else if (root_ == AS_EXP) {
      result_ = exp(builder_, 0, 12);
    }
    else if (root_ == ASG_EXP) {
      result_ = exp(builder_, 0, 3);
    }
    else if (root_ == BIT_EXP) {
      result_ = exp(builder_, 0, 6);
    }
    else if (root_ == BOOLEAN_LIT) {
      result_ = boolean_lit(builder_, 0);
    }
    else if (root_ == BSH_EXP) {
      result_ = exp(builder_, 0, 8);
    }
    else if (root_ == CALL_ARG) {
      result_ = call_arg(builder_, 0);
    }
    else if (root_ == CALL_EXP) {
      result_ = exp(builder_, 0, 13);
    }
    else if (root_ == CAST_EXP) {
      result_ = exp(builder_, 0, 12);
    }
    else if (root_ == CLASS_BODY) {
      result_ = class_body(builder_, 0);
    }
    else if (root_ == CLASS_EXP) {
      result_ = class_exp(builder_, 0);
    }
    else if (root_ == CLOSURE_EXP) {
      result_ = closure_exp(builder_, 0);
    }
    else if (root_ == CLS_EXP) {
      result_ = exp(builder_, 0, 12);
    }
    else if (root_ == CMP_EXP) {
      result_ = exp(builder_, 0, 7);
    }
    else if (root_ == COMPONENT_NAME) {
      result_ = component_name(builder_, 0);
    }
    else if (root_ == COMPONENT_TYPE) {
      result_ = component_type(builder_, 0);
    }
    else if (root_ == DEFINE_EXP) {
      result_ = define_exp(builder_, 0);
    }
    else if (root_ == ELV_EXP) {
      result_ = exp(builder_, 0, 4);
    }
    else if (root_ == END_EXP) {
      result_ = end_exp(builder_, 0);
    }
    else if (root_ == EXP) {
      result_ = exp(builder_, 0, -1);
    }
    else if (root_ == FOR_EXP) {
      result_ = for_exp(builder_, 0);
    }
    else if (root_ == GETTER_BODY) {
      result_ = getter_body(builder_, 0);
    }
    else if (root_ == GETTER_EXP) {
      result_ = getter_exp(builder_, 0);
    }
    else if (root_ == ID_EXP) {
      result_ = id_exp(builder_, 0);
    }
    else if (root_ == IDENTIFIER) {
      result_ = identifier(builder_, 0);
    }
    else if (root_ == IF_EXP) {
      result_ = if_exp(builder_, 0);
    }
    else if (root_ == IMPORT_EXP) {
      result_ = import_exp(builder_, 0);
    }
    else if (root_ == INHERITS_EXP) {
      result_ = inherits_exp(builder_, 0);
    }
    else if (root_ == LIT_EXP) {
      result_ = lit_exp(builder_, 0);
    }
    else if (root_ == LOG_EXP) {
      result_ = exp(builder_, 0, 5);
    }
    else if (root_ == META_EXP) {
      result_ = meta_exp(builder_, 0);
    }
    else if (root_ == METHOD_BODY) {
      result_ = method_body(builder_, 0);
    }
    else if (root_ == METHOD_EXP) {
      result_ = method_exp(builder_, 0);
    }
    else if (root_ == MUL_EXP) {
      result_ = exp(builder_, 0, 10);
    }
    else if (root_ == NEW_EXP) {
      result_ = exp(builder_, 0, 12);
    }
    else if (root_ == NULL_LIT) {
      result_ = null_lit(builder_, 0);
    }
    else if (root_ == NUMBER_LIT) {
      result_ = number_lit(builder_, 0);
    }
    else if (root_ == OBJECT_EXP) {
      result_ = object_exp(builder_, 0);
    }
    else if (root_ == OBJECT_PAIR) {
      result_ = object_pair(builder_, 0);
    }
    else if (root_ == PACKAGE_EXP) {
      result_ = package_exp(builder_, 0);
    }
    else if (root_ == PAREN_EXP) {
      result_ = paren_exp(builder_, 0);
    }
    else if (root_ == PROPERTY_BODY) {
      result_ = property_body(builder_, 0);
    }
    else if (root_ == PROPERTY_EXP) {
      result_ = property_exp(builder_, 0);
    }
    else if (root_ == REF) {
      result_ = ref(builder_, 0);
    }
    else if (root_ == REF_EXP) {
      result_ = exp(builder_, 0, 12);
    }
    else if (root_ == REGEXP_LIT) {
      result_ = regexp_lit(builder_, 0);
    }
    else if (root_ == SETTER_BODY) {
      result_ = setter_body(builder_, 0);
    }
    else if (root_ == SETTER_EXP) {
      result_ = setter_exp(builder_, 0);
    }
    else if (root_ == STRING_LIT) {
      result_ = string_lit(builder_, 0);
    }
    else if (root_ == SUM_EXP) {
      result_ = exp(builder_, 0, 9);
    }
    else if (root_ == SUPER_EXP) {
      result_ = super_exp(builder_, 0);
    }
    else if (root_ == THIS_EXP) {
      result_ = this_exp(builder_, 0);
    }
    else if (root_ == UNE_DEC_EXP) {
      result_ = exp(builder_, 0, 11);
    }
    else if (root_ == UNE_INC_EXP) {
      result_ = exp(builder_, 0, 11);
    }
    else if (root_ == UNS_DEC_EXP) {
      result_ = uns_dec_exp(builder_, 0);
    }
    else if (root_ == UNS_INC_EXP) {
      result_ = uns_inc_exp(builder_, 0);
    }
    else if (root_ == UNS_MIN_EXP) {
      result_ = uns_min_exp(builder_, 0);
    }
    else if (root_ == UNS_NEG_EXP) {
      result_ = uns_neg_exp(builder_, 0);
    }
    else if (root_ == UNS_NOT_EXP) {
      result_ = uns_not_exp(builder_, 0);
    }
    else if (root_ == UNS_OPT_EXP) {
      result_ = exp(builder_, 0, 11);
    }
    else if (root_ == UNTIL_EXP) {
      result_ = until_exp(builder_, 0);
    }
    else if (root_ == VAR_EXP) {
      result_ = var_exp(builder_, 0);
    }
    else if (root_ == WHILE_EXP) {
      result_ = while_exp(builder_, 0);
    }
    else if (root_ == WITH_EXP) {
      result_ = with_exp(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return naxe(builder_, level_ + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ACCESS_EXP, ARGS_EXP, ARG_EXP, ARRAY_EXP,
      ASG_EXP, AS_EXP, BIT_EXP, BSH_EXP,
      CALL_EXP, CAST_EXP, CLASS_EXP, CLOSURE_EXP,
      CLS_EXP, CMP_EXP, DEFINE_EXP, ELV_EXP,
      END_EXP, EXP, FOR_EXP, GETTER_EXP,
      ID_EXP, IF_EXP, IMPORT_EXP, INHERITS_EXP,
      LIT_EXP, LOG_EXP, META_EXP, METHOD_EXP,
      MUL_EXP, NEW_EXP, OBJECT_EXP, PACKAGE_EXP,
      PAREN_EXP, PROPERTY_EXP, REF_EXP, SETTER_EXP,
      SUM_EXP, SUPER_EXP, THIS_EXP, UNE_DEC_EXP,
      UNE_INC_EXP, UNS_DEC_EXP, UNS_INC_EXP, UNS_MIN_EXP,
      UNS_NEG_EXP, UNS_NOT_EXP, UNS_OPT_EXP, UNTIL_EXP,
      VAR_EXP, WHILE_EXP, WITH_EXP),
  };

  /* ********************************************************** */
  // '+'|'-'
  static boolean add_op(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "add_op")) return false;
    if (!nextTokenIs(builder_, "", O_SUM, O_SUB)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, O_SUM);
    if (!result_) result_ = consumeToken(builder_, O_SUB);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '@'|ANNO
  public static boolean annotation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotation")) return false;
    if (!nextTokenIs(builder_, "<annotation>", O_AT, ANNO)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<annotation>");
    result_ = consumeToken(builder_, O_AT);
    if (!result_) result_ = consumeToken(builder_, ANNO);
    exit_section_(builder_, level_, marker_, ANNOTATION, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '[' exp (',' exp)* ']'
  public static boolean array_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_exp")) return false;
    if (!nextTokenIs(builder_, LS)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, LS);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, exp(builder_, level_ + 1, -1));
    result_ = pinned_ && report_error_(builder_, array_exp_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RS) && result_;
    exit_section_(builder_, level_, marker_, ARRAY_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (',' exp)*
  private static boolean array_exp_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_exp_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!array_exp_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "array_exp_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' exp
  private static boolean array_exp_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_exp_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, O_COM);
    result_ = result_ && exp(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '='|'+='|'-='|'*='|'/='|'%='|'&='|'|='|'^='|'<<='|'>>='|'>>>='
  static boolean asg_op(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "asg_op")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, O_ASG);
    if (!result_) result_ = consumeToken(builder_, O_AADD);
    if (!result_) result_ = consumeToken(builder_, O_ASUB);
    if (!result_) result_ = consumeToken(builder_, O_AMUL);
    if (!result_) result_ = consumeToken(builder_, O_ADIV);
    if (!result_) result_ = consumeToken(builder_, O_AMOD);
    if (!result_) result_ = consumeToken(builder_, O_AAND);
    if (!result_) result_ = consumeToken(builder_, O_AOR);
    if (!result_) result_ = consumeToken(builder_, O_AXOR);
    if (!result_) result_ = consumeToken(builder_, O_ALSH);
    if (!result_) result_ = consumeToken(builder_, O_ARSH);
    if (!result_) result_ = consumeToken(builder_, O_AZSH);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '&'|'|'|'^'
  static boolean bit_op(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bit_op")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, O_AND);
    if (!result_) result_ = consumeToken(builder_, O_OR);
    if (!result_) result_ = consumeToken(builder_, O_XOR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'true'|'false'
  public static boolean boolean_lit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "boolean_lit")) return false;
    if (!nextTokenIs(builder_, "<boolean lit>", K_FALSE, K_TRUE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<boolean lit>");
    result_ = consumeToken(builder_, K_TRUE);
    if (!result_) result_ = consumeToken(builder_, K_FALSE);
    exit_section_(builder_, level_, marker_, BOOLEAN_LIT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '<<'|'>>'|'>>>'
  static boolean bsh_op(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bsh_op")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, O_LSH);
    if (!result_) result_ = consumeToken(builder_, O_RSH);
    if (!result_) result_ = consumeToken(builder_, O_ZSH);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' [ !')' exp  (',' exp)* ] ')'
  public static boolean call_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_arg")) return false;
    if (!nextTokenIs(builder_, LP)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, LP);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, call_arg_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RP) && result_;
    exit_section_(builder_, level_, marker_, CALL_ARG, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ !')' exp  (',' exp)* ]
  private static boolean call_arg_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_arg_1")) return false;
    call_arg_1_0(builder_, level_ + 1);
    return true;
  }

  // !')' exp  (',' exp)*
  private static boolean call_arg_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_arg_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = call_arg_1_0_0(builder_, level_ + 1);
    result_ = result_ && exp(builder_, level_ + 1, -1);
    result_ = result_ && call_arg_1_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !')'
  private static boolean call_arg_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_arg_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !consumeToken(builder_, RP);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  // (',' exp)*
  private static boolean call_arg_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_arg_1_0_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!call_arg_1_0_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "call_arg_1_0_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' exp
  private static boolean call_arg_1_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "call_arg_1_0_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, O_COM);
    result_ = result_ && exp(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' class_item* ')'
  public static boolean class_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_body")) return false;
    if (!nextTokenIs(builder_, LP)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, LP);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, class_body_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RP) && result_;
    exit_section_(builder_, level_, marker_, CLASS_BODY, result_, pinned_, null);
    return result_ || pinned_;
  }

  // class_item*
  private static boolean class_body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_body_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!class_item(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "class_body_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // meta_exp? 'class' component_name class_body?
  public static boolean class_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_exp")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<class exp>");
    result_ = class_exp_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, K_CLASS);
    result_ = result_ && component_name(builder_, level_ + 1);
    pinned_ = result_; // pin = 3
    result_ = result_ && class_exp_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CLASS_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // meta_exp?
  private static boolean class_exp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_exp_0")) return false;
    meta_exp(builder_, level_ + 1);
    return true;
  }

  // class_body?
  private static boolean class_exp_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_exp_3")) return false;
    class_body(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // method_exp | property_exp | inherits_exp
  static boolean class_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_item")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = method_exp(builder_, level_ + 1);
    if (!result_) result_ = property_exp(builder_, level_ + 1);
    if (!result_) result_ = inherits_exp(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, false, class_rec_parser_);
    return result_;
  }

  /* ********************************************************** */
  // !('('|')'|'variable'|'function'|'inherits'|meta_exp)
  static boolean class_rec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_rec")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !class_rec_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  // '('|')'|'variable'|'function'|'inherits'|meta_exp
  private static boolean class_rec_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "class_rec_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LP);
    if (!result_) result_ = consumeToken(builder_, RP);
    if (!result_) result_ = consumeToken(builder_, K_VARIABLE);
    if (!result_) result_ = consumeToken(builder_, K_FUNCTION);
    if (!result_) result_ = consumeToken(builder_, K_INHERITS);
    if (!result_) result_ = meta_exp(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '<'|'>'|'<='|'>='|'=='|'==='|'!='|'!=='
  static boolean cmp_op(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cmp_op")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, O_INF);
    if (!result_) result_ = consumeToken(builder_, O_SUP);
    if (!result_) result_ = consumeToken(builder_, O_IEQ);
    if (!result_) result_ = consumeToken(builder_, O_SEQ);
    if (!result_) result_ = consumeToken(builder_, O_EQ);
    if (!result_) result_ = consumeToken(builder_, O_EQS);
    if (!result_) result_ = consumeToken(builder_, O_NE);
    if (!result_) result_ = consumeToken(builder_, O_NES);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier
  public static boolean component_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_name")) return false;
    if (!nextTokenIs(builder_, WORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, COMPONENT_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'any'| 'void' | ref
  public static boolean component_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "component_type")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<component type>");
    result_ = consumeToken(builder_, K_ANY);
    if (!result_) result_ = consumeToken(builder_, K_VOID);
    if (!result_) result_ = ref(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, COMPONENT_TYPE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // component_name ':' component_type
  static boolean define(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "define")) return false;
    if (!nextTokenIs(builder_, WORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = component_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, O_COL);
    result_ = result_ && component_type(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // !('('|')'|';'|'{'|'}'|'['|']'|':'|'@'|WORD|ANNO|'function'|'variable'|'class'|'getter'|'setter')
  static boolean exp_rec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exp_rec")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !exp_rec_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  // '('|')'|';'|'{'|'}'|'['|']'|':'|'@'|WORD|ANNO|'function'|'variable'|'class'|'getter'|'setter'
  private static boolean exp_rec_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exp_rec_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LP);
    if (!result_) result_ = consumeToken(builder_, RP);
    if (!result_) result_ = consumeToken(builder_, O_SEM);
    if (!result_) result_ = consumeToken(builder_, LB);
    if (!result_) result_ = consumeToken(builder_, RB);
    if (!result_) result_ = consumeToken(builder_, LS);
    if (!result_) result_ = consumeToken(builder_, RS);
    if (!result_) result_ = consumeToken(builder_, O_COL);
    if (!result_) result_ = consumeToken(builder_, O_AT);
    if (!result_) result_ = consumeToken(builder_, WORD);
    if (!result_) result_ = consumeToken(builder_, ANNO);
    if (!result_) result_ = consumeToken(builder_, K_FUNCTION);
    if (!result_) result_ = consumeToken(builder_, K_VARIABLE);
    if (!result_) result_ = consumeToken(builder_, K_CLASS);
    if (!result_) result_ = consumeToken(builder_, K_GETTER);
    if (!result_) result_ = consumeToken(builder_, K_SETTER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // package_exp | import_exp | class_exp
  static boolean file_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "file_item")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = package_exp(builder_, level_ + 1);
    if (!result_) result_ = import_exp(builder_, level_ + 1);
    if (!result_) result_ = class_exp(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, false, file_rec_parser_);
    return result_;
  }

  /* ********************************************************** */
  // !('package'|'class'|'import'|meta_exp)
  static boolean file_rec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "file_rec")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !file_rec_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  // 'package'|'class'|'import'|meta_exp
  private static boolean file_rec_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "file_rec_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, K_PACKAGE);
    if (!result_) result_ = consumeToken(builder_, K_CLASS);
    if (!result_) result_ = consumeToken(builder_, K_IMPORT);
    if (!result_) result_ = meta_exp(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // paren
  public static boolean getter_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "getter_body")) return false;
    if (!nextTokenIs(builder_, LP)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = paren(builder_, level_ + 1);
    exit_section_(builder_, marker_, GETTER_BODY, result_);
    return result_;
  }

  /* ********************************************************** */
  // meta_exp? 'getter' getter_body?
  public static boolean getter_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "getter_exp")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<getter exp>");
    result_ = getter_exp_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, K_GETTER);
    result_ = result_ && getter_exp_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, GETTER_EXP, result_, false, null);
    return result_;
  }

  // meta_exp?
  private static boolean getter_exp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "getter_exp_0")) return false;
    meta_exp(builder_, level_ + 1);
    return true;
  }

  // getter_body?
  private static boolean getter_exp_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "getter_exp_2")) return false;
    getter_body(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // WORD
  public static boolean identifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier")) return false;
    if (!nextTokenIs(builder_, WORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, WORD);
    exit_section_(builder_, marker_, IDENTIFIER, result_);
    return result_;
  }

  /* ********************************************************** */
  // meta_exp? 'import' qualifier ('as' ref)?
  public static boolean import_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_exp")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<import exp>");
    result_ = import_exp_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, K_IMPORT);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, qualifier(builder_, level_ + 1));
    result_ = pinned_ && import_exp_3(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, IMPORT_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // meta_exp?
  private static boolean import_exp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_exp_0")) return false;
    meta_exp(builder_, level_ + 1);
    return true;
  }

  // ('as' ref)?
  private static boolean import_exp_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_exp_3")) return false;
    import_exp_3_0(builder_, level_ + 1);
    return true;
  }

  // 'as' ref
  private static boolean import_exp_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_exp_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, K_AS);
    result_ = result_ && ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // meta_exp? 'inherits' ref (',' ref)*
  public static boolean inherits_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inherits_exp")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<inherits exp>");
    result_ = inherits_exp_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, K_INHERITS);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, ref(builder_, level_ + 1));
    result_ = pinned_ && inherits_exp_3(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, INHERITS_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // meta_exp?
  private static boolean inherits_exp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inherits_exp_0")) return false;
    meta_exp(builder_, level_ + 1);
    return true;
  }

  // (',' ref)*
  private static boolean inherits_exp_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inherits_exp_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!inherits_exp_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "inherits_exp_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' ref
  private static boolean inherits_exp_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inherits_exp_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, O_COM);
    result_ = result_ && ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '&&'|'||'
  static boolean log_op(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "log_op")) return false;
    if (!nextTokenIs(builder_, "", O_BAND, O_BOR)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, O_BAND);
    if (!result_) result_ = consumeToken(builder_, O_BOR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' exp* ')'
  public static boolean method_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_body")) return false;
    if (!nextTokenIs(builder_, LP)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LP);
    result_ = result_ && method_body_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RP);
    exit_section_(builder_, marker_, METHOD_BODY, result_);
    return result_;
  }

  // exp*
  private static boolean method_body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_body_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!exp(builder_, level_ + 1, -1)) break;
      if (!empty_element_parsed_guard_(builder_, "method_body_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // meta_exp? 'function' component_name ':' component_type method_body?
  public static boolean method_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_exp")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<method exp>");
    result_ = method_exp_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, K_FUNCTION);
    result_ = result_ && component_name(builder_, level_ + 1);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, consumeToken(builder_, O_COL));
    result_ = pinned_ && report_error_(builder_, component_type(builder_, level_ + 1)) && result_;
    result_ = pinned_ && method_exp_5(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, METHOD_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // meta_exp?
  private static boolean method_exp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_exp_0")) return false;
    meta_exp(builder_, level_ + 1);
    return true;
  }

  // method_body?
  private static boolean method_exp_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "method_exp_5")) return false;
    method_body(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // '*'|'/'|'%'
  static boolean mul_op(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mul_op")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, O_MUL);
    if (!result_) result_ = consumeToken(builder_, O_DIV);
    if (!result_) result_ = consumeToken(builder_, O_MOD);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // file_item*
  static boolean naxe(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "naxe")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!file_item(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "naxe", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // 'null'
  public static boolean null_lit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "null_lit")) return false;
    if (!nextTokenIs(builder_, K_NULL)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, K_NULL);
    exit_section_(builder_, marker_, NULL_LIT, result_);
    return result_;
  }

  /* ********************************************************** */
  // FLOAT|INTEGER|LONG|DOUBLE
  public static boolean number_lit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "number_lit")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<number lit>");
    result_ = consumeToken(builder_, FLOAT);
    if (!result_) result_ = consumeToken(builder_, INTEGER);
    if (!result_) result_ = consumeToken(builder_, LONG);
    if (!result_) result_ = consumeToken(builder_, DOUBLE);
    exit_section_(builder_, level_, marker_, NUMBER_LIT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '{' object_pair? (',' object_pair)* '}'
  public static boolean object_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_exp")) return false;
    if (!nextTokenIs(builder_, LB)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, LB);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, object_exp_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, object_exp_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RB) && result_;
    exit_section_(builder_, level_, marker_, OBJECT_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // object_pair?
  private static boolean object_exp_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_exp_1")) return false;
    object_pair(builder_, level_ + 1);
    return true;
  }

  // (',' object_pair)*
  private static boolean object_exp_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_exp_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!object_exp_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "object_exp_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' object_pair
  private static boolean object_exp_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_exp_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, O_COM);
    result_ = result_ && object_pair(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (identifier|string_lit) ':' exp
  public static boolean object_pair(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_pair")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<object pair>");
    result_ = object_pair_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, O_COL);
    result_ = result_ && exp(builder_, level_ + 1, -1);
    exit_section_(builder_, level_, marker_, OBJECT_PAIR, result_, false, null);
    return result_;
  }

  // identifier|string_lit
  private static boolean object_pair_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "object_pair_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    if (!result_) result_ = string_lit(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // meta_exp? 'package' qualifier
  public static boolean package_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "package_exp")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<package exp>");
    result_ = package_exp_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, K_PACKAGE);
    pinned_ = result_; // pin = 2
    result_ = result_ && qualifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PACKAGE_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // meta_exp?
  private static boolean package_exp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "package_exp_0")) return false;
    meta_exp(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // '(' exp* ')'
  static boolean paren(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "paren")) return false;
    if (!nextTokenIs(builder_, LP)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, LP);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, paren_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RP) && result_;
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  // exp*
  private static boolean paren_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "paren_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!exp(builder_, level_ + 1, -1)) break;
      if (!empty_element_parsed_guard_(builder_, "paren_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // '(' property_item* ')'
  public static boolean property_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_body")) return false;
    if (!nextTokenIs(builder_, LP)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, LP);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, property_body_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RP) && result_;
    exit_section_(builder_, level_, marker_, PROPERTY_BODY, result_, pinned_, null);
    return result_ || pinned_;
  }

  // property_item*
  private static boolean property_body_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_body_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!property_item(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "property_body_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // meta_exp? 'variable' component_name ':' component_type property_body?
  public static boolean property_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_exp")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<property exp>");
    result_ = property_exp_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, K_VARIABLE);
    result_ = result_ && component_name(builder_, level_ + 1);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, consumeToken(builder_, O_COL));
    result_ = pinned_ && report_error_(builder_, component_type(builder_, level_ + 1)) && result_;
    result_ = pinned_ && property_exp_5(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, PROPERTY_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // meta_exp?
  private static boolean property_exp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_exp_0")) return false;
    meta_exp(builder_, level_ + 1);
    return true;
  }

  // property_body?
  private static boolean property_exp_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_exp_5")) return false;
    property_body(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // getter_exp | setter_exp
  static boolean property_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_item")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = getter_exp(builder_, level_ + 1);
    if (!result_) result_ = setter_exp(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, false, property_rec_parser_);
    return result_;
  }

  /* ********************************************************** */
  // !('('|')'|'setter'|'getter'|meta_exp)
  static boolean property_rec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_rec")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NOT_, null);
    result_ = !property_rec_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  // '('|')'|'setter'|'getter'|meta_exp
  private static boolean property_rec_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_rec_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LP);
    if (!result_) result_ = consumeToken(builder_, RP);
    if (!result_) result_ = consumeToken(builder_, K_SETTER);
    if (!result_) result_ = consumeToken(builder_, K_GETTER);
    if (!result_) result_ = meta_exp(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '.' ref
  public static boolean qualified(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualified")) return false;
    if (!nextTokenIs(builder_, O_DOT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
    result_ = consumeToken(builder_, O_DOT);
    result_ = result_ && ref(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, REF, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ref qualified*
  public static boolean qualifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualifier")) return false;
    if (!nextTokenIs(builder_, WORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ref(builder_, level_ + 1);
    result_ = result_ && qualifier_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, REF, result_);
    return result_;
  }

  // qualified*
  private static boolean qualifier_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualifier_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!qualified(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "qualifier_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // identifier
  public static boolean ref(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ref")) return false;
    if (!nextTokenIs(builder_, WORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, REF, result_);
    return result_;
  }

  /* ********************************************************** */
  // REGEXP
  public static boolean regexp_lit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "regexp_lit")) return false;
    if (!nextTokenIs(builder_, REGEXP)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, REGEXP);
    exit_section_(builder_, marker_, REGEXP_LIT, result_);
    return result_;
  }

  /* ********************************************************** */
  // paren
  public static boolean setter_body(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "setter_body")) return false;
    if (!nextTokenIs(builder_, LP)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = paren(builder_, level_ + 1);
    exit_section_(builder_, marker_, SETTER_BODY, result_);
    return result_;
  }

  /* ********************************************************** */
  // meta_exp? 'setter' setter_body?
  public static boolean setter_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "setter_exp")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<setter exp>");
    result_ = setter_exp_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, K_SETTER);
    result_ = result_ && setter_exp_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, SETTER_EXP, result_, false, null);
    return result_;
  }

  // meta_exp?
  private static boolean setter_exp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "setter_exp_0")) return false;
    meta_exp(builder_, level_ + 1);
    return true;
  }

  // setter_body?
  private static boolean setter_exp_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "setter_exp_2")) return false;
    setter_body(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // QSTRING|SSTRING
  public static boolean string_lit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string_lit")) return false;
    if (!nextTokenIs(builder_, "<string lit>", QSTRING, SSTRING)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<string lit>");
    result_ = consumeToken(builder_, QSTRING);
    if (!result_) result_ = consumeToken(builder_, SSTRING);
    exit_section_(builder_, level_, marker_, STRING_LIT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // Expression root: exp
  // Operator priority table:
  // 0: ATOM(closure_exp)
  // 1: ATOM(define_exp)
  // 2: ATOM(arg_exp)
  // 3: ATOM(var_exp)
  // 4: BINARY(asg_exp)
  // 5: BINARY(elv_exp)
  // 6: BINARY(log_exp)
  // 7: BINARY(bit_exp)
  // 8: BINARY(cmp_exp)
  // 9: BINARY(bsh_exp)
  // 10: BINARY(sum_exp)
  // 11: BINARY(mul_exp)
  // 12: POSTFIX(une_inc_exp) POSTFIX(une_dec_exp) PREFIX(uns_min_exp) PREFIX(uns_neg_exp) PREFIX(uns_not_exp) PREFIX(uns_inc_exp) PREFIX(uns_dec_exp) POSTFIX(uns_opt_exp)
  // 13: POSTFIX(cast_exp) POSTFIX(as_exp) POSTFIX(new_exp) POSTFIX(cls_exp) POSTFIX(ref_exp)
  // 14: POSTFIX(call_exp)
  // 15: ATOM(end_exp) ATOM(if_exp) ATOM(for_exp) ATOM(while_exp) ATOM(until_exp) ATOM(with_exp)
  // 16: ATOM(meta_exp)
  // 17: ATOM(id_exp) ATOM(this_exp) ATOM(super_exp) ATOM(args_exp) ATOM(lit_exp) ATOM(paren_exp)
  // 18: BINARY(access_exp)
  public static boolean exp(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "exp")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<exp>");
    result_ = closure_exp(builder_, level_ + 1);
    if (!result_) result_ = define_exp(builder_, level_ + 1);
    if (!result_) result_ = arg_exp(builder_, level_ + 1);
    if (!result_) result_ = var_exp(builder_, level_ + 1);
    if (!result_) result_ = uns_inc_exp(builder_, level_ + 1);
    if (!result_) result_ = uns_dec_exp(builder_, level_ + 1);
    if (!result_) result_ = uns_min_exp(builder_, level_ + 1);
    if (!result_) result_ = uns_neg_exp(builder_, level_ + 1);
    if (!result_) result_ = uns_not_exp(builder_, level_ + 1);
    if (!result_) result_ = end_exp(builder_, level_ + 1);
    if (!result_) result_ = if_exp(builder_, level_ + 1);
    if (!result_) result_ = for_exp(builder_, level_ + 1);
    if (!result_) result_ = while_exp(builder_, level_ + 1);
    if (!result_) result_ = until_exp(builder_, level_ + 1);
    if (!result_) result_ = with_exp(builder_, level_ + 1);
    if (!result_) result_ = meta_exp(builder_, level_ + 1);
    if (!result_) result_ = id_exp(builder_, level_ + 1);
    if (!result_) result_ = this_exp(builder_, level_ + 1);
    if (!result_) result_ = super_exp(builder_, level_ + 1);
    if (!result_) result_ = args_exp(builder_, level_ + 1);
    if (!result_) result_ = lit_exp(builder_, level_ + 1);
    if (!result_) result_ = paren_exp(builder_, level_ + 1);
    pinned_ = result_;
    result_ = result_ && exp_0(builder_, level_ + 1, priority_);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean exp_0(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "exp_0")) return false;
    boolean result_ = true;
    while (true) {
      Marker left_marker_ = (Marker) builder_.getLatestDoneMarker();
      if (!invalid_left_marker_guard_(builder_, left_marker_, "exp_0")) return false;
      Marker marker_ = builder_.mark();
      if (priority_ < 4 && asg_op(builder_, level_ + 1)) {
        result_ = report_error_(builder_, exp(builder_, level_, 3));
        marker_.drop();
        left_marker_.precede().done(ASG_EXP);
      }
      else if (priority_ < 5 && consumeToken(builder_, O_QM)) {
        result_ = report_error_(builder_, exp(builder_, level_, 5));
        result_ = report_error_(builder_, elv_exp_1(builder_, level_ + 1)) && result_;
        marker_.drop();
        left_marker_.precede().done(ELV_EXP);
      }
      else if (priority_ < 6 && log_op(builder_, level_ + 1)) {
        result_ = report_error_(builder_, exp(builder_, level_, 6));
        marker_.drop();
        left_marker_.precede().done(LOG_EXP);
      }
      else if (priority_ < 7 && bit_op(builder_, level_ + 1)) {
        result_ = report_error_(builder_, exp(builder_, level_, 7));
        marker_.drop();
        left_marker_.precede().done(BIT_EXP);
      }
      else if (priority_ < 8 && cmp_op(builder_, level_ + 1)) {
        result_ = report_error_(builder_, exp(builder_, level_, 8));
        marker_.drop();
        left_marker_.precede().done(CMP_EXP);
      }
      else if (priority_ < 9 && bsh_op(builder_, level_ + 1)) {
        result_ = report_error_(builder_, exp(builder_, level_, 9));
        marker_.drop();
        left_marker_.precede().done(BSH_EXP);
      }
      else if (priority_ < 10 && add_op(builder_, level_ + 1)) {
        result_ = report_error_(builder_, exp(builder_, level_, 10));
        marker_.drop();
        left_marker_.precede().done(SUM_EXP);
      }
      else if (priority_ < 11 && mul_op(builder_, level_ + 1)) {
        result_ = report_error_(builder_, exp(builder_, level_, 11));
        marker_.drop();
        left_marker_.precede().done(MUL_EXP);
      }
      else if (priority_ < 12 && consumeToken(builder_, O_INC)) {
        result_ = true;
        marker_.drop();
        left_marker_.precede().done(UNE_INC_EXP);
      }
      else if (priority_ < 12 && consumeToken(builder_, O_DEC)) {
        result_ = true;
        marker_.drop();
        left_marker_.precede().done(UNE_DEC_EXP);
      }
      else if (priority_ < 12 && consumeToken(builder_, O_NOT)) {
        result_ = true;
        marker_.drop();
        left_marker_.precede().done(UNS_OPT_EXP);
      }
      else if (priority_ < 13 && cast_exp_0(builder_, level_ + 1)) {
        result_ = true;
        marker_.drop();
        left_marker_.precede().done(CAST_EXP);
      }
      else if (priority_ < 13 && as_exp_0(builder_, level_ + 1)) {
        result_ = true;
        marker_.drop();
        left_marker_.precede().done(AS_EXP);
      }
      else if (priority_ < 13 && new_exp_0(builder_, level_ + 1)) {
        result_ = true;
        marker_.drop();
        left_marker_.precede().done(NEW_EXP);
      }
      else if (priority_ < 13 && cls_exp_0(builder_, level_ + 1)) {
        result_ = true;
        marker_.drop();
        left_marker_.precede().done(CLS_EXP);
      }
      else if (priority_ < 13 && ref_exp_0(builder_, level_ + 1)) {
        result_ = true;
        marker_.drop();
        left_marker_.precede().done(REF_EXP);
      }
      else if (priority_ < 14 && call_arg(builder_, level_ + 1)) {
        result_ = true;
        marker_.drop();
        left_marker_.precede().done(CALL_EXP);
      }
      else if (priority_ < 18 && consumeToken(builder_, O_DOT)) {
        result_ = report_error_(builder_, exp(builder_, level_, 18));
        marker_.drop();
        left_marker_.precede().done(ACCESS_EXP);
      }
      else {
        exit_section_(builder_, marker_, null, false);
        break;
      }
    }
    return result_;
  }

  // meta_exp? component_name? ':' component_type paren_exp
  public static boolean closure_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_exp")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<closure exp>");
    result_ = closure_exp_0(builder_, level_ + 1);
    result_ = result_ && closure_exp_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, O_COL);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, component_type(builder_, level_ + 1));
    result_ = pinned_ && paren_exp(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, CLOSURE_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // meta_exp?
  private static boolean closure_exp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_exp_0")) return false;
    meta_exp(builder_, level_ + 1);
    return true;
  }

  // component_name?
  private static boolean closure_exp_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "closure_exp_1")) return false;
    component_name(builder_, level_ + 1);
    return true;
  }

  // meta_exp? component_name  ':' component_type
  public static boolean define_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "define_exp")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<define exp>");
    result_ = define_exp_0(builder_, level_ + 1);
    result_ = result_ && component_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, O_COL);
    pinned_ = result_; // pin = 3
    result_ = result_ && component_type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DEFINE_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // meta_exp?
  private static boolean define_exp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "define_exp_0")) return false;
    meta_exp(builder_, level_ + 1);
    return true;
  }

  // meta_exp? 'arg' component_name ':' component_type
  public static boolean arg_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_exp")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<arg exp>");
    result_ = arg_exp_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, K_ARG);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, component_name(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, O_COL)) && result_;
    result_ = pinned_ && component_type(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, ARG_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // meta_exp?
  private static boolean arg_exp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_exp_0")) return false;
    meta_exp(builder_, level_ + 1);
    return true;
  }

  // meta_exp? 'var' component_name ':' component_type
  public static boolean var_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "var_exp")) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<var exp>");
    result_ = var_exp_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, K_VAR);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, component_name(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, O_COL)) && result_;
    result_ = pinned_ && component_type(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, VAR_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // meta_exp?
  private static boolean var_exp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "var_exp_0")) return false;
    meta_exp(builder_, level_ + 1);
    return true;
  }

  // ':' exp
  private static boolean elv_exp_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elv_exp_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, O_COL);
    result_ = result_ && exp(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  public static boolean uns_inc_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uns_inc_exp")) return false;
    if (!nextTokenIs(builder_, "<exp>", O_INC)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, O_INC);
    pinned_ = result_;
    result_ = pinned_ && exp(builder_, level_, 12);
    exit_section_(builder_, level_, marker_, UNS_INC_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean uns_dec_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uns_dec_exp")) return false;
    if (!nextTokenIs(builder_, "<exp>", O_DEC)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, O_DEC);
    pinned_ = result_;
    result_ = pinned_ && exp(builder_, level_, 12);
    exit_section_(builder_, level_, marker_, UNS_DEC_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean uns_min_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uns_min_exp")) return false;
    if (!nextTokenIs(builder_, "<exp>", O_SUB)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, O_SUB);
    pinned_ = result_;
    result_ = pinned_ && exp(builder_, level_, 12);
    exit_section_(builder_, level_, marker_, UNS_MIN_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean uns_neg_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uns_neg_exp")) return false;
    if (!nextTokenIs(builder_, "<exp>", O_NEG)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, O_NEG);
    pinned_ = result_;
    result_ = pinned_ && exp(builder_, level_, 12);
    exit_section_(builder_, level_, marker_, UNS_NEG_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean uns_not_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "uns_not_exp")) return false;
    if (!nextTokenIs(builder_, "<exp>", O_NOT)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, O_NOT);
    pinned_ = result_;
    result_ = pinned_ && exp(builder_, level_, 12);
    exit_section_(builder_, level_, marker_, UNS_NOT_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // '.' 'cast' call_arg?
  private static boolean cast_exp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cast_exp_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, O_DOT);
    result_ = result_ && consumeToken(builder_, K_CAST);
    result_ = result_ && cast_exp_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // call_arg?
  private static boolean cast_exp_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cast_exp_0_2")) return false;
    call_arg(builder_, level_ + 1);
    return true;
  }

  // '.' 'as' call_arg?
  private static boolean as_exp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "as_exp_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, O_DOT);
    result_ = result_ && consumeToken(builder_, K_AS);
    result_ = result_ && as_exp_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // call_arg?
  private static boolean as_exp_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "as_exp_0_2")) return false;
    call_arg(builder_, level_ + 1);
    return true;
  }

  // '.' 'new' call_arg?
  private static boolean new_exp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "new_exp_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, O_DOT);
    result_ = result_ && consumeToken(builder_, K_NEW);
    result_ = result_ && new_exp_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // call_arg?
  private static boolean new_exp_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "new_exp_0_2")) return false;
    call_arg(builder_, level_ + 1);
    return true;
  }

  // '.' 'class'
  private static boolean cls_exp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cls_exp_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, O_DOT);
    result_ = result_ && consumeToken(builder_, K_CLASS);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '.' ref
  private static boolean ref_exp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ref_exp_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, O_DOT);
    result_ = result_ && ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'end'    exp?
  public static boolean end_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "end_exp")) return false;
    if (!nextTokenIs(builder_, K_END)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, K_END);
    pinned_ = result_; // pin = 1
    result_ = result_ && end_exp_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, END_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // exp?
  private static boolean end_exp_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "end_exp_1")) return false;
    exp(builder_, level_ + 1, -1);
    return true;
  }

  // 'if'     paren_exp exp ('else' exp)?
  public static boolean if_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_exp")) return false;
    if (!nextTokenIs(builder_, K_IF)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, K_IF);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, paren_exp(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, exp(builder_, level_ + 1, -1)) && result_;
    result_ = pinned_ && if_exp_3(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, IF_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ('else' exp)?
  private static boolean if_exp_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_exp_3")) return false;
    if_exp_3_0(builder_, level_ + 1);
    return true;
  }

  // 'else' exp
  private static boolean if_exp_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "if_exp_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, K_ELSE);
    result_ = result_ && exp(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // 'for'    paren_exp exp
  public static boolean for_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "for_exp")) return false;
    if (!nextTokenIs(builder_, K_FOR)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, K_FOR);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, paren_exp(builder_, level_ + 1));
    result_ = pinned_ && exp(builder_, level_ + 1, -1) && result_;
    exit_section_(builder_, level_, marker_, FOR_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // 'while'  paren_exp exp
  public static boolean while_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "while_exp")) return false;
    if (!nextTokenIs(builder_, K_WHILE)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, K_WHILE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, paren_exp(builder_, level_ + 1));
    result_ = pinned_ && exp(builder_, level_ + 1, -1) && result_;
    exit_section_(builder_, level_, marker_, WHILE_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // 'until'  paren_exp exp
  public static boolean until_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "until_exp")) return false;
    if (!nextTokenIs(builder_, K_UNTIL)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, K_UNTIL);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, paren_exp(builder_, level_ + 1));
    result_ = pinned_ && exp(builder_, level_ + 1, -1) && result_;
    exit_section_(builder_, level_, marker_, UNTIL_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // 'with'   paren_exp exp
  public static boolean with_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "with_exp")) return false;
    if (!nextTokenIs(builder_, K_WITH)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeToken(builder_, K_WITH);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, paren_exp(builder_, level_ + 1));
    result_ = pinned_ && exp(builder_, level_ + 1, -1) && result_;
    exit_section_(builder_, level_, marker_, WITH_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // annotation call_arg?
  public static boolean meta_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "meta_exp")) return false;
    if (!nextTokenIs(builder_, "<meta exp>", O_AT, ANNO)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<meta exp>");
    result_ = annotation(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && meta_exp_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, META_EXP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // call_arg?
  private static boolean meta_exp_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "meta_exp_1")) return false;
    call_arg(builder_, level_ + 1);
    return true;
  }

  // ref
  public static boolean id_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "id_exp")) return false;
    if (!nextTokenIs(builder_, WORD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ref(builder_, level_ + 1);
    exit_section_(builder_, marker_, ID_EXP, result_);
    return result_;
  }

  // 'this'
  public static boolean this_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "this_exp")) return false;
    if (!nextTokenIs(builder_, K_THIS)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, K_THIS);
    exit_section_(builder_, marker_, THIS_EXP, result_);
    return result_;
  }

  // 'super'
  public static boolean super_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "super_exp")) return false;
    if (!nextTokenIs(builder_, K_SUPER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, K_SUPER);
    exit_section_(builder_, marker_, SUPER_EXP, result_);
    return result_;
  }

  // 'args'
  public static boolean args_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "args_exp")) return false;
    if (!nextTokenIs(builder_, K_ARGS)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, K_ARGS);
    exit_section_(builder_, marker_, ARGS_EXP, result_);
    return result_;
  }

  // null_lit                |
  //     boolean_lit             |
  //     number_lit              |
  //     regexp_lit              |
  //     string_lit              |
  //     object_exp              |
  //     array_exp
  public static boolean lit_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lit_exp")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, "<lit exp>");
    result_ = null_lit(builder_, level_ + 1);
    if (!result_) result_ = boolean_lit(builder_, level_ + 1);
    if (!result_) result_ = number_lit(builder_, level_ + 1);
    if (!result_) result_ = regexp_lit(builder_, level_ + 1);
    if (!result_) result_ = string_lit(builder_, level_ + 1);
    if (!result_) result_ = object_exp(builder_, level_ + 1);
    if (!result_) result_ = array_exp(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, LIT_EXP, result_, false, null);
    return result_;
  }

  // paren
  public static boolean paren_exp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "paren_exp")) return false;
    if (!nextTokenIs(builder_, LP)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = paren(builder_, level_ + 1);
    exit_section_(builder_, marker_, PAREN_EXP, result_);
    return result_;
  }

  final static Parser class_rec_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return class_rec(builder_, level_ + 1);
    }
  };
  final static Parser file_rec_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return file_rec(builder_, level_ + 1);
    }
  };
  final static Parser property_rec_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return property_rec(builder_, level_ + 1);
    }
  };
}
