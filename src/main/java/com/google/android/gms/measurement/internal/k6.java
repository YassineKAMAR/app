package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class k6 implements Callable<List<d>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f20175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f20176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f20177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ a6 f20178d;

    k6(a6 a6Var, String str, String str2, String str3) {
        this.f20178d = a6Var;
        this.f20175a = str;
        this.f20176b = str2;
        this.f20177c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<d> call() {
        this.f20178d.f19787a.o0();
        return this.f20178d.f19787a.e0().R(this.f20175a, this.f20176b, this.f20177c);
    }
}
