package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class vr4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f16433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f16434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f16435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f16436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f16437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f16438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f16439g = new boolean[15];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f16440h;

    public final long a() {
        long j8 = this.f16437e;
        if (j8 == 0) {
            return 0L;
        }
        return this.f16438f / j8;
    }

    public final long b() {
        return this.f16438f;
    }

    public final void c(long j8) {
        int i8;
        long j9 = this.f16436d;
        if (j9 == 0) {
            this.f16433a = j8;
        } else if (j9 == 1) {
            long j10 = j8 - this.f16433a;
            this.f16434b = j10;
            this.f16438f = j10;
            this.f16437e = 1L;
        } else {
            long j11 = j8 - this.f16435c;
            int i9 = (int) (j9 % 15);
            if (Math.abs(j11 - this.f16434b) <= 1000000) {
                this.f16437e++;
                this.f16438f += j11;
                boolean[] zArr = this.f16439g;
                if (zArr[i9]) {
                    zArr[i9] = false;
                    i8 = this.f16440h - 1;
                    this.f16440h = i8;
                }
            } else {
                boolean[] zArr2 = this.f16439g;
                if (!zArr2[i9]) {
                    zArr2[i9] = true;
                    i8 = this.f16440h + 1;
                    this.f16440h = i8;
                }
            }
        }
        this.f16436d++;
        this.f16435c = j8;
    }

    public final void d() {
        this.f16436d = 0L;
        this.f16437e = 0L;
        this.f16438f = 0L;
        this.f16440h = 0;
        Arrays.fill(this.f16439g, false);
    }

    public final boolean e() {
        long j8 = this.f16436d;
        if (j8 == 0) {
            return false;
        }
        return this.f16439g[(int) ((j8 - 1) % 15)];
    }

    public final boolean f() {
        return this.f16436d > 15 && this.f16440h == 0;
    }
}
