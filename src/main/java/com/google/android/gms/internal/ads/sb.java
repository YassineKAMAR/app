package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class sb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f14592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f14593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ub f14594c;

    sb(ub ubVar, String str, long j8) {
        this.f14594c = ubVar;
        this.f14592a = str;
        this.f14593b = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14594c.f15587a.a(this.f14592a, this.f14593b);
        ub ubVar = this.f14594c;
        ubVar.f15587a.b(ubVar.toString());
    }
}
