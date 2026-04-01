package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class ea4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f7229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f7230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f7231c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f7232d = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f7234f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f7235g = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f7238j = 0.97f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f7237i = 1.03f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f7239k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f7240l = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f7233e = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f7236h = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f7241m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f7242n = -9223372036854775807L;

    /* synthetic */ ea4(float f8, float f9, long j8, float f10, long j9, long j10, float f11, da4 da4Var) {
        this.f7229a = j9;
        this.f7230b = j10;
    }

    private static long f(long j8, long j9, float f8) {
        return (long) ((j8 * 0.999f) + (j9 * 9.999871E-4f));
    }

    private final void g() {
        long j8 = this.f7231c;
        if (j8 != -9223372036854775807L) {
            long j9 = this.f7232d;
            if (j9 != -9223372036854775807L) {
                j8 = j9;
            }
            long j10 = this.f7234f;
            if (j10 != -9223372036854775807L && j8 < j10) {
                j8 = j10;
            }
            long j11 = this.f7235g;
            if (j11 != -9223372036854775807L && j8 > j11) {
                j8 = j11;
            }
        } else {
            j8 = -9223372036854775807L;
        }
        if (this.f7233e == j8) {
            return;
        }
        this.f7233e = j8;
        this.f7236h = j8;
        this.f7241m = -9223372036854775807L;
        this.f7242n = -9223372036854775807L;
        this.f7240l = -9223372036854775807L;
    }

    public final float a(long j8, long j9) {
        long jF;
        if (this.f7231c != -9223372036854775807L) {
            long j10 = j8 - j9;
            long j11 = this.f7241m;
            if (j11 == -9223372036854775807L) {
                this.f7241m = j10;
                jF = 0;
            } else {
                long jMax = Math.max(j10, f(j11, j10, 0.999f));
                this.f7241m = jMax;
                jF = f(this.f7242n, Math.abs(j10 - jMax), 0.999f);
            }
            this.f7242n = jF;
            if (this.f7240l != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f7240l < 1000) {
                return this.f7239k;
            }
            this.f7240l = SystemClock.elapsedRealtime();
            long jMax2 = this.f7241m + (this.f7242n * 3);
            if (this.f7236h > jMax2) {
                float fC = nz2.C(1000L);
                long[] jArr = {jMax2, this.f7233e, this.f7236h - (((long) ((this.f7239k - 1.0f) * fC)) + ((long) ((this.f7237i - 1.0f) * fC)))};
                for (int i8 = 1; i8 < 3; i8++) {
                    long j12 = jArr[i8];
                    if (j12 > jMax2) {
                        jMax2 = j12;
                    }
                }
                this.f7236h = jMax2;
            } else {
                jMax2 = Math.max(this.f7236h, Math.min(j8 - ((long) (Math.max(0.0f, this.f7239k - 1.0f) / 1.0E-7f)), jMax2));
                this.f7236h = jMax2;
                long j13 = this.f7235g;
                if (j13 != -9223372036854775807L && jMax2 > j13) {
                    this.f7236h = j13;
                    jMax2 = j13;
                }
            }
            long j14 = j8 - jMax2;
            fMax = Math.abs(j14) >= this.f7229a ? Math.max(this.f7238j, Math.min((j14 * 1.0E-7f) + 1.0f, this.f7237i)) : 1.0f;
            this.f7239k = fMax;
        }
        return fMax;
    }

    public final long b() {
        return this.f7236h;
    }

    public final void c() {
        long j8 = this.f7236h;
        if (j8 == -9223372036854775807L) {
            return;
        }
        long j9 = j8 + this.f7230b;
        this.f7236h = j9;
        long j10 = this.f7235g;
        if (j10 != -9223372036854775807L && j9 > j10) {
            this.f7236h = j10;
        }
        this.f7240l = -9223372036854775807L;
    }

    public final void d(iv ivVar) {
        long j8 = ivVar.f9375a;
        this.f7231c = nz2.C(-9223372036854775807L);
        this.f7234f = nz2.C(-9223372036854775807L);
        this.f7235g = nz2.C(-9223372036854775807L);
        this.f7238j = 0.97f;
        this.f7237i = 1.03f;
        g();
    }

    public final void e(long j8) {
        this.f7232d = j8;
        g();
    }
}
