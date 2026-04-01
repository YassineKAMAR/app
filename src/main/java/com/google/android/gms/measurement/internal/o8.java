package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o8 extends y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile p8 f20323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile p8 f20324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected p8 f20325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<Activity, p8> f20326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Activity f20327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f20328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile p8 f20329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p8 f20330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f20331k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f20332l;

    public o8(w5 w5Var) {
        super(w5Var);
        this.f20332l = new Object();
        this.f20326f = new ConcurrentHashMap();
    }

    private final String D(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] strArrSplit = canonicalName.split("\\.");
        String str2 = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        return str2.length() > a().r(null) ? str2.substring(0, a().r(null)) : str2;
    }

    private final void G(Activity activity, p8 p8Var, boolean z7) {
        p8 p8Var2;
        p8 p8Var3 = this.f20323c == null ? this.f20324d : this.f20323c;
        if (p8Var.f20365b == null) {
            p8Var2 = new p8(p8Var.f20364a, activity != null ? D(activity.getClass(), "Activity") : null, p8Var.f20366c, p8Var.f20368e, p8Var.f20369f);
        } else {
            p8Var2 = p8Var;
        }
        this.f20324d = this.f20323c;
        this.f20323c = p8Var2;
        u().D(new s8(this, p8Var2, p8Var3, k().b(), z7));
    }

    static /* synthetic */ void J(o8 o8Var, Bundle bundle, p8 p8Var, p8 p8Var2, long j8) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        o8Var.N(p8Var, p8Var2, j8, true, o8Var.f().E(null, "screen_view", bundle, null, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(com.google.android.gms.measurement.internal.p8 r16, com.google.android.gms.measurement.internal.p8 r17, long r18, boolean r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.o8.N(com.google.android.gms.measurement.internal.p8, com.google.android.gms.measurement.internal.p8, long, boolean, android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(p8 p8Var, boolean z7, long j8) {
        l().v(k().b());
        if (!s().E(p8Var != null && p8Var.f20367d, z7, j8) || p8Var == null) {
            return;
        }
        p8Var.f20367d = false;
    }

    private final p8 T(Activity activity) {
        a3.o.j(activity);
        p8 p8Var = this.f20326f.get(activity);
        if (p8Var == null) {
            p8 p8Var2 = new p8(null, D(activity.getClass(), "Activity"), f().P0());
            this.f20326f.put(activity, p8Var2);
            p8Var = p8Var2;
        }
        return this.f20329i != null ? this.f20329i : p8Var;
    }

    @Override // com.google.android.gms.measurement.internal.y2
    protected final boolean A() {
        return false;
    }

    public final p8 C(boolean z7) {
        v();
        i();
        if (!z7) {
            return this.f20325e;
        }
        p8 p8Var = this.f20325e;
        return p8Var != null ? p8Var : this.f20330j;
    }

    public final void E(Activity activity) {
        synchronized (this.f20332l) {
            if (activity == this.f20327g) {
                this.f20327g = null;
            }
        }
        if (a().Q()) {
            this.f20326f.remove(activity);
        }
    }

    public final void F(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!a().Q() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f20326f.put(activity, new p8(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @Deprecated
    public final void H(Activity activity, String str, String str2) {
        if (!a().Q()) {
            t().M().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        p8 p8Var = this.f20323c;
        if (p8Var == null) {
            t().M().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f20326f.get(activity) == null) {
            t().M().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = D(activity.getClass(), "Activity");
        }
        boolean zA = p3.e0.a(p8Var.f20365b, str2);
        boolean zA2 = p3.e0.a(p8Var.f20364a, str);
        if (zA && zA2) {
            t().M().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > a().r(null))) {
            t().M().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > a().r(null))) {
            t().M().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        t().K().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        p8 p8Var2 = new p8(str, str2, f().P0());
        this.f20326f.put(activity, p8Var2);
        G(activity, p8Var2, true);
    }

    public final void I(Bundle bundle, long j8) {
        String str;
        synchronized (this.f20332l) {
            if (!this.f20331k) {
                t().M().a("Cannot log screen view event when the app is in the background.");
                return;
            }
            String strD = null;
            if (bundle != null) {
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > a().r(null))) {
                    t().M().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > a().r(null))) {
                    t().M().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                } else {
                    strD = string2;
                    str = string;
                }
            } else {
                str = null;
            }
            if (strD == null) {
                Activity activity = this.f20327g;
                strD = activity != null ? D(activity.getClass(), "Activity") : "Activity";
            }
            String str2 = strD;
            p8 p8Var = this.f20323c;
            if (this.f20328h && p8Var != null) {
                this.f20328h = false;
                boolean zA = p3.e0.a(p8Var.f20365b, str2);
                boolean zA2 = p3.e0.a(p8Var.f20364a, str);
                if (zA && zA2) {
                    t().M().a("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            t().K().c("Logging screen view with name, class", str == null ? "null" : str, str2 == null ? "null" : str2);
            p8 p8Var2 = this.f20323c == null ? this.f20324d : this.f20323c;
            p8 p8Var3 = new p8(str, str2, f().P0(), true, j8);
            this.f20323c = p8Var3;
            this.f20324d = p8Var2;
            this.f20329i = p8Var3;
            u().D(new q8(this, bundle, p8Var3, p8Var2, k().b()));
        }
    }

    public final p8 P() {
        return this.f20323c;
    }

    public final void Q(Activity activity) {
        synchronized (this.f20332l) {
            this.f20331k = false;
            this.f20328h = true;
        }
        long jB = k().b();
        if (!a().Q()) {
            this.f20323c = null;
            u().D(new u8(this, jB));
        } else {
            p8 p8VarT = T(activity);
            this.f20324d = this.f20323c;
            this.f20323c = null;
            u().D(new t8(this, p8VarT, jB));
        }
    }

    public final void R(Activity activity, Bundle bundle) {
        p8 p8Var;
        if (!a().Q() || bundle == null || (p8Var = this.f20326f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", p8Var.f20366c);
        bundle2.putString("name", p8Var.f20364a);
        bundle2.putString("referrer_name", p8Var.f20365b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void S(Activity activity) {
        synchronized (this.f20332l) {
            this.f20331k = true;
            if (activity != this.f20327g) {
                synchronized (this.f20332l) {
                    this.f20327g = activity;
                    this.f20328h = false;
                }
                if (a().Q()) {
                    this.f20329i = null;
                    u().D(new w8(this));
                }
            }
        }
        if (!a().Q()) {
            this.f20323c = this.f20329i;
            u().D(new r8(this));
        } else {
            G(activity, T(activity), false);
            x xVarL = l();
            xVarL.u().D(new w0(xVarL, xVarL.k().b()));
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
}
