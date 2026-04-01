package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class da extends y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f19915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final la f19917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final ja f19918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ia f19919g;

    da(w5 w5Var) {
        super(w5Var);
        this.f19916d = true;
        this.f19917e = new la(this);
        this.f19918f = new ja(this);
        this.f19919g = new ia(this);
    }

    static /* synthetic */ void C(da daVar, long j8) {
        daVar.i();
        daVar.G();
        daVar.t().K().b("Activity paused, time", Long.valueOf(j8));
        daVar.f19919g.b(j8);
        if (daVar.a().Q()) {
            daVar.f19918f.e(j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        i();
        if (this.f19915c == null) {
            this.f19915c = new com.google.android.gms.internal.measurement.r1(Looper.getMainLooper());
        }
    }

    static /* synthetic */ void I(da daVar, long j8) {
        daVar.i();
        daVar.G();
        daVar.t().K().b("Activity resumed, time", Long.valueOf(j8));
        if (!daVar.a().q(e0.Q0) ? daVar.a().Q() || daVar.e().f20713s.b() : daVar.a().Q() || daVar.f19916d) {
            daVar.f19918f.f(j8);
        }
        daVar.f19919g.a();
        la laVar = daVar.f19917e;
        laVar.f20209a.i();
        if (laVar.f20209a.f20556a.m()) {
            laVar.b(laVar.f20209a.k().a(), false);
        }
    }

    @Override // com.google.android.gms.measurement.internal.y2
    protected final boolean A() {
        return false;
    }

    final void D(boolean z7) {
        i();
        this.f19916d = z7;
    }

    public final boolean E(boolean z7, boolean z8, long j8) {
        return this.f19918f.d(z7, z8, j8);
    }

    final boolean F() {
        i();
        return this.f19916d;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e3.e k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ x l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ i4 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ l4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ b7 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ o8 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ v8 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ da s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 u() {
        return super.u();
    }
}
