package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class fz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z61 f8122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i91 f8123b;

    public fz0(z61 z61Var, i91 i91Var) {
        this.f8122a = z61Var;
        this.f8123b = i91Var;
    }

    public final z61 a() {
        return this.f8122a;
    }

    final i91 b() {
        return this.f8123b;
    }

    final yb1 c() {
        i91 i91Var = this.f8123b;
        return i91Var != null ? new yb1(i91Var, eh0.f7327f) : new yb1(new ez0(this), eh0.f7327f);
    }
}
