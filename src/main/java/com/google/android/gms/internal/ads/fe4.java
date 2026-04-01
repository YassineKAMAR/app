package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class fe4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i6 f7737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f7738b;

    public fe4(i6 i6Var, SparseArray sparseArray) {
        this.f7737a = i6Var;
        SparseArray sparseArray2 = new SparseArray(i6Var.b());
        for (int i8 = 0; i8 < i6Var.b(); i8++) {
            int iA = i6Var.a(i8);
            ee4 ee4Var = (ee4) sparseArray.get(iA);
            ee4Var.getClass();
            sparseArray2.append(iA, ee4Var);
        }
        this.f7738b = sparseArray2;
    }

    public final int a(int i8) {
        return this.f7737a.a(i8);
    }

    public final int b() {
        return this.f7737a.b();
    }

    public final ee4 c(int i8) {
        ee4 ee4Var = (ee4) this.f7738b.get(i8);
        ee4Var.getClass();
        return ee4Var;
    }

    public final boolean d(int i8) {
        return this.f7737a.c(i8);
    }
}
