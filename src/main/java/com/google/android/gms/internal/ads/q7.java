package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r7 f13312a = new r7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dq2 f13313b = new dq2(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13314c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f13315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f13316e;

    q7() {
    }

    private final int f(int i8) {
        int i9;
        int i10 = 0;
        this.f13315d = 0;
        do {
            int i11 = this.f13315d;
            int i12 = i8 + i11;
            r7 r7Var = this.f13312a;
            if (i12 >= r7Var.f13958c) {
                break;
            }
            this.f13315d = i11 + 1;
            i9 = r7Var.f13961f[i12];
            i10 += i9;
        } while (i9 == 255);
        return i10;
    }

    public final dq2 a() {
        return this.f13313b;
    }

    public final r7 b() {
        return this.f13312a;
    }

    public final void c() {
        this.f13312a.a();
        this.f13313b.d(0);
        this.f13314c = -1;
        this.f13316e = false;
    }

    public final void d() {
        dq2 dq2Var = this.f13313b;
        if (dq2Var.i().length == 65025) {
            return;
        }
        dq2Var.e(Arrays.copyOf(dq2Var.i(), Math.max(65025, dq2Var.m())), this.f13313b.m());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(com.google.android.gms.internal.ads.q0 r7) {
        /*
            r6 = this;
            boolean r0 = r6.f13316e
            r1 = 0
            if (r0 != 0) goto L6
            goto Ld
        L6:
            r6.f13316e = r1
            com.google.android.gms.internal.ads.dq2 r0 = r6.f13313b
            r0.d(r1)
        Ld:
            boolean r0 = r6.f13316e
            r2 = 1
            if (r0 != 0) goto L99
            int r0 = r6.f13314c
            if (r0 >= 0) goto L4e
            com.google.android.gms.internal.ads.r7 r0 = r6.f13312a
            r3 = -1
            boolean r0 = r0.c(r7, r3)
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.r7 r0 = r6.f13312a
            boolean r0 = r0.b(r7, r2)
            if (r0 != 0) goto L29
            goto L4d
        L29:
            com.google.android.gms.internal.ads.r7 r0 = r6.f13312a
            int r3 = r0.f13959d
            int r0 = r0.f13956a
            r0 = r0 & r2
            if (r0 != r2) goto L42
            com.google.android.gms.internal.ads.dq2 r0 = r6.f13313b
            int r0 = r0.m()
            if (r0 != 0) goto L42
            int r0 = r6.f(r1)
            int r3 = r3 + r0
            int r0 = r6.f13315d
            goto L43
        L42:
            r0 = 0
        L43:
            boolean r3 = com.google.android.gms.internal.ads.t0.e(r7, r3)
            if (r3 != 0) goto L4a
            return r1
        L4a:
            r6.f13314c = r0
            goto L4e
        L4d:
            return r1
        L4e:
            int r0 = r6.f(r0)
            int r3 = r6.f13314c
            int r4 = r6.f13315d
            int r3 = r3 + r4
            if (r0 <= 0) goto L8e
            com.google.android.gms.internal.ads.dq2 r4 = r6.f13313b
            int r5 = r4.m()
            int r5 = r5 + r0
            r4.a(r5)
            com.google.android.gms.internal.ads.dq2 r4 = r6.f13313b
            byte[] r5 = r4.i()
            int r4 = r4.m()
            boolean r4 = com.google.android.gms.internal.ads.t0.d(r7, r5, r4, r0)
            if (r4 != 0) goto L74
            return r1
        L74:
            com.google.android.gms.internal.ads.dq2 r4 = r6.f13313b
            int r5 = r4.m()
            int r5 = r5 + r0
            r4.f(r5)
            com.google.android.gms.internal.ads.r7 r0 = r6.f13312a
            int r4 = r3 + (-1)
            int[] r0 = r0.f13961f
            r0 = r0[r4]
            r4 = 255(0xff, float:3.57E-43)
            if (r0 == r4) goto L8b
            goto L8c
        L8b:
            r2 = 0
        L8c:
            r6.f13316e = r2
        L8e:
            com.google.android.gms.internal.ads.r7 r0 = r6.f13312a
            int r0 = r0.f13958c
            if (r3 != r0) goto L95
            r3 = -1
        L95:
            r6.f13314c = r3
            goto Ld
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q7.e(com.google.android.gms.internal.ads.q0):boolean");
    }
}
