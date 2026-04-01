package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ux2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15922c;

    public ux2(Context context, wg0 wg0Var) {
        this.f15920a = context;
        this.f15921b = context.getPackageName();
        this.f15922c = wg0Var.f16723a;
    }

    public final void a(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        g2.t.r();
        map.put("device", j2.k2.S());
        map.put("app", this.f15921b);
        g2.t.r();
        map.put("is_lite_sdk", true != j2.k2.d(this.f15920a) ? "0" : "1");
        fs fsVar = ns.f12021a;
        List listB = h2.y.a().b();
        if (((Boolean) h2.y.c().b(ns.Q6)).booleanValue()) {
            listB.addAll(g2.t.q().h().o().d());
        }
        map.put("e", TextUtils.join(com.amazon.a.a.o.b.f.f3942a, listB));
        map.put(com.amazon.a.a.o.b.I, this.f15922c);
        if (((Boolean) h2.y.c().b(ns.qa)).booleanValue()) {
            g2.t.r();
            map.put("is_bstar", true == j2.k2.a(this.f15920a) ? "1" : "0");
        }
    }
}
