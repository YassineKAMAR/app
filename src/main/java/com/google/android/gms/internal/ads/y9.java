package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y9 implements p0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final w0 f17637q = new w0() { // from class: com.google.android.gms.internal.ads.v9
        @Override // com.google.android.gms.internal.ads.w0
        public final /* synthetic */ p0[] a(Uri uri, Map map) {
            int i8 = v0.f15946a;
            return new p0[]{new y9(0)};
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f17638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dq2 f17639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseIntArray f17640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ba f17641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray f17642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseBooleanArray f17643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseBooleanArray f17644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u9 f17645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private t9 f17646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private s0 f17647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17648k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17649l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f17650m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f17651n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f17652o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f17653p;

    public y9(int i8) {
        this(1, new kx2(0L), new m8(0), 112800);
    }

    public y9(int i8, kx2 kx2Var, ba baVar, int i9) {
        this.f17641d = baVar;
        this.f17638a = Collections.singletonList(kx2Var);
        this.f17639b = new dq2(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f17643f = sparseBooleanArray;
        this.f17644g = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f17642e = sparseArray;
        this.f17640c = new SparseIntArray();
        this.f17645h = new u9(112800);
        this.f17647j = s0.K;
        this.f17653p = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f17642e.put(sparseArray2.keyAt(i10), (da) sparseArray2.valueAt(i10));
        }
        this.f17642e.put(0, new q9(new w9(this)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // com.google.android.gms.internal.ads.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r10, long r12) {
        /*
            r9 = this;
            java.util.List r10 = r9.f17638a
            int r10 = r10.size()
            r11 = 0
            r0 = 0
        L8:
            r1 = 0
            if (r0 >= r10) goto L37
            java.util.List r3 = r9.f17638a
            java.lang.Object r3 = r3.get(r0)
            com.google.android.gms.internal.ads.kx2 r3 = (com.google.android.gms.internal.ads.kx2) r3
            long r4 = r3.e()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L31
            long r4 = r3.c()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L34
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 == 0) goto L34
            int r1 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r1 == 0) goto L34
        L31:
            r3.f(r12)
        L34:
            int r0 = r0 + 1
            goto L8
        L37:
            int r10 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r10 == 0) goto L42
            com.google.android.gms.internal.ads.t9 r10 = r9.f17646i
            if (r10 == 0) goto L42
            r10.d(r12)
        L42:
            com.google.android.gms.internal.ads.dq2 r10 = r9.f17639b
            r10.d(r11)
            android.util.SparseIntArray r10 = r9.f17640c
            r10.clear()
            r10 = 0
        L4d:
            android.util.SparseArray r12 = r9.f17642e
            int r12 = r12.size()
            if (r10 >= r12) goto L63
            android.util.SparseArray r12 = r9.f17642e
            java.lang.Object r12 = r12.valueAt(r10)
            com.google.android.gms.internal.ads.da r12 = (com.google.android.gms.internal.ads.da) r12
            r12.l()
            int r10 = r10 + 1
            goto L4d
        L63:
            r9.f17652o = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y9.e(long, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ab  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(com.google.android.gms.internal.ads.q0 r19, com.google.android.gms.internal.ads.n1 r20) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y9.f(com.google.android.gms.internal.ads.q0, com.google.android.gms.internal.ads.n1):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r2 = r2 + 1;
     */
    @Override // com.google.android.gms.internal.ads.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(com.google.android.gms.internal.ads.q0 r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.dq2 r0 = r6.f17639b
            byte[] r0 = r0.i()
            com.google.android.gms.internal.ads.f0 r7 = (com.google.android.gms.internal.ads.f0) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.L(r0, r1, r2, r1)
            r2 = 0
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L2b
            r3 = 0
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r2 = r2 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.d(r2, r1)
            r7 = 1
            return r7
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y9.g(com.google.android.gms.internal.ads.q0):boolean");
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void h(s0 s0Var) {
        this.f17647j = s0Var;
    }
}
