package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class yg implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zg f17759a;

    yg(zg zgVar) {
        this.f17759a = zgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f17759a.f18214n) {
            if (this.f17759a.f18215o) {
                return;
            }
            this.f17759a.f18215o = true;
            try {
                zg.n(this.f17759a);
            } catch (Exception e8) {
                this.f17759a.f18206f.c(2023, -1L, e8);
            }
            synchronized (this.f17759a.f18214n) {
                this.f17759a.f18215o = false;
            }
        }
    }
}
