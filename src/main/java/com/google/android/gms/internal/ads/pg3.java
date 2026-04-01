package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class pg3 extends ie3 implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f12867h;

    public pg3(Runnable runnable) {
        runnable.getClass();
        this.f12867h = runnable;
    }

    @Override // com.google.android.gms.internal.ads.le3
    protected final String d() {
        return "task=[" + this.f12867h.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f12867h.run();
        } catch (Error | RuntimeException e8) {
            g(e8);
            throw e8;
        }
    }
}
