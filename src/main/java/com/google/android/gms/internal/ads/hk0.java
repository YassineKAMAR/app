package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class hk0 extends j2.b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj0 f8800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final pk0 f8801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f8802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String[] f8803f;

    hk0(dj0 dj0Var, pk0 pk0Var, String str, String[] strArr) {
        this.f8800c = dj0Var;
        this.f8801d = pk0Var;
        this.f8802e = str;
        this.f8803f = strArr;
        g2.t.A().e(this);
    }

    @Override // j2.b0
    public final void a() {
        try {
            this.f8801d.v(this.f8802e, this.f8803f);
        } finally {
            j2.k2.f23991k.post(new gk0(this));
        }
    }

    @Override // j2.b0
    public final x3.d b() {
        return (((Boolean) h2.y.c().b(ns.U1)).booleanValue() && (this.f8801d instanceof yk0)) ? eh0.f7326e.Z(new Callable() { // from class: com.google.android.gms.internal.ads.fk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f7786a.d();
            }
        }) : super.b();
    }

    final /* synthetic */ Boolean d() {
        return Boolean.valueOf(this.f8801d.w(this.f8802e, this.f8803f, this));
    }

    public final String e() {
        return this.f8802e;
    }
}
