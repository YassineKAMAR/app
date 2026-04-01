package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import l2.u;
import m2.d;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface CustomEventNative extends m2.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, d dVar, String str, u uVar, Bundle bundle);
}
