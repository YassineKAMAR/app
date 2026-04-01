package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i00 implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g00 f9027a;

    public i00(g00 g00Var) {
        this.f9027a = g00Var;
    }

    public static void b(fm0 fm0Var, g00 g00Var) {
        fm0Var.f1("/reward", new i00(g00Var));
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void a(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.f9027a.l();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.f9027a.k();
                    return;
                }
                return;
            }
        }
        bc0 bc0Var = null;
        try {
            int i8 = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                bc0Var = new bc0(str2, i8);
            }
        } catch (NumberFormatException e8) {
            qg0.h("Unable to parse reward amount.", e8);
        }
        this.f9027a.c0(bc0Var);
    }
}
