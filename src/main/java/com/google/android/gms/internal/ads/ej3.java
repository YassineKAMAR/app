package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ej3 extends jo3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ fj3 f7379b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ej3(fj3 fj3Var, Class cls) {
        super(cls);
        this.f7379b = fj3Var;
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* bridge */ /* synthetic */ k24 a(k24 k24Var) {
        tt3 tt3Var = (tt3) k24Var;
        new uj3();
        xt3 xt3VarF = tj3.f(tt3Var.P());
        k24 k24VarA = new pr3().a().a(tt3Var.Q());
        pt3 pt3VarN = qt3.N();
        pt3VarN.u(xt3VarF);
        pt3VarN.v((kv3) k24VarA);
        pt3VarN.w(0);
        return (qt3) pt3VarN.q();
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* synthetic */ k24 b(rz3 rz3Var) {
        return tt3.O(rz3Var, m04.a());
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", vm3.f16370e);
        hj3 hj3Var = new hj3(null);
        hj3Var.a(16);
        hj3Var.c(32);
        hj3Var.e(16);
        hj3Var.d(16);
        ij3 ij3Var = ij3.f9249d;
        hj3Var.b(ij3Var);
        jj3 jj3Var = jj3.f9662d;
        hj3Var.f(jj3Var);
        map.put("AES128_CTR_HMAC_SHA256_RAW", hj3Var.g());
        map.put("AES256_CTR_HMAC_SHA256", vm3.f16371f);
        hj3 hj3Var2 = new hj3(null);
        hj3Var2.a(32);
        hj3Var2.c(32);
        hj3Var2.e(32);
        hj3Var2.d(16);
        hj3Var2.b(ij3Var);
        hj3Var2.f(jj3Var);
        map.put("AES256_CTR_HMAC_SHA256_RAW", hj3Var2.g());
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* bridge */ /* synthetic */ void d(k24 k24Var) throws GeneralSecurityException {
        tt3 tt3Var = (tt3) k24Var;
        ((tj3) new uj3().a()).d(tt3Var.P());
        new pr3().a().d(tt3Var.Q());
        uy3.a(tt3Var.P().M());
    }
}
