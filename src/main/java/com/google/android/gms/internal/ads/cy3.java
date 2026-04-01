package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class cy3 implements dy3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my3 f6510a;

    @Override // com.google.android.gms.internal.ads.dy3
    public final Object a(String str) throws GeneralSecurityException {
        Iterator it = ey3.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.f6510a.a(str, (Provider) it.next());
            } catch (Exception e8) {
                if (exc == null) {
                    exc = e8;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
