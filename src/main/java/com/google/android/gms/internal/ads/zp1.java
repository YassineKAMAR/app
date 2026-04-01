package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f18362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dg0 f18363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ts2 f18364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f18365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f18366e;

    public zp1(jq1 jq1Var, dg0 dg0Var, ts2 ts2Var, String str, String str2) {
        ConcurrentHashMap concurrentHashMapC = jq1Var.c();
        this.f18362a = concurrentHashMapC;
        this.f18363b = dg0Var;
        this.f18364c = ts2Var;
        this.f18365d = str;
        this.f18366e = str2;
        if (((Boolean) h2.y.c().b(ns.W6)).booleanValue()) {
            int iE = p2.y.e(ts2Var);
            int i8 = iE - 1;
            if (i8 == 0) {
                concurrentHashMapC.put("scar", com.amazon.a.a.o.b.ad);
                return;
            }
            concurrentHashMapC.put("se", i8 != 1 ? i8 != 2 ? i8 != 3 ? "r_both" : "r_adstring" : "r_adinfo" : "query_g");
            concurrentHashMapC.put("scar", com.amazon.a.a.o.b.ac);
            if (((Boolean) h2.y.c().b(ns.w7)).booleanValue()) {
                concurrentHashMapC.put("ad_format", str2);
            }
            if (iE == 2) {
                concurrentHashMapC.put("rid", str);
            }
            d("ragent", ts2Var.f15302d.f22267p);
            d("rtype", p2.y.a(p2.y.b(ts2Var.f15302d)));
        }
    }

    private final void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f18362a.put(str, str2);
    }

    public final Map a() {
        return this.f18362a;
    }

    public final void b(ks2 ks2Var) {
        ConcurrentHashMap concurrentHashMap;
        String str;
        if (!ks2Var.f10323b.f9792a.isEmpty()) {
            switch (((wr2) ks2Var.f10323b.f9792a.get(0)).f16867b) {
                case 1:
                    concurrentHashMap = this.f18362a;
                    str = "banner";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 2:
                    concurrentHashMap = this.f18362a;
                    str = "interstitial";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 3:
                    concurrentHashMap = this.f18362a;
                    str = "native_express";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 4:
                    concurrentHashMap = this.f18362a;
                    str = "native_advanced";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 5:
                    concurrentHashMap = this.f18362a;
                    str = "rewarded";
                    concurrentHashMap.put("ad_format", str);
                    break;
                case 6:
                    this.f18362a.put("ad_format", "app_open_ad");
                    this.f18362a.put("as", true != this.f18363b.m() ? "0" : "1");
                    break;
                default:
                    concurrentHashMap = this.f18362a;
                    str = "unknown";
                    concurrentHashMap.put("ad_format", str);
                    break;
            }
        }
        d("gqi", ks2Var.f10323b.f9793b.f5462b);
    }

    public final void c(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f18362a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f18362a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
