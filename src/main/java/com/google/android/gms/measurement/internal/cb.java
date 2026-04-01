package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class cb implements kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ va f19876a;

    cb(va vaVar) {
        this.f19876a = vaVar;
    }

    @Override // com.google.android.gms.measurement.internal.kb
    public final void b(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f19876a.u().D(new bb(this, str, str2, bundle));
        } else if (this.f19876a.f20582l != null) {
            this.f19876a.f20582l.t().G().b("AppId not known when logging event", str2);
        }
    }
}
