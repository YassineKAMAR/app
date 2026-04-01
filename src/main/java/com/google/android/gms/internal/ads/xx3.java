package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class xx3 implements dy3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final my3 f17499a;

    @Override // com.google.android.gms.internal.ads.dy3
    public final Object a(String str) {
        Iterator it = ey3.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.f17499a.a(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.f17499a.a(str, null);
    }
}
