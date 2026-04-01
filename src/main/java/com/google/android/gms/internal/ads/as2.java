package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class as2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final yr2 f5469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Bundle f5470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f5471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f5472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f5473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final JSONObject f5474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f5475o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f5476p;

    as2(JsonReader jsonReader) throws IOException {
        List listEmptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        int iNextInt = 0;
        String str = "";
        String strNextString = str;
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String strNextString6 = strNextString5;
        yr2 yr2Var = null;
        int iNextInt2 = 0;
        boolean zNextBoolean = false;
        long jNextLong = 0;
        int iMax = 1;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String strNextString7 = str;
            if ("nofill_urls".equals(strNextName)) {
                listEmptyList = j2.y0.d(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString2 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (DiagnosticsTracker.RESPONSE_CODE_KEY.equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                JSONObject jSONObject2 = jSONObject;
                if (((Boolean) h2.y.c().b(ns.b8)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    yr2Var = new yr2(jsonReader);
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString3 = jsonReader.nextString();
                } else {
                    if (((Boolean) h2.y.c().b(ns.C9)).booleanValue() && zr2.a(strNextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(strNextName)) {
                        strNextString7 = jsonReader.nextString();
                    } else {
                        if ("response_info_extras".equals(strNextName)) {
                            if (((Boolean) h2.y.c().b(ns.M6)).booleanValue()) {
                                try {
                                    Bundle bundleA = j2.y0.a(j2.y0.h(jsonReader));
                                    if (bundleA != null) {
                                        bundle = bundleA;
                                    }
                                } catch (IOException | JSONException unused) {
                                    jSONObject = jSONObject2;
                                } catch (IllegalStateException unused2) {
                                    jsonReader.skipValue();
                                    jSONObject = jSONObject2;
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if ("adRequestPostBody".equals(strNextName)) {
                            if (((Boolean) h2.y.c().b(ns.Y8)).booleanValue()) {
                                strNextString5 = jsonReader.nextString();
                            }
                            jsonReader.skipValue();
                        } else if ("adRequestUrl".equals(strNextName)) {
                            if (((Boolean) h2.y.c().b(ns.Y8)).booleanValue()) {
                                strNextString4 = jsonReader.nextString();
                            }
                            jsonReader.skipValue();
                        } else {
                            fs fsVar = ns.Z8;
                            if (((Boolean) h2.y.c().b(fsVar)).booleanValue() && zr2.a(strNextName, "adResponseBody")) {
                                strNextString6 = jsonReader.nextString();
                            } else if (((Boolean) h2.y.c().b(fsVar)).booleanValue() && zr2.a(strNextName, "adResponseHeaders")) {
                                jSONObject = j2.y0.h(jsonReader);
                            } else {
                                if (zr2.a(strNextName, "max_parallel_renderers")) {
                                    iMax = Math.max(1, jsonReader.nextInt());
                                } else {
                                    jsonReader.skipValue();
                                }
                                jSONObject = jSONObject2;
                            }
                        }
                        str = strNextString7;
                    }
                    jSONObject = jSONObject2;
                    str = strNextString7;
                }
                jSONObject = jSONObject2;
            }
            str = strNextString7;
        }
        jsonReader.endObject();
        this.f5461a = listEmptyList;
        this.f5463c = iNextInt;
        this.f5462b = strNextString;
        this.f5464d = strNextString2;
        this.f5465e = iNextInt2;
        this.f5466f = jNextLong;
        this.f5469i = yr2Var;
        this.f5467g = zNextBoolean;
        this.f5468h = strNextString3;
        this.f5470j = bundle;
        this.f5471k = strNextString4;
        this.f5472l = strNextString5;
        this.f5473m = strNextString6;
        this.f5474n = jSONObject;
        this.f5475o = str;
        ut utVar = ou.f12643a;
        this.f5476p = ((Long) utVar.e()).longValue() > 0 ? ((Long) utVar.e()).intValue() : iMax;
    }
}
