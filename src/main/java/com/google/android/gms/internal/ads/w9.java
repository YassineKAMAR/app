package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class w9 implements p9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cp2 f16657a = new cp2(new byte[4], 4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ y9 f16658b;

    public w9(y9 y9Var) {
        this.f16658b = y9Var;
    }

    @Override // com.google.android.gms.internal.ads.p9
    public final void a(dq2 dq2Var) {
        if (dq2Var.u() == 0 && (dq2Var.u() & 128) != 0) {
            dq2Var.h(6);
            int iJ = dq2Var.j() / 4;
            for (int i8 = 0; i8 < iJ; i8++) {
                dq2Var.b(this.f16657a, 4);
                cp2 cp2Var = this.f16657a;
                int iD = cp2Var.d(16);
                cp2Var.l(3);
                if (iD == 0) {
                    this.f16657a.l(13);
                } else {
                    int iD2 = this.f16657a.d(13);
                    if (this.f16658b.f17642e.get(iD2) == null) {
                        y9 y9Var = this.f16658b;
                        y9Var.f17642e.put(iD2, new q9(new x9(y9Var, iD2)));
                        this.f16658b.f17648k++;
                    }
                }
            }
            this.f16658b.f17642e.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.p9
    public final void b(kx2 kx2Var, s0 s0Var, ca caVar) {
    }
}
