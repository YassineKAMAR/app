package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import l2.e;
import l2.f;
import l2.p;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface MediationInterstitialAdapter extends f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, p pVar, Bundle bundle, e eVar, Bundle bundle2);

    void showInterstitial();
}
