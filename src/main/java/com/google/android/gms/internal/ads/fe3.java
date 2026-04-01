package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class fe3<V> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final le3<V> f7735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final x3.d<? extends V> f7736b;

    fe3(le3 le3Var, x3.d dVar) {
        this.f7735a = le3Var;
        this.f7736b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((le3) this.f7735a).f10655a != this) {
            return;
        }
        x3.d<? extends V> dVar = this.f7736b;
        if (le3.f10653f.f(this.f7735a, this, le3.h(dVar))) {
            le3.z(this.f7735a, false);
        }
    }
}
