package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.yf;

/* JADX INFO: loaded from: classes.dex */
final class g8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ y6 f20033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f20034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f20035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ y6 f20036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ b7 f20037e;

    g8(b7 b7Var, y6 y6Var, long j8, boolean z7, y6 y6Var2) {
        this.f20037e = b7Var;
        this.f20033a = y6Var;
        this.f20034b = j8;
        this.f20035c = z7;
        this.f20036d = y6Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20037e.J(this.f20033a);
        b7.L(this.f20037e, this.f20033a, this.f20034b, false, this.f20035c);
        if (yf.a() && this.f20037e.a().q(e0.f19970x0)) {
            b7.M(this.f20037e, this.f20033a, this.f20036d);
        }
    }
}
