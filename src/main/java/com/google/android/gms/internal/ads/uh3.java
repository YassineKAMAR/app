package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class uh3 {
    public static th3 a(String str) throws GeneralSecurityException {
        fi3 fi3Var = (fi3) qi3.e().get("AES128_GCM");
        if (fi3Var != null) {
            return th3.a(fi3Var);
        }
        throw new GeneralSecurityException("cannot find key template: AES128_GCM");
    }
}
