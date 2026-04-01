package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ti1 implements yg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p50 f15105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z41 f15106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e41 f15107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fc1 f15108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f15109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wr2 f15110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wg0 f15111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ts2 f15112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f15113i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f15114j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f15115k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final l50 f15116l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final m50 f15117m;

    public ti1(l50 l50Var, m50 m50Var, p50 p50Var, z41 z41Var, e41 e41Var, fc1 fc1Var, Context context, wr2 wr2Var, wg0 wg0Var, ts2 ts2Var) {
        this.f15116l = l50Var;
        this.f15117m = m50Var;
        this.f15105a = p50Var;
        this.f15106b = z41Var;
        this.f15107c = e41Var;
        this.f15108d = fc1Var;
        this.f15109e = context;
        this.f15110f = wr2Var;
        this.f15111g = wg0Var;
        this.f15112h = ts2Var;
    }

    private final void t(View view) {
        try {
            p50 p50Var = this.f15105a;
            if (p50Var != null && !p50Var.R()) {
                this.f15105a.A5(g3.b.k3(view));
                this.f15107c.Z();
                if (((Boolean) h2.y.c().b(ns.U9)).booleanValue()) {
                    this.f15108d.f0();
                    return;
                }
                return;
            }
            l50 l50Var = this.f15116l;
            if (l50Var != null && !l50Var.S5()) {
                this.f15116l.P5(g3.b.k3(view));
                this.f15107c.Z();
                if (((Boolean) h2.y.c().b(ns.U9)).booleanValue()) {
                    this.f15108d.f0();
                    return;
                }
                return;
            }
            m50 m50Var = this.f15117m;
            if (m50Var == null || m50Var.A()) {
                return;
            }
            this.f15117m.P5(g3.b.k3(view));
            this.f15107c.Z();
            if (((Boolean) h2.y.c().b(ns.U9)).booleanValue()) {
                this.f15108d.f0();
            }
        } catch (RemoteException e8) {
            qg0.h("Failed to call handleClick", e8);
        }
    }

    private static final HashMap u(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    map2.put((String) entry.getKey(), view);
                }
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void A() {
        this.f15114j = true;
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void B() {
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final boolean R() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void U(String str) {
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void a(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void b(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.f15113i) {
                this.f15113i = g2.t.u().n(this.f15109e, this.f15111g.f16723a, this.f15110f.E.toString(), this.f15112h.f15304f);
            }
            if (this.f15115k) {
                p50 p50Var = this.f15105a;
                if (p50Var != null && !p50Var.f0()) {
                    this.f15105a.D();
                    this.f15106b.j();
                    return;
                }
                l50 l50Var = this.f15116l;
                if (l50Var != null && !l50Var.T5()) {
                    this.f15116l.G();
                    this.f15106b.j();
                    return;
                }
                m50 m50Var = this.f15117m;
                if (m50Var == null || m50Var.T5()) {
                    return;
                }
                this.f15117m.B();
                this.f15106b.j();
            }
        } catch (RemoteException e8) {
            qg0.h("Failed to call recordImpression", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void c(View view, Map map) {
        try {
            g3.a aVarK3 = g3.b.k3(view);
            p50 p50Var = this.f15105a;
            if (p50Var != null) {
                p50Var.I3(aVarK3);
                return;
            }
            l50 l50Var = this.f15116l;
            if (l50Var != null) {
                l50Var.A5(aVarK3);
                return;
            }
            m50 m50Var = this.f15117m;
            if (m50Var != null) {
                m50Var.S5(aVarK3);
            }
        } catch (RemoteException e8) {
            qg0.h("Failed to call untrackView", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final boolean d(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void e(View view) {
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce A[Catch: JSONException -> 0x0045, RemoteException -> 0x0124, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0045, blocks: (B:48:0x00b3, B:49:0x00c8, B:51:0x00ce), top: B:72:0x00b3 }] */
    @Override // com.google.android.gms.internal.ads.yg1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ti1.f(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final boolean f0() {
        return this.f15110f.N;
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void g(View view, View view2, Map map, Map map2, boolean z7, ImageView.ScaleType scaleType) {
        if (this.f15114j && this.f15110f.N) {
            return;
        }
        t(view);
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void h(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void i(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final int j() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final JSONObject k(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void l(View view, View view2, Map map, Map map2, boolean z7, ImageView.ScaleType scaleType, int i8) {
        String str;
        if (!this.f15114j) {
            str = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.";
        } else {
            if (this.f15110f.N) {
                t(view2);
                return;
            }
            str = "Custom click reporting for 3p ads failed. Ad unit id not in allow list.";
        }
        qg0.g(str);
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void m(px pxVar) {
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void n(h2.r1 r1Var) {
        qg0.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void o() {
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void p(h2.u1 u1Var) {
        qg0.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void q() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void r() {
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final JSONObject s(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void y() {
    }
}
