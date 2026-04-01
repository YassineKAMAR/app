package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
final class fz implements qz {
    fz() {
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        fm0 fm0Var = (fm0) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(fm0Var.getContext()).edit();
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                editorEdit.remove(jSONArray.getString(i8));
            }
            editorEdit.apply();
        } catch (JSONException e8) {
            g2.t.q().u(e8, "GMSG clear local storage keys handler");
        }
    }
}
