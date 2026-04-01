package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class jc4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ld4 f9566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9571g;

    public jc4(ld4 ld4Var) {
        this.f9566b = ld4Var;
    }

    public final void a(int i8) {
        this.f9565a = 1 == ((this.f9565a ? 1 : 0) | i8);
        this.f9567c += i8;
    }

    public final void b(int i8) {
        this.f9565a = true;
        this.f9570f = true;
        this.f9571g = i8;
    }

    public final void c(ld4 ld4Var) {
        this.f9565a |= this.f9566b != ld4Var;
        this.f9566b = ld4Var;
    }

    public final void d(int i8) {
        if (this.f9568d && this.f9569e != 5) {
            uu1.d(i8 == 5);
            return;
        }
        this.f9565a = true;
        this.f9568d = true;
        this.f9569e = i8;
    }
}
