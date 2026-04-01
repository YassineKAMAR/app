package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class jm0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ nd0 f9705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ mm0 f9706b;

    jm0(mm0 mm0Var, nd0 nd0Var) {
        this.f9706b = mm0Var;
        this.f9705a = nd0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f9706b.o(view, this.f9705a, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
