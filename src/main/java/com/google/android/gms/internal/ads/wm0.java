package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class wm0 implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ym0 f16815a;

    wm0(ym0 ym0Var) {
        this.f16815a = ym0Var;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i8 = Integer.parseInt(str);
                synchronized (this.f16815a) {
                    ym0 ym0Var = this.f16815a;
                    if (ym0Var.F != i8) {
                        ym0Var.F = i8;
                        this.f16815a.requestLayout();
                    }
                }
            } catch (Exception e8) {
                qg0.h("Exception occurred while getting webview content height", e8);
            }
        }
    }
}
