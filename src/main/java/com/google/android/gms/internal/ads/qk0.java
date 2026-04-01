package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class qk0 implements qz {
    private static final Integer b(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            qg0.g("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        pk0 sk0Var;
        hk0 hk0VarA;
        dj0 dj0Var = (dj0) obj;
        if (qg0.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            qg0.b("Precache GMSG: ".concat(jSONObject.toString()));
        }
        ik0 ik0VarA = g2.t.A();
        if (map.containsKey("abort")) {
            if (ik0VarA.i(dj0Var)) {
                return;
            }
            qg0.g("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numB = b(map, "periodicReportIntervalMs");
        Integer numB2 = b(map, "exoPlayerRenderingIntervalMs");
        Integer numB3 = b(map, "exoPlayerIdleIntervalMs");
        cj0 cj0Var = new cj0((String) map.get("flags"));
        boolean z7 = cj0Var.f6369l;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                        strArr2[i8] = jSONArray.getString(i8);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    qg0.g("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z7) {
                Iterator it = ik0VarA.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        hk0VarA = null;
                        break;
                    }
                    hk0 hk0Var = (hk0) it.next();
                    if (hk0Var.f8800c == dj0Var && str.equals(hk0Var.e())) {
                        hk0VarA = hk0Var;
                        break;
                    }
                }
            } else {
                hk0VarA = ik0VarA.a(dj0Var);
            }
            if (hk0VarA != null) {
                qg0.g("Precache task is already running.");
                return;
            }
            if (dj0Var.t() == null) {
                qg0.g("Precache requires a dependency provider.");
                return;
            }
            Integer numB4 = b(map, "player");
            if (numB4 == null) {
                numB4 = 0;
            }
            if (numB != null) {
                dj0Var.K(numB.intValue());
            }
            if (numB2 != null) {
                dj0Var.v0(numB2.intValue());
            }
            if (numB3 != null) {
                dj0Var.k0(numB3.intValue());
            }
            int iIntValue = numB4.intValue();
            ak0 ak0Var = dj0Var.t().f21940b;
            if (iIntValue > 0) {
                int i9 = cj0Var.f6365h;
                int iQ = ti0.Q();
                sk0Var = iQ < i9 ? new yk0(dj0Var, cj0Var) : iQ < cj0Var.f6359b ? new vk0(dj0Var, cj0Var) : new tk0(dj0Var);
            } else {
                sk0Var = new sk0(dj0Var);
            }
            new hk0(dj0Var, sk0Var, str, strArr).b();
        } else {
            hk0 hk0VarA2 = ik0VarA.a(dj0Var);
            if (hk0VarA2 == null) {
                qg0.g("Precache must specify a source.");
                return;
            }
            sk0Var = hk0VarA2.f8801d;
        }
        Integer numB5 = b(map, "minBufferMs");
        if (numB5 != null) {
            sk0Var.t(numB5.intValue());
        }
        Integer numB6 = b(map, "maxBufferMs");
        if (numB6 != null) {
            sk0Var.s(numB6.intValue());
        }
        Integer numB7 = b(map, "bufferForPlaybackMs");
        if (numB7 != null) {
            sk0Var.q(numB7.intValue());
        }
        Integer numB8 = b(map, "bufferForPlaybackAfterRebufferMs");
        if (numB8 != null) {
            sk0Var.r(numB8.intValue());
        }
    }
}
