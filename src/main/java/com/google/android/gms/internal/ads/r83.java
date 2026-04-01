package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class r83 extends h83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f13988a;

    r83(Object obj) {
        this.f13988a = obj;
    }

    @Override // com.google.android.gms.internal.ads.h83
    public final h83 a(z73 z73Var) {
        Object objApply = z73Var.apply(this.f13988a);
        l83.c(objApply, "the Function passed to Optional.transform() must not return null.");
        return new r83(objApply);
    }

    @Override // com.google.android.gms.internal.ads.h83
    public final Object b(Object obj) {
        return this.f13988a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r83) {
            return this.f13988a.equals(((r83) obj).f13988a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13988a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f13988a.toString() + ")";
    }
}
