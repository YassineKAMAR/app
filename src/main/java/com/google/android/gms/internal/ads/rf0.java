package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class rf0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f14092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f14093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f14094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONObject f14095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f14096h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f14098j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f14089a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f14090b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f14091c = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f14097i = new ArrayList();

    public rf0(String str, long j8) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.f14092d = "";
        this.f14096h = false;
        this.f14098j = false;
        this.f14093e = str;
        this.f14094f = j8;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f14095g = new JSONObject(str);
            if (((Boolean) h2.y.c().b(ns.Ha)).booleanValue() && j()) {
                return;
            }
            if (this.f14095g.optInt("status", -1) != 1) {
                this.f14096h = false;
                qg0.g("App settings could not be fetched successfully.");
                return;
            }
            this.f14096h = true;
            this.f14092d = this.f14095g.optString("app_id");
            JSONArray jSONArrayOptJSONArray2 = this.f14095g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i8 = 0; i8 < jSONArrayOptJSONArray2.length(); i8++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i8);
                    String strOptString = jSONObject.optString("format");
                    String strOptString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.f14090b.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f14091c.put(strOptString2, new u40(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.f14095g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i9 = 0; i9 < jSONArrayOptJSONArray3.length(); i9++) {
                    this.f14089a.add(jSONArrayOptJSONArray3.optString(i9));
                }
            }
            if (((Boolean) h2.y.c().b(ns.Q6)).booleanValue() && (jSONObjectOptJSONObject2 = this.f14095g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.f14097i.add(jSONArrayOptJSONArray.get(i10).toString());
                }
            }
            if (!((Boolean) h2.y.c().b(ns.f12127l6)).booleanValue() || (jSONObjectOptJSONObject = this.f14095g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f14098j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e8) {
            qg0.h("Exception occurred while processing app setting json", e8);
            g2.t.q().u(e8, "AppSettings.parseAppSettingsJson");
        }
    }

    public final long a() {
        return this.f14094f;
    }

    public final String b() {
        return this.f14092d;
    }

    public final String c() {
        return this.f14093e;
    }

    public final List d() {
        return this.f14097i;
    }

    public final Map e() {
        return this.f14091c;
    }

    public final JSONObject f() {
        return this.f14095g;
    }

    public final void g(long j8) {
        this.f14094f = j8;
    }

    public final boolean h() {
        return this.f14098j;
    }

    public final boolean i() {
        return this.f14096h;
    }

    public final boolean j() {
        if (!TextUtils.isEmpty(this.f14093e) && this.f14095g != null) {
            fs fsVar = ns.Ka;
            long jLongValue = ((Long) h2.y.c().b(fsVar)).longValue();
            if (((Boolean) h2.y.c().b(ns.Ja)).booleanValue() && !TextUtils.isEmpty(this.f14093e)) {
                jLongValue = this.f14095g.optLong("cache_ttl_sec", ((Long) h2.y.c().b(fsVar)).longValue());
            }
            long jA = g2.t.b().a();
            if (jLongValue >= 0) {
                long j8 = this.f14094f;
                if (j8 > jA || TimeUnit.MILLISECONDS.toSeconds(jA - j8) > jLongValue) {
                    this.f14089a.clear();
                    this.f14090b.clear();
                    this.f14091c.clear();
                    this.f14092d = "";
                    this.f14093e = "";
                    this.f14095g = null;
                    this.f14096h = false;
                    this.f14097i.clear();
                    this.f14098j = false;
                    return true;
                }
            }
        }
        return false;
    }
}
