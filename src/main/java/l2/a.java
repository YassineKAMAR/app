package l2;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public abstract z1.x getSDKVersionInfo();

    public abstract z1.x getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<l> list);

    public void loadAppOpenAd(h hVar, d<g, Object> dVar) {
        dVar.a(new z1.a(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads"));
    }

    public void loadBannerAd(j jVar, d<i, Object> dVar) {
        dVar.a(new z1.a(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads"));
    }

    public void loadInterscrollerAd(j jVar, d<m, Object> dVar) {
        dVar.a(new z1.a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadInterstitialAd(o oVar, d<n, Object> dVar) {
        dVar.a(new z1.a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads"));
    }

    public void loadNativeAd(q qVar, d<x, Object> dVar) {
        dVar.a(new z1.a(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedAd(t tVar, d<s, Object> dVar) {
        dVar.a(new z1.a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedInterstitialAd(t tVar, d<s, Object> dVar) {
        dVar.a(new z1.a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads"));
    }
}
