package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class v2 implements b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r2 f19717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t3 f19718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b1 f19720d;

    private v2(t3 t3Var, b1 b1Var, r2 r2Var) {
        this.f19718b = t3Var;
        this.f19719c = b1Var.c(r2Var);
        this.f19720d = b1Var;
        this.f19717a = r2Var;
    }

    static v2 i(t3 t3Var, b1 b1Var, r2 r2Var) {
        return new v2(t3Var, b1Var, r2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final int a(Object obj) {
        t3 t3Var = this.f19718b;
        int iB = t3Var.b(t3Var.d(obj));
        if (!this.f19719c) {
            return iB;
        }
        this.f19720d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final int b(Object obj) {
        int iHashCode = this.f19718b.d(obj).hashCode();
        if (!this.f19719c) {
            return iHashCode;
        }
        this.f19720d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final void c(Object obj) {
        this.f19718b.g(obj);
        this.f19720d.b(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final boolean d(Object obj) {
        this.f19720d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final void e(Object obj, Object obj2) {
        d3.v(this.f19718b, obj, obj2);
        if (this.f19719c) {
            this.f19720d.a(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final boolean f(Object obj, Object obj2) {
        t3 t3Var = this.f19718b;
        if (!t3Var.d(obj).equals(t3Var.d(obj2))) {
            return false;
        }
        if (!this.f19719c) {
            return true;
        }
        this.f19720d.a(obj);
        this.f19720d.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final void g(Object obj, l4 l4Var) {
        this.f19720d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final void h(Object obj, byte[] bArr, int i8, int i9, a0 a0Var) {
        n1 n1Var = (n1) obj;
        if (n1Var.zzc == u3.c()) {
            n1Var.zzc = u3.f();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.b3
    public final Object m() {
        r2 r2Var = this.f19717a;
        return r2Var instanceof n1 ? ((n1) r2Var).g() : r2Var.s().m();
    }
}
