package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
final class k5 implements m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f9947a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f9948b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t5 f9949c = new t5();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l5 f9950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f9952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f9953g;

    private final long c(q0 q0Var, int i8) throws EOFException, InterruptedIOException {
        ((f0) q0Var).J(this.f9947a, 0, i8, false);
        long j8 = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            j8 = (j8 << 8) | ((long) (this.f9947a[i9] & 255));
        }
        return j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4 A[LOOP:0: B:3:0x0005->B:36:0x00b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016d A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.m5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.google.android.gms.internal.ads.q0 r14) throws com.google.android.gms.internal.ads.yh0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k5.a(com.google.android.gms.internal.ads.q0):boolean");
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void b(l5 l5Var) {
        this.f9950d = l5Var;
    }

    @Override // com.google.android.gms.internal.ads.m5
    public final void k() {
        this.f9951e = 0;
        this.f9948b.clear();
        this.f9949c.e();
    }
}
