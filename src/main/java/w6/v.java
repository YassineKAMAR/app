package w6;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class v extends u {
    public static final boolean m(String str, String suffix, boolean z7) {
        kotlin.jvm.internal.q.f(str, "<this>");
        kotlin.jvm.internal.q.f(suffix, "suffix");
        return !z7 ? str.endsWith(suffix) : q(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean n(String str, String str2, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return m(str, str2, z7);
    }

    public static boolean o(String str, String str2, boolean z7) {
        return str == null ? str2 == null : !z7 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean p(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.q.f(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L3e
            t6.f r0 = w6.w.D(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L20
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L20
        L1e:
            r4 = 1
            goto L3c
        L20:
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1e
            r3 = r0
            f6.e0 r3 = (f6.e0) r3
            int r3 = r3.nextInt()
            char r3 = r4.charAt(r3)
            boolean r3 = w6.b.c(r3)
            if (r3 != 0) goto L24
            r4 = 0
        L3c:
            if (r4 == 0) goto L3f
        L3e:
            r1 = 1
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.v.p(java.lang.CharSequence):boolean");
    }

    public static boolean q(String str, int i8, String other, int i9, int i10, boolean z7) {
        kotlin.jvm.internal.q.f(str, "<this>");
        kotlin.jvm.internal.q.f(other, "other");
        return !z7 ? str.regionMatches(i8, other, i9, i10) : str.regionMatches(z7, i8, other, i9, i10);
    }

    public static final String r(String str, String oldValue, String newValue, boolean z7) {
        kotlin.jvm.internal.q.f(str, "<this>");
        kotlin.jvm.internal.q.f(oldValue, "oldValue");
        kotlin.jvm.internal.q.f(newValue, "newValue");
        int i8 = 0;
        int iG = w.G(str, oldValue, 0, z7);
        if (iG < 0) {
            return str;
        }
        int length = oldValue.length();
        int iB = t6.l.b(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i8, iG);
            sb.append(newValue);
            i8 = iG + length;
            if (iG >= str.length()) {
                break;
            }
            iG = w.G(str, oldValue, iG + iB, z7);
        } while (iG > 0);
        sb.append((CharSequence) str, i8, str.length());
        String string = sb.toString();
        kotlin.jvm.internal.q.e(string, "stringBuilder.append(this, i, length).toString()");
        return string;
    }

    public static /* synthetic */ String s(String str, String str2, String str3, boolean z7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return r(str, str2, str3, z7);
    }

    public static final boolean t(String str, String prefix, boolean z7) {
        kotlin.jvm.internal.q.f(str, "<this>");
        kotlin.jvm.internal.q.f(prefix, "prefix");
        return !z7 ? str.startsWith(prefix) : q(str, 0, prefix, 0, prefix.length(), z7);
    }

    public static /* synthetic */ boolean u(String str, String str2, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return t(str, str2, z7);
    }
}
