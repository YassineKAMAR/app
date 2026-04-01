package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class he2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final po2 f8735a;

    he2(po2 po2Var) {
        this.f8735a = po2Var;
    }

    final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("key_schema", this.f8735a.a());
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        po2 po2Var = this.f8735a;
        ni2 ni2Var = null;
        if (po2Var != null && po2Var.a() != null && !po2Var.a().isEmpty()) {
            ni2Var = new ni2() { // from class: com.google.android.gms.internal.ads.ge2
                @Override // com.google.android.gms.internal.ads.ni2
                public final void a(Object obj) {
                    this.f8305a.a((Bundle) obj);
                }
            };
        }
        return zf3.h(ni2Var);
    }
}
