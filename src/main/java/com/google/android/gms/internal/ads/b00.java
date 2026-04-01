package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b00 implements qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g2.b f5536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final eq1 f5537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mx2 f5538c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u70 f5540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q12 f5541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final gv0 f5542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i2.d0 f5543h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final lg3 f5544i = eh0.f7327f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vg0 f5539d = new vg0(null);

    public b00(g2.b bVar, u70 u70Var, q12 q12Var, eq1 eq1Var, mx2 mx2Var, gv0 gv0Var) {
        this.f5536a = bVar;
        this.f5540e = u70Var;
        this.f5541f = q12Var;
        this.f5537b = eq1Var;
        this.f5538c = mx2Var;
        this.f5542g = gv0Var;
    }

    public static int b(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri c(Context context, gh ghVar, Uri uri, View view, Activity activity) {
        if (ghVar == null) {
            return uri;
        }
        try {
            return ghVar.e(uri) ? ghVar.a(uri, context, view, activity) : uri;
        } catch (hh unused) {
            return uri;
        } catch (Exception e8) {
            g2.t.q().u(e8, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e8) {
            qg0.e("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e8);
        }
        return uri;
    }

    public static boolean f(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.String r27, h2.a r28, java.util.Map r29, java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 1055
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b00.h(java.lang.String, h2.a, java.util.Map, java.lang.String):void");
    }

    private final void i(Context context, String str, String str2) {
        this.f5541f.d(str);
        eq1 eq1Var = this.f5537b;
        if (eq1Var != null) {
            b22.P5(context, eq1Var, this.f5538c, this.f5541f, str, "dialog_not_shown", mb3.f("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x011f, code lost:
    
        r11 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j(h2.a r18, java.util.Map r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b00.j(h2.a, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    private final void k(boolean z7) {
        u70 u70Var = this.f5540e;
        if (u70Var != null) {
            u70Var.h(z7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (((java.lang.Boolean) h2.y.c().b(android.os.Build.VERSION.SDK_INT < 33 ? com.google.android.gms.internal.ads.ns.j8 : com.google.android.gms.internal.ads.ns.i8)).booleanValue() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean l(h2.a r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b00.l(h2.a, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(int i8) {
        if (this.f5537b == null) {
            return;
        }
        if (!((Boolean) h2.y.c().b(ns.r8)).booleanValue()) {
            dq1 dq1VarA = this.f5537b.a();
            dq1VarA.b("action", "cct_action");
            dq1VarA.b("cct_open_status", pt.a(i8));
            dq1VarA.g();
            return;
        }
        mx2 mx2Var = this.f5538c;
        String strA = pt.a(i8);
        lx2 lx2VarB = lx2.b("cct_action");
        lx2VarB.a("cct_open_status", strA);
        mx2Var.a(lx2VarB);
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        gv0 gv0Var;
        h2.a aVar = (h2.a) obj;
        String strC = ve0.c((String) map.get("u"), ((fm0) aVar).getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            qg0.g("Action missing from an open GMSG.");
            return;
        }
        g2.b bVar = this.f5536a;
        if (bVar == null || bVar.c()) {
            zf3.r((!((Boolean) h2.y.c().b(ns.u9)).booleanValue() || (gv0Var = this.f5542g) == null) ? zf3.h(strC) : gv0Var.c(strC, h2.v.e()), new xz(this, aVar, map, str), this.f5544i);
        } else {
            bVar.b(strC);
        }
    }
}
