package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ti2 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f15118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w84 f15119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w84 f15120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w84 f15121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w84 f15122e;

    public ti2(w84 w84Var, w84 w84Var2, w84 w84Var3, w84 w84Var4, w84 w84Var5) {
        this.f15118a = w84Var;
        this.f15119b = w84Var2;
        this.f15120c = w84Var3;
        this.f15121d = w84Var4;
        this.f15122e = w84Var5;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ri2 k() {
        Context contextA = ((io0) this.f15118a).a();
        lg3 lg3Var = eh0.f7322a;
        r84.b(lg3Var);
        return new ri2(contextA, lg3Var, ((u84) this.f15120c).k(), (qy2) this.f15121d.k(), (eq1) this.f15122e.k());
    }
}
