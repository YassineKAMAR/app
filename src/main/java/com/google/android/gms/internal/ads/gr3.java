package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gr3 implements oi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gr3 f8473a = new gr3();

    private gr3() {
    }

    static void b() {
        qi3.g(f8473a);
    }

    @Override // com.google.android.gms.internal.ads.oi3
    public final /* bridge */ /* synthetic */ Object a(ni3 ni3Var) throws GeneralSecurityException {
        if (ni3Var.a() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = ni3Var.d().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new fr3(ni3Var, null);
    }

    @Override // com.google.android.gms.internal.ads.oi3
    public final Class j() {
        return dr3.class;
    }

    @Override // com.google.android.gms.internal.ads.oi3
    public final Class k() {
        return dr3.class;
    }
}
