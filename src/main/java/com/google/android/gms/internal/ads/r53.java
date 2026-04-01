package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class r53 extends c63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13946b;

    /* synthetic */ r53(String str, String str2, q53 q53Var) {
        this.f13945a = str;
        this.f13946b = str2;
    }

    @Override // com.google.android.gms.internal.ads.c63
    public final String a() {
        return this.f13946b;
    }

    @Override // com.google.android.gms.internal.ads.c63
    public final String b() {
        return this.f13945a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c63) {
            c63 c63Var = (c63) obj;
            String str = this.f13945a;
            if (str != null ? str.equals(c63Var.b()) : c63Var.b() == null) {
                String str2 = this.f13946b;
                String strA = c63Var.a();
                if (str2 != null ? str2.equals(strA) : strA == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f13945a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f13946b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OverlayDisplayDismissRequest{sessionToken=" + this.f13945a + ", appId=" + this.f13946b + "}";
    }
}
