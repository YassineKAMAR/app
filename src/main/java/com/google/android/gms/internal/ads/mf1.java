package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class mf1 implements yg1 {
    private h2.r1 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bh1 f11252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f11253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ul1 f11254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qg1 f11255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final gh f11256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final z41 f11257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e41 f11258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final fc1 f11259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final wr2 f11260j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final wg0 f11261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ts2 f11262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ew0 f11263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final vh1 f11264n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e3.e f11265o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ac1 f11266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final jz2 f11267q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final qy2 f11268r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f11270t;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f11269s = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f11271u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f11272v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Point f11273w = new Point();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Point f11274x = new Point();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f11275y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f11276z = 0;

    public mf1(Context context, bh1 bh1Var, JSONObject jSONObject, ul1 ul1Var, qg1 qg1Var, gh ghVar, z41 z41Var, e41 e41Var, fc1 fc1Var, wr2 wr2Var, wg0 wg0Var, ts2 ts2Var, ew0 ew0Var, vh1 vh1Var, e3.e eVar, ac1 ac1Var, jz2 jz2Var, qy2 qy2Var) {
        this.f11251a = context;
        this.f11252b = bh1Var;
        this.f11253c = jSONObject;
        this.f11254d = ul1Var;
        this.f11255e = qg1Var;
        this.f11256f = ghVar;
        this.f11257g = z41Var;
        this.f11258h = e41Var;
        this.f11259i = fc1Var;
        this.f11260j = wr2Var;
        this.f11261k = wg0Var;
        this.f11262l = ts2Var;
        this.f11263m = ew0Var;
        this.f11264n = vh1Var;
        this.f11265o = eVar;
        this.f11266p = ac1Var;
        this.f11267q = jz2Var;
        this.f11268r = qy2Var;
    }

    private final String t(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iP = this.f11255e.P();
        if (iP == 1) {
            return "1099";
        }
        if (iP == 2) {
            return "2099";
        }
        if (iP != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean u(String str) {
        JSONObject jSONObjectOptJSONObject = this.f11253c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    private final boolean v() {
        return this.f11253c.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean w(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z7) {
        ul1 ul1Var;
        String str2;
        qz hf1Var;
        a3.o.e("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f11253c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) h2.y.c().b(ns.f12133m3)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z7);
            Context context = this.f11251a;
            JSONObject jSONObject7 = new JSONObject();
            g2.t.r();
            DisplayMetrics displayMetricsT = j2.k2.T((WindowManager) context.getSystemService("window"));
            if1 if1Var = null;
            byte b8 = 0;
            byte b9 = 0;
            try {
                jSONObject7.put("width", h2.v.b().f(context, displayMetricsT.widthPixels));
                jSONObject7.put("height", h2.v.b().f(context, displayMetricsT.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) h2.y.c().b(ns.l8)).booleanValue()) {
                ul1Var = this.f11254d;
                str2 = "/clickRecorded";
                hf1Var = new jf1(this, if1Var);
            } else {
                ul1Var = this.f11254d;
                str2 = "/logScionEvent";
                hf1Var = new hf1(this, b8 == true ? 1 : 0);
            }
            ul1Var.i(str2, hf1Var);
            this.f11254d.i("/nativeImpression", new lf1(this, b9 == true ? 1 : 0));
            hh0.a(this.f11254d.d("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f11269s) {
                return true;
            }
            this.f11269s = g2.t.u().n(this.f11251a, this.f11261k.f16723a, this.f11260j.E.toString(), this.f11262l.f15304f);
            return true;
        } catch (JSONException e8) {
            qg0.e("Unable to create impression JSON.", e8);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void A() {
        this.f11272v = true;
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void B() {
        w(null, null, null, null, null, null, false);
    }

    protected final void D(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z7, boolean z8) {
        String strH;
        a3.o.e("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f11253c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.f11252b.c(this.f11255e.a()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f11255e.P());
            jSONObject8.put("view_aware_api_used", z7);
            lv lvVar = this.f11262l.f15307i;
            jSONObject8.put("custom_mute_requested", lvVar != null && lvVar.f11061g);
            jSONObject8.put("custom_mute_enabled", (this.f11255e.h().isEmpty() || this.f11255e.X() == null) ? false : true);
            if (this.f11264n.a() != null && this.f11253c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put(DiagnosticsEntry.Event.TIMESTAMP_KEY, this.f11265o.a());
            if (this.f11272v && v()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z8) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.f11252b.c(this.f11255e.a()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = this.f11253c.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strH = this.f11256f.c().h(this.f11251a, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e8) {
                qg0.e("Exception obtaining click signals", e8);
                strH = null;
            }
            jSONObject8.put("click_signals", strH);
            if (((Boolean) h2.y.c().b(ns.f12213v4)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) h2.y.c().b(ns.p8)).booleanValue() && e3.m.k()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) h2.y.c().b(ns.q8)).booleanValue() && e3.m.k()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long jA = this.f11265o.a();
            jSONObject9.put("time_from_last_touch_down", jA - this.f11275y);
            jSONObject9.put("time_from_last_touch", jA - this.f11276z);
            jSONObject7.put("touch_signal", jSONObject9);
            hh0.a(this.f11254d.d("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e9) {
            qg0.e("Unable to create click JSON.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final boolean R() {
        if (j() == 0) {
            return true;
        }
        if (((Boolean) h2.y.c().b(ns.ya)).booleanValue()) {
            return this.f11262l.f15307i.f11064j;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void U(String str) {
        D(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void a(View view, MotionEvent motionEvent, View view2) {
        this.f11273w = j2.b1.a(motionEvent, view2);
        long jA = this.f11265o.a();
        this.f11276z = jA;
        if (motionEvent.getAction() == 0) {
            this.f11275y = jA;
            this.f11274x = this.f11273w;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.f11273w;
        motionEventObtain.setLocation(point.x, point.y);
        this.f11256f.d(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void b(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        String strG;
        Context context = this.f11251a;
        JSONObject jSONObjectD = j2.b1.d(context, map, map2, view, scaleType);
        JSONObject jSONObjectG = j2.b1.g(context, view);
        JSONObject jSONObjectF = j2.b1.f(view);
        JSONObject jSONObjectE = j2.b1.e(context, view);
        if (((Boolean) h2.y.c().b(ns.f12133m3)).booleanValue()) {
            try {
                strG = this.f11256f.c().g(this.f11251a, view, null);
            } catch (Exception unused) {
                qg0.d("Exception getting data.");
                strG = null;
            }
        } else {
            strG = null;
        }
        w(jSONObjectG, jSONObjectD, jSONObjectF, jSONObjectE, strG, null, j2.b1.h(this.f11251a, this.f11260j));
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void c(View view, Map map) {
        this.f11273w = new Point();
        this.f11274x = new Point();
        if (view != null) {
            this.f11266p.B0(view);
        }
        this.f11270t = false;
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final boolean d(Bundle bundle) {
        if (u("impression_reporting")) {
            return w(null, null, null, null, null, h2.v.b().n(bundle, null), false);
        }
        qg0.d("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void e(View view) {
        if (!this.f11253c.optBoolean("custom_one_point_five_click_enabled", false)) {
            qg0.g("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        vh1 vh1Var = this.f11264n;
        if (view == null) {
            return;
        }
        view.setOnClickListener(vh1Var);
        view.setClickable(true);
        vh1Var.f16276g = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void f(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f11273w = new Point();
        this.f11274x = new Point();
        if (!this.f11270t) {
            this.f11266p.A0(view);
            this.f11270t = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f11263m.h(this);
        boolean zI = j2.b1.i(this.f11261k.f16725c);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zI) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zI) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final boolean f0() {
        return v();
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void g(View view, View view2, Map map, Map map2, boolean z7, ImageView.ScaleType scaleType) {
        Context context = this.f11251a;
        JSONObject jSONObjectD = j2.b1.d(context, map, map2, view2, scaleType);
        JSONObject jSONObjectG = j2.b1.g(context, view2);
        JSONObject jSONObjectF = j2.b1.f(view2);
        JSONObject jSONObjectE = j2.b1.e(context, view2);
        String strT = t(view, map);
        D(true == ((Boolean) h2.y.c().b(ns.f12196t3)).booleanValue() ? view2 : view, jSONObjectG, jSONObjectD, jSONObjectF, jSONObjectE, strT, j2.b1.c(strT, context, this.f11274x, this.f11273w), null, z7, false);
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void h(Bundle bundle) {
        if (bundle == null) {
            qg0.b("Click data is null. No click is reported.");
        } else if (!u("click_reporting")) {
            qg0.d("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            D(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, h2.v.b().n(bundle, null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void i(Bundle bundle) {
        if (bundle == null) {
            qg0.b("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!u("touch_reporting")) {
            qg0.d("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.f11256f.c().d((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final int j() {
        if (this.f11262l.f15307i == null) {
            return 0;
        }
        if (((Boolean) h2.y.c().b(ns.ya)).booleanValue()) {
            return this.f11262l.f15307i.f11063i;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final JSONObject k(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f11251a;
        JSONObject jSONObjectD = j2.b1.d(context, map, map2, view, scaleType);
        JSONObject jSONObjectG = j2.b1.g(context, view);
        JSONObject jSONObjectF = j2.b1.f(view);
        JSONObject jSONObjectE = j2.b1.e(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectD);
            jSONObject.put("ad_view_signal", jSONObjectG);
            jSONObject.put("scroll_view_signal", jSONObjectF);
            jSONObject.put("lock_screen_signal", jSONObjectE);
            return jSONObject;
        } catch (JSONException e8) {
            qg0.e("Unable to create native ad view signals JSON.", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void l(View view, View view2, Map map, Map map2, boolean z7, ImageView.ScaleType scaleType, int i8) {
        JSONObject jSONObject;
        boolean z8 = false;
        if (this.f11253c.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) h2.y.c().b(ns.ya)).booleanValue()) {
                z8 = true;
            }
        }
        if (!z8) {
            if (!this.f11272v) {
                qg0.b("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!v()) {
                qg0.b("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject jSONObjectD = j2.b1.d(this.f11251a, map, map2, view2, scaleType);
        JSONObject jSONObjectG = j2.b1.g(this.f11251a, view2);
        JSONObject jSONObjectF = j2.b1.f(view2);
        JSONObject jSONObjectE = j2.b1.e(this.f11251a, view2);
        String strT = t(view, map);
        JSONObject jSONObjectC = j2.b1.c(strT, this.f11251a, this.f11274x, this.f11273w);
        if (z8) {
            try {
                JSONObject jSONObject2 = this.f11253c;
                Point point = this.f11274x;
                Point point2 = this.f11273w;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i8);
                    } catch (Exception e8) {
                        e = e8;
                        qg0.e("Error occurred while grabbing custom click gesture signals.", e);
                    }
                } catch (Exception e9) {
                    e = e9;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e10) {
                qg0.e("Error occurred while adding CustomClickGestureSignals to adJson.", e10);
                g2.t.q().u(e10, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        D(view2, jSONObjectG, jSONObjectD, jSONObjectF, jSONObjectE, strT, jSONObjectC, null, z7, true);
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void m(px pxVar) {
        if (this.f11253c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f11264n.c(pxVar);
        } else {
            qg0.g("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void n(h2.r1 r1Var) {
        this.A = r1Var;
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void o() {
        if (this.f11253c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f11264n.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void p(h2.u1 u1Var) {
        try {
            if (this.f11271u) {
                return;
            }
            if (u1Var == null) {
                qg1 qg1Var = this.f11255e;
                if (qg1Var.X() != null) {
                    this.f11271u = true;
                    this.f11267q.c(qg1Var.X().n(), this.f11268r);
                    q();
                    return;
                }
            }
            this.f11271u = true;
            this.f11267q.c(u1Var.n(), this.f11268r);
            q();
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void q() {
        try {
            h2.r1 r1Var = this.A;
            if (r1Var != null) {
                r1Var.m();
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void r() {
        this.f11254d.f();
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final JSONObject s(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject jSONObjectK = k(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f11272v && v()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectK != null) {
                jSONObject.put("nas", jSONObjectK);
            }
        } catch (JSONException e8) {
            qg0.e("Unable to create native click meta data JSON.", e8);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.yg1
    public final void y() {
        a3.o.e("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f11253c);
            hh0.a(this.f11254d.d("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e8) {
            qg0.e("", e8);
        }
    }
}
