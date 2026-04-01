package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class o13 implements Runnable {
    o13() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (s13.f14464k != null) {
            s13.f14464k.post(s13.f14465l);
            s13.f14464k.postDelayed(s13.f14466m, 200L);
        }
    }
}
