package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class eo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wg0 f7440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f7441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f7442c;

    /* synthetic */ eo0(co0 co0Var, do0 do0Var) {
        this.f7440a = co0Var.f6408a;
        this.f7441b = co0Var.f6409b;
        this.f7442c = co0Var.f6410c;
    }

    final Context a() {
        return this.f7441b;
    }

    public final gh b() {
        return new gh(new g2.i(this.f7441b, this.f7440a));
    }

    final dv c() {
        return new dv(this.f7441b);
    }

    final wg0 d() {
        return this.f7440a;
    }

    final String e() {
        return g2.t.r().D(this.f7441b, this.f7440a.f16723a);
    }

    final WeakReference f() {
        return this.f7442c;
    }
}
