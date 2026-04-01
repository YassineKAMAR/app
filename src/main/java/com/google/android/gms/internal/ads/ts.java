package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class ts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15279a = (String) cu.f6482b.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f15280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f15281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15282d;

    public ts(Context context, String str) {
        this.f15281c = context;
        this.f15282d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f15280b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        g2.t.r();
        linkedHashMap.put("device", j2.k2.S());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        g2.t.r();
        linkedHashMap.put("is_lite_sdk", true != j2.k2.d(context) ? "0" : "1");
        Future futureB = g2.t.o().b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((db0) futureB.get()).f6647k));
            linkedHashMap.put("network_fine", Integer.toString(((db0) futureB.get()).f6648l));
        } catch (Exception e8) {
            g2.t.q().u(e8, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) h2.y.c().b(ns.qa)).booleanValue()) {
            Map map = this.f15280b;
            g2.t.r();
            map.put("is_bstar", true == j2.k2.a(context) ? "1" : "0");
        }
    }

    final Context a() {
        return this.f15281c;
    }

    final String b() {
        return this.f15282d;
    }

    final String c() {
        return this.f15279a;
    }

    final Map d() {
        return this.f15280b;
    }
}
