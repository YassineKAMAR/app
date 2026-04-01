package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCase;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfferingStrings;
import e6.i0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class GetBillingConfigUseCase extends BillingClientUseCase<com.android.billingclient.api.d> {
    private final DeviceCache deviceCache;
    private final l<PurchasesError, i0> onError;
    private final l<com.android.billingclient.api.d, i0> onReceive;
    private final l<l<? super com.android.billingclient.api.b, i0>, i0> withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.GetBillingConfigUseCase$executeAsync$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<com.android.billingclient.api.b, i0> {
        AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(AtomicBoolean hasResponded, GetBillingConfigUseCase this$0, com.android.billingclient.api.f result, com.android.billingclient.api.d dVar) {
            q.f(hasResponded, "$hasResponded");
            q.f(this$0, "this$0");
            q.f(result, "result");
            if (!hasResponded.getAndSet(true)) {
                BillingClientUseCase.processResult$default(this$0, result, dVar, null, null, 12, null);
                return;
            }
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String str = String.format(OfferingStrings.EXTRA_GET_BILLING_CONFIG_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(result.b())}, 1));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.b bVar) {
            invoke2(bVar);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.b invoke) {
            q.f(invoke, "$this$invoke");
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            j1.h hVarA = j1.h.a().a();
            final GetBillingConfigUseCase getBillingConfigUseCase = GetBillingConfigUseCase.this;
            invoke.d(hVarA, new j1.e() { // from class: com.revenuecat.purchases.google.usecase.c
                @Override // j1.e
                public final void a(com.android.billingclient.api.f fVar, com.android.billingclient.api.d dVar) {
                    GetBillingConfigUseCase.AnonymousClass1.invoke$lambda$0(atomicBoolean, getBillingConfigUseCase, fVar, dVar);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GetBillingConfigUseCase(GetBillingConfigUseCaseParams useCaseParams, DeviceCache deviceCache, l<? super com.android.billingclient.api.d, i0> onReceive, l<? super PurchasesError, i0> onError, l<? super l<? super com.android.billingclient.api.b, i0>, i0> withConnectedClient, p<? super Long, ? super l<? super PurchasesError, i0>, i0> executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        q.f(useCaseParams, "useCaseParams");
        q.f(deviceCache, "deviceCache");
        q.f(onReceive, "onReceive");
        q.f(onError, "onError");
        q.f(withConnectedClient, "withConnectedClient");
        q.f(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.deviceCache = deviceCache;
        this.onReceive = onReceive;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    public final DeviceCache getDeviceCache() {
        return this.deviceCache;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error getting billing config";
    }

    public final l<PurchasesError, i0> getOnError() {
        return this.onError;
    }

    public final l<com.android.billingclient.api.d, i0> getOnReceive() {
        return this.onReceive;
    }

    public final l<l<? super com.android.billingclient.api.b, i0>, i0> getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void onOk(com.android.billingclient.api.d dVar) {
        if (dVar == null) {
            this.onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, BillingStrings.BILLING_CONFIG_NULL_ON_SUCCESS));
            return;
        }
        DeviceCache deviceCache = this.deviceCache;
        String strA = dVar.a();
        q.e(strA, "received.countryCode");
        deviceCache.setStorefront(strA);
        this.onReceive.invoke(dVar);
    }
}
