package com.google.android.gms.common.api.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ x2.b f4883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f4884b;

    o(p pVar, x2.b bVar) {
        this.f4884b = pVar;
        this.f4883a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f4884b;
        m mVar = (m) pVar.f4890f.f4836l.get(pVar.f4886b);
        if (mVar == null) {
            return;
        }
        if (!this.f4883a.u()) {
            mVar.E(this.f4883a, null);
            return;
        }
        this.f4884b.f4889e = true;
        if (this.f4884b.f4885a.o()) {
            this.f4884b.h();
            return;
        }
        try {
            p pVar2 = this.f4884b;
            pVar2.f4885a.a(null, pVar2.f4885a.b());
        } catch (SecurityException e8) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e8);
            this.f4884b.f4885a.c("Failed to get service from broker.");
            mVar.E(new x2.b(10), null);
        }
    }
}
