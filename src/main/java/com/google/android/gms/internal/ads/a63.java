package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class a63 extends t63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5045b;

    /* synthetic */ a63(String str, String str2, z53 z53Var) {
        this.f5044a = str;
        this.f5045b = str2;
    }

    @Override // com.google.android.gms.internal.ads.t63
    public final String a() {
        return this.f5045b;
    }

    @Override // com.google.android.gms.internal.ads.t63
    public final String b() {
        return this.f5044a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t63) {
            t63 t63Var = (t63) obj;
            String str = this.f5044a;
            if (str != null ? str.equals(t63Var.b()) : t63Var.b() == null) {
                String str2 = this.f5045b;
                String strA = t63Var.a();
                if (str2 != null ? str2.equals(strA) : strA == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5044a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f5045b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OverlayDisplayUpdateRequest{sessionToken=" + this.f5044a + ", appId=" + this.f5045b + "}";
    }
}
