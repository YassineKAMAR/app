package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class kp1 implements cx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f10221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vn f10222b;

    kp1(vn vnVar, Map map) {
        this.f10221a = map;
        this.f10222b = vnVar;
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void C(vw2 vw2Var, String str) {
        if (this.f10221a.containsKey(vw2Var)) {
            this.f10222b.c(((jp1) this.f10221a.get(vw2Var)).f9742a);
        }
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void e(vw2 vw2Var, String str) {
        if (this.f10221a.containsKey(vw2Var)) {
            this.f10222b.c(((jp1) this.f10221a.get(vw2Var)).f9743b);
        }
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void h(vw2 vw2Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.cx2
    public final void o(vw2 vw2Var, String str, Throwable th) {
        if (this.f10221a.containsKey(vw2Var)) {
            this.f10222b.c(((jp1) this.f10221a.get(vw2Var)).f9744c);
        }
    }
}
