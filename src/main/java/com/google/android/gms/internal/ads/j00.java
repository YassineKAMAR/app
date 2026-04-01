package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j00 implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9429a;

    public j00(Context context) {
        this.f9429a = context;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void a(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        j2.v1.k("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey(com.amazon.a.a.o.b.S)) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get(com.amazon.a.a.o.b.S));
        }
        try {
            g2.t.r();
            j2.k2.s(this.f9429a, intent);
        } catch (RuntimeException e8) {
            qg0.h("Failed to open Share Sheet", e8);
            g2.t.q().u(e8, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
