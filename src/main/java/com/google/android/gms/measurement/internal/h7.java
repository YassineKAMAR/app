package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class h7 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b7 f20061a;

    h7(b7 b7Var) {
        this.f20061a = b7Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f20061a.u().D(runnable);
    }
}
