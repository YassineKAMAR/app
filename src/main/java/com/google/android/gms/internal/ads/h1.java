package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f8596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f8597g;

    private h1(List list, int i8, int i9, int i10, int i11, int i12, int i13, float f8, String str) {
        this.f8591a = list;
        this.f8592b = i8;
        this.f8593c = i11;
        this.f8594d = i12;
        this.f8595e = i13;
        this.f8596f = f8;
        this.f8597g = str;
    }

    public static h1 a(dq2 dq2Var) throws yh0 {
        int i8;
        int i9;
        int i10;
        try {
            dq2Var.h(21);
            int iU = dq2Var.u() & 3;
            int iU2 = dq2Var.u();
            int iL = dq2Var.l();
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < iU2; i13++) {
                dq2Var.h(1);
                int iY = dq2Var.y();
                for (int i14 = 0; i14 < iY; i14++) {
                    int iY2 = dq2Var.y();
                    i12 += iY2 + 4;
                    dq2Var.h(iY2);
                }
            }
            dq2Var.g(iL);
            byte[] bArr = new byte[i12];
            String strB = null;
            int i15 = 0;
            int i16 = 0;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            float f8 = 1.0f;
            while (i15 < iU2) {
                int iU3 = dq2Var.u() & 63;
                int iY3 = dq2Var.y();
                int i22 = 0;
                while (i22 < iY3) {
                    int iY4 = dq2Var.y();
                    int i23 = iU2;
                    System.arraycopy(sd3.f14624a, i11, bArr, i16, 4);
                    int i24 = i16 + 4;
                    System.arraycopy(dq2Var.i(), dq2Var.l(), bArr, i24, iY4);
                    int i25 = i24 + iY4;
                    if (iU3 == 33 && i22 == 0) {
                        qa3 qa3VarC = sd3.c(bArr, i24 + 2, i25);
                        i17 = qa3VarC.f13377g;
                        i18 = qa3VarC.f13378h;
                        i19 = qa3VarC.f13380j;
                        int i26 = qa3VarC.f13381k;
                        int i27 = qa3VarC.f13382l;
                        float f9 = qa3VarC.f13379i;
                        i8 = i25;
                        i9 = iU3;
                        i10 = iY3;
                        strB = ww1.b(qa3VarC.f13371a, qa3VarC.f13372b, qa3VarC.f13373c, qa3VarC.f13374d, qa3VarC.f13375e, qa3VarC.f13376f);
                        f8 = f9;
                        i20 = i26;
                        i21 = i27;
                        i22 = 0;
                    } else {
                        i8 = i25;
                        i9 = iU3;
                        i10 = iY3;
                    }
                    dq2Var.h(iY4);
                    i22++;
                    iU2 = i23;
                    i16 = i8;
                    iU3 = i9;
                    iY3 = i10;
                    i11 = 0;
                }
                i15++;
                i11 = 0;
            }
            return new h1(i12 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iU + 1, i17, i18, i19, i20, i21, f8, strB);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw yh0.a("Error parsing HEVC config", e8);
        }
    }
}
