package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mi1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gn1 f11316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ul1 f11317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f11318c = null;

    public mi1(gn1 gn1Var, ul1 ul1Var) {
        this.f11316a = gn1Var;
        this.f11317b = ul1Var;
    }

    private static final int f(Context context, String str, int i8) {
        try {
            i8 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        h2.v.b();
        return jg0.B(context, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(final View view, final WindowManager windowManager) {
        fm0 fm0VarA = this.f11316a.a(h2.w4.n(), null, null);
        View view2 = (View) fm0VarA;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        fm0VarA.f1("/sendMessageToSdk", new qz() { // from class: com.google.android.gms.internal.ads.fi1
            @Override // com.google.android.gms.internal.ads.qz
            public final void a(Object obj, Map map) {
                this.f7765a.b((fm0) obj, map);
            }
        });
        fm0VarA.f1("/hideValidatorOverlay", new qz() { // from class: com.google.android.gms.internal.ads.gi1
            @Override // com.google.android.gms.internal.ads.qz
            public final void a(Object obj, Map map) {
                this.f8353a.c(windowManager, view, (fm0) obj, map);
            }
        });
        fm0VarA.f1("/open", new b00(null, null, null, null, null, null));
        this.f11317b.j(new WeakReference(fm0VarA), "/loadNativeAdPolicyViolations", new qz() { // from class: com.google.android.gms.internal.ads.hi1
            @Override // com.google.android.gms.internal.ads.qz
            public final void a(Object obj, Map map) {
                this.f8753a.e(view, windowManager, (fm0) obj, map);
            }
        });
        this.f11317b.j(new WeakReference(fm0VarA), "/showValidatorOverlay", new qz() { // from class: com.google.android.gms.internal.ads.ji1
            @Override // com.google.android.gms.internal.ads.qz
            public final void a(Object obj, Map map) {
                qg0.b("Show native ad policy validator overlay.");
                ((fm0) obj).T().setVisibility(0);
            }
        });
        return (View) fm0VarA;
    }

    final /* synthetic */ void b(fm0 fm0Var, Map map) {
        this.f11317b.g("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void c(WindowManager windowManager, View view, fm0 fm0Var, Map map) {
        qg0.b("Hide native ad policy validator overlay.");
        fm0Var.T().setVisibility(8);
        if (fm0Var.T().getWindowToken() != null) {
            windowManager.removeView(fm0Var.T());
        }
        fm0Var.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f11318c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.f11318c);
    }

    final /* synthetic */ void d(Map map, boolean z7, int i8, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.f11317b.g("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void e(final View view, final WindowManager windowManager, final fm0 fm0Var, final Map map) {
        fm0Var.H().y0(new rn0() { // from class: com.google.android.gms.internal.ads.li1
            @Override // com.google.android.gms.internal.ads.rn0
            public final void a(boolean z7, int i8, String str, String str2) {
                this.f10733a.d(map, z7, i8, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int iF = f(context, (String) map.get("validator_width"), ((Integer) h2.y.c().b(ns.Q7)).intValue());
        int iF2 = f(context, (String) map.get("validator_height"), ((Integer) h2.y.c().b(ns.R7)).intValue());
        int iF3 = f(context, (String) map.get("validator_x"), 0);
        int iF4 = f(context, (String) map.get("validator_y"), 0);
        fm0Var.H0(vn0.b(iF, iF2));
        try {
            fm0Var.X().getSettings().setUseWideViewPort(((Boolean) h2.y.c().b(ns.S7)).booleanValue());
            fm0Var.X().getSettings().setLoadWithOverviewMode(((Boolean) h2.y.c().b(ns.T7)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsB = j2.b1.b();
        layoutParamsB.x = iF3;
        layoutParamsB.y = iF4;
        windowManager.updateViewLayout(fm0Var.T(), layoutParamsB);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i8 = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - iF4;
            this.f11318c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.ki1
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        fm0 fm0Var2 = fm0Var;
                        if (fm0Var2.T().getWindowToken() == null) {
                            return;
                        }
                        int i9 = i8;
                        WindowManager.LayoutParams layoutParams = layoutParamsB;
                        String str2 = str;
                        layoutParams.y = (("1".equals(str2) || "2".equals(str2)) ? rect2.bottom : rect2.top) - i9;
                        windowManager.updateViewLayout(fm0Var2.T(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.f11318c);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        fm0Var.loadUrl(str2);
    }
}
