package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l4 f11671a = new l4() { // from class: com.google.android.gms.internal.ads.k4
    };

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.android.gms.internal.ads.td0 a(byte[] r11, int r12, com.google.android.gms.internal.ads.l4 r13, com.google.android.gms.internal.ads.n3 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n4.a(byte[], int, com.google.android.gms.internal.ads.l4, com.google.android.gms.internal.ads.n3):com.google.android.gms.internal.ads.td0");
    }

    private static int b(int i8) {
        return (i8 == 0 || i8 == 3) ? 1 : 2;
    }

    private static int c(byte[] bArr, int i8, int i9) {
        int iD = d(bArr, i8);
        if (i9 == 0 || i9 == 3) {
            return iD;
        }
        while (true) {
            int length = bArr.length;
            if (iD >= length - 1) {
                return length;
            }
            int i10 = iD + 1;
            if ((iD - i8) % 2 == 0 && bArr[i10] == 0) {
                return iD;
            }
            iD = d(bArr, i10);
        }
    }

    private static int d(byte[] bArr, int i8) {
        while (true) {
            int length = bArr.length;
            if (i8 >= length) {
                return length;
            }
            if (bArr[i8] == 0) {
                return i8;
            }
            i8++;
        }
    }

    private static int e(dq2 dq2Var, int i8) {
        byte[] bArrI = dq2Var.i();
        int iL = dq2Var.l();
        int i9 = iL;
        while (true) {
            int i10 = i9 + 1;
            if (i10 >= iL + i8) {
                return i8;
            }
            if ((bArrI[i9] & 255) == 255 && bArrI[i10] == 0) {
                System.arraycopy(bArrI, i9 + 2, bArrI, i10, (i8 - (i9 - iL)) - 2);
                i8--;
            }
            i9 = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0279 A[Catch: all -> 0x0511, TryCatch #0 {all -> 0x0511, blocks: (B:221:0x04ec, B:122:0x0210, B:138:0x0267, B:140:0x0279, B:147:0x02ba, B:144:0x029b, B:146:0x02b4, B:159:0x02fc, B:168:0x0343, B:171:0x0378, B:174:0x0389, B:175:0x0391, B:177:0x0397, B:179:0x039e, B:180:0x03a2, B:187:0x03c4, B:191:0x03f1, B:193:0x03fb, B:194:0x042e, B:195:0x043a, B:197:0x0440, B:199:0x0447, B:200:0x044b, B:204:0x0460, B:213:0x048b, B:215:0x04b5, B:216:0x04c4, B:219:0x04db), top: B:233:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x029b A[Catch: all -> 0x0511, TryCatch #0 {all -> 0x0511, blocks: (B:221:0x04ec, B:122:0x0210, B:138:0x0267, B:140:0x0279, B:147:0x02ba, B:144:0x029b, B:146:0x02b4, B:159:0x02fc, B:168:0x0343, B:171:0x0378, B:174:0x0389, B:175:0x0391, B:177:0x0397, B:179:0x039e, B:180:0x03a2, B:187:0x03c4, B:191:0x03f1, B:193:0x03fb, B:194:0x042e, B:195:0x043a, B:197:0x0440, B:199:0x0447, B:200:0x044b, B:204:0x0460, B:213:0x048b, B:215:0x04b5, B:216:0x04c4, B:219:0x04db), top: B:233:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04ec A[Catch: all -> 0x0511, TRY_LEAVE, TryCatch #0 {all -> 0x0511, blocks: (B:221:0x04ec, B:122:0x0210, B:138:0x0267, B:140:0x0279, B:147:0x02ba, B:144:0x029b, B:146:0x02b4, B:159:0x02fc, B:168:0x0343, B:171:0x0378, B:174:0x0389, B:175:0x0391, B:177:0x0397, B:179:0x039e, B:180:0x03a2, B:187:0x03c4, B:191:0x03f1, B:193:0x03fb, B:194:0x042e, B:195:0x043a, B:197:0x0440, B:199:0x0447, B:200:0x044b, B:204:0x0460, B:213:0x048b, B:215:0x04b5, B:216:0x04c4, B:219:0x04db), top: B:233:0x00ed }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.o4 f(int r35, com.google.android.gms.internal.ads.dq2 r36, boolean r37, int r38, com.google.android.gms.internal.ads.l4 r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n4.f(int, com.google.android.gms.internal.ads.dq2, boolean, int, com.google.android.gms.internal.ads.l4):com.google.android.gms.internal.ads.o4");
    }

    private static jb3 g(byte[] bArr, int i8, int i9) {
        if (i9 >= bArr.length) {
            return jb3.A("");
        }
        gb3 gb3Var = new gb3();
        while (true) {
            int iC = c(bArr, i9, i8);
            if (i9 >= iC) {
                break;
            }
            gb3Var.g(new String(bArr, i9, iC - i9, j(i8)));
            i9 = b(i8) + iC;
        }
        jb3 jb3VarJ = gb3Var.j();
        return jb3VarJ.isEmpty() ? jb3.A("") : jb3VarJ;
    }

    private static String h(byte[] bArr, int i8, int i9, Charset charset) {
        return (i9 <= i8 || i9 > bArr.length) ? "" : new String(bArr, i8, i9 - i8, charset);
    }

    private static String i(int i8, int i9, int i10, int i11, int i12) {
        return i8 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    private static Charset j(int i8) {
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? x73.f17097b : x73.f17098c : x73.f17099d : x73.f17101f;
    }

    private static boolean k(dq2 dq2Var, int i8, int i9, boolean z7) {
        int iW;
        long jW;
        int iY;
        int i10;
        int iL = dq2Var.l();
        while (true) {
            try {
                if (dq2Var.j() < i9) {
                    return true;
                }
                if (i8 >= 3) {
                    iW = dq2Var.o();
                    jW = dq2Var.C();
                    iY = dq2Var.y();
                } else {
                    iW = dq2Var.w();
                    jW = dq2Var.w();
                    iY = 0;
                }
                if (iW == 0 && jW == 0 && iY == 0) {
                    return true;
                }
                if (i8 == 4 && !z7) {
                    if ((8421504 & jW) != 0) {
                        return false;
                    }
                    jW = ((jW >> 24) << 21) | (((jW >> 16) & 255) << 14) | (jW & 255) | (((jW >> 8) & 255) << 7);
                }
                if (i8 == 4) {
                    i = iY & 1;
                    i10 = (iY & 64) == 0 ? 0 : 1;
                } else {
                    if (i8 == 3) {
                        i10 = (iY & 32) != 0 ? 1 : 0;
                        if ((iY & 128) == 0) {
                        }
                    } else {
                        i10 = 0;
                    }
                    i = 0;
                }
                if (i != 0) {
                    i10 += 4;
                }
                if (jW < i10) {
                    return false;
                }
                if (dq2Var.j() < jW) {
                    return false;
                }
                dq2Var.h((int) jW);
            } finally {
                dq2Var.g(iL);
            }
        }
    }

    private static byte[] l(byte[] bArr, int i8, int i9) {
        return i9 <= i8 ? nz2.f12305f : Arrays.copyOfRange(bArr, i8, i9);
    }
}
