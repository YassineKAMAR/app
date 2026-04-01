package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class sk3 extends jo3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ tk3 f14743b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    sk3(tk3 tk3Var, Class cls) {
        super(cls);
        this.f14743b = tk3Var;
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* bridge */ /* synthetic */ k24 a(k24 k24Var) {
        ou3 ou3VarN = pu3.N();
        byte[] bArrB = wp3.b(((su3) k24Var).M());
        ou3VarN.u(rz3.L(bArrB, 0, bArrB.length));
        ou3VarN.v(0);
        return (pu3) ou3VarN.q();
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* synthetic */ k24 b(rz3 rz3Var) {
        return su3.P(rz3Var, m04.a());
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final Map c() throws InvalidAlgorithmParameterException {
        HashMap map = new HashMap();
        map.put("AES128_GCM", vm3.f16366a);
        vk3 vk3Var = new vk3(null);
        vk3Var.a(12);
        vk3Var.b(16);
        vk3Var.c(16);
        wk3 wk3Var = wk3.f16783d;
        vk3Var.d(wk3Var);
        map.put("AES128_GCM_RAW", vk3Var.e());
        map.put("AES256_GCM", vm3.f16367b);
        vk3 vk3Var2 = new vk3(null);
        vk3Var2.a(12);
        vk3Var2.b(32);
        vk3Var2.c(16);
        vk3Var2.d(wk3Var);
        map.put("AES256_GCM_RAW", vk3Var2.e());
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* synthetic */ void d(k24 k24Var) throws InvalidAlgorithmParameterException {
        uy3.a(((su3) k24Var).M());
    }
}
