package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.td;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class a6 extends p3.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final va f19787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f19788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f19789c;

    public a6(va vaVar) {
        this(vaVar, null);
    }

    private a6(va vaVar, String str) {
        a3.o.j(vaVar);
        this.f19787a = vaVar;
        this.f19789c = null;
    }

    private final void H0(Runnable runnable) {
        a3.o.j(runnable);
        if (this.f19787a.u().J()) {
            runnable.run();
        } else {
            this.f19787a.u().D(runnable);
        }
    }

    private final void N5(d0 d0Var, lb lbVar) {
        this.f19787a.o0();
        this.f19787a.r(d0Var, lbVar);
    }

    private final void h5(lb lbVar, boolean z7) {
        a3.o.j(lbVar);
        a3.o.f(lbVar.f20210a);
        q3(lbVar.f20210a, false);
        this.f19787a.n0().j0(lbVar.f20211b, lbVar.f20226q);
    }

    private final void q3(String str, boolean z7) {
        if (TextUtils.isEmpty(str)) {
            this.f19787a.t().G().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z7) {
            try {
                if (this.f19788b == null) {
                    this.f19788b = Boolean.valueOf("com.google.android.gms".equals(this.f19789c) || e3.r.a(this.f19787a.j(), Binder.getCallingUid()) || x2.j.a(this.f19787a.j()).c(Binder.getCallingUid()));
                }
                if (this.f19788b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e8) {
                this.f19787a.t().G().b("Measurement Service called with invalid calling package. appId", n4.v(str));
                throw e8;
            }
        }
        if (this.f19789c == null && x2.i.j(this.f19787a.j(), Binder.getCallingUid(), str)) {
            this.f19789c = str;
        }
        if (str.equals(this.f19789c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // p3.i
    public final List<hb> B4(String str, String str2, boolean z7, lb lbVar) {
        h5(lbVar, false);
        String str3 = lbVar.f20210a;
        a3.o.j(str3);
        try {
            List<jb> list = (List) this.f19787a.u().w(new f6(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (jb jbVar : list) {
                if (z7 || !ib.H0(jbVar.f20164c)) {
                    arrayList.add(new hb(jbVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e8) {
            this.f19787a.t().G().c("Failed to query user properties. appId", n4.v(lbVar.f20210a), e8);
            return Collections.emptyList();
        }
    }

    final void G5(d0 d0Var, lb lbVar) {
        p4 p4VarK;
        String str;
        String str2;
        if (!this.f19787a.h0().W(lbVar.f20210a)) {
            N5(d0Var, lbVar);
            return;
        }
        this.f19787a.t().K().b("EES config found for", lbVar.f20210a);
        i5 i5VarH0 = this.f19787a.h0();
        String str3 = lbVar.f20210a;
        com.google.android.gms.internal.measurement.b0 b0VarC = TextUtils.isEmpty(str3) ? null : i5VarH0.f20104j.c(str3);
        if (b0VarC == null) {
            p4VarK = this.f19787a.t().K();
            str = lbVar.f20210a;
            str2 = "EES not loaded for";
        } else {
            boolean zD = false;
            try {
                Map<String, Object> mapO = this.f19787a.m0().O(d0Var.f19889b.p(), true);
                String strA = p3.r.a(d0Var.f19888a);
                if (strA == null) {
                    strA = d0Var.f19888a;
                }
                zD = b0VarC.d(new com.google.android.gms.internal.measurement.e(strA, d0Var.f19891d, mapO));
            } catch (com.google.android.gms.internal.measurement.b1 unused) {
                this.f19787a.t().G().c("EES error. appId, eventName", lbVar.f20211b, d0Var.f19888a);
            }
            if (zD) {
                if (b0VarC.g()) {
                    this.f19787a.t().K().b("EES edited event", d0Var.f19888a);
                    d0Var = this.f19787a.m0().G(b0VarC.a().d());
                }
                N5(d0Var, lbVar);
                if (b0VarC.f()) {
                    for (com.google.android.gms.internal.measurement.e eVar : b0VarC.a().f()) {
                        this.f19787a.t().K().b("EES logging created event", eVar.e());
                        N5(this.f19787a.m0().G(eVar), lbVar);
                    }
                    return;
                }
                return;
            }
            p4VarK = this.f19787a.t().K();
            str = d0Var.f19888a;
            str2 = "EES was not applied to event";
        }
        p4VarK.b(str2, str);
        N5(d0Var, lbVar);
    }

    @Override // p3.i
    public final void H3(d dVar) {
        a3.o.j(dVar);
        a3.o.j(dVar.f19879c);
        a3.o.f(dVar.f19877a);
        q3(dVar.f19877a, true);
        H0(new g6(this, new d(dVar)));
    }

    @Override // p3.i
    public final void J2(long j8, String str, String str2, String str3) {
        H0(new e6(this, str2, str3, str, j8));
    }

    @Override // p3.i
    public final List<d> K0(String str, String str2, lb lbVar) {
        h5(lbVar, false);
        String str3 = lbVar.f20210a;
        a3.o.j(str3);
        try {
            return (List) this.f19787a.u().w(new h6(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e8) {
            this.f19787a.t().G().b("Failed to get conditional user properties", e8);
            return Collections.emptyList();
        }
    }

    @Override // p3.i
    public final byte[] L2(d0 d0Var, String str) {
        a3.o.f(str);
        a3.o.j(d0Var);
        q3(str, true);
        this.f19787a.t().F().b("Log and bundle. event", this.f19787a.f0().c(d0Var.f19888a));
        long jC = this.f19787a.k().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f19787a.u().B(new q6(this, d0Var, str)).get();
            if (bArr == null) {
                this.f19787a.t().G().b("Log and bundle returned null. appId", n4.v(str));
                bArr = new byte[0];
            }
            this.f19787a.t().F().d("Log and bundle processed. event, size, time_ms", this.f19787a.f0().c(d0Var.f19888a), Integer.valueOf(bArr.length), Long.valueOf((this.f19787a.k().c() / 1000000) - jC));
            return bArr;
        } catch (InterruptedException | ExecutionException e8) {
            this.f19787a.t().G().d("Failed to log and bundle. appId, event, error", n4.v(str), this.f19787a.f0().c(d0Var.f19888a), e8);
            return null;
        }
    }

    @Override // p3.i
    public final void N2(lb lbVar) {
        h5(lbVar, false);
        H0(new b6(this, lbVar));
    }

    @Override // p3.i
    public final List<d> P2(String str, String str2, String str3) {
        q3(str, true);
        try {
            return (List) this.f19787a.u().w(new k6(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e8) {
            this.f19787a.t().G().b("Failed to get conditional user properties as", e8);
            return Collections.emptyList();
        }
    }

    @Override // p3.i
    public final void P4(d0 d0Var, String str, String str2) {
        a3.o.j(d0Var);
        a3.o.f(str);
        q3(str, true);
        H0(new n6(this, d0Var, str));
    }

    @Override // p3.i
    public final void S0(lb lbVar) {
        a3.o.f(lbVar.f20210a);
        q3(lbVar.f20210a, false);
        H0(new j6(this, lbVar));
    }

    @Override // p3.i
    public final List<na> T4(lb lbVar, Bundle bundle) {
        h5(lbVar, false);
        a3.o.j(lbVar.f20210a);
        try {
            return (List) this.f19787a.u().w(new t6(this, lbVar, bundle)).get();
        } catch (InterruptedException | ExecutionException e8) {
            this.f19787a.t().G().c("Failed to get trigger URIs. appId", n4.v(lbVar.f20210a), e8);
            return Collections.emptyList();
        }
    }

    @Override // p3.i
    public final String Y1(lb lbVar) {
        h5(lbVar, false);
        return this.f19787a.R(lbVar);
    }

    @Override // p3.i
    public final p3.c e4(lb lbVar) {
        h5(lbVar, false);
        a3.o.f(lbVar.f20210a);
        if (!td.a()) {
            return new p3.c(null);
        }
        try {
            return (p3.c) this.f19787a.u().B(new l6(this, lbVar)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            this.f19787a.t().G().c("Failed to get consent. appId", n4.v(lbVar.f20210a), e8);
            return new p3.c(null);
        }
    }

    @Override // p3.i
    public final List<hb> e5(lb lbVar, boolean z7) {
        h5(lbVar, false);
        String str = lbVar.f20210a;
        a3.o.j(str);
        try {
            List<jb> list = (List) this.f19787a.u().w(new s6(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (jb jbVar : list) {
                if (z7 || !ib.H0(jbVar.f20164c)) {
                    arrayList.add(new hb(jbVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e8) {
            this.f19787a.t().G().c("Failed to get user properties. appId", n4.v(lbVar.f20210a), e8);
            return null;
        }
    }

    @Override // p3.i
    public final void k2(d0 d0Var, lb lbVar) {
        a3.o.j(d0Var);
        h5(lbVar, false);
        H0(new o6(this, d0Var, lbVar));
    }

    final /* synthetic */ void k3(String str, Bundle bundle) {
        this.f19787a.e0().h0(str, bundle);
    }

    @Override // p3.i
    public final List<hb> o1(String str, String str2, String str3, boolean z7) {
        q3(str, true);
        try {
            List<jb> list = (List) this.f19787a.u().w(new i6(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (jb jbVar : list) {
                if (z7 || !ib.H0(jbVar.f20164c)) {
                    arrayList.add(new hb(jbVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e8) {
            this.f19787a.t().G().c("Failed to get user properties as. appId", n4.v(str), e8);
            return Collections.emptyList();
        }
    }

    @Override // p3.i
    public final void u1(lb lbVar) {
        a3.o.f(lbVar.f20210a);
        a3.o.j(lbVar.f20231v);
        m6 m6Var = new m6(this, lbVar);
        a3.o.j(m6Var);
        if (this.f19787a.u().J()) {
            m6Var.run();
        } else {
            this.f19787a.u().G(m6Var);
        }
    }

    @Override // p3.i
    public final void v1(final Bundle bundle, lb lbVar) {
        h5(lbVar, false);
        final String str = lbVar.f20210a;
        a3.o.j(str);
        H0(new Runnable() { // from class: com.google.android.gms.measurement.internal.z5
            @Override // java.lang.Runnable
            public final void run() {
                this.f20747a.k3(str, bundle);
            }
        });
    }

    @Override // p3.i
    public final void w1(lb lbVar) {
        h5(lbVar, false);
        H0(new c6(this, lbVar));
    }

    @Override // p3.i
    public final void x5(d dVar, lb lbVar) {
        a3.o.j(dVar);
        a3.o.j(dVar.f19879c);
        h5(lbVar, false);
        d dVar2 = new d(dVar);
        dVar2.f19877a = lbVar.f20210a;
        H0(new d6(this, dVar2, lbVar));
    }

    final d0 y4(d0 d0Var, lb lbVar) {
        z zVar;
        boolean z7 = false;
        if ("_cmp".equals(d0Var.f19888a) && (zVar = d0Var.f19889b) != null && zVar.g() != 0) {
            String strW = d0Var.f19889b.w("_cis");
            if ("referrer broadcast".equals(strW) || "referrer API".equals(strW)) {
                z7 = true;
            }
        }
        if (!z7) {
            return d0Var;
        }
        this.f19787a.t().J().b("Event has been filtered ", d0Var.toString());
        return new d0("_cmpx", d0Var.f19889b, d0Var.f19890c, d0Var.f19891d);
    }

    @Override // p3.i
    public final void y5(hb hbVar, lb lbVar) {
        a3.o.j(hbVar);
        h5(lbVar, false);
        H0(new p6(this, hbVar, lbVar));
    }
}
