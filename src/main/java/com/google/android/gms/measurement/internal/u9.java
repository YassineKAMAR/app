package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes.dex */
final class u9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ComponentName f20534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ s9 f20535b;

    u9(s9 s9Var, ComponentName componentName) {
        this.f20535b = s9Var;
        this.f20534a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v8.K(this.f20535b.f20489c, this.f20534a);
    }
}
