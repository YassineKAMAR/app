package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class nz implements qz {
    nz() {
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        fm0 fm0Var = (fm0) obj;
        if (map.keySet().contains("start")) {
            fm0Var.H().u();
        } else if (map.keySet().contains("stop")) {
            fm0Var.H().x();
        } else if (map.keySet().contains("cancel")) {
            fm0Var.H().s();
        }
    }
}
