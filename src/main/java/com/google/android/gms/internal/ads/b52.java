package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* JADX INFO: loaded from: classes.dex */
final class b52 implements ke1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wg0 f5610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x3.d f5611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wr2 f5612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final fm0 f5613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ts2 f5614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final sz f5615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f5616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b22 f5617i;

    b52(Context context, wg0 wg0Var, x3.d dVar, wr2 wr2Var, fm0 fm0Var, ts2 ts2Var, boolean z7, sz szVar, b22 b22Var) {
        this.f5609a = context;
        this.f5610b = wg0Var;
        this.f5611c = dVar;
        this.f5612d = wr2Var;
        this.f5613e = fm0Var;
        this.f5614f = ts2Var;
        this.f5615g = szVar;
        this.f5616h = z7;
        this.f5617i = b22Var;
    }

    @Override // com.google.android.gms.internal.ads.ke1
    public final void a(boolean z7, Context context, t41 t41Var) {
        bd1 bd1Var = (bd1) zf3.q(this.f5611c);
        this.f5613e.h1(true);
        boolean zE = this.f5616h ? this.f5615g.e(false) : false;
        g2.t.r();
        Context context2 = this.f5609a;
        boolean z8 = this.f5616h;
        g2.j jVar = new g2.j(zE, j2.k2.h(context2), z8 ? this.f5615g.d() : false, this.f5616h ? this.f5615g.a() : 0.0f, -1, z7, this.f5612d.Q, false);
        if (t41Var != null) {
            t41Var.n();
        }
        g2.t.k();
        zd1 zd1VarJ = bd1Var.j();
        fm0 fm0Var = this.f5613e;
        wr2 wr2Var = this.f5612d;
        wg0 wg0Var = this.f5610b;
        int i8 = wr2Var.S;
        String str = wr2Var.D;
        cs2 cs2Var = wr2Var.f16905u;
        i2.t.a(context, new AdOverlayInfoParcel((h2.a) null, zd1VarJ, (i2.f0) null, fm0Var, i8, wg0Var, str, jVar, cs2Var.f6466b, cs2Var.f6465a, this.f5614f.f15304f, t41Var, wr2Var.f16886k0 ? this.f5617i : null), true);
    }
}
