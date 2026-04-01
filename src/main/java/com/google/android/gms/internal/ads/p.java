package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f12679a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f12680b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f12681c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f12682d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f12683e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f12684f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f12685g = 0;

    public static int a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f12679a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int b(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b8 = bArr[4];
            return f((b8 & 192) >> 6, b8 & 63);
        }
        int i8 = bArr[2] & 7;
        int i9 = ((bArr[3] & 255) | (i8 << 8)) + 1;
        return i9 + i9;
    }

    public static nb c(dq2 dq2Var, String str, String str2, e2 e2Var) {
        cp2 cp2Var = new cp2();
        cp2Var.h(dq2Var);
        int i8 = f12680b[cp2Var.d(2)];
        cp2Var.l(8);
        int i9 = f12682d[cp2Var.d(3)];
        if (cp2Var.d(1) != 0) {
            i9++;
        }
        int i10 = f12683e[cp2Var.d(5)] * 1000;
        cp2Var.e();
        dq2Var.g(cp2Var.b());
        l9 l9Var = new l9();
        l9Var.j(str);
        l9Var.u("audio/ac3");
        l9Var.k0(i9);
        l9Var.v(i8);
        l9Var.d(e2Var);
        l9Var.m(str2);
        l9Var.j0(i10);
        l9Var.q(i10);
        return l9Var.D();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.nb d(com.google.android.gms.internal.ads.dq2 r7, java.lang.String r8, java.lang.String r9, com.google.android.gms.internal.ads.e2 r10) {
        /*
            com.google.android.gms.internal.ads.cp2 r0 = new com.google.android.gms.internal.ads.cp2
            r0.<init>()
            r0.h(r7)
            r1 = 13
            int r1 = r0.d(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.l(r2)
            r3 = 2
            int r3 = r0.d(r3)
            int[] r4 = com.google.android.gms.internal.ads.p.f12680b
            r3 = r4[r3]
            r4 = 10
            r0.l(r4)
            int[] r4 = com.google.android.gms.internal.ads.p.f12682d
            int r5 = r0.d(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.d(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.l(r2)
            r2 = 4
            int r2 = r0.d(r2)
            r0.l(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.l(r2)
            int r2 = r0.d(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.l(r5)
        L4f:
            int r2 = r0.a()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.l(r6)
            int r2 = r0.d(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.e()
            int r0 = r0.b()
            r7.g(r0)
            com.google.android.gms.internal.ads.l9 r7 = new com.google.android.gms.internal.ads.l9
            r7.<init>()
            r7.j(r8)
            r7.u(r2)
            r7.k0(r4)
            r7.v(r3)
            r7.d(r10)
            r7.m(r9)
            r7.q(r1)
            com.google.android.gms.internal.ads.nb r7 = r7.D()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p.d(com.google.android.gms.internal.ads.dq2, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.e2):com.google.android.gms.internal.ads.nb");
    }

    public static o e(cp2 cp2Var) {
        String str;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iC = cp2Var.c();
        cp2Var.l(40);
        int iD = cp2Var.d(5);
        cp2Var.j(iC);
        int i19 = -1;
        if (iD > 10) {
            cp2Var.l(16);
            int iD2 = cp2Var.d(2);
            if (iD2 == 0) {
                i19 = 0;
            } else if (iD2 == 1) {
                i19 = 1;
            } else if (iD2 == 2) {
                i19 = 2;
            }
            cp2Var.l(3);
            int iD3 = cp2Var.d(11) + 1;
            int iD4 = cp2Var.d(2);
            if (iD4 == 3) {
                i15 = f12681c[cp2Var.d(2)];
                i14 = 3;
                i16 = 6;
            } else {
                int iD5 = cp2Var.d(2);
                int i20 = f12679a[iD5];
                i14 = iD5;
                i15 = f12680b[iD4];
                i16 = i20;
            }
            int i21 = iD3 + iD3;
            int i22 = (i21 * i15) / (i16 * 32);
            int iD6 = cp2Var.d(3);
            boolean zN = cp2Var.n();
            int i23 = f12682d[iD6] + (zN ? 1 : 0);
            cp2Var.l(10);
            if (cp2Var.n()) {
                cp2Var.l(8);
            }
            if (iD6 == 0) {
                cp2Var.l(5);
                if (cp2Var.n()) {
                    cp2Var.l(8);
                }
                i17 = 0;
                iD6 = 0;
            } else {
                i17 = iD6;
            }
            if (i19 == 1) {
                if (cp2Var.n()) {
                    cp2Var.l(16);
                }
                i18 = 1;
            } else {
                i18 = i19;
            }
            if (cp2Var.n()) {
                if (i17 > 2) {
                    cp2Var.l(2);
                }
                if ((i17 & 1) != 0 && i17 > 2) {
                    cp2Var.l(6);
                }
                if ((i17 & 4) != 0) {
                    cp2Var.l(6);
                }
                if (zN && cp2Var.n()) {
                    cp2Var.l(5);
                }
                if (i18 == 0) {
                    if (cp2Var.n()) {
                        cp2Var.l(6);
                    }
                    if (i17 == 0 && cp2Var.n()) {
                        cp2Var.l(6);
                    }
                    if (cp2Var.n()) {
                        cp2Var.l(6);
                    }
                    int iD7 = cp2Var.d(2);
                    if (iD7 == 1) {
                        cp2Var.l(5);
                    } else if (iD7 == 2) {
                        cp2Var.l(12);
                    } else if (iD7 == 3) {
                        int iD8 = cp2Var.d(5);
                        if (cp2Var.n()) {
                            cp2Var.l(5);
                            if (cp2Var.n()) {
                                cp2Var.l(4);
                            }
                            if (cp2Var.n()) {
                                cp2Var.l(4);
                            }
                            if (cp2Var.n()) {
                                cp2Var.l(4);
                            }
                            if (cp2Var.n()) {
                                cp2Var.l(4);
                            }
                            if (cp2Var.n()) {
                                cp2Var.l(4);
                            }
                            if (cp2Var.n()) {
                                cp2Var.l(4);
                            }
                            if (cp2Var.n()) {
                                cp2Var.l(4);
                            }
                            if (cp2Var.n()) {
                                if (cp2Var.n()) {
                                    cp2Var.l(4);
                                }
                                if (cp2Var.n()) {
                                    cp2Var.l(4);
                                }
                            }
                        }
                        if (cp2Var.n()) {
                            cp2Var.l(5);
                            if (cp2Var.n()) {
                                cp2Var.l(7);
                                if (cp2Var.n()) {
                                    cp2Var.l(8);
                                }
                            }
                        }
                        cp2Var.l((iD8 + 2) * 8);
                        cp2Var.e();
                    }
                    if (i17 < 2) {
                        if (cp2Var.n()) {
                            cp2Var.l(14);
                        }
                        if (iD6 == 0 && cp2Var.n()) {
                            cp2Var.l(14);
                        }
                    }
                    if (!cp2Var.n()) {
                        i18 = 0;
                    } else if (i14 == 0) {
                        cp2Var.l(5);
                        i18 = 0;
                        i14 = 0;
                    } else {
                        for (int i24 = 0; i24 < i16; i24++) {
                            if (cp2Var.n()) {
                                cp2Var.l(5);
                            }
                        }
                        i18 = 0;
                    }
                }
            }
            if (cp2Var.n()) {
                cp2Var.l(5);
                if (i17 == 2) {
                    cp2Var.l(4);
                    i17 = 2;
                }
                if (i17 >= 6) {
                    cp2Var.l(2);
                }
                if (cp2Var.n()) {
                    cp2Var.l(8);
                }
                if (i17 == 0 && cp2Var.n()) {
                    cp2Var.l(8);
                }
                if (iD4 < 3) {
                    cp2Var.k();
                }
            }
            if (i18 == 0 && i14 != 3) {
                cp2Var.k();
            }
            if (i18 == 2 && (i14 == 3 || cp2Var.n())) {
                cp2Var.l(6);
            }
            str = (cp2Var.n() && cp2Var.d(6) == 1 && cp2Var.d(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i12 = i19;
            i9 = i21;
            i10 = i15;
            i13 = i16 * 256;
            i8 = i22;
            i11 = i23;
        } else {
            cp2Var.l(32);
            int iD9 = cp2Var.d(2);
            String str2 = iD9 == 3 ? null : "audio/ac3";
            int iD10 = cp2Var.d(6);
            int i25 = f12683e[iD10 / 2] * 1000;
            int iF = f(iD9, iD10);
            cp2Var.l(8);
            int iD11 = cp2Var.d(3);
            if ((iD11 & 1) != 0 && iD11 != 1) {
                cp2Var.l(2);
            }
            if ((iD11 & 4) != 0) {
                cp2Var.l(2);
            }
            if (iD11 == 2) {
                cp2Var.l(2);
            }
            str = str2;
            i8 = i25;
            i9 = iF;
            i10 = iD9 < 3 ? f12680b[iD9] : -1;
            i11 = f12682d[iD11] + (cp2Var.n() ? 1 : 0);
            i12 = -1;
            i13 = 1536;
        }
        return new o(str, i12, i11, i10, i9, i13, i8, null);
    }

    private static int f(int i8, int i9) {
        int i10;
        if (i8 < 0 || i8 >= 3 || i9 < 0 || (i10 = i9 >> 1) >= 19) {
            return -1;
        }
        int i11 = f12680b[i8];
        if (i11 == 44100) {
            int i12 = f12684f[i10] + (i9 & 1);
            return i12 + i12;
        }
        int i13 = f12683e[i10];
        return i11 == 32000 ? i13 * 6 : i13 * 4;
    }
}
