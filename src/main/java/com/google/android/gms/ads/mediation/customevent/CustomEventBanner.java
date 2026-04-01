package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import l2.e;
import z1.h;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface CustomEventBanner extends m2.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, m2.b bVar, String str, h hVar, e eVar, Bundle bundle);
}
