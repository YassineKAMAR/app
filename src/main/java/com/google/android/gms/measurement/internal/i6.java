package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class i6 implements Callable<List<jb>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f20109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f20110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f20111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ a6 f20112d;

    i6(a6 a6Var, String str, String str2, String str3) {
        this.f20112d = a6Var;
        this.f20109a = str;
        this.f20110b = str2;
        this.f20111c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<jb> call() {
        this.f20112d.f19787a.o0();
        return this.f20112d.f19787a.e0().y0(this.f20109a, this.f20110b, this.f20111c);
    }
}
