package com.google.android.gms.ads.mediation.rtb;

import l2.a;
import l2.d;
import l2.g;
import l2.h;
import l2.i;
import l2.j;
import l2.m;
import l2.n;
import l2.o;
import l2.q;
import l2.s;
import l2.t;
import l2.x;
import n2.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class RtbAdapter extends a {
    public abstract void collectSignals(n2.a aVar, b bVar);

    public void loadRtbAppOpenAd(h hVar, d<g, Object> dVar) {
        loadAppOpenAd(hVar, dVar);
    }

    public void loadRtbBannerAd(j jVar, d<i, Object> dVar) {
        loadBannerAd(jVar, dVar);
    }

    public void loadRtbInterscrollerAd(j jVar, d<m, Object> dVar) {
        dVar.a(new z1.a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadRtbInterstitialAd(o oVar, d<n, Object> dVar) {
        loadInterstitialAd(oVar, dVar);
    }

    public void loadRtbNativeAd(q qVar, d<x, Object> dVar) {
        loadNativeAd(qVar, dVar);
    }

    public void loadRtbRewardedAd(t tVar, d<s, Object> dVar) {
        loadRewardedAd(tVar, dVar);
    }

    public void loadRtbRewardedInterstitialAd(t tVar, d<s, Object> dVar) {
        loadRewardedInterstitialAd(tVar, dVar);
    }
}
