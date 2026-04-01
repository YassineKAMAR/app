package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fz2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v62 f8131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f8135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ls2 f8136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ms2 f8137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e3.e f8138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final gh f8139i;

    public fz2(v62 v62Var, wg0 wg0Var, String str, String str2, Context context, ls2 ls2Var, ms2 ms2Var, e3.e eVar, gh ghVar) {
        this.f8131a = v62Var;
        this.f8132b = wg0Var.f16723a;
        this.f8133c = str;
        this.f8134d = str2;
        this.f8135e = context;
        this.f8136f = ls2Var;
        this.f8137g = ms2Var;
        this.f8138h = eVar;
        this.f8139i = ghVar;
    }

    public static final List f(int i8, int i9, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((String) it.next(), "@gw_mpe@", "2." + i9));
        }
        return arrayList;
    }

    public static final List g(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    public static final List h(List list, long j8) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((String) it.next(), "@gw_ttr@", Long.toString(j8, 10)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String i(String str) {
        return TextUtils.isEmpty(str) ? "" : pg0.k() ? "fakeForAdDebugLog" : str;
    }

    private static String j(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List c(ks2 ks2Var, wr2 wr2Var, List list) {
        return d(ks2Var, wr2Var, false, "", "", list);
    }

    public final List d(ks2 ks2Var, wr2 wr2Var, boolean z7, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z8 = true;
            String strJ = j(j(j((String) it.next(), "@gw_adlocid@", ks2Var.f10322a.f8947a.f15304f), "@gw_adnetrefresh@", true != z7 ? "0" : "1"), "@gw_sdkver@", this.f8132b);
            if (wr2Var != null) {
                strJ = ve0.c(j(j(j(strJ, "@gw_qdata@", wr2Var.A), "@gw_adnetid@", wr2Var.f16911z), "@gw_allocid@", wr2Var.f16910y), this.f8135e, wr2Var.Y);
            }
            String strJ2 = j(j(j(j(strJ, "@gw_adnetstatus@", this.f8131a.g()), "@gw_ttr@", Long.toString(this.f8131a.a(), 10)), "@gw_seqnum@", this.f8133c), "@gw_sessid@", this.f8134d);
            boolean z9 = false;
            if (((Boolean) h2.y.c().b(ns.f12133m3)).booleanValue() && !TextUtils.isEmpty(str)) {
                z9 = true;
            }
            boolean z10 = !TextUtils.isEmpty(str2);
            if (z9) {
                z8 = z10;
            } else {
                if (z10) {
                }
                arrayList.add(strJ2);
            }
            if (this.f8139i.f(Uri.parse(strJ2))) {
                Uri.Builder builderBuildUpon = Uri.parse(strJ2).buildUpon();
                if (z9) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z8) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strJ2 = builderBuildUpon.build().toString();
            }
            arrayList.add(strJ2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[LOOP:0: B:13:0x0059->B:15:0x005f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List e(com.google.android.gms.internal.ads.wr2 r10, java.util.List r11, com.google.android.gms.internal.ads.ob0 r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            e3.e r1 = r9.f8138h
            long r1 = r1.a()
            java.lang.String r3 = r12.l()     // Catch: android.os.RemoteException -> La8
            int r12 = r12.k()     // Catch: android.os.RemoteException -> La8
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch: android.os.RemoteException -> La8
            com.google.android.gms.internal.ads.fs r4 = com.google.android.gms.internal.ads.ns.f12142n3
            com.google.android.gms.internal.ads.ls r5 = h2.y.c()
            java.lang.Object r4 = r5.b(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L35
            com.google.android.gms.internal.ads.ms2 r4 = r9.f8137g
            if (r4 != 0) goto L32
            com.google.android.gms.internal.ads.h83 r4 = com.google.android.gms.internal.ads.h83.c()
            goto L3b
        L32:
            com.google.android.gms.internal.ads.ls2 r4 = r4.f11534a
            goto L37
        L35:
            com.google.android.gms.internal.ads.ls2 r4 = r9.f8136f
        L37:
            com.google.android.gms.internal.ads.h83 r4 = com.google.android.gms.internal.ads.h83.d(r4)
        L3b:
            com.google.android.gms.internal.ads.dz2 r5 = new com.google.android.gms.internal.ads.z73() { // from class: com.google.android.gms.internal.ads.dz2
                static {
                    /*
                        com.google.android.gms.internal.ads.dz2 r0 = new com.google.android.gms.internal.ads.dz2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.ads.dz2) com.google.android.gms.internal.ads.dz2.a com.google.android.gms.internal.ads.dz2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dz2.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dz2.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.z73
                public final java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.ads.ls2 r1 = (com.google.android.gms.internal.ads.ls2) r1
                        java.lang.String r1 = com.google.android.gms.internal.ads.fz2.a(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dz2.apply(java.lang.Object):java.lang.Object");
                }
            }
            com.google.android.gms.internal.ads.h83 r5 = r4.a(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.b(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.ez2 r7 = new com.google.android.gms.internal.ads.z73() { // from class: com.google.android.gms.internal.ads.ez2
                static {
                    /*
                        com.google.android.gms.internal.ads.ez2 r0 = new com.google.android.gms.internal.ads.ez2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.ads.ez2) com.google.android.gms.internal.ads.ez2.a com.google.android.gms.internal.ads.ez2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ez2.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ez2.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.z73
                public final java.lang.Object apply(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.ads.ls2 r1 = (com.google.android.gms.internal.ads.ls2) r1
                        java.lang.String r1 = com.google.android.gms.internal.ads.fz2.b(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ez2.apply(java.lang.Object):java.lang.Object");
                }
            }
            com.google.android.gms.internal.ads.h83 r4 = r4.a(r7)
            java.lang.Object r4 = r4.b(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r11 = r11.iterator()
        L59:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto La7
            java.lang.Object r6 = r11.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = j(r6, r7, r12)
            java.lang.String r7 = r9.f8132b
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = j(r6, r8, r7)
            android.content.Context r7 = r9.f8135e
            boolean r8 = r10.Y
            java.lang.String r6 = com.google.android.gms.internal.ads.ve0.c(r6, r7, r8)
            r0.add(r6)
            goto L59
        La7:
            return r0
        La8:
            r10 = move-exception
            java.lang.String r11 = "Unable to determine award type and amount."
            com.google.android.gms.internal.ads.qg0.e(r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fz2.e(com.google.android.gms.internal.ads.wr2, java.util.List, com.google.android.gms.internal.ads.ob0):java.util.List");
    }
}
