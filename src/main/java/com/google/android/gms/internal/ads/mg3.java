package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
final class mg3 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Executor f11302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ le3 f11303b;

    mg3(Executor executor, le3 le3Var) {
        this.f11302a = executor;
        this.f11303b = le3Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f11302a.execute(runnable);
        } catch (RejectedExecutionException e8) {
            this.f11303b.g(e8);
        }
    }
}
