package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class nf2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f11858a;

    public nf2(boolean z7) {
        this.f11858a = z7;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((Bundle) obj).putBoolean("is_gbid", this.f11858a);
    }
}
