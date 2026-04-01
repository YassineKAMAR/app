package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class yf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f17754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jb3 f17755b;

    /* synthetic */ yf3(boolean z7, jb3 jb3Var, xf3 xf3Var) {
        this.f17754a = z7;
        this.f17755b = jb3Var;
    }

    public final x3.d a(Callable callable, Executor executor) {
        return new mf3(this.f17755b, this.f17754a, executor, callable);
    }
}
