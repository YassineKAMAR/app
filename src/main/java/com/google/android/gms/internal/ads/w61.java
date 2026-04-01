package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
final class w61 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f16647a;

    @Override // java.lang.Runnable
    public final void run() {
        z61 z61Var = (z61) this.f16647a.get();
        if (z61Var != null) {
            z61Var.z0(new z91() { // from class: com.google.android.gms.internal.ads.u61
                @Override // com.google.android.gms.internal.ads.z91
                public final void a(Object obj) {
                    ((a71) obj).j();
                }
            });
        }
    }
}
