package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class pd2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f12830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f12831b;

    public pd2(String str, int i8) {
        this.f12830a = str;
        this.f12831b = i8;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.f12830a) || this.f12831b == -1) {
            return;
        }
        Bundle bundleA = ft2.a(bundle, "pii");
        bundle.putBundle("pii", bundleA);
        bundleA.putString("pvid", this.f12830a);
        bundleA.putInt("pvid_s", this.f12831b);
    }
}
