package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class zzbrn implements MediationInterstitialAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f18533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l2.p f18534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f18535c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        qg0.b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        qg0.b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        qg0.b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, l2.p pVar, Bundle bundle, l2.e eVar, Bundle bundle2) {
        this.f18534b = pVar;
        if (pVar == null) {
            qg0.g("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            qg0.g("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f18534b.c(this, 0);
            return;
        }
        if (!qt.g(context)) {
            qg0.g("Default browser does not support custom tabs. Bailing out.");
            this.f18534b.c(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            qg0.g("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f18534b.c(this, 0);
        } else {
            this.f18533a = (Activity) context;
            this.f18535c = Uri.parse(string);
            this.f18534b.l(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        androidx.browser.customtabs.d dVarA = new d.b().a();
        dVarA.f1207a.setData(this.f18535c);
        j2.k2.f23991k.post(new p70(this, new AdOverlayInfoParcel(new i2.i(dVarA.f1207a, null), null, new o70(this), null, new wg0(0, 0, false, false, false), null, null)));
        g2.t.q().p();
    }
}
