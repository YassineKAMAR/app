package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
final class z03 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebView f17968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a13 f17969b;

    z03(a13 a13Var) {
        this.f17969b = a13Var;
        this.f17968a = a13Var.f4951d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17968a.destroy();
    }
}
