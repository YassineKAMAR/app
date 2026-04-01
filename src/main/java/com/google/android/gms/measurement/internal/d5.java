package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f19899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ y4 f19900e;

    public d5(y4 y4Var, String str, long j8) {
        this.f19900e = y4Var;
        a3.o.f(str);
        this.f19896a = str;
        this.f19897b = j8;
    }

    public final long a() {
        if (!this.f19898c) {
            this.f19898c = true;
            this.f19899d = this.f19900e.F().getLong(this.f19896a, this.f19897b);
        }
        return this.f19899d;
    }

    public final void b(long j8) {
        SharedPreferences.Editor editorEdit = this.f19900e.F().edit();
        editorEdit.putLong(this.f19896a, j8);
        editorEdit.apply();
        this.f19899d = j8;
    }
}
