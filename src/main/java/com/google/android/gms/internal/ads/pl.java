package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class pl implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f12931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ tl f12932b;

    pl(tl tlVar, View view) {
        this.f12932b = tlVar;
        this.f12931a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12932b.c(this.f12931a);
    }
}
