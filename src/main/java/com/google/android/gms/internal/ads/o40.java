package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class o40 implements gf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t30 f12360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u30 f12361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12362c = "google.afma.activeView.handleUpdate";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x3.d f12363d;

    o40(x3.d dVar, String str, u30 u30Var, t30 t30Var) {
        this.f12363d = dVar;
        this.f12361b = u30Var;
        this.f12360a = t30Var;
    }

    @Override // com.google.android.gms.internal.ads.gf3
    public final x3.d a(Object obj) {
        return b(obj);
    }

    public final x3.d b(final Object obj) {
        return zf3.n(this.f12363d, new gf3() { // from class: com.google.android.gms.internal.ads.m40
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj2) {
                return this.f11152a.c(obj, (o30) obj2);
            }
        }, eh0.f7327f);
    }

    final /* synthetic */ x3.d c(Object obj, o30 o30Var) throws JSONException {
        jh0 jh0Var = new jh0();
        g2.t.r();
        String string = UUID.randomUUID().toString();
        pz.f13213o.c(string, new n40(this, jh0Var));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        o30Var.x0(this.f12362c, jSONObject);
        return jh0Var;
    }
}
