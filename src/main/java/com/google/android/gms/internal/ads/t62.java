package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
final class t62 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f14976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ as2 f14977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ wr2 f14978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f14979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ fz2 f14980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ ks2 f14981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ v62 f14982g;

    t62(v62 v62Var, long j8, as2 as2Var, wr2 wr2Var, String str, fz2 fz2Var, ks2 ks2Var) {
        this.f14982g = v62Var;
        this.f14976a = j8;
        this.f14977b = as2Var;
        this.f14978c = wr2Var;
        this.f14979d = str;
        this.f14980e = fz2Var;
        this.f14981f = ks2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[PHI: r5
  0x0066: PHI (r5v1 int) = (r5v0 int), (r5v2 int), (r5v2 int), (r5v2 int) binds: [B:15:0x0035, B:20:0x0050, B:22:0x0054, B:24:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.vf3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Throwable r17) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t62.a(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void b(Object obj) {
        long jB = this.f14982g.f16020a.b() - this.f14976a;
        synchronized (this.f14982g) {
            v62 v62Var = this.f14982g;
            if (v62Var.f16024e) {
                v62Var.f16021b.a(this.f14977b, this.f14978c, 0, null, jB);
            }
            v62 v62Var2 = this.f14982g;
            if (v62Var2.f16026g) {
                return;
            }
            if (v62Var2.q(this.f14978c)) {
                ((u62) this.f14982g.f16023d.get(this.f14978c)).f15517d = jB;
            } else {
                LinkedHashMap linkedHashMap = this.f14982g.f16023d;
                wr2 wr2Var = this.f14978c;
                linkedHashMap.put(wr2Var, new u62(this.f14979d, wr2Var.f16880h0, 0, jB, null));
            }
            this.f14982g.f16025f.g(this.f14978c, jB, null);
        }
    }
}
