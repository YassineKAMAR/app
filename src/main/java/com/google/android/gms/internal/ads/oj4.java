package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class oj4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f12509d;

    public oj4() {
        this.f12506a = -1;
        this.f12507b = -1;
        this.f12508c = -1;
    }

    /* synthetic */ oj4(sk4 sk4Var, li4 li4Var) {
        this.f12506a = sk4Var.f14751a;
        this.f12507b = sk4Var.f14752b;
        this.f12508c = sk4Var.f14753c;
        this.f12509d = sk4Var.f14754d;
    }

    public final oj4 a(int i8) {
        this.f12507b = 1;
        return this;
    }

    public final oj4 b(int i8) {
        this.f12506a = 1;
        return this;
    }

    public final oj4 c(int i8) {
        this.f12508c = i8;
        return this;
    }

    public final sk4 d() {
        return new sk4(this.f12506a, this.f12507b, this.f12508c, this.f12509d);
    }
}
