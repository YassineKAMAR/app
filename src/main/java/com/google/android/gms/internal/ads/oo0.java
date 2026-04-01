package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class oo0 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f12573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f12574b;

    public oo0(w84 w84Var, w84 w84Var2) {
        this.f12573a = w84Var;
        this.f12574b = w84Var2;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        ls1 ls1Var = (ls1) this.f12573a.k();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        Set setSingleton = ((Boolean) h2.y.c().b(ns.B1)).booleanValue() ? Collections.singleton(new yb1(ls1Var, lg3Var)) : Collections.emptySet();
        r84.b(setSingleton);
        return setSingleton;
    }
}
