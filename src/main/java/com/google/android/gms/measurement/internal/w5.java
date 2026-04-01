package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.mf;
import com.google.android.gms.internal.measurement.ne;
import com.google.android.gms.internal.measurement.td;
import com.google.android.gms.internal.measurement.zd;
import com.google.android.gms.measurement.internal.y6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class w5 implements w6 {
    private static volatile w5 I;
    private volatile Boolean A;
    private Boolean B;
    private Boolean C;
    private volatile boolean D;
    private int E;
    private int F;
    final long H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f20622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f20623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f20624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f f20625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y4 f20626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n4 f20627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final q5 f20628j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final da f20629k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ib f20630l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final m4 f20631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e3.e f20632n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final o8 f20633o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final b7 f20634p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final x f20635q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final k8 f20636r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f20637s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private l4 f20638t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private v8 f20639u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private y f20640v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private i4 f20641w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Boolean f20643y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f20644z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f20642x = false;
    private AtomicInteger G = new AtomicInteger(0);

    private w5(a7 a7Var) {
        p4 p4VarL;
        String str;
        Bundle bundle;
        boolean z7 = false;
        a3.o.j(a7Var);
        e eVar = new e(a7Var.f19790a);
        this.f20624f = eVar;
        f4.f20006a = eVar;
        Context context = a7Var.f19790a;
        this.f20619a = context;
        this.f20620b = a7Var.f19791b;
        this.f20621c = a7Var.f19792c;
        this.f20622d = a7Var.f19793d;
        this.f20623e = a7Var.f19797h;
        this.A = a7Var.f19794e;
        this.f20637s = a7Var.f19799j;
        this.D = true;
        com.google.android.gms.internal.measurement.e2 e2Var = a7Var.f19796g;
        if (e2Var != null && (bundle = e2Var.f18671g) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = e2Var.f18671g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.o6.l(context);
        e3.e eVarD = e3.h.d();
        this.f20632n = eVarD;
        Long l8 = a7Var.f19798i;
        this.H = l8 != null ? l8.longValue() : eVarD.a();
        this.f20625g = new f(this);
        y4 y4Var = new y4(this);
        y4Var.m();
        this.f20626h = y4Var;
        n4 n4Var = new n4(this);
        n4Var.m();
        this.f20627i = n4Var;
        ib ibVar = new ib(this);
        ibVar.m();
        this.f20630l = ibVar;
        this.f20631m = new m4(new z6(a7Var, this));
        this.f20635q = new x(this);
        o8 o8Var = new o8(this);
        o8Var.w();
        this.f20633o = o8Var;
        b7 b7Var = new b7(this);
        b7Var.w();
        this.f20634p = b7Var;
        da daVar = new da(this);
        daVar.w();
        this.f20629k = daVar;
        k8 k8Var = new k8(this);
        k8Var.m();
        this.f20636r = k8Var;
        q5 q5Var = new q5(this);
        q5Var.m();
        this.f20628j = q5Var;
        com.google.android.gms.internal.measurement.e2 e2Var2 = a7Var.f19796g;
        if (e2Var2 != null && e2Var2.f18666b != 0) {
            z7 = true;
        }
        boolean z8 = !z7;
        if (context.getApplicationContext() instanceof Application) {
            b7 b7VarH = H();
            if (b7VarH.j().getApplicationContext() instanceof Application) {
                Application application = (Application) b7VarH.j().getApplicationContext();
                if (b7VarH.f19819c == null) {
                    b7VarH.f19819c = new f8(b7VarH);
                }
                if (z8) {
                    application.unregisterActivityLifecycleCallbacks(b7VarH.f19819c);
                    application.registerActivityLifecycleCallbacks(b7VarH.f19819c);
                    p4VarL = b7VarH.t().K();
                    str = "Registered activity lifecycle callback";
                }
            }
            q5Var.D(new x5(this, a7Var));
        }
        p4VarL = t().L();
        str = "Application context is not an Application";
        p4VarL.a(str);
        q5Var.D(new x5(this, a7Var));
    }

    public static w5 a(Context context, com.google.android.gms.internal.measurement.e2 e2Var, Long l8) {
        Bundle bundle;
        if (e2Var != null && (e2Var.f18669e == null || e2Var.f18670f == null)) {
            e2Var = new com.google.android.gms.internal.measurement.e2(e2Var.f18665a, e2Var.f18666b, e2Var.f18667c, e2Var.f18668d, null, null, e2Var.f18671g, null);
        }
        a3.o.j(context);
        a3.o.j(context.getApplicationContext());
        if (I == null) {
            synchronized (w5.class) {
                if (I == null) {
                    I = new w5(new a7(context, e2Var, l8));
                }
            }
        } else if (e2Var != null && (bundle = e2Var.f18671g) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            a3.o.j(I);
            I.h(e2Var.f18671g.getBoolean("dataCollectionDefaultEnabled"));
        }
        a3.o.j(I);
        return I;
    }

    private static void c(y2 y2Var) {
        if (y2Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (y2Var.z()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(y2Var.getClass()));
    }

    static /* synthetic */ void d(w5 w5Var, a7 a7Var) {
        w5Var.u().i();
        y yVar = new y(w5Var);
        yVar.m();
        w5Var.f20640v = yVar;
        i4 i4Var = new i4(w5Var, a7Var.f19795f);
        i4Var.w();
        w5Var.f20641w = i4Var;
        l4 l4Var = new l4(w5Var);
        l4Var.w();
        w5Var.f20638t = l4Var;
        v8 v8Var = new v8(w5Var);
        v8Var.w();
        w5Var.f20639u = v8Var;
        w5Var.f20630l.n();
        w5Var.f20626h.n();
        w5Var.f20641w.x();
        w5Var.t().J().b("App measurement initialized, version", 82001L);
        w5Var.t().J().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strF = i4Var.F();
        if (TextUtils.isEmpty(w5Var.f20620b)) {
            if (w5Var.L().F0(strF)) {
                w5Var.t().J().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                w5Var.t().J().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + strF);
            }
        }
        w5Var.t().F().a("Debug-level message logging enabled");
        if (w5Var.E != w5Var.G.get()) {
            w5Var.t().G().c("Not all components initialized", Integer.valueOf(w5Var.E), Integer.valueOf(w5Var.G.get()));
        }
        w5Var.f20642x = true;
    }

    private static void e(u6 u6Var) {
        if (u6Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (u6Var.o()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(u6Var.getClass()));
    }

    private static void f(v6 v6Var) {
        if (v6Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private final k8 v() {
        e(this.f20636r);
        return this.f20636r;
    }

    public final y A() {
        e(this.f20640v);
        return this.f20640v;
    }

    public final i4 B() {
        c(this.f20641w);
        return this.f20641w;
    }

    public final l4 C() {
        c(this.f20638t);
        return this.f20638t;
    }

    public final m4 D() {
        return this.f20631m;
    }

    public final n4 E() {
        n4 n4Var = this.f20627i;
        if (n4Var == null || !n4Var.o()) {
            return null;
        }
        return this.f20627i;
    }

    public final y4 F() {
        f(this.f20626h);
        return this.f20626h;
    }

    final q5 G() {
        return this.f20628j;
    }

    public final b7 H() {
        c(this.f20634p);
        return this.f20634p;
    }

    public final o8 I() {
        c(this.f20633o);
        return this.f20633o;
    }

    public final v8 J() {
        c(this.f20639u);
        return this.f20639u;
    }

    public final da K() {
        c(this.f20629k);
        return this.f20629k;
    }

    public final ib L() {
        f(this.f20630l);
        return this.f20630l;
    }

    public final String M() {
        return this.f20620b;
    }

    public final String N() {
        return this.f20621c;
    }

    public final String O() {
        return this.f20622d;
    }

    public final String P() {
        return this.f20637s;
    }

    final void Q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    final void R() {
        this.G.incrementAndGet();
    }

    protected final void b(com.google.android.gms.internal.measurement.e2 e2Var) {
        y6 y6Var;
        Boolean boolD;
        b7 b7VarH;
        v vVar;
        u().i();
        if (mf.a() && this.f20625g.q(e0.M0) && L().V0()) {
            ib ibVarL = L();
            ibVarL.i();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            androidx.core.content.a.j(ibVarL.j(), new p3.j0(ibVarL.f20556a), intentFilter, 2);
            ibVarL.t().F().a("Registered app receiver");
        }
        y6 y6VarJ = F().J();
        int iB = y6VarJ.b();
        Boolean boolF = this.f20625g.F("google_analytics_default_allow_ad_storage");
        Boolean boolF2 = this.f20625g.F("google_analytics_default_allow_analytics_storage");
        if (!(boolF == null && boolF2 == null) && F().x(-10)) {
            y6Var = new y6(boolF, boolF2, -10);
        } else {
            if (!TextUtils.isEmpty(B().G()) && (iB == 0 || iB == 30 || iB == 10 || iB == 30 || iB == 30 || iB == 40)) {
                H().K(new y6(null, null, -10), this.H);
            } else if (TextUtils.isEmpty(B().G()) && e2Var != null && e2Var.f18671g != null && F().x(30)) {
                y6Var = y6.c(e2Var.f18671g, 30);
                if (!y6Var.z()) {
                }
            }
            y6Var = null;
        }
        if (y6Var != null) {
            H().K(y6Var, this.H);
            y6VarJ = y6Var;
        }
        H().J(y6VarJ);
        if (td.a() && this.f20625g.q(e0.S0)) {
            int iA = F().I().a();
            Boolean boolF3 = this.f20625g.F("google_analytics_default_allow_ad_user_data");
            if (boolF3 != null && y6.k(-10, iA)) {
                b7VarH = H();
                vVar = new v(boolF3, -10);
            } else if (TextUtils.isEmpty(B().G()) || !(iA == 0 || iA == 30)) {
                if (TextUtils.isEmpty(B().G()) && e2Var != null && e2Var.f18671g != null && y6.k(30, iA)) {
                    v vVarB = v.b(e2Var.f18671g, 30);
                    if (vVarB.j()) {
                        H().I(vVarB);
                    }
                }
                if (TextUtils.isEmpty(B().G()) && e2Var != null && e2Var.f18671g != null && F().f20707m.a() == null && (boolD = v.d(e2Var.f18671g)) != null) {
                    H().Z(e2Var.f18669e, "allow_personalized_ads", boolD.toString(), false);
                }
            } else {
                b7VarH = H();
                vVar = new v((Boolean) null, -10);
            }
            b7VarH.I(vVar);
        }
        if (F().f20699e.a() == 0) {
            t().K().b("Persisting first open", Long.valueOf(this.H));
            F().f20699e.b(this.H);
        }
        H().f19830n.c();
        if (q()) {
            if (!TextUtils.isEmpty(B().G()) || !TextUtils.isEmpty(B().E())) {
                L();
                if (ib.l0(B().G(), F().P(), B().E(), F().O())) {
                    t().J().a("Rechecking which service to use due to a GMP App Id change");
                    F().Q();
                    C().H();
                    this.f20639u.Z();
                    this.f20639u.Y();
                    F().f20699e.b(this.H);
                    F().f20701g.b(null);
                }
                F().G(B().G());
                F().D(B().E());
            }
            if (!F().J().l(y6.a.ANALYTICS_STORAGE)) {
                F().f20701g.b(null);
            }
            H().R(F().f20701g.a());
            if (zd.a() && this.f20625g.q(e0.f19954p0) && !L().W0() && !TextUtils.isEmpty(F().f20716v.a())) {
                t().L().a("Remote config removed with active feature rollouts");
                F().f20716v.b(null);
            }
            if (!TextUtils.isEmpty(B().G()) || !TextUtils.isEmpty(B().E())) {
                boolean zM = m();
                if (!F().B() && !this.f20625g.R()) {
                    F().E(!zM);
                }
                if (zM) {
                    H().n0();
                }
                K().f19917e.a();
                J().O(new AtomicReference<>());
                J().C(F().f20719y.a());
            }
        } else if (m()) {
            if (!L().E0("android.permission.INTERNET")) {
                t().G().a("App is missing INTERNET permission");
            }
            if (!L().E0("android.permission.ACCESS_NETWORK_STATE")) {
                t().G().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!f3.e.a(this.f20619a).g() && !this.f20625g.S()) {
                if (!ib.c0(this.f20619a)) {
                    t().G().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!ib.d0(this.f20619a, false)) {
                    t().G().a("AppMeasurementService not registered/enabled");
                }
            }
            t().G().a("Uploading is not possible. App measurement disabled");
        }
        if (mf.a() && this.f20625g.q(e0.M0) && L().V0()) {
            final b7 b7VarH2 = H();
            b7VarH2.getClass();
            new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.v5
                @Override // java.lang.Runnable
                public final void run() {
                    b7VarH2.p0();
                }
            }).start();
        }
        F().f20709o.a(true);
    }

    final /* synthetic */ void g(String str, int i8, Throwable th, byte[] bArr, Map map) {
        if (!((i8 == 200 || i8 == 204 || i8 == 304) && th == null)) {
            t().L().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i8), th);
            return;
        }
        F().f20714t.a(true);
        if (bArr == null || bArr.length == 0) {
            t().F().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String strOptString = jSONObject.optString("deeplink", "");
            String strOptString2 = jSONObject.optString("gclid", "");
            String strOptString3 = jSONObject.optString("gbraid", "");
            double dOptDouble = jSONObject.optDouble(DiagnosticsEntry.Event.TIMESTAMP_KEY, 0.0d);
            if (TextUtils.isEmpty(strOptString)) {
                t().F().a("Deferred Deep Link is empty.");
                return;
            }
            Bundle bundle = new Bundle();
            if (ne.a() && this.f20625g.q(e0.Z0)) {
                if (!L().K0(strOptString)) {
                    t().L().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                    return;
                }
                bundle.putString("gbraid", strOptString3);
            } else if (!L().K0(strOptString)) {
                t().L().c("Deferred Deep Link validation failed. gclid, deep link", strOptString2, strOptString);
                return;
            }
            bundle.putString("gclid", strOptString2);
            bundle.putString("_cis", "ddp");
            this.f20634p.z0("auto", "_cmp", bundle);
            ib ibVarL = L();
            if (TextUtils.isEmpty(strOptString) || !ibVarL.h0(strOptString, dOptDouble)) {
                return;
            }
            ibVarL.j().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e8) {
            t().G().b("Failed to parse the Deferred Deep Link response. exception", e8);
        }
    }

    final void h(boolean z7) {
        this.A = Boolean.valueOf(z7);
    }

    final void i() {
        this.E++;
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final Context j() {
        return this.f20619a;
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final e3.e k() {
        return this.f20632n;
    }

    public final boolean l() {
        return this.A != null && this.A.booleanValue();
    }

    public final boolean m() {
        return x() == 0;
    }

    public final boolean n() {
        u().i();
        return this.D;
    }

    public final boolean o() {
        return TextUtils.isEmpty(this.f20620b);
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final e p() {
        return this.f20624f;
    }

    protected final boolean q() {
        if (!this.f20642x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        u().i();
        Boolean bool = this.f20643y;
        if (bool == null || this.f20644z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f20632n.b() - this.f20644z) > 1000)) {
            this.f20644z = this.f20632n.b();
            boolean z7 = true;
            Boolean boolValueOf = Boolean.valueOf(L().E0("android.permission.INTERNET") && L().E0("android.permission.ACCESS_NETWORK_STATE") && (f3.e.a(this.f20619a).g() || this.f20625g.S() || (ib.c0(this.f20619a) && ib.d0(this.f20619a, false))));
            this.f20643y = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!L().j0(B().G(), B().E()) && TextUtils.isEmpty(B().E())) {
                    z7 = false;
                }
                this.f20643y = Boolean.valueOf(z7);
            }
        }
        return this.f20643y.booleanValue();
    }

    public final boolean r() {
        return this.f20623e;
    }

    public final boolean s() {
        u().i();
        e(v());
        String strF = B().F();
        Pair<String, Boolean> pairS = F().s(strF);
        if (!this.f20625g.P() || ((Boolean) pairS.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairS.first)) {
            t().F().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        if (!v().w()) {
            t().L().a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        if (td.a() && this.f20625g.q(e0.U0)) {
            b7 b7VarH = H();
            b7VarH.i();
            p3.c cVarV = b7VarH.r().V();
            Bundle bundle = cVarV != null ? cVarV.f25603a : null;
            if (bundle == null) {
                int i8 = this.F;
                this.F = i8 + 1;
                boolean z7 = i8 < 10;
                t().F().b("Failed to retrieve DMA consent from the service, " + (z7 ? "Retrying." : "Skipping.") + " retryCount", Integer.valueOf(this.F));
                return z7;
            }
            y6 y6VarC = y6.c(bundle, 100);
            sb.append("&gcs=");
            sb.append(y6VarC.w());
            v vVarB = v.b(bundle, 100);
            sb.append("&dma=");
            sb.append(vVarB.g() == Boolean.FALSE ? 0 : 1);
            if (!TextUtils.isEmpty(vVarB.h())) {
                sb.append("&dma_cps=");
                sb.append(vVarB.h());
            }
            int i9 = v.d(bundle) == Boolean.TRUE ? 0 : 1;
            sb.append("&npa=");
            sb.append(i9);
            t().K().b("Consent query parameters to Bow", sb);
        }
        ib ibVarL = L();
        B();
        URL urlJ = ibVarL.J(82001L, strF, (String) pairS.first, F().f20715u.a() - 1, sb.toString());
        if (urlJ != null) {
            k8 k8VarV = v();
            j8 j8Var = new j8() { // from class: com.google.android.gms.measurement.internal.y5
                @Override // com.google.android.gms.measurement.internal.j8
                public final void a(String str, int i10, Throwable th, byte[] bArr, Map map) {
                    this.f20720a.g(str, i10, th, bArr, map);
                }
            };
            k8VarV.i();
            k8VarV.l();
            a3.o.j(urlJ);
            a3.o.j(j8Var);
            k8VarV.u().z(new m8(k8VarV, strF, urlJ, null, null, j8Var));
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final n4 t() {
        e(this.f20627i);
        return this.f20627i;
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final q5 u() {
        e(this.f20628j);
        return this.f20628j;
    }

    public final void w(boolean z7) {
        u().i();
        this.D = z7;
    }

    public final int x() {
        u().i();
        if (this.f20625g.R()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!n()) {
            return 8;
        }
        Boolean boolM = F().M();
        if (boolM != null) {
            return boolM.booleanValue() ? 0 : 3;
        }
        Boolean boolF = this.f20625g.F("firebase_analytics_collection_enabled");
        if (boolF != null) {
            return boolF.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.A == null || this.A.booleanValue()) ? 0 : 7;
    }

    public final x y() {
        x xVar = this.f20635q;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final f z() {
        return this.f20625g;
    }
}
