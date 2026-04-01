package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class uo3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final uo3 f15788b = new uo3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final to3 f15789c = new to3(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f15790a = new AtomicReference();

    public static uo3 a() {
        return f15788b;
    }

    public final ys3 b() {
        ys3 ys3Var = (ys3) this.f15790a.get();
        return ys3Var == null ? f15789c : ys3Var;
    }
}
