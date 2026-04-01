package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ib0 extends jb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f9124a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f9125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f9126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r30 f9127d;

    public ib0(Context context, r30 r30Var) {
        this.f9125b = context.getApplicationContext();
        this.f9127d = r30Var;
    }

    public static JSONObject c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", wg0.g().f16723a);
            jSONObject.put("mf", ju.f9803a.e());
            jSONObject.put("cl", "575948185");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final x3.d a() {
        synchronized (this.f9124a) {
            if (this.f9126c == null) {
                this.f9126c = this.f9125b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (g2.t.b().a() - this.f9126c.getLong("js_last_update", 0L) < ((Long) ju.f9804b.e()).longValue()) {
            return zf3.h(null);
        }
        return zf3.m(this.f9127d.b(c(this.f9125b)), new z73() { // from class: com.google.android.gms.internal.ads.hb0
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                this.f8711a.b((JSONObject) obj);
                return null;
            }
        }, eh0.f7327f);
    }

    final /* synthetic */ Void b(JSONObject jSONObject) {
        fs fsVar = ns.f12021a;
        h2.y.b();
        SharedPreferences.Editor editorEdit = hs.a(this.f9125b).edit();
        h2.y.a();
        ut utVar = zt.f18483a;
        h2.y.a().e(editorEdit, 1, jSONObject);
        h2.y.b();
        editorEdit.commit();
        this.f9126c.edit().putLong("js_last_update", g2.t.b().a()).apply();
        return null;
    }
}
