package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class w03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a23 f16583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f16584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16585c;

    public w03() {
        b();
        this.f16583a = new a23(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView a() {
        return (WebView) this.f16583a.get();
    }

    public final void b() {
        this.f16584b = System.nanoTime();
        this.f16585c = 1;
    }

    public void c() {
        this.f16583a.clear();
    }

    public final void d(String str, long j8) {
        if (j8 < this.f16584b || this.f16585c == 3) {
            return;
        }
        this.f16585c = 3;
        p03.a().g(a(), str);
    }

    public final void e(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c13.e(jSONObject, DiagnosticsEntry.Event.TIMESTAMP_KEY, Long.valueOf(date.getTime()));
        p03.a().f(a(), jSONObject);
    }

    public final void f(String str, long j8) {
        if (j8 >= this.f16584b) {
            this.f16585c = 2;
            p03.a().g(a(), str);
        }
    }

    public void g(uz2 uz2Var, sz2 sz2Var) {
        h(uz2Var, sz2Var, null);
    }

    protected final void h(uz2 uz2Var, sz2 sz2Var, JSONObject jSONObject) {
        String strH = uz2Var.h();
        JSONObject jSONObject2 = new JSONObject();
        c13.e(jSONObject2, "environment", "app");
        c13.e(jSONObject2, "adSessionType", sz2Var.d());
        JSONObject jSONObject3 = new JSONObject();
        c13.e(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        c13.e(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        c13.e(jSONObject3, "os", "Android");
        c13.e(jSONObject2, "deviceInfo", jSONObject3);
        c13.e(jSONObject2, "deviceCategory", b13.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c13.e(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        c13.e(jSONObject4, "partnerName", sz2Var.e().b());
        c13.e(jSONObject4, "partnerVersion", sz2Var.e().c());
        c13.e(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        c13.e(jSONObject5, "libraryVersion", "1.4.8-google_20230803");
        c13.e(jSONObject5, "appId", m03.b().a().getApplicationContext().getPackageName());
        c13.e(jSONObject2, "app", jSONObject5);
        if (sz2Var.f() != null) {
            c13.e(jSONObject2, "contentUrl", sz2Var.f());
        }
        c13.e(jSONObject2, "customReferenceData", sz2Var.g());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = sz2Var.h().iterator();
        if (it.hasNext()) {
            throw null;
        }
        p03.a().h(a(), strH, jSONObject2, jSONObject6, jSONObject);
    }

    public final void i(float f8) {
        p03.a().e(a(), f8);
    }

    final void j(WebView webView) {
        this.f16583a = new a23(webView);
    }

    public void k() {
    }

    public final boolean l() {
        return this.f16583a.get() != 0;
    }
}
