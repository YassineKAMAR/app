package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class je2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x3.d f9579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f9580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e3.e f9581c;

    public je2(x3.d dVar, long j8, e3.e eVar) {
        this.f9579a = dVar;
        this.f9581c = eVar;
        this.f9580b = eVar.b() + j8;
    }

    public final boolean a() {
        return this.f9580b < this.f9581c.b();
    }
}
