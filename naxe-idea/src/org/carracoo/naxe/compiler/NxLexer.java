package org.carracoo.naxe.compiler;

import java.util.logging.Logger;

/**
 * Created by Sergey on 1/21/14.
 */
public class NxLexer {
    private static final Logger LOGGER = Logger.getLogger(NxLexer.class.getName());

    private static boolean isBom(char ch) {
        return ch == '\uFEFF';
    }

    private static boolean isNl(char ch) {
        return ch == '\n';
    }

    private static boolean isWs(char ch) {
        return ch == ' ' || ch == '\t';
    }

    private static boolean isString(char ch) {
        return ch == '"' || ch == '\'';
    }

    private static boolean isNumber(char ch) {
        return ch >= '0' && ch <= '9';
    }

    private static boolean isHex(char ch) {
        final boolean isNum = ch >= '0' && ch <= '9';
        final boolean isLower = ch >= 'A' && ch <= 'Z';
        final boolean isUpper = ch >= 'a' && ch <= 'z';
        return isNum || isLower || isUpper;
    }

    private static boolean isDecimal(char ch) {
        return ch >= '0' && ch <= '9';
    }

    private static boolean isWord(char ch) {
        return ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9' || ch == '_' || ch == '$';
    }


    private int col;
    private int line;
    private int ind;
    private int pos;
    private int end;
    private char ch;
    private CharSequence src;

    public void setSource(CharSequence source, int start, int end) {
        this.src = source;
        this.pos = 0;
        this.line = 0;
        this.col = 0;
        this.end = end;
        this.ch = end > 0 ? src.charAt(0) : 0;
        while (pos!=start){
            next();
        }
        /*if (start > 0) {
            NxElement e = scan();
            while (e.getPosition().getStart() <= start && e.getPosition().getEnd() >= start) {
                e = scan();
            }
        }*/
    }

    public CharSequence getSource() {
        return src;
    }

    public int getPosition() {
        return pos;
    }

    public int getEnd() {
        return end;
    }

    private int mark() {
        return this.ind = pos;
    }

    private char next() {
        try {
            if (pos >= end) {
                throw new IndexOutOfBoundsException("Out of range " + pos + " of " + end);
            }
            ch = src.charAt(++pos);
            if (ch == '\n') {
                this.col = 0;
                this.line += 1;
            } else {
                this.col++;
            }
        } catch (IndexOutOfBoundsException ex) {
            ch = 0;
            pos = src.length();
        }
        return ch;
    }

    private NxElement token(NxToken token, boolean mark) {
        return token(token, mark, 0);
    }

    private NxElement token(NxToken token, boolean mark, int count) {
        if (mark) {
            mark();
        }
        for (int i = 0; i < count; i++) {
            next();
        }
        return token(token);
    }

    private NxElement token(NxToken token) {
        return token.element(ind, pos, line, col, src.subSequence(ind, pos));
    }

