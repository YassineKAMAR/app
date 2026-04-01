package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class y22 implements x22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x22 f17566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z73 f17567b;

    public y22(x22 x22Var, z73 z73Var) {
        this.f17566a = x22Var;
        this.f17567b = z73Var;
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final x3.d a(ks2 ks2Var, wr2 wr2Var) {
        return zf3.m(this.f17566a.a(ks2Var, wr2Var), this.f17567b, eh0.f7322a);
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final boolean b(ks2 ks2Var, wr2 wr2Var) {
        return this.f17566a.b(ks2Var, wr2Var);
    }
}
