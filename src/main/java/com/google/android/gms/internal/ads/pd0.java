package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes.dex */
public final class pd0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f12823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j2.x1 f12824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final se0 f12825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f12826e = "-1";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12827f = -1;

    pd0(Context context, j2.x1 x1Var, se0 se0Var) {
        this.f12823b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f12824c = x1Var;
        this.f12822a = context;
        this.f12825d = se0Var;
    }

    private final void b() {
        this.f12824c.v(true);
        new Bundle();
        throw null;
    }

    private final void c(String str, int i8) {
        Context context;
        boolean z7 = false;
        if (!((Boolean) h2.y.c().b(ns.f12209v0)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i8 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z7 = true;
        }
        this.f12824c.v(z7);
        if (((Boolean) h2.y.c().b(ns.f12073f6)).booleanValue() && z7 && (context = this.f12822a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        this.f12825d.y();
    }

    final void a() {
        SharedPreferences sharedPreferences;
        String str;
        this.f12823b.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.f12823b, "gad_has_consent_for_cookies");
        if (((Boolean) h2.y.c().b(ns.f12225x0)).booleanValue()) {
            onSharedPreferenceChanged(this.f12823b, "IABTCF_gdprApplies");
            sharedPreferences = this.f12823b;
            str = "IABTCF_TCString";
        } else {
            sharedPreferences = this.f12823b;
            str = "IABTCF_PurposeConsents";
        }
        onSharedPreferenceChanged(sharedPreferences, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pd0.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }
}
