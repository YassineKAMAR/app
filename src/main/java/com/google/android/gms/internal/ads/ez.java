package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class ez implements qz {
    ez() {
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        float fFloatValue;
        fm0 fm0Var = (fm0) obj;
        try {
            JSONObject jSONObject = new JSONObject((String) map.get("args"));
            Iterator<String> itKeys = jSONObject.keys();
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(fm0Var.getContext()).edit();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj2 = jSONObject.get(next);
                if (obj2 instanceof Integer) {
                    editorEdit.putInt(next, ((Integer) obj2).intValue());
                } else if (obj2 instanceof Long) {
                    editorEdit.putLong(next, ((Long) obj2).longValue());
                } else {
                    if (obj2 instanceof Double) {
                        fFloatValue = ((Double) obj2).floatValue();
                    } else if (obj2 instanceof Float) {
                        fFloatValue = ((Float) obj2).floatValue();
                    } else if (obj2 instanceof Boolean) {
                        editorEdit.putBoolean(next, ((Boolean) obj2).booleanValue());
                    } else if (obj2 instanceof String) {
                        editorEdit.putString(next, (String) obj2);
                    }
                    editorEdit.putFloat(next, fFloatValue);
                }
            }
            editorEdit.apply();
        } catch (JSONException e8) {
            g2.t.q().u(e8, "GMSG write local storage KV pairs handler");
        }
    }
}
