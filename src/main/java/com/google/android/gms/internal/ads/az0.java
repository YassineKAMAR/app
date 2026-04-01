package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class az0 implements v51, b51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fm0 f5530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wr2 f5531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wg0 f5532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private qz2 f5533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5534f;

    public az0(Context context, fm0 fm0Var, wr2 wr2Var, wg0 wg0Var) {
        this.f5529a = context;
        this.f5530b = fm0Var;
        this.f5531c = wr2Var;
        this.f5532d = wg0Var;
    }

    private final synchronized void a() {
        s22 s22Var;
        r22 r22Var;
        if (this.f5531c.V) {
            if (this.f5530b == null) {
                return;
            }
            if (g2.t.a().c(this.f5529a)) {
                wg0 wg0Var = this.f5532d;
                String str = wg0Var.f16724b + "." + wg0Var.f16725c;
                ws2 ws2Var = this.f5531c.X;
                String strA = ws2Var.a();
                if (ws2Var.b() == 1) {
                    r22Var = r22.VIDEO;
                    s22Var = s22.DEFINED_BY_JAVASCRIPT;
                } else {
                    wr2 wr2Var = this.f5531c;
                    r22 r22Var2 = r22.HTML_DISPLAY;
                    s22Var = wr2Var.f16875f == 1 ? s22.ONE_PIXEL : s22.BEGIN_TO_RENDER;
                    r22Var = r22Var2;
                }
                qz2 qz2VarD = g2.t.a().d(str, this.f5530b.X(), "", "javascript", strA, s22Var, r22Var, this.f5531c.f16892n0);
                this.f5533e = qz2VarD;
                Object obj = this.f5530b;
                if (qz2VarD != null) {
                    g2.t.a().f(this.f5533e, (View) obj);
                    this.f5530b.Y0(this.f5533e);
                    g2.t.a().b(this.f5533e);
                    this.f5534f = true;
                    this.f5530b.U("onSdkLoaded", new p.a());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.v51
    public final synchronized void B() {
        if (this.f5534f) {
            return;
        }
        a();
    }

    @Override // com.google.android.gms.internal.ads.b51
    public final synchronized void z() {
        fm0 fm0Var;
        if (!this.f5534f) {
            a();
        }
        if (!this.f5531c.V || this.f5533e == null || (fm0Var = this.f5530b) == null) {
            return;
        }
        fm0Var.U("onSdkImpression", new p.a());
    }
}
