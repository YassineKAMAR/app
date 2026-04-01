package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class v8 extends y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s9 f20563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p3.i f20564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Boolean f20565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u f20566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final oa f20567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<Runnable> f20568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final u f20569i;

    protected v8(w5 w5Var) {
        super(w5Var);
        this.f20568h = new ArrayList();
        this.f20567g = new oa(w5Var.k());
        this.f20563c = new s9(this);
        this.f20566f = new y8(this, w5Var);
        this.f20569i = new h9(this, w5Var);
    }

    static /* synthetic */ void K(v8 v8Var, ComponentName componentName) {
        v8Var.i();
        if (v8Var.f20564d != null) {
            v8Var.f20564d = null;
            v8Var.t().K().b("Disconnected from device MeasurementService", componentName);
            v8Var.i();
            v8Var.Y();
        }
    }

    private final void N(Runnable runnable) {
        i();
        if (c0()) {
            runnable.run();
        } else {
            if (this.f20568h.size() >= 1000) {
                t().G().a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f20568h.add(runnable);
            this.f20569i.b(60000L);
            Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0() {
        i();
        t().K().b("Processing queued up service tasks", Integer.valueOf(this.f20568h.size()));
        Iterator<Runnable> it = this.f20568h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (RuntimeException e8) {
                t().G().b("Task exception while flushing queue", e8);
            }
        }
        this.f20568h.clear();
        this.f20569i.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        i();
        this.f20567g.c();
        this.f20566f.b(e0.L.a(null).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean h0() {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.v8.h0():boolean");
    }

    private final lb j0(boolean z7) {
        return m().B(z7 ? t().O() : null);
    }

    static /* synthetic */ void l0(v8 v8Var) {
        v8Var.i();
        if (v8Var.c0()) {
            v8Var.t().K().a("Inactivity, disconnecting from the service");
            v8Var.Z();
        }
    }

    @Override // com.google.android.gms.measurement.internal.y2
    protected final boolean A() {
        return false;
    }

    public final void C(Bundle bundle) {
        i();
        v();
        N(new i9(this, j0(false), bundle));
    }

    public final void D(com.google.android.gms.internal.measurement.w1 w1Var) {
        i();
        v();
        N(new c9(this, j0(false), w1Var));
    }

    public final void E(com.google.android.gms.internal.measurement.w1 w1Var, d0 d0Var, String str) {
        i();
        v();
        if (f().s(12451000) == 0) {
            N(new k9(this, d0Var, str, w1Var));
        } else {
            t().L().a("Not bundling data. Service unavailable or out of date");
            f().U(w1Var, new byte[0]);
        }
    }

    protected final void F(com.google.android.gms.internal.measurement.w1 w1Var, String str, String str2) {
        i();
        v();
        N(new q9(this, str, str2, j0(false), w1Var));
    }

    protected final void G(com.google.android.gms.internal.measurement.w1 w1Var, String str, String str2, boolean z7) {
        i();
        v();
        N(new x8(this, str, str2, j0(false), z7, w1Var));
    }

    protected final void H(d dVar) {
        a3.o.j(dVar);
        i();
        v();
        N(new o9(this, true, j0(true), n().E(dVar), new d(dVar), dVar));
    }

    protected final void I(d0 d0Var, String str) {
        a3.o.j(d0Var);
        i();
        v();
        N(new l9(this, true, j0(true), n().F(d0Var), d0Var, str));
    }

    protected final void J(p8 p8Var) {
        i();
        v();
        N(new e9(this, p8Var));
    }

    protected final void M(hb hbVar) {
        i();
        v();
        N(new b9(this, j0(true), n().G(hbVar), hbVar));
    }

    public final void O(AtomicReference<String> atomicReference) {
        i();
        v();
        N(new d9(this, atomicReference, j0(false)));
    }

    protected final void P(AtomicReference<List<na>> atomicReference, Bundle bundle) {
        i();
        v();
        N(new z8(this, atomicReference, j0(false), bundle));
    }

    protected final void Q(AtomicReference<List<d>> atomicReference, String str, String str2, String str3) {
        i();
        v();
        N(new n9(this, atomicReference, str, str2, str3, j0(false)));
    }

    protected final void R(AtomicReference<List<hb>> atomicReference, String str, String str2, String str3, boolean z7) {
        i();
        v();
        N(new p9(this, atomicReference, str, str2, str3, j0(false), z7));
    }

    protected final void S(p3.i iVar) {
        i();
        a3.o.j(iVar);
        this.f20564d = iVar;
        g0();
        f0();
    }

    final void T(p3.i iVar, b3.a aVar, lb lbVar) throws Throwable {
        int size;
        p4 p4VarG;
        String str;
        i();
        v();
        int i8 = 0;
        int i9 = 100;
        while (i8 < 1001 && i9 == 100) {
            ArrayList arrayList = new ArrayList();
            List<b3.a> listC = n().C(100);
            if (listC != null) {
                arrayList.addAll(listC);
                size = listC.size();
            } else {
                size = 0;
            }
            if (aVar != null && size < 100) {
                arrayList.add(aVar);
            }
            int size2 = arrayList.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList.get(i10);
                i10++;
                b3.a aVar2 = (b3.a) obj;
                if (aVar2 instanceof d0) {
                    try {
                        iVar.k2((d0) aVar2, lbVar);
                    } catch (RemoteException e8) {
                        e = e8;
                        p4VarG = t().G();
                        str = "Failed to send event to the service";
                        p4VarG.b(str, e);
                    }
                } else if (aVar2 instanceof hb) {
                    try {
                        iVar.y5((hb) aVar2, lbVar);
                    } catch (RemoteException e9) {
                        e = e9;
                        p4VarG = t().G();
                        str = "Failed to send user property to the service";
                        p4VarG.b(str, e);
                    }
                } else if (aVar2 instanceof d) {
                    try {
                        iVar.x5((d) aVar2, lbVar);
                    } catch (RemoteException e10) {
                        e = e10;
                        p4VarG = t().G();
                        str = "Failed to send conditional user property to the service";
                        p4VarG.b(str, e);
                    }
                } else {
                    t().G().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i8++;
            i9 = size;
        }
    }

    protected final void U(boolean z7) {
        i();
        v();
        if (z7) {
            n().H();
        }
        if (e0()) {
            N(new m9(this, j0(false)));
        }
    }

    protected final p3.c V() {
        i();
        v();
        p3.i iVar = this.f20564d;
        if (iVar == null) {
            Y();
            t().F().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        lb lbVarJ0 = j0(false);
        a3.o.j(lbVarJ0);
        try {
            p3.c cVarE4 = iVar.e4(lbVarJ0);
            g0();
            return cVarE4;
        } catch (RemoteException e8) {
            t().G().b("Failed to get consents; remote exception", e8);
            return null;
        }
    }

    final Boolean W() {
        return this.f20565e;
    }

    protected final void X() {
        i();
        v();
        lb lbVarJ0 = j0(true);
        n().I();
        N(new g9(this, lbVarJ0));
    }

    final void Y() {
        i();
        v();
        if (c0()) {
            return;
        }
        if (h0()) {
            this.f20563c.a();
            return;
        }
        if (a().S()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = j().getPackageManager().queryIntentServices(new Intent().setClassName(j(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (!((listQueryIntentServices == null || listQueryIntentServices.isEmpty()) ? false : true)) {
            t().G().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(j(), "com.google.android.gms.measurement.AppMeasurementService"));
        this.f20563c.b(intent);
    }

    public final void Z() {
        i();
        v();
        this.f20563c.d();
        try {
            d3.b.b().c(j(), this.f20563c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f20564d = null;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    protected final void a0() {
        i();
        v();
        lb lbVarJ0 = j0(false);
        n().H();
        N(new a9(this, lbVarJ0));
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y b() {
        return super.b();
    }

    protected final void b0() {
        i();
        v();
        N(new j9(this, j0(true)));
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 c() {
        return super.c();
    }

    public final boolean c0() {
        i();
        v();
        return this.f20564d != null;
    }

    final boolean d0() {
        i();
        v();
        return !h0() || f().G0() >= 200900;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    final boolean e0() {
        i();
        v();
        return !h0() || f().G0() >= e0.f19958r0.a(null).intValue();
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
