package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class xo1 implements f71, v51, j41, b51, h2.a, t91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vn f17409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17410b = false;

    public xo1(vn vnVar, pp2 pp2Var) {
        this.f17409a = vnVar;
        vnVar.c(2);
        if (pp2Var != null) {
            vnVar.c(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.j41
    public final void A(h2.z2 z2Var) {
        vn vnVar;
        int i8;
        switch (z2Var.f22383a) {
            case 1:
                vnVar = this.f17409a;
                i8 = 101;
                break;
            case 2:
                vnVar = this.f17409a;
                i8 = 102;
                break;
            case 3:
                vnVar = this.f17409a;
                i8 = 5;
                break;
            case 4:
                vnVar = this.f17409a;
                i8 = 103;
                break;
            case 5:
                vnVar = this.f17409a;
                i8 = 104;
                break;
            case 6:
                vnVar = this.f17409a;
                i8 = 105;
                break;
            case 7:
                vnVar = this.f17409a;
                i8 = 106;
                break;
            default:
                vnVar = this.f17409a;
                i8 = 4;
                break;
        }
        vnVar.c(i8);
    }

    @Override // com.google.android.gms.internal.ads.v51
    public final void B() {
        this.f17409a.c(3);
    }

    @Override // com.google.android.gms.internal.ads.t91
    public final void D(boolean z7) {
        this.f17409a.c(true != z7 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.t91
    public final void R(final qo qoVar) {
        this.f17409a.b(new un() { // from class: com.google.android.gms.internal.ads.uo1
            @Override // com.google.android.gms.internal.ads.un
            public final void a(lp lpVar) {
                lpVar.z(qoVar);
            }
        });
        this.f17409a.c(1102);
    }

    @Override // com.google.android.gms.internal.ads.f71
    public final void U(final ks2 ks2Var) {
        this.f17409a.b(new un() { // from class: com.google.android.gms.internal.ads.to1
            @Override // com.google.android.gms.internal.ads.un
            public final void a(lp lpVar) {
                go goVar = (go) lpVar.u().m();
                yo yoVar = (yo) lpVar.u().O().m();
                yoVar.u(ks2Var.f10323b.f9793b.f5462b);
                goVar.v(yoVar);
                lpVar.y(goVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.t91
    public final void V(final qo qoVar) {
        this.f17409a.b(new un() { // from class: com.google.android.gms.internal.ads.wo1
            @Override // com.google.android.gms.internal.ads.un
            public final void a(lp lpVar) {
                lpVar.z(qoVar);
            }
        });
        this.f17409a.c(1103);
    }

    @Override // com.google.android.gms.internal.ads.t91
    public final void Y(boolean z7) {
        this.f17409a.c(true != z7 ? 1106 : 1105);
    }

    @Override // h2.a
    public final synchronized void Z() {
        if (this.f17410b) {
            this.f17409a.c(8);
        } else {
            this.f17409a.c(7);
            this.f17410b = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.t91
    public final void d0(final qo qoVar) {
        this.f17409a.b(new un() { // from class: com.google.android.gms.internal.ads.vo1
            @Override // com.google.android.gms.internal.ads.un
            public final void a(lp lpVar) {
                lpVar.z(qoVar);
            }
        });
        this.f17409a.c(1104);
    }

    @Override // com.google.android.gms.internal.ads.f71
    public final void g0(ya0 ya0Var) {
    }

    @Override // com.google.android.gms.internal.ads.t91
    public final void o() {
        this.f17409a.c(1109);
    }

    @Override // com.google.android.gms.internal.ads.b51
    public final synchronized void z() {
        this.f17409a.c(6);
    }
}
