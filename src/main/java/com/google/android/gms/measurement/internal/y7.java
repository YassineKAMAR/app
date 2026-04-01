package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class y7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.w1 f20730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f20731b;

    y7(b7 b7Var, com.google.android.gms.internal.measurement.w1 w1Var) {
        this.f20731b = b7Var;
        this.f20730a = w1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.b7 r0 = r7.f20731b
            com.google.android.gms.measurement.internal.da r0 = r0.s()
            boolean r1 = com.google.android.gms.internal.measurement.xf.a()
            r2 = 0
            if (r1 == 0) goto L64
            com.google.android.gms.measurement.internal.f r1 = r0.a()
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.e0.D0
            boolean r1 = r1.q(r3)
            if (r1 == 0) goto L64
            com.google.android.gms.measurement.internal.y4 r1 = r0.e()
            com.google.android.gms.measurement.internal.y6 r1 = r1.J()
            boolean r1 = r1.y()
            if (r1 != 0) goto L32
            com.google.android.gms.measurement.internal.n4 r0 = r0.t()
            com.google.android.gms.measurement.internal.p4 r0 = r0.M()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            goto L6e
        L32:
            com.google.android.gms.measurement.internal.y4 r1 = r0.e()
            e3.e r3 = r0.k()
            long r3 = r3.a()
            boolean r1 = r1.y(r3)
            if (r1 != 0) goto L71
            com.google.android.gms.measurement.internal.y4 r1 = r0.e()
            com.google.android.gms.measurement.internal.d5 r1 = r1.f20711q
            long r3 = r1.a()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L55
            goto L71
        L55:
            com.google.android.gms.measurement.internal.y4 r0 = r0.e()
            com.google.android.gms.measurement.internal.d5 r0 = r0.f20711q
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L72
        L64:
            com.google.android.gms.measurement.internal.n4 r0 = r0.t()
            com.google.android.gms.measurement.internal.p4 r0 = r0.M()
            java.lang.String r1 = "getSessionId has been disabled."
        L6e:
            r0.a(r1)
        L71:
            r0 = r2
        L72:
            if (r0 == 0) goto L86
            com.google.android.gms.measurement.internal.b7 r1 = r7.f20731b
            com.google.android.gms.measurement.internal.w5 r1 = r1.f20556a
            com.google.android.gms.measurement.internal.ib r1 = r1.L()
            com.google.android.gms.internal.measurement.w1 r2 = r7.f20730a
            long r3 = r0.longValue()
            r1.P(r2, r3)
            return
        L86:
            com.google.android.gms.internal.measurement.w1 r0 = r7.f20730a     // Catch: android.os.RemoteException -> L8c
            r0.f(r2)     // Catch: android.os.RemoteException -> L8c
            return
        L8c:
            r0 = move-exception
            com.google.android.gms.measurement.internal.b7 r1 = r7.f20731b
            com.google.android.gms.measurement.internal.w5 r1 = r1.f20556a
            com.google.android.gms.measurement.internal.n4 r1 = r1.t()
            com.google.android.gms.measurement.internal.p4 r1 = r1.G()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.y7.run():void");
    }
}
