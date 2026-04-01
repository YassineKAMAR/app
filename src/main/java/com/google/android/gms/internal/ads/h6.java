package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f8639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final dq2 f8641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final dq2 f8642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8644i;

    public h6(dq2 dq2Var, dq2 dq2Var2, boolean z7) throws yh0 {
        this.f8642g = dq2Var;
        this.f8641f = dq2Var2;
        this.f8640e = z7;
        dq2Var2.g(12);
        this.f8636a = dq2Var2.x();
        dq2Var.g(12);
        this.f8644i = dq2Var.x();
        t0.b(dq2Var.o() == 1, "first_chunk must be 1");
        this.f8637b = -1;
    }

    public final boolean a() {
        int i8 = this.f8637b + 1;
        this.f8637b = i8;
        if (i8 == this.f8636a) {
            return false;
        }
        this.f8639d = this.f8640e ? this.f8641f.D() : this.f8641f.C();
        if (this.f8637b == this.f8643h) {
            this.f8638c = this.f8642g.x();
            this.f8642g.h(4);
            int i9 = this.f8644i - 1;
            this.f8644i = i9;
            this.f8643h = i9 > 0 ? (-1) + this.f8642g.x() : -1;
        }
        return true;
    }
}
