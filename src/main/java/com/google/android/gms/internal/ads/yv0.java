package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class yv0 implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zv0 f17930a;

    yv0(zv0 zv0Var) {
        this.f17930a = zv0Var;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void a(Object obj, Map map) {
        if (zv0.g(this.f17930a, map)) {
            this.f17930a.f18496c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.xv0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17477a.f17930a.f18497d.j();
                }
            });
        }
    }
}
