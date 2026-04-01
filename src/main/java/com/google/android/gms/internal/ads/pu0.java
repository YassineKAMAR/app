package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pu0 implements wt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vr2 f13135a;

    public pu0(vr2 vr2Var) {
        this.f13135a = vr2Var;
    }

    @Override // com.google.android.gms.internal.ads.wt0
    public final void a(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f13135a.b(Boolean.parseBoolean(str));
        } catch (Exception e8) {
            throw new IllegalStateException("Invalid render_in_browser state", e8);
        }
    }
}
