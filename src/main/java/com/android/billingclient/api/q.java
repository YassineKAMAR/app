package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class q implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ j1.l f4616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f4617c;

    q(c cVar, String str, j1.l lVar) {
        this.f4617c = cVar;
        this.f4615a = str;
        this.f4616b = lVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        x xVarX = c.X(this.f4617c, this.f4615a);
        this.f4616b.a(xVarX.a(), xVarX.b());
        return null;
    }
}
