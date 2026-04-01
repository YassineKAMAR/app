package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class l53 extends le3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Object f10463h;

    l53(Object obj) {
        this.f10463h = obj;
    }

    @Override // com.google.android.gms.internal.ads.le3
    public final String d() {
        Object obj = this.f10463h;
        return obj == null ? "" : obj.toString();
    }

    @Override // com.google.android.gms.internal.ads.le3
    protected final void e() {
        this.f10463h = null;
    }

    @Override // com.google.android.gms.internal.ads.le3
    public final boolean f(Object obj) {
        return super.f(obj);
    }

    @Override // com.google.android.gms.internal.ads.le3
    public final boolean g(Throwable th) {
        return super.g(th);
    }
}
