package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o9 implements p0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final w0 f12402l = new w0() { // from class: com.google.android.gms.internal.ads.m9
        @Override // com.google.android.gms.internal.ads.w0
        public final /* synthetic */ p0[] a(Uri uri, Map map) {
            int i8 = v0.f15946a;
            return new p0[]{new o9()};
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f12407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f12409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f12410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j9 f12411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private s0 f12412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f12413k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kx2 f12403a = new kx2(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dq2 f12405c = new dq2(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f12404b = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k9 f12406d = new k9();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.kx2 r5 = r4.f12403a
            long r0 = r5.e()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.c()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.f(r7)
        L24:
            com.google.android.gms.internal.ads.j9 r5 = r4.f12411i
            r6 = 0
            if (r5 == 0) goto L2c
            r5.d(r7)
        L2c:
            android.util.SparseArray r5 = r4.f12404b
            int r5 = r5.size()
            if (r6 >= r5) goto L42
            android.util.SparseArray r5 = r4.f12404b
            java.lang.Object r5 = r5.valueAt(r6)
            com.google.android.gms.internal.ads.n9 r5 = (com.google.android.gms.internal.ads.n9) r5
            r5.b()
            int r6 = r6 + 1
            goto L2c
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o9.e(long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    @Override // com.google.android.gms.internal.ads.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(com.google.android.gms.internal.ads.q0 r17, com.google.android.gms.internal.ads.n1 r18) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o9.f(com.google.android.gms.internal.ads.q0, com.google.android.gms.internal.ads.n1):int");
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final boolean g(q0 q0Var) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        f0 f0Var = (f0) q0Var;
        f0Var.L(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        f0Var.c(bArr[13] & 7, false);
        f0Var.L(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void h(s0 s0Var) {
        this.f12412j = s0Var;
    }
}
