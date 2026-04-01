package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class wj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ej1 f16753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gh f16754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wg0 f16755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g2.a f16756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final vn f16757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f16758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final lv f16759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final pk1 f16760i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final gn1 f16761j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f16762k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final am1 f16763l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final eq1 f16764m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final mx2 f16765n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final jz2 f16766o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final q12 f16767p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final b22 f16768q;

    public wj1(Context context, ej1 ej1Var, gh ghVar, wg0 wg0Var, g2.a aVar, vn vnVar, Executor executor, ts2 ts2Var, pk1 pk1Var, gn1 gn1Var, ScheduledExecutorService scheduledExecutorService, eq1 eq1Var, mx2 mx2Var, jz2 jz2Var, q12 q12Var, am1 am1Var, b22 b22Var) {
        this.f16752a = context;
        this.f16753b = ej1Var;
        this.f16754c = ghVar;
        this.f16755d = wg0Var;
        this.f16756e = aVar;
        this.f16757f = vnVar;
        this.f16758g = executor;
        this.f16759h = ts2Var.f15307i;
        this.f16760i = pk1Var;
        this.f16761j = gn1Var;
        this.f16762k = scheduledExecutorService;
        this.f16764m = eq1Var;
        this.f16765n = mx2Var;
        this.f16766o = jz2Var;
        this.f16767p = q12Var;
        this.f16763l = am1Var;
        this.f16768q = b22Var;
    }

    public static final h2.l3 i(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return r(jSONObjectOptJSONObject);
    }

    public static final List j(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return jb3.z();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return jb3.z();
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
            h2.l3 l3VarR = r(jSONArrayOptJSONArray.optJSONObject(i8));
            if (l3VarR != null) {
                arrayList.add(l3VarR);
            }
        }
        return jb3.x(arrayList);
    }

    private final h2.w4 k(int i8, int i9) {
        if (i8 == 0) {
            if (i9 == 0) {
                return h2.w4.n();
            }
            i8 = 0;
        }
        return new h2.w4(this.f16752a, new z1.h(i8, i9));
    }

    private static x3.d l(x3.d dVar, Object obj) {
        final Object obj2 = null;
        return zf3.f(dVar, Exception.class, new gf3(obj2) { // from class: com.google.android.gms.internal.ads.uj1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj3) {
                j2.v1.l("Error during loading assets.", (Exception) obj3);
                return zf3.h(null);
            }
        }, eh0.f7327f);
    }

    private static x3.d m(boolean z7, final x3.d dVar, Object obj) {
        return z7 ? zf3.n(dVar, new gf3() { // from class: com.google.android.gms.internal.ads.vj1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj2) {
                return obj2 != null ? dVar : zf3.g(new y62(1, "Retrieve required value in native ad response failed."));
            }
        }, eh0.f7327f) : l(dVar, null);
    }

    private final x3.d n(JSONObject jSONObject, boolean z7) {
        if (jSONObject == null) {
            return zf3.h(null);
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return zf3.h(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z7) {
            return zf3.h(new jv(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return m(jSONObject.optBoolean("require"), zf3.m(this.f16753b.b(strOptString, dOptDouble, zOptBoolean), new z73() { // from class: com.google.android.gms.internal.ads.mj1
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                return new jv(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.f16758g), null);
    }

    private final x3.d o(JSONArray jSONArray, boolean z7, boolean z8) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zf3.h(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z8 ? jSONArray.length() : 1;
        for (int i8 = 0; i8 < length; i8++) {
            arrayList.add(n(jSONArray.optJSONObject(i8), z7));
        }
        return zf3.m(zf3.d(arrayList), new z73() { // from class: com.google.android.gms.internal.ads.rj1
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (jv jvVar : (List) obj) {
                    if (jvVar != null) {
                        arrayList2.add(jvVar);
                    }
                }
                return arrayList2;
            }
        }, this.f16758g);
    }

    private final x3.d p(JSONObject jSONObject, wr2 wr2Var, as2 as2Var) {
        final x3.d dVarB = this.f16760i.b(jSONObject.optString("base_url"), jSONObject.optString("html"), wr2Var, as2Var, k(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zf3.n(dVarB, new gf3() { // from class: com.google.android.gms.internal.ads.nj1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) throws y62 {
                fm0 fm0Var = (fm0) obj;
                if (fm0Var == null || fm0Var.z() == null) {
                    throw new y62(1, "Retrieve video view in html5 ad response failed.");
                }
                return dVarB;
            }
        }, eh0.f7327f);
    }

    private static Integer q(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final h2.l3 r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new h2.l3(strOptString, strOptString2);
    }

    final /* synthetic */ fv a(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numQ = q(jSONObject, "bg_color");
        Integer numQ2 = q(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new fv(strOptString, list, numQ, numQ2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.f16759h.f11059e, zOptBoolean);
    }

    final /* synthetic */ x3.d b(h2.w4 w4Var, wr2 wr2Var, as2 as2Var, String str, String str2, Object obj) {
        fm0 fm0VarA = this.f16761j.a(w4Var, wr2Var, as2Var);
        final ih0 ih0VarF = ih0.f(fm0VarA);
        xl1 xl1VarB = this.f16763l.b();
        fm0VarA.H().S(xl1VarB, xl1VarB, xl1VarB, xl1VarB, xl1VarB, false, null, new g2.b(this.f16752a, null, null), null, null, this.f16767p, this.f16766o, this.f16764m, this.f16765n, null, xl1VarB, null, null, null);
        if (((Boolean) h2.y.c().b(ns.C3)).booleanValue()) {
            fm0VarA.f1("/getNativeAdViewSignals", pz.f13217s);
        }
        fm0VarA.f1("/getNativeClickMeta", pz.f13218t);
        fm0VarA.H().y0(new rn0() { // from class: com.google.android.gms.internal.ads.qj1
            @Override // com.google.android.gms.internal.ads.rn0
            public final void a(boolean z7, int i8, String str3, String str4) {
                ih0 ih0Var = ih0VarF;
                if (z7) {
                    ih0Var.g();
                    return;
                }
                ih0Var.e(new y62(1, "Image Web View failed to load. Error code: " + i8 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        fm0VarA.g1(str, str2, null);
        return ih0VarF;
    }

    final /* synthetic */ x3.d c(String str, Object obj) throws qm0 {
        g2.t.B();
        fm0 fm0VarA = rm0.a(this.f16752a, vn0.a(), "native-omid", false, false, this.f16754c, null, this.f16755d, null, null, this.f16756e, this.f16757f, null, null, this.f16768q);
        final ih0 ih0VarF = ih0.f(fm0VarA);
        fm0VarA.H().y0(new rn0() { // from class: com.google.android.gms.internal.ads.sj1
            @Override // com.google.android.gms.internal.ads.rn0
            public final void a(boolean z7, int i8, String str2, String str3) {
                ih0VarF.g();
            }
        });
        if (((Boolean) h2.y.c().b(ns.V4)).booleanValue()) {
            fm0VarA.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            fm0VarA.loadData(str, "text/html", "UTF-8");
        }
        return ih0VarF;
    }

    public final x3.d d(JSONObject jSONObject, String str) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return zf3.h(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return m(jSONObjectOptJSONObject.optBoolean("require"), zf3.m(o(jSONArrayOptJSONArray, false, true), new z73() { // from class: com.google.android.gms.internal.ads.tj1
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                return this.f15129a.a(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.f16758g), null);
    }

    public final x3.d e(JSONObject jSONObject, String str) {
        return n(jSONObject.optJSONObject(str), this.f16759h.f11056b);
    }

    public final x3.d f(JSONObject jSONObject, String str) {
        lv lvVar = this.f16759h;
        return o(jSONObject.optJSONArray("images"), lvVar.f11056b, lvVar.f11058d);
    }

    public final x3.d g(JSONObject jSONObject, String str, final wr2 wr2Var, final as2 as2Var) {
        if (!((Boolean) h2.y.c().b(ns.t9)).booleanValue()) {
            return zf3.h(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zf3.h(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zf3.h(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final h2.w4 w4VarK = k(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zf3.h(null);
        }
        final x3.d dVarN = zf3.n(zf3.h(null), new gf3() { // from class: com.google.android.gms.internal.ads.oj1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f12498a.b(w4VarK, wr2Var, as2Var, strOptString, strOptString2, obj);
            }
        }, eh0.f7326e);
        return zf3.n(dVarN, new gf3() { // from class: com.google.android.gms.internal.ads.pj1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) throws y62 {
                if (((fm0) obj) != null) {
                    return dVarN;
                }
                throw new y62(1, "Retrieve Web View from image ad response failed.");
            }
        }, eh0.f7327f);
    }

    public final x3.d h(JSONObject jSONObject, wr2 wr2Var, as2 as2Var) {
        x3.d dVarA;
        JSONObject jSONObjectG = j2.y0.g(jSONObject, "html_containers", "instream");
        if (jSONObjectG != null) {
            return p(jSONObjectG, wr2Var, as2Var);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject != null) {
            String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
            boolean z7 = false;
            if (((Boolean) h2.y.c().b(ns.s9)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
                z7 = true;
            }
            if (!TextUtils.isEmpty(strOptString)) {
                if (!z7) {
                    dVarA = this.f16760i.a(jSONObjectOptJSONObject);
                }
                return l(zf3.o(dVarA, ((Integer) h2.y.c().b(ns.D3)).intValue(), TimeUnit.SECONDS, this.f16762k), null);
            }
            if (!z7) {
                qg0.g("Required field 'vast_xml' or 'html' is missing");
            }
            dVarA = p(jSONObjectOptJSONObject, wr2Var, as2Var);
            return l(zf3.o(dVarA, ((Integer) h2.y.c().b(ns.D3)).intValue(), TimeUnit.SECONDS, this.f16762k), null);
        }
        return zf3.h(null);
    }
}
