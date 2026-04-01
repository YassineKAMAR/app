package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class rh1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final ImageView.ScaleType f14121k = ImageView.ScaleType.CENTER_INSIDE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j2.x1 f14122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts2 f14123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vg1 f14124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qg1 f14125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final di1 f14126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final mi1 f14127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f14128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Executor f14129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final lv f14130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ng1 f14131j;

    public rh1(j2.x1 x1Var, ts2 ts2Var, vg1 vg1Var, qg1 qg1Var, di1 di1Var, mi1 mi1Var, Executor executor, Executor executor2, ng1 ng1Var) {
        this.f14122a = x1Var;
        this.f14123b = ts2Var;
        this.f14130i = ts2Var.f15307i;
        this.f14124c = vg1Var;
        this.f14125d = qg1Var;
        this.f14126e = di1Var;
        this.f14127f = mi1Var;
        this.f14128g = executor;
        this.f14129h = executor2;
        this.f14131j = ng1Var;
    }

    private static void h(RelativeLayout.LayoutParams layoutParams, int i8) {
        if (i8 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i8 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i8 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean i(ViewGroup viewGroup, boolean z7) {
        View viewS = z7 ? this.f14125d.S() : this.f14125d.T();
        if (viewS == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewS.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewS.getParent()).removeView(viewS);
        }
        viewGroup.addView(viewS, ((Boolean) h2.y.c().b(ns.G3)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void a(ViewGroup viewGroup) {
        qg1 qg1Var = this.f14125d;
        if (qg1Var.S() != null) {
            boolean z7 = viewGroup != null;
            if (qg1Var.P() == 2 || qg1Var.P() == 1) {
                this.f14122a.O(this.f14123b.f15304f, String.valueOf(qg1Var.P()), z7);
            } else if (qg1Var.P() == 6) {
                this.f14122a.O(this.f14123b.f15304f, "2", z7);
                this.f14122a.O(this.f14123b.f15304f, "1", z7);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void b(com.google.android.gms.internal.ads.oi1 r10) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rh1.b(com.google.android.gms.internal.ads.oi1):void");
    }

    public final void c(oi1 oi1Var) {
        if (oi1Var == null || this.f14126e == null || oi1Var.o() == null || !this.f14124c.g()) {
            return;
        }
        try {
            oi1Var.o().addView(this.f14126e.a());
        } catch (qm0 e8) {
            j2.v1.l("web view can not be obtained", e8);
        }
    }

    public final void d(oi1 oi1Var) {
        if (oi1Var == null) {
            return;
        }
        Context context = oi1Var.n().getContext();
        if (j2.b1.h(context, this.f14124c.f16259a)) {
            if (!(context instanceof Activity)) {
                qg0.b("Activity context is needed for policy validator.");
                return;
            }
            if (this.f14127f == null || oi1Var.o() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.f14127f.a(oi1Var.o(), windowManager), j2.b1.b());
            } catch (qm0 e8) {
                j2.v1.l("web view can not be obtained", e8);
            }
        }
    }

    public final void e(final oi1 oi1Var) {
        this.f14128g.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ph1
            @Override // java.lang.Runnable
            public final void run() {
                this.f12873a.b(oi1Var);
            }
        });
    }

    public final boolean f(ViewGroup viewGroup) {
        return i(viewGroup, false);
    }

    public final boolean g(ViewGroup viewGroup) {
        return i(viewGroup, true);
    }
}
