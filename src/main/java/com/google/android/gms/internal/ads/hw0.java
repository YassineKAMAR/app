package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class hw0 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f9002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f9003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f9004c;

    public hw0(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f9002a = w84Var;
        this.f9003b = w84Var2;
        this.f9004c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        ew0 ew0Var = (ew0) this.f9002a.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        Set setEmptySet = ((JSONObject) this.f9004c.k()) == null ? Collections.emptySet() : Collections.singleton(new yb1(ew0Var, lg3Var));
        r84.b(setEmptySet);
        return setEmptySet;
    }
}
