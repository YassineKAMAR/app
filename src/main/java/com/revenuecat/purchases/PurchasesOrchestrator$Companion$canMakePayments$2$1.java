package com.revenuecat.purchases;

import android.os.Handler;
import com.revenuecat.purchases.google.BillingResultExtensionsKt;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.models.BillingFeature;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class PurchasesOrchestrator$Companion$canMakePayments$2$1 implements j1.d {
    final /* synthetic */ com.android.billingclient.api.b $billingClient;
    final /* synthetic */ Callback<Boolean> $callback;
    final /* synthetic */ List<BillingFeature> $features;
    final /* synthetic */ Handler $mainHandler;

    /* JADX WARN: Multi-variable type inference failed */
    PurchasesOrchestrator$Companion$canMakePayments$2$1(Handler handler, Callback<Boolean> callback, com.android.billingclient.api.b bVar, List<? extends BillingFeature> list) {
        this.$mainHandler = handler;
        this.$callback = callback;
        this.$billingClient = bVar;
        this.$features = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBillingServiceDisconnected$lambda$2(com.android.billingclient.api.b billingClient, Callback callback) {
        q.f(billingClient, "$billingClient");
        q.f(callback, "$callback");
        try {
            billingClient.c();
        } catch (IllegalArgumentException unused) {
        } catch (Throwable th) {
            callback.onReceived(Boolean.FALSE);
            throw th;
        }
        callback.onReceived(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBillingSetupFinished$lambda$1(com.android.billingclient.api.f billingResult, Callback callback, com.android.billingclient.api.b billingClient, List features) {
        q.f(billingResult, "$billingResult");
        q.f(callback, "$callback");
        q.f(billingClient, "$billingClient");
        q.f(features, "$features");
        try {
            if (!BillingResultExtensionsKt.isSuccessful(billingResult)) {
                callback.onReceived(Boolean.FALSE);
                billingClient.c();
                return;
            }
            boolean z7 = true;
            if (!(features instanceof Collection) || !features.isEmpty()) {
                Iterator it = features.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.android.billingclient.api.f fVarE = billingClient.e(((BillingFeature) it.next()).getPlayBillingClientName());
                    q.e(fVarE, "billingClient.isFeatureS…it.playBillingClientName)");
                    if (!BillingResultExtensionsKt.isSuccessful(fVarE)) {
                        z7 = false;
                        break;
                    }
                }
            }
            billingClient.c();
            callback.onReceived(Boolean.valueOf(z7));
        } catch (IllegalArgumentException unused) {
            callback.onReceived(Boolean.FALSE);
        }
    }

    @Override // j1.d
    public void onBillingServiceDisconnected() {
        Handler handler = this.$mainHandler;
        final com.android.billingclient.api.b bVar = this.$billingClient;
        final Callback<Boolean> callback = this.$callback;
        handler.post(new Runnable() { // from class: com.revenuecat.purchases.g
            @Override // java.lang.Runnable
            public final void run() {
                PurchasesOrchestrator$Companion$canMakePayments$2$1.onBillingServiceDisconnected$lambda$2(bVar, callback);
            }
        });
    }

    @Override // j1.d
    public void onBillingSetupFinished(final com.android.billingclient.api.f billingResult) {
        q.f(billingResult, "billingResult");
        Handler handler = this.$mainHandler;
        final Callback<Boolean> callback = this.$callback;
        final com.android.billingclient.api.b bVar = this.$billingClient;
        final List<BillingFeature> list = this.$features;
        handler.post(new Runnable() { // from class: com.revenuecat.purchases.h
            @Override // java.lang.Runnable
            public final void run() {
                PurchasesOrchestrator$Companion$canMakePayments$2$1.onBillingSetupFinished$lambda$1(billingResult, callback, bVar, list);
            }
        });
    }
}
