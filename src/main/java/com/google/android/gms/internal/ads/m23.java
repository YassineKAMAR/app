package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class m23 extends i23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f11137c;

    /* synthetic */ m23(String str, boolean z7, boolean z8, l23 l23Var) {
        this.f11135a = str;
        this.f11136b = z7;
        this.f11137c = z8;
    }

    @Override // com.google.android.gms.internal.ads.i23
    public final String b() {
        return this.f11135a;
    }

    @Override // com.google.android.gms.internal.ads.i23
    public final boolean c() {
        return this.f11137c;
    }

    @Override // com.google.android.gms.internal.ads.i23
    public final boolean d() {
        return this.f11136b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i23) {
            i23 i23Var = (i23) obj;
            if (this.f11135a.equals(i23Var.b()) && this.f11136b == i23Var.d() && this.f11137c == i23Var.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f11135a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f11136b ? 1237 : 1231)) * 1000003) ^ (true == this.f11137c ? 1231 : 1237);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.f11135a + ", shouldGetAdvertisingId=" + this.f11136b + ", isGooglePlayServicesAvailable=" + this.f11137c + "}";
    }
}
