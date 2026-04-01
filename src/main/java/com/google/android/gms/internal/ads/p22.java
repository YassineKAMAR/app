package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class p22 implements q22 {
    static /* synthetic */ qz2 i(String str, String str2, String str3, r22 r22Var, String str4, WebView webView, String str5, String str6, s22 s22Var) {
        String strValueOf;
        String str7;
        String strConcat;
        a03 a03VarA = a03.a("Google", str2);
        zz2 zz2VarM = m("javascript");
        vz2 vz2VarK = k(r22Var.toString());
        zz2 zz2Var = zz2.NONE;
        if (zz2VarM == zz2Var) {
            strConcat = "Omid html session error; Unable to parse impression owner: javascript";
        } else {
            if (vz2VarK == null) {
                strValueOf = String.valueOf(r22Var);
                str7 = "Omid html session error; Unable to parse creative type: ";
            } else {
                zz2 zz2VarM2 = m(str4);
                if (vz2VarK != vz2.VIDEO || zz2VarM2 != zz2Var) {
                    return qz2.a(rz2.a(vz2VarK, l(s22Var.toString()), zz2VarM, zz2VarM2, true), sz2.b(a03VarA, webView, str5, ""));
                }
                strValueOf = String.valueOf(str4);
                str7 = "Omid html session error; Video events owner unknown for video creative: ";
            }
            strConcat = str7.concat(strValueOf);
        }
        qg0.g(strConcat);
        return null;
    }

    static /* synthetic */ qz2 j(String str, String str2, String str3, String str4, r22 r22Var, WebView webView, String str5, String str6, s22 s22Var) {
        String strValueOf;
        String str7;
        String strConcat;
        a03 a03VarA = a03.a(str, str2);
        zz2 zz2VarM = m("javascript");
        zz2 zz2VarM2 = m(str4);
        vz2 vz2VarK = k(r22Var.toString());
        zz2 zz2Var = zz2.NONE;
        if (zz2VarM == zz2Var) {
            strConcat = "Omid js session error; Unable to parse impression owner: javascript";
        } else {
            if (vz2VarK == null) {
                strValueOf = String.valueOf(r22Var);
                str7 = "Omid js session error; Unable to parse creative type: ";
            } else {
                if (vz2VarK != vz2.VIDEO || zz2VarM2 != zz2Var) {
                    return qz2.a(rz2.a(vz2VarK, l(s22Var.toString()), zz2VarM, zz2VarM2, true), sz2.c(a03VarA, webView, str5, ""));
                }
                strValueOf = String.valueOf(str4);
                str7 = "Omid js session error; Video events owner unknown for video creative: ";
            }
            strConcat = str7.concat(strValueOf);
        }
        qg0.g(strConcat);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.vz2 k(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L20
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 1
            goto L35
        L20:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 2
            goto L35
        L2a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L43
            if (r4 == r3) goto L40
            if (r4 == r2) goto L3d
            r4 = 0
            return r4
        L3d:
            com.google.android.gms.internal.ads.vz2 r4 = com.google.android.gms.internal.ads.vz2.VIDEO
            return r4
        L40:
            com.google.android.gms.internal.ads.vz2 r4 = com.google.android.gms.internal.ads.vz2.NATIVE_DISPLAY
            return r4
        L43:
            com.google.android.gms.internal.ads.vz2 r4 = com.google.android.gms.internal.ads.vz2.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p22.k(java.lang.String):com.google.android.gms.internal.ads.vz2");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.yz2 l(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L20
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 2
            goto L35
        L20:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 1
            goto L35
        L2a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L44
            if (r4 == r3) goto L41
            if (r4 == r2) goto L3e
            com.google.android.gms.internal.ads.yz2 r4 = com.google.android.gms.internal.ads.yz2.UNSPECIFIED
            return r4
        L3e:
            com.google.android.gms.internal.ads.yz2 r4 = com.google.android.gms.internal.ads.yz2.ONE_PIXEL
            return r4
        L41:
            com.google.android.gms.internal.ads.yz2 r4 = com.google.android.gms.internal.ads.yz2.DEFINED_BY_JAVASCRIPT
            return r4
        L44:
            com.google.android.gms.internal.ads.yz2 r4 = com.google.android.gms.internal.ads.yz2.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p22.l(java.lang.String):com.google.android.gms.internal.ads.yz2");
    }

    private static zz2 m(String str) {
        return "native".equals(str) ? zz2.NATIVE : "javascript".equals(str) ? zz2.JAVASCRIPT : zz2.NONE;
    }

    private static final Object n(o22 o22Var) {
        try {
            return o22Var.j();
        } catch (RuntimeException e8) {
            g2.t.q().t(e8, "omid exception");
            return null;
        }
    }

    private static final void o(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e8) {
            g2.t.q().t(e8, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.q22
    public final qz2 a(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final s22 s22Var, final r22 r22Var, final String str6) {
        if (!((Boolean) h2.y.c().b(ns.S4)).booleanValue() || !oz2.b()) {
            return null;
        }
        final String str7 = "javascript";
        final String str8 = "";
        return (qz2) n(new o22(str5, str, str7, str4, r22Var, webView, str6, str8, s22Var) { // from class: com.google.android.gms.internal.ads.i22

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f9047a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f9048b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f9050d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ r22 f9051e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ WebView f9052f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ String f9053g;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ s22 f9055i;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f9049c = "javascript";

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ String f9054h = "";

            {
                this.f9050d = str4;
                this.f9051e = r22Var;
                this.f9052f = webView;
                this.f9053g = str6;
                this.f9055i = s22Var;
            }

            @Override // com.google.android.gms.internal.ads.o22
            public final Object j() {
                return p22.j(this.f9047a, this.f9048b, this.f9049c, this.f9050d, this.f9051e, this.f9052f, this.f9053g, this.f9054h, this.f9055i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.q22
    public final void b(final qz2 qz2Var) {
        if (((Boolean) h2.y.c().b(ns.S4)).booleanValue() && oz2.b()) {
            qz2Var.getClass();
            o(new Runnable() { // from class: com.google.android.gms.internal.ads.j22
                @Override // java.lang.Runnable
                public final void run() {
                    qz2Var.e();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.q22
    public final boolean c(final Context context) {
        if (((Boolean) h2.y.c().b(ns.S4)).booleanValue()) {
            Boolean bool = (Boolean) n(new o22() { // from class: com.google.android.gms.internal.ads.k22
                @Override // com.google.android.gms.internal.ads.o22
                public final Object j() {
                    if (oz2.b()) {
                        return Boolean.TRUE;
                    }
                    oz2.a(context);
                    return Boolean.valueOf(oz2.b());
                }
            });
            return bool != null && bool.booleanValue();
        }
        qg0.g("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.q22
    public final qz2 d(final String str, final WebView webView, String str2, String str3, final String str4, final s22 s22Var, final r22 r22Var, final String str5) {
        if (!((Boolean) h2.y.c().b(ns.S4)).booleanValue() || !oz2.b()) {
            return null;
        }
        final String str6 = "Google";
        final String str7 = "javascript";
        final String str8 = "";
        return (qz2) n(new o22(str6, str, str7, r22Var, str4, webView, str5, str8, s22Var) { // from class: com.google.android.gms.internal.ads.l22

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f10432b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ r22 f10434d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f10435e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ WebView f10436f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ String f10437g;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ s22 f10439i;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f10431a = "Google";

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f10433c = "javascript";

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ String f10438h = "";

            {
                this.f10432b = str;
                this.f10434d = r22Var;
                this.f10435e = str4;
                this.f10436f = webView;
                this.f10437g = str5;
                this.f10439i = s22Var;
            }

            @Override // com.google.android.gms.internal.ads.o22
            public final Object j() {
                return p22.i(this.f10431a, this.f10432b, this.f10433c, this.f10434d, this.f10435e, this.f10436f, this.f10437g, this.f10438h, this.f10439i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.q22
    public final void e(final qz2 qz2Var) {
        o(new Runnable() { // from class: com.google.android.gms.internal.ads.n22
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) h2.y.c().b(ns.S4)).booleanValue() && oz2.b()) {
                    qz2Var.c();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.q22
    public final void f(final qz2 qz2Var, final View view) {
        o(new Runnable() { // from class: com.google.android.gms.internal.ads.h22
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) h2.y.c().b(ns.S4)).booleanValue() && oz2.b()) {
                    qz2Var.d(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.q22
    public final void g(final qz2 qz2Var, final View view) {
        o(new Runnable() { // from class: com.google.android.gms.internal.ads.g22
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) h2.y.c().b(ns.S4)).booleanValue() && oz2.b()) {
                    qz2Var.b(view, xz2.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.q22
    public final String h(Context context) {
        if (((Boolean) h2.y.c().b(ns.S4)).booleanValue()) {
            return (String) n(new o22() { // from class: com.google.android.gms.internal.ads.m22
                @Override // com.google.android.gms.internal.ads.o22
                public final Object j() {
                    return "a.1.4.8-google_20230803";
                }
            });
        }
        return null;
    }
}
