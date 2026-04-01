package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
final class qh4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ph4 f13491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f13493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f13494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f13495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f13496f;

    public qh4(AudioTrack audioTrack) {
        int i8 = nz2.f12300a;
        this.f13491a = new ph4(audioTrack);
        h(0);
    }

    private final void h(int i8) {
        this.f13492b = i8;
        long j8 = 10000;
        if (i8 == 0) {
            this.f13495e = 0L;
            this.f13496f = -1L;
            this.f13493c = System.nanoTime() / 1000;
        } else {
            if (i8 == 1) {
                this.f13494d = 10000L;
                return;
            }
            j8 = (i8 == 2 || i8 == 3) ? 10000000L : 500000L;
        }
        this.f13494d = j8;
    }

    @TargetApi(19)
    public final long a() {
        return this.f13491a.a();
    }

    @TargetApi(19)
    public final long b() {
        return this.f13491a.b();
    }

    public final void c() {
        if (this.f13492b == 4) {
            h(0);
        }
    }

    public final void d() {
        h(4);
    }

    public final void e() {
        h(0);
    }

    public final boolean f() {
        return this.f13492b == 2;
    }

    @TargetApi(19)
    public final boolean g(long j8) {
        if (j8 - this.f13495e < this.f13494d) {
            return false;
        }
        ph4 ph4Var = this.f13491a;
        this.f13495e = j8;
        boolean zC = ph4Var.c();
        int i8 = this.f13492b;
        if (i8 == 0) {
            if (!zC) {
                if (j8 - this.f13493c <= 500000) {
                    return false;
                }
                h(3);
                return false;
            }
            if (this.f13491a.b() < this.f13493c) {
                return false;
            }
            this.f13496f = this.f13491a.a();
            h(1);
            return true;
        }
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return zC;
                }
                if (!zC) {
                    return false;
                }
                h(0);
                return true;
            }
            if (!zC) {
                h(0);
                return false;
            }
        } else {
            if (!zC) {
                h(0);
                return false;
            }
            if (this.f13491a.a() > this.f13496f) {
                h(2);
                return true;
            }
        }
        return true;
    }
}
