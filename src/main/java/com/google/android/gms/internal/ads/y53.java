package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class y53 extends s63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f17594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17595b;

    y53() {
    }

    @Override // com.google.android.gms.internal.ads.s63
    public final s63 a(String str) {
        this.f17595b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.s63
    public final s63 b(String str) {
        this.f17594a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.s63
    public final t63 c() {
        return new a63(this.f17594a, this.f17595b, null);
    }
}
