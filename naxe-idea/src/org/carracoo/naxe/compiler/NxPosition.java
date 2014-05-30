package org.carracoo.naxe.compiler;

/**
 * Created by Sergey on 1/21/14.
 */
public class NxPosition {
  private int start,end,line,column;

  public int getStart() {
    return start;
  }

  public void setStart(int start) {
    this.start = start;
  }

  public int getEnd() {
    return end;
  }

  public void setEnd(int end) {
    this.end = end;
  }

  public int getLine() {
    return line;
  }

  public void setLine(int line) {
    this.line = line;
  }

  public int getColumn() {
    return column;
  }

  public void setColumn(int column) {
    this.column = column;
  }

  public NxPosition(int start, int end, int line, int col) {
    setStart(start);
    setEnd(end);
    setLine(line);
    setColumn(col);
  }
}
