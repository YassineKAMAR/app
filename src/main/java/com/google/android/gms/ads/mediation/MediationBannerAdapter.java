package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import l2.e;
import l2.f;
import l2.k;
import z1.h;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface MediationBannerAdapter extends f {
    View getBannerView();

    @Override // l2.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onDestroy();

    @Override // l2.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onPause();

    @Override // l2.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(Context context, k kVar, Bundle bundle, h hVar, e eVar, Bundle bundle2);
}
