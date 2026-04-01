package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class od4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nd4 f12453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final md4 f12454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vv1 f12455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s11 f12456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f12458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Looper f12459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f12460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f12461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f12462j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f12463k;

    public od4(md4 md4Var, nd4 nd4Var, s11 s11Var, int i8, vv1 vv1Var, Looper looper) {
        this.f12454b = md4Var;
        this.f12453a = nd4Var;
        this.f12456d = s11Var;
        this.f12459g = looper;
        this.f12455c = vv1Var;
        this.f12460h = i8;
    }

    public final int a() {
        return this.f12457e;
    }

    public final Looper b() {
        return this.f12459g;
    }

    public final nd4 c() {
        return this.f12453a;
    }

    public final od4 d() {
        uu1.f(!this.f12461i);
        this.f12461i = true;
        this.f12454b.a(this);
        return this;
    }

    public final od4 e(Object obj) {
        uu1.f(!this.f12461i);
        this.f12458f = obj;
        return this;
    }

    public final od4 f(int i8) {
        uu1.f(!this.f12461i);
        this.f12457e = i8;
        return this;
    }

    public final Object g() {
        return this.f12458f;
    }

    public final synchronized void h(boolean z7) {
        this.f12462j = z7 | this.f12462j;
        this.f12463k = true;
        notifyAll();
    }

    public final synchronized boolean i(long j8) {
        uu1.f(this.f12461i);
        uu1.f(this.f12459g.getThread() != Thread.currentThread());
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j8;
        while (!this.f12463k) {
            if (j8 <= 0) {
                throw new TimeoutException("Message delivery timed out.");
            }
            wait(j8);
            j8 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        return this.f12462j;
    }

    public final synchronized boolean j() {
        return false;
    }
}
