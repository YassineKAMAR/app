package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PurchaseHistoryRecord {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f4448c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.f4446a = str;
        this.f4447b = str2;
        this.f4448c = new JSONObject(str);
    }

    private final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        if (this.f4448c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f4448c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i8));
                }
            }
        } else if (this.f4448c.has("productId")) {
            arrayList.add(this.f4448c.optString("productId"));
        }
        return arrayList;
    }

    public String a() {
        return this.f4446a;
    }

    public List<String> b() {
        return g();
    }

    public long c() {
        return this.f4448c.optLong("purchaseTime");
    }

    public String d() {
        JSONObject jSONObject = this.f4448c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String e() {
        return this.f4447b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f4446a, purchaseHistoryRecord.a()) && TextUtils.equals(this.f4447b, purchaseHistoryRecord.e());
    }

    @Deprecated
    public ArrayList<String> f() {
        return g();
    }

    public int hashCode() {
        return this.f4446a.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f4446a));
    }
}
