package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class sf2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f14651a;

    public sf2(Boolean bool) {
        this.f14651a = bool;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Boolean bool = this.f14651a;
        Bundle bundle = (Bundle) obj;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
