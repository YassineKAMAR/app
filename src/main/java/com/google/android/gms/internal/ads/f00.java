package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f00 implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f7561a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f7562b = new HashMap();

    @Override // com.google.android.gms.internal.ads.qz
    public final void a(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.f7561a) {
            e00 e00Var = (e00) this.f7562b.remove(str);
            if (e00Var == null) {
                qg0.g("Received result for unexpected method invocation: " + str);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                e00Var.a(str3 + strConcat);
                return;
            }
            if (str5 == null) {
                e00Var.b(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (j2.v1.m()) {
                    j2.v1.k("Result GMSG: " + jSONObject.toString(2));
                }
                e00Var.b(jSONObject);
            } catch (JSONException e8) {
                e00Var.a(e8.getMessage());
            }
        }
    }

    public final x3.d b(q20 q20Var, String str, JSONObject jSONObject) {
        jh0 jh0Var = new jh0();
        g2.t.r();
        String string = UUID.randomUUID().toString();
        c(string, new d00(this, jh0Var));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            q20Var.x0(str, jSONObject2);
        } catch (Exception e8) {
            jh0Var.e(e8);
        }
        return jh0Var;
    }

    public final void c(String str, e00 e00Var) {
        synchronized (this.f7561a) {
            this.f7562b.put(str, e00Var);
        }
    }
}
