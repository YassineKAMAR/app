package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class oi0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ qi0 f12494a;

    oi0(qi0 qi0Var) {
        this.f12494a = qi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12494a.t("surfaceDestroyed", new String[0]);
    }
}
