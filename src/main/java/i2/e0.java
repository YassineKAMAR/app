package i2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.hc1;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.p80;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends p80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdOverlayInfoParcel f22492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Activity f22493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22494c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22495d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22496e = false;

    public e0(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f22492a = adOverlayInfoParcel;
        this.f22493b = activity;
    }

    private final synchronized void k() {
        if (this.f22495d) {
            return;
        }
        u uVar = this.f22492a.f4726c;
        if (uVar != null) {
            uVar.v0(4);
        }
        this.f22495d = true;
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void A() {
        u uVar = this.f22492a.f4726c;
        if (uVar != null) {
            uVar.y4();
        }
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void A2(int i8, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void B() {
        if (this.f22494c) {
            this.f22493b.finish();
            return;
        }
        this.f22494c = true;
        u uVar = this.f22492a.f4726c;
        if (uVar != null) {
            uVar.h5();
        }
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void C3(Bundle bundle) {
        u uVar;
        if (((Boolean) h2.y.c().b(ns.D8)).booleanValue() && !this.f22496e) {
            this.f22493b.requestWindowFeature(1);
        }
        boolean z7 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z7 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f22492a;
        if (adOverlayInfoParcel != null && !z7) {
            if (bundle == null) {
                h2.a aVar = adOverlayInfoParcel.f4725b;
                if (aVar != null) {
                    aVar.Z();
                }
                hc1 hc1Var = this.f22492a.f4744u;
                if (hc1Var != null) {
                    hc1Var.f0();
                }
                if (this.f22493b.getIntent() != null && this.f22493b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (uVar = this.f22492a.f4726c) != null) {
                    uVar.G5();
                }
            }
            Activity activity = this.f22493b;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f22492a;
            g2.t.j();
            i iVar = adOverlayInfoParcel2.f4724a;
            if (a.b(activity, iVar, adOverlayInfoParcel2.f4732i, iVar.f22505i)) {
                return;
            }
        }
        this.f22493b.finish();
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void D() {
        this.f22496e = true;
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void E() {
        if (this.f22493b.isFinishing()) {
            k();
        }
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void G() {
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void X1(int i8, int i9, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final boolean h0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void p0(g3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void r() {
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void w() {
        u uVar = this.f22492a.f4726c;
        if (uVar != null) {
            uVar.q3();
        }
        if (this.f22493b.isFinishing()) {
            k();
        }
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void x() {
        if (this.f22493b.isFinishing()) {
            k();
        }
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void x0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f22494c);
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void z() {
    }
}
