package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class qx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13796b;

    public qx2(String str, String str2) {
        this.f13795a = str;
        this.f13796b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx2)) {
            return false;
        }
        qx2 qx2Var = (qx2) obj;
        return this.f13795a.equals(qx2Var.f13795a) && this.f13796b.equals(qx2Var.f13796b);
    }

    public final int hashCode() {
        return String.valueOf(this.f13795a).concat(String.valueOf(this.f13796b)).hashCode();
    }
}
