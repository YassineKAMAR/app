package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f4452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f4453c;

    /* JADX INFO: renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    public static class C0071a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f4454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f4455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f4456c;

        /* synthetic */ C0071a(JSONObject jSONObject, j1.n0 n0Var) {
            this.f4454a = jSONObject.optString("productId");
            this.f4455b = jSONObject.optString("productType");
            String strOptString = jSONObject.optString("offerToken");
            this.f4456c = true == strOptString.isEmpty() ? null : strOptString;
        }

        public String a() {
            return this.f4454a;
        }

        public String b() {
            return this.f4456c;
        }

        public String c() {
            return this.f4455b;
        }

        public final boolean equals(Object obj) {
            String str;
            String strB;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0071a)) {
                return false;
            }
            C0071a c0071a = (C0071a) obj;
            return this.f4454a.equals(c0071a.a()) && this.f4455b.equals(c0071a.c()) && ((str = this.f4456c) == (strB = c0071a.b()) || (str != null && str.equals(strB)));
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f4454a, this.f4455b, this.f4456c});
        }

        public final String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.f4454a, this.f4455b, this.f4456c);
        }
    }

    a(String str) {
        this.f4451a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f4452b = jSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i8);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new C0071a(jSONObjectOptJSONObject, null));
                }
            }
        }
        this.f4453c = arrayList;
    }
}
