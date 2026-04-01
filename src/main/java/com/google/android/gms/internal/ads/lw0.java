package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class lw0 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f11077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f11078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f11079c;

    public lw0(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f11077a = w84Var;
        this.f11078b = w84Var2;
        this.f11079c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        ew0 ew0Var = (ew0) this.f11077a.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        Set setEmptySet = ((JSONObject) this.f11079c.k()) == null ? Collections.emptySet() : Collections.singleton(new yb1(ew0Var, lg3Var));
        r84.b(setEmptySet);
        return setEmptySet;
    }
}
