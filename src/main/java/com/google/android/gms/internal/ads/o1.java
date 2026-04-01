package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f12324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1 f12325b;

    public o1(r1 r1Var, r1 r1Var2) {
        this.f12324a = r1Var;
        this.f12325b = r1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f12324a.equals(o1Var.f12324a) && this.f12325b.equals(o1Var.f12325b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12324a.hashCode() * 31) + this.f12325b.hashCode();
    }

    public final String toString() {
        r1 r1Var = this.f12324a;
        r1 r1Var2 = this.f12325b;
        return "[" + r1Var.toString() + (r1Var.equals(r1Var2) ? "" : ", ".concat(this.f12325b.toString())) + "]";
    }
}
