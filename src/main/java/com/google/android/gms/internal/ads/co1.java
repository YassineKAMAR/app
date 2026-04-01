package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class co1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f6411a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f6412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f6413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f6415e;

    public co1(Executor executor) {
        this.f6413c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void f() {
        Map map;
        this.f6414d = true;
        rf0 rf0VarO = g2.t.q().h().o();
        if (rf0VarO == null) {
            return;
        }
        JSONObject jSONObjectF = rf0VarO.f();
        if (jSONObjectF == null) {
            return;
        }
        this.f6412b = ((Boolean) h2.y.c().b(ns.Q3)).booleanValue() ? jSONObjectF.optJSONObject("common_settings") : null;
        this.f6415e = jSONObjectF.optJSONObject("ad_unit_patterns");
        JSONArray jSONArrayOptJSONArray = jSONObjectF.optJSONArray("ad_unit_id_settings");
        if (jSONArrayOptJSONArray != null) {
            for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i8);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                    String strOptString2 = jSONObjectOptJSONObject.optString("format");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                    if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                        if (this.f6411a.containsKey(strOptString2)) {
                            map = (Map) this.f6411a.get(strOptString2);
                        } else {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            this.f6411a.put(strOptString2, concurrentHashMap);
                            map = concurrentHashMap;
                        }
                        map.put(strOptString, jSONObjectOptJSONObject2);
                    }
                }
            }
        }
    }

    public final JSONObject a() {
        if (((Boolean) h2.y.c().b(ns.Q3)).booleanValue()) {
            return this.f6412b;
        }
        return null;
    }

    public final JSONObject b(String str, String str2) {
        if (!((Boolean) h2.y.c().b(ns.P3)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f6414d) {
            f();
        }
        Map map = (Map) this.f6411a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String strA = eo1.a(this.f6415e, str, str2);
        if (strA == null) {
            return null;
        }
        return (JSONObject) map.get(strA);
    }

    public final void c() {
        g2.t.q().h().d(new Runnable() { // from class: com.google.android.gms.internal.ads.zn1
            @Override // java.lang.Runnable
            public final void run() {
                this.f18295a.e();
            }
        });
        this.f6413c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ao1
            @Override // java.lang.Runnable
            public final void run() {
                this.f5361a.f();
            }
        });
    }

    final /* synthetic */ void e() {
        this.f6413c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.bo1
            @Override // java.lang.Runnable
            public final void run() {
                this.f5913a.d();
            }
        });
    }
}
