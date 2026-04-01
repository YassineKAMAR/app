package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.yf;

/* JADX INFO: loaded from: classes.dex */
final class d8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ y6 f19906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f19907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ long f19908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f19909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ y6 f19910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ b7 f19911f;

    d8(b7 b7Var, y6 y6Var, long j8, long j9, boolean z7, y6 y6Var2) {
        this.f19911f = b7Var;
        this.f19906a = y6Var;
        this.f19907b = j8;
        this.f19908c = j9;
        this.f19909d = z7;
        this.f19910e = y6Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19911f.J(this.f19906a);
        this.f19911f.E(this.f19907b, false);
        b7.L(this.f19911f, this.f19906a, this.f19908c, true, this.f19909d);
        if (yf.a() && this.f19911f.a().q(e0.f19970x0)) {
            b7.M(this.f19911f, this.f19906a, this.f19910e);
        }
    }
}
