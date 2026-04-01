package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class bf2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lg3 f5773b;

    bf2(Context context, lg3 lg3Var) {
        this.f5772a = context;
        this.f5773b = lg3Var;
    }

    final /* synthetic */ af2 a() {
        Bundle bundle;
        g2.t.r();
        String string = !((Boolean) h2.y.c().b(ns.Y5)).booleanValue() ? "" : this.f5772a.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) h2.y.c().b(ns.f12028a6)).booleanValue() ? this.f5772a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        g2.t.r();
        Context context = this.f5772a;
        if (((Boolean) h2.y.c().b(ns.Z5)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i8 = 0; i8 < 4; i8++) {
                String str = strArr[i8];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new af2(string, string2, bundle, null);
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 18;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f5773b.Z(new Callable() { // from class: com.google.android.gms.internal.ads.ye2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f17746a.a();
            }
        });
    }
}
