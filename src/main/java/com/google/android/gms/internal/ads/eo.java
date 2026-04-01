package com.google.android.gms.internal.ads;

import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
final class eo implements e14 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final e14 f7439a = new eo();

    private eo() {
    }

    @Override // com.google.android.gms.internal.ads.e14
    public final boolean b(int i8) {
        fo foVar;
        fo foVar2 = fo.AD_INITIATER_UNSPECIFIED;
        switch (i8) {
            case 0:
                foVar = fo.AD_INITIATER_UNSPECIFIED;
                break;
            case 1:
                foVar = fo.BANNER;
                break;
            case 2:
                foVar = fo.DFP_BANNER;
                break;
            case 3:
                foVar = fo.INTERSTITIAL;
                break;
            case 4:
                foVar = fo.DFP_INTERSTITIAL;
                break;
            case 5:
                foVar = fo.NATIVE_EXPRESS;
                break;
            case 6:
                foVar = fo.AD_LOADER;
                break;
            case 7:
                foVar = fo.REWARD_BASED_VIDEO_AD;
                break;
            case 8:
                foVar = fo.BANNER_SEARCH_ADS;
                break;
            case 9:
                foVar = fo.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                break;
            case R.styleable.GradientColor_android_endX /* 10 */:
                foVar = fo.APP_OPEN;
                break;
            case R.styleable.GradientColor_android_endY /* 11 */:
                foVar = fo.REWARDED_INTERSTITIAL;
                break;
            default:
                foVar = null;
                break;
        }
        return foVar != null;
    }
}
