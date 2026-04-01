package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class rd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e3.e f14064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j2.x1 f14065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final se0 f14066c;

    rd0(e3.e eVar, j2.x1 x1Var, se0 se0Var) {
        this.f14064a = eVar;
        this.f14065b = x1Var;
        this.f14066c = se0Var;
    }

    public final void a() {
        if (((Boolean) h2.y.c().b(ns.f12166q0)).booleanValue()) {
            this.f14066c.y();
        }
    }

    public final void b(int i8, long j8) {
        if (((Boolean) h2.y.c().b(ns.f12157p0)).booleanValue()) {
            return;
        }
        if (j8 - this.f14065b.n() < 0) {
            j2.v1.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) h2.y.c().b(ns.f12166q0)).booleanValue()) {
            this.f14065b.i(i8);
        } else {
            this.f14065b.i(-1);
        }
        this.f14065b.L(j8);
        a();
    }
}
