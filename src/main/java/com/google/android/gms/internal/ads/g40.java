package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g40 implements r30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t30 f8193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u30 f8194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n30 f8195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8196d;

    g40(n30 n30Var, String str, u30 u30Var, t30 t30Var) {
        this.f8195c = n30Var;
        this.f8196d = str;
        this.f8194b = u30Var;
        this.f8193a = t30Var;
    }

    static /* bridge */ /* synthetic */ void d(g40 g40Var, h30 h30Var, o30 o30Var, Object obj, jh0 jh0Var) {
        try {
            g2.t.r();
            String string = UUID.randomUUID().toString();
            pz.f13213o.c(string, new f40(g40Var, h30Var, jh0Var));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", g40Var.f8194b.b(obj));
            o30Var.x0(g40Var.f8196d, jSONObject);
        } catch (Exception e8) {
            try {
                jh0Var.e(e8);
                qg0.e("Unable to invokeJavascript", e8);
            } finally {
                h30Var.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.gf3
    public final x3.d a(Object obj) {
        return b(obj);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final x3.d b(Object obj) {
        jh0 jh0Var = new jh0();
        h30 h30VarB = this.f8195c.b(null);
        h30VarB.e(new d40(this, h30VarB, obj, jh0Var), new e40(this, jh0Var, h30VarB));
        return jh0Var;
    }
}
