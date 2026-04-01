package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class bz implements qz {
    bz() {
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        fm0 fm0Var = (fm0) obj;
        try {
            i53.k(fm0Var.getContext()).l();
            j53.j(fm0Var.getContext()).k();
        } catch (IOException e8) {
            g2.t.q().u(e8, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
