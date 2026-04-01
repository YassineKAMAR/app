package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class pq4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vd4[] f12996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iq4[] f12997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ed1 f12998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f12999e;

    public pq4(vd4[] vd4VarArr, iq4[] iq4VarArr, ed1 ed1Var, Object obj) {
        this.f12996b = vd4VarArr;
        this.f12997c = (iq4[]) iq4VarArr.clone();
        this.f12998d = ed1Var;
        this.f12999e = obj;
        this.f12995a = vd4VarArr.length;
    }

    public final boolean a(pq4 pq4Var, int i8) {
        return pq4Var != null && nz2.e(this.f12996b[i8], pq4Var.f12996b[i8]) && nz2.e(this.f12997c[i8], pq4Var.f12997c[i8]);
    }

    public final boolean b(int i8) {
        return this.f12996b[i8] != null;
    }
}
