package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class h2 implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ k2 f8602b;

    public h2(k2 k2Var, long j8) {
        this.f8602b = k2Var;
        this.f8601a = j8;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final long j() {
        return this.f8601a;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final boolean o() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final o1 p(long j8) {
        o1 o1VarA = this.f8602b.f9896g[0].a(j8);
        int i8 = 1;
        while (true) {
            k2 k2Var = this.f8602b;
            if (i8 >= k2Var.f9896g.length) {
                return o1VarA;
            }
            o1 o1VarA2 = k2Var.f9896g[i8].a(j8);
            if (o1VarA2.f12324a.f13857b < o1VarA.f12324a.f13857b) {
                o1VarA = o1VarA2;
            }
            i8++;
        }
    }
}
