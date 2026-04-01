package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c00 implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final au1 f6077a;

    public c00(au1 au1Var) {
        this.f6077a = au1Var;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void a(Object obj, Map map) {
        if (((Boolean) h2.y.c().b(ns.d9)).booleanValue()) {
            String str = (String) map.get("action");
            String str2 = (String) map.get("adUnitId");
            String str3 = (String) map.get("redirectUrl");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            String str4 = (String) map.get("format");
            if (str.equals("load") && !TextUtils.isEmpty(str4)) {
                this.f6077a.T5(str2, str4, str3);
            } else if (str.equals("show")) {
                this.f6077a.U5(str2, str3);
            }
        }
    }
}
