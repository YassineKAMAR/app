package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class pk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ts2 f12921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f12922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gn1 f12923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final am1 f12924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f12925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final eq1 f12926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final mx2 f12927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final jz2 f12928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q12 f12929i;

    public pk1(ts2 ts2Var, Executor executor, gn1 gn1Var, Context context, eq1 eq1Var, mx2 mx2Var, jz2 jz2Var, q12 q12Var, am1 am1Var) {
        this.f12921a = ts2Var;
        this.f12922b = executor;
        this.f12923c = gn1Var;
        this.f12925e = context;
        this.f12926f = eq1Var;
        this.f12927g = mx2Var;
        this.f12928h = jz2Var;
        this.f12929i = q12Var;
        this.f12924d = am1Var;
    }

    private final void h(fm0 fm0Var) {
        i(fm0Var);
        fm0Var.f1("/video", pz.f13210l);
        fm0Var.f1("/videoMeta", pz.f13211m);
        fm0Var.f1("/precache", new qk0());
        fm0Var.f1("/delayPageLoaded", pz.f13214p);
        fm0Var.f1("/instrument", pz.f13212n);
        fm0Var.f1("/log", pz.f13205g);
        fm0Var.f1("/click", new ny(null, 0 == true ? 1 : 0));
        if (this.f12921a.f15300b != null) {
            fm0Var.H().i0(true);
            fm0Var.f1("/open", new b00(null, null, null, null, null, null));
        } else {
            fm0Var.H().i0(false);
        }
        if (g2.t.p().z(fm0Var.getContext())) {
            fm0Var.f1("/logScionEvent", new vz(fm0Var.getContext()));
        }
    }

    private static final void i(fm0 fm0Var) {
        fm0Var.f1("/videoClicked", pz.f13206h);
        fm0Var.H().a0(true);
        if (((Boolean) h2.y.c().b(ns.C3)).booleanValue()) {
            fm0Var.f1("/getNativeAdViewSignals", pz.f13217s);
        }
        fm0Var.f1("/getNativeClickMeta", pz.f13218t);
    }

    public final x3.d a(final JSONObject jSONObject) {
        return zf3.n(zf3.n(zf3.h(null), new gf3() { // from class: com.google.android.gms.internal.ads.fk1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f7787a.e(obj);
            }
        }, this.f12922b), new gf3() { // from class: com.google.android.gms.internal.ads.ek1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f7385a.c(jSONObject, (fm0) obj);
            }
        }, this.f12922b);
    }

    public final x3.d b(final String str, final String str2, final wr2 wr2Var, final as2 as2Var, final h2.w4 w4Var) {
        return zf3.n(zf3.h(null), new gf3() { // from class: com.google.android.gms.internal.ads.dk1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f6778a.d(w4Var, wr2Var, as2Var, str, str2, obj);
            }
        }, this.f12922b);
    }

    final /* synthetic */ x3.d c(JSONObject jSONObject, final fm0 fm0Var) {
        final ih0 ih0VarF = ih0.f(fm0Var);
        fm0Var.H0(this.f12921a.f15300b != null ? vn0.d() : vn0.e());
        fm0Var.H().y0(new rn0() { // from class: com.google.android.gms.internal.ads.gk1
            @Override // com.google.android.gms.internal.ads.rn0
            public final void a(boolean z7, int i8, String str, String str2) {
                this.f8373a.f(fm0Var, ih0VarF, z7, i8, str, str2);
            }
        });
        fm0Var.x0("google.afma.nativeAds.renderVideo", jSONObject);
        return ih0VarF;
    }

    final /* synthetic */ x3.d d(h2.w4 w4Var, wr2 wr2Var, as2 as2Var, String str, String str2, Object obj) {
        final fm0 fm0VarA = this.f12923c.a(w4Var, wr2Var, as2Var);
        final ih0 ih0VarF = ih0.f(fm0VarA);
        if (this.f12921a.f15300b != null) {
            h(fm0VarA);
            fm0VarA.H0(vn0.d());
        } else {
            xl1 xl1VarB = this.f12924d.b();
            fm0VarA.H().S(xl1VarB, xl1VarB, xl1VarB, xl1VarB, xl1VarB, false, null, new g2.b(this.f12925e, null, null), null, null, this.f12929i, this.f12928h, this.f12926f, this.f12927g, null, xl1VarB, null, null, null);
            i(fm0VarA);
        }
        fm0VarA.H().y0(new rn0() { // from class: com.google.android.gms.internal.ads.hk1
            @Override // com.google.android.gms.internal.ads.rn0
            public final void a(boolean z7, int i8, String str3, String str4) {
                this.f8804a.g(fm0VarA, ih0VarF, z7, i8, str3, str4);
            }
        });
        fm0VarA.g1(str, str2, null);
        return ih0VarF;
    }

    final /* synthetic */ x3.d e(Object obj) {
        fm0 fm0VarA = this.f12923c.a(h2.w4.n(), null, null);
        final ih0 ih0VarF = ih0.f(fm0VarA);
        h(fm0VarA);
        fm0VarA.H().F(new sn0() { // from class: com.google.android.gms.internal.ads.ik1
            @Override // com.google.android.gms.internal.ads.sn0
            public final void j() {
                ih0VarF.g();
            }
        });
        fm0VarA.loadUrl((String) h2.y.c().b(ns.B3));
        return ih0VarF;
    }

    final /* synthetic */ void f(fm0 fm0Var, ih0 ih0Var, boolean z7, int i8, String str, String str2) {
        if (this.f12921a.f15299a != null && fm0Var.z() != null) {
            fm0Var.z().S5(this.f12921a.f15299a);
        }
        ih0Var.g();
    }

    final /* synthetic */ void g(fm0 fm0Var, ih0 ih0Var, boolean z7, int i8, String str, String str2) {
        if (z7) {
            if (this.f12921a.f15299a != null && fm0Var.z() != null) {
                fm0Var.z().S5(this.f12921a.f15299a);
            }
            ih0Var.g();
            return;
        }
        ih0Var.e(new y62(1, "Html video Web View failed to load. Error code: " + i8 + ", Description: " + str + ", Failing URL: " + str2));
    }
}
