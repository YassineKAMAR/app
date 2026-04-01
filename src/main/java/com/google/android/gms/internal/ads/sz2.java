package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sz2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a03 f14877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f14878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f14879c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f14880d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f14881e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f14882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final tz2 f14883g;

    private sz2(a03 a03Var, WebView webView, String str, List list, String str2, String str3, tz2 tz2Var) {
        this.f14877a = a03Var;
        this.f14878b = webView;
        this.f14883g = tz2Var;
        this.f14882f = str2;
    }

    public static sz2 b(a03 a03Var, WebView webView, String str, String str2) {
        return new sz2(a03Var, webView, null, null, str, "", tz2.HTML);
    }

    public static sz2 c(a03 a03Var, WebView webView, String str, String str2) {
        return new sz2(a03Var, webView, null, null, str, "", tz2.JAVASCRIPT);
    }

    public final WebView a() {
        return this.f14878b;
    }

    public final tz2 d() {
        return this.f14883g;
    }

    public final a03 e() {
        return this.f14877a;
    }

    public final String f() {
        return this.f14882f;
    }

    public final String g() {
        return this.f14881e;
    }

    public final List h() {
        return Collections.unmodifiableList(this.f14879c);
    }

    public final Map i() {
        return Collections.unmodifiableMap(this.f14880d);
    }
}
