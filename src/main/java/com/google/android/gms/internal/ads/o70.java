package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class o70 implements i2.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzbrn f12387a;

    o70(zzbrn zzbrnVar) {
        this.f12387a = zzbrnVar;
    }

    @Override // i2.u
    public final void G5() {
        qg0.b("Opening AdMobCustomTabsAdapter overlay.");
        zzbrn zzbrnVar = this.f12387a;
        zzbrnVar.f18534b.s(zzbrnVar);
    }

    @Override // i2.u
    public final void h5() {
        qg0.b("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // i2.u
    public final void k0() {
        qg0.b("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // i2.u
    public final void q3() {
        qg0.b("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // i2.u
    public final void v0(int i8) {
        qg0.b("AdMobCustomTabsAdapter overlay is closed.");
        zzbrn zzbrnVar = this.f12387a;
        zzbrnVar.f18534b.o(zzbrnVar);
    }

    @Override // i2.u
    public final void y4() {
    }
}
