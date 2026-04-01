package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.te;
import com.google.android.gms.internal.measurement.ye;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class f extends v6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f19999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f20000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f20001d;

    f(w5 w5Var) {
        super(w5Var);
        this.f20000c = new h() { // from class: com.google.android.gms.measurement.internal.i
            @Override // com.google.android.gms.measurement.internal.h
            public final String d(String str, String str2) {
                return null;
            }
        };
    }

    public static long G() {
        return e0.f19933f.a(null).longValue();
    }

    public static long M() {
        return e0.F.a(null).longValue();
    }

    private final Bundle U() {
        try {
            if (j().getPackageManager() == null) {
                t().G().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoC = f3.e.a(j()).c(j().getPackageName(), 128);
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            t().G().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e8) {
            t().G().b("Failed to load metadata: Package name not found", e8);
            return null;
        }
    }

    private final String d(String str, String str2) {
        p4 p4VarG;
        String str3;
        try {
            String str4 = (String) Class.forName(com.amazon.a.a.o.b.aq).getMethod(com.amazon.a.a.o.b.ar, String.class, String.class).invoke(null, str, str2);
            a3.o.j(str4);
            return str4;
        } catch (ClassNotFoundException e8) {
            e = e8;
            p4VarG = t().G();
            str3 = "Could not find SystemProperties class";
            p4VarG.b(str3, e);
            return str2;
        } catch (IllegalAccessException e9) {
            e = e9;
            p4VarG = t().G();
            str3 = "Could not access SystemProperties.get()";
            p4VarG.b(str3, e);
            return str2;
        } catch (NoSuchMethodException e10) {
            e = e10;
            p4VarG = t().G();
            str3 = "Could not find SystemProperties.get() method";
            p4VarG.b(str3, e);
            return str2;
        } catch (InvocationTargetException e11) {
            e = e11;
            p4VarG = t().G();
            str3 = "SystemProperties.get() threw an exception";
            p4VarG.b(str3, e);
            return str2;
        }
    }

    public final int A(String str) {
        return s(str, e0.f19955q);
    }

    public final boolean B(String str, h4<Boolean> h4Var) {
        return D(str, h4Var);
    }

    final long C(String str) {
        return x(str, e0.f19927c);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D(java.lang.String r4, com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Le
        L3:
            java.lang.Object r4 = r5.a(r0)
        L7:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        Le:
            com.google.android.gms.measurement.internal.h r1 = r3.f20000c
            java.lang.String r2 = r5.b()
            java.lang.String r4 = r1.d(r4, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L1f
            goto L3
        L1f:
            java.lang.String r0 = "1"
            boolean r4 = r0.equals(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r4 = r5.a(r4)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f.D(java.lang.String, com.google.android.gms.measurement.internal.h4):boolean");
    }

    public final int E() {
        return f().b0(201500000, true) ? 100 : 25;
    }

    final Boolean F(String str) {
        a3.o.f(str);
        Bundle bundleU = U();
        if (bundleU == null) {
            t().G().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleU.containsKey(str)) {
            return Boolean.valueOf(bundleU.getBoolean(str));
        }
        return null;
    }

    final String H(String str) {
        return z(str, e0.N);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List<java.lang.String> I(java.lang.String r4) {
        /*
            r3 = this;
            a3.o.f(r4)
            android.os.Bundle r0 = r3.U()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.n4 r4 = r3.t()
            com.google.android.gms.measurement.internal.p4 r4 = r4.G()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.j()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            com.google.android.gms.measurement.internal.n4 r0 = r3.t()
            com.google.android.gms.measurement.internal.p4 r0 = r0.G()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f.I(java.lang.String):java.util.List");
    }

    final boolean J(String str) {
        return D(str, e0.M);
    }

    public final boolean K(String str) {
        return "1".equals(this.f20000c.d(str, "gaia_collection_enabled"));
    }

    public final boolean L(String str) {
        return "1".equals(this.f20000c.d(str, "measurement.event_sampling_enabled"));
    }

    public final String N() {
        return d("debug.firebase.analytics.app", "");
    }

    public final String O() {
        return d("debug.deferred.deeplink", "");
    }

    public final boolean P() {
        Boolean boolF = F("google_analytics_adid_collection_enabled");
        return boolF == null || boolF.booleanValue();
    }

    public final boolean Q() {
        Boolean boolF = F("google_analytics_automatic_screen_reporting_enabled");
        return boolF == null || boolF.booleanValue();
    }

    public final boolean R() {
        Boolean boolF = F("firebase_analytics_collection_deactivated");
        return boolF != null && boolF.booleanValue();
    }

    final boolean S() {
        if (this.f19999b == null) {
            Boolean boolF = F("app_measurement_lite");
            this.f19999b = boolF;
            if (boolF == null) {
                this.f19999b = Boolean.FALSE;
            }
        }
        return this.f19999b.booleanValue() || !this.f20556a.r();
    }

    public final boolean T() {
        if (this.f20001d == null) {
            synchronized (this) {
                if (this.f20001d == null) {
                    ApplicationInfo applicationInfo = j().getApplicationInfo();
                    String strA = e3.o.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f20001d = Boolean.valueOf(str != null && str.equals(strA));
                    }
                    if (this.f20001d == null) {
                        this.f20001d = Boolean.TRUE;
                        t().G().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f20001d.booleanValue();
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

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v6
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

    public final double l(String str, h4<Double> h4Var) {
        if (str != null) {
            String strD = this.f20000c.d(str, h4Var.b());
            if (!TextUtils.isEmpty(strD)) {
                try {
                    return h4Var.a(Double.valueOf(Double.parseDouble(strD))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return h4Var.a(null).doubleValue();
    }

    final int m(String str) {
        return n(str, e0.J, 500, 2000);
    }

    public final int n(String str, h4<Integer> h4Var, int i8, int i9) {
        return Math.max(Math.min(s(str, h4Var), i9), i8);
    }

    final void o(h hVar) {
        this.f20000c = hVar;
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    public final boolean q(h4<Boolean> h4Var) {
        return D(null, h4Var);
    }

    final int r(String str) {
        return (te.a() && a().D(null, e0.f19926b1)) ? 500 : 100;
    }

    public final int s(String str, h4<Integer> h4Var) {
        if (str != null) {
            String strD = this.f20000c.d(str, h4Var.b());
            if (!TextUtils.isEmpty(strD)) {
                try {
                    return h4Var.a(Integer.valueOf(Integer.parseInt(strD))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return h4Var.a(null).intValue();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 u() {
        return super.u();
    }

    final int v() {
        return (ye.a() && a().D(null, e0.I0) && f().b0(231100000, true)) ? 35 : 0;
    }

    final int w(String str) {
        return Math.max(r(str), 256);
    }

    public final long x(String str, h4<Long> h4Var) {
        if (str != null) {
            String strD = this.f20000c.d(str, h4Var.b());
            if (!TextUtils.isEmpty(strD)) {
                try {
                    return h4Var.a(Long.valueOf(Long.parseLong(strD))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return h4Var.a(null).longValue();
    }

    public final int y(String str) {
        return n(str, e0.K, 25, 100);
    }

    public final String z(String str, h4<String> h4Var) {
        return h4Var.a(str == null ? null : this.f20000c.d(str, h4Var.b()));
    }
}
