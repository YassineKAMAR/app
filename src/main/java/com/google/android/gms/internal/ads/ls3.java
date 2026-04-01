package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class ls3 implements dr3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mq3 f11039a;

    public ls3(mq3 mq3Var) throws GeneralSecurityException {
        if (!un3.a(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.f11039a = mq3Var;
    }
}
