package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class jn0 extends mm0 {
    public jn0(fm0 fm0Var, vn vnVar, boolean z7, b22 b22Var) {
        super(fm0Var, vnVar, z7, new z70(fm0Var, fm0Var.N(), new wr(fm0Var.getContext())), null, b22Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse g0(WebView webView, String str, Map map) {
        if (!(webView instanceof fm0)) {
            qg0.g("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        fm0 fm0Var = (fm0) webView;
        nd0 nd0Var = this.f11407x;
        if (nd0Var != null) {
            nd0Var.a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.D(str, map);
        }
        if (fm0Var.H() != null) {
            fm0Var.H().N();
        }
        String str2 = (String) h2.y.c().b(fm0Var.I().i() ? ns.O : fm0Var.X0() ? ns.N : ns.M);
        g2.t.r();
        return j2.k2.X(fm0Var.getContext(), fm0Var.v().f16723a, str2);
    }
}
