package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class u82 implements g2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e41 f15558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z41 f15559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jc1 f15560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ac1 f15561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ew0 f15562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AtomicBoolean f15563f = new AtomicBoolean(false);

    u82(e41 e41Var, z41 z41Var, jc1 jc1Var, ac1 ac1Var, ew0 ew0Var) {
        this.f15558a = e41Var;
        this.f15559b = z41Var;
        this.f15560c = jc1Var;
        this.f15561d = ac1Var;
        this.f15562e = ew0Var;
    }

    @Override // g2.f
    public final synchronized void a(View view) {
        if (this.f15563f.compareAndSet(false, true)) {
            this.f15562e.z();
            this.f15561d.A0(view);
        }
    }

    @Override // g2.f
    public final void k() {
        if (this.f15563f.get()) {
            this.f15558a.Z();
        }
    }

    @Override // g2.f
    public final void l() {
        if (this.f15563f.get()) {
            this.f15559b.j();
            this.f15560c.j();
        }
    }
}
