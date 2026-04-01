package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class cz0 implements v51, tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wr2 f6511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z41 f6512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f61 f6513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f6514d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f6515e = new AtomicBoolean();

    public cz0(wr2 wr2Var, z41 z41Var, f61 f61Var) {
        this.f6511a = wr2Var;
        this.f6512b = z41Var;
        this.f6513c = f61Var;
    }

    private final void a() {
        if (this.f6514d.compareAndSet(false, true)) {
            this.f6512b.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.v51
    public final synchronized void B() {
        if (this.f6511a.f16875f != 1) {
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void b0(sk skVar) {
        if (this.f6511a.f16875f == 1 && skVar.f14729j) {
            a();
        }
        if (skVar.f14729j && this.f6515e.compareAndSet(false, true)) {
            this.f6513c.j();
        }
    }
}
