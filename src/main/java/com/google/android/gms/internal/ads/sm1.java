package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class sm1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f14764a;

    public sm1(w84 w84Var) {
        this.f14764a = w84Var;
    }

    @Override // com.google.android.gms.internal.ads.w84
    public final /* bridge */ /* synthetic */ Object k() {
        fo foVar = ((x31) this.f14764a).a().f15313o.f8488a == 3 ? fo.REWARDED_INTERSTITIAL : fo.REWARD_BASED_VIDEO_AD;
        r84.b(foVar);
        return foVar;
    }
}
