package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.g2;
import java.util.List;
import java.util.Map;
import p3.c0;

/* JADX INFO: loaded from: classes.dex */
final class c implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ g2 f20778a;

    c(g2 g2Var) {
        this.f20778a = g2Var;
    }

    @Override // p3.c0
    public final int a(String str) {
        return this.f20778a.a(str);
    }

    @Override // p3.c0
    public final void b(String str, String str2, Bundle bundle) {
        this.f20778a.u(str, str2, bundle);
    }

    @Override // p3.c0
    public final void c(String str) {
        this.f20778a.C(str);
    }

    @Override // p3.c0
    public final List<Bundle> d(String str, String str2) {
        return this.f20778a.h(str, str2);
    }

    @Override // p3.c0
    public final void e(String str) {
        this.f20778a.I(str);
    }

    @Override // p3.c0
    public final void f(Bundle bundle) {
        this.f20778a.m(bundle);
    }

    @Override // p3.c0
    public final Map<String, Object> g(String str, String str2, boolean z7) {
        return this.f20778a.i(str, str2, z7);
    }

    @Override // p3.c0
    public final void h(String str, String str2, Bundle bundle) {
        this.f20778a.E(str, str2, bundle);
    }

    @Override // p3.c0
    public final long j() {
        return this.f20778a.b();
    }

    @Override // p3.c0
    public final String n() {
        return this.f20778a.P();
    }

    @Override // p3.c0
    public final String o() {
        return this.f20778a.R();
    }

    @Override // p3.c0
    public final String q() {
        return this.f20778a.Q();
    }

    @Override // p3.c0
    public final String r() {
        return this.f20778a.S();
    }
}
