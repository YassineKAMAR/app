package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class nt1 implements i2.u, rn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wg0 f12252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ft1 f12253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private fm0 f12254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f12255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f12257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private h2.z1 f12258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f12259i;

    nt1(Context context, wg0 wg0Var) {
        this.f12251a = context;
        this.f12252b = wg0Var;
    }

    private final synchronized boolean g(h2.z1 z1Var) {
        if (!((Boolean) h2.y.c().b(ns.F8)).booleanValue()) {
            qg0.g("Ad inspector had an internal error.");
            try {
                z1Var.Z0(vt2.d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f12253c == null) {
            qg0.g("Ad inspector had an internal error.");
            try {
                g2.t.q().u(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                z1Var.Z0(vt2.d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f12255e && !this.f12256f) {
            if (g2.t.b().a() >= this.f12257g + ((long) ((Integer) h2.y.c().b(ns.I8)).intValue())) {
                return true;
            }
        }
        qg0.g("Ad inspector cannot be opened because it is already open.");
        try {
            z1Var.Z0(vt2.d(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // i2.u
    public final synchronized void G5() {
        this.f12256f = true;
        f("");
    }

    @Override // com.google.android.gms.internal.ads.rn0
    public final synchronized void a(boolean z7, int i8, String str, String str2) {
        if (z7) {
            j2.v1.k("Ad inspector loaded.");
            this.f12255e = true;
            f("");
            return;
        }
        qg0.g("Ad inspector failed to load.");
        try {
            g2.t.q().u(new Exception("Failed to load UI. Error code: " + i8 + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            h2.z1 z1Var = this.f12258h;
            if (z1Var != null) {
                z1Var.Z0(vt2.d(17, null, null));
            }
        } catch (RemoteException e8) {
            g2.t.q().u(e8, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.f12259i = true;
        this.f12254d.destroy();
    }

    public final Activity b() {
        fm0 fm0Var = this.f12254d;
        if (fm0Var == null || fm0Var.i()) {
            return null;
        }
        return this.f12254d.r();
    }

    public final void c(ft1 ft1Var) {
        this.f12253c = ft1Var;
    }

    final /* synthetic */ void d(String str) {
        JSONObject jSONObjectE = this.f12253c.e();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObjectE.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.f12254d.b("window.inspectorInfo", jSONObjectE.toString());
    }

    public final synchronized void e(h2.z1 z1Var, k00 k00Var, c00 c00Var) {
        if (g(z1Var)) {
            try {
                g2.t.B();
                fm0 fm0VarA = rm0.a(this.f12251a, vn0.a(), "", false, false, null, null, this.f12252b, null, null, null, vn.a(), null, null, null);
                this.f12254d = fm0VarA;
                tn0 tn0VarH = fm0VarA.H();
                if (tn0VarH == null) {
                    qg0.g("Failed to obtain a web view for the ad inspector");
                    try {
                        g2.t.q().u(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        z1Var.Z0(vt2.d(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e8) {
                        g2.t.q().u(e8, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.f12258h = z1Var;
                tn0VarH.S(null, null, null, null, null, false, null, null, null, null, null, null, null, null, k00Var, null, new j00(this.f12251a), c00Var, null);
                tn0VarH.y0(this);
                this.f12254d.loadUrl((String) h2.y.c().b(ns.G8));
                g2.t.k();
                i2.t.a(this.f12251a, new AdOverlayInfoParcel(this, this.f12254d, 1, this.f12252b), true);
                this.f12257g = g2.t.b().a();
            } catch (qm0 e9) {
                qg0.h("Failed to obtain a web view for the ad inspector", e9);
                try {
                    g2.t.q().u(e9, "InspectorUi.openInspector 0");
                    z1Var.Z0(vt2.d(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e10) {
                    g2.t.q().u(e10, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void f(final String str) {
        if (this.f12255e && this.f12256f) {
            eh0.f7326e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mt1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11538a.d(str);
                }
            });
        }
    }

    @Override // i2.u
    public final void h5() {
    }

    @Override // i2.u
    public final void k0() {
    }

    @Override // i2.u
    public final void q3() {
    }

    @Override // i2.u
    public final synchronized void v0(int i8) {
        this.f12254d.destroy();
        if (!this.f12259i) {
            j2.v1.k("Inspector closed.");
            h2.z1 z1Var = this.f12258h;
            if (z1Var != null) {
                try {
                    z1Var.Z0(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f12256f = false;
        this.f12255e = false;
        this.f12257g = 0L;
        this.f12259i = false;
        this.f12258h = null;
    }

    @Override // i2.u
    public final void y4() {
    }
}
