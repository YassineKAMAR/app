package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class q92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f13350a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f13351b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f13352c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f13353d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f13354e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Executor f13355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONObject f13356g;

    q92(Executor executor) {
        this.f13355f = executor;
    }

    private final synchronized mb3 h(String str) {
        HashMap map;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(g2.t.q().h().o().c())) {
            boolean zMatches = Pattern.matches((String) h2.y.c().b(ns.T2), str);
            boolean zMatches2 = Pattern.matches((String) h2.y.c().b(ns.U2), str);
            if (zMatches) {
                map = new HashMap(this.f13354e);
            } else {
                if (!zMatches2) {
                    return mb3.d();
                }
                map = new HashMap(this.f13353d);
            }
            return mb3.c(map);
        }
        return mb3.d();
    }

    private final synchronized List i(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        Bundle bundleO = o(jSONObject.optJSONObject("data"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
        if (jSONArrayOptJSONArray == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
            String strOptString = jSONArrayOptJSONArray.optString(i8, "");
            if (!TextUtils.isEmpty(strOptString)) {
                arrayList2.add(strOptString);
            }
        }
        int size = arrayList2.size();
        for (int i9 = 0; i9 < size; i9++) {
            String str2 = (String) arrayList2.get(i9);
            g(str2);
            if (((s92) this.f13350a.get(str2)) != null) {
                arrayList.add(new s92(str2, str, bundleO));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void j() {
        this.f13351b.clear();
        this.f13350a.clear();
        this.f13354e.clear();
        this.f13353d.clear();
        m();
        n();
        k();
    }

    private final synchronized void k() {
        Map map;
        if (!((Boolean) pu.f13129b.e()).booleanValue()) {
            if (((Boolean) h2.y.c().b(ns.K1)).booleanValue()) {
                JSONObject jSONObjectF = g2.t.q().h().o().f();
                if (jSONObjectF == null) {
                    return;
                }
                try {
                    JSONArray jSONArray = jSONObjectF.getJSONArray("adapter_settings");
                    for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i8);
                        String strOptString = jSONObject.optString("adapter_class_name");
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(strOptString)) {
                            for (int i9 = 0; i9 < jSONArrayOptJSONArray.length(); i9++) {
                                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i9);
                                boolean zOptBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean zOptBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean zOptBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                String strOptString2 = jSONObject2.optString("platform");
                                u92 u92Var = new u92(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                if (strOptString2.equals("ADMOB")) {
                                    map = this.f13353d;
                                } else if (strOptString2.equals("AD_MANAGER")) {
                                    map = this.f13354e;
                                }
                                map.put(strOptString, u92Var);
                            }
                        }
                    }
                } catch (JSONException e8) {
                    j2.v1.l("Malformed config loading JSON.", e8);
                }
            }
        }
    }

    private final synchronized void l(String str, String str2, List list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.f13352c.get(str);
        if (map == null) {
            map = new HashMap();
        }
        this.f13352c.put(str, map);
        List arrayList = (List) map.get(str2);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.addAll(list);
        map.put(str2, arrayList);
    }

    private final synchronized void m() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectF = g2.t.q().h().o().f();
        if (jSONObjectF != null) {
            try {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectF.optJSONArray("ad_unit_id_settings");
                this.f13356g = jSONObjectF.optJSONObject("ad_unit_patterns");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i8 = 0; i8 < jSONArrayOptJSONArray2.length(); i8++) {
                        JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i8);
                        String lowerCase = ((Boolean) h2.y.c().b(ns.X9)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                        String strOptString = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i9 = 0; i9 < jSONArrayOptJSONArray.length(); i9++) {
                                arrayList.addAll(i(jSONArrayOptJSONArray.getJSONObject(i9), strOptString));
                            }
                        }
                        l(strOptString, lowerCase, arrayList);
                    }
                }
            } catch (JSONException e8) {
                j2.v1.l("Malformed config loading JSON.", e8);
            }
        }
    }

    private final synchronized void n() {
        if (!((Boolean) pu.f13134g.e()).booleanValue()) {
            if (((Boolean) h2.y.c().b(ns.J1)).booleanValue()) {
                JSONObject jSONObjectF = g2.t.q().h().o().f();
                if (jSONObjectF == null) {
                    return;
                }
                try {
                    JSONArray jSONArray = jSONObjectF.getJSONArray("signal_adapters");
                    for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i8);
                        Bundle bundleO = o(jSONObject.optJSONObject("data"));
                        String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.f13351b.put(strOptString, new u92(strOptString, zOptBoolean2, zOptBoolean, true, bundleO));
                        }
                    }
                } catch (JSONException e8) {
                    j2.v1.l("Malformed config loading JSON.", e8);
                }
            }
        }
    }

    private static final Bundle o(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized Map a(String str, String str2) {
        HashMap map;
        Map mapB = b(str, str2);
        mb3 mb3VarH = h(str2);
        map = new HashMap();
        for (Map.Entry entry : ((mb3) mapB).entrySet()) {
            String str3 = (String) entry.getKey();
            if (mb3VarH.containsKey(str3)) {
                u92 u92Var = (u92) mb3VarH.get(str3);
                List list = (List) entry.getValue();
                map.put(str3, new u92(str3, u92Var.f15578b, u92Var.f15579c, u92Var.f15580d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
            }
        }
        kd3 kd3VarN = mb3VarH.entrySet().iterator();
        while (kd3VarN.hasNext()) {
            Map.Entry entry2 = (Map.Entry) kd3VarN.next();
            String str4 = (String) entry2.getKey();
            if (!map.containsKey(str4) && ((u92) entry2.getValue()).f15580d) {
                map.put(str4, (u92) entry2.getValue());
            }
        }
        return map;
    }

    public final synchronized Map b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(g2.t.q().h().o().c())) {
            Map map = (Map) this.f13352c.get(str);
            if (map == null) {
                return mb3.d();
            }
            List<s92> list = (List) map.get(str2);
            if (list == null) {
                String strA = eo1.a(this.f13356g, str2, str);
                if (((Boolean) h2.y.c().b(ns.X9)).booleanValue()) {
                    strA = strA.toLowerCase(Locale.ROOT);
                }
                list = (List) map.get(strA);
            }
            if (list == null) {
                return mb3.d();
            }
            HashMap map2 = new HashMap();
            for (s92 s92Var : list) {
                String str3 = s92Var.f14572a;
                if (!map2.containsKey(str3)) {
                    map2.put(str3, new ArrayList());
                }
                ((List) map2.get(str3)).add(s92Var.f14574c);
            }
            return mb3.c(map2);
        }
        return mb3.d();
    }

    public final synchronized Map c() {
        if (TextUtils.isEmpty(g2.t.q().h().o().c())) {
            return mb3.d();
        }
        return mb3.c(this.f13351b);
    }

    public final void e() {
        g2.t.q().h().d(new Runnable() { // from class: com.google.android.gms.internal.ads.p92
            @Override // java.lang.Runnable
            public final void run() {
                this.f12796a.f();
            }
        });
        this.f13355f.execute(new o92(this));
    }

    final /* synthetic */ void f() {
        this.f13355f.execute(new o92(this));
    }

    public final synchronized void g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f13350a.containsKey(str)) {
            return;
        }
        this.f13350a.put(str, new s92(str, "", new Bundle()));
    }
}
