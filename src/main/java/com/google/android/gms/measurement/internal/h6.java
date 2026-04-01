package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class h6 implements Callable<List<d>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f20057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f20058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f20059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ a6 f20060d;

    h6(a6 a6Var, String str, String str2, String str3) {
        this.f20060d = a6Var;
        this.f20057a = str;
        this.f20058b = str2;
        this.f20059c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<d> call() {
        this.f20060d.f19787a.o0();
        return this.f20060d.f19787a.e0().R(this.f20057a, this.f20058b, this.f20059c);
    }
}
