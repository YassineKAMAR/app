package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class qu1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f13769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f13770b;

    public qu1(w84 w84Var, w84 w84Var2) {
        this.f13769a = w84Var;
        this.f13770b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        bx2 bx2Var = (bx2) this.f13769a.k();
        final CookieManager cookieManagerB = g2.t.s().b((Context) this.f13770b.k());
        sw2 sw2VarI = lw2.a(new Callable() { // from class: com.google.android.gms.internal.ads.nu1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = cookieManagerB;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) h2.y.c().b(ns.M0));
            }
        }, vw2.WEBVIEW_COOKIE, bx2Var).i(1L, TimeUnit.SECONDS);
        final ou1 ou1Var = new dw2() { // from class: com.google.android.gms.internal.ads.ou1
            @Override // com.google.android.gms.internal.ads.dw2
            public final Object a(Object obj) {
                return "";
            }
        };
        return sw2VarI.c(Exception.class, new gf3() { // from class: com.google.android.gms.internal.ads.mw2
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return zf3.h("");
            }
        }).a();
    }
}
