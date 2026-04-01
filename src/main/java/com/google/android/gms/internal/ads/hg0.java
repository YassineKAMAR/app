package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class hg0 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f8742a;

    hg0(jg0 jg0Var, String str) {
        this.f8742a = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new vg0(null).a(this.f8742a);
    }
}
