package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class vo3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final vo3 f16391b = new vo3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f16392a = new AtomicReference(new sp3(new np3(null), null));

    vo3() {
    }

    public static vo3 a() {
        return f16391b;
    }

    public final Class b(Class cls) {
        return ((sp3) this.f16392a.get()).a(cls);
    }

    public final Object c(nh3 nh3Var, Class cls) {
        return ((sp3) this.f16392a.get()).b(nh3Var, cls);
    }

    public final Object d(ni3 ni3Var, Class cls) {
        return ((sp3) this.f16392a.get()).c(ni3Var, cls);
    }

    public final synchronized void e(kp3 kp3Var) {
        np3 np3Var = new np3((sp3) this.f16392a.get(), null);
        np3Var.a(kp3Var);
        this.f16392a.set(new sp3(np3Var, null));
    }

    public final synchronized void f(oi3 oi3Var) {
        np3 np3Var = new np3((sp3) this.f16392a.get(), null);
        np3Var.b(oi3Var);
        this.f16392a.set(new sp3(np3Var, null));
    }
}
