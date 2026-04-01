package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* JADX INFO: loaded from: classes.dex */
final class p70 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AdOverlayInfoParcel f12766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ zzbrn f12767b;

    p70(zzbrn zzbrnVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f12767b = zzbrnVar;
        this.f12766a = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g2.t.k();
        i2.t.a(this.f12767b.f18533a, this.f12766a, true);
    }
}
