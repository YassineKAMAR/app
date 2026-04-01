package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bp4 extends dp4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wq4 f5918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final jb3 f5919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final vv1 f5920h;

    protected bp4(u31 u31Var, int[] iArr, int i8, wq4 wq4Var, long j8, long j9, long j10, int i9, int i10, float f8, float f9, List list, vv1 vv1Var) {
        super(u31Var, iArr, 0);
        this.f5918f = wq4Var;
        this.f5919g = jb3.x(list);
        this.f5920h = vv1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* bridge */ /* synthetic */ jb3 a(hq4[] hq4VarArr) {
        int i8;
        int i9;
        ArrayList arrayList = new ArrayList();
        char c8 = 0;
        int i10 = 0;
        while (true) {
            i8 = 2;
            i9 = 1;
            if (i10 >= 2) {
                break;
            }
            hq4 hq4Var = hq4VarArr[i10];
            if (hq4Var == null || hq4Var.f8893b.length <= 1) {
                arrayList.add(null);
            } else {
                gb3 gb3Var = new gb3();
                gb3Var.g(new zo4(0L, 0L));
                arrayList.add(gb3Var);
            }
            i10++;
        }
        long[][] jArr = new long[2][];
        for (int i11 = 0; i11 < 2; i11++) {
            hq4 hq4Var2 = hq4VarArr[i11];
            if (hq4Var2 == null) {
                jArr[i11] = new long[0];
            } else {
                jArr[i11] = new long[hq4Var2.f8893b.length];
                int i12 = 0;
                while (true) {
                    int[] iArr = hq4Var2.f8893b;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    long j8 = hq4Var2.f8892a.b(iArr[i12]).f11789h;
                    long[] jArr2 = jArr[i11];
                    if (j8 == -1) {
                        j8 = 0;
                    }
                    jArr2[i12] = j8;
                    i12++;
                }
                Arrays.sort(jArr[i11]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i13 = 0; i13 < 2; i13++) {
            long[] jArr4 = jArr[i13];
            jArr3[i13] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        c(arrayList, jArr3);
        vb3 vb3VarC = nc3.b(tc3.c()).b(2).c();
        int i14 = 0;
        while (i14 < i8) {
            int length = jArr[i14].length;
            if (length > i9) {
                double[] dArr = new double[length];
                int i15 = 0;
                while (true) {
                    long[] jArr5 = jArr[i14];
                    double dLog = 0.0d;
                    if (i15 >= jArr5.length) {
                        break;
                    }
                    long j9 = jArr5[i15];
                    if (j9 != -1) {
                        dLog = Math.log(j9);
                    }
                    dArr[i15] = dLog;
                    i15++;
                }
                int i16 = length - 1;
                double d8 = dArr[i16] - dArr[c8];
                int i17 = 0;
                while (i17 < i16) {
                    double d9 = dArr[i17];
                    i17++;
                    vb3VarC.a(Double.valueOf(d8 == 0.0d ? 1.0d : (((d9 + dArr[i17]) * 0.5d) - dArr[c8]) / d8), Integer.valueOf(i14));
                    c8 = 0;
                }
            }
            i14++;
            c8 = 0;
            i8 = 2;
            i9 = 1;
        }
        jb3 jb3VarX = jb3.x(vb3VarC.B());
        for (int i18 = 0; i18 < jb3VarX.size(); i18++) {
            int iIntValue = ((Integer) jb3VarX.get(i18)).intValue();
            int i19 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i19;
            jArr3[iIntValue] = jArr[iIntValue][i19];
            c(arrayList, jArr3);
        }
        for (int i20 = 0; i20 < 2; i20++) {
            if (arrayList.get(i20) != null) {
                long j10 = jArr3[i20];
                jArr3[i20] = j10 + j10;
            }
        }
        c(arrayList, jArr3);
        gb3 gb3Var2 = new gb3();
        for (int i21 = 0; i21 < arrayList.size(); i21++) {
            gb3 gb3Var3 = (gb3) arrayList.get(i21);
            gb3Var2.g(gb3Var3 == null ? jb3.z() : gb3Var3.j());
        }
        return gb3Var2.j();
    }

    private static void c(List list, long[] jArr) {
        long j8 = 0;
        for (int i8 = 0; i8 < 2; i8++) {
            j8 += jArr[i8];
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            gb3 gb3Var = (gb3) list.get(i9);
            if (gb3Var != null) {
                gb3Var.g(new zo4(j8, jArr[i9]));
            }
        }
    }
}
