package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class n82 implements q51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f11729a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a32 f11730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ jh0 f11731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ o82 f11732d;

    n82(o82 o82Var, a32 a32Var, jh0 jh0Var) {
        this.f11732d = o82Var;
        this.f11730b = a32Var;
        this.f11731c = jh0Var;
    }

    private final synchronized void a(h2.z2 z2Var) {
        int i8 = 1;
        if (true == ((Boolean) h2.y.c().b(ns.f12162p5)).booleanValue()) {
            i8 = 3;
        }
        this.f11731c.e(new b32(i8, z2Var));
    }

    @Override // com.google.android.gms.internal.ads.q51
    public final synchronized void A0(int i8, String str) {
        if (this.f11729a) {
            return;
        }
        this.f11729a = true;
        if (str == null) {
            str = o82.e(this.f11730b.f5000a, i8);
        }
        a(new h2.z2(i8, str, "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.q51
    public final synchronized void b(int i8) {
        if (this.f11729a) {
            return;
        }
        this.f11729a = true;
        a(new h2.z2(i8, o82.e(this.f11730b.f5000a, i8), "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.q51
    public final synchronized void p() {
        this.f11731c.d(null);
    }

    @Override // com.google.android.gms.internal.ads.q51
    public final synchronized void z0(h2.z2 z2Var) {
        if (this.f11729a) {
            return;
        }
        this.f11729a = true;
        a(z2Var);
    }
}
