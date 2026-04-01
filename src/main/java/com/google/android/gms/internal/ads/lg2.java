package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes.dex */
public final class lg2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f10687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f10688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f10689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f10690d;

    public lg2(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4) {
        this.f10687a = w84Var;
        this.f10688b = w84Var2;
        this.f10689c = w84Var3;
        this.f10690d = w84Var4;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new jg2(lg3Var, ((x31) this.f10688b).a(), (PackageInfo) this.f10689c.k(), ((go0) this.f10690d).k());
    }
}
