package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public class j94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9529a;

    public final void a(int i8) {
        this.f9529a = i8 | this.f9529a;
    }

    public void b() {
        this.f9529a = 0;
    }

    public final void c(int i8) {
        this.f9529a = i8;
    }

    protected final boolean d(int i8) {
        return (this.f9529a & i8) == i8;
    }

    public final boolean e() {
        return d(268435456);
    }

    public final boolean f() {
        return d(4);
    }

    public final boolean g() {
        return d(1);
    }

    public final boolean h() {
        return d(536870912);
    }
}