    public NxElement scan() {
        NxElement token = null;

        if (ch == 0) {
            return NxToken.EOF.element(pos, pos, line, col, "");
        } else if (ch == '{') {
            token = token(NxToken.LB, true, 1);
        } else if (ch == '}') {
            token = token(NxToken.RB, true, 1);
        } else if (ch == '(') {
            token = token(NxToken.LP, true, 1);
        } else if (ch == ')') {
            token = token(NxToken.RP, true, 1);
        } else if (ch == '[') {
            token = token(NxToken.LS, true, 1);
        } else if (ch == ']') {
            token = token(NxToken.RS, true, 1);
        } else if (ch == ';') {
            token = token(NxToken.SEM, true, 1);
        } else if (ch == ',') {
            token = token(NxToken.COM, true, 1);
        } else if (ch == '@') {
            token = token(NxToken.AT, true, 1);
        } else if (ch == '?') {
            token = token(NxToken.QM, true, 1);
        } else if (ch == '%') {
            token = token(NxToken.MOD, true, 1);
        } else if (ch == '+') {
            token = token(NxToken.SUM, true, 1);
        } else if (ch == '-') {
            token = token(NxToken.SUB, true, 1);
        } else if (ch == '*') {
            token = token(NxToken.MUL, true, 1);
        } else if (ch == '&') {
            token = token(NxToken.AND, true, 1);
        } else if (ch == '|') {
            token = token(NxToken.OR, true, 1);
        } else if (ch == '/') {
            mark();
            next();
            if (ch == '/') {
                token = scanSComment();
            } else if (ch == '*') {
                token = scanMComment();
            } else {
                token = token(NxToken.DIV);
            }
        } else if (ch == ':') {
            mark();
            next();
            if (ch == ':') {
                token = token(NxToken.ACS);
            } else {
                token = token(NxToken.COL);
            }
        } else if (ch == '<') {
            mark();
            next();
            if (ch == '=') {
                token = token(NxToken.IEQ);
            } else {
                token = token(NxToken.INF);
            }
        } else if (ch == '>') {
            mark();
            next();
            if (ch == '=') {
                token = token(NxToken.SEQ);
            } else {
                token = token(NxToken.SUP);
            }
        } else if (ch == '=') {
            mark();
            next();
            if (ch == '=') {
                if (ch == '=') {
                    token = token(NxToken.AEQ);
                } else {
                    token = token(NxToken.EQL);
                }
            } else {
                token = token(NxToken.SUP);
            }
        } else if (ch == '.') {
            mark();
            next();
            if (ch == '.') {
                if (ch == '.') {
                    token = token(NxToken.PAR);
                } else {
                    token = token(NxToken.TO);
                }
            } else {
                token = token(NxToken.DOT);
            }
        } else if (ch == '!') {
            mark();
            next();
            if (ch == '=') {
                if (ch == '=') {
                    token = token(NxToken.ANE);
                } else {
                    token = token(NxToken.NEQ);
                }
            } else {
                token = token(NxToken.NOT);
            }
        } else if (ch == '~') {
            mark();
            next();
            if (ch == '/') {
                token = scanPattern();
            } else {
                token = token(NxToken.DIV);
            }
        } else if (isBom(ch)) {
            mark();
            token = scanBom();
        } else if (isWs(ch)) {
            mark();
            token = scanWs();
        } else if (isNl(ch)) {
            mark();
            token = scanNl();
        } else if (isString(ch)) {
            mark();
            token = scanString();
        } else if (isNumber(ch)) {
            mark();
            token = scanNumber();
        } else if (isWord(ch)) {
            mark();
            token = scanWord();
        } else {
            mark();
            token = token(NxToken.BCH, true, 1);
        }


        return token;
    }

    private NxElement scanBom() {
        while (ch == '\uFEFF') {
            next();
        }
        return token(NxToken.BOM);
    }

    private NxElement scanNl() {
        while (ch == '\n') {
            next();
        }
        return token(NxToken.NL);
    }

    private NxElement scanWs() {
        while (ch == ' ' || ch == '\t') {
            next();
        }
        return token(NxToken.WS);
    }

    private NxElement scanWord() {
        while (isWord(ch)) {
            next();
        }
        return token(NxToken.WORD);
    }

    private NxElement scanString() {
        char start = ch;
        do {
            next();
            while (ch == '\\') {
                next();
                if (ch == 'u') {
                    next();
                    next();
                    next();
                    next();
                    next();
                } else {
                    next();
                }
            }
        } while (start != ch);
        next();
        return token(NxToken.STRING);
    }

    private NxElement scanNumber() {
        if (ch == '0') {
            char nch = next();
            if (nch == 'x') {
                return scanHex();
            }
        }
        return scanDecimal();
    }

    private NxElement scanHex() {
        while (isHex(next())) {
            next();
        }
        return token(NxToken.NUMBER);
    }

    private NxElement scanDecimal() {
        while (isDecimal(ch)) {
            next();
        }
        if (ch == '.') {
            next();
            while (isDecimal(ch)) {
                next();
            }
            if (ch == 'E' || ch == 'e') {
                next();
                if (ch == '+' || ch == '-') {
                    next();
                }
                while (isDecimal(ch)) {
                    next();
                }
            }
        }
        return token(NxToken.NUMBER);
    }

    private NxElement scanPattern() {
        char start = ch;
        do {
            next();
            while (ch == '\\') {
                next();
                if (ch == 'u') {
                    next();
                    next();
                    next();
                    next();
                    next();
                } else {
                    next();
                }
            }
        } while (start != ch);
        next();
        while (ch == 'g' || ch == 'y' || ch == 'i' || ch == 'm') {
            next();
        }
        return token(NxToken.PATTERN);
    }

    private NxElement scanSComment() {
        while (!isNl(ch)) {
            next();
        }
        return token(NxToken.SCOMMENT);
    }

    private NxElement scanMComment() {
        char cch = next();
        char nch = next();
        while (!(cch == '*' && nch == '/')) {
            cch = nch;
            nch = next();
        }
        if (src.charAt(ind + 3) == '*') {
            return token(NxToken.DOCUMENT);
        } else {
            return token(NxToken.MCOMMENT);
        }
    }


}
