package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qz f13199a = new qz() { // from class: com.google.android.gms.internal.ads.my
        @Override // com.google.android.gms.internal.ads.qz
        public final void a(Object obj, Map map) {
            hn0 hn0Var = (hn0) obj;
            qz qzVar = pz.f13199a;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                qg0.g("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(com.amazon.a.a.o.b.f.f3942a);
            HashMap map2 = new HashMap();
            PackageManager packageManager = hn0Var.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";", 2);
                boolean z7 = true;
                if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                    z7 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z7);
                map2.put(str2, boolValueOf);
                j2.v1.k("/canOpenURLs;" + str2 + ";" + boolValueOf);
            }
            ((d20) hn0Var).U("openableURLs", map2);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qz f13200b = new qz() { // from class: com.google.android.gms.internal.ads.oy
        @Override // com.google.android.gms.internal.ads.qz
        public final void a(Object obj, Map map) {
            hn0 hn0Var = (hn0) obj;
            qz qzVar = pz.f13199a;
            if (!((Boolean) h2.y.c().b(ns.Y7)).booleanValue()) {
                qg0.g("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                qg0.g("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(hn0Var.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            j2.v1.k("/canOpenApp;" + str + ";" + boolValueOf);
            ((d20) hn0Var).U("openableApp", map2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qz f13201c = new qz() { // from class: com.google.android.gms.internal.ads.ry
        @Override // com.google.android.gms.internal.ads.qz
        public final void a(Object obj, Map map) {
            pz.b((hn0) obj, map);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qz f13202d = new hz();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final qz f13203e = new iz();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final qz f13204f = new qz() { // from class: com.google.android.gms.internal.ads.sy
        @Override // com.google.android.gms.internal.ads.qz
        public final void a(Object obj, Map map) {
            hn0 hn0Var = (hn0) obj;
            qz qzVar = pz.f13199a;
            String str = (String) map.get("u");
            if (str == null) {
                qg0.g("URL missing from httpTrack GMSG.");
            } else {
                new j2.d1(hn0Var.getContext(), ((pn0) hn0Var).v().f16723a, str).b();
            }
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final qz f13205g = new jz();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final qz f13206h = new kz();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final qz f13207i = new qz() { // from class: com.google.android.gms.internal.ads.qy
        @Override // com.google.android.gms.internal.ads.qz
        public final void a(Object obj, Map map) {
            on0 on0Var = (on0) obj;
            qz qzVar = pz.f13199a;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i8 = Integer.parseInt(str);
                int i9 = Integer.parseInt(str2);
                int i10 = Integer.parseInt(str3);
                gh ghVarQ = on0Var.Q();
                if (ghVarQ != null) {
                    ghVarQ.c().d(i8, i9, i10);
                }
            } catch (NumberFormatException unused) {
                qg0.g("Could not parse touch parameters from gmsg.");
            }
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final qz f13208j = new lz();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final qz f13209k = new mz();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final qz f13210l = new dk0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final qz f13211m = new ek0();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final qz f13212n = new iy();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f00 f13213o = new f00();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final qz f13214p = new nz();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final qz f13215q = new oz();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final qz f13216r = new ty();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final qz f13217s = new uy();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final qz f13218t = new vy();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final qz f13219u = new wy();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final qz f13220v = new xy();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final qz f13221w = new yy();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final qz f13222x = new zy();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final qz f13223y = new az();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final qz f13224z = new bz();
    public static final qz A = new cz();
    public static final qz B = new ez();
    public static final qz C = new fz();

    public static x3.d a(fm0 fm0Var, String str) {
        Uri uriA = Uri.parse(str);
        try {
            gh ghVarQ = fm0Var.Q();
            if (ghVarQ != null && ghVarQ.f(uriA)) {
                uriA = ghVarQ.a(uriA, fm0Var.getContext(), fm0Var.T(), fm0Var.r());
            }
        } catch (hh unused) {
            qg0.g("Unable to append parameter to URL: ".concat(str));
        }
        final String strB = ve0.b(uriA, fm0Var.getContext());
        long jLongValue = ((Long) iu.f9359e.e()).longValue();
        if (jLongValue <= 0 || jLongValue > 233702200) {
            return zf3.h(strB);
        }
        qf3 qf3VarC = qf3.C(fm0Var.c());
        jy jyVar = new z73() { // from class: com.google.android.gms.internal.ads.jy
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                qz qzVar = pz.f13199a;
                if (!((Boolean) iu.f9365k.e()).booleanValue()) {
                    return "failure_click_attok";
                }
                g2.t.q().u(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        };
        lg3 lg3Var = eh0.f7327f;
        return zf3.e(zf3.m(zf3.e(qf3VarC, Throwable.class, jyVar, lg3Var), new z73() { // from class: com.google.android.gms.internal.ads.ky
            /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
            @Override // com.google.android.gms.internal.ads.z73
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.String r6 = (java.lang.String) r6
                    com.google.android.gms.internal.ads.qz r0 = com.google.android.gms.internal.ads.pz.f13199a
                    java.lang.String r0 = r1
                    if (r6 != 0) goto L9
                    goto L74
                L9:
                    com.google.android.gms.internal.ads.ut r1 = com.google.android.gms.internal.ads.iu.f9360f
                    java.lang.Object r1 = r1.e()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L18
                    goto L39
                L18:
                    java.lang.String r1 = ".doubleclick.net"
                    java.lang.String r2 = ".googleadservices.com"
                    java.lang.String r3 = ".googlesyndication.com"
                    java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}
                    android.net.Uri r2 = android.net.Uri.parse(r0)
                    java.lang.String r2 = r2.getHost()
                    r3 = 0
                L2b:
                    r4 = 3
                    if (r3 >= r4) goto L74
                    r4 = r1[r3]
                    boolean r4 = r2.endsWith(r4)
                    if (r4 != 0) goto L39
                    int r3 = r3 + 1
                    goto L2b
                L39:
                    com.google.android.gms.internal.ads.ut r1 = com.google.android.gms.internal.ads.iu.f9355a
                    java.lang.Object r1 = r1.e()
                    java.lang.String r1 = (java.lang.String) r1
                    com.google.android.gms.internal.ads.ut r2 = com.google.android.gms.internal.ads.iu.f9356b
                    java.lang.Object r2 = r2.e()
                    java.lang.String r2 = (java.lang.String) r2
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L53
                    java.lang.String r0 = r0.replace(r1, r6)
                L53:
                    boolean r1 = android.text.TextUtils.isEmpty(r2)
                    if (r1 != 0) goto L74
                    android.net.Uri r1 = android.net.Uri.parse(r0)
                    java.lang.String r3 = r1.getQueryParameter(r2)
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 == 0) goto L74
                    android.net.Uri$Builder r0 = r1.buildUpon()
                    android.net.Uri$Builder r6 = r0.appendQueryParameter(r2, r6)
                    java.lang.String r6 = r6.toString()
                    return r6
                L74:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ky.apply(java.lang.Object):java.lang.Object");
            }
        }, lg3Var), Throwable.class, new z73() { // from class: com.google.android.gms.internal.ads.ly
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                qz qzVar = pz.f13199a;
                if (((Boolean) iu.f9365k.e()).booleanValue()) {
                    g2.t.q().u(th, "prepareClickUrl.attestation2");
                }
                return strB;
            }
        }, lg3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ void b(com.google.android.gms.internal.ads.hn0 r16, java.util.Map r17) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pz.b(com.google.android.gms.internal.ads.hn0, java.util.Map):void");
    }

    public static void c(Map map, hc1 hc1Var) {
        if (((Boolean) h2.y.c().b(ns.T9)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && hc1Var != null) {
            hc1Var.f0();
        }
    }
}
