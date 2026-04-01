package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class jr2 implements mb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f9764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bo0 f9765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yq2 f9766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lp2 f9767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ls2 f9768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ty2 f9769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final rs2 f9770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private x3.d f9771i;

    public jr2(Context context, Executor executor, bo0 bo0Var, lp2 lp2Var, yq2 yq2Var, rs2 rs2Var, ls2 ls2Var) {
        this.f9763a = context;
        this.f9764b = executor;
        this.f9765c = bo0Var;
        this.f9767e = lp2Var;
        this.f9766d = yq2Var;
        this.f9770h = rs2Var;
        this.f9768f = ls2Var;
        this.f9769g = bo0Var.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final om1 k(jp2 jp2Var) {
        om1 om1VarN = this.f9765c.n();
        n31 n31Var = new n31();
        n31Var.e(this.f9763a);
        n31Var.i(((ir2) jp2Var).f9326a);
        n31Var.h(this.f9768f);
        om1VarN.a(n31Var.j());
        om1VarN.d(new ca1().q());
        return om1VarN;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    @Override // com.google.android.gms.internal.ads.mb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(h2.r4 r10, java.lang.String r11, com.google.android.gms.internal.ads.jb2 r12, com.google.android.gms.internal.ads.kb2 r13) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jr2.a(h2.r4, java.lang.String, com.google.android.gms.internal.ads.jb2, com.google.android.gms.internal.ads.kb2):boolean");
    }

    final /* synthetic */ void h() {
        this.f9766d.A(vt2.d(6, null, null));
    }

    final void i(int i8) {
        this.f9770h.F().a(i8);
    }

    @Override // com.google.android.gms.internal.ads.mb2
    public final boolean j() {
        throw null;
    }
}
