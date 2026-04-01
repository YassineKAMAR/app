package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class tm4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15165e;

    public tm4(Object obj, int i8, int i9, long j8) {
        this(obj, i8, i9, j8, -1);
    }

    private tm4(Object obj, int i8, int i9, long j8, int i10) {
        this.f15161a = obj;
        this.f15162b = i8;
        this.f15163c = i9;
        this.f15164d = j8;
        this.f15165e = i10;
    }

    public tm4(Object obj, long j8) {
        this(obj, -1, -1, j8, -1);
    }

    public tm4(Object obj, long j8, int i8) {
        this(obj, -1, -1, j8, i8);
    }

    public final tm4 a(Object obj) {
        return this.f15161a.equals(obj) ? this : new tm4(obj, this.f15162b, this.f15163c, this.f15164d, this.f15165e);
    }

    public final boolean b() {
        return this.f15162b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm4)) {
            return false;
        }
        tm4 tm4Var = (tm4) obj;
        return this.f15161a.equals(tm4Var.f15161a) && this.f15162b == tm4Var.f15162b && this.f15163c == tm4Var.f15163c && this.f15164d == tm4Var.f15164d && this.f15165e == tm4Var.f15165e;
    }

    public final int hashCode() {
        return ((((((((this.f15161a.hashCode() + 527) * 31) + this.f15162b) * 31) + this.f15163c) * 31) + ((int) this.f15164d)) * 31) + this.f15165e;
    }
}
