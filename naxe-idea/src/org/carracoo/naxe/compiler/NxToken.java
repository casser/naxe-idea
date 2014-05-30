package org.carracoo.naxe.compiler;

import javafx.beans.binding.Bindings;

/**
 * Created by Sergey on 1/21/14.
 */
public class NxToken {

  public static final NxToken EOF       = new NxToken("EOF");
  public static final NxToken BOM       = new NxToken("BOM");
  public static final NxToken WS        = new NxToken("WS");
  public static final NxToken NL        = new NxToken("NL");
  public static final NxToken BCH = new NxToken("ERROR");
  public static final NxToken DOCUMENT  = new NxToken("DOCUMENT");
  public static final NxToken MCOMMENT  = new NxToken("MCOMMENT");
  public static final NxToken SCOMMENT  = new NxToken("SCOMMENT");
  public static final NxToken STRING    = new NxToken("STRING");
  public static final NxToken NUMBER    = new NxToken("NUMBER");
  public static final NxToken PATTERN   = new NxToken("PATTERN");
  public static final NxToken WORD      = new NxToken("WORD");

  // unary operators
  public static final NxToken NEG       = new NxToken("'~'");
  public static final NxToken NOT       = new NxToken("'!'");

  public static final NxToken SUM       = new NxToken("'+'");
  public static final NxToken SUB       = new NxToken("'-'");
  public static final NxToken MUL       = new NxToken("'*'");
  public static final NxToken DIV       = new NxToken("'/'");
  public static final NxToken MOD       = new NxToken("'%'");
  public static final NxToken AND       = new NxToken("'&'");
  public static final NxToken OR        = new NxToken("'|'");

  public static final NxToken ASG       = new NxToken("'='");

  public static final NxToken SUP       = new NxToken("'>'");
  public static final NxToken INF       = new NxToken("'<'");
  public static final NxToken SEQ       = new NxToken("'>='");
  public static final NxToken IEQ       = new NxToken("'<='");
  public static final NxToken NEQ       = new NxToken("'!='");
  public static final NxToken ANE       = new NxToken("'!=='");
  public static final NxToken EQL       = new NxToken("'=='");
  public static final NxToken AEQ       = new NxToken("'==='");

  public static final NxToken AT        = new NxToken("'@'");
  public static final NxToken QM        = new NxToken("'?'");

  public static final NxToken SEM       = new NxToken("';'");
  public static final NxToken COM       = new NxToken("','");
  public static final NxToken COL       = new NxToken("':'");
  public static final NxToken ACS       = new NxToken("'::'");
  public static final NxToken DOT       = new NxToken("'.'");
  public static final NxToken TO        = new NxToken("'..'");
  public static final NxToken PAR       = new NxToken("'...'");
  public static final NxToken LB        = new NxToken("'{'");
  public static final NxToken RB        = new NxToken("'}'");
  public static final NxToken LP        = new NxToken("'('");
  public static final NxToken RP        = new NxToken("')'");
  public static final NxToken LS        = new NxToken("'['");
  public static final NxToken RS        = new NxToken("']'");



  private String type;
  private Object data;

  private NxToken(String type){
    this.type = type;
  }

  public NxElement element(int start,int end,int line,int col,char text){
    return element(start,end,line,col,String.valueOf(text));
  }
  public NxElement element(int start,int end,int line,int col,CharSequence text){
    return new NxElement(this,start,end,line,col,text);
  }
  @Override
  public String toString() {
    return type;
  }

  public <T> T getData() {
    return (T) data;
  }
  public <T> T setData(T value) {
    return (T)(data = value);
  }

  public String getType() {
    return type;
  }
}
