package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class uk1 extends t10 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, hv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f15716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h2.p2 f15717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private lg1 f15718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15719d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15720e = false;

    public uk1(lg1 lg1Var, qg1 qg1Var) {
        this.f15716a = qg1Var.S();
        this.f15717b = qg1Var.W();
        this.f15718c = lg1Var;
        if (qg1Var.f0() != null) {
            qg1Var.f0().L0(this);
        }
    }

    private static final void O5(x10 x10Var, int i8) {
        try {
            x10Var.g(i8);
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    private final void o() {
        View view = this.f15716a;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f15716a);
        }
    }

    private final void q() {
        View view;
        lg1 lg1Var = this.f15718c;
        if (lg1Var == null || (view = this.f15716a) == null) {
            return;
        }
        lg1Var.d0(view, Collections.emptyMap(), Collections.emptyMap(), lg1.C(this.f15716a));
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void Q4(g3.a aVar, x10 x10Var) {
        a3.o.e("#008 Must be called on the main UI thread.");
        if (this.f15719d) {
            qg0.d("Instream ad can not be shown after destroy().");
            O5(x10Var, 2);
            return;
        }
        View view = this.f15716a;
        if (view == null || this.f15717b == null) {
            qg0.d("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            O5(x10Var, 0);
            return;
        }
        if (this.f15720e) {
            qg0.d("Instream ad should not be used again.");
            O5(x10Var, 1);
            return;
        }
        this.f15720e = true;
        o();
        ((ViewGroup) g3.b.H0(aVar)).addView(this.f15716a, new ViewGroup.LayoutParams(-1, -1));
        g2.t.z();
        rh0.a(this.f15716a, this);
        g2.t.z();
        rh0.b(this.f15716a, this);
        q();
        try {
            x10Var.n();
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final h2.p2 k() {
        a3.o.e("#008 Must be called on the main UI thread.");
        if (!this.f15719d) {
            return this.f15717b;
        }
        qg0.d("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final tv l() {
        a3.o.e("#008 Must be called on the main UI thread.");
        if (this.f15719d) {
            qg0.d("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        lg1 lg1Var = this.f15718c;
        if (lg1Var == null || lg1Var.M() == null) {
            return null;
        }
        return lg1Var.M().a();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        q();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        q();
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void p() {
        a3.o.e("#008 Must be called on the main UI thread.");
        o();
        lg1 lg1Var = this.f15718c;
        if (lg1Var != null) {
            lg1Var.a();
        }
        this.f15718c = null;
        this.f15716a = null;
        this.f15717b = null;
        this.f15719d = true;
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zze(g3.a aVar) {
        a3.o.e("#008 Must be called on the main UI thread.");
        Q4(aVar, new tk1(this));
    }
}
