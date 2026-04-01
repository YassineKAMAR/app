package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class r61 extends aa1 implements b51, h61 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wr2 f13948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f13949c;

    public r61(Set set, wr2 wr2Var) {
        super(set);
        this.f13949c = new AtomicBoolean();
        this.f13948b = wr2Var;
    }

    private final void k() {
        h2.y4 y4Var;
        if (((Boolean) h2.y.c().b(ns.C7)).booleanValue() && this.f13949c.compareAndSet(false, true) && (y4Var = this.f13948b.f16878g0) != null && y4Var.f22378a == 3) {
            z0(new z91() { // from class: com.google.android.gms.internal.ads.q61
                @Override // com.google.android.gms.internal.ads.z91
                public final void a(Object obj) {
                    this.f13304a.A0((t61) obj);
                }
            });
        }
    }

    final /* synthetic */ void A0(t61 t61Var) {
        t61Var.b(this.f13948b.f16878g0);
    }

    @Override // com.google.android.gms.internal.ads.h61
    public final void q() {
        if (this.f13948b.f16867b == 1) {
            k();
        }
    }

    @Override // com.google.android.gms.internal.ads.b51
    public final void z() {
        int i8 = this.f13948b.f16867b;
        if (i8 == 2 || i8 == 5 || i8 == 4 || i8 == 6 || i8 == 7) {
            k();
        }
    }
}
