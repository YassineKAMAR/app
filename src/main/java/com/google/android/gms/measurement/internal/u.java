package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
abstract class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile Handler f20517d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w6 f20518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f20519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f20520c;

    u(w6 w6Var) {
        a3.o.j(w6Var);
        this.f20518a = w6Var;
        this.f20519b = new t(this, w6Var);
    }

    private final Handler f() {
        Handler handler;
        if (f20517d != null) {
            return f20517d;
        }
        synchronized (u.class) {
            if (f20517d == null) {
                f20517d = new com.google.android.gms.internal.measurement.r1(this.f20518a.j().getMainLooper());
            }
            handler = f20517d;
        }
        return handler;
    }

    final void a() {
        this.f20520c = 0L;
        f().removeCallbacks(this.f20519b);
    }

    public final void b(long j8) {
        a();
        if (j8 >= 0) {
            this.f20520c = this.f20518a.k().a();
            if (f().postDelayed(this.f20519b, j8)) {
                return;
            }
            this.f20518a.t().G().b("Failed to schedule delayed post. time", Long.valueOf(j8));
        }
    }

    public abstract void d();

    public final boolean e() {
        return this.f20520c != 0;
    }
}
