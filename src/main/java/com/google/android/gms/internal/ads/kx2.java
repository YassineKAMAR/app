package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class kx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f10379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f10380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f10381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal f10382d = new ThreadLocal();

    public kx2(long j8) {
        f(0L);
    }

    public final synchronized long a(long j8) {
        if (!g()) {
            long jLongValue = this.f10379a;
            if (jLongValue == 9223372036854775806L) {
                Long l8 = (Long) this.f10382d.get();
                l8.getClass();
                jLongValue = l8.longValue();
            }
            this.f10380b = jLongValue - j8;
            notifyAll();
        }
        this.f10381c = j8;
        return j8 + this.f10380b;
    }

    public final synchronized long b(long j8) {
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j9 = this.f10381c;
        if (j9 != -9223372036854775807L) {
            long j10 = (j9 * 90000) / 1000000;
            long j11 = (4294967296L + j10) / 8589934592L;
            long j12 = (((-1) + j11) * 8589934592L) + j8;
            j8 += j11 * 8589934592L;
            if (Math.abs(j12 - j10) < Math.abs(j8 - j10)) {
                j8 = j12;
            }
        }
        return a((j8 * 1000000) / 90000);
    }

    public final synchronized long c() {
        long j8 = this.f10379a;
        if (j8 == Long.MAX_VALUE || j8 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j8;
    }

    public final synchronized long d() {
        long j8;
        j8 = this.f10381c;
        return j8 != -9223372036854775807L ? j8 + this.f10380b : c();
    }

    public final synchronized long e() {
        return this.f10380b;
    }

    public final synchronized void f(long j8) {
        this.f10379a = j8;
        this.f10380b = j8 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f10381c = -9223372036854775807L;
    }

    public final synchronized boolean g() {
        return this.f10380b != -9223372036854775807L;
    }
}
