package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.jg0;
import h2.p2;
import h2.v;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import l2.k;
import l2.p;
import l2.r;
import l2.u;
import l2.w;
import l2.y;
import z1.f;
import z1.g;
import z1.h;
import z1.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, w, y {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private f adLoader;
    protected j mAdView;
    protected k2.a mInterstitialAd;

    g buildAdRequest(Context context, l2.e eVar, Bundle bundle, Bundle bundle2) {
        g.a aVar = new g.a();
        Date dateE = eVar.e();
        if (dateE != null) {
            aVar.i(dateE);
        }
        int i8 = eVar.i();
        if (i8 != 0) {
            aVar.j(i8);
        }
        Set<String> setG = eVar.g();
        if (setG != null) {
            Iterator<String> it = setG.iterator();
            while (it.hasNext()) {
                aVar.a(it.next());
            }
        }
        if (eVar.f()) {
            v.b();
            aVar.h(jg0.C(context));
        }
        if (eVar.b() != -1) {
            aVar.l(eVar.b() == 1);
        }
        aVar.k(eVar.d());
        aVar.b(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return aVar.c();
    }

    protected abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    k2.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // l2.y
    public p2 getVideoController() {
        j jVar = this.mAdView;
        if (jVar != null) {
            return jVar.e().b();
        }
        return null;
    }

    f.a newAdLoader(Context context, String str) {
        return new f.a(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, l2.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        j jVar = this.mAdView;
        if (jVar != null) {
            jVar.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // l2.w
    public void onImmersiveModeUpdated(boolean z7) {
        k2.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.d(z7);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, l2.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        j jVar = this.mAdView;
        if (jVar != null) {
            jVar.c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, l2.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        j jVar = this.mAdView;
        if (jVar != null) {
            jVar.d();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, k kVar, Bundle bundle, h hVar, l2.e eVar, Bundle bundle2) {
        j jVar = new j(context);
        this.mAdView = jVar;
        jVar.setAdSize(new h(hVar.j(), hVar.c()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, kVar));
        this.mAdView.b(buildAdRequest(context, eVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, p pVar, Bundle bundle, l2.e eVar, Bundle bundle2) {
        k2.a.b(context, getAdUnitId(bundle), buildAdRequest(context, eVar, bundle2, bundle), new c(this, pVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, r rVar, Bundle bundle, u uVar, Bundle bundle2) {
        e eVar = new e(this, rVar);
        f.a aVarE = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER)).e(eVar);
        aVarE.f(uVar.h());
        aVarE.g(uVar.a());
        if (uVar.c()) {
            aVarE.d(eVar);
        }
        if (uVar.k()) {
            for (String str : uVar.j().keySet()) {
                aVarE.b(str, eVar, true != ((Boolean) uVar.j().get(str)).booleanValue() ? null : eVar);
            }
        }
        f fVarA = aVarE.a();
        this.adLoader = fVarA;
        fVarA.b(buildAdRequest(context, uVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        k2.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.f(null);
        }
    }
}
