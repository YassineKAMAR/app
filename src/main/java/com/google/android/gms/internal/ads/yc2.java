package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class yc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f17730a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private xc2 f17731b;

    final xc2 a() {
        return this.f17731b;
    }

    final void b(xc2 xc2Var) {
        this.f17731b = xc2Var;
    }

    public final void c(boolean z7) {
        this.f17730a.set(true);
    }

    public final boolean d() {
        return this.f17730a.get();
    }
}
