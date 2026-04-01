package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class lq4 extends oq4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kq4 f10948c;

    @Override // com.google.android.gms.internal.ads.oq4
    public final pq4 e(ud4[] ud4VarArr, to4 to4Var, tm4 tm4Var, s11 s11Var) {
        boolean z7;
        int[] iArr;
        int[] iArr2 = new int[3];
        u31[][] u31VarArr = new u31[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i8 = 0; i8 < 3; i8++) {
            int i9 = to4Var.f15203a;
            u31VarArr[i8] = new u31[i9];
            iArr3[i8] = new int[i9][];
        }
        int i10 = 2;
        int[] iArr4 = new int[2];
        for (int i11 = 0; i11 < 2; i11++) {
            iArr4[i11] = ud4VarArr[i11].m();
        }
        int i12 = 0;
        while (i12 < to4Var.f15203a) {
            u31 u31VarB = to4Var.b(i12);
            int i13 = u31VarB.f15467c;
            int i14 = 0;
            int i15 = 2;
            int i16 = 0;
            boolean z8 = true;
            while (i14 < i10) {
                ud4 ud4Var = ud4VarArr[i14];
                int iMax = 0;
                for (int i17 = 0; i17 <= 0; i17++) {
                    iMax = Math.max(iMax, ud4Var.o(u31VarB.b(i17)) & 7);
                }
                boolean z9 = iArr2[i14] == 0;
                if (iMax > i16) {
                    z8 = z9;
                    i15 = i14;
                    i16 = iMax;
                } else if (iMax == i16 && i13 == 5 && !z8 && z9) {
                    i15 = i14;
                    i16 = iMax;
                    z8 = true;
                }
                i14++;
                i10 = 2;
            }
            if (i15 == i10) {
                iArr = new int[1];
            } else {
                ud4 ud4Var2 = ud4VarArr[i15];
                int[] iArr5 = new int[1];
                for (int i18 = 0; i18 <= 0; i18++) {
                    iArr5[i18] = ud4Var2.o(u31VarB.b(i18));
                }
                iArr = iArr5;
            }
            int i19 = iArr2[i15];
            u31VarArr[i15][i19] = u31VarB;
            iArr3[i15][i19] = iArr;
            iArr2[i15] = i19 + 1;
            i12++;
            i10 = 2;
        }
        to4[] to4VarArr = new to4[i10];
        String[] strArr = new String[i10];
        int[] iArr6 = new int[i10];
        int i20 = 0;
        while (i20 < i10) {
            int i21 = iArr2[i20];
            to4VarArr[i20] = new to4((u31[]) nz2.j(u31VarArr[i20], i21));
            iArr3[i20] = (int[][]) nz2.j(iArr3[i20], i21);
            strArr[i20] = ud4VarArr[i20].c();
            iArr6[i20] = ud4VarArr[i20].k();
            i20++;
            i10 = 2;
        }
        kq4 kq4Var = new kq4(strArr, iArr6, to4VarArr, iArr4, iArr3, new to4((u31[]) nz2.j(u31VarArr[2], iArr2[2])));
        Pair pairJ = j(kq4Var, iArr3, iArr4, tm4Var, s11Var);
        mq4[] mq4VarArr = (mq4[]) pairJ.second;
        List[] listArr = new List[mq4VarArr.length];
        for (int i22 = 0; i22 < mq4VarArr.length; i22++) {
            mq4 mq4Var = mq4VarArr[i22];
            listArr[i22] = mq4Var != null ? jb3.A(mq4Var) : jb3.z();
        }
        gb3 gb3Var = new gb3();
        for (int i23 = 0; i23 < 2; i23++) {
            to4 to4VarD = kq4Var.d(i23);
            List list = listArr[i23];
            for (int i24 = 0; i24 < to4VarD.f15203a; i24++) {
                u31 u31VarB2 = to4VarD.b(i24);
                boolean z10 = kq4Var.a(i23, i24, false) != 0;
                int i25 = u31VarB2.f15465a;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i26 = 0; i26 <= 0; i26++) {
                    iArr7[i26] = kq4Var.b(i23, i24, i26) & 7;
                    int i27 = 0;
                    while (true) {
                        if (i27 >= list.size()) {
                            z7 = false;
                            break;
                        }
                        mq4 mq4Var2 = (mq4) list.get(i27);
                        if (mq4Var2.m().equals(u31VarB2) && mq4Var2.d(i26) != -1) {
                            z7 = true;
                            break;
                        }
                        i27++;
                    }
                    zArr[i26] = z7;
                }
                gb3Var.g(new dc1(u31VarB2, z10, iArr7, zArr));
            }
        }
        to4 to4VarE = kq4Var.e();
        for (int i28 = 0; i28 < to4VarE.f15203a; i28++) {
            u31 u31VarB3 = to4VarE.b(i28);
            int i29 = u31VarB3.f15465a;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            gb3Var.g(new dc1(u31VarB3, false, iArr8, new boolean[1]));
        }
        return new pq4((vd4[]) pairJ.first, (iq4[]) pairJ.second, new ed1(gb3Var.j()), kq4Var);
    }

    @Override // com.google.android.gms.internal.ads.oq4
    public final void f(Object obj) {
        this.f10948c = (kq4) obj;
    }

    protected abstract Pair j(kq4 kq4Var, int[][][] iArr, int[] iArr2, tm4 tm4Var, s11 s11Var);
}
