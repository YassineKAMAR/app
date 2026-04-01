package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import l2.f;
import l2.r;
import l2.u;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface MediationNativeAdapter extends f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, r rVar, Bundle bundle, u uVar, Bundle bundle2);
}
