package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class m02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f11103a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11104b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f11105c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f11106d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f11107e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f11108f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f11109g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f11110h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f11111i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f11112j = new Object();

    public final int a() {
        int i8;
        synchronized (this.f11109g) {
            i8 = this.f11104b;
        }
        return i8;
    }

    public final synchronized long b() {
        long j8;
        synchronized (this.f11112j) {
            j8 = this.f11107e;
        }
        return j8;
    }

    public final synchronized long c() {
        long j8;
        synchronized (this.f11111i) {
            j8 = this.f11106d;
        }
        return j8;
    }

    public final synchronized long d() {
        long j8;
        synchronized (this.f11108f) {
            j8 = this.f11103a;
        }
        return j8;
    }

    public final long e() {
        long j8;
        synchronized (this.f11110h) {
            j8 = this.f11105c;
        }
        return j8;
    }

    public final synchronized void f(long j8) {
        synchronized (this.f11112j) {
            this.f11107e = j8;
        }
    }

    public final synchronized void g(long j8) {
        synchronized (this.f11111i) {
            this.f11106d = j8;
        }
    }

    public final synchronized void h(long j8) {
        synchronized (this.f11108f) {
            this.f11103a = j8;
        }
    }

    public final void i(int i8) {
        synchronized (this.f11109g) {
            this.f11104b = i8;
        }
    }

    public final void j(long j8) {
        synchronized (this.f11110h) {
            this.f11105c = j8;
        }
    }
}
