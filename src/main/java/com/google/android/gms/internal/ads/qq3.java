package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class qq3 extends jo3 {
    qq3(sq3 sq3Var, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* bridge */ /* synthetic */ k24 a(k24 k24Var) {
        kt3 kt3Var = (kt3) k24Var;
        gt3 gt3VarN = ht3.N();
        gt3VarN.w(0);
        byte[] bArrB = wp3.b(kt3Var.M());
        gt3VarN.u(rz3.L(bArrB, 0, bArrB.length));
        gt3VarN.v(kt3Var.Q());
        return (ht3) gt3VarN.q();
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* synthetic */ k24 b(rz3 rz3Var) {
        return kt3.P(rz3Var, m04.a());
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        xq3 xq3Var = js3.f9799e;
        map.put("AES_CMAC", xq3Var);
        map.put("AES256_CMAC", xq3Var);
        uq3 uq3Var = new uq3(null);
        uq3Var.a(32);
        uq3Var.b(16);
        uq3Var.c(vq3.f16422e);
        map.put("AES256_CMAC_RAW", uq3Var.d());
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* bridge */ /* synthetic */ void d(k24 k24Var) throws GeneralSecurityException {
        kt3 kt3Var = (kt3) k24Var;
        sq3.n(kt3Var.Q());
        sq3.o(kt3Var.M());
    }
}
