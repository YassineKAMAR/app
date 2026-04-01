package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class jl3 extends jo3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ kl3 f9702b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    jl3(kl3 kl3Var, Class cls) {
        super(cls);
        this.f9702b = kl3Var;
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* bridge */ /* synthetic */ k24 a(k24 k24Var) {
        uu3 uu3VarN = wu3.N();
        byte[] bArrB = wp3.b(((zu3) k24Var).M());
        uu3VarN.u(rz3.L(bArrB, 0, bArrB.length));
        uu3VarN.v(0);
        return (wu3) uu3VarN.q();
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* synthetic */ k24 b(rz3 rz3Var) {
        return zu3.P(rz3Var, m04.a());
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final Map c() throws InvalidAlgorithmParameterException {
        HashMap map = new HashMap();
        nl3 nl3Var = new nl3(null);
        nl3Var.a(16);
        ol3 ol3Var = ol3.f12537b;
        nl3Var.b(ol3Var);
        map.put("AES128_GCM_SIV", nl3Var.c());
        nl3 nl3Var2 = new nl3(null);
        nl3Var2.a(16);
        ol3 ol3Var2 = ol3.f12539d;
        nl3Var2.b(ol3Var2);
        map.put("AES128_GCM_SIV_RAW", nl3Var2.c());
        nl3 nl3Var3 = new nl3(null);
        nl3Var3.a(32);
        nl3Var3.b(ol3Var);
        map.put("AES256_GCM_SIV", nl3Var3.c());
        nl3 nl3Var4 = new nl3(null);
        nl3Var4.a(32);
        nl3Var4.b(ol3Var2);
        map.put("AES256_GCM_SIV_RAW", nl3Var4.c());
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* synthetic */ void d(k24 k24Var) throws InvalidAlgorithmParameterException {
        uy3.a(((zu3) k24Var).M());
    }
}
