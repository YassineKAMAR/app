package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a13 extends w03 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WebView f4951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f4952e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f4953f;

    public a13(Map map, String str) {
        this.f4953f = map;
    }

    @Override // com.google.android.gms.internal.ads.w03
    public final void c() {
        super.c();
        new Handler().postDelayed(new z03(this), Math.max(4000 - (this.f4952e == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f4952e.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f4951d = null;
    }

    @Override // com.google.android.gms.internal.ads.w03
    public final void g(uz2 uz2Var, sz2 sz2Var) {
        JSONObject jSONObject = new JSONObject();
        Map mapI = sz2Var.i();
        Iterator it = mapI.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        h(uz2Var, sz2Var, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.w03
    public final void k() {
        WebView webView = new WebView(m03.b().a());
        this.f4951d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f4951d.getSettings().setAllowContentAccess(false);
        this.f4951d.getSettings().setAllowFileAccess(false);
        this.f4951d.setWebViewClient(new y03(this));
        j(this.f4951d);
        p03.i(this.f4951d, null);
        Iterator it = this.f4953f.keySet().iterator();
        if (!it.hasNext()) {
            this.f4952e = Long.valueOf(System.nanoTime());
        } else {
            throw null;
        }
    }
}
