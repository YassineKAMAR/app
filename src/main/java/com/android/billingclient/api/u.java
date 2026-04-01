package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.p5;
import com.google.android.gms.internal.play_billing.r5;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class u implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4631a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4632b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j1.d f4633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ c f4634d;

    /* synthetic */ u(c cVar, j1.d dVar, j1.s sVar) {
        this.f4634d = cVar;
        this.f4633c = dVar;
    }

    private final void d(f fVar) {
        synchronized (this.f4631a) {
            j1.d dVar = this.f4633c;
            if (dVar != null) {
                dVar.onBillingSetupFinished(fVar);
            }
        }
    }

    final /* synthetic */ Object a() {
        Bundle bundle;
        int i8;
        int iP3;
        synchronized (this.f4631a) {
            if (!this.f4632b) {
                if (TextUtils.isEmpty(null)) {
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    bundle.putString("accountName", null);
                }
                int i9 = 3;
                try {
                    String packageName = this.f4634d.f4471e.getPackageName();
                    int i10 = 21;
                    iP3 = 3;
                    while (true) {
                        if (i10 < 3) {
                            i10 = 0;
                            break;
                        }
                        if (bundle == null) {
                            try {
                                iP3 = this.f4634d.f4473g.P3(i10, packageName, "subs");
                            } catch (Exception e8) {
                                e = e8;
                                i9 = iP3;
                                com.google.android.gms.internal.play_billing.v.l("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                this.f4634d.f4467a = 0;
                                this.f4634d.f4473g = null;
                                i8 = 42;
                                iP3 = i9;
                            }
                        } else {
                            iP3 = this.f4634d.f4473g.V4(i10, packageName, "subs", bundle);
                        }
                        if (iP3 == 0) {
                            com.google.android.gms.internal.play_billing.v.j("BillingClient", "highestLevelSupportedForSubs: " + i10);
                            break;
                        }
                        i10--;
                    }
                    boolean z7 = true;
                    this.f4634d.f4476j = i10 >= 5;
                    this.f4634d.f4475i = i10 >= 3;
                    if (i10 < 3) {
                        com.google.android.gms.internal.play_billing.v.j("BillingClient", "In-app billing API does not support subscription on this device.");
                        i8 = 9;
                    } else {
                        i8 = 1;
                    }
                    int i11 = 21;
                    while (true) {
                        if (i11 < 3) {
                            break;
                        }
                        iP3 = bundle == null ? this.f4634d.f4473g.P3(i11, packageName, "inapp") : this.f4634d.f4473g.V4(i11, packageName, "inapp", bundle);
                        if (iP3 == 0) {
                            this.f4634d.f4477k = i11;
                            com.google.android.gms.internal.play_billing.v.j("BillingClient", "mHighestLevelSupportedForInApp: " + this.f4634d.f4477k);
                            break;
                        }
                        i11--;
                    }
                    c cVar = this.f4634d;
                    cVar.f4490x = cVar.f4477k >= 21;
                    c cVar2 = this.f4634d;
                    cVar2.f4489w = cVar2.f4477k >= 20;
                    c cVar3 = this.f4634d;
                    cVar3.f4488v = cVar3.f4477k >= 19;
                    c cVar4 = this.f4634d;
                    cVar4.f4487u = cVar4.f4477k >= 18;
                    c cVar5 = this.f4634d;
                    cVar5.f4486t = cVar5.f4477k >= 17;
                    c cVar6 = this.f4634d;
                    cVar6.f4485s = cVar6.f4477k >= 16;
                    c cVar7 = this.f4634d;
                    cVar7.f4484r = cVar7.f4477k >= 15;
                    c cVar8 = this.f4634d;
                    cVar8.f4483q = cVar8.f4477k >= 14;
                    c cVar9 = this.f4634d;
                    cVar9.f4482p = cVar9.f4477k >= 12;
                    c cVar10 = this.f4634d;
                    cVar10.f4481o = cVar10.f4477k >= 10;
                    c cVar11 = this.f4634d;
                    cVar11.f4480n = cVar11.f4477k >= 9;
                    c cVar12 = this.f4634d;
                    cVar12.f4479m = cVar12.f4477k >= 8;
                    c cVar13 = this.f4634d;
                    if (cVar13.f4477k < 6) {
                        z7 = false;
                    }
                    cVar13.f4478l = z7;
                    if (this.f4634d.f4477k < 3) {
                        com.google.android.gms.internal.play_billing.v.k("BillingClient", "In-app billing API version 3 is not supported on this device.");
                        i8 = 36;
                    }
                    if (iP3 == 0) {
                        this.f4634d.f4467a = 2;
                        if (this.f4634d.f4470d != null) {
                            n0 n0Var = this.f4634d.f4470d;
                            this.f4634d.f4471e.getPackageName();
                            n0Var.f(false);
                        }
                    } else {
                        this.f4634d.f4467a = 0;
                        this.f4634d.f4473g = null;
                    }
                } catch (Exception e9) {
                    e = e9;
                }
                y yVar = this.f4634d.f4472f;
                if (iP3 == 0) {
                    yVar.c(j1.c0.b(6));
                    d(z.f4662l);
                } else {
                    f fVar = z.f4651a;
                    yVar.a(j1.c0.a(i8, 6, fVar));
                    d(fVar);
                }
            }
        }
        return null;
    }

    final /* synthetic */ void b() {
        this.f4634d.f4467a = 0;
        this.f4634d.f4473g = null;
        y yVar = this.f4634d.f4472f;
        f fVar = z.f4664n;
        yVar.a(j1.c0.a(24, 6, fVar));
        d(fVar);
    }

    final void c() {
        synchronized (this.f4631a) {
            this.f4633c = null;
            this.f4632b = true;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.v.j("BillingClient", "Billing service connected.");
        this.f4634d.f4473g = r5.v0(iBinder);
        Callable callable = new Callable() { // from class: com.android.billingclient.api.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f4624a.a();
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f4627a.b();
            }
        };
        c cVar = this.f4634d;
        if (cVar.O(callable, 30000L, runnable, cVar.J()) == null) {
            c cVar2 = this.f4634d;
            f fVarM = cVar2.M();
            cVar2.f4472f.a(j1.c0.a(25, 6, fVarM));
            d(fVarM);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.v.k("BillingClient", "Billing service disconnected.");
        this.f4634d.f4472f.b(p5.y());
        this.f4634d.f4473g = null;
        this.f4634d.f4467a = 0;
        synchronized (this.f4631a) {
            j1.d dVar = this.f4633c;
            if (dVar != null) {
                dVar.onBillingServiceDisconnected();
            }
        }
    }
}
