package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class v53 extends p63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f15991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f15992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f15993c;

    v53() {
    }

    @Override // com.google.android.gms.internal.ads.p63
    public final p63 a(String str) {
        this.f15992b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.p63
    public final p63 b(int i8) {
        this.f15991a = i8;
        this.f15993c = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.p63
    public final q63 c() {
        if (this.f15993c == 1) {
            return new x53(this.f15991a, this.f15992b, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
