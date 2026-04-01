package w6;

import e6.f0;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {
    public static final byte a(String str) {
        kotlin.jvm.internal.q.f(str, "<this>");
        e6.y yVarB = b(str);
        if (yVarB != null) {
            return yVarB.h();
        }
        u.h(str);
        throw new e6.h();
    }

    public static final e6.y b(String str) {
        kotlin.jvm.internal.q.f(str, "<this>");
        return c(str, 10);
    }

    public static final e6.y c(String str, int i8) {
        kotlin.jvm.internal.q.f(str, "<this>");
        e6.a0 a0VarF = f(str, i8);
        if (a0VarF == null) {
            return null;
        }
        int iH = a0VarF.h();
        if (Integer.compare(iH ^ Integer.MIN_VALUE, e6.a0.c(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return e6.y.a(e6.y.c((byte) iH));
    }

    public static final int d(String str) {
        kotlin.jvm.internal.q.f(str, "<this>");
        e6.a0 a0VarE = e(str);
        if (a0VarE != null) {
            return a0VarE.h();
        }
        u.h(str);
        throw new e6.h();
    }

    public static final e6.a0 e(String str) {
        kotlin.jvm.internal.q.f(str, "<this>");
        return f(str, 10);
    }

    public static final e6.a0 f(String str, int i8) {
        kotlin.jvm.internal.q.f(str, "<this>");
        b.a(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char cCharAt = str.charAt(0);
        int i10 = 1;
        if (kotlin.jvm.internal.q.g(cCharAt, 48) >= 0) {
            i10 = 0;
        } else if (length == 1 || cCharAt != '+') {
            return null;
        }
        int iC = e6.a0.c(i8);
        int iA = 119304647;
        while (i10 < length) {
            int iB = b.b(str.charAt(i10), i8);
            if (iB < 0) {
                return null;
            }
            if (Integer.compare(i9 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                if (iA == 119304647) {
                    iA = c0.a(-1, iC);
                    if (Integer.compare(i9 ^ Integer.MIN_VALUE, iA ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iC2 = e6.a0.c(i9 * iC);
            int iC3 = e6.a0.c(e6.a0.c(iB) + iC2);
            if (Integer.compare(iC3 ^ Integer.MIN_VALUE, iC2 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i10++;
            i9 = iC3;
        }
        return e6.a0.a(i9);
    }

    public static final long g(String str) {
        kotlin.jvm.internal.q.f(str, "<this>");
        e6.c0 c0VarH = h(str);
        if (c0VarH != null) {
            return c0VarH.h();
        }
        u.h(str);
        throw new e6.h();
    }

    public static final e6.c0 h(String str) {
        kotlin.jvm.internal.q.f(str, "<this>");
        return i(str, 10);
    }

    public static final e6.c0 i(String str, int i8) {
        kotlin.jvm.internal.q.f(str, "<this>");
        b.a(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        long j8 = -1;
        int i9 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.q.g(cCharAt, 48) < 0) {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i9 = 1;
        }
        long jC = e6.c0.c(i8);
        long j9 = 0;
        long jA = 512409557603043100L;
        while (i9 < length) {
            int iB = b.b(str.charAt(i9), i8);
            if (iB < 0) {
                return null;
            }
            if (Long.compare(j9 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                if (jA == 512409557603043100L) {
                    jA = b0.a(j8, jC);
                    if (Long.compare(j9 ^ Long.MIN_VALUE, jA ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jC2 = e6.c0.c(j9 * jC);
            long jC3 = e6.c0.c(e6.c0.c(((long) e6.a0.c(iB)) & 4294967295L) + jC2);
            if (Long.compare(jC3 ^ Long.MIN_VALUE, jC2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i9++;
            j9 = jC3;
            j8 = -1;
        }
        return e6.c0.a(j9);
    }

    public static final short j(String str) {
        kotlin.jvm.internal.q.f(str, "<this>");
        f0 f0VarK = k(str);
        if (f0VarK != null) {
            return f0VarK.h();
        }
        u.h(str);
        throw new e6.h();
    }

    public static final f0 k(String str) {
        kotlin.jvm.internal.q.f(str, "<this>");
        return l(str, 10);
    }

    public static final f0 l(String str, int i8) {
        kotlin.jvm.internal.q.f(str, "<this>");
        e6.a0 a0VarF = f(str, i8);
        if (a0VarF == null) {
            return null;
        }
        int iH = a0VarF.h();
        if (Integer.compare(iH ^ Integer.MIN_VALUE, e6.a0.c(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return f0.a(f0.c((short) iH));
    }
}
