package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class gp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f8448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f8449b;

    /* synthetic */ gp3(Class cls, Class cls2, fp3 fp3Var) {
        this.f8448a = cls;
        this.f8449b = cls2;
    }

    public static gp3 b(ep3 ep3Var, Class cls, Class cls2) {
        return new dp3(cls, cls2, ep3Var);
    }

    public abstract yp3 a(fi3 fi3Var);

    public final Class c() {
        return this.f8448a;
    }

    public final Class d() {
        return this.f8449b;
    }
}
