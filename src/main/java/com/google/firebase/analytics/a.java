package com.google.firebase.analytics;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class a implements Callable<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAnalytics f20777a;

    a(FirebaseAnalytics firebaseAnalytics) {
        this.f20777a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        return this.f20777a.f20767a.O();
    }
}
