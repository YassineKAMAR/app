package com.google.firebase.analytics;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class d implements Callable<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAnalytics f20780a;

    d(FirebaseAnalytics firebaseAnalytics) {
        this.f20780a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() {
        return this.f20780a.f20767a.G();
    }
}
