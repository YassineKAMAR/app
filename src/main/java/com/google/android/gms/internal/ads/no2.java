package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class no2 implements dv2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kp2 f11933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mp2 f11934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2.r4 f11935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f11937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h2.c5 f11938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final su2 f11939g;

    public no2(kp2 kp2Var, mp2 mp2Var, h2.r4 r4Var, String str, Executor executor, h2.c5 c5Var, su2 su2Var) {
        this.f11933a = kp2Var;
        this.f11934b = mp2Var;
        this.f11935c = r4Var;
        this.f11936d = str;
        this.f11937e = executor;
        this.f11938f = c5Var;
        this.f11939g = su2Var;
    }

    @Override // com.google.android.gms.internal.ads.dv2
    public final su2 j() {
        return this.f11939g;
    }

    @Override // com.google.android.gms.internal.ads.dv2
    public final Executor k() {
        return this.f11937e;
    }
}
