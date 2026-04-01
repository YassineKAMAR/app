package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* JADX INFO: loaded from: classes.dex */
final class n90 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Thread.UncaughtExceptionHandler f11740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ o90 f11741b;

    n90(o90 o90Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f11741b = o90Var;
        this.f11740a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f11741b.g(thread, th);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f11740a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            } catch (Throwable unused) {
                qg0.d("AdMob exception reporter failed reporting the exception.");
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f11740a;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                }
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f11740a;
            if (uncaughtExceptionHandler3 != null) {
                uncaughtExceptionHandler3.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
