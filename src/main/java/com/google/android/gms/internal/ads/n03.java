package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
final class n03 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebView f11588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f11589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ p03 f11590c;

    n03(p03 p03Var, WebView webView, String str) {
        this.f11590c = p03Var;
        this.f11588a = webView;
        this.f11589b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p03.i(this.f11588a, this.f11589b);
    }
}
