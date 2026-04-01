package o7;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25388e;

    public u0(String source) {
        kotlin.jvm.internal.q.f(source, "source");
        this.f25388e = source;
    }

    @Override // o7.a
    public int G(int i8) {
        if (i8 < C().length()) {
            return i8;
        }
        return -1;
    }

    @Override // o7.a
    public int I() {
        char cCharAt;
        int i8 = this.f25302a;
        if (i8 == -1) {
            return i8;
        }
        while (i8 < C().length() && ((cCharAt = C().charAt(i8)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i8++;
        }
        this.f25302a = i8;
        return i8;
    }

    @Override // o7.a
    public boolean L() {
        int I = I();
        if (I == C().length() || I == -1 || C().charAt(I) != ',') {
            return false;
        }
        this.f25302a++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o7.a
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public String C() {
        return this.f25388e;
    }

    @Override // o7.a
    public boolean f() {
        int i8 = this.f25302a;
        if (i8 == -1) {
            return false;
        }
        while (i8 < C().length()) {
            char cCharAt = C().charAt(i8);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f25302a = i8;
                return D(cCharAt);
            }
            i8++;
        }
        this.f25302a = i8;
        return false;
    }

    @Override // o7.a
    public String k() {
        o('\"');
        int i8 = this.f25302a;
        int iJ = w6.w.J(C(), '\"', i8, false, 4, null);
        if (iJ == -1) {
            z((byte) 1);
            throw new e6.h();
        }
        for (int i9 = i8; i9 < iJ; i9++) {
            if (C().charAt(i9) == '\\') {
                return r(C(), this.f25302a, i9);
            }
        }
        this.f25302a = iJ + 1;
        String strSubstring = C().substring(i8, iJ);
        kotlin.jvm.internal.q.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Override // o7.a
    public String l(String keyToMatch, boolean z7) {
        kotlin.jvm.internal.q.f(keyToMatch, "keyToMatch");
        int i8 = this.f25302a;
        try {
            if (m() != 6) {
                return null;
            }
            if (!kotlin.jvm.internal.q.b(z7 ? k() : t(), keyToMatch)) {
                return null;
            }
            if (m() != 5) {
                return null;
            }
            return z7 ? q() : t();
        } finally {
            this.f25302a = i8;
        }
    }

    @Override // o7.a
    public byte m() {
        byte bA;
        String strC = C();
        do {
            int i8 = this.f25302a;
            if (i8 == -1 || i8 >= strC.length()) {
                return (byte) 10;
            }
            int i9 = this.f25302a;
            this.f25302a = i9 + 1;
            bA = b.a(strC.charAt(i9));
        } while (bA == 3);
        return bA;
    }

    @Override // o7.a
    public void o(char c8) {
        if (this.f25302a == -1) {
            N(c8);
        }
        String strC = C();
        while (this.f25302a < strC.length()) {
            int i8 = this.f25302a;
            this.f25302a = i8 + 1;
            char cCharAt = strC.charAt(i8);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt == c8) {
                    return;
                } else {
                    N(c8);
                }
            }
        }
        N(c8);
    }
}
