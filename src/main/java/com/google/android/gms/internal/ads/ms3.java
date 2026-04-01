package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class ms3 implements dr3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kr3 f11535a;

    public ms3(kr3 kr3Var) throws GeneralSecurityException {
        if (!un3.a(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f11535a = kr3Var;
    }
}
