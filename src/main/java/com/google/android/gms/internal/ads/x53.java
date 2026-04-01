package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class x53 extends q63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17053b;

    /* synthetic */ x53(int i8, String str, w53 w53Var) {
        this.f17052a = i8;
        this.f17053b = str;
    }

    @Override // com.google.android.gms.internal.ads.q63
    public final int a() {
        return this.f17052a;
    }

    @Override // com.google.android.gms.internal.ads.q63
    public final String b() {
        return this.f17053b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q63) {
            q63 q63Var = (q63) obj;
            if (this.f17052a == q63Var.a()) {
                String str = this.f17053b;
                String strB = q63Var.b();
                if (str != null ? str.equals(strB) : strB == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f17053b;
        return (str == null ? 0 : str.hashCode()) ^ ((this.f17052a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.f17052a + ", sessionToken=" + this.f17053b + "}";
    }
}
