package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ao4 implements sm4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final on3 f5364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zn4 f5366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cr4 f5367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij4 f5368e;

    public ao4(on3 on3Var, zn4 zn4Var) {
        ij4 ij4Var = new ij4();
        cr4 cr4Var = new cr4();
        this.f5364a = on3Var;
        this.f5366c = zn4Var;
        this.f5368e = ij4Var;
        this.f5367d = cr4Var;
        this.f5365b = 1048576;
    }

    public final ao4 a(int i8) {
        this.f5365b = i8;
        return this;
    }

    public final co4 b(c50 c50Var) {
        c50Var.f6163b.getClass();
        return new co4(c50Var, this.f5364a, this.f5366c, sj4.f14718a, this.f5367d, this.f5365b, null);
    }
}
