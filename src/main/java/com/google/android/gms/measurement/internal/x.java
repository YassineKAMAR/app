package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x extends z3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Long> f20654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Integer> f20655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f20656d;

    public x(w5 w5Var) {
        super(w5Var);
        this.f20655c = new p.a();
        this.f20654b = new p.a();
    }

    private final void A(String str, long j8, p8 p8Var) {
        if (p8Var == null) {
            t().K().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j8 < 1000) {
            t().K().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j8));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j8);
        ib.W(p8Var, bundle, true);
        o().z0("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(long j8) {
        Iterator<String> it = this.f20654b.keySet().iterator();
        while (it.hasNext()) {
            this.f20654b.put(it.next(), Long.valueOf(j8));
        }
        if (this.f20654b.isEmpty()) {
            return;
        }
        this.f20656d = j8;
    }

    static /* synthetic */ void C(x xVar, String str, long j8) {
        xVar.i();
        a3.o.f(str);
        Integer num = xVar.f20655c.get(str);
        if (num == null) {
            xVar.t().G().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        p8 p8VarC = xVar.q().C(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            xVar.f20655c.put(str, Integer.valueOf(iIntValue));
            return;
        }
        xVar.f20655c.remove(str);
        Long l8 = xVar.f20654b.get(str);
        if (l8 == null) {
            xVar.t().G().a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j8 - l8.longValue();
            xVar.f20654b.remove(str);
            xVar.A(str, jLongValue, p8VarC);
        }
        if (xVar.f20655c.isEmpty()) {
            long j9 = xVar.f20656d;
            if (j9 == 0) {
                xVar.t().G().a("First ad exposure time was never set");
            } else {
                xVar.w(j8 - j9, p8VarC);
                xVar.f20656d = 0L;
            }
        }
    }

    private final void w(long j8, p8 p8Var) {
        if (p8Var == null) {
            t().K().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j8 < 1000) {
            t().K().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j8));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j8);
        ib.W(p8Var, bundle, true);
        o().z0("am", "_xa", bundle);
    }

    static /* synthetic */ void y(x xVar, String str, long j8) {
        xVar.i();
        a3.o.f(str);
        if (xVar.f20655c.isEmpty()) {
            xVar.f20656d = j8;
        }
        Integer num = xVar.f20655c.get(str);
        if (num != null) {
            xVar.f20655c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (xVar.f20655c.size() >= 100) {
            xVar.t().L().a("Too many ads visible");
        } else {
            xVar.f20655c.put(str, 1);
            xVar.f20654b.put(str, Long.valueOf(j8));
        }
    }

    public final void D(String str, long j8) {
        if (str == null || str.length() == 0) {
            t().G().a("Ad unit id must be a non-empty string");
        } else {
            u().D(new x1(this, str, j8));
        }
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

    public final void v(long j8) {
        p8 p8VarC = q().C(false);
        for (String str : this.f20654b.keySet()) {
            A(str, j8 - this.f20654b.get(str).longValue(), p8VarC);
        }
        if (!this.f20654b.isEmpty()) {
            w(j8 - this.f20656d, p8VarC);
        }
        B(j8);
    }

    public final void z(String str, long j8) {
        if (str == null || str.length() == 0) {
            t().G().a("Ad unit id must be a non-empty string");
        } else {
            u().D(new a(this, str, j8));
        }
    }
}
