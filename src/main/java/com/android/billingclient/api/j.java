package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f4573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f4574c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f4575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f4576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f4577c;

        /* synthetic */ a(JSONObject jSONObject, j1.x0 x0Var) {
            this.f4575a = jSONObject.optString("productId");
            this.f4576b = jSONObject.optString("productType");
            String strOptString = jSONObject.optString("offerToken");
            this.f4577c = true == strOptString.isEmpty() ? null : strOptString;
        }

        public String a() {
            return this.f4575a;
        }

        public String b() {
            return this.f4577c;
        }

        public String c() {
            return this.f4576b;
        }

        public boolean equals(Object obj) {
            String str;
            String strB;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4575a.equals(aVar.a()) && this.f4576b.equals(aVar.c()) && ((str = this.f4577c) == (strB = aVar.b()) || (str != null && str.equals(strB)));
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f4575a, this.f4576b, this.f4577c});
        }

        public String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.f4575a, this.f4576b, this.f4577c);
        }
    }

    j(String str) {
        this.f4572a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f4573b = jSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i8);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new a(jSONObjectOptJSONObject, null));
                }
            }
        }
        this.f4574c = arrayList;
    }
}
