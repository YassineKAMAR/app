package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class xg implements d43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b23 f17209a;

    xg(zg zgVar, b23 b23Var) {
        this.f17209a = b23Var;
    }

    @Override // com.google.android.gms.internal.ads.d43
    public final boolean a(File file) {
        try {
            return this.f17209a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
