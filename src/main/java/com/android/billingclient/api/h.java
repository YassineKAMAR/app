package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f4530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f4532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f4533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f4534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f4535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f4536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f4537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f4538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f4539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f4540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f4541m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f4542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f4543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f4544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f4545d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f4546e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.google.android.gms.internal.play_billing.g f4547f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Long f4548g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final f0 f4549h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final i0 f4550i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final g0 f4551j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final h0 f4552k;

        a(JSONObject jSONObject) {
            this.f4542a = jSONObject.optString("formattedPrice");
            this.f4543b = jSONObject.optLong("priceAmountMicros");
            this.f4544c = jSONObject.optString("priceCurrencyCode");
            this.f4545d = jSONObject.optString("offerIdToken");
            this.f4546e = jSONObject.optString("offerId");
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i8));
                }
            }
            this.f4547f = com.google.android.gms.internal.play_billing.g.x(arrayList);
            this.f4548g = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.f4549h = jSONObjectOptJSONObject == null ? null : new f0(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.f4550i = jSONObjectOptJSONObject2 == null ? null : new i0(jSONObjectOptJSONObject2);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f4551j = jSONObjectOptJSONObject3 == null ? null : new g0(jSONObjectOptJSONObject3);
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            this.f4552k = jSONObjectOptJSONObject4 != null ? new h0(jSONObjectOptJSONObject4) : null;
        }

        public String a() {
            return this.f4542a;
        }

        public long b() {
            return this.f4543b;
        }

        public String c() {
            return this.f4544c;
        }

        public final String d() {
            return this.f4545d;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f4553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f4554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f4555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f4556d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f4557e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f4558f;

        b(JSONObject jSONObject) {
            this.f4556d = jSONObject.optString("billingPeriod");
            this.f4555c = jSONObject.optString("priceCurrencyCode");
            this.f4553a = jSONObject.optString("formattedPrice");
            this.f4554b = jSONObject.optLong("priceAmountMicros");
            this.f4558f = jSONObject.optInt("recurrenceMode");
            this.f4557e = jSONObject.optInt("billingCycleCount");
        }

        public int a() {
            return this.f4557e;
        }

        public String b() {
            return this.f4556d;
        }

        public String c() {
            return this.f4553a;
        }

        public long d() {
            return this.f4554b;
        }

        public String e() {
            return this.f4555c;
        }

        public int f() {
            return this.f4558f;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f4559a;

        c(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i8);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new b(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f4559a = arrayList;
        }

        public List<b> a() {
            return this.f4559a;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f4560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f4561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f4562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f4563d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f4564e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final e0 f4565f;

        d(JSONObject jSONObject) {
            this.f4560a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f4561b = true == strOptString.isEmpty() ? null : strOptString;
            this.f4562c = jSONObject.getString("offerIdToken");
            this.f4563d = new c(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f4565f = jSONObjectOptJSONObject != null ? new e0(jSONObjectOptJSONObject) : null;
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i8));
                }
            }
            this.f4564e = arrayList;
        }

        public String a() {
            return this.f4560a;
        }

        public String b() {
            return this.f4561b;
        }

        public List<String> c() {
            return this.f4564e;
        }

        public String d() {
            return this.f4562c;
        }

        public c e() {
            return this.f4563d;
        }
    }

    h(String str) {
        this.f4529a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f4530b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f4531c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f4532d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f4533e = jSONObject.optString(com.amazon.a.a.o.b.S);
        this.f4534f = jSONObject.optString("name");
        this.f4535g = jSONObject.optString(com.amazon.a.a.o.b.f3893c);
        this.f4537i = jSONObject.optString("packageDisplayName");
        this.f4538j = jSONObject.optString(com.amazon.a.a.o.b.f3900j);
        this.f4536h = jSONObject.optString("skuDetailsToken");
        this.f4539k = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                arrayList.add(new d(jSONArrayOptJSONArray.getJSONObject(i8)));
            }
            this.f4540l = arrayList;
        } else {
            this.f4540l = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f4530b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f4530b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i9 = 0; i9 < jSONArrayOptJSONArray2.length(); i9++) {
                arrayList2.add(new a(jSONArrayOptJSONArray2.getJSONObject(i9)));
            }
            this.f4541m = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f4541m = null;
        } else {
            arrayList2.add(new a(jSONObjectOptJSONObject));
            this.f4541m = arrayList2;
        }
    }

    public String a() {
        return this.f4535g;
    }

    public String b() {
        return this.f4534f;
    }

    public a c() {
        List list = this.f4541m;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (a) this.f4541m.get(0);
    }

    public String d() {
        return this.f4531c;
    }

    public String e() {
        return this.f4532d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return TextUtils.equals(this.f4529a, ((h) obj).f4529a);
        }
        return false;
    }

    public List<d> f() {
        return this.f4540l;
    }

    public String g() {
        return this.f4533e;
    }

    public final String h() {
        return this.f4530b.optString("packageName");
    }

    public int hashCode() {
        return this.f4529a.hashCode();
    }

    final String i() {
        return this.f4536h;
    }

    public String j() {
        return this.f4539k;
    }

    public String toString() {
        List list = this.f4540l;
        return "ProductDetails{jsonString='" + this.f4529a + "', parsedJson=" + this.f4530b.toString() + ", productId='" + this.f4531c + "', productType='" + this.f4532d + "', title='" + this.f4533e + "', productDetailsToken='" + this.f4536h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
