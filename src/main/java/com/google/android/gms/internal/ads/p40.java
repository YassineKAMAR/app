package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p40 extends wn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o3.a f12737a;

    p40(o3.a aVar) {
        this.f12737a = aVar;
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final void A0(Bundle bundle) {
        this.f12737a.r(bundle);
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final void L4(String str, String str2, g3.a aVar) {
        this.f12737a.t(str, str2, aVar != null ? g3.b.H0(aVar) : null);
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final List N3(String str, String str2) {
        return this.f12737a.g(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final void U(String str) {
        this.f12737a.a(str);
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final void V(Bundle bundle) {
        this.f12737a.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final Map X4(String str, String str2, boolean z7) {
        return this.f12737a.m(str, str2, z7);
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final void Z(String str) {
        this.f12737a.c(str);
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final void b5(g3.a aVar, String str, String str2) {
        this.f12737a.s(aVar != null ? (Activity) g3.b.H0(aVar) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final int c(String str) {
        return this.f12737a.l(str);
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final void i0(Bundle bundle) {
        this.f12737a.q(bundle);
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final void k4(String str, String str2, Bundle bundle) {
        this.f12737a.n(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final long l() {
        return this.f12737a.d();
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final String m() {
        return this.f12737a.e();
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final String n() {
        return this.f12737a.f();
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final void n5(String str, String str2, Bundle bundle) {
        this.f12737a.b(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final String o() {
        return this.f12737a.i();
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final String q() {
        return this.f12737a.h();
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final String r() {
        return this.f12737a.j();
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final Bundle z2(Bundle bundle) {
        return this.f12737a.p(bundle);
    }
}
