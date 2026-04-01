package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a3 implements p0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final w0 f4974q = new w0() { // from class: com.google.android.gms.internal.ads.z2
        @Override // com.google.android.gms.internal.ads.w0
        public final /* synthetic */ p0[] a(Uri uri, Map map) {
            int i8 = v0.f15946a;
            return new p0[]{new a3()};
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s0 f4980f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f4983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f4984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f4985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f4986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f4987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4988n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private y2 f4989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private e3 f4990p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dq2 f4975a = new dq2(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dq2 f4976b = new dq2(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dq2 f4977c = new dq2(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dq2 f4978d = new dq2();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b3 f4979e = new b3();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f4981g = 1;

    private final dq2 a(q0 q0Var) throws EOFException, InterruptedIOException {
        if (this.f4986l > this.f4978d.k()) {
            dq2 dq2Var = this.f4978d;
            int iK = dq2Var.k();
            dq2Var.e(new byte[Math.max(iK + iK, this.f4986l)], 0);
        } else {
            this.f4978d.g(0);
        }
        this.f4978d.f(this.f4986l);
        ((f0) q0Var).J(this.f4978d.i(), 0, this.f4986l, false);
        return this.f4978d;
    }

    private final void b() {
        if (this.f4988n) {
            return;
        }
        this.f4980f.r(new p1(-9223372036854775807L, 0L));
        this.f4988n = true;
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void e(long j8, long j9) {
        if (j8 == 0) {
            this.f4981g = 1;
            this.f4982h = false;
        } else {
            this.f4981g = 3;
        }
        this.f4984j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(com.google.android.gms.internal.ads.q0 r17, com.google.android.gms.internal.ads.n1 r18) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a3.f(com.google.android.gms.internal.ads.q0, com.google.android.gms.internal.ads.n1):int");
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final boolean g(q0 q0Var) throws EOFException, InterruptedIOException {
        f0 f0Var = (f0) q0Var;
        f0Var.L(this.f4975a.i(), 0, 3, false);
        this.f4975a.g(0);
        if (this.f4975a.w() != 4607062) {
            return false;
        }
        f0Var.L(this.f4975a.i(), 0, 2, false);
        this.f4975a.g(0);
        if ((this.f4975a.y() & 250) != 0) {
            return false;
        }
        f0Var.L(this.f4975a.i(), 0, 4, false);
        this.f4975a.g(0);
        int iO = this.f4975a.o();
        q0Var.t();
        f0 f0Var2 = (f0) q0Var;
        f0Var2.c(iO, false);
        f0Var2.L(this.f4975a.i(), 0, 4, false);
        this.f4975a.g(0);
        return this.f4975a.o() == 0;
    }

    @Override // com.google.android.gms.internal.ads.p0
    public final void h(s0 s0Var) {
        this.f4980f = s0Var;
    }
}
