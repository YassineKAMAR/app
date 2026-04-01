package com.google.android.gms.internal.ads;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class pp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f12969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f12970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f12971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f12972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f12973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f12974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f12975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[] f12976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f12977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f12978l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f12979m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f12980n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f12981o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f12982p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f12983q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f12984r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f12985s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f12986t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f12987u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f12988v;

    public pp1(int i8, int i9, float f8, float f9, int i10) {
        this.f12967a = i8;
        this.f12968b = i9;
        this.f12969c = f8;
        this.f12970d = f9;
        this.f12971e = i8 / i10;
        this.f12972f = i8 / RCHTTPStatusCodes.BAD_REQUEST;
        int i11 = i8 / 65;
        this.f12973g = i11;
        int i12 = i11 + i11;
        this.f12974h = i12;
        this.f12975i = new short[i12];
        int i13 = i12 * i9;
        this.f12976j = new short[i13];
        this.f12978l = new short[i13];
        this.f12980n = new short[i13];
    }

    private final int g(short[] sArr, int i8, int i9, int i10) {
        int i11 = 1;
        int i12 = 255;
        int i13 = 0;
        int i14 = 0;
        while (i9 <= i10) {
            int iAbs = 0;
            for (int i15 = 0; i15 < i9; i15++) {
                int i16 = this.f12968b * i8;
                iAbs += Math.abs(sArr[i16 + i15] - sArr[(i16 + i9) + i15]);
            }
            int i17 = iAbs * i13;
            int i18 = i11 * i9;
            if (i17 < i18) {
                i11 = iAbs;
            }
            if (i17 < i18) {
                i13 = i9;
            }
            int i19 = iAbs * i12;
            int i20 = i14 * i9;
            if (i19 > i20) {
                i14 = iAbs;
            }
            if (i19 > i20) {
                i12 = i9;
            }
            i9++;
        }
        this.f12987u = i11 / i13;
        this.f12988v = i14 / i12;
        return i13;
    }

    private final void h(short[] sArr, int i8, int i9) {
        short[] sArrL = l(this.f12978l, this.f12979m, i9);
        this.f12978l = sArrL;
        int i10 = this.f12979m;
        int i11 = this.f12968b;
        System.arraycopy(sArr, i8 * i11, sArrL, i10 * i11, i9 * i11);
        this.f12979m += i9;
    }

    private final void i(short[] sArr, int i8, int i9) {
        int i10;
        for (int i11 = 0; i11 < this.f12974h / i9; i11++) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int i14 = this.f12968b;
                i10 = i14 * i9;
                if (i12 < i10) {
                    i13 += sArr[(i14 * i8) + (i10 * i11) + i12];
                    i12++;
                }
            }
            this.f12975i[i11] = (short) (i13 / i10);
        }
    }

    private static void j(int i8, int i9, short[] sArr, int i10, short[] sArr2, int i11, short[] sArr3, int i12) {
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = (i11 * i9) + i13;
            int i15 = (i12 * i9) + i13;
            int i16 = (i10 * i9) + i13;
            for (int i17 = 0; i17 < i8; i17++) {
                sArr[i16] = (short) (((sArr2[i14] * (i8 - i17)) + (sArr3[i15] * i17)) / i8);
                i16 += i9;
                i14 += i9;
                i15 += i9;
            }
        }
    }

    private final void k() {
        int iG;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f8 = this.f12969c / this.f12970d;
        double d8 = f8;
        int i15 = this.f12979m;
        if (d8 > 1.00001d || d8 < 0.99999d) {
            int i16 = this.f12977k;
            if (i16 >= this.f12974h) {
                int i17 = 0;
                do {
                    int i18 = this.f12984r;
                    if (i18 > 0) {
                        int iMin = Math.min(this.f12974h, i18);
                        h(this.f12976j, i17, iMin);
                        this.f12984r -= iMin;
                        i17 += iMin;
                    } else {
                        short[] sArr = this.f12976j;
                        int i19 = this.f12967a;
                        int i20 = i19 > 4000 ? i19 / 4000 : 1;
                        if (this.f12968b == 1 && i20 == 1) {
                            iG = g(sArr, i17, this.f12972f, this.f12973g);
                        } else {
                            i(sArr, i17, i20);
                            int iG2 = g(this.f12975i, 0, this.f12972f / i20, this.f12973g / i20);
                            if (i20 != 1) {
                                int i21 = iG2 * i20;
                                int i22 = i20 * 4;
                                int i23 = this.f12972f;
                                int i24 = i21 - i22;
                                if (i24 >= i23) {
                                    i23 = i24;
                                }
                                int i25 = i21 + i22;
                                int i26 = this.f12973g;
                                if (i25 > i26) {
                                    i25 = i26;
                                }
                                if (this.f12968b == 1) {
                                    iG = g(sArr, i17, i23, i25);
                                } else {
                                    i(sArr, i17, 1);
                                    iG = g(this.f12975i, 0, i23, i25);
                                }
                            } else {
                                iG = iG2;
                            }
                        }
                        int i27 = this.f12987u;
                        int i28 = (i27 == 0 || (i10 = this.f12985s) == 0 || this.f12988v > i27 * 3 || i27 + i27 <= this.f12986t * 3) ? iG : i10;
                        int i29 = i17 + i28;
                        this.f12986t = i27;
                        this.f12985s = iG;
                        float f9 = i28;
                        if (d8 > 1.0d) {
                            short[] sArr2 = this.f12976j;
                            float f10 = (-1.0f) + f8;
                            if (f8 >= 2.0f) {
                                i9 = (int) (f9 / f10);
                            } else {
                                this.f12984r = (int) ((f9 * (2.0f - f8)) / f10);
                                i9 = i28;
                            }
                            short[] sArrL = l(this.f12978l, this.f12979m, i9);
                            this.f12978l = sArrL;
                            int i30 = i9;
                            j(i9, this.f12968b, sArrL, this.f12979m, sArr2, i17, sArr2, i29);
                            this.f12979m += i30;
                            i17 += i28 + i30;
                        } else {
                            int i31 = i28;
                            short[] sArr3 = this.f12976j;
                            float f11 = 1.0f - f8;
                            if (f8 < 0.5f) {
                                i8 = (int) ((f9 * f8) / f11);
                            } else {
                                this.f12984r = (int) ((f9 * ((f8 + f8) - 1.0f)) / f11);
                                i8 = i31;
                            }
                            int i32 = i31 + i8;
                            short[] sArrL2 = l(this.f12978l, this.f12979m, i32);
                            this.f12978l = sArrL2;
                            int i33 = this.f12968b;
                            System.arraycopy(sArr3, i17 * i33, sArrL2, this.f12979m * i33, i33 * i31);
                            j(i8, this.f12968b, this.f12978l, this.f12979m + i31, sArr3, i29, sArr3, i17);
                            this.f12979m += i32;
                            i17 += i8;
                        }
                    }
                } while (this.f12974h + i17 <= i16);
                int i34 = this.f12977k - i17;
                short[] sArr4 = this.f12976j;
                int i35 = this.f12968b;
                System.arraycopy(sArr4, i17 * i35, sArr4, 0, i35 * i34);
                this.f12977k = i34;
            }
        } else {
            h(this.f12976j, 0, this.f12977k);
            this.f12977k = 0;
        }
        float f12 = this.f12971e * this.f12970d;
        if (f12 == 1.0f || this.f12979m == i15) {
            return;
        }
        int i36 = this.f12967a;
        int i37 = (int) (i36 / f12);
        while (true) {
            if (i37 <= 16384 && i36 <= 16384) {
                break;
            }
            i37 /= 2;
            i36 /= 2;
        }
        int i38 = this.f12979m - i15;
        short[] sArrL3 = l(this.f12980n, this.f12981o, i38);
        this.f12980n = sArrL3;
        short[] sArr5 = this.f12978l;
        int i39 = this.f12968b;
        System.arraycopy(sArr5, i15 * i39, sArrL3, this.f12981o * i39, i39 * i38);
        this.f12979m = i15;
        this.f12981o += i38;
        int i40 = 0;
        while (true) {
            i11 = this.f12981o;
            i12 = i11 - 1;
            if (i40 >= i12) {
                break;
            }
            while (true) {
                i13 = this.f12982p + 1;
                int i41 = i13 * i37;
                i14 = this.f12983q;
                if (i41 <= i14 * i36) {
                    break;
                }
                this.f12978l = l(this.f12978l, this.f12979m, 1);
                int i42 = 0;
                while (true) {
                    int i43 = this.f12968b;
                    if (i42 < i43) {
                        short[] sArr6 = this.f12978l;
                        int i44 = this.f12979m * i43;
                        short[] sArr7 = this.f12980n;
                        int i45 = (i40 * i43) + i42;
                        short s8 = sArr7[i45];
                        short s9 = sArr7[i45 + i43];
                        int i46 = this.f12983q * i36;
                        int i47 = this.f12982p;
                        int i48 = i47 * i37;
                        int i49 = (i47 + 1) * i37;
                        int i50 = i49 - i46;
                        int i51 = i49 - i48;
                        sArr6[i44 + i42] = (short) (((s8 * i50) + ((i51 - i50) * s9)) / i51);
                        i42++;
                    }
                }
                this.f12983q++;
                this.f12979m++;
            }
            this.f12982p = i13;
            if (i13 == i36) {
                this.f12982p = 0;
                uu1.f(i14 == i37);
                this.f12983q = 0;
            }
            i40++;
        }
        if (i12 != 0) {
            short[] sArr8 = this.f12980n;
            int i52 = this.f12968b;
            System.arraycopy(sArr8, i12 * i52, sArr8, 0, (i11 - i12) * i52);
            this.f12981o -= i12;
        }
    }

    private final short[] l(short[] sArr, int i8, int i9) {
        int length = sArr.length;
        int i10 = this.f12968b;
        int i11 = length / i10;
        return i8 + i9 <= i11 ? sArr : Arrays.copyOf(sArr, (((i11 * 3) / 2) + i9) * i10);
    }

    public final int a() {
        int i8 = this.f12979m * this.f12968b;
        return i8 + i8;
    }

    public final int b() {
        int i8 = this.f12977k * this.f12968b;
        return i8 + i8;
    }

    public final void c() {
        this.f12977k = 0;
        this.f12979m = 0;
        this.f12981o = 0;
        this.f12982p = 0;
        this.f12983q = 0;
        this.f12984r = 0;
        this.f12985s = 0;
        this.f12986t = 0;
        this.f12987u = 0;
        this.f12988v = 0;
    }

    public final void d(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f12968b, this.f12979m);
        shortBuffer.put(this.f12978l, 0, this.f12968b * iMin);
        int i8 = this.f12979m - iMin;
        this.f12979m = i8;
        int i9 = this.f12968b;
        short[] sArr = this.f12978l;
        System.arraycopy(sArr, iMin * i9, sArr, 0, i8 * i9);
    }

    public final void e() {
        int i8;
        int i9 = this.f12977k;
        int i10 = this.f12979m;
        float f8 = this.f12981o;
        float f9 = this.f12969c;
        float f10 = this.f12971e;
        float f11 = this.f12970d;
        int i11 = i10 + ((int) ((((i9 / (f9 / f11)) + f8) / (f10 * f11)) + 0.5f));
        int i12 = this.f12974h;
        this.f12976j = l(this.f12976j, i9, i12 + i12 + i9);
        int i13 = 0;
        while (true) {
            int i14 = this.f12974h;
            int i15 = this.f12968b;
            i8 = i14 + i14;
            if (i13 >= i8 * i15) {
                break;
            }
            this.f12976j[(i15 * i9) + i13] = 0;
            i13++;
        }
        this.f12977k += i8;
        k();
        if (this.f12979m > i11) {
            this.f12979m = i11;
        }
        this.f12977k = 0;
        this.f12984r = 0;
        this.f12981o = 0;
    }

    public final void f(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i8 = this.f12968b;
        int i9 = iRemaining / i8;
        int i10 = i8 * i9;
        short[] sArrL = l(this.f12976j, this.f12977k, i9);
        this.f12976j = sArrL;
        shortBuffer.get(sArrL, this.f12977k * this.f12968b, (i10 + i10) / 2);
        this.f12977k += i9;
        k();
    }
}
