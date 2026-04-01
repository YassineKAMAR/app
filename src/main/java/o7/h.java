package o7;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h {
    public static /* synthetic */ String a(long j8, int i8) {
        if (j8 == 0) {
            return "0";
        }
        if (j8 > 0) {
            return Long.toString(j8, i8);
        }
        if (i8 < 2 || i8 > 36) {
            i8 = 10;
        }
        int i9 = 64;
        char[] cArr = new char[64];
        int i10 = i8 - 1;
        if ((i8 & i10) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i8);
            do {
                i9--;
                cArr[i9] = Character.forDigit(((int) j8) & i10, i8);
                j8 >>>= iNumberOfTrailingZeros;
            } while (j8 != 0);
        } else {
            long jA = (i8 & 1) == 0 ? (j8 >>> 1) / ((long) (i8 >>> 1)) : w6.b0.a(j8, i8);
            long j9 = i8;
            i9 = 63;
            cArr[63] = Character.forDigit((int) (j8 - (jA * j9)), i8);
            while (jA > 0) {
                i9--;
                cArr[i9] = Character.forDigit((int) (jA % j9), i8);
                jA /= j9;
            }
        }
        return new String(cArr, i9, 64 - i9);
    }
}
