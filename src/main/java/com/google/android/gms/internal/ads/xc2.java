package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class xc2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f17169a;

    xc2(Bundle bundle) {
        this.f17169a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f17169a.isEmpty()) {
            return;
        }
        bundle.putBundle("installed_adapter_data", this.f17169a);
    }
}
