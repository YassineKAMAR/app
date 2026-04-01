package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class tj3 extends jo3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ uj3 f15133b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    tj3(uj3 uj3Var, Class cls) {
        super(cls);
        this.f15133b = uj3Var;
    }

    public static final xt3 f(au3 au3Var) {
        wt3 wt3VarN = xt3.N();
        wt3VarN.v(au3Var.R());
        byte[] bArrB = wp3.b(au3Var.M());
        wt3VarN.u(rz3.L(bArrB, 0, bArrB.length));
        wt3VarN.w(0);
        return (xt3) wt3VarN.q();
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* bridge */ /* synthetic */ k24 a(k24 k24Var) {
        return f((au3) k24Var);
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* synthetic */ k24 b(rz3 rz3Var) {
        return au3.Q(rz3Var, m04.a());
    }

    @Override // com.google.android.gms.internal.ads.jo3
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void d(au3 au3Var) throws GeneralSecurityException {
        uy3.a(au3Var.M());
        uj3 uj3Var = this.f15133b;
        uj3.m(au3Var.R());
    }
}
