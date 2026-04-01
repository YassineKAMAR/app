package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class de3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final de3 f6702d = new de3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Runnable f6703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Executor f6704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    de3 f6705c;

    de3() {
        this.f6703a = null;
        this.f6704b = null;
    }

    de3(Runnable runnable, Executor executor) {
        this.f6703a = runnable;
        this.f6704b = executor;
    }
}
