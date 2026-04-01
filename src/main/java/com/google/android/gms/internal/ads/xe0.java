package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
final class xe0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ye0 f17193b;

    public xe0(ye0 ye0Var, String str) {
        this.f17193b = ye0Var;
        this.f17192a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f17193b) {
            for (we0 we0Var : this.f17193b.f17743b) {
                we0Var.f16702a.b(we0Var.f16703b, sharedPreferences, this.f17192a, str);
            }
        }
    }
}
