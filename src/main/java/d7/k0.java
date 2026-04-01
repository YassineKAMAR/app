package d7;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k0 {
    public static final int a(String str, int i8, int i9, int i10) {
        return (int) i0.c(str, i8, i9, i10);
    }

    public static final long b(String str, long j8, long j9, long j10) {
        String strD = i0.d(str);
        if (strD == null) {
            return j8;
        }
        Long lK = w6.u.k(strD);
        if (lK == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strD + '\'').toString());
        }
        long jLongValue = lK.longValue();
        boolean z7 = false;
        if (j9 <= jLongValue && jLongValue <= j10) {
            z7 = true;
        }
        if (z7) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j9 + ".." + j10 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final String c(String str, String str2) {
        String strD = i0.d(str);
        return strD == null ? str2 : strD;
    }

    public static final boolean d(String str, boolean z7) {
        String strD = i0.d(str);
        return strD != null ? Boolean.parseBoolean(strD) : z7;
    }

    public static /* synthetic */ int e(String str, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i9 = 1;
        }
        if ((i11 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return i0.b(str, i8, i9, i10);
    }

    public static /* synthetic */ long f(String str, long j8, long j9, long j10, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            j9 = 1;
        }
        long j11 = j9;
        if ((i8 & 8) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return i0.c(str, j8, j11, j10);
    }
}
