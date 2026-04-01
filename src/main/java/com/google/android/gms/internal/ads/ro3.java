package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ro3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xs3 f14255a = new qo3(null);

    public static dt3 a(ni3 ni3Var) {
        sh3 sh3Var;
        zs3 zs3Var = new zs3();
        zs3Var.b(ni3Var.b());
        Iterator it = ni3Var.d().iterator();
        while (it.hasNext()) {
            for (ii3 ii3Var : (List) it.next()) {
                int iH = ii3Var.h() - 2;
                if (iH == 1) {
                    sh3Var = sh3.f14673b;
                } else if (iH == 2) {
                    sh3Var = sh3.f14674c;
                } else {
                    if (iH != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    sh3Var = sh3.f14675d;
                }
                int iA = ii3Var.a();
                String strF = ii3Var.f();
                if (strF.startsWith("type.googleapis.com/google.crypto.")) {
                    strF = strF.substring(34);
                }
                zs3Var.a(sh3Var, iA, strF, ii3Var.c().name());
            }
        }
        if (ni3Var.a() != null) {
            zs3Var.c(ni3Var.a().a());
        }
        try {
            return zs3Var.d();
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }
}
