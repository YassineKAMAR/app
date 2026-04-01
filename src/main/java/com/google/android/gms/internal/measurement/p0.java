package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class p0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b7 f19024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19025b;

    public p0(b7 b7Var, String str) {
        this.f19024a = b7Var;
        this.f19025b = str;
    }

    @Override // com.google.android.gms.internal.measurement.o0
    public final b7 a(r rVar) {
        b7 b7VarD = this.f19024a.d();
        b7VarD.e(this.f19025b, rVar);
        return b7VarD;
    }
}
