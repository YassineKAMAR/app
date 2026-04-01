package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rp4 extends z71 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f14275q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f14276r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f14277s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f14278t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f14279u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f14280v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final SparseArray f14281w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final SparseBooleanArray f14282x;

    @Deprecated
    public rp4() {
        this.f14281w = new SparseArray();
        this.f14282x = new SparseBooleanArray();
        v();
    }

    public rp4(Context context) {
        super.d(context);
        Point pointF = nz2.F(context);
        e(pointF.x, pointF.y, true);
        this.f14281w = new SparseArray();
        this.f14282x = new SparseBooleanArray();
        v();
    }

    /* synthetic */ rp4(tp4 tp4Var, qp4 qp4Var) {
        super(tp4Var);
        this.f14275q = tp4Var.f15223h0;
        this.f14276r = tp4Var.f15225j0;
        this.f14277s = tp4Var.f15227l0;
        this.f14278t = tp4Var.f15232q0;
        this.f14279u = tp4Var.f15233r0;
        this.f14280v = tp4Var.f15235t0;
        SparseArray sparseArray = tp4Var.f15236u0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i8 = 0; i8 < sparseArray.size(); i8++) {
            sparseArray2.put(sparseArray.keyAt(i8), new HashMap((Map) sparseArray.valueAt(i8)));
        }
        this.f14281w = sparseArray2;
        this.f14282x = tp4Var.f15237v0.clone();
    }

    private final void v() {
        this.f14275q = true;
        this.f14276r = true;
        this.f14277s = true;
        this.f14278t = true;
        this.f14279u = true;
        this.f14280v = true;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final /* synthetic */ z71 e(int i8, int i9, boolean z7) {
        super.e(i8, i9, true);
        return this;
    }

    public final rp4 o(int i8, boolean z7) {
        if (this.f14282x.get(i8) == z7) {
            return this;
        }
        if (z7) {
            this.f14282x.put(i8, true);
        } else {
            this.f14282x.delete(i8);
        }
        return this;
    }
}
