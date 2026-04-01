package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class cz implements qz {
    cz() {
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        fm0 fm0Var = (fm0) obj;
        try {
            String str = (String) map.get("enabled");
            if (!r73.c(com.amazon.a.a.o.b.ac, str) && !r73.c(com.amazon.a.a.o.b.ad, str)) {
                return;
            }
            j53.j(fm0Var.getContext()).n(Boolean.parseBoolean(str));
        } catch (IOException e8) {
            g2.t.q().u(e8, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
