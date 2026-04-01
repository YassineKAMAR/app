package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ff2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f7740a;

    public ff2(Bundle bundle) {
        this.f7740a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((Bundle) obj).putBundle("content_info", this.f7740a);
    }
}
