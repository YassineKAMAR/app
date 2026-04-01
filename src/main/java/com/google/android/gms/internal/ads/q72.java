package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class q72 implements z22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f13321a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xn1 f13322b;

    public q72(xn1 xn1Var) {
        this.f13322b = xn1Var;
    }

    @Override // com.google.android.gms.internal.ads.z22
    public final a32 a(String str, JSONObject jSONObject) {
        a32 a32Var;
        synchronized (this) {
            a32Var = (a32) this.f13321a.get(str);
            if (a32Var == null) {
                a32Var = new a32(this.f13322b.c(str, jSONObject), new w42(), str);
                this.f13321a.put(str, a32Var);
            }
        }
        return a32Var;
    }
}
