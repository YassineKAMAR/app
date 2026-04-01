package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fl1 implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zw f7802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ul1 f7803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c84 f7804c;

    public fl1(bh1 bh1Var, qg1 qg1Var, ul1 ul1Var, c84 c84Var) {
        this.f7802a = bh1Var.c(qg1Var.a());
        this.f7803b = ul1Var;
        this.f7804c = c84Var;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void a(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.f7802a.G2((pw) this.f7804c.k(), str);
        } catch (RemoteException e8) {
            qg0.h("Failed to call onCustomClick for asset " + str + ".", e8);
        }
    }

    public final void b() {
        if (this.f7802a == null) {
            return;
        }
        this.f7803b.i("/nativeAdCustomClick", this);
    }
}
