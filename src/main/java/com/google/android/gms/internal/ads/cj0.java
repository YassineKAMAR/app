package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class cj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f6367j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f6368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f6369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f6370m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f6371n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f6372o;

    public cj0(String str) {
        String string;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f6358a = a(jSONObject, "aggressive_media_codec_release", ns.J);
        this.f6359b = b(jSONObject, "byte_buffer_precache_limit", ns.f12120l);
        this.f6360c = b(jSONObject, "exo_cache_buffer_size", ns.f12216w);
        this.f6361d = b(jSONObject, "exo_connect_timeout_millis", ns.f12084h);
        fs fsVar = ns.f12075g;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
                string = (String) h2.y.c().b(fsVar);
            }
        } else {
            string = (String) h2.y.c().b(fsVar);
        }
        this.f6362e = string;
        this.f6363f = b(jSONObject, "exo_read_timeout_millis", ns.f12093i);
        this.f6364g = b(jSONObject, "load_check_interval_bytes", ns.f12102j);
        this.f6365h = b(jSONObject, "player_precache_limit", ns.f12111k);
        this.f6366i = b(jSONObject, "socket_receive_buffer_size", ns.f12129m);
        this.f6367j = a(jSONObject, "use_cache_data_source", ns.f12062e4);
        b(jSONObject, "min_retry_count", ns.f12138n);
        this.f6368k = a(jSONObject, "treat_load_exception_as_non_fatal", ns.f12165q);
        this.f6369l = a(jSONObject, "enable_multiple_video_playback", ns.P1);
        this.f6370m = a(jSONObject, "use_range_http_data_source", ns.R1);
        this.f6371n = c(jSONObject, "range_http_data_source_high_water_mark", ns.S1);
        this.f6372o = c(jSONObject, "range_http_data_source_low_water_mark", ns.T1);
    }

    private static final boolean a(JSONObject jSONObject, String str, fs fsVar) {
        boolean zBooleanValue = ((Boolean) h2.y.c().b(fsVar)).booleanValue();
        if (jSONObject == null) {
            return zBooleanValue;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return zBooleanValue;
        }
    }

    private static final int b(JSONObject jSONObject, String str, fs fsVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) h2.y.c().b(fsVar)).intValue();
    }

    private static final long c(JSONObject jSONObject, String str, fs fsVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) h2.y.c().b(fsVar)).longValue();
    }
}
