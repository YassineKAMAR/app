package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class kp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f10223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f10224b;

    /* synthetic */ kp3(Class cls, Class cls2, jp3 jp3Var) {
        this.f10223a = cls;
        this.f10224b = cls2;
    }

    public static kp3 b(ip3 ip3Var, Class cls, Class cls2) {
        return new hp3(cls, cls2, ip3Var);
    }

    public abstract Object a(nh3 nh3Var);

    public final Class c() {
        return this.f10223a;
    }

    public final Class d() {
        return this.f10224b;
    }
}
