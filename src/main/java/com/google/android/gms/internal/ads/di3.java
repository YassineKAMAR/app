package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class di3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList f6772a = new CopyOnWriteArrayList();

    public static ci3 a(String str) throws GeneralSecurityException {
        for (ci3 ci3Var : f6772a) {
            if (ci3Var.j()) {
                return ci3Var;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
