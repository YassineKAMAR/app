package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import j1.y0;

/* JADX INFO: loaded from: classes.dex */
final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0 f4605b;

    n0(Context context, j1.h0 h0Var, y yVar) {
        this.f4604a = context;
        this.f4605b = new m0(this, null, yVar, 0 == true ? 1 : 0);
    }

    n0(Context context, j1.n nVar, j1.c cVar, y yVar) {
        this.f4604a = context;
        this.f4605b = new m0(this, nVar, cVar, yVar, (y0) null);
    }

    n0(Context context, j1.n nVar, j1.q qVar, y yVar) {
        this.f4604a = context;
        this.f4605b = new m0(this, nVar, qVar, yVar, (y0) null);
    }

    final j1.h0 c() {
        m0.a(this.f4605b);
        return null;
    }

    final j1.n d() {
        return this.f4605b.f4594a;
    }

    final void e() {
        this.f4605b.d(this.f4604a);
    }

    final void f(boolean z7) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        this.f4604a.getApplicationContext().getPackageName();
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f4605b.c(this.f4604a, intentFilter, null, null);
    }
}
