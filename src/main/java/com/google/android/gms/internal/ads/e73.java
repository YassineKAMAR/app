package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class e73 extends a73 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ k73 f7168b;

    e73(k73 k73Var) {
        this.f7168b = k73Var;
    }

    @Override // com.google.android.gms.internal.ads.a73
    public final void a() {
        synchronized (this.f7168b.f9971f) {
            if (this.f7168b.f9976k.get() > 0 && this.f7168b.f9976k.decrementAndGet() > 0) {
                this.f7168b.f9967b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            k73 k73Var = this.f7168b;
            if (k73Var.f9978m != null) {
                k73Var.f9967b.c("Unbind from service.", new Object[0]);
                k73 k73Var2 = this.f7168b;
                k73Var2.f9966a.unbindService(k73Var2.f9977l);
                this.f7168b.f9972g = false;
                this.f7168b.f9978m = null;
                this.f7168b.f9977l = null;
            }
            this.f7168b.w();
        }
    }
}
