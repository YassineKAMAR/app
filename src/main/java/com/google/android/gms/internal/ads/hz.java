package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class hz implements qz {
    hz() {
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        fm0 fm0Var = (fm0) obj;
        if (fm0Var.o0() != null) {
            fm0Var.o0().j();
        }
        i2.s sVarL = fm0Var.L();
        if (sVarL != null) {
            sVarL.k();
            return;
        }
        i2.s sVarM = fm0Var.M();
        if (sVarM != null) {
            sVarM.k();
        } else {
            qg0.g("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
