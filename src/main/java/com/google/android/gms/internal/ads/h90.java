package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class h90 extends bf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ q2.b f8683a;

    h90(i90 i90Var, q2.b bVar) {
        this.f8683a = bVar;
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void B1(String str, String str2, Bundle bundle) {
        this.f8683a.b(new q2.a(new h2.m3(str, bundle, str2)));
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void c(String str) {
        this.f8683a.a(str);
    }
}
