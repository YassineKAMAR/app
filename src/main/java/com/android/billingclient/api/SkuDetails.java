package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SkuDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f4450b;

    public String a() {
        return this.f4450b.optString("productId");
    }

    public String b() {
        return this.f4450b.optString("type");
    }

    public int c() {
        return this.f4450b.optInt("offer_type");
    }

    public String d() {
        return this.f4450b.optString("offer_id");
    }

    public String e() {
        String strOptString = this.f4450b.optString("offerIdToken");
        return strOptString.isEmpty() ? this.f4450b.optString("offer_id_token") : strOptString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f4449a, ((SkuDetails) obj).f4449a);
        }
        return false;
    }

    public final String f() {
        return this.f4450b.optString("packageName");
    }

    public String g() {
        return this.f4450b.optString("serializedDocid");
    }

    final String h() {
        return this.f4450b.optString("skuDetailsToken");
    }

    public int hashCode() {
        return this.f4449a.hashCode();
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f4449a));
    }
}
