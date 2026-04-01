package com.google.android.gms.measurement.internal;

import java.lang.Thread;

/* JADX INFO: loaded from: classes.dex */
final class s5 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ q5 f20477b;

    public s5(q5 q5Var, String str) {
        this.f20477b = q5Var;
        a3.o.j(str);
        this.f20476a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f20477b.t().G().b(this.f20476a, th);
    }
}
