package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ca4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nb f6259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nb f6260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6262e;

    public ca4(String str, nb nbVar, nb nbVar2, int i8, int i9) {
        boolean z7 = false;
        if (i8 == 0) {
            z7 = true;
        } else if (i9 == 0) {
            i9 = 0;
            z7 = true;
        }
        uu1.d(z7);
        uu1.c(str);
        this.f6258a = str;
        nbVar.getClass();
        this.f6259b = nbVar;
        nbVar2.getClass();
        this.f6260c = nbVar2;
        this.f6261d = i8;
        this.f6262e = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ca4.class == obj.getClass()) {
            ca4 ca4Var = (ca4) obj;
            if (this.f6261d == ca4Var.f6261d && this.f6262e == ca4Var.f6262e && this.f6258a.equals(ca4Var.f6258a) && this.f6259b.equals(ca4Var.f6259b) && this.f6260c.equals(ca4Var.f6260c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f6261d + 527) * 31) + this.f6262e) * 31) + this.f6258a.hashCode()) * 31) + this.f6259b.hashCode()) * 31) + this.f6260c.hashCode();
    }
}
