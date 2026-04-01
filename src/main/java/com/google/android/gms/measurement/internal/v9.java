package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class v9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ s9 f20570a;

    v9(s9 s9Var) {
        this.f20570a = s9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20570a.f20489c.f20564d = null;
        this.f20570a.f20489c.f0();
    }
}
