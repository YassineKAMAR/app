package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class qh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jh0 f13477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f13478b;

    public qh0() {
        jh0 jh0Var = new jh0();
        this.f13477a = jh0Var;
        this.f13478b = new AtomicInteger(0);
        zf3.r(jh0Var, new oh0(this), eh0.f7327f);
    }

    @Deprecated
    public final int a() {
        return this.f13478b.get();
    }

    @Deprecated
    public final void c() {
        this.f13477a.e(new Exception());
    }

    @Deprecated
    public final void d(Object obj) {
        this.f13477a.d(obj);
    }

    @Deprecated
    public final void e(nh0 nh0Var, lh0 lh0Var) {
        zf3.r(this.f13477a, new ph0(this, nh0Var, lh0Var), eh0.f7327f);
    }
}
