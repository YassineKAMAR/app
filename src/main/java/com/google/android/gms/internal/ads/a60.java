package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a60 extends b50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d60 f5030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ac0 f5031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g3.a f5032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f5033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l2.n f5034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private l2.x f5035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l2.s f5036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private l2.m f5037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private l2.g f5038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f5039k = "";

    public a60(l2.a aVar) {
        this.f5029a = aVar;
    }

    public a60(l2.f fVar) {
        this.f5029a = fVar;
    }

    private final Bundle O5(h2.r4 r4Var) {
        Bundle bundle;
        Bundle bundle2 = r4Var.f22264m;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f5029a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private final Bundle P5(String str, h2.r4 r4Var, String str2) throws RemoteException {
        qg0.b("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f5029a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (r4Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", r4Var.f22258g);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            qg0.e("", th);
            throw new RemoteException();
        }
    }

    private static final boolean Q5(h2.r4 r4Var) {
        if (r4Var.f22257f) {
            return true;
        }
        h2.v.b();
        return jg0.v();
    }

    private static final String R5(String str, h2.r4 r4Var) {
        String str2 = r4Var.f22272u;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void A1(g3.a aVar) throws RemoteException {
        Object obj = this.f5029a;
        if ((obj instanceof l2.a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                Q();
                return;
            }
            qg0.b("Show interstitial ad from adapter.");
            l2.n nVar = this.f5034f;
            if (nVar != null) {
                nVar.a((Context) g3.b.H0(aVar));
                return;
            } else {
                qg0.d("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        qg0.g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + l2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void A3(g3.a aVar, h2.r4 r4Var, String str, g50 g50Var) throws RemoteException {
        Object obj = this.f5029a;
        if (obj instanceof l2.a) {
            qg0.b("Requesting app open ad from adapter.");
            try {
                ((l2.a) this.f5029a).loadAppOpenAd(new l2.h((Context) g3.b.H0(aVar), "", P5(str, r4Var, null), O5(r4Var), Q5(r4Var), r4Var.f22262k, r4Var.f22258g, r4Var.f22271t, R5(str, r4Var), ""), new z50(this, g50Var));
                return;
            } catch (Exception e8) {
                qg0.e("", e8);
                throw new RemoteException();
            }
        }
        qg0.g(l2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void E2(g3.a aVar, h2.w4 w4Var, h2.r4 r4Var, String str, String str2, g50 g50Var) throws RemoteException {
        RemoteException remoteException;
        Object obj = this.f5029a;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof l2.a)) {
            qg0.g(MediationBannerAdapter.class.getCanonicalName() + " or " + l2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        qg0.b("Requesting banner ad from adapter.");
        z1.h hVarD = w4Var.f22364n ? z1.b0.d(w4Var.f22355e, w4Var.f22352b) : z1.b0.c(w4Var.f22355e, w4Var.f22352b, w4Var.f22351a);
        Object obj2 = this.f5029a;
        if (!(obj2 instanceof MediationBannerAdapter)) {
            if (obj2 instanceof l2.a) {
                try {
                    ((l2.a) obj2).loadBannerAd(new l2.j((Context) g3.b.H0(aVar), "", P5(str, r4Var, str2), O5(r4Var), Q5(r4Var), r4Var.f22262k, r4Var.f22258g, r4Var.f22271t, R5(str, r4Var), hVarD, this.f5039k), new v50(this, g50Var));
                    return;
                } finally {
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
            List list = r4Var.f22256e;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j8 = r4Var.f22253b;
            r50 r50Var = new r50(j8 == -1 ? null : new Date(j8), r4Var.f22255d, hashSet, r4Var.f22262k, Q5(r4Var), r4Var.f22258g, r4Var.f22269r, r4Var.f22271t, R5(str, r4Var));
            Bundle bundle = r4Var.f22264m;
            mediationBannerAdapter.requestBannerAd((Context) g3.b.H0(aVar), new d60(g50Var), P5(str, r4Var, str2), hVarD, r50Var, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void F5(g3.a aVar, h2.w4 w4Var, h2.r4 r4Var, String str, g50 g50Var) throws RemoteException {
        E2(aVar, w4Var, r4Var, str, null, g50Var);
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final boolean H() throws RemoteException {
        Object obj = this.f5029a;
        if ((obj instanceof l2.a) || s50.a(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f5031c != null;
        }
        Object obj2 = this.f5029a;
        qg0.g(l2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final l50 I() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void K2(g3.a aVar, h2.r4 r4Var, String str, ac0 ac0Var, String str2) throws RemoteException {
        Object obj = this.f5029a;
        if ((obj instanceof l2.a) || s50.a(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f5032d = aVar;
            this.f5031c = ac0Var;
            ac0Var.p1(g3.b.k3(this.f5029a));
            return;
        }
        Object obj2 = this.f5029a;
        qg0.g(l2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void L() throws RemoteException {
        Object obj = this.f5029a;
        if (obj instanceof l2.a) {
            l2.s sVar = this.f5036h;
            if (sVar != null) {
                sVar.a((Context) g3.b.H0(this.f5032d));
                return;
            } else {
                qg0.d("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        }
        qg0.g(l2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void L5(g3.a aVar) {
        Context context = (Context) g3.b.H0(aVar);
        Object obj = this.f5029a;
        if (obj instanceof l2.v) {
            ((l2.v) obj).a(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final boolean M() {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    @Override // com.google.android.gms.internal.ads.d50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M1(g3.a r6, com.google.android.gms.internal.ads.j10 r7, java.util.List r8) throws android.os.RemoteException {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a60.M1(g3.a, com.google.android.gms.internal.ads.j10, java.util.List):void");
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void N() throws RemoteException {
        Object obj = this.f5029a;
        if (obj instanceof l2.f) {
            try {
                ((l2.f) obj).onPause();
            } catch (Throwable th) {
                qg0.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final m50 P() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void P0(g3.a aVar) throws RemoteException {
        Object obj = this.f5029a;
        if (obj instanceof l2.a) {
            qg0.b("Show rewarded ad from adapter.");
            l2.s sVar = this.f5036h;
            if (sVar != null) {
                sVar.a((Context) g3.b.H0(aVar));
                return;
            } else {
                qg0.d("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        }
        qg0.g(l2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void Q() throws RemoteException {
        Object obj = this.f5029a;
        if (obj instanceof MediationInterstitialAdapter) {
            qg0.b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f5029a).showInterstitial();
                return;
            } catch (Throwable th) {
                qg0.e("", th);
                throw new RemoteException();
            }
        }
        qg0.g(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void R1(h2.r4 r4Var, String str) throws RemoteException {
        X0(r4Var, str, null);
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void T() throws RemoteException {
        Object obj = this.f5029a;
        if (obj instanceof l2.f) {
            try {
                ((l2.f) obj).onResume();
            } catch (Throwable th) {
                qg0.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void V2(g3.a aVar, h2.r4 r4Var, String str, String str2, g50 g50Var, lv lvVar, List list) throws RemoteException {
        RemoteException remoteException;
        Object obj = this.f5029a;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof l2.a)) {
            qg0.g(MediationNativeAdapter.class.getCanonicalName() + " or " + l2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        qg0.b("Requesting native ad from adapter.");
        Object obj2 = this.f5029a;
        if (!(obj2 instanceof MediationNativeAdapter)) {
            if (obj2 instanceof l2.a) {
                try {
                    ((l2.a) obj2).loadNativeAd(new l2.q((Context) g3.b.H0(aVar), "", P5(str, r4Var, str2), O5(r4Var), Q5(r4Var), r4Var.f22262k, r4Var.f22258g, r4Var.f22271t, R5(str, r4Var), this.f5039k, lvVar), new x50(this, g50Var));
                    return;
                } finally {
                }
            }
            return;
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
            List list2 = r4Var.f22256e;
            HashSet hashSet = list2 != null ? new HashSet(list2) : null;
            long j8 = r4Var.f22253b;
            f60 f60Var = new f60(j8 == -1 ? null : new Date(j8), r4Var.f22255d, hashSet, r4Var.f22262k, Q5(r4Var), r4Var.f22258g, lvVar, list, r4Var.f22269r, r4Var.f22271t, R5(str, r4Var));
            Bundle bundle = r4Var.f22264m;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.f5030b = new d60(g50Var);
            mediationNativeAdapter.requestNativeAd((Context) g3.b.H0(aVar), this.f5030b, P5(str, r4Var, str2), f60Var, bundle2);
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void X0(h2.r4 r4Var, String str, String str2) throws RemoteException {
        Object obj = this.f5029a;
        if (obj instanceof l2.a) {
            m3(this.f5032d, r4Var, str, new e60((l2.a) obj, this.f5031c));
            return;
        }
        qg0.g(l2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void a3(g3.a aVar, ac0 ac0Var, List list) throws RemoteException {
        qg0.g("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void b1(g3.a aVar, h2.r4 r4Var, String str, g50 g50Var) throws RemoteException {
        z4(aVar, r4Var, str, null, g50Var);
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void c3(g3.a aVar) throws RemoteException {
        Object obj = this.f5029a;
        if (obj instanceof l2.a) {
            qg0.b("Show app open ad from adapter.");
            l2.g gVar = this.f5038j;
            if (gVar != null) {
                gVar.a((Context) g3.b.H0(aVar));
                return;
            } else {
                qg0.d("Can not show null mediation app open ad.");
                throw new RemoteException();
            }
        }
        qg0.g(l2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void f2(g3.a aVar, h2.r4 r4Var, String str, g50 g50Var) throws RemoteException {
        Object obj = this.f5029a;
        if (obj instanceof l2.a) {
            qg0.b("Requesting rewarded interstitial ad from adapter.");
            try {
                ((l2.a) this.f5029a).loadRewardedInterstitialAd(new l2.t((Context) g3.b.H0(aVar), "", P5(str, r4Var, null), O5(r4Var), Q5(r4Var), r4Var.f22262k, r4Var.f22258g, r4Var.f22271t, R5(str, r4Var), ""), new y50(this, g50Var));
                return;
            } catch (Exception e8) {
                qg0.e("", e8);
                throw new RemoteException();
            }
        }
        qg0.g(l2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void i4(boolean z7) {
        Object obj = this.f5029a;
        if (obj instanceof l2.w) {
            try {
                ((l2.w) obj).onImmersiveModeUpdated(z7);
                return;
            } catch (Throwable th) {
                qg0.e("", th);
                return;
            }
        }
        qg0.b(l2.w.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final Bundle m() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void m3(g3.a aVar, h2.r4 r4Var, String str, g50 g50Var) throws RemoteException {
        Object obj = this.f5029a;
        if (obj instanceof l2.a) {
            qg0.b("Requesting rewarded ad from adapter.");
            try {
                ((l2.a) this.f5029a).loadRewardedAd(new l2.t((Context) g3.b.H0(aVar), "", P5(str, r4Var, null), O5(r4Var), Q5(r4Var), r4Var.f22262k, r4Var.f22258g, r4Var.f22271t, R5(str, r4Var), ""), new y50(this, g50Var));
                return;
            } catch (Exception e8) {
                qg0.e("", e8);
                throw new RemoteException();
            }
        }
        qg0.g(l2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final Bundle n() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final h2.p2 o() {
        Object obj = this.f5029a;
        if (obj instanceof l2.y) {
            try {
                return ((l2.y) obj).getVideoController();
            } catch (Throwable th) {
                qg0.e("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void p2(g3.a aVar, h2.w4 w4Var, h2.r4 r4Var, String str, String str2, g50 g50Var) throws RemoteException {
        Object obj = this.f5029a;
        if (obj instanceof l2.a) {
            qg0.b("Requesting interscroller ad from adapter.");
            try {
                l2.a aVar2 = (l2.a) this.f5029a;
                aVar2.loadInterscrollerAd(new l2.j((Context) g3.b.H0(aVar), "", P5(str, r4Var, str2), O5(r4Var), Q5(r4Var), r4Var.f22262k, r4Var.f22258g, r4Var.f22271t, R5(str, r4Var), z1.b0.e(w4Var.f22355e, w4Var.f22352b), ""), new t50(this, g50Var, aVar2));
                return;
            } catch (Exception e8) {
                qg0.e("", e8);
                throw new RemoteException();
            }
        }
        qg0.g(l2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final Bundle q() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final pw r() {
        d60 d60Var = this.f5030b;
        if (d60Var == null) {
            return null;
        }
        c2.f fVarT = d60Var.t();
        if (fVarT instanceof qw) {
            return ((qw) fVarT).b();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final p50 s() {
        l2.x xVar;
        l2.x xVarU;
        Object obj = this.f5029a;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof l2.a) || (xVar = this.f5035g) == null) {
                return null;
            }
            return new g60(xVar);
        }
        d60 d60Var = this.f5030b;
        if (d60Var == null || (xVarU = d60Var.u()) == null) {
            return null;
        }
        return new g60(xVarU);
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final j50 t() {
        l2.m mVar = this.f5037i;
        if (mVar != null) {
            return new b60(mVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final m70 u() {
        Object obj = this.f5029a;
        if (obj instanceof l2.a) {
            return m70.g(((l2.a) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final g3.a v() throws RemoteException {
        Object obj = this.f5029a;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return g3.b.k3(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                qg0.e("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof l2.a) {
            return g3.b.k3(this.f5033e);
        }
        qg0.g(MediationBannerAdapter.class.getCanonicalName() + " or " + l2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void w() throws RemoteException {
        Object obj = this.f5029a;
        if (obj instanceof l2.f) {
            try {
                ((l2.f) obj).onDestroy();
            } catch (Throwable th) {
                qg0.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final m70 x() {
        Object obj = this.f5029a;
        if (obj instanceof l2.a) {
            return m70.g(((l2.a) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.d50
    public final void z4(g3.a aVar, h2.r4 r4Var, String str, String str2, g50 g50Var) throws RemoteException {
        RemoteException remoteException;
        Object obj = this.f5029a;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof l2.a)) {
            qg0.g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + l2.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        qg0.b("Requesting interstitial ad from adapter.");
        Object obj2 = this.f5029a;
        if (!(obj2 instanceof MediationInterstitialAdapter)) {
            if (obj2 instanceof l2.a) {
                try {
                    ((l2.a) obj2).loadInterstitialAd(new l2.o((Context) g3.b.H0(aVar), "", P5(str, r4Var, str2), O5(r4Var), Q5(r4Var), r4Var.f22262k, r4Var.f22258g, r4Var.f22271t, R5(str, r4Var), this.f5039k), new w50(this, g50Var));
                    return;
                } finally {
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
            List list = r4Var.f22256e;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j8 = r4Var.f22253b;
            r50 r50Var = new r50(j8 == -1 ? null : new Date(j8), r4Var.f22255d, hashSet, r4Var.f22262k, Q5(r4Var), r4Var.f22258g, r4Var.f22269r, r4Var.f22271t, R5(str, r4Var));
            Bundle bundle = r4Var.f22264m;
            mediationInterstitialAdapter.requestInterstitialAd((Context) g3.b.H0(aVar), new d60(g50Var), P5(str, r4Var, str2), r50Var, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } finally {
        }
    }
}
