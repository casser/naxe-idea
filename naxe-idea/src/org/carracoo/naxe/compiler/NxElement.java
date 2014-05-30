package org.carracoo.naxe.compiler;

/**
 * Created by Sergey on 1/21/14.
 */
public class NxElement {

  private final CharSequence value;
  private final NxPosition position;
  private final NxToken token;

  public NxElement(NxToken token, int start, int end, int line, int col, CharSequence value) {
    this.token = token;
    this.value = value;
    this.position = new NxPosition(start, end, line, col);
  }

  public boolean is(NxToken token) {
    return this.token.equals(token);
  }

  public NxPosition getPosition() {
    return position;
  }

  public NxToken getToken() {
    return token;
  }

  @Override
  public String toString() {
    return "E("+token.toString()+" "+value.toString().replace('\n', '*')+")";
  }
}
