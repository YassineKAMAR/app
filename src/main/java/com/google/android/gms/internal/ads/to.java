package com.google.android.gms.internal.ads;

import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
public enum to implements c14 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final d14 f15192m = new d14() { // from class: com.google.android.gms.internal.ads.ro
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15194a;

    to(int i8) {
        this.f15194a = i8;
    }

    public static to a(int i8) {
        switch (i8) {
            case 0:
                return AD_FORMAT_TYPE_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return INTERSTITIAL;
            case 3:
                return NATIVE_EXPRESS;
            case 4:
                return NATIVE_CONTENT;
            case 5:
                return NATIVE_APP_INSTALL;
            case 6:
                return NATIVE_CUSTOM_TEMPLATE;
            case 7:
                return DFP_BANNER;
            case 8:
                return DFP_INTERSTITIAL;
            case 9:
                return REWARD_BASED_VIDEO_AD;
            case R.styleable.GradientColor_android_endX /* 10 */:
                return BANNER_SEARCH_ADS;
            default:
                return null;
        }
    }

    public final int j() {
        return this.f15194a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f15194a);
    }
}
