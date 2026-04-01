package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class mz implements qz {
    mz() {
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        fm0 fm0Var = (fm0) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            fm0Var.k();
        } else if ("resume".equals(str)) {
            fm0Var.j();
        }
    }
}
