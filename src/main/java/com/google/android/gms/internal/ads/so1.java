package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class so1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f14776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f14777b;

    public so1(w84 w84Var, w84 w84Var2) {
        this.f14776a = w84Var;
        this.f14777b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        Set setSingleton = ((Boolean) h2.y.c().b(ns.M4)).booleanValue() ? Collections.singleton(new yb1(((lp1) this.f14777b).k(), lg3Var)) : Collections.emptySet();
        r84.b(setSingleton);
        return setSingleton;
    }
}
