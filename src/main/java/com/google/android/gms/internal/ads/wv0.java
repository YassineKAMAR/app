package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class wv0 implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zv0 f16954a;

    wv0(zv0 zv0Var) {
        this.f16954a = zv0Var;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void a(Object obj, Map map) {
        if (zv0.g(this.f16954a, map)) {
            this.f16954a.f18496c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.vv0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16481a.f16954a.f18497d.a();
                }
            });
        }
    }
}
