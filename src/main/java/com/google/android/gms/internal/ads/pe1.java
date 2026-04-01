package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class pe1 implements g41, pb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ae0 f12836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f12837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final se0 f12838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f12839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f12840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final fo f12841f;

    public pe1(ae0 ae0Var, Context context, se0 se0Var, View view, fo foVar) {
        this.f12836a = ae0Var;
        this.f12837b = context;
        this.f12838c = se0Var;
        this.f12839d = view;
        this.f12841f = foVar;
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void a(ob0 ob0Var, String str, String str2) {
        if (this.f12838c.z(this.f12837b)) {
            try {
                se0 se0Var = this.f12838c;
                Context context = this.f12837b;
                se0Var.t(context, se0Var.f(context), this.f12836a.a(), ob0Var.l(), ob0Var.k());
            } catch (RemoteException e8) {
                qg0.h("Remote Exception to get reward item.", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void j() {
        this.f12836a.b(false);
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void k() {
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void l() {
        View view = this.f12839d;
        if (view != null && this.f12840e != null) {
            this.f12838c.x(view.getContext(), this.f12840e);
        }
        this.f12836a.b(true);
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void m() {
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final void n() {
    }

    @Override // com.google.android.gms.internal.ads.pb1
    public final void s() {
    }

    @Override // com.google.android.gms.internal.ads.pb1
    public final void u() {
        if (this.f12841f == fo.APP_OPEN) {
            return;
        }
        String strI = this.f12838c.i(this.f12837b);
        this.f12840e = strI;
        this.f12840e = String.valueOf(strI).concat(this.f12841f == fo.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }
}
