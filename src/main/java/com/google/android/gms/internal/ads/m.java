package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f11096a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f11097b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static l a(byte[] bArr) {
        return b(new cp2(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
        if (r11 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.l b(com.google.android.gms.internal.ads.cp2 r11, boolean r12) throws com.google.android.gms.internal.ads.yh0 {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m.b(com.google.android.gms.internal.ads.cp2, boolean):com.google.android.gms.internal.ads.l");
    }

    private static int c(cp2 cp2Var) {
        int iD = cp2Var.d(5);
        return iD == 31 ? cp2Var.d(6) + 32 : iD;
    }

    private static int d(cp2 cp2Var) throws yh0 {
        int iD = cp2Var.d(4);
        if (iD == 15) {
            if (cp2Var.a() >= 24) {
                return cp2Var.d(24);
            }
            throw yh0.a("AAC header insufficient data", null);
        }
        if (iD < 13) {
            return f11096a[iD];
        }
        throw yh0.a("AAC header wrong Sampling Frequency Index", null);
    }
}
