package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class w7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f20645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f20646b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f20647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f20648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ b7 f20649e;

    w7(b7 b7Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f20649e = b7Var;
        this.f20645a = atomicReference;
        this.f20647c = str2;
        this.f20648d = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20649e.f20556a.J().Q(this.f20645a, null, this.f20647c, this.f20648d);
    }
}
