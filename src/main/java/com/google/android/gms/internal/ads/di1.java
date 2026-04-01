package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class di1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gn1 f6764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ul1 f6765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pw0 f6766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yg1 f6767d;

    public di1(gn1 gn1Var, ul1 ul1Var, pw0 pw0Var, yg1 yg1Var) {
        this.f6764a = gn1Var;
        this.f6765b = ul1Var;
        this.f6766c = pw0Var;
        this.f6767d = yg1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a() {
        fm0 fm0VarA = this.f6764a.a(h2.w4.n(), null, null);
        ((View) fm0VarA).setVisibility(8);
        fm0VarA.f1("/sendMessageToSdk", new qz() { // from class: com.google.android.gms.internal.ads.yh1
            @Override // com.google.android.gms.internal.ads.qz
            public final void a(Object obj, Map map) {
                this.f17767a.b((fm0) obj, map);
            }
        });
        fm0VarA.f1("/adMuted", new qz() { // from class: com.google.android.gms.internal.ads.zh1
            @Override // com.google.android.gms.internal.ads.qz
            public final void a(Object obj, Map map) {
                this.f18236a.c((fm0) obj, map);
            }
        });
        this.f6765b.j(new WeakReference(fm0VarA), "/loadHtml", new qz() { // from class: com.google.android.gms.internal.ads.ai1
            @Override // com.google.android.gms.internal.ads.qz
            public final void a(Object obj, final Map map) {
                fm0 fm0Var = (fm0) obj;
                tn0 tn0VarH = fm0Var.H();
                final di1 di1Var = this.f5276a;
                tn0VarH.y0(new rn0() { // from class: com.google.android.gms.internal.ads.xh1
                    @Override // com.google.android.gms.internal.ads.rn0
                    public final void a(boolean z7, int i8, String str, String str2) {
                        di1Var.d(map, z7, i8, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    fm0Var.loadData(str, "text/html", "UTF-8");
                } else {
                    fm0Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.f6765b.j(new WeakReference(fm0VarA), "/showOverlay", new qz() { // from class: com.google.android.gms.internal.ads.bi1
            @Override // com.google.android.gms.internal.ads.qz
            public final void a(Object obj, Map map) {
                this.f5804a.e((fm0) obj, map);
            }
        });
        this.f6765b.j(new WeakReference(fm0VarA), "/hideOverlay", new qz() { // from class: com.google.android.gms.internal.ads.ci1
            @Override // com.google.android.gms.internal.ads.qz
            public final void a(Object obj, Map map) {
                this.f6355a.f((fm0) obj, map);
            }
        });
        return (View) fm0VarA;
    }

    final /* synthetic */ void b(fm0 fm0Var, Map map) {
        this.f6765b.g("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void c(fm0 fm0Var, Map map) {
        this.f6767d.q();
    }

    final /* synthetic */ void d(Map map, boolean z7, int i8, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.f6765b.g("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void e(fm0 fm0Var, Map map) {
        qg0.f("Showing native ads overlay.");
        fm0Var.T().setVisibility(0);
        this.f6766c.h(true);
    }

    final /* synthetic */ void f(fm0 fm0Var, Map map) {
        qg0.f("Hiding native ads overlay.");
        fm0Var.T().setVisibility(8);
        this.f6766c.h(false);
    }
}
