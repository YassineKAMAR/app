package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zl2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ zl2 f18283a = new zl2();

    private /* synthetic */ zl2() {
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final /* synthetic */ int j() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return zf3.h(new ni2() { // from class: com.google.android.gms.internal.ads.am2
            @Override // com.google.android.gms.internal.ads.ni2
            public final void a(Object obj) {
                try {
                    ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451000);
                } catch (JSONException unused) {
                }
            }
        });
    }
}
