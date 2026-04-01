package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class sz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f14869a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14870b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f14871c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f14872d = new AtomicBoolean(false);

    public final synchronized float a() {
        return this.f14871c;
    }

    public final synchronized void b(boolean z7, float f8) {
        this.f14870b = z7;
        this.f14871c = f8;
    }

    public final synchronized void c(boolean z7) {
        this.f14869a = z7;
        this.f14872d.set(true);
    }

    public final synchronized boolean d() {
        return this.f14870b;
    }

    public final synchronized boolean e(boolean z7) {
        if (!this.f14872d.get()) {
            return z7;
        }
        return this.f14869a;
    }
}
