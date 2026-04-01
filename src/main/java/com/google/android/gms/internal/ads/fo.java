package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public enum fo implements c14 {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final d14 f7857n = new d14() { // from class: com.google.android.gms.internal.ads.do
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7859a;

    fo(int i8) {
        this.f7859a = i8;
    }

    public final int j() {
        return this.f7859a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f7859a);
    }
}
