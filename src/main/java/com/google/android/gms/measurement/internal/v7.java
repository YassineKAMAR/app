package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class v7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f20557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f20558b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f20559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f20560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ boolean f20561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ b7 f20562f;

    v7(b7 b7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z7) {
        this.f20562f = b7Var;
        this.f20557a = atomicReference;
        this.f20559c = str2;
        this.f20560d = str3;
        this.f20561e = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20562f.f20556a.J().R(this.f20557a, null, this.f20559c, this.f20560d, this.f20561e);
    }
}
