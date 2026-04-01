package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class m0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b7 f18936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18937b;

    public m0(b7 b7Var, String str) {
        this.f18936a = b7Var;
        this.f18937b = str;
    }

    @Override // com.google.android.gms.internal.measurement.o0
    public final b7 a(r rVar) {
        b7 b7VarD = this.f18936a.d();
        b7VarD.f(this.f18937b, rVar);
        return b7VarD;
    }
}
