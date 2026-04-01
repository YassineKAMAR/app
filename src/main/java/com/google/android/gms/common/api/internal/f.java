package com.google.android.gms.common.api.internal;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p.b<z2.b<?>> f4858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f4859g;

    f(z2.e eVar, b bVar, x2.e eVar2) {
        super(eVar, eVar2);
        this.f4858f = new p.b<>();
        this.f4859g = bVar;
        this.f4813a.b("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, b bVar, z2.b<?> bVar2) {
        z2.e eVarC = LifecycleCallback.c(activity);
        f fVar = (f) eVarC.c("ConnectionlessLifecycleHelper", f.class);
        if (fVar == null) {
            fVar = new f(eVarC, bVar, x2.e.m());
        }
        a3.o.k(bVar2, "ApiKey cannot be null");
        fVar.f4858f.add(bVar2);
        bVar.c(fVar);
    }

    private final void v() {
        if (this.f4858f.isEmpty()) {
            return;
        }
        this.f4859g.c(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.b0, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.b0, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.f4859g.d(this);
    }

    @Override // com.google.android.gms.common.api.internal.b0
    protected final void m(x2.b bVar, int i8) {
        this.f4859g.F(bVar, i8);
    }

    @Override // com.google.android.gms.common.api.internal.b0
    protected final void n() {
        this.f4859g.a();
    }

    final p.b<z2.b<?>> t() {
        return this.f4858f;
    }
}
