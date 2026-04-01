package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ju0 implements wt0 {
    ju0() {
    }

    @Override // com.google.android.gms.internal.ads.wt0
    public final void a(Map map) {
        if (!((Boolean) h2.y.c().b(ns.C9)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        g2.t.q().h().B(Boolean.parseBoolean(str));
    }
}
