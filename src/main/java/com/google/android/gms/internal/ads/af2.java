package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class af2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f5244c;

    /* synthetic */ af2(String str, String str2, Bundle bundle, ze2 ze2Var) {
        this.f5242a = str;
        this.f5243b = str2;
        this.f5244c = bundle;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.f5242a);
        bundle.putString("fc_consent", this.f5243b);
        bundle.putBundle("iab_consent_info", this.f5244c);
    }
}
