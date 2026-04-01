package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class tg2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f15087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f15088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f15089c;

    public tg2(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f15087a = w84Var;
        this.f15088b = w84Var2;
        this.f15089c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new rg2(lg3Var, ((io0) this.f15088b).a(), (Set) this.f15089c.k());
    }
}
