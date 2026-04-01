package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class hc2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8721a;

    public hc2(String str) {
        this.f8721a = str;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        String str = this.f8721a;
        Bundle bundle = (Bundle) obj;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}
