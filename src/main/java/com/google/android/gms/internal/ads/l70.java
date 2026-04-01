package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class l70 extends x60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RtbAdapter f10491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l2.n f10492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l2.s f10493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l2.g f10494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f10495e = "";

    public l70(RtbAdapter rtbAdapter) {
        this.f10491a = rtbAdapter;
    }

    private final Bundle P5(h2.r4 r4Var) {
        Bundle bundle;
        Bundle bundle2 = r4Var.f22264m;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f10491a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle Q5(String str) throws RemoteException {
        qg0.g("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e8) {
            qg0.e("", e8);
            throw new RemoteException();
        }
    }

    private static final boolean R5(h2.r4 r4Var) {
        if (r4Var.f22257f) {
            return true;
        }
        h2.v.b();
        return jg0.v();
    }

    private static final String S5(String str, h2.r4 r4Var) {
        String str2 = r4Var.f22272u;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void E1(String str, String str2, h2.r4 r4Var, g3.a aVar, j60 j60Var, g50 g50Var) throws RemoteException {
        try {
            this.f10491a.loadRtbAppOpenAd(new l2.h((Context) g3.b.H0(aVar), str, Q5(str2), P5(r4Var), R5(r4Var), r4Var.f22262k, r4Var.f22258g, r4Var.f22271t, S5(str2, r4Var), this.f10495e), new i70(this, j60Var, g50Var));
        } catch (Throwable th) {
            qg0.e("Adapter failed to render app open ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void F2(String str, String str2, h2.r4 r4Var, g3.a aVar, s60 s60Var, g50 g50Var, lv lvVar) throws RemoteException {
        try {
            this.f10491a.loadRtbNativeAd(new l2.q((Context) g3.b.H0(aVar), str, Q5(str2), P5(r4Var), R5(r4Var), r4Var.f22262k, r4Var.f22258g, r4Var.f22271t, S5(str2, r4Var), this.f10495e, lvVar), new h70(this, s60Var, g50Var));
        } catch (Throwable th) {
            qg0.e("Adapter failed to render native ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void T2(String str, String str2, h2.r4 r4Var, g3.a aVar, v60 v60Var, g50 g50Var) throws RemoteException {
        try {
            this.f10491a.loadRtbRewardedInterstitialAd(new l2.t((Context) g3.b.H0(aVar), str, Q5(str2), P5(r4Var), R5(r4Var), r4Var.f22262k, r4Var.f22258g, r4Var.f22271t, S5(str2, r4Var), this.f10495e), new k70(this, v60Var, g50Var));
        } catch (Throwable th) {
            qg0.e("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void U1(String str, String str2, h2.r4 r4Var, g3.a aVar, s60 s60Var, g50 g50Var) throws RemoteException {
        F2(str, str2, r4Var, aVar, s60Var, g50Var, null);
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void Y3(String str, String str2, h2.r4 r4Var, g3.a aVar, m60 m60Var, g50 g50Var, h2.w4 w4Var) throws RemoteException {
        try {
            this.f10491a.loadRtbInterscrollerAd(new l2.j((Context) g3.b.H0(aVar), str, Q5(str2), P5(r4Var), R5(r4Var), r4Var.f22262k, r4Var.f22258g, r4Var.f22271t, S5(str2, r4Var), z1.b0.c(w4Var.f22355e, w4Var.f22352b, w4Var.f22351a), this.f10495e), new f70(this, m60Var, g50Var));
        } catch (Throwable th) {
            qg0.e("Adapter failed to render interscroller ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void Z4(String str, String str2, h2.r4 r4Var, g3.a aVar, m60 m60Var, g50 g50Var, h2.w4 w4Var) throws RemoteException {
        try {
            this.f10491a.loadRtbBannerAd(new l2.j((Context) g3.b.H0(aVar), str, Q5(str2), P5(r4Var), R5(r4Var), r4Var.f22262k, r4Var.f22258g, r4Var.f22271t, S5(str2, r4Var), z1.b0.c(w4Var.f22355e, w4Var.f22352b, w4Var.f22351a), this.f10495e), new e70(this, m60Var, g50Var));
        } catch (Throwable th) {
            qg0.e("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final boolean a0(g3.a aVar) {
        l2.g gVar = this.f10494d;
        if (gVar == null) {
            return false;
        }
        try {
            gVar.a((Context) g3.b.H0(aVar));
            return true;
        } catch (Throwable th) {
            qg0.e("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void j5(String str) {
        this.f10495e = str;
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final boolean l2(g3.a aVar) {
        l2.s sVar = this.f10493c;
        if (sVar == null) {
            return false;
        }
        try {
            sVar.a((Context) g3.b.H0(aVar));
            return true;
        } catch (Throwable th) {
            qg0.e("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void l3(String str, String str2, h2.r4 r4Var, g3.a aVar, v60 v60Var, g50 g50Var) throws RemoteException {
        try {
            this.f10491a.loadRtbRewardedAd(new l2.t((Context) g3.b.H0(aVar), str, Q5(str2), P5(r4Var), R5(r4Var), r4Var.f22262k, r4Var.f22258g, r4Var.f22271t, S5(str2, r4Var), this.f10495e), new k70(this, v60Var, g50Var));
        } catch (Throwable th) {
            qg0.e("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final h2.p2 m() {
        Object obj = this.f10491a;
        if (obj instanceof l2.y) {
            try {
                return ((l2.y) obj).getVideoController();
            } catch (Throwable th) {
                qg0.e("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final m70 n() {
        return m70.g(this.f10491a.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final m70 q() {
        return m70.g(this.f10491a.getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final void s2(String str, String str2, h2.r4 r4Var, g3.a aVar, p60 p60Var, g50 g50Var) throws RemoteException {
        try {
            this.f10491a.loadRtbInterstitialAd(new l2.o((Context) g3.b.H0(aVar), str, Q5(str2), P5(r4Var), R5(r4Var), r4Var.f22262k, r4Var.f22258g, r4Var.f22271t, S5(str2, r4Var), this.f10495e), new g70(this, p60Var, g50Var));
        } catch (Throwable th) {
            qg0.e("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.y60
    public final boolean t0(g3.a aVar) {
        l2.n nVar = this.f10492b;
        if (nVar == null) {
            return false;
        }
        try {
            nVar.a((Context) g3.b.H0(aVar));
            return true;
        } catch (Throwable th) {
            qg0.e("", th);
            return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (((java.lang.Boolean) h2.y.c().b(com.google.android.gms.internal.ads.ns.Ma)).booleanValue() != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    @Override // com.google.android.gms.internal.ads.y60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x1(g3.a r4, java.lang.String r5, android.os.Bundle r6, android.os.Bundle r7, h2.w4 r8, com.google.android.gms.internal.ads.b70 r9) throws android.os.RemoteException {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l70.x1(g3.a, java.lang.String, android.os.Bundle, android.os.Bundle, h2.w4, com.google.android.gms.internal.ads.b70):void");
    }
}
