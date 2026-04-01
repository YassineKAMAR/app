package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ym3 extends jo3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ zm3 f17856b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ym3(zm3 zm3Var, Class cls) {
        super(cls);
        this.f17856b = zm3Var;
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* bridge */ /* synthetic */ k24 a(k24 k24Var) {
        ix3 ix3VarN = jx3.N();
        ix3VarN.v(0);
        byte[] bArrB = wp3.b(32);
        ix3VarN.u(rz3.L(bArrB, 0, bArrB.length));
        return (jx3) ix3VarN.q();
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* synthetic */ k24 b(rz3 rz3Var) {
        return mx3.O(rz3Var, m04.a());
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final Map c() {
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", bn3.b(an3.f5348b));
        map.put("XCHACHA20_POLY1305_RAW", bn3.b(an3.f5350d));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* bridge */ /* synthetic */ void d(k24 k24Var) {
    }
}
