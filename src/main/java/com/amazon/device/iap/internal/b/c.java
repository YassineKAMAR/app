package com.amazon.device.iap.internal.b;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f4274a = "KEY_TIMESTAMP";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4275b = "KEY_REQUEST_ID";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4276c = "KEY_USER_ID";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f4277d = "KEY_RECEIPT_STRING";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f4278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f4279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f4280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f4281h;

    public c(String str, String str2, String str3, long j8) {
        this.f4278e = str;
        this.f4279f = str2;
        this.f4281h = str3;
        this.f4280g = j8;
    }

    public static c a(String str) throws b {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.getString(f4276c), jSONObject.getString(f4277d), jSONObject.getString(f4275b), jSONObject.getLong(f4274a));
        } catch (Throwable th) {
            throw new b("Input invalid for PendingReceipt Object:" + str, th);
        }
    }

    public String a() {
        return this.f4278e;
    }

    public String b() {
        return this.f4281h;
    }

    public String c() {
        return this.f4279f;
    }

    public long d() {
        return this.f4280g;
    }

    public String e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f4276c, this.f4278e);
        jSONObject.put(f4277d, this.f4279f);
        jSONObject.put(f4275b, this.f4281h);
        jSONObject.put(f4274a, this.f4280g);
        return jSONObject.toString();
    }
}
