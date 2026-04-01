package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f4445c;

    public Purchase(String str, String str2) {
        this.f4443a = str;
        this.f4444b = str2;
        this.f4445c = new JSONObject(str);
    }

    private final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        if (this.f4445c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f4445c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i8));
                }
            }
        } else if (this.f4445c.has("productId")) {
            arrayList.add(this.f4445c.optString("productId"));
        }
        return arrayList;
    }

    public String a() {
        String strOptString = this.f4445c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    public String b() {
        return this.f4443a;
    }

    public List<String> c() {
        return j();
    }

    public int d() {
        return this.f4445c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long e() {
        return this.f4445c.optLong("purchaseTime");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f4443a, purchase.b()) && TextUtils.equals(this.f4444b, purchase.g());
    }

    public String f() {
        JSONObject jSONObject = this.f4445c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String g() {
        return this.f4444b;
    }

    public boolean h() {
        return this.f4445c.optBoolean("acknowledged", true);
    }

    public int hashCode() {
        return this.f4443a.hashCode();
    }

    public boolean i() {
        return this.f4445c.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f4443a));
    }
}
