package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class uy implements qz {
    uy() {
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject jSONObjectJ;
        fm0 fm0Var = (fm0) obj;
        kv kvVarP0 = fm0Var.p0();
        if (kvVarP0 == null || (jSONObjectJ = kvVarP0.j()) == null) {
            fm0Var.e("nativeAdViewSignalsReady", new JSONObject());
        } else {
            fm0Var.e("nativeAdViewSignalsReady", jSONObjectJ);
        }
    }
}
