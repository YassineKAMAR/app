package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f16555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f16556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f16557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f16558d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f16559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f16560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f16561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f16562h;

    protected w(long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.f16555a = j8;
        this.f16556b = j9;
        this.f16559e = j11;
        this.f16560f = j12;
        this.f16561g = j13;
        this.f16557c = j14;
        this.f16562h = f(j9, 0L, j11, j12, j13, j14);
    }

    protected static long f(long j8, long j9, long j10, long j11, long j12, long j13) {
        if (j11 + 1 >= j12 || 1 + j9 >= j10) {
            return j11;
        }
        long j14 = (long) ((j8 - j9) * ((j12 - j11) / (j10 - j9)));
        return Math.max(j11, Math.min(((j11 + j14) - j13) - (j14 / 20), j12 - 1));
    }

    static /* bridge */ /* synthetic */ void g(w wVar, long j8, long j9) {
        wVar.f16559e = j8;
        wVar.f16561g = j9;
        wVar.i();
    }

    static /* bridge */ /* synthetic */ void h(w wVar, long j8, long j9) {
        wVar.f16558d = j8;
        wVar.f16560f = j9;
        wVar.i();
    }

    private final void i() {
        this.f16562h = f(this.f16556b, this.f16558d, this.f16559e, this.f16560f, this.f16561g, this.f16557c);
    }
}
