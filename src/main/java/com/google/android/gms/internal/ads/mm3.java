package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class mm3 extends jo3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ om3 f11412b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    mm3(om3 om3Var, Class cls) {
        super(cls);
        this.f11412b = om3Var;
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* bridge */ /* synthetic */ k24 a(k24 k24Var) {
        ww3 ww3VarN = yw3.N();
        ww3VarN.u((bx3) k24Var);
        ww3VarN.v(0);
        return (yw3) ww3VarN.q();
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* synthetic */ k24 b(rz3 rz3Var) {
        return bx3.P(rz3Var, m04.a());
    }

    @Override // com.google.android.gms.internal.ads.jo3
    public final /* bridge */ /* synthetic */ void d(k24 k24Var) throws GeneralSecurityException {
        bx3 bx3Var = (bx3) k24Var;
        if (km3.b(bx3Var.M().R())) {
            if (bx3Var.Q().isEmpty() || !bx3Var.R()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        } else {
            throw new GeneralSecurityException("Unsupported DEK key type: " + bx3Var.M().R() + ". Only Tink AEAD key types are supported.");
        }
    }
}
