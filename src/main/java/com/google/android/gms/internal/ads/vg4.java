package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class vg4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final vg4 f16263d = new tg4().d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16266c;

    /* synthetic */ vg4(tg4 tg4Var, ug4 ug4Var) {
        this.f16264a = tg4Var.f15090a;
        this.f16265b = tg4Var.f15091b;
        this.f16266c = tg4Var.f15092c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vg4.class == obj.getClass()) {
            vg4 vg4Var = (vg4) obj;
            if (this.f16264a == vg4Var.f16264a && this.f16265b == vg4Var.f16265b && this.f16266c == vg4Var.f16266c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z7 = this.f16264a;
        boolean z8 = this.f16265b;
        return ((z7 ? 1 : 0) << 2) + (z8 ? 1 : 0) + (z8 ? 1 : 0) + (this.f16266c ? 1 : 0);
    }
}
