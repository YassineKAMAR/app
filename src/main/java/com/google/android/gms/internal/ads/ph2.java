package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ph2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bundle f12876b;

    public ph2(String str, Bundle bundle) {
        this.f12875a = str;
        this.f12876b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("rtb", this.f12875a);
        if (this.f12876b.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", this.f12876b);
    }
}
