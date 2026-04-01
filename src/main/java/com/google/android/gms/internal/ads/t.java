package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f14891h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f14892i;

    private t(List list, int i8, int i9, int i10, int i11, int i12, int i13, float f8, String str) {
        this.f14884a = list;
        this.f14885b = i8;
        this.f14886c = i9;
        this.f14887d = i10;
        this.f14888e = i11;
        this.f14889f = i12;
        this.f14890g = i13;
        this.f14891h = f8;
        this.f14892i = str;
    }

    public static t a(dq2 dq2Var) throws yh0 {
        String strA;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f8;
        try {
            dq2Var.h(4);
            int iU = (dq2Var.u() & 3) + 1;
            if (iU == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iU2 = dq2Var.u() & 31;
            for (int i13 = 0; i13 < iU2; i13++) {
                arrayList.add(b(dq2Var));
            }
            int iU3 = dq2Var.u();
            for (int i14 = 0; i14 < iU3; i14++) {
                arrayList.add(b(dq2Var));
            }
            if (iU2 > 0) {
                rc3 rc3VarE = sd3.e((byte[]) arrayList.get(0), iU + 1, ((byte[]) arrayList.get(0)).length);
                int i15 = rc3VarE.f14057e;
                int i16 = rc3VarE.f14058f;
                int i17 = rc3VarE.f14060h;
                int i18 = rc3VarE.f14061i;
                int i19 = rc3VarE.f14062j;
                float f9 = rc3VarE.f14059g;
                strA = ww1.a(rc3VarE.f14053a, rc3VarE.f14054b, rc3VarE.f14055c);
                i11 = i18;
                i12 = i19;
                f8 = f9;
                i8 = i15;
                i9 = i16;
                i10 = i17;
            } else {
                strA = null;
                i8 = -1;
                i9 = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                f8 = 1.0f;
            }
            return new t(arrayList, iU, i8, i9, i10, i11, i12, f8, strA);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw yh0.a("Error parsing AVC config", e8);
        }
    }

    private static byte[] b(dq2 dq2Var) {
        int iY = dq2Var.y();
        int iL = dq2Var.l();
        dq2Var.h(iY);
        return ww1.c(dq2Var.i(), iL, iY);
    }
}
