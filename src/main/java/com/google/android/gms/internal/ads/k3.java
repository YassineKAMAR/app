package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class k3 extends f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ q1 f9912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ l3 f9913c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k3(l3 l3Var, q1 q1Var, q1 q1Var2) {
        super(q1Var);
        this.f9913c = l3Var;
        this.f9912b = q1Var2;
    }

    @Override // com.google.android.gms.internal.ads.f1, com.google.android.gms.internal.ads.q1
    public final o1 p(long j8) {
        o1 o1VarP = this.f9912b.p(j8);
        r1 r1Var = o1VarP.f12324a;
        r1 r1Var2 = new r1(r1Var.f13856a, r1Var.f13857b + this.f9913c.f10440a);
        r1 r1Var3 = o1VarP.f12325b;
        return new o1(r1Var2, new r1(r1Var3.f13856a, r1Var3.f13857b + this.f9913c.f10440a));
    }
}
