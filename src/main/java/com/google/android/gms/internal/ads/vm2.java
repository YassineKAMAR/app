package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class vm2 implements mb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f16357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final bo0 f16358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final on2 f16359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lp2 f16360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wg0 f16361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewGroup f16362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ty2 f16363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final rs2 f16364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private x3.d f16365j;

    protected vm2(Context context, Executor executor, bo0 bo0Var, lp2 lp2Var, on2 on2Var, rs2 rs2Var, wg0 wg0Var) {
        this.f16356a = context;
        this.f16357b = executor;
        this.f16358c = bo0Var;
        this.f16360e = lp2Var;
        this.f16359d = on2Var;
        this.f16364i = rs2Var;
        this.f16361f = wg0Var;
        this.f16362g = new FrameLayout(context);
        this.f16363h = bo0Var.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized l31 m(jp2 jp2Var) {
        um2 um2Var = (um2) jp2Var;
        if (((Boolean) h2.y.c().b(ns.V7)).booleanValue()) {
            gx0 gx0Var = new gx0(this.f16362g);
            n31 n31Var = new n31();
            n31Var.e(this.f16356a);
            n31Var.i(um2Var.f15775a);
            p31 p31VarJ = n31Var.j();
            ca1 ca1Var = new ca1();
            ca1Var.f(this.f16359d, this.f16357b);
            ca1Var.o(this.f16359d, this.f16357b);
            return d(gx0Var, p31VarJ, ca1Var.q());
        }
        on2 on2VarA = on2.a(this.f16359d);
        ca1 ca1Var2 = new ca1();
        ca1Var2.e(on2VarA, this.f16357b);
        ca1Var2.j(on2VarA, this.f16357b);
        ca1Var2.k(on2VarA, this.f16357b);
        ca1Var2.l(on2VarA, this.f16357b);
        ca1Var2.f(on2VarA, this.f16357b);
        ca1Var2.o(on2VarA, this.f16357b);
        ca1Var2.p(on2VarA);
        gx0 gx0Var2 = new gx0(this.f16362g);
        n31 n31Var2 = new n31();
        n31Var2.e(this.f16356a);
        n31Var2.i(um2Var.f15775a);
        return d(gx0Var2, n31Var2.j(), ca1Var2.q());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.google.android.gms.internal.ads.mb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a(h2.r4 r8, java.lang.String r9, com.google.android.gms.internal.ads.jb2 r10, com.google.android.gms.internal.ads.kb2 r11) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vm2.a(h2.r4, java.lang.String, com.google.android.gms.internal.ads.jb2, com.google.android.gms.internal.ads.kb2):boolean");
    }

    protected abstract l31 d(gx0 gx0Var, p31 p31Var, ea1 ea1Var);

    @Override // com.google.android.gms.internal.ads.mb2
    public final boolean j() {
        x3.d dVar = this.f16365j;
        return (dVar == null || dVar.isDone()) ? false : true;
    }

    final /* synthetic */ void k() {
        this.f16359d.A(vt2.d(6, null, null));
    }

    public final void l(h2.c5 c5Var) {
        this.f16364i.K(c5Var);
    }
}
