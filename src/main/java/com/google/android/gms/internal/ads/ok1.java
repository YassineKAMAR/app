package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ok1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f12515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pw0 f12516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ac1 f12517c;

    ok1(Executor executor, pw0 pw0Var, ac1 ac1Var) {
        this.f12515a = executor;
        this.f12517c = ac1Var;
        this.f12516b = pw0Var;
    }

    public final void a(final fm0 fm0Var) {
        if (fm0Var == null) {
            return;
        }
        this.f12517c.A0(fm0Var.T());
        this.f12517c.w0(new tk() { // from class: com.google.android.gms.internal.ads.jk1
            @Override // com.google.android.gms.internal.ads.tk
            public final void b0(sk skVar) {
                tn0 tn0VarH = fm0Var.H();
                Rect rect = skVar.f14723d;
                tn0VarH.s0(rect.left, rect.top, false);
            }
        }, this.f12515a);
        this.f12517c.w0(new tk() { // from class: com.google.android.gms.internal.ads.lk1
            @Override // com.google.android.gms.internal.ads.tk
            public final void b0(sk skVar) {
                HashMap map = new HashMap();
                map.put("isVisible", true != skVar.f14729j ? "0" : "1");
                fm0Var.U("onAdVisibilityChanged", map);
            }
        }, this.f12515a);
        this.f12517c.w0(this.f12516b, this.f12515a);
        this.f12516b.j(fm0Var);
        fm0Var.f1("/trackActiveViewUnit", new qz() { // from class: com.google.android.gms.internal.ads.mk1
            @Override // com.google.android.gms.internal.ads.qz
            public final void a(Object obj, Map map) {
                this.f11350a.b((fm0) obj, map);
            }
        });
        fm0Var.f1("/untrackActiveViewUnit", new qz() { // from class: com.google.android.gms.internal.ads.nk1
            @Override // com.google.android.gms.internal.ads.qz
            public final void a(Object obj, Map map) {
                this.f11907a.c((fm0) obj, map);
            }
        });
    }

    final /* synthetic */ void b(fm0 fm0Var, Map map) {
        this.f12516b.b();
    }

    final /* synthetic */ void c(fm0 fm0Var, Map map) {
        this.f12516b.a();
    }
}
