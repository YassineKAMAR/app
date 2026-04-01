package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kv0 implements j41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final as2 f10360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ks2 f10361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fz2 f10362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jz2 f10363d;

    public kv0(ks2 ks2Var, jz2 jz2Var, fz2 fz2Var) {
        this.f10361b = ks2Var;
        this.f10363d = jz2Var;
        this.f10362c = fz2Var;
        this.f10360a = ks2Var.f10323b.f9793b;
    }

    @Override // com.google.android.gms.internal.ads.j41
    public final void A(h2.z2 z2Var) {
        List list = this.f10360a.f5461a;
        this.f10363d.d(this.f10362c.c(this.f10361b, null, list));
    }
}
