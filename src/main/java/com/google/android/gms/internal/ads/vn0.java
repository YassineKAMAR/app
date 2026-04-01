package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class vn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16379c;

    private vn0(int i8, int i9, int i10) {
        this.f16377a = i8;
        this.f16379c = i9;
        this.f16378b = i10;
    }

    public static vn0 a() {
        return new vn0(0, 0, 0);
    }

    public static vn0 b(int i8, int i9) {
        return new vn0(1, i8, i9);
    }

    public static vn0 c(h2.w4 w4Var) {
        return w4Var.f22354d ? new vn0(3, 0, 0) : w4Var.f22359i ? new vn0(2, 0, 0) : w4Var.f22358h ? a() : b(w4Var.f22356f, w4Var.f22353c);
    }

    public static vn0 d() {
        return new vn0(5, 0, 0);
    }

    public static vn0 e() {
        return new vn0(4, 0, 0);
    }

    public final boolean f() {
        return this.f16377a == 0;
    }

    public final boolean g() {
        return this.f16377a == 2;
    }

    public final boolean h() {
        return this.f16377a == 5;
    }

    public final boolean i() {
        return this.f16377a == 3;
    }

    public final boolean j() {
        return this.f16377a == 4;
    }
}
