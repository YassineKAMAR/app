package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class p53 extends b63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f12752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f12753b;

    p53() {
    }

    @Override // com.google.android.gms.internal.ads.b63
    public final b63 a(String str) {
        this.f12753b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.b63
    public final b63 b(String str) {
        this.f12752a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.b63
    public final c63 c() {
        return new r53(this.f12752a, this.f12753b, null);
    }
}
