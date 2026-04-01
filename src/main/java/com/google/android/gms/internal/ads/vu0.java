package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vu0 implements wt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ft1 f16476a;

    vu0(ft1 ft1Var) {
        this.f16476a = ft1Var;
    }

    @Override // com.google.android.gms.internal.ads.wt0
    public final void a(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f16476a.n(str.equals(com.amazon.a.a.o.b.ac));
    }
}
