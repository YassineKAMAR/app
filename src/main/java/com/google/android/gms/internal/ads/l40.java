package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class l40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n30 f10454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x3.d f10455b;

    l40(n30 n30Var) {
        this.f10454a = n30Var;
    }

    private final void d() {
        if (this.f10455b == null) {
            final jh0 jh0Var = new jh0();
            this.f10455b = jh0Var;
            this.f10454a.b(null).e(new nh0() { // from class: com.google.android.gms.internal.ads.i40
                @Override // com.google.android.gms.internal.ads.nh0
                public final void a(Object obj) {
                    jh0Var.d((o30) obj);
                }
            }, new lh0() { // from class: com.google.android.gms.internal.ads.j40
                @Override // com.google.android.gms.internal.ads.lh0
                public final void j() {
                    jh0Var.e(new q30("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final o40 a(String str, u30 u30Var, t30 t30Var) {
        d();
        return new o40(this.f10455b, "google.afma.activeView.handleUpdate", u30Var, t30Var);
    }

    public final void b(final String str, final qz qzVar) {
        d();
        this.f10455b = zf3.n(this.f10455b, new gf3() { // from class: com.google.android.gms.internal.ads.k40
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                o30 o30Var = (o30) obj;
                o30Var.D(str, qzVar);
                return zf3.h(o30Var);
            }
        }, eh0.f7327f);
    }

    public final void c(final String str, final qz qzVar) {
        this.f10455b = zf3.m(this.f10455b, new z73() { // from class: com.google.android.gms.internal.ads.h40
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                o30 o30Var = (o30) obj;
                o30Var.m(str, qzVar);
                return o30Var;
            }
        }, eh0.f7327f);
    }
}
