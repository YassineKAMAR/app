package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tu0 implements wt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CookieManager f15333a;

    public tu0(Context context) {
        this.f15333a = g2.t.s().b(context);
    }

    @Override // com.google.android.gms.internal.ads.wt0
    public final void a(Map map) {
        if (this.f15333a == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f15333a.setCookie((String) h2.y.c().b(ns.M0), str);
            return;
        }
        String str2 = (String) h2.y.c().b(ns.M0);
        String cookie = this.f15333a.getCookie(str2);
        if (cookie == null) {
            return;
        }
        List listF = z83.c(w73.c(';')).f(cookie);
        for (int i8 = 0; i8 < listF.size(); i8++) {
            CookieManager cookieManager = this.f15333a;
            Iterator it = z83.c(w73.c('=')).d((String) listF.get(i8)).iterator();
            it.getClass();
            if (!it.hasNext()) {
                throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
            }
            cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) h2.y.c().b(ns.f12217w0))));
        }
    }
}
