package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q5 {
    public byte[] N;
    public x1 T;
    public boolean U;
    public w1 X;
    public int Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f13275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f13277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v1 f13278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f13279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e2 f13280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13281m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13282n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13283o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13284p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13285q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13286r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f13287s = 0.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f13288t = 0.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f13289u = 0.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f13290v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13291w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f13292x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13293y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f13294z = -1;
    public int A = -1;
    public int B = 1000;
    public int C = RCHTTPStatusCodes.SUCCESS;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public float M = -1.0f;
    public int O = 1;
    public int P = -1;
    public int Q = 8000;
    public long R = 0;
    public long S = 0;
    public boolean V = true;
    private String W = "eng";

    protected q5() {
    }

    private static Pair f(dq2 dq2Var) throws yh0 {
        try {
            dq2Var.h(16);
            long jA = dq2Var.A();
            if (jA == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jA == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jA != 826496599) {
                pf2.f("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iL = dq2Var.l() + 20;
            byte[] bArrI = dq2Var.i();
            while (true) {
                int length = bArrI.length;
                if (iL >= length - 4) {
                    throw yh0.a("Failed to find FourCC VC1 initialization data", null);
                }
                int i8 = iL + 1;
                if (bArrI[iL] == 0 && bArrI[i8] == 0 && bArrI[iL + 2] == 1 && bArrI[iL + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrI, iL, length)));
                }
                iL = i8;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw yh0.a("Error parsing FourCC private data", null);
        }
    }

    private static List g(byte[] bArr) throws yh0 {
        int i8;
        int i9;
        try {
            if (bArr[0] != 2) {
                throw yh0.a("Error parsing vorbis codec private", null);
            }
            int i10 = 1;
            int i11 = 0;
            while (true) {
                int i12 = bArr[i10];
                i10++;
                i8 = i12 & 255;
                if (i8 != 255) {
                    break;
                }
                i11 += 255;
            }
            int i13 = i11 + i8;
            int i14 = 0;
            while (true) {
                int i15 = bArr[i10];
                i10++;
                i9 = i15 & 255;
                if (i9 != 255) {
                    break;
                }
                i14 += 255;
            }
            int i16 = i14 + i9;
            if (bArr[i10] != 1) {
                throw yh0.a("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i13];
            System.arraycopy(bArr, i10, bArr2, 0, i13);
            int i17 = i10 + i13;
            if (bArr[i17] != 3) {
                throw yh0.a("Error parsing vorbis codec private", null);
            }
            int i18 = i17 + i16;
            if (bArr[i18] != 5) {
                throw yh0.a("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i18;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i18, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw yh0.a("Error parsing vorbis codec private", null);
        }
    }

    private static boolean h(dq2 dq2Var) throws yh0 {
        try {
            int iS = dq2Var.s();
            if (iS == 1) {
                return true;
            }
            if (iS == 65534) {
                dq2Var.g(24);
                if (dq2Var.B() == r5.f13905h0.getMostSignificantBits()) {
                    if (dq2Var.B() == r5.f13905h0.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw yh0.a("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] i(String str) throws yh0 {
        byte[] bArr = this.f13279k;
        if (bArr != null) {
            return bArr;
        }
        throw yh0.a("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x058c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.google.android.gms.internal.ads.s0 r21, int r22) throws com.google.android.gms.internal.ads.yh0 {
        /*
            Method dump skipped, instruction units count: 1690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q5.e(com.google.android.gms.internal.ads.s0, int):void");
    }
}
