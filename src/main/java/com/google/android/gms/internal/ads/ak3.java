package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ak3 extends jo3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bk3 f5304b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak3(bk3 bk3Var, Class cls) {
        super(cls);
        this.f5304b = bk3Var;
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* bridge */ /* synthetic */ k24 a(k24 k24Var) {
        ju3 ju3Var = (ju3) k24Var;
        fu3 fu3VarN = gu3.N();
        byte[] bArrB = wp3.b(ju3Var.M());
        fu3VarN.u(rz3.L(bArrB, 0, bArrB.length));
        fu3VarN.v(ju3Var.Q());
        fu3VarN.w(0);
        return (gu3) fu3VarN.q();
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* synthetic */ k24 b(rz3 rz3Var) {
        return ju3.P(rz3Var, m04.a());
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_EAX", vm3.f16368c);
        dk3 dk3Var = new dk3(null);
        dk3Var.a(16);
        dk3Var.b(16);
        dk3Var.c(16);
        ek3 ek3Var = ek3.f7389d;
        dk3Var.d(ek3Var);
        map.put("AES128_EAX_RAW", dk3Var.e());
        map.put("AES256_EAX", vm3.f16369d);
        dk3 dk3Var2 = new dk3(null);
        dk3Var2.a(16);
        dk3Var2.b(32);
        dk3Var2.c(16);
        dk3Var2.d(ek3Var);
        map.put("AES256_EAX_RAW", dk3Var2.e());
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* bridge */ /* synthetic */ void d(k24 k24Var) throws GeneralSecurityException {
        ju3 ju3Var = (ju3) k24Var;
        uy3.a(ju3Var.M());
        if (ju3Var.Q().M() != 12 && ju3Var.Q().M() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
