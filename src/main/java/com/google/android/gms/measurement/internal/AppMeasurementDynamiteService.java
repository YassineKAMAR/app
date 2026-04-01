package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    w5 f19759a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, p3.u> f19760b = new p.a();

    class a implements p3.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.gms.internal.measurement.b2 f19761a;

        a(com.google.android.gms.internal.measurement.b2 b2Var) {
            this.f19761a = b2Var;
        }

        @Override // p3.v
        public final void a(String str, String str2, Bundle bundle, long j8) {
            try {
                this.f19761a.L3(str, str2, bundle, j8);
            } catch (RemoteException e8) {
                w5 w5Var = AppMeasurementDynamiteService.this.f19759a;
                if (w5Var != null) {
                    w5Var.t().L().b("Event interceptor threw exception", e8);
                }
            }
        }
    }

    class b implements p3.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.gms.internal.measurement.b2 f19763a;

        b(com.google.android.gms.internal.measurement.b2 b2Var) {
            this.f19763a = b2Var;
        }

        @Override // p3.u
        public final void a(String str, String str2, Bundle bundle, long j8) {
            try {
                this.f19763a.L3(str, str2, bundle, j8);
            } catch (RemoteException e8) {
                w5 w5Var = AppMeasurementDynamiteService.this.f19759a;
                if (w5Var != null) {
                    w5Var.t().L().b("Event listener threw exception", e8);
                }
            }
        }
    }

    private final void j() {
        if (this.f19759a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void v0(com.google.android.gms.internal.measurement.w1 w1Var, String str) {
        j();
        this.f19759a.L().R(w1Var, str);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void beginAdUnitExposure(String str, long j8) {
        j();
        this.f19759a.y().z(str, j8);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        j();
        this.f19759a.H().V(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void clearMeasurementEnabled(long j8) {
        j();
        this.f19759a.H().P(null);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void endAdUnitExposure(String str, long j8) {
        j();
        this.f19759a.y().D(str, j8);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void generateEventId(com.google.android.gms.internal.measurement.w1 w1Var) {
        j();
        long jP0 = this.f19759a.L().P0();
        j();
        this.f19759a.L().P(w1Var, jP0);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getAppInstanceId(com.google.android.gms.internal.measurement.w1 w1Var) {
        j();
        this.f19759a.u().D(new r6(this, w1Var));
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.w1 w1Var) {
        j();
        v0(w1Var, this.f19759a.H().i0());
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.w1 w1Var) {
        j();
        this.f19759a.u().D(new f9(this, w1Var, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.w1 w1Var) {
        j();
        v0(w1Var, this.f19759a.H().j0());
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.w1 w1Var) {
        j();
        v0(w1Var, this.f19759a.H().k0());
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getGmpAppId(com.google.android.gms.internal.measurement.w1 w1Var) {
        j();
        v0(w1Var, this.f19759a.H().l0());
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.w1 w1Var) {
        j();
        this.f19759a.H();
        a3.o.f(str);
        j();
        this.f19759a.L().O(w1Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getSessionId(com.google.android.gms.internal.measurement.w1 w1Var) {
        j();
        b7 b7VarH = this.f19759a.H();
        b7VarH.u().D(new y7(b7VarH, w1Var));
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getTestFlag(com.google.android.gms.internal.measurement.w1 w1Var, int i8) {
        j();
        if (i8 == 0) {
            this.f19759a.L().R(w1Var, this.f19759a.H().m0());
            return;
        }
        if (i8 == 1) {
            this.f19759a.L().P(w1Var, this.f19759a.H().h0().longValue());
            return;
        }
        if (i8 != 2) {
            if (i8 == 3) {
                this.f19759a.L().O(w1Var, this.f19759a.H().g0().intValue());
                return;
            } else {
                if (i8 != 4) {
                    return;
                }
                this.f19759a.L().T(w1Var, this.f19759a.H().e0().booleanValue());
                return;
            }
        }
        ib ibVarL = this.f19759a.L();
        double dDoubleValue = this.f19759a.H().f0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            w1Var.f(bundle);
        } catch (RemoteException e8) {
            ibVarL.f20556a.t().L().b("Error returning double value to wrapper", e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void getUserProperties(String str, String str2, boolean z7, com.google.android.gms.internal.measurement.w1 w1Var) {
        j();
        this.f19759a.u().D(new i7(this, w1Var, str, str2, z7));
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void initForTests(Map map) {
        j();
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void initialize(g3.a aVar, com.google.android.gms.internal.measurement.e2 e2Var, long j8) {
        w5 w5Var = this.f19759a;
        if (w5Var == null) {
            this.f19759a = w5.a((Context) a3.o.j((Context) g3.b.H0(aVar)), e2Var, Long.valueOf(j8));
        } else {
            w5Var.t().L().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.w1 w1Var) {
        j();
        this.f19759a.u().D(new eb(this, w1Var));
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j8) {
        j();
        this.f19759a.H().X(str, str2, bundle, z7, z8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.w1 w1Var, long j8) {
        j();
        a3.o.f(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f19759a.u().D(new h8(this, w1Var, new d0(str2, new z(bundle), "app", j8), str));
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void logHealthData(int i8, String str, g3.a aVar, g3.a aVar2, g3.a aVar3) {
        j();
        this.f19759a.t().z(i8, true, false, str, aVar == null ? null : g3.b.H0(aVar), aVar2 == null ? null : g3.b.H0(aVar2), aVar3 != null ? g3.b.H0(aVar3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivityCreated(g3.a aVar, Bundle bundle, long j8) {
        j();
        f8 f8Var = this.f19759a.H().f19819c;
        if (f8Var != null) {
            this.f19759a.H().o0();
            f8Var.onActivityCreated((Activity) g3.b.H0(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivityDestroyed(g3.a aVar, long j8) {
        j();
        f8 f8Var = this.f19759a.H().f19819c;
        if (f8Var != null) {
            this.f19759a.H().o0();
            f8Var.onActivityDestroyed((Activity) g3.b.H0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivityPaused(g3.a aVar, long j8) {
        j();
        f8 f8Var = this.f19759a.H().f19819c;
        if (f8Var != null) {
            this.f19759a.H().o0();
            f8Var.onActivityPaused((Activity) g3.b.H0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivityResumed(g3.a aVar, long j8) {
        j();
        f8 f8Var = this.f19759a.H().f19819c;
        if (f8Var != null) {
            this.f19759a.H().o0();
            f8Var.onActivityResumed((Activity) g3.b.H0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivitySaveInstanceState(g3.a aVar, com.google.android.gms.internal.measurement.w1 w1Var, long j8) {
        j();
        f8 f8Var = this.f19759a.H().f19819c;
        Bundle bundle = new Bundle();
        if (f8Var != null) {
            this.f19759a.H().o0();
            f8Var.onActivitySaveInstanceState((Activity) g3.b.H0(aVar), bundle);
        }
        try {
            w1Var.f(bundle);
        } catch (RemoteException e8) {
            this.f19759a.t().L().b("Error returning bundle value to wrapper", e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivityStarted(g3.a aVar, long j8) {
        j();
        f8 f8Var = this.f19759a.H().f19819c;
        if (f8Var != null) {
            this.f19759a.H().o0();
            f8Var.onActivityStarted((Activity) g3.b.H0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void onActivityStopped(g3.a aVar, long j8) {
        j();
        f8 f8Var = this.f19759a.H().f19819c;
        if (f8Var != null) {
            this.f19759a.H().o0();
            f8Var.onActivityStopped((Activity) g3.b.H0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.w1 w1Var, long j8) {
        j();
        w1Var.f(null);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.b2 b2Var) {
        p3.u bVar;
        j();
        synchronized (this.f19760b) {
            bVar = this.f19760b.get(Integer.valueOf(b2Var.j()));
            if (bVar == null) {
                bVar = new b(b2Var);
                this.f19760b.put(Integer.valueOf(b2Var.j()), bVar);
            }
        }
        this.f19759a.H().c0(bVar);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void resetAnalyticsData(long j8) {
        j();
        b7 b7VarH = this.f19759a.H();
        b7VarH.R(null);
        b7VarH.u().D(new s7(b7VarH, j8));
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setConditionalUserProperty(Bundle bundle, long j8) {
        j();
        if (bundle == null) {
            this.f19759a.t().G().a("Conditional user property must not be null");
        } else {
            this.f19759a.H().H(bundle, j8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setConsent(final Bundle bundle, final long j8) {
        j();
        final b7 b7VarH = this.f19759a.H();
        b7VarH.u().G(new Runnable() { // from class: com.google.android.gms.measurement.internal.f7
            @Override // java.lang.Runnable
            public final void run() {
                b7 b7Var = b7VarH;
                Bundle bundle2 = bundle;
                long j9 = j8;
                if (TextUtils.isEmpty(b7Var.m().G())) {
                    b7Var.G(bundle2, 0, j9);
                } else {
                    b7Var.t().M().a("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setConsentThirdParty(Bundle bundle, long j8) {
        j();
        this.f19759a.H().G(bundle, -20, j8);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setCurrentScreen(g3.a aVar, String str, String str2, long j8) {
        j();
        this.f19759a.I().H((Activity) g3.b.H0(aVar), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setDataCollectionEnabled(boolean z7) {
        j();
        b7 b7VarH = this.f19759a.H();
        b7VarH.v();
        b7VarH.u().D(new k7(b7VarH, z7));
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setDefaultEventParameters(Bundle bundle) {
        j();
        final b7 b7VarH = this.f19759a.H();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        b7VarH.u().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.d7
            @Override // java.lang.Runnable
            public final void run() {
                b7VarH.F(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setEventInterceptor(com.google.android.gms.internal.measurement.b2 b2Var) {
        j();
        a aVar = new a(b2Var);
        if (this.f19759a.u().J()) {
            this.f19759a.H().d0(aVar);
        } else {
            this.f19759a.u().D(new fa(this, aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.c2 c2Var) {
        j();
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setMeasurementEnabled(boolean z7, long j8) {
        j();
        this.f19759a.H().P(Boolean.valueOf(z7));
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setMinimumSessionDuration(long j8) {
        j();
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setSessionTimeoutDuration(long j8) {
        j();
        b7 b7VarH = this.f19759a.H();
        b7VarH.u().D(new m7(b7VarH, j8));
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setUserId(final String str, long j8) {
        j();
        final b7 b7VarH = this.f19759a.H();
        if (str != null && TextUtils.isEmpty(str)) {
            b7VarH.f20556a.t().L().a("User ID must be non-empty or null");
        } else {
            b7VarH.u().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.g7
                @Override // java.lang.Runnable
                public final void run() {
                    b7 b7Var = b7VarH;
                    if (b7Var.m().K(str)) {
                        b7Var.m().I();
                    }
                }
            });
            b7VarH.a0(null, "_id", str, true, j8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void setUserProperty(String str, String str2, g3.a aVar, boolean z7, long j8) {
        j();
        this.f19759a.H().a0(str, str2, g3.b.H0(aVar), z7, j8);
    }

    @Override // com.google.android.gms.internal.measurement.v1
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.b2 b2Var) {
        p3.u uVarRemove;
        j();
        synchronized (this.f19760b) {
            uVarRemove = this.f19760b.remove(Integer.valueOf(b2Var.j()));
        }
        if (uVarRemove == null) {
            uVarRemove = new b(b2Var);
        }
        this.f19759a.H().y0(uVarRemove);
    }
}
