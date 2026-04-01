package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f19982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ y4 f19983e;

    public e5(y4 y4Var, String str, String str2) {
        this.f19983e = y4Var;
        a3.o.f(str);
        this.f19979a = str;
        this.f19980b = null;
    }

    public final String a() {
        if (!this.f19981c) {
            this.f19981c = true;
            this.f19982d = this.f19983e.F().getString(this.f19979a, null);
        }
        return this.f19982d;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f19983e.F().edit();
        editorEdit.putString(this.f19979a, str);
        editorEdit.apply();
        this.f19982d = str;
    }
}
