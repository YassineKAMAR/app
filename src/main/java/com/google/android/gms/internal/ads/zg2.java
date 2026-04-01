package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class zg2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f18225a;

    public zg2(Bundle bundle) {
        this.f18225a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.f18225a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
