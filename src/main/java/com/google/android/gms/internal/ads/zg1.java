package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ww f18218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    tw f18219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    kx f18220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    gx f18221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    b20 f18222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final p.h f18223f = new p.h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final p.h f18224g = new p.h();

    public final zg1 a(tw twVar) {
        this.f18219b = twVar;
        return this;
    }

    public final zg1 b(ww wwVar) {
        this.f18218a = wwVar;
        return this;
    }

    public final zg1 c(String str, cx cxVar, zw zwVar) {
        this.f18223f.put(str, cxVar);
        if (zwVar != null) {
            this.f18224g.put(str, zwVar);
        }
        return this;
    }

    public final zg1 d(b20 b20Var) {
        this.f18222e = b20Var;
        return this;
    }

    public final zg1 e(gx gxVar) {
        this.f18221d = gxVar;
        return this;
    }

    public final zg1 f(kx kxVar) {
        this.f18220c = kxVar;
        return this;
    }

    public final bh1 g() {
        return new bh1(this);
    }
}
