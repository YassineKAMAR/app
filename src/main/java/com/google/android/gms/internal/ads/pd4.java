package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class pd4 extends hm4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r01 f12833g;

    pd4(qd4 qd4Var, s11 s11Var) {
        super(s11Var);
        this.f12833g = new r01();
    }

    @Override // com.google.android.gms.internal.ads.hm4, com.google.android.gms.internal.ads.s11
    public final py0 d(int i8, py0 py0Var, boolean z7) {
        py0 py0VarD = this.f8831f.d(i8, py0Var, z7);
        if (this.f8831f.e(py0VarD.f13191c, this.f12833g, 0L).b()) {
            py0VarD.l(py0Var.f13189a, py0Var.f13190b, py0Var.f13191c, py0Var.f13192d, 0L, x61.f17055e, true);
        } else {
            py0VarD.f13194f = true;
        }
        return py0VarD;
    }
}
