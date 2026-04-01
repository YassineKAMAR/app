package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ht extends jt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g2.f f8971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8973c;

    public ht(g2.f fVar, String str, String str2) {
        this.f8971a = fVar;
        this.f8972b = str;
        this.f8973c = str2;
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final String k() {
        return this.f8972b;
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final String l() {
        return this.f8973c;
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void m() {
        this.f8971a.k();
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void m0(g3.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f8971a.a((View) g3.b.H0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.kt
    public final void n() {
        this.f8971a.l();
    }
}
