package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class p31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts2 f12728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f12729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ls2 f12730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h31 f12731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c32 f12732f;

    /* synthetic */ p31(n31 n31Var, o31 o31Var) {
        this.f12727a = n31Var.f11658a;
        this.f12728b = n31Var.f11659b;
        this.f12729c = n31Var.f11660c;
        this.f12730d = n31Var.f11661d;
        this.f12731e = n31Var.f11662e;
        this.f12732f = n31Var.f11663f;
    }

    final Context a(Context context) {
        return this.f12727a;
    }

    final Bundle b() {
        return this.f12729c;
    }

    final h31 c() {
        return this.f12731e;
    }

    final n31 d() {
        n31 n31Var = new n31();
        n31Var.e(this.f12727a);
        n31Var.i(this.f12728b);
        n31Var.f(this.f12729c);
        n31Var.g(this.f12731e);
        n31Var.d(this.f12732f);
        return n31Var;
    }

    final c32 e(String str) {
        c32 c32Var = this.f12732f;
        return c32Var != null ? c32Var : new c32(str);
    }

    final ls2 f() {
        return this.f12730d;
    }

    final ts2 g() {
        return this.f12728b;
    }
}
