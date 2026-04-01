package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class vy implements qz {
    vy() {
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject jSONObjectK;
        fm0 fm0Var = (fm0) obj;
        kv kvVarP0 = fm0Var.p0();
        if (kvVarP0 == null || (jSONObjectK = kvVarP0.k()) == null) {
            fm0Var.e("nativeClickMetaReady", new JSONObject());
        } else {
            fm0Var.e("nativeClickMetaReady", jSONObjectK);
        }
    }
}
