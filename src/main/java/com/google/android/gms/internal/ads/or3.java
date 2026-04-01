package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class or3 extends jo3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ pr3 f12626b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    or3(pr3 pr3Var, Class cls) {
        super(cls);
        this.f12626b = pr3Var;
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* bridge */ /* synthetic */ k24 a(k24 k24Var) {
        nv3 nv3Var = (nv3) k24Var;
        jv3 jv3VarN = kv3.N();
        jv3VarN.w(0);
        jv3VarN.v(nv3Var.R());
        byte[] bArrB = wp3.b(nv3Var.M());
        jv3VarN.u(rz3.L(bArrB, 0, bArrB.length));
        return (kv3) jv3VarN.q();
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* synthetic */ k24 b(rz3 rz3Var) {
        return nv3.Q(rz3Var, m04.a());
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final Map c() {
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", js3.f9795a);
        rr3 rr3Var = new rr3(null);
        rr3Var.b(32);
        rr3Var.c(16);
        ur3 ur3Var = ur3.f15825e;
        rr3Var.d(ur3Var);
        tr3 tr3Var = tr3.f15258d;
        rr3Var.a(tr3Var);
        map.put("HMAC_SHA256_128BITTAG_RAW", rr3Var.e());
        rr3 rr3Var2 = new rr3(null);
        rr3Var2.b(32);
        rr3Var2.c(32);
        ur3 ur3Var2 = ur3.f15822b;
        rr3Var2.d(ur3Var2);
        rr3Var2.a(tr3Var);
        map.put("HMAC_SHA256_256BITTAG", rr3Var2.e());
        rr3 rr3Var3 = new rr3(null);
        rr3Var3.b(32);
        rr3Var3.c(32);
        rr3Var3.d(ur3Var);
        rr3Var3.a(tr3Var);
        map.put("HMAC_SHA256_256BITTAG_RAW", rr3Var3.e());
        rr3 rr3Var4 = new rr3(null);
        rr3Var4.b(64);
        rr3Var4.c(16);
        rr3Var4.d(ur3Var2);
        tr3 tr3Var2 = tr3.f15260f;
        rr3Var4.a(tr3Var2);
        map.put("HMAC_SHA512_128BITTAG", rr3Var4.e());
        rr3 rr3Var5 = new rr3(null);
        rr3Var5.b(64);
        rr3Var5.c(16);
        rr3Var5.d(ur3Var);
        rr3Var5.a(tr3Var2);
        map.put("HMAC_SHA512_128BITTAG_RAW", rr3Var5.e());
        rr3 rr3Var6 = new rr3(null);
        rr3Var6.b(64);
        rr3Var6.c(32);
        rr3Var6.d(ur3Var2);
        rr3Var6.a(tr3Var2);
        map.put("HMAC_SHA512_256BITTAG", rr3Var6.e());
        rr3 rr3Var7 = new rr3(null);
        rr3Var7.b(64);
        rr3Var7.c(32);
        rr3Var7.d(ur3Var);
        rr3Var7.a(tr3Var2);
        map.put("HMAC_SHA512_256BITTAG_RAW", rr3Var7.e());
        map.put("HMAC_SHA512_512BITTAG", js3.f9798d);
        rr3 rr3Var8 = new rr3(null);
        rr3Var8.b(64);
        rr3Var8.c(64);
        rr3Var8.d(ur3Var);
        rr3Var8.a(tr3Var2);
        map.put("HMAC_SHA512_512BITTAG_RAW", rr3Var8.e());
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* bridge */ /* synthetic */ void d(k24 k24Var) throws GeneralSecurityException {
        nv3 nv3Var = (nv3) k24Var;
        if (nv3Var.M() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        pr3.n(nv3Var.R());
    }
}
