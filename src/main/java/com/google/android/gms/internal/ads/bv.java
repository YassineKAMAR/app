package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class bv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference f6048a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReference f6049b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final AtomicBoolean f6050c = new AtomicBoolean();

    static zu a() {
        return (zu) f6048a.get();
    }

    static av b() {
        return (av) f6049b.get();
    }

    public static void c(zu zuVar) {
        f6048a.set(zuVar);
    }
}
