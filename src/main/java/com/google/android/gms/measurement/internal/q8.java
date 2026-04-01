package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class q8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Bundle f20409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ p8 f20410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ p8 f20411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ long f20412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ o8 f20413e;

    q8(o8 o8Var, Bundle bundle, p8 p8Var, p8 p8Var2, long j8) {
        this.f20413e = o8Var;
        this.f20409a = bundle;
        this.f20410b = p8Var;
        this.f20411c = p8Var2;
        this.f20412d = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o8.J(this.f20413e, this.f20409a, this.f20410b, this.f20411c, this.f20412d);
    }
}
