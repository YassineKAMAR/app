package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class le1 implements v51, i2.u, b51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fm0 f10645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wr2 f10646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wg0 f10647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final fo f10648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    qz2 f10649f;

    public le1(Context context, fm0 fm0Var, wr2 wr2Var, wg0 wg0Var, fo foVar) {
        this.f10644a = context;
        this.f10645b = fm0Var;
        this.f10646c = wr2Var;
        this.f10647d = wg0Var;
        this.f10648e = foVar;
    }

    @Override // com.google.android.gms.internal.ads.v51
    public final void B() {
        s22 s22Var;
        r22 r22Var;
        fo foVar = this.f10648e;
        if ((foVar == fo.REWARD_BASED_VIDEO_AD || foVar == fo.INTERSTITIAL || foVar == fo.APP_OPEN) && this.f10646c.V && this.f10645b != null) {
            if (g2.t.a().c(this.f10644a)) {
                wg0 wg0Var = this.f10647d;
                String str = wg0Var.f16724b + "." + wg0Var.f16725c;
                ws2 ws2Var = this.f10646c.X;
                String strA = ws2Var.a();
                if (ws2Var.b() == 1) {
                    r22Var = r22.VIDEO;
                    s22Var = s22.DEFINED_BY_JAVASCRIPT;
                } else {
                    s22Var = this.f10646c.f16866a0 == 2 ? s22.UNSPECIFIED : s22.BEGIN_TO_RENDER;
                    r22Var = r22.HTML_DISPLAY;
                }
                qz2 qz2VarD = g2.t.a().d(str, this.f10645b.X(), "", "javascript", strA, s22Var, r22Var, this.f10646c.f16892n0);
                this.f10649f = qz2VarD;
                if (qz2VarD != null) {
                    g2.t.a().f(this.f10649f, (View) this.f10645b);
                    this.f10645b.Y0(this.f10649f);
                    g2.t.a().b(this.f10649f);
                    this.f10645b.U("onSdkLoaded", new p.a());
                }
            }
        }
    }

    @Override // i2.u
    public final void G5() {
        if (this.f10649f == null || this.f10645b == null) {
            return;
        }
        if (((Boolean) h2.y.c().b(ns.X4)).booleanValue()) {
            return;
        }
        this.f10645b.U("onSdkImpression", new p.a());
    }

    @Override // i2.u
    public final void h5() {
    }

    @Override // i2.u
    public final void k0() {
    }

    @Override // i2.u
    public final void q3() {
    }

    @Override // i2.u
    public final void v0(int i8) {
        this.f10649f = null;
    }

    @Override // i2.u
    public final void y4() {
    }

    @Override // com.google.android.gms.internal.ads.b51
    public final void z() {
        if (this.f10649f == null || this.f10645b == null) {
            return;
        }
        if (((Boolean) h2.y.c().b(ns.X4)).booleanValue()) {
            this.f10645b.U("onSdkImpression", new p.a());
        }
    }
}
