package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e20 {
    public static void a(f20 f20Var, String str, Map map) {
        try {
            f20Var.e(str, h2.v.b().m(map));
        } catch (JSONException unused) {
            qg0.g("Could not convert parameters to JSON.");
        }
    }

    public static void b(f20 f20Var, String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        qg0.b("Dispatching AFMA event: ".concat(sb.toString()));
        f20Var.a(sb.toString());
    }

    public static void c(f20 f20Var, String str, String str2) {
        f20Var.a(str + "(" + str2 + ");");
    }

    public static void d(f20 f20Var, String str, JSONObject jSONObject) {
        f20Var.b(str, jSONObject.toString());
    }
}
