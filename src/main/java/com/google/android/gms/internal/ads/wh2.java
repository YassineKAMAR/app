package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class wh2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16738a;

    public wh2(String str) {
        this.f16738a = str;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.f16738a)) {
            return;
        }
        bundle.putString("query_info", this.f16738a);
    }
}
