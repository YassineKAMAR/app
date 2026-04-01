package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.i;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingClientParamBuildersKt;
import com.revenuecat.purchases.google.ProductTypeConversionsKt;
import com.revenuecat.purchases.google.StoreProductConversionsKt;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.OfferingStrings;
import e6.i0;
import f6.o;
import f6.w;
import j1.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class QueryProductDetailsUseCase extends BillingClientUseCase<List<? extends com.android.billingclient.api.h>> {
    private final l<PurchasesError, i0> onError;
    private final l<List<? extends StoreProduct>, i0> onReceive;
    private final QueryProductDetailsUseCaseParams useCaseParams;
    private final l<l<? super com.android.billingclient.api.b, i0>, i0> withConnectedClient;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$executeAsync$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<com.android.billingclient.api.b, i0> {
        final /* synthetic */ Set<String> $nonEmptyProductIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Set<String> set) {
            super(1);
            this.$nonEmptyProductIds = set;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.b bVar) {
            invoke2(bVar);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.b invoke) {
            q.f(invoke, "$this$invoke");
            String googleProductType = ProductTypeConversionsKt.toGoogleProductType(QueryProductDetailsUseCase.this.useCaseParams.getProductType());
            if (googleProductType == null) {
                googleProductType = "inapp";
            }
            i iVarBuildQueryProductDetailsParams = BillingClientParamBuildersKt.buildQueryProductDetailsParams(googleProductType, this.$nonEmptyProductIds);
            final QueryProductDetailsUseCase queryProductDetailsUseCase = QueryProductDetailsUseCase.this;
            queryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse(invoke, googleProductType, iVarBuildQueryProductDetailsParams, new k() { // from class: com.revenuecat.purchases.google.usecase.e
                @Override // j1.k
                public final void a(com.android.billingclient.api.f fVar, List list) {
                    BillingClientUseCase.processResult$default(queryProductDetailsUseCase, fVar, list, null, null, 12, null);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase$onOk$1, reason: invalid class name and case insensitive filesystem */
    static final class C02711 extends r implements l<com.android.billingclient.api.h, CharSequence> {
        public static final C02711 INSTANCE = new C02711();

        C02711() {
            super(1);
        }

        @Override // p6.l
        public final CharSequence invoke(com.android.billingclient.api.h it) {
            q.f(it, "it");
            String string = it.toString();
            q.e(string, "it.toString()");
            return string;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QueryProductDetailsUseCase(QueryProductDetailsUseCaseParams useCaseParams, l<? super List<? extends StoreProduct>, i0> onReceive, l<? super PurchasesError, i0> onError, l<? super l<? super com.android.billingclient.api.b, i0>, i0> withConnectedClient, p<? super Long, ? super l<? super PurchasesError, i0>, i0> executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        q.f(useCaseParams, "useCaseParams");
        q.f(onReceive, "onReceive");
        q.f(onError, "onError");
        q.f(withConnectedClient, "withConnectedClient");
        q.f(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onReceive = onReceive;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void queryProductDetailsAsyncEnsuringOneResponse(com.android.billingclient.api.b bVar, final String str, i iVar, final k kVar) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final Date now = this.useCaseParams.getDateProvider().getNow();
        bVar.i(iVar, new k() { // from class: com.revenuecat.purchases.google.usecase.d
            @Override // j1.k
            public final void a(com.android.billingclient.api.f fVar, List list) {
                QueryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse$lambda$3(atomicBoolean, this, str, now, kVar, fVar, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryProductDetailsAsyncEnsuringOneResponse$lambda$3(AtomicBoolean hasResponded, QueryProductDetailsUseCase this$0, String productType, Date requestStartTime, k listener, com.android.billingclient.api.f billingResult, List productDetailsList) {
        q.f(hasResponded, "$hasResponded");
        q.f(this$0, "this$0");
        q.f(productType, "$productType");
        q.f(requestStartTime, "$requestStartTime");
        q.f(listener, "$listener");
        q.f(billingResult, "billingResult");
        q.f(productDetailsList, "productDetailsList");
        if (!hasResponded.getAndSet(true)) {
            this$0.trackGoogleQueryProductDetailsRequestIfNeeded(productType, billingResult, requestStartTime);
            listener.a(billingResult, productDetailsList);
        } else {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String str = String.format(OfferingStrings.EXTRA_QUERY_PRODUCT_DETAILS_RESPONSE, Arrays.copyOf(new Object[]{Integer.valueOf(billingResult.b())}, 1));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
    }

    private final void trackGoogleQueryProductDetailsRequestIfNeeded(String str, com.android.billingclient.api.f fVar, Date date) {
        DiagnosticsTracker diagnosticsTrackerIfEnabled = this.useCaseParams.getDiagnosticsTrackerIfEnabled();
        if (diagnosticsTrackerIfEnabled != null) {
            int iB = fVar.b();
            String strA = fVar.a();
            q.e(strA, "billingResult.debugMessage");
            diagnosticsTrackerIfEnabled.m15trackGoogleQueryProductDetailsRequestWn2Vu4Y(str, iB, strA, DurationExtensionsKt.between(x6.a.f27324b, date, this.useCaseParams.getDateProvider().getNow()));
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public void executeAsync() {
        Set<String> productIds = this.useCaseParams.getProductIds();
        ArrayList arrayList = new ArrayList();
        for (Object obj : productIds) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        Set setY = w.Y(arrayList);
        if (!setY.isEmpty()) {
            this.withConnectedClient.invoke(new AnonymousClass1(setY));
        } else {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.EMPTY_PRODUCT_ID_LIST);
            this.onReceive.invoke(o.d());
        }
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public String getErrorMessage() {
        return "Error when fetching products";
    }

    public final l<PurchasesError, i0> getOnError() {
        return this.onError;
    }

    public final l<List<? extends StoreProduct>, i0> getOnReceive() {
        return this.onReceive;
    }

    public final l<l<? super com.android.billingclient.api.b, i0>, i0> getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override // com.revenuecat.purchases.google.usecase.BillingClientUseCase
    public /* bridge */ /* synthetic */ void onOk(List<? extends com.android.billingclient.api.h> list) {
        onOk2((List<com.android.billingclient.api.h>) list);
    }

    /* JADX INFO: renamed from: onOk, reason: avoid collision after fix types in other method */
    public void onOk2(List<com.android.billingclient.api.h> received) {
        q.f(received, "received");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(OfferingStrings.FETCHING_PRODUCTS_FINISHED, Arrays.copyOf(new Object[]{w.G(this.useCaseParams.getProductIds(), null, null, null, 0, null, null, 63, null)}, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        LogIntent logIntent2 = LogIntent.PURCHASE;
        String str2 = String.format(OfferingStrings.RETRIEVED_PRODUCTS, Arrays.copyOf(new Object[]{w.G(received, null, null, null, 0, null, C02711.INSTANCE, 31, null)}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent2, str2);
        List<com.android.billingclient.api.h> list = !received.isEmpty() ? received : null;
        if (list != null) {
            for (com.android.billingclient.api.h hVar : list) {
                LogIntent logIntent3 = LogIntent.PURCHASE;
                String str3 = String.format(OfferingStrings.LIST_PRODUCTS, Arrays.copyOf(new Object[]{hVar.d(), hVar}, 2));
                q.e(str3, "format(this, *args)");
                LogWrapperKt.log(logIntent3, str3);
            }
        }
        this.onReceive.invoke(StoreProductConversionsKt.toStoreProducts(received));
    }
}
