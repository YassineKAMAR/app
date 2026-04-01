package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class pi0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f12897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ qi0 f12898b;

    pi0(qi0 qi0Var, boolean z7) {
        this.f12898b = qi0Var;
        this.f12897a = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12898b.t("windowVisibilityChanged", "isVisible", String.valueOf(this.f12897a));
    }
}
