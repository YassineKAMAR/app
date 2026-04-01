package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class vf1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f16146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f16147b;

    public vf1(w84 w84Var, w84 w84Var2) {
        this.f16146a = w84Var;
        this.f16147b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        wg0 wg0VarA = ((uo0) this.f16146a).a();
        g2.t.r();
        return new pk(UUID.randomUUID().toString(), wg0VarA, "native", new JSONObject(), false, true);
    }
}
