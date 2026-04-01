package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class l03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z13 f10404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xz2 f10406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f10407d = "Ad overlay";

    public l03(View view, xz2 xz2Var, String str) {
        this.f10404a = new z13(view);
        this.f10405b = view.getClass().getCanonicalName();
        this.f10406c = xz2Var;
    }

    public final xz2 a() {
        return this.f10406c;
    }

    public final z13 b() {
        return this.f10404a;
    }

    public final String c() {
        return this.f10407d;
    }

    public final String d() {
        return this.f10405b;
    }
}
