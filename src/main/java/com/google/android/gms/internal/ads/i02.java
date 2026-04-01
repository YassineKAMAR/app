package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class i02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e02 f9031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lg3 f9032b;

    public i02(e02 e02Var, lg3 lg3Var) {
        this.f9031a = e02Var;
        this.f9032b = lg3Var;
    }

    public final void a(dw2 dw2Var) {
        final e02 e02Var = this.f9031a;
        zf3.r(this.f9032b.Z(new Callable() { // from class: com.google.android.gms.internal.ads.g02
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e02Var.getWritableDatabase();
            }
        }), new h02(this, dw2Var), this.f9032b);
    }
}
