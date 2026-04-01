package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class wi0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f16746b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f16745a = TimeUnit.MILLISECONDS.toNanos(((Long) h2.y.c().b(ns.D)).longValue());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f16747c = true;

    wi0() {
    }

    public final void a(SurfaceTexture surfaceTexture, final hi0 hi0Var) {
        if (hi0Var == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f16747c) {
            long j8 = timestamp - this.f16746b;
            if (Math.abs(j8) < this.f16745a) {
                return;
            }
        }
        this.f16747c = false;
        this.f16746b = timestamp;
        j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.vi0
            @Override // java.lang.Runnable
            public final void run() {
                hi0Var.s();
            }
        });
    }

    public final void b() {
        this.f16747c = true;
    }
}
