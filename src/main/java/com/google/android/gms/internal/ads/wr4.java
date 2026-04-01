package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class wr4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f16918c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16920e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private vr4 f16916a = new vr4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private vr4 f16917b = new vr4();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f16919d = -9223372036854775807L;

    public final float a() {
        if (this.f16916a.f()) {
            return (float) (1.0E9d / this.f16916a.a());
        }
        return -1.0f;
    }

    public final int b() {
        return this.f16920e;
    }

    public final long c() {
        if (this.f16916a.f()) {
            return this.f16916a.a();
        }
        return -9223372036854775807L;
    }

    public final long d() {
        if (this.f16916a.f()) {
            return this.f16916a.b();
        }
        return -9223372036854775807L;
    }

    public final void e(long j8) {
        this.f16916a.c(j8);
        if (this.f16916a.f()) {
            this.f16918c = false;
        } else if (this.f16919d != -9223372036854775807L) {
            if (!this.f16918c || this.f16917b.e()) {
                this.f16917b.d();
                this.f16917b.c(this.f16919d);
            }
            this.f16918c = true;
            this.f16917b.c(j8);
        }
        if (this.f16918c && this.f16917b.f()) {
            vr4 vr4Var = this.f16916a;
            this.f16916a = this.f16917b;
            this.f16917b = vr4Var;
            this.f16918c = false;
        }
        this.f16919d = j8;
        this.f16920e = this.f16916a.f() ? 0 : this.f16920e + 1;
    }

    public final void f() {
        this.f16916a.d();
        this.f16917b.d();
        this.f16918c = false;
        this.f16919d = -9223372036854775807L;
        this.f16920e = 0;
    }

    public final boolean g() {
        return this.f16916a.f();
    }
}
