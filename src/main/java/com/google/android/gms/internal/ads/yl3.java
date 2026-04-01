package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class yl3 extends jo3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ zl3 f17809b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    yl3(zl3 zl3Var, Class cls) {
        super(cls);
        this.f17809b = zl3Var;
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* bridge */ /* synthetic */ k24 a(k24 k24Var) {
        bv3 bv3VarN = cv3.N();
        bv3VarN.v(0);
        byte[] bArrB = wp3.b(32);
        bv3VarN.u(rz3.L(bArrB, 0, bArrB.length));
        return (cv3) bv3VarN.q();
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* synthetic */ k24 b(rz3 rz3Var) {
        return fv3.O(rz3Var, m04.a());
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final Map c() {
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", bm3.b(am3.f5332b));
        map.put("CHACHA20_POLY1305_RAW", bm3.b(am3.f5334d));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* bridge */ /* synthetic */ void d(k24 k24Var) {
    }
}
