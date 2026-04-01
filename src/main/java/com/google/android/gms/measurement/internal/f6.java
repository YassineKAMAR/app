package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class f6 implements Callable<List<jb>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f20009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f20010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f20011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ a6 f20012d;

    f6(a6 a6Var, String str, String str2, String str3) {
        this.f20012d = a6Var;
        this.f20009a = str;
        this.f20010b = str2;
        this.f20011c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<jb> call() {
        this.f20012d.f19787a.o0();
        return this.f20012d.f19787a.e0().y0(this.f20009a, this.f20010b, this.f20011c);
    }
}
