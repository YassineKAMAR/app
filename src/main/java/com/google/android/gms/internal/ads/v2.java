package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class v2 extends a0 {
    public v2(final c1 c1Var, int i8, long j8, long j9) {
        long j10;
        x xVar = new x() { // from class: com.google.android.gms.internal.ads.s2
            @Override // com.google.android.gms.internal.ads.x
            public final long a(long j11) {
                return c1Var.b(j11);
            }
        };
        u2 u2Var = new u2(c1Var, i8, null);
        long jA = c1Var.a();
        long j11 = c1Var.f6097j;
        int i9 = c1Var.f6091d;
        if (i9 > 0) {
            j10 = ((((long) i9) + ((long) c1Var.f6090c)) / 2) + 1;
        } else {
            int i10 = c1Var.f6088a;
            long j12 = 4096;
            if (i10 == c1Var.f6089b && i10 > 0) {
                j12 = i10;
            }
            j10 = (((j12 * ((long) c1Var.f6094g)) * ((long) c1Var.f6095h)) / 8) + 64;
        }
        super(xVar, u2Var, jA, 0L, j11, j8, j9, j10, Math.max(6, c1Var.f6090c));
    }
}
