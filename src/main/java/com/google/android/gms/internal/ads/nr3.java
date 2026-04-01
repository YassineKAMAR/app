package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
final class nr3 extends lp3 {
    nr3(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.lp3
    public final /* bridge */ /* synthetic */ Object a(k24 k24Var) throws GeneralSecurityException {
        kv3 kv3Var = (kv3) k24Var;
        hv3 hv3VarN = kv3Var.R().N();
        SecretKeySpec secretKeySpec = new SecretKeySpec(kv3Var.S().a(), "HMAC");
        int iM = kv3Var.R().M();
        hv3 hv3Var = hv3.UNKNOWN_HASH;
        int iOrdinal = hv3VarN.ordinal();
        if (iOrdinal == 1) {
            return new sy3(new ry3("HMACSHA1", secretKeySpec), iM);
        }
        if (iOrdinal == 2) {
            return new sy3(new ry3("HMACSHA384", secretKeySpec), iM);
        }
        if (iOrdinal == 3) {
            return new sy3(new ry3("HMACSHA256", secretKeySpec), iM);
        }
        if (iOrdinal == 4) {
            return new sy3(new ry3("HMACSHA512", secretKeySpec), iM);
        }
        if (iOrdinal == 5) {
            return new sy3(new ry3("HMACSHA224", secretKeySpec), iM);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
