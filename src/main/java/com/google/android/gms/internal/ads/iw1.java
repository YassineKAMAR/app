package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class iw1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f9388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f9389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f9390c;

    public iw1(w84 w84Var, w84 w84Var2, w84 w84Var3) {
        this.f9388a = w84Var;
        this.f9389b = w84Var2;
        this.f9390c = w84Var3;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hw1 k() {
        Map mapC = ((q84) this.f9388a).c();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new hw1(mapC, lg3Var, ((e71) this.f9390c).k());
    }
}
