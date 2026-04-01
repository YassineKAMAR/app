package o7;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f25302a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f25304c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f25303b = new d0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private StringBuilder f25305d = new StringBuilder();

    private final int B(CharSequence charSequence, int i8) {
        char cCharAt = charSequence.charAt(i8);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        char c8 = 'a';
        if (!('a' <= cCharAt && cCharAt < 'g')) {
            c8 = 'A';
            if (!('A' <= cCharAt && cCharAt < 'G')) {
                y(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
                throw new e6.h();
            }
        }
        return (cCharAt - c8) + 10;
    }

    private final String K() {
        String str = this.f25304c;
        kotlin.jvm.internal.q.c(str);
        this.f25304c = null;
        return str;
    }

    private final boolean O() {
        return C().charAt(this.f25302a - 1) != '\"';
    }

    private final int b(int i8) {
        int iG = G(i8);
        if (iG == -1) {
            y(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new e6.h();
        }
        int i9 = iG + 1;
        char cCharAt = C().charAt(iG);
        if (cCharAt == 'u') {
            return d(C(), i9);
        }
        char cB = b.b(cCharAt);
        if (cB != 0) {
            this.f25305d.append(cB);
            return i9;
        }
        y(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new e6.h();
    }

    private final int c(int i8, int i9) {
        e(i8, i9);
        return b(i9 + 1);
    }

    private final int d(CharSequence charSequence, int i8) {
        int i9 = i8 + 4;
        if (i9 < charSequence.length()) {
            this.f25305d.append((char) ((B(charSequence, i8) << 12) + (B(charSequence, i8 + 1) << 8) + (B(charSequence, i8 + 2) << 4) + B(charSequence, i8 + 3)));
            return i9;
        }
        this.f25302a = i8;
        v();
        if (this.f25302a + 4 < charSequence.length()) {
            return d(charSequence, this.f25302a);
        }
        y(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new e6.h();
    }

    private final boolean h(int i8) {
        int iG = G(i8);
        if (iG >= C().length() || iG == -1) {
            y(this, "EOF", 0, null, 6, null);
            throw new e6.h();
        }
        int i9 = iG + 1;
        int iCharAt = C().charAt(iG) | ' ';
        if (iCharAt == 102) {
            j("alse", i9);
            return false;
        }
        if (iCharAt == 116) {
            j("rue", i9);
            return true;
        }
        y(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
        throw new e6.h();
    }

    private final void j(String str, int i8) {
        if (C().length() - i8 < str.length()) {
            y(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new e6.h();
        }
        int length = str.length();
        for (int i9 = 0; i9 < length; i9++) {
            if (str.charAt(i9) != (C().charAt(i8 + i9) | ' ')) {
                y(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
                throw new e6.h();
            }
        }
        this.f25302a = i8 + str.length();
    }

    private final String u(int i8, int i9) {
        e(i8, i9);
        String string = this.f25305d.toString();
        kotlin.jvm.internal.q.e(string, "escapedString.toString()");
        this.f25305d.setLength(0);
        return string;
    }

    public static /* synthetic */ Void y(a aVar, String str, int i8, String str2, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i9 & 2) != 0) {
            i8 = aVar.f25302a;
        }
        if ((i9 & 4) != 0) {
            str2 = "";
        }
        return aVar.x(str, i8, str2);
    }

    public final void A(String key) {
        kotlin.jvm.internal.q.f(key, "key");
        x("Encountered an unknown key '" + key + '\'', w6.w.P(J(0, this.f25302a), key, 0, false, 6, null), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new e6.h();
    }

    protected abstract CharSequence C();

    protected final boolean D(char c8) {
        return !(((c8 == '}' || c8 == ']') || c8 == ':') || c8 == ',');
    }

    public final byte E() {
        CharSequence charSequenceC = C();
        int i8 = this.f25302a;
        while (true) {
            int iG = G(i8);
            if (iG == -1) {
                this.f25302a = iG;
                return (byte) 10;
            }
            char cCharAt = charSequenceC.charAt(iG);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f25302a = iG;
                return b.a(cCharAt);
            }
            i8 = iG + 1;
        }
    }

    public final String F(boolean z7) {
        String strQ;
        byte bE = E();
        if (z7) {
            if (bE != 1 && bE != 0) {
                return null;
            }
            strQ = s();
        } else {
            if (bE != 1) {
                return null;
            }
            strQ = q();
        }
        this.f25304c = strQ;
        return strQ;
    }

    public abstract int G(int i8);

    public final void H(boolean z7) {
        ArrayList arrayList = new ArrayList();
        byte bE = E();
        if (bE != 8 && bE != 6) {
            s();
            return;
        }
        while (true) {
            byte bE2 = E();
            boolean z8 = true;
            if (bE2 != 1) {
                if (bE2 != 8 && bE2 != 6) {
                    z8 = false;
                }
                if (z8) {
                    arrayList.add(Byte.valueOf(bE2));
                } else {
                    if (bE2 == 9) {
                        if (((Number) f6.w.H(arrayList)).byteValue() != 8) {
                            throw b0.f(this.f25302a, "found ] instead of } at path: " + this.f25303b, C());
                        }
                    } else if (bE2 == 7) {
                        if (((Number) f6.w.H(arrayList)).byteValue() != 6) {
                            throw b0.f(this.f25302a, "found } instead of ] at path: " + this.f25303b, C());
                        }
                    } else if (bE2 == 10) {
                        y(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                        throw new e6.h();
                    }
                    f6.t.s(arrayList);
                }
                m();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z7) {
                s();
            } else {
                k();
            }
        }
    }

    public abstract int I();

    public String J(int i8, int i9) {
        return C().subSequence(i8, i9).toString();
    }

    public abstract boolean L();

    public final boolean M() {
        int iG = G(I());
        int length = C().length() - iG;
        if (length < 4 || iG == -1) {
            return true;
        }
        for (int i8 = 0; i8 < 4; i8++) {
            if ("null".charAt(i8) != C().charAt(iG + i8)) {
                return true;
            }
        }
        if (length > 4 && b.a(C().charAt(iG + 4)) == 0) {
            return true;
        }
        this.f25302a = iG + 4;
        return false;
    }

    protected final void N(char c8) {
        int i8 = this.f25302a - 1;
        this.f25302a = i8;
        if (i8 >= 0 && c8 == '\"' && kotlin.jvm.internal.q.b(s(), "null")) {
            x("Expected string literal but 'null' literal was found", this.f25302a - 4, "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw new e6.h();
        }
        z(b.a(c8));
        throw new e6.h();
    }

    protected void e(int i8, int i9) {
        this.f25305d.append(C(), i8, i9);
    }

    public abstract boolean f();

    public final boolean g() {
        return h(I());
    }

    public final boolean i() {
        boolean z7;
        int I = I();
        if (I == C().length()) {
            y(this, "EOF", 0, null, 6, null);
            throw new e6.h();
        }
        if (C().charAt(I) == '\"') {
            I++;
            z7 = true;
        } else {
            z7 = false;
        }
        boolean zH = h(I);
        if (z7) {
            if (this.f25302a == C().length()) {
                y(this, "EOF", 0, null, 6, null);
                throw new e6.h();
            }
            if (C().charAt(this.f25302a) != '\"') {
                y(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new e6.h();
            }
            this.f25302a++;
        }
        return zH;
    }

    public abstract String k();

    public abstract String l(String str, boolean z7);

    public abstract byte m();

    public final byte n(byte b8) {
        byte bM = m();
        if (bM == b8) {
            return bM;
        }
        z(b8);
        throw new e6.h();
    }

    public abstract void o(char c8);

    public final long p() {
        boolean z7;
        int iG = G(I());
        if (iG >= C().length() || iG == -1) {
            y(this, "EOF", 0, null, 6, null);
            throw new e6.h();
        }
        if (C().charAt(iG) == '\"') {
            iG++;
            if (iG == C().length()) {
                y(this, "EOF", 0, null, 6, null);
                throw new e6.h();
            }
            z7 = true;
        } else {
            z7 = false;
        }
        int i8 = iG;
        long j8 = 0;
        boolean z8 = true;
        boolean z9 = false;
        while (z8) {
            char cCharAt = C().charAt(i8);
            if (cCharAt != '-') {
                if (b.a(cCharAt) != 0) {
                    break;
                }
                i8++;
                z8 = i8 != C().length();
                int i9 = cCharAt - '0';
                if (!(i9 >= 0 && i9 < 10)) {
                    y(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6, null);
                    throw new e6.h();
                }
                j8 = (j8 * ((long) 10)) - ((long) i9);
                if (j8 > 0) {
                    y(this, "Numeric value overflow", 0, null, 6, null);
                    throw new e6.h();
                }
            } else {
                if (i8 != iG) {
                    y(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                    throw new e6.h();
                }
                i8++;
                z9 = true;
            }
        }
        if (iG == i8 || (z9 && iG == i8 - 1)) {
            y(this, "Expected numeric literal", 0, null, 6, null);
            throw new e6.h();
        }
        if (z7) {
            if (!z8) {
                y(this, "EOF", 0, null, 6, null);
                throw new e6.h();
            }
            if (C().charAt(i8) != '\"') {
                y(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new e6.h();
            }
            i8++;
        }
        this.f25302a = i8;
        if (z9) {
            return j8;
        }
        if (j8 != Long.MIN_VALUE) {
            return -j8;
        }
        y(this, "Numeric value overflow", 0, null, 6, null);
        throw new e6.h();
    }

    public final String q() {
        return this.f25304c != null ? K() : k();
    }

    protected final String r(CharSequence source, int i8, int i9) {
        int iG;
        kotlin.jvm.internal.q.f(source, "source");
        char cCharAt = source.charAt(i9);
        boolean z7 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                iG = G(c(i8, i9));
                if (iG == -1) {
                    y(this, "EOF", iG, null, 4, null);
                    throw new e6.h();
                }
            } else {
                i9++;
                if (i9 >= source.length()) {
                    e(i8, i9);
                    iG = G(i9);
                    if (iG == -1) {
                        y(this, "EOF", iG, null, 4, null);
                        throw new e6.h();
                    }
                } else {
                    continue;
                    cCharAt = source.charAt(i9);
                }
            }
            i8 = iG;
            i9 = i8;
            z7 = true;
            cCharAt = source.charAt(i9);
        }
        String strJ = !z7 ? J(i8, i9) : u(i8, i9);
        this.f25302a = i9 + 1;
        return strJ;
    }

    public final String s() {
        if (this.f25304c != null) {
            return K();
        }
        int I = I();
        if (I >= C().length() || I == -1) {
            y(this, "EOF", I, null, 4, null);
            throw new e6.h();
        }
        byte bA = b.a(C().charAt(I));
        if (bA == 1) {
            return q();
        }
        if (bA != 0) {
            y(this, "Expected beginning of the string, but got " + C().charAt(I), 0, null, 6, null);
            throw new e6.h();
        }
        boolean z7 = false;
        while (b.a(C().charAt(I)) == 0) {
            I++;
            if (I >= C().length()) {
                e(this.f25302a, I);
                int iG = G(I);
                if (iG == -1) {
                    this.f25302a = I;
                    return u(0, 0);
                }
                I = iG;
                z7 = true;
            }
        }
        int i8 = this.f25302a;
        String strJ = !z7 ? J(i8, I) : u(i8, I);
        this.f25302a = I;
        return strJ;
    }

    public final String t() {
        String strS = s();
        if (!kotlin.jvm.internal.q.b(strS, "null") || !O()) {
            return strS;
        }
        y(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new e6.h();
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) C()) + "', currentPosition=" + this.f25302a + ')';
    }

    public void v() {
    }

    public final void w() {
        if (m() == 10) {
            return;
        }
        y(this, "Expected EOF after parsing, but had " + C().charAt(this.f25302a - 1) + " instead", 0, null, 6, null);
        throw new e6.h();
    }

    public final Void x(String message, int i8, String hint) {
        String str;
        kotlin.jvm.internal.q.f(message, "message");
        kotlin.jvm.internal.q.f(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw b0.f(i8, message + " at path: " + this.f25303b.a() + str, C());
    }

    public final Void z(byte b8) {
        y(this, "Expected " + (b8 == 1 ? "quotation mark '\"'" : b8 == 4 ? "comma ','" : b8 == 5 ? "colon ':'" : b8 == 6 ? "start of the object '{'" : b8 == 7 ? "end of the object '}'" : b8 == 8 ? "start of the array '['" : b8 == 9 ? "end of the array ']'" : "valid token") + ", but had '" + ((this.f25302a == C().length() || this.f25302a <= 0) ? "EOF" : String.valueOf(C().charAt(this.f25302a - 1))) + "' instead", this.f25302a - 1, null, 4, null);
        throw new e6.h();
    }
}
