package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import com.revenuecat.purchases.google.StoreTransactionConversionsKt;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import e6.i0;
import e6.x;
import f6.j0;
import f6.k0;
import j1.m;
import j1.p;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
public final class QueryPurchasesByTypeUseCase extends BillingClientUseCase<Map<String, ? extends StoreTransaction>> {
    private final l<PurchasesError, i0> onError;
    private final l<Map<String, StoreTransaction>, i0> onSuccess;
    private final QueryPurchasesByTypeUseCaseParams useCaseParams;
    private final l<l<? super com.android.billingclient.api.b, i0>, i0> withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase$executeAsync$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<com.android.billingclient.api.b, i0> {
        AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1$lambda$0(QueryPurchasesByTypeUseCase this$0, com.android.billingclient.api.f result, List purchases) {
            q.f(this$0, "this$0");
            q.f(result, "result");
            q.f(purchases, "purchases");
            BillingClientUseCase.processResult$default(this$0, result, this$0.toMapOfGooglePurchaseWrapper(purchases, this$0.useCaseParams.getProductType()), null, null, 12, null);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.b bVar) {
            invoke2(bVar);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.b invoke) {
            i0 i0Var;
            q.f(invoke, "$this$invoke");
            p pVarBuildQueryPurchasesParams = BillingClientParamBuildersKt.buildQueryPurchasesParams(QueryPurchasesByTypeUseCase.this.useCaseParams.getProductType());
            if (pVarBuildQueryPurchasesParams != null) {
                final QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase = QueryPurchasesByTypeUseCase.this;
                queryPurchasesByTypeUseCase.queryPurchasesAsyncWithTrackingEnsuringOneResponse(invoke, queryPurchasesByTypeUseCase.useCaseParams.getProductType(), pVarBuildQueryPurchasesParams, new m() { // from class: com.revenuecat.purchases.google.usecase.h
                    @Override // j1.m
                    public final void a(com.android.billingclient.api.f fVar, List list) {
                        QueryPurchasesByTypeUseCase.AnonymousClass1.invoke$lambda$1$lambda$0(queryPurchasesByTypeUseCase, fVar, list);
                    }
                });
                i0Var = i0.f21430a;
            } else {
                i0Var = null;
            }
            if (i0Var == null) {
                QueryPurchasesByTypeUseCase queryPurchasesByTypeUseCase2 = QueryPurchasesByTypeUseCase.this;
                String str = String.format(PurchaseStrings.INVALID_PRODUCT_TYPE, Arrays.copyOf(new Object[]{"queryPurchasesByType"}, 1));
                q.e(str, "format(this, *args)");
                LogUtilsKt.errorLog$default(str, null, 2, null);
                com.android.billingclient.api.f fVarA = com.android.billingclient.api.f.c().c(5).a();
                q.e(fVarA, "newBuilder()\n           …                 .build()");
                BillingClientUseCase.processResult$default(queryPurchasesByTypeUseCase2, fVarA, k0.e(), null, null, 12, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QueryPurchasesByTypeUseCase(QueryPurchasesByTypeUseCaseParams useCaseParams, l<? super Map<String, StoreTransaction>, i0> onSuccess, l<? super PurchasesError, i0> onError, l<? super l<? super com.android.billingclient.api.b, i0>, i0> withConnectedClient, p6.p<? super Long, ? super l<? super PurchasesError, i0>, i0> executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        q.f(useCaseParams, "useCaseParams");
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        q.f(withConnectedClient, "withConnectedClient");
        q.f(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onSuccess = onSuccess;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryPurchasesAsyncWithTrackingEnsuringOneResponse(com.android.billingclient.api.b bVar, final String str, p pVar, final m mVar) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final Date now = this.useCaseParams.getDateProvider().getNow();
        bVar.k(pVar, new m() { // from class: com.revenuecat.purchases.google.usecase.g
            @Override // j1.m
            public final void a(com.android.billingclient.api.f fVar, List list) {
                QueryPurchasesByTypeUseCase.queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$0(atomicBoolean, this, str, now, mVar, fVar, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$0(AtomicBoolean hasResponded, QueryPurchasesByTypeUseCase this$0, String productType, Date requestStartTime, m listener, com.android.billingclient.api.f billingResult, List purchases) {
        q.f(hasResponded, "$hasResponded");
        q.f(this$0, "this$0");
        q.f(productType, "$productType");
        q.f(requestStartTime, "$requestStartTime");
        q.f(listener, "$listener");
        q.f(billingResult, "billingResult");
        q.f(purchases, "purchases");
        if (!hasResponded.getAndSet(true)) {
            this$0.trackGoogleQueryPurchasesRequestIfNeeded(productType, billingResult, requestStartTime);
            listener.a(billingResult, purchases);
        } else {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String str = String.format(OfferingStrings.EXTRA_QUERY_PURCHASES_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(billingResult.b())}, 1));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, StoreTransaction> toMapOfGooglePurchaseWrapper(List<? extends Purchase> list, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(t6.l.b(j0.b(f6.p.m(list, 10)), 16));
        for (Purchase purchase : list) {
            String strF = purchase.f();
            q.e(strF, "purchase.purchaseToken");
            e6.r rVarA = x.a(UtilsKt.sha1(strF), StoreTransactionConversionsKt.toStoreTransaction$default(purchase, ProductTypeConversionsKt.toRevenueCatProductType(str), null, null, null, 14, null));
            linkedHashMap.put(rVarA.c(), rVarA.d());
        }
        return linkedHashMap;
    }

    private final void trackGoogleQueryPurchasesRequestIfNeeded(String str, com.android.billingclient.api.f fVar, Date date) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int iB = fVar.b();
            String strA = fVar.a();
            q.e(strA, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m17trackGoogleQueryPurchasesRequestWn2Vu4Y(str, iB, strA, DurationExtensionsKt.between(x6.a.f27324b, date, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error when querying purchases of type " + this.useCaseParams.getProductType();
    }

    public final l<PurchasesError, i0> getOnError() {
        return this.onError;
    }

    public final l<Map<String, StoreTransaction>, i0> getOnSuccess() {
        return this.onSuccess;
    }

    public final l<l<? super com.android.billingclient.api.b, i0>, i0> getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public /* bridge */ /* synthetic */ void onOk(Map<String, ? extends StoreTransaction> map) {
        onOk2((Map<String, StoreTransaction>) map);
    }

    /* JADX INFO: renamed from: onOk, reason: avoid collision after fix types in other method */
    public void onOk2(Map<String, StoreTransaction> received) {
        q.f(received, "received");
        this.onSuccess.invoke(received);
    }
}
