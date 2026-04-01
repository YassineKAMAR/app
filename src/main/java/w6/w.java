package w6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class w extends v {

    static final class a extends kotlin.jvm.internal.r implements p6.p<CharSequence, Integer, e6.r<? extends Integer, ? extends Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<String> f27161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f27162b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<String> list, boolean z7) {
            super(2);
            this.f27161a = list;
            this.f27162b = z7;
        }

        public final e6.r<Integer, Integer> a(CharSequence $receiver, int i8) {
            kotlin.jvm.internal.q.f($receiver, "$this$$receiver");
            e6.r rVarC = w.C($receiver, this.f27161a, i8, this.f27162b, false);
            if (rVarC != null) {
                return e6.x.a(rVarC.c(), Integer.valueOf(((String) rVarC.d()).length()));
            }
            return null;
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ e6.r<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    static final class b extends kotlin.jvm.internal.r implements p6.l<t6.f, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f27163a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence) {
            super(1);
            this.f27163a = charSequence;
        }

        @Override // p6.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(t6.f it) {
            kotlin.jvm.internal.q.f(it, "it");
            return w.g0(this.f27163a, it);
        }
    }

    public static final boolean A(CharSequence charSequence, char c8, boolean z7) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        return charSequence.length() > 0 && c.d(charSequence.charAt(E(charSequence)), c8, z7);
    }

    public static /* synthetic */ boolean B(CharSequence charSequence, char c8, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return A(charSequence, c8, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        return e6.x.a(java.lang.Integer.valueOf(r12), r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final e6.r<java.lang.Integer, java.lang.String> C(java.lang.CharSequence r10, java.util.Collection<java.lang.String> r11, int r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.w.C(java.lang.CharSequence, java.util.Collection, int, boolean, boolean):e6.r");
    }

    public static final t6.f D(CharSequence charSequence) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        return new t6.f(0, charSequence.length() - 1);
    }

    public static int E(CharSequence charSequence) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int F(CharSequence charSequence, char c8, int i8, boolean z7) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        return (z7 || !(charSequence instanceof String)) ? L(charSequence, new char[]{c8}, i8, z7) : ((String) charSequence).indexOf(c8, i8);
    }

    public static final int G(CharSequence charSequence, String string, int i8, boolean z7) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        kotlin.jvm.internal.q.f(string, "string");
        return (z7 || !(charSequence instanceof String)) ? I(charSequence, string, i8, charSequence.length(), z7, false, 16, null) : ((String) charSequence).indexOf(string, i8);
    }

    private static final int H(CharSequence charSequence, CharSequence charSequence2, int i8, int i9, boolean z7, boolean z8) {
        t6.d fVar = !z8 ? new t6.f(t6.l.b(i8, 0), t6.l.d(i9, charSequence.length())) : t6.l.h(t6.l.d(i8, E(charSequence)), t6.l.b(i9, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iA = fVar.a();
            int iE = fVar.e();
            int iG = fVar.g();
            if ((iG <= 0 || iA > iE) && (iG >= 0 || iE > iA)) {
                return -1;
            }
            while (!v.q((String) charSequence2, 0, (String) charSequence, iA, charSequence2.length(), z7)) {
                if (iA == iE) {
                    return -1;
                }
                iA += iG;
            }
            return iA;
        }
        int iA2 = fVar.a();
        int iE2 = fVar.e();
        int iG2 = fVar.g();
        if ((iG2 <= 0 || iA2 > iE2) && (iG2 >= 0 || iE2 > iA2)) {
            return -1;
        }
        while (!X(charSequence2, 0, charSequence, iA2, charSequence2.length(), z7)) {
            if (iA2 == iE2) {
                return -1;
            }
            iA2 += iG2;
        }
        return iA2;
    }

    static /* synthetic */ int I(CharSequence charSequence, CharSequence charSequence2, int i8, int i9, boolean z7, boolean z8, int i10, Object obj) {
        return H(charSequence, charSequence2, i8, i9, z7, (i10 & 16) != 0 ? false : z8);
    }

    public static /* synthetic */ int J(CharSequence charSequence, char c8, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return F(charSequence, c8, i8, z7);
    }

    public static /* synthetic */ int K(CharSequence charSequence, String str, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return G(charSequence, str, i8, z7);
    }

    public static final int L(CharSequence charSequence, char[] chars, int i8, boolean z7) {
        boolean z8;
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        kotlin.jvm.internal.q.f(chars, "chars");
        if (!z7 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(f6.j.z(chars), i8);
        }
        f6.e0 e0VarI = new t6.f(t6.l.b(i8, 0), E(charSequence)).iterator();
        while (e0VarI.hasNext()) {
            int iNextInt = e0VarI.nextInt();
            char cCharAt = charSequence.charAt(iNextInt);
            int length = chars.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    z8 = false;
                    break;
                }
                if (c.d(chars[i9], cCharAt, z7)) {
                    z8 = true;
                    break;
                }
                i9++;
            }
            if (z8) {
                return iNextInt;
            }
        }
        return -1;
    }

    public static final int M(CharSequence charSequence, char c8, int i8, boolean z7) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        return (z7 || !(charSequence instanceof String)) ? Q(charSequence, new char[]{c8}, i8, z7) : ((String) charSequence).lastIndexOf(c8, i8);
    }

    public static final int N(CharSequence charSequence, String string, int i8, boolean z7) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        kotlin.jvm.internal.q.f(string, "string");
        return (z7 || !(charSequence instanceof String)) ? H(charSequence, string, i8, 0, z7, true) : ((String) charSequence).lastIndexOf(string, i8);
    }

    public static /* synthetic */ int O(CharSequence charSequence, char c8, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = E(charSequence);
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return M(charSequence, c8, i8, z7);
    }

    public static /* synthetic */ int P(CharSequence charSequence, String str, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = E(charSequence);
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return N(charSequence, str, i8, z7);
    }

    public static final int Q(CharSequence charSequence, char[] chars, int i8, boolean z7) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        kotlin.jvm.internal.q.f(chars, "chars");
        if (!z7 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(f6.j.z(chars), i8);
        }
        for (int iD = t6.l.d(i8, E(charSequence)); -1 < iD; iD--) {
            char cCharAt = charSequence.charAt(iD);
            int length = chars.length;
            boolean z8 = false;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (c.d(chars[i9], cCharAt, z7)) {
                    z8 = true;
                    break;
                }
                i9++;
            }
            if (z8) {
                return iD;
            }
        }
        return -1;
    }

    public static final v6.b<String> R(CharSequence charSequence) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        return d0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> S(CharSequence charSequence) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        return v6.h.e(R(charSequence));
    }

    public static final CharSequence T(CharSequence charSequence, int i8, char c8) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException("Desired length " + i8 + " is less than zero.");
        }
        if (i8 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i8);
        f6.e0 e0VarI = new t6.f(1, i8 - charSequence.length()).iterator();
        while (e0VarI.hasNext()) {
            e0VarI.nextInt();
            sb.append(c8);
        }
        sb.append(charSequence);
        return sb;
    }

    public static String U(String str, int i8, char c8) {
        kotlin.jvm.internal.q.f(str, "<this>");
        return T(str, i8, c8).toString();
    }

    private static final v6.b<t6.f> V(CharSequence charSequence, String[] strArr, int i8, boolean z7, int i9) {
        Y(i9);
        return new e(charSequence, i8, i9, new a(f6.i.c(strArr), z7));
    }

    static /* synthetic */ v6.b W(CharSequence charSequence, String[] strArr, int i8, boolean z7, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            z7 = false;
        }
        if ((i10 & 8) != 0) {
            i9 = 0;
        }
        return V(charSequence, strArr, i8, z7, i9);
    }

    public static final boolean X(CharSequence charSequence, int i8, CharSequence other, int i9, int i10, boolean z7) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        kotlin.jvm.internal.q.f(other, "other");
        if (i9 < 0 || i8 < 0 || i8 > charSequence.length() - i10 || i9 > other.length() - i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!c.d(charSequence.charAt(i8 + i11), other.charAt(i9 + i11), z7)) {
                return false;
            }
        }
        return true;
    }

    public static final void Y(int i8) {
        if (i8 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i8).toString());
    }

    public static final List<String> Z(CharSequence charSequence, String[] delimiters, boolean z7, int i8) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        kotlin.jvm.internal.q.f(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (!(str.length() == 0)) {
                return a0(charSequence, str, z7, i8);
            }
        }
        Iterable iterableC = v6.h.c(W(charSequence, delimiters, 0, z7, i8, 2, null));
        ArrayList arrayList = new ArrayList(f6.p.m(iterableC, 10));
        Iterator it = iterableC.iterator();
        while (it.hasNext()) {
            arrayList.add(g0(charSequence, (t6.f) it.next()));
        }
        return arrayList;
    }

    private static final List<String> a0(CharSequence charSequence, String str, boolean z7, int i8) {
        Y(i8);
        int length = 0;
        int iG = G(charSequence, str, 0, z7);
        if (iG == -1 || i8 == 1) {
            return f6.n.b(charSequence.toString());
        }
        boolean z8 = i8 > 0;
        ArrayList arrayList = new ArrayList(z8 ? t6.l.d(i8, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iG).toString());
            length = str.length() + iG;
            if (z8 && arrayList.size() == i8 - 1) {
                break;
            }
            iG = G(charSequence, str, length, z7);
        } while (iG != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List b0(CharSequence charSequence, String[] strArr, boolean z7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z7 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return Z(charSequence, strArr, z7, i8);
    }

    public static final v6.b<String> c0(CharSequence charSequence, String[] delimiters, boolean z7, int i8) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        kotlin.jvm.internal.q.f(delimiters, "delimiters");
        return v6.h.d(W(charSequence, delimiters, 0, z7, i8, 2, null), new b(charSequence));
    }

    public static /* synthetic */ v6.b d0(CharSequence charSequence, String[] strArr, boolean z7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z7 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return c0(charSequence, strArr, z7, i8);
    }

    public static final boolean e0(CharSequence charSequence, char c8, boolean z7) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        return charSequence.length() > 0 && c.d(charSequence.charAt(0), c8, z7);
    }

    public static /* synthetic */ boolean f0(CharSequence charSequence, char c8, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return e0(charSequence, c8, z7);
    }

    public static final String g0(CharSequence charSequence, t6.f range) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        kotlin.jvm.internal.q.f(range, "range");
        return charSequence.subSequence(range.v().intValue(), range.u().intValue() + 1).toString();
    }

    public static final String h0(String str, char c8, String missingDelimiterValue) {
        kotlin.jvm.internal.q.f(str, "<this>");
        kotlin.jvm.internal.q.f(missingDelimiterValue, "missingDelimiterValue");
        int iJ = J(str, c8, 0, false, 6, null);
        if (iJ == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iJ + 1, str.length());
        kotlin.jvm.internal.q.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final String i0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.q.f(str, "<this>");
        kotlin.jvm.internal.q.f(delimiter, "delimiter");
        kotlin.jvm.internal.q.f(missingDelimiterValue, "missingDelimiterValue");
        int iK = K(str, delimiter, 0, false, 6, null);
        if (iK == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iK + delimiter.length(), str.length());
        kotlin.jvm.internal.q.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String j0(String str, char c8, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return h0(str, c8, str2);
    }

    public static /* synthetic */ String k0(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str3 = str;
        }
        return i0(str, str2, str3);
    }

    public static final String l0(String str, char c8, String missingDelimiterValue) {
        kotlin.jvm.internal.q.f(str, "<this>");
        kotlin.jvm.internal.q.f(missingDelimiterValue, "missingDelimiterValue");
        int iO = O(str, c8, 0, false, 6, null);
        if (iO == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iO + 1, str.length());
        kotlin.jvm.internal.q.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String m0(String str, char c8, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return l0(str, c8, str2);
    }

    public static final String n0(String str, char c8, String missingDelimiterValue) {
        kotlin.jvm.internal.q.f(str, "<this>");
        kotlin.jvm.internal.q.f(missingDelimiterValue, "missingDelimiterValue");
        int iJ = J(str, c8, 0, false, 6, null);
        if (iJ == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iJ);
        kotlin.jvm.internal.q.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final String o0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.q.f(str, "<this>");
        kotlin.jvm.internal.q.f(delimiter, "delimiter");
        kotlin.jvm.internal.q.f(missingDelimiterValue, "missingDelimiterValue");
        int iK = K(str, delimiter, 0, false, 6, null);
        if (iK == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iK);
        kotlin.jvm.internal.q.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String p0(String str, char c8, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return n0(str, c8, str2);
    }

    public static /* synthetic */ String q0(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str3 = str;
        }
        return o0(str, str2, str3);
    }

    public static CharSequence r0(CharSequence charSequence) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i8 = 0;
        boolean z7 = false;
        while (i8 <= length) {
            boolean zC = w6.b.c(charSequence.charAt(!z7 ? i8 : length));
            if (z7) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i8++;
            } else {
                z7 = true;
            }
        }
        return charSequence.subSequence(i8, length + 1);
    }

    public static final boolean w(CharSequence charSequence, char c8, boolean z7) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        return J(charSequence, c8, 0, z7, 2, null) >= 0;
    }

    public static final boolean x(CharSequence charSequence, CharSequence other, boolean z7) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        kotlin.jvm.internal.q.f(other, "other");
        if (other instanceof String) {
            if (K(charSequence, (String) other, 0, z7, 2, null) >= 0) {
                return true;
            }
        } else if (I(charSequence, other, 0, charSequence.length(), z7, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean y(CharSequence charSequence, char c8, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return w(charSequence, c8, z7);
    }

    public static /* synthetic */ boolean z(CharSequence charSequence, CharSequence charSequence2, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return x(charSequence, charSequence2, z7);
    }
}
