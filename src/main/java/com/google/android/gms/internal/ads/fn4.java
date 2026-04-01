package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class fn4 implements iq4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iq4 f7843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u31 f7844b;

    public fn4(iq4 iq4Var, u31 u31Var) {
        this.f7843a = iq4Var;
        this.f7844b = u31Var;
    }

    @Override // com.google.android.gms.internal.ads.mq4
    public final int b(int i8) {
        return this.f7843a.b(0);
    }

    @Override // com.google.android.gms.internal.ads.mq4
    public final int d(int i8) {
        return this.f7843a.d(i8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn4)) {
            return false;
        }
        fn4 fn4Var = (fn4) obj;
        return this.f7843a.equals(fn4Var.f7843a) && this.f7844b.equals(fn4Var.f7844b);
    }

    @Override // com.google.android.gms.internal.ads.mq4
    public final nb f(int i8) {
        return this.f7843a.f(i8);
    }

    public final int hashCode() {
        return ((this.f7844b.hashCode() + 527) * 31) + this.f7843a.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.mq4
    public final int l() {
        return this.f7843a.l();
    }

    @Override // com.google.android.gms.internal.ads.mq4
    public final u31 m() {
        return this.f7844b;
    }
}
