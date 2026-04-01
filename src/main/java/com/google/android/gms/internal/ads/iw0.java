package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class iw0 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f9385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f9386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f9387c;

    public iw0(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f9385a = w84Var;
        this.f9386b = w84Var2;
        this.f9387c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        wg0 wg0VarA = ((uo0) this.f9385a).a();
        JSONObject jSONObject = (JSONObject) this.f9386b.k();
        String str = (String) this.f9387c.k();
        boolean zEquals = "native".equals(str);
        g2.t.r();
        return new pk(UUID.randomUUID().toString(), wg0VarA, str, jSONObject, false, zEquals);
    }
}
