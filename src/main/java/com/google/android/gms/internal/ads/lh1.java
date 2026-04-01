package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class lh1 extends ew implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, oi1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f10717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f10718b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f10719c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f10720d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private lg1 f10721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private uk f10722f;

    public lh1(View view, HashMap map, HashMap map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        g2.t.z();
        rh0.a(view, this);
        g2.t.z();
        rh0.b(view, this);
        this.f10717a = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.f10718b.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f10720d.putAll(this.f10718b);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.f10719c.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f10720d.putAll(this.f10719c);
        this.f10722f = new uk(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final synchronized void H0(String str, View view, boolean z7) {
        this.f10720d.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f10718b.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final synchronized View g0(String str) {
        WeakReference weakReference = (WeakReference) this.f10720d.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final View n() {
        return (View) this.f10717a.get();
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final FrameLayout o() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.fw
    public final synchronized void o0(g3.a aVar) {
        if (this.f10721e != null) {
            Object objH0 = g3.b.H0(aVar);
            if (!(objH0 instanceof View)) {
                qg0.g("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.f10721e.r((View) objH0);
        }
    }

    @Override // com.google.android.gms.internal.ads.fw
    public final synchronized void o2(g3.a aVar) {
        Object objH0 = g3.b.H0(aVar);
        if (!(objH0 instanceof lg1)) {
            qg0.g("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        lg1 lg1Var = this.f10721e;
        if (lg1Var != null) {
            lg1Var.x(this);
        }
        lg1 lg1Var2 = (lg1) objH0;
        if (!lg1Var2.y()) {
            qg0.d("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.f10721e = lg1Var2;
        lg1Var2.w(this);
        this.f10721e.o(n());
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        lg1 lg1Var = this.f10721e;
        if (lg1Var != null) {
            lg1Var.i(view, n(), u(), x(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        lg1 lg1Var = this.f10721e;
        if (lg1Var != null) {
            lg1Var.d0(n(), u(), x(), lg1.C(n()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        lg1 lg1Var = this.f10721e;
        if (lg1Var != null) {
            lg1Var.d0(n(), u(), x(), lg1.C(n()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        lg1 lg1Var = this.f10721e;
        if (lg1Var != null) {
            lg1Var.p(view, motionEvent, n());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.fw
    public final synchronized void p() {
        lg1 lg1Var = this.f10721e;
        if (lg1Var != null) {
            lg1Var.x(this);
            this.f10721e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final uk r() {
        return this.f10722f;
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final synchronized String s() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final synchronized g3.a t() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final synchronized Map u() {
        return this.f10720d;
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final synchronized Map v() {
        return this.f10719c;
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final synchronized JSONObject w() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final synchronized Map x() {
        return this.f10718b;
    }

    @Override // com.google.android.gms.internal.ads.oi1
    public final synchronized JSONObject y() {
        lg1 lg1Var = this.f10721e;
        if (lg1Var == null) {
            return null;
        }
        return lg1Var.T(n(), u(), x());
    }
}
