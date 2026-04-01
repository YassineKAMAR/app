package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class eo3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wy3 f7451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f7452b;

    /* synthetic */ eo3(wy3 wy3Var, Class cls, do3 do3Var) {
        this.f7451a = wy3Var;
        this.f7452b = cls;
    }

    public static eo3 b(co3 co3Var, wy3 wy3Var, Class cls) {
        return new bo3(wy3Var, cls, co3Var);
    }

    public abstract nh3 a(yp3 yp3Var, ri3 ri3Var);

    public final wy3 c() {
        return this.f7451a;
    }

    public final Class d() {
        return this.f7452b;
    }
}
