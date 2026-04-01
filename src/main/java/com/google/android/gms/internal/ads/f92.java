package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class f92 implements g2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g2.f f7675a;

    @Override // g2.f
    public final synchronized void a(View view) {
        g2.f fVar = this.f7675a;
        if (fVar != null) {
            fVar.a(view);
        }
    }

    public final synchronized void b(g2.f fVar) {
        this.f7675a = fVar;
    }

    @Override // g2.f
    public final synchronized void k() {
        g2.f fVar = this.f7675a;
        if (fVar != null) {
            fVar.k();
        }
    }

    @Override // g2.f
    public final synchronized void l() {
        g2.f fVar = this.f7675a;
        if (fVar != null) {
            fVar.l();
        }
    }
}
