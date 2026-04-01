package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ty0 extends jx0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final nx f15379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f15380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Executor f15381k;

    public ty0(mz0 mz0Var, nx nxVar, Runnable runnable, Executor executor) {
        super(mz0Var);
        this.f15379i = nxVar;
        this.f15380j = runnable;
        this.f15381k = executor;
    }

    static /* synthetic */ void o(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.nz0
    public final void b() {
        final ry0 ry0Var = new ry0(new AtomicReference(this.f15380j));
        this.f15381k.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.sy0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14860a.p(ry0Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jx0
    public final int h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.jx0
    public final View i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jx0
    public final h2.p2 j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jx0
    public final xr2 k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jx0
    public final xr2 l() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jx0
    public final void m() {
    }

    @Override // com.google.android.gms.internal.ads.jx0
    public final void n(ViewGroup viewGroup, h2.w4 w4Var) {
    }

    final /* synthetic */ void p(Runnable runnable) {
        try {
            if (this.f15379i.o0(g3.b.k3(runnable))) {
                return;
            }
            o(((ry0) runnable).f14374a);
        } catch (RemoteException unused) {
            o(((ry0) runnable).f14374a);
        }
    }
}
