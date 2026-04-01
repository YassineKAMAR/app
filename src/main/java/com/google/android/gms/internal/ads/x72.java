package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* JADX INFO: loaded from: classes.dex */
final class x72 implements ke1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gn1 f17087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ts2 f17088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wg0 f17089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wr2 f17090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x3.d f17091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fm0 f17092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final sz f17093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f17094i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b22 f17095j;

    x72(Context context, gn1 gn1Var, ts2 ts2Var, wg0 wg0Var, wr2 wr2Var, x3.d dVar, fm0 fm0Var, sz szVar, boolean z7, b22 b22Var) {
        this.f17086a = context;
        this.f17087b = gn1Var;
        this.f17088c = ts2Var;
        this.f17089d = wg0Var;
        this.f17090e = wr2Var;
        this.f17091f = dVar;
        this.f17092g = fm0Var;
        this.f17093h = szVar;
        this.f17094i = z7;
        this.f17095j = b22Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ke1
    public final void a(boolean z7, Context context, t41 t41Var) {
        fm0 fm0Var;
        km1 km1Var = (km1) zf3.q(this.f17091f);
        try {
            wr2 wr2Var = this.f17090e;
            if (this.f17092g.c1()) {
                if (((Boolean) h2.y.c().b(ns.L0)).booleanValue()) {
                    final fm0 fm0VarA = this.f17087b.a(this.f17088c.f15303e, null, null);
                    i00.b(fm0VarA, km1Var.i());
                    final kn1 kn1Var = new kn1();
                    kn1Var.a(this.f17086a, (View) fm0VarA);
                    km1Var.l().i(fm0VarA, true, this.f17094i ? this.f17093h : null);
                    fm0VarA.H().y0(new rn0() { // from class: com.google.android.gms.internal.ads.v72
                        @Override // com.google.android.gms.internal.ads.rn0
                        public final void a(boolean z8, int i8, String str, String str2) {
                            kn1Var.b();
                            fm0 fm0Var2 = fm0VarA;
                            fm0Var2.E0();
                            fm0Var2.H().z();
                        }
                    });
                    fm0VarA.H().F(new sn0() { // from class: com.google.android.gms.internal.ads.w72
                        @Override // com.google.android.gms.internal.ads.sn0
                        public final void j() {
                            fm0VarA.l0();
                        }
                    });
                    cs2 cs2Var = wr2Var.f16905u;
                    fm0VarA.g1(cs2Var.f6466b, cs2Var.f6465a, null);
                    fm0Var = fm0VarA;
                } else {
                    fm0Var = this.f17092g;
                }
            } else {
                fm0Var = this.f17092g;
            }
            fm0Var.h1(true);
            boolean zE = this.f17094i ? this.f17093h.e(false) : false;
            g2.t.r();
            Context context2 = this.f17086a;
            boolean z8 = this.f17094i;
            boolean zH = j2.k2.h(context2);
            boolean zD = z8 ? this.f17093h.d() : false;
            float fA = this.f17094i ? this.f17093h.a() : 0.0f;
            wr2 wr2Var2 = this.f17090e;
            g2.j jVar = new g2.j(zE, zH, zD, fA, -1, z7, wr2Var2.Q, wr2Var2.R);
            if (t41Var != null) {
                t41Var.n();
            }
            g2.t.k();
            zd1 zd1VarJ = km1Var.j();
            wr2 wr2Var3 = this.f17090e;
            wg0 wg0Var = this.f17089d;
            int i8 = wr2Var3.S;
            String str = wr2Var3.D;
            cs2 cs2Var2 = wr2Var3.f16905u;
            String str2 = cs2Var2.f6466b;
            String str3 = cs2Var2.f6465a;
            ts2 ts2Var = this.f17088c;
            i2.t.a(context, new AdOverlayInfoParcel((h2.a) null, zd1VarJ, (i2.f0) null, fm0Var, i8, wg0Var, str, jVar, str2, str3, ts2Var.f15304f, t41Var, wr2Var3.f16886k0 ? this.f17095j : null), true);
        } catch (qm0 e8) {
            qg0.e("", e8);
        }
    }
}
