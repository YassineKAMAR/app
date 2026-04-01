package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
final class qx3 extends ThreadLocal {
    qx3() {
    }

    protected static final Cipher a() {
        try {
            return (Cipher) ey3.f7544b.a("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
