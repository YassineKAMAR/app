package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes.dex */
final class r extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ j1.i f4621a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(c cVar, Handler handler, j1.i iVar) {
        super(handler);
        this.f4621a = iVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i8, Bundle bundle) {
        this.f4621a.a(com.google.android.gms.internal.play_billing.v.f(bundle, "BillingClient"));
    }
}
