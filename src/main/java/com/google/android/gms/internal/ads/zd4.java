package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class zd4 implements tc4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vv1 f18173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f18174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f18175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f18176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private dm0 f18177e = dm0.f6807d;

    public zd4(vv1 vv1Var) {
        this.f18173a = vv1Var;
    }

    public final void a(long j8) {
        this.f18175c = j8;
        if (this.f18174b) {
            this.f18176d = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (this.f18174b) {
            return;
        }
        this.f18176d = SystemClock.elapsedRealtime();
        this.f18174b = true;
    }

    public final void c() {
        if (this.f18174b) {
            a(j());
            this.f18174b = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.tc4
    public final void d(dm0 dm0Var) {
        if (this.f18174b) {
            a(j());
        }
        this.f18177e = dm0Var;
    }

    @Override // com.google.android.gms.internal.ads.tc4
    public final long j() {
        long j8 = this.f18175c;
        if (!this.f18174b) {
            return j8;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f18176d;
        dm0 dm0Var = this.f18177e;
        return j8 + (dm0Var.f6811a == 1.0f ? nz2.C(jElapsedRealtime) : dm0Var.a(jElapsedRealtime));
    }

    @Override // com.google.android.gms.internal.ads.tc4
    public final dm0 l() {
        return this.f18177e;
    }
}
