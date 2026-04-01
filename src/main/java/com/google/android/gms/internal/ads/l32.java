package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* JADX INFO: loaded from: classes.dex */
final class l32 implements ke1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wg0 f10443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x3.d f10444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wr2 f10445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fm0 f10446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ts2 f10447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final sz f10448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f10449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b22 f10450h;

    l32(wg0 wg0Var, x3.d dVar, wr2 wr2Var, fm0 fm0Var, ts2 ts2Var, boolean z7, sz szVar, b22 b22Var) {
        this.f10443a = wg0Var;
        this.f10444b = dVar;
        this.f10445c = wr2Var;
        this.f10446d = fm0Var;
        this.f10447e = ts2Var;
        this.f10449g = z7;
        this.f10448f = szVar;
        this.f10450h = b22Var;
    }

    @Override // com.google.android.gms.internal.ads.ke1
    public final void a(boolean z7, Context context, t41 t41Var) {
        int i8;
        uw0 uw0Var = (uw0) zf3.q(this.f10444b);
        this.f10446d.h1(true);
        boolean zE = this.f10449g ? this.f10448f.e(true) : true;
        boolean z8 = this.f10449g;
        g2.j jVar = new g2.j(zE, true, z8 ? this.f10448f.d() : false, z8 ? this.f10448f.a() : 0.0f, -1, z7, this.f10445c.Q, false);
        if (t41Var != null) {
            t41Var.n();
        }
        g2.t.k();
        zd1 zd1VarI = uw0Var.i();
        fm0 fm0Var = this.f10446d;
        int i9 = this.f10445c.S;
        if (i9 == -1) {
            h2.c5 c5Var = this.f10447e.f15308j;
            if (c5Var != null) {
                int i10 = c5Var.f22171a;
                if (i10 == 1) {
                    i8 = 7;
                } else if (i10 == 2) {
                    i8 = 6;
                }
            }
            qg0.b("Error setting app open orientation; no targeting orientation available.");
            i9 = this.f10445c.S;
            i8 = i9;
        } else {
            i8 = i9;
        }
        wg0 wg0Var = this.f10443a;
        wr2 wr2Var = this.f10445c;
        String str = wr2Var.D;
        cs2 cs2Var = wr2Var.f16905u;
        i2.t.a(context, new AdOverlayInfoParcel((h2.a) null, zd1VarI, (i2.f0) null, fm0Var, i8, wg0Var, str, jVar, cs2Var.f6466b, cs2Var.f6465a, this.f10447e.f15304f, t41Var, wr2Var.f16886k0 ? this.f10450h : null), true);
    }
}
