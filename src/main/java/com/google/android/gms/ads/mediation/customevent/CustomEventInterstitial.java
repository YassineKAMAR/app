package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import l2.e;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface CustomEventInterstitial extends m2.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, m2.c cVar, String str, e eVar, Bundle bundle);

    void showInterstitial();
}
