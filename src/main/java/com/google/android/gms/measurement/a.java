package com.google.android.gms.measurement;

import a3.o;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.b7;
import com.google.android.gms.measurement.internal.w5;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class a extends AppMeasurement.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w5 f19756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b7 f19757b;

    public a(w5 w5Var) {
        super();
        o.j(w5Var);
        this.f19756a = w5Var;
        this.f19757b = w5Var.H();
    }

    @Override // p3.c0
    public final int a(String str) {
        o.f(str);
        return 25;
    }

    @Override // p3.c0
    public final void b(String str, String str2, Bundle bundle) {
        this.f19756a.H().V(str, str2, bundle);
    }

    @Override // p3.c0
    public final void c(String str) {
        this.f19756a.y().z(str, this.f19756a.k().b());
    }

    @Override // p3.c0
    public final List<Bundle> d(String str, String str2) {
        return this.f19757b.C(str, str2);
    }

    @Override // p3.c0
    public final void e(String str) {
        this.f19756a.y().D(str, this.f19756a.k().b());
    }

    @Override // p3.c0
    public final void f(Bundle bundle) {
        this.f19757b.u0(bundle);
    }

    @Override // p3.c0
    public final Map<String, Object> g(String str, String str2, boolean z7) {
        return this.f19757b.D(str, str2, z7);
    }

    @Override // p3.c0
    public final void h(String str, String str2, Bundle bundle) {
        this.f19757b.x0(str, str2, bundle);
    }

    @Override // p3.c0
    public final long j() {
        return this.f19756a.L().P0();
    }

    @Override // p3.c0
    public final String n() {
        return this.f19757b.i0();
    }

    @Override // p3.c0
    public final String o() {
        return this.f19757b.k0();
    }

    @Override // p3.c0
    public final String q() {
        return this.f19757b.j0();
    }

    @Override // p3.c0
    public final String r() {
        return this.f19757b.i0();
    }
}
