package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public class e0 implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f7076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f7077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f7079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f7080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f7081f;

    public e0(long j8, long j9, int i8, int i9, boolean z7) {
        long jC;
        this.f7076a = j8;
        this.f7077b = j9;
        this.f7078c = i9 == -1 ? 1 : i9;
        this.f7080e = i8;
        if (j8 == -1) {
            this.f7079d = -1L;
            jC = -9223372036854775807L;
        } else {
            this.f7079d = j8 - j9;
            jC = c(j8, j9, i8);
        }
        this.f7081f = jC;
    }

    private static long c(long j8, long j9, int i8) {
        return (Math.max(0L, j8 - j9) * 8000000) / ((long) i8);
    }

    public final long b(long j8) {
        return c(j8, this.f7077b, this.f7080e);
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final long j() {
        return this.f7081f;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final boolean o() {
        return this.f7079d != -1;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final o1 p(long j8) {
        long j9 = this.f7079d;
        if (j9 == -1) {
            r1 r1Var = new r1(0L, this.f7077b);
            return new o1(r1Var, r1Var);
        }
        long j10 = ((long) this.f7080e) * j8;
        long j11 = this.f7078c;
        long jMin = ((j10 / 8000000) / j11) * j11;
        if (j9 != -1) {
            jMin = Math.min(jMin, j9 - j11);
        }
        long jMax = this.f7077b + Math.max(jMin, 0L);
        long jB = b(jMax);
        r1 r1Var2 = new r1(jB, jMax);
        if (this.f7079d != -1 && jB < j8) {
            long j12 = jMax + ((long) this.f7078c);
            if (j12 < this.f7076a) {
                return new o1(r1Var2, new r1(b(j12), j12));
            }
        }
        return new o1(r1Var2, r1Var2);
    }
}
