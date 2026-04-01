package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class nm4 extends s11 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c50 f11922f;

    public nm4(c50 c50Var) {
        this.f11922f = c50Var;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final int a(Object obj) {
        return obj == mm4.f11413i ? 0 : -1;
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
        py0Var.l(z7 ? 0 : null, z7 ? mm4.f11413i : null, 0, -9223372036854775807L, 0L, x61.f17055e, true);
        return py0Var;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final r01 e(int i8, r01 r01Var, long j8) {
        r01Var.a(r01.f13823p, this.f11922f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        r01Var.f13844k = true;
        return r01Var;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final Object f(int i8) {
        return mm4.f11413i;
    }
}
