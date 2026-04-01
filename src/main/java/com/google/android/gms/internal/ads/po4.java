package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class po4 extends s11 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f12958k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final c50 f12959l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f12960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f12961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f12962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c50 f12963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final iv f12964j;

    static {
        rg rgVar = new rg();
        rgVar.a("SinglePeriodTimeline");
        rgVar.b(Uri.EMPTY);
        f12959l = rgVar.c();
    }

    public po4(long j8, long j9, long j10, long j11, long j12, long j13, long j14, boolean z7, boolean z8, boolean z9, Object obj, c50 c50Var, iv ivVar) {
        this.f12960f = j11;
        this.f12961g = j12;
        this.f12962h = z7;
        c50Var.getClass();
        this.f12963i = c50Var;
        this.f12964j = ivVar;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final int a(Object obj) {
        return f12958k.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final py0 d(int i8, py0 py0Var, boolean z7) {
        uu1.a(i8, 0, 1);
        py0Var.l(null, z7 ? f12958k : null, 0, this.f12960f, 0L, x61.f17055e, false);
        return py0Var;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final r01 e(int i8, r01 r01Var, long j8) {
        uu1.a(i8, 0, 1);
        Object obj = r01.f13823p;
        c50 c50Var = this.f12963i;
        long j9 = this.f12961g;
        r01Var.a(obj, c50Var, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f12962h, false, this.f12964j, 0L, j9, 0, 0, 0L);
        return r01Var;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final Object f(int i8) {
        uu1.a(i8, 0, 1);
        return f12958k;
    }
}
