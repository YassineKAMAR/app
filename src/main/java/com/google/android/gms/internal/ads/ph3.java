package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class ph3 implements oh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ko3 f12877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f12878b;

    public ph3(ko3 ko3Var, Class cls) {
        if (!ko3Var.j().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", ko3Var.toString(), cls.getName()));
        }
        this.f12877a = ko3Var;
        this.f12878b = cls;
    }

    @Override // com.google.android.gms.internal.ads.oh3
    public final Object a(rz3 rz3Var) throws GeneralSecurityException {
        try {
            k24 k24VarC = this.f12877a.c(rz3Var);
            if (Void.class.equals(this.f12878b)) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            this.f12877a.e(k24VarC);
            return this.f12877a.i(k24VarC, this.f12878b);
        } catch (m14 e8) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f12877a.h().getName()), e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.oh3
    public final vv3 b(rz3 rz3Var) throws GeneralSecurityException {
        try {
            jo3 jo3VarA = this.f12877a.a();
            k24 k24VarB = jo3VarA.b(rz3Var);
            jo3VarA.d(k24VarB);
            k24 k24VarA = jo3VarA.a(k24VarB);
            sv3 sv3VarM = vv3.M();
            sv3VarM.v(this.f12877a.d());
            sv3VarM.w(k24VarA.c());
            sv3VarM.u(this.f12877a.b());
            return (vv3) sv3VarM.q();
        } catch (m14 e8) {
            throw new GeneralSecurityException("Unexpected proto", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.oh3
    public final String l() {
        return this.f12877a.d();
    }
}
