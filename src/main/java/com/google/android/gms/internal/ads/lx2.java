package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f11084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rx2 f11085b;

    private lx2() {
        HashMap map = new HashMap();
        this.f11084a = map;
        this.f11085b = new rx2(g2.t.b());
        map.put("new_csi", "1");
    }

    public static lx2 b(String str) {
        lx2 lx2Var = new lx2();
        lx2Var.f11084a.put("action", str);
        return lx2Var;
    }

    public static lx2 c(String str) {
        lx2 lx2Var = new lx2();
        lx2Var.f11084a.put(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, str);
        return lx2Var;
    }

    public final lx2 a(String str, String str2) {
        this.f11084a.put(str, str2);
        return this;
    }

    public final lx2 d(String str) {
        this.f11085b.b(str);
        return this;
    }

    public final lx2 e(String str, String str2) {
        this.f11085b.c(str, str2);
        return this;
    }

    public final lx2 f(wr2 wr2Var) {
        this.f11084a.put("aai", wr2Var.f16910y);
        return this;
    }

    public final lx2 g(as2 as2Var) {
        if (!TextUtils.isEmpty(as2Var.f5462b)) {
            this.f11084a.put("gqi", as2Var.f5462b);
        }
        return this;
    }

    public final lx2 h(ks2 ks2Var, dg0 dg0Var) {
        HashMap map;
        String str;
        js2 js2Var = ks2Var.f10323b;
        g(js2Var.f9793b);
        if (!js2Var.f9792a.isEmpty()) {
            String str2 = "ad_format";
            switch (((wr2) js2Var.f9792a.get(0)).f16867b) {
                case 1:
                    map = this.f11084a;
                    str = "banner";
                    map.put(str2, str);
                    break;
                case 2:
                    map = this.f11084a;
                    str = "interstitial";
                    map.put(str2, str);
                    break;
                case 3:
                    map = this.f11084a;
                    str = "native_express";
                    map.put(str2, str);
                    break;
                case 4:
                    map = this.f11084a;
                    str = "native_advanced";
                    map.put(str2, str);
                    break;
                case 5:
                    map = this.f11084a;
                    str = "rewarded";
                    map.put(str2, str);
                    break;
                case 6:
                    this.f11084a.put("ad_format", "app_open_ad");
                    if (dg0Var != null) {
                        map = this.f11084a;
                        str = true != dg0Var.m() ? "0" : "1";
                        str2 = "as";
                        map.put(str2, str);
                    }
                    break;
                default:
                    map = this.f11084a;
                    str = "unknown";
                    map.put(str2, str);
                    break;
            }
        }
        return this;
    }

    public final lx2 i(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f11084a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f11084a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map j() {
        HashMap map = new HashMap(this.f11084a);
        for (qx2 qx2Var : this.f11085b.a()) {
            map.put(qx2Var.f13795a, qx2Var.f13796b);
        }
        return map;
    }
}
