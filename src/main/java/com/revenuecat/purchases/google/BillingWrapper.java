package com.revenuecat.purchases.google;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.e;
import com.android.billingclient.api.g;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingWrapper;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCaseParams;
import com.revenuecat.purchases.google.usecase.BillingClientUseCase;
import com.revenuecat.purchases.google.usecase.BillingClientUseCaseKt;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCaseParams;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCase;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchasesUseCaseParams;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import com.revenuecat.purchases.utils.Result;
import e6.i0;
import e6.r;
import e6.x;
import f6.w;
import j1.i;
import j1.j;
import j1.n;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class BillingWrapper extends BillingAbstract implements n, j1.d {
    private volatile com.android.billingclient.api.b billingClient;
    private final ClientFactory clientFactory;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Handler mainHandler;
    private final Map<String, PurchaseContext> purchaseContext;
    private long reconnectMilliseconds;
    private boolean reconnectionAlreadyScheduled;
    private final ConcurrentLinkedQueue<r<l<PurchasesError, i0>, Long>> serviceRequests;

    public static final class ClientFactory {
        private final Context context;

        public ClientFactory(Context context) {
            q.f(context, "context");
            this.context = context;
        }

        public final com.android.billingclient.api.b buildClient(n listener) {
            q.f(listener, "listener");
            com.android.billingclient.api.b bVarA = com.android.billingclient.api.b.h(this.context).b().c(listener).a();
            q.e(bVarA, "newBuilder(context).enab…\n                .build()");
            return bVarA;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$consumeAndSave$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends o implements l<String, i0> {
        AnonymousClass1(Object obj) {
            super(1, obj, DeviceCache.class, "addSuccessfullyPostedToken", "addSuccessfullyPostedToken(Ljava/lang/String;)V", 0);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(String str) {
            invoke2(str);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p02) {
            q.f(p02, "p0");
            ((DeviceCache) this.receiver).addSuccessfullyPostedToken(p02);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$consumeAndSave$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends o implements l<String, i0> {
        AnonymousClass2(Object obj) {
            super(1, obj, DeviceCache.class, "addSuccessfullyPostedToken", "addSuccessfullyPostedToken(Ljava/lang/String;)V", 0);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(String str) {
            invoke2(str);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p02) {
            q.f(p02, "p0");
            ((DeviceCache) this.receiver).addSuccessfullyPostedToken(p02);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$getStorefront$1, reason: invalid class name and case insensitive filesystem */
    static final class C02571 extends kotlin.jvm.internal.r implements l<com.android.billingclient.api.d, i0> {
        final /* synthetic */ l<String, i0> $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02571(l<? super String, i0> lVar) {
            super(1);
            this.$onSuccess = lVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.d dVar) {
            invoke2(dVar);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.d billingConfig) {
            q.f(billingConfig, "billingConfig");
            l<String, i0> lVar = this.$onSuccess;
            String strA = billingConfig.a();
            q.e(strA, "billingConfig.countryCode");
            lVar.invoke(strA);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$getStorefront$2, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C02582 extends o implements l<l<? super com.android.billingclient.api.b, ? extends i0>, i0> {
        C02582(Object obj) {
            super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(l<? super com.android.billingclient.api.b, ? extends i0> lVar) {
            invoke2((l<? super com.android.billingclient.api.b, i0>) lVar);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(l<? super com.android.billingclient.api.b, i0> p02) {
            q.f(p02, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(p02);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$getStorefront$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends o implements p<Long, l<? super PurchasesError, ? extends i0>, i0> {
        AnonymousClass3(Object obj) {
            super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ i0 invoke(Long l8, l<? super PurchasesError, ? extends i0> lVar) {
            invoke2(l8, (l<? super PurchasesError, i0>) lVar);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Long l8, l<? super PurchasesError, i0> p12) {
            q.f(p12, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l8, p12);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$launchBillingFlow$1, reason: invalid class name and case insensitive filesystem */
    static final class C02591 extends kotlin.jvm.internal.r implements l<com.android.billingclient.api.b, i0> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ com.android.billingclient.api.e $params;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02591(Activity activity, com.android.billingclient.api.e eVar) {
            super(1);
            this.$activity = activity;
            this.$params = eVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.b bVar) {
            invoke2(bVar);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.android.billingclient.api.b withConnectedClient) {
            q.f(withConnectedClient, "$this$withConnectedClient");
            com.android.billingclient.api.f fVarG = withConnectedClient.g(this.$activity, this.$params);
            if (!(fVarG.b() != 0)) {
                fVarG = null;
            }
            if (fVarG != null) {
                LogIntent logIntent = LogIntent.GOOGLE_ERROR;
                String str = String.format(BillingStrings.BILLING_INTENT_FAILED, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(fVarG)}, 1));
                q.e(str, "format(this, *args)");
                LogWrapperKt.log(logIntent, str);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$makePurchaseAsync$2, reason: invalid class name and case insensitive filesystem */
    static final class C02602 extends kotlin.jvm.internal.r implements l<PurchasesError, i0> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Boolean $isPersonalizedPrice;
        final /* synthetic */ PurchasingData $purchasingData;
        final /* synthetic */ ReplaceProductInfo $replaceProductInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02602(PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, String str, Boolean bool, Activity activity) {
            super(1);
            this.$purchasingData = purchasingData;
            this.$replaceProductInfo = replaceProductInfo;
            this.$appUserID = str;
            this.$isPersonalizedPrice = bool;
            this.$activity = activity;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener;
            Result resultBuildPurchaseParams = BillingWrapper.this.buildPurchaseParams((GooglePurchasingData) this.$purchasingData, this.$replaceProductInfo, this.$appUserID, this.$isPersonalizedPrice);
            if (resultBuildPurchaseParams instanceof Result.Success) {
                BillingWrapper.this.launchBillingFlow(this.$activity, (com.android.billingclient.api.e) ((Result.Success) resultBuildPurchaseParams).getValue());
            } else {
                if (!(resultBuildPurchaseParams instanceof Result.Error) || (purchasesUpdatedListener = BillingWrapper.this.getPurchasesUpdatedListener()) == null) {
                    return;
                }
                purchasesUpdatedListener.onPurchasesFailedToUpdate((PurchasesError) ((Result.Error) resultBuildPurchaseParams).getValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryAllPurchases$1, reason: invalid class name and case insensitive filesystem */
    static final class C02611 extends kotlin.jvm.internal.r implements l<List<? extends PurchaseHistoryRecord>, i0> {
        final /* synthetic */ l<List<StoreTransaction>, i0> $onReceivePurchaseHistory;
        final /* synthetic */ l<PurchasesError, i0> $onReceivePurchaseHistoryError;

        /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryAllPurchases$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00911 extends kotlin.jvm.internal.r implements l<List<? extends PurchaseHistoryRecord>, i0> {
            final /* synthetic */ l<List<StoreTransaction>, i0> $onReceivePurchaseHistory;
            final /* synthetic */ List<PurchaseHistoryRecord> $subsPurchasesList;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00911(l<? super List<StoreTransaction>, i0> lVar, List<? extends PurchaseHistoryRecord> list) {
                super(1);
                this.$onReceivePurchaseHistory = lVar;
                this.$subsPurchasesList = list;
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ i0 invoke(List<? extends PurchaseHistoryRecord> list) {
                invoke2(list);
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends PurchaseHistoryRecord> inAppPurchasesList) {
                q.f(inAppPurchasesList, "inAppPurchasesList");
                l<List<StoreTransaction>, i0> lVar = this.$onReceivePurchaseHistory;
                List<PurchaseHistoryRecord> list = this.$subsPurchasesList;
                ArrayList arrayList = new ArrayList(f6.p.m(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(StoreTransactionConversionsKt.toStoreTransaction((PurchaseHistoryRecord) it.next(), ProductType.SUBS));
                }
                ArrayList arrayList2 = new ArrayList(f6.p.m(inAppPurchasesList, 10));
                Iterator<T> it2 = inAppPurchasesList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(StoreTransactionConversionsKt.toStoreTransaction((PurchaseHistoryRecord) it2.next(), ProductType.INAPP));
                }
                lVar.invoke(w.K(arrayList, arrayList2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02611(l<? super PurchasesError, i0> lVar, l<? super List<StoreTransaction>, i0> lVar2) {
            super(1);
            this.$onReceivePurchaseHistoryError = lVar;
            this.$onReceivePurchaseHistory = lVar2;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(List<? extends PurchaseHistoryRecord> list) {
            invoke2(list);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends PurchaseHistoryRecord> subsPurchasesList) {
            q.f(subsPurchasesList, "subsPurchasesList");
            BillingWrapper.this.queryPurchaseHistoryAsync("inapp", new C00911(this.$onReceivePurchaseHistory, subsPurchasesList), this.$onReceivePurchaseHistoryError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseHistoryAsync$1, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C02621 extends o implements l<l<? super com.android.billingclient.api.b, ? extends i0>, i0> {
        C02621(Object obj) {
            super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(l<? super com.android.billingclient.api.b, ? extends i0> lVar) {
            invoke2((l<? super com.android.billingclient.api.b, i0>) lVar);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(l<? super com.android.billingclient.api.b, i0> p02) {
            q.f(p02, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(p02);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseHistoryAsync$2, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C02632 extends o implements p<Long, l<? super PurchasesError, ? extends i0>, i0> {
        C02632(Object obj) {
            super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ i0 invoke(Long l8, l<? super PurchasesError, ? extends i0> lVar) {
            invoke2(l8, (l<? super PurchasesError, i0>) lVar);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Long l8, l<? super PurchasesError, i0> p12) {
            q.f(p12, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l8, p12);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseType$1, reason: invalid class name and case insensitive filesystem */
    static final class C02641 extends kotlin.jvm.internal.r implements l<Map<String, ? extends StoreTransaction>, i0> {
        final /* synthetic */ String $purchaseToken;
        final /* synthetic */ l<Boolean, i0> $resultHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02641(l<? super Boolean, i0> lVar, String str) {
            super(1);
            this.$resultHandler = lVar;
            this.$purchaseToken = str;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends StoreTransaction> map) {
            invoke2((Map<String, StoreTransaction>) map);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, StoreTransaction> purchases) {
            q.f(purchases, "purchases");
            l<Boolean, i0> lVar = this.$resultHandler;
            Collection<StoreTransaction> collectionValues = purchases.values();
            String str = this.$purchaseToken;
            boolean z7 = false;
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator<T> it = collectionValues.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (q.b(((StoreTransaction) it.next()).getPurchaseToken(), str)) {
                        z7 = true;
                        break;
                    }
                }
            }
            lVar.invoke(Boolean.valueOf(z7));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseType$2, reason: invalid class name and case insensitive filesystem */
    static final class C02652 extends kotlin.jvm.internal.r implements l<PurchasesError, i0> {
        final /* synthetic */ l<ProductType, i0> $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02652(l<? super ProductType, i0> lVar) {
            super(1);
            this.$listener = lVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError error) {
            q.f(error, "error");
            LogUtilsKt.errorLog(error);
            this.$listener.invoke(ProductType.UNKNOWN);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseType$3, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C02663 extends o implements l<l<? super com.android.billingclient.api.b, ? extends i0>, i0> {
        C02663(Object obj) {
            super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(l<? super com.android.billingclient.api.b, ? extends i0> lVar) {
            invoke2((l<? super com.android.billingclient.api.b, i0>) lVar);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(l<? super com.android.billingclient.api.b, i0> p02) {
            q.f(p02, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(p02);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseType$4, reason: invalid class name */
    /* synthetic */ class AnonymousClass4 extends o implements p<Long, l<? super PurchasesError, ? extends i0>, i0> {
        AnonymousClass4(Object obj) {
            super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ i0 invoke(Long l8, l<? super PurchasesError, ? extends i0> lVar) {
            invoke2(l8, (l<? super PurchasesError, i0>) lVar);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Long l8, l<? super PurchasesError, i0> p12) {
            q.f(p12, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l8, p12);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchases$1, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C02671 extends o implements l<l<? super com.android.billingclient.api.b, ? extends i0>, i0> {
        C02671(Object obj) {
            super(1, obj, BillingWrapper.class, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(l<? super com.android.billingclient.api.b, ? extends i0> lVar) {
            invoke2((l<? super com.android.billingclient.api.b, i0>) lVar);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(l<? super com.android.billingclient.api.b, i0> p02) {
            q.f(p02, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(p02);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchases$2, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C02682 extends o implements p<Long, l<? super PurchasesError, ? extends i0>, i0> {
        C02682(Object obj) {
            super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ i0 invoke(Long l8, l<? super PurchasesError, ? extends i0> lVar) {
            invoke2(l8, (l<? super PurchasesError, i0>) lVar);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Long l8, l<? super PurchasesError, i0> p12) {
            q.f(p12, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l8, p12);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$showInAppMessagesIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    static final class C02691 extends kotlin.jvm.internal.r implements l<PurchasesError, i0> {
        final /* synthetic */ com.android.billingclient.api.g $inAppMessageParams;
        final /* synthetic */ p6.a<i0> $subscriptionStatusChange;
        final /* synthetic */ WeakReference<Activity> $weakActivity;

        /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$showInAppMessagesIfNeeded$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00921 extends kotlin.jvm.internal.r implements l<com.android.billingclient.api.b, i0> {
            final /* synthetic */ com.android.billingclient.api.g $inAppMessageParams;
            final /* synthetic */ p6.a<i0> $subscriptionStatusChange;
            final /* synthetic */ WeakReference<Activity> $weakActivity;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00921(WeakReference<Activity> weakReference, com.android.billingclient.api.g gVar, p6.a<i0> aVar) {
                super(1);
                this.$weakActivity = weakReference;
                this.$inAppMessageParams = gVar;
                this.$subscriptionStatusChange = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invoke$lambda$1(p6.a subscriptionStatusChange, j inAppMessageResult) {
                q.f(subscriptionStatusChange, "$subscriptionStatusChange");
                q.f(inAppMessageResult, "inAppMessageResult");
                int iA = inAppMessageResult.a();
                if (iA == 0) {
                    LogUtilsKt.verboseLog(BillingStrings.BILLING_INAPP_MESSAGE_NONE);
                    return;
                }
                if (iA == 1) {
                    LogUtilsKt.debugLog(BillingStrings.BILLING_INAPP_MESSAGE_UPDATE);
                    subscriptionStatusChange.invoke();
                } else {
                    String str = String.format(BillingStrings.BILLING_INAPP_MESSAGE_UNEXPECTED_CODE, Arrays.copyOf(new Object[]{Integer.valueOf(iA)}, 1));
                    q.e(str, "format(this, *args)");
                    LogUtilsKt.errorLog$default(str, null, 2, null);
                }
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ i0 invoke(com.android.billingclient.api.b bVar) {
                invoke2(bVar);
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(com.android.billingclient.api.b withConnectedClient) {
                q.f(withConnectedClient, "$this$withConnectedClient");
                Activity activity = this.$weakActivity.get();
                if (activity == null) {
                    LogUtilsKt.debugLog("Activity is null, not showing Google Play in-app message.");
                    return;
                }
                com.android.billingclient.api.g gVar = this.$inAppMessageParams;
                final p6.a<i0> aVar = this.$subscriptionStatusChange;
                withConnectedClient.l(activity, gVar, new i() { // from class: com.revenuecat.purchases.google.g
                    @Override // j1.i
                    public final void a(j jVar) {
                        BillingWrapper.C02691.C00921.invoke$lambda$1(aVar, jVar);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02691(WeakReference<Activity> weakReference, com.android.billingclient.api.g gVar, p6.a<i0> aVar) {
            super(1);
            this.$weakActivity = weakReference;
            this.$inAppMessageParams = gVar;
            this.$subscriptionStatusChange = aVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError == null) {
                BillingWrapper.this.withConnectedClient(new C00921(this.$weakActivity, this.$inAppMessageParams, this.$subscriptionStatusChange));
                return;
            }
            String str = String.format(BillingStrings.BILLING_CONNECTION_ERROR_INAPP_MESSAGES, Arrays.copyOf(new Object[]{purchasesError}, 1));
            q.e(str, "format(this, *args)");
            LogUtilsKt.errorLog$default(str, null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper(ClientFactory clientFactory, Handler mainHandler, DeviceCache deviceCache, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, DateProvider dateProvider) {
        super(purchasesStateProvider);
        q.f(clientFactory, "clientFactory");
        q.f(mainHandler, "mainHandler");
        q.f(deviceCache, "deviceCache");
        q.f(purchasesStateProvider, "purchasesStateProvider");
        q.f(dateProvider, "dateProvider");
        this.clientFactory = clientFactory;
        this.mainHandler = mainHandler;
        this.deviceCache = deviceCache;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.dateProvider = dateProvider;
        this.purchaseContext = new LinkedHashMap();
        this.serviceRequests = new ConcurrentLinkedQueue<>();
        this.reconnectMilliseconds = 1000L;
    }

    public /* synthetic */ BillingWrapper(ClientFactory clientFactory, Handler handler, DeviceCache deviceCache, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, DateProvider dateProvider, int i8, kotlin.jvm.internal.j jVar) {
        this(clientFactory, handler, deviceCache, diagnosticsTracker, purchasesStateProvider, (i8 & 32) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    private final Result<com.android.billingclient.api.e, PurchasesError> buildOneTimePurchaseParams(GooglePurchasingData.InAppProduct inAppProduct, String str, Boolean bool) {
        e.b.a aVarA = e.b.a();
        aVarA.c(inAppProduct.getProductDetails());
        e.b bVarA = aVarA.a();
        q.e(bVarA, "newBuilder().apply {\n   …etails)\n        }.build()");
        e.a aVarC = com.android.billingclient.api.e.a().d(f6.n.b(bVarA)).c(UtilsKt.sha256(str));
        if (bool != null) {
            aVarC.b(bool.booleanValue());
        }
        com.android.billingclient.api.e eVarA = aVarC.a();
        q.e(eVarA, "newBuilder()\n           …\n                .build()");
        return new Result.Success(eVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Result<com.android.billingclient.api.e, PurchasesError> buildPurchaseParams(GooglePurchasingData googlePurchasingData, ReplaceProductInfo replaceProductInfo, String str, Boolean bool) {
        if (googlePurchasingData instanceof GooglePurchasingData.InAppProduct) {
            return buildOneTimePurchaseParams((GooglePurchasingData.InAppProduct) googlePurchasingData, str, bool);
        }
        if (googlePurchasingData instanceof GooglePurchasingData.Subscription) {
            return buildSubscriptionPurchaseParams((GooglePurchasingData.Subscription) googlePurchasingData, replaceProductInfo, str, bool);
        }
        throw new e6.p();
    }

    private final Result<com.android.billingclient.api.e, PurchasesError> buildSubscriptionPurchaseParams(GooglePurchasingData.Subscription subscription, ReplaceProductInfo replaceProductInfo, String str, Boolean bool) {
        e.b.a aVarA = e.b.a();
        aVarA.b(subscription.getToken());
        aVarA.c(subscription.getProductDetails());
        e.b bVarA = aVarA.a();
        q.e(bVarA, "newBuilder().apply {\n   …etails)\n        }.build()");
        e.a aVarD = com.android.billingclient.api.e.a().d(f6.n.b(bVarA));
        if (replaceProductInfo != null) {
            q.e(aVarD, "buildSubscriptionPurchas…arams$lambda$29$lambda$27");
            BillingFlowParamsExtensionsKt.setUpgradeInfo(aVarD, replaceProductInfo);
            i0 i0Var = i0.f21430a;
        } else {
            q.e(aVarD.c(UtilsKt.sha256(str)), "setObfuscatedAccountId(appUserID.sha256())");
        }
        if (bool != null) {
            aVarD.b(bool.booleanValue());
        }
        com.android.billingclient.api.e eVarA = aVarD.a();
        q.e(eVarA, "newBuilder()\n           …\n                .build()");
        return new Result.Success(eVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endConnection$lambda$9(BillingWrapper this$0) {
        q.f(this$0, "this$0");
        synchronized (this$0) {
            com.android.billingclient.api.b bVar = this$0.billingClient;
            if (bVar != null) {
                LogIntent logIntent = LogIntent.DEBUG;
                String str = String.format(BillingStrings.BILLING_CLIENT_ENDING, Arrays.copyOf(new Object[]{bVar}, 1));
                q.e(str, "format(this, *args)");
                LogWrapperKt.log(logIntent, str);
                bVar.c();
            }
            this$0.billingClient = null;
            i0 i0Var = i0.f21430a;
        }
    }

    private final void executePendingRequests() {
        r<l<PurchasesError, i0>, Long> rVarPoll;
        synchronized (this) {
            while (true) {
                com.android.billingclient.api.b bVar = this.billingClient;
                boolean z7 = true;
                if (bVar == null || !bVar.f()) {
                    z7 = false;
                }
                if (!z7 || (rVarPoll = this.serviceRequests.poll()) == null) {
                    break;
                }
                q.e(rVarPoll, "poll()");
                final l<PurchasesError, i0> lVarA = rVarPoll.a();
                Long lB = rVarPoll.b();
                if (lB != null) {
                    this.mainHandler.postDelayed(new Runnable() { // from class: com.revenuecat.purchases.google.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            BillingWrapper.executePendingRequests$lambda$3$lambda$2$lambda$0(lVarA);
                        }
                    }, lB.longValue());
                } else {
                    this.mainHandler.post(new Runnable() { // from class: com.revenuecat.purchases.google.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            BillingWrapper.executePendingRequests$lambda$3$lambda$2$lambda$1(lVarA);
                        }
                    });
                }
            }
            i0 i0Var = i0.f21430a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executePendingRequests$lambda$3$lambda$2$lambda$0(l request) {
        q.f(request, "$request");
        request.invoke(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executePendingRequests$lambda$3$lambda$2$lambda$1(l request) {
        q.f(request, "$request");
        request.invoke(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executeRequestOnUIThread(Long l8, l<? super PurchasesError, i0> lVar) {
        if (getPurchasesUpdatedListener() != null) {
            this.serviceRequests.add(x.a(lVar, l8));
            com.android.billingclient.api.b bVar = this.billingClient;
            boolean z7 = false;
            if (bVar != null && !bVar.f()) {
                z7 = true;
            }
            if (z7) {
                BillingAbstract.startConnectionOnMainThread$default(this, 0L, 1, null);
            } else {
                executePendingRequests();
            }
        } else {
            lVar.invoke(new PurchasesError(PurchasesErrorCode.UnknownError, "BillingWrapper is not attached to a listener"));
        }
    }

    static /* synthetic */ void executeRequestOnUIThread$default(BillingWrapper billingWrapper, Long l8, l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            l8 = null;
        }
        billingWrapper.executeRequestOnUIThread(l8, lVar);
    }

    private final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        q.e(string, "stringWriter.toString()");
        return string;
    }

    private final void getStoreTransaction(Purchase purchase, l<? super StoreTransaction, i0> lVar) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(BillingStrings.BILLING_WRAPPER_PURCHASES_UPDATED, Arrays.copyOf(new Object[]{PurchaseExtensionsKt.toHumanReadableDescription(purchase)}, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        synchronized (this) {
            PurchaseContext purchaseContext = this.purchaseContext.get(PurchaseExtensionsKt.getFirstProductId(purchase));
            if (purchaseContext != null && purchaseContext.getProductType() != null) {
                lVar.invoke(StoreTransactionConversionsKt.toStoreTransaction(purchase, purchaseContext));
                return;
            }
            String strF = purchase.f();
            q.e(strF, "purchase.purchaseToken");
            getPurchaseType$purchases_defaultsRelease(strF, new BillingWrapper$getStoreTransaction$1$2(lVar, purchase, purchaseContext));
            i0 i0Var = i0.f21430a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchBillingFlow(Activity activity, com.android.billingclient.api.e eVar) {
        if (activity.getIntent() == null) {
            LogWrapperKt.log(LogIntent.WARNING, BillingStrings.NULL_ACTIVITY_INTENT);
        }
        withConnectedClient(new C02591(activity, eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBillingSetupFinished$lambda$18(com.android.billingclient.api.f billingResult, BillingWrapper this$0) {
        PurchasesError purchasesErrorBillingResponseToPurchasesError;
        q.f(billingResult, "$billingResult");
        q.f(this$0, "this$0");
        int iB = billingResult.b();
        if (iB != 6) {
            if (iB != 7 && iB != 8) {
                if (iB != 12) {
                    switch (iB) {
                        case -2:
                        case 3:
                            String humanReadableDescription = BillingResultExtensionsKt.toHumanReadableDescription(billingResult);
                            if (q.b(billingResult.a(), ErrorsKt.IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE)) {
                                String str = String.format(BillingStrings.BILLING_UNAVAILABLE_LESS_THAN_3, Arrays.copyOf(new Object[]{humanReadableDescription}, 1));
                                q.e(str, "format(this, *args)");
                                purchasesErrorBillingResponseToPurchasesError = new PurchasesError(PurchasesErrorCode.StoreProblemError, str);
                            } else {
                                String str2 = String.format(BillingStrings.BILLING_UNAVAILABLE, Arrays.copyOf(new Object[]{humanReadableDescription}, 1));
                                q.e(str2, "format(this, *args)");
                                purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(billingResult.b(), str2);
                            }
                            LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
                            this$0.sendErrorsToAllPendingRequests(purchasesErrorBillingResponseToPurchasesError);
                            break;
                        case 0:
                            LogIntent logIntent = LogIntent.DEBUG;
                            Object[] objArr = new Object[1];
                            com.android.billingclient.api.b bVar = this$0.billingClient;
                            objArr[0] = bVar != null ? bVar.toString() : null;
                            String str3 = String.format(BillingStrings.BILLING_SERVICE_SETUP_FINISHED, Arrays.copyOf(objArr, 1));
                            q.e(str3, "format(this, *args)");
                            LogWrapperKt.log(logIntent, str3);
                            BillingAbstract.StateListener stateListener = this$0.getStateListener();
                            if (stateListener != null) {
                                stateListener.onConnected();
                            }
                            this$0.executePendingRequests();
                            this$0.reconnectMilliseconds = 1000L;
                            this$0.trackProductDetailsNotSupportedIfNeeded();
                            break;
                    }
                }
            }
            LogIntent logIntent2 = LogIntent.GOOGLE_WARNING;
            String str4 = String.format(BillingStrings.BILLING_CLIENT_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(billingResult)}, 1));
            q.e(str4, "format(this, *args)");
            LogWrapperKt.log(logIntent2, str4);
            return;
        }
        LogIntent logIntent3 = LogIntent.GOOGLE_WARNING;
        String str5 = String.format(BillingStrings.BILLING_CLIENT_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(billingResult)}, 1));
        q.e(str5, "format(this, *args)");
        LogWrapperKt.log(logIntent3, str5);
        this$0.retryBillingServiceConnectionWithExponentialBackoff();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryPurchaseType(String str, String str2, l<? super ProductType, i0> lVar, l<? super Boolean, i0> lVar2) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, getAppInBackground(), str), new C02641(lVar2, str2), new C02652(lVar), new C02663(this), new AnonymousClass4(this)), 0L, 1, null);
    }

    private final void retryBillingServiceConnectionWithExponentialBackoff() {
        if (this.reconnectionAlreadyScheduled) {
            LogWrapperKt.log(LogIntent.WARNING, BillingStrings.BILLING_CLIENT_RETRY_ALREADY_SCHEDULED);
            return;
        }
        LogIntent logIntent = LogIntent.WARNING;
        String str = String.format(BillingStrings.BILLING_CLIENT_RETRY, Arrays.copyOf(new Object[]{Long.valueOf(this.reconnectMilliseconds)}, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.reconnectionAlreadyScheduled = true;
        startConnectionOnMainThread(this.reconnectMilliseconds);
        this.reconnectMilliseconds = Math.min(this.reconnectMilliseconds * ((long) 2), BillingClientUseCaseKt.RETRY_TIMER_MAX_TIME_MILLISECONDS);
    }

    private final synchronized void sendErrorsToAllPendingRequests(final PurchasesError purchasesError) {
        while (true) {
            r<l<PurchasesError, i0>, Long> rVarPoll = this.serviceRequests.poll();
            if (rVarPoll != null) {
                final l<PurchasesError, i0> lVarA = rVarPoll.a();
                this.mainHandler.post(new Runnable() { // from class: com.revenuecat.purchases.google.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        BillingWrapper.sendErrorsToAllPendingRequests$lambda$31$lambda$30(lVarA, purchasesError);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendErrorsToAllPendingRequests$lambda$31$lambda$30(l serviceRequest, PurchasesError error) {
        q.f(serviceRequest, "$serviceRequest");
        q.f(error, "$error");
        serviceRequest.invoke(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startConnectionOnMainThread$lambda$4(BillingWrapper this$0) {
        q.f(this$0, "this$0");
        this$0.startConnection();
    }

    private final void trackProductDetailsNotSupportedIfNeeded() {
        if (this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        com.android.billingclient.api.b bVar = this.billingClient;
        com.android.billingclient.api.f fVarE = bVar != null ? bVar.e("fff") : null;
        if (fVarE == null || fVarE.b() != -2) {
            return;
        }
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        int iB = fVarE.b();
        String strA = fVarE.a();
        q.e(strA, "billingResult.debugMessage");
        diagnosticsTracker.trackProductDetailsNotSupported(iB, strA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void withConnectedClient(l<? super com.android.billingclient.api.b, i0> lVar) {
        com.android.billingclient.api.b bVar = this.billingClient;
        i0 i0Var = null;
        if (bVar != null) {
            if (!bVar.f()) {
                bVar = null;
            }
            if (bVar != null) {
                lVar.invoke(bVar);
                i0Var = i0.f21430a;
            }
        }
        if (i0Var == null) {
            LogIntent logIntent = LogIntent.GOOGLE_WARNING;
            String str = String.format(BillingStrings.BILLING_CLIENT_DISCONNECTED, Arrays.copyOf(new Object[]{getStackTrace()}, 1));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
    }

    public final void acknowledge$purchases_defaultsRelease(String token, PostReceiptInitiationSource initiationSource, l<? super String, i0> onAcknowledged) {
        q.f(token, "token");
        q.f(initiationSource, "initiationSource");
        q.f(onAcknowledged, "onAcknowledged");
        LogIntent logIntent = LogIntent.PURCHASE;
        String str = String.format(PurchaseStrings.ACKNOWLEDGING_PURCHASE, Arrays.copyOf(new Object[]{token}, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        BillingClientUseCase.run$default(new AcknowledgePurchaseUseCase(new AcknowledgePurchaseUseCaseParams(token, initiationSource, getAppInBackground()), onAcknowledged, BillingWrapper$acknowledge$1.INSTANCE, new BillingWrapper$acknowledge$2(this), new BillingWrapper$acknowledge$3(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void consumeAndSave(boolean z7, StoreTransaction purchase, PostReceiptInitiationSource initiationSource) {
        q.f(purchase, "purchase");
        q.f(initiationSource, "initiationSource");
        if (purchase.getType() == ProductType.UNKNOWN || purchase.getPurchaseState() == PurchaseState.PENDING) {
            return;
        }
        Purchase originalGooglePurchase = StoreTransactionConversionsKt.getOriginalGooglePurchase(purchase);
        boolean zH = originalGooglePurchase != null ? originalGooglePurchase.h() : false;
        if (z7 && purchase.getType() == ProductType.INAPP) {
            consumePurchase$purchases_defaultsRelease(purchase.getPurchaseToken(), initiationSource, new AnonymousClass1(this.deviceCache));
        } else if (!z7 || zH) {
            this.deviceCache.addSuccessfullyPostedToken(purchase.getPurchaseToken());
        } else {
            acknowledge$purchases_defaultsRelease(purchase.getPurchaseToken(), initiationSource, new AnonymousClass2(this.deviceCache));
        }
    }

    public final void consumePurchase$purchases_defaultsRelease(String token, PostReceiptInitiationSource initiationSource, l<? super String, i0> onConsumed) {
        q.f(token, "token");
        q.f(initiationSource, "initiationSource");
        q.f(onConsumed, "onConsumed");
        LogIntent logIntent = LogIntent.PURCHASE;
        String str = String.format(PurchaseStrings.CONSUMING_PURCHASE, Arrays.copyOf(new Object[]{token}, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        BillingClientUseCase.run$default(new ConsumePurchaseUseCase(new ConsumePurchaseUseCaseParams(token, initiationSource, getAppInBackground()), onConsumed, BillingWrapper$consumePurchase$1.INSTANCE, new BillingWrapper$consumePurchase$2(this), new BillingWrapper$consumePurchase$3(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    protected void endConnection() {
        this.mainHandler.post(new Runnable() { // from class: com.revenuecat.purchases.google.a
            @Override // java.lang.Runnable
            public final void run() {
                BillingWrapper.endConnection$lambda$9(this.f20903a);
            }
        });
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void findPurchaseInPurchaseHistory(String appUserID, ProductType productType, String productId, l<? super StoreTransaction, i0> onCompletion, l<? super PurchasesError, i0> onError) {
        q.f(appUserID, "appUserID");
        q.f(productType, "productType");
        q.f(productId, "productId");
        q.f(onCompletion, "onCompletion");
        q.f(onError, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(RestoreStrings.QUERYING_PURCHASE_WITH_TYPE, Arrays.copyOf(new Object[]{productId, productType.name()}, 2));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        String googleProductType = ProductTypeConversionsKt.toGoogleProductType(productType);
        i0 i0Var = null;
        if (googleProductType != null) {
            BillingClientUseCase.run$default(new QueryPurchaseHistoryUseCase(new QueryPurchaseHistoryUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, googleProductType, getAppInBackground()), new BillingWrapper$findPurchaseInPurchaseHistory$1$1(productType, onCompletion, productId, onError), onError, new BillingWrapper$findPurchaseInPurchaseHistory$1$2(this), new BillingWrapper$findPurchaseInPurchaseHistory$1$3(this)), 0L, 1, null);
            i0Var = i0.f21430a;
        }
        if (i0Var == null) {
            onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, PurchaseStrings.NOT_RECOGNIZED_PRODUCT_TYPE));
        }
    }

    public final boolean getAppInBackground() {
        return getPurchasesStateProvider().getPurchasesState().getAppInBackground();
    }

    public final synchronized com.android.billingclient.api.b getBillingClient() {
        return this.billingClient;
    }

    public final void getPurchaseType$purchases_defaultsRelease(String purchaseToken, l<? super ProductType, i0> listener) {
        q.f(purchaseToken, "purchaseToken");
        q.f(listener, "listener");
        queryPurchaseType("subs", purchaseToken, listener, new BillingWrapper$getPurchaseType$1(listener, this, purchaseToken));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void getStorefront(l<? super String, i0> onSuccess, l<? super PurchasesError, i0> onError) {
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        LogUtilsKt.verboseLog(BillingStrings.BILLING_INITIATE_GETTING_COUNTRY_CODE);
        BillingClientUseCase.run$default(new GetBillingConfigUseCase(new GetBillingConfigUseCaseParams(getAppInBackground()), this.deviceCache, new C02571(onSuccess), onError, new C02582(this), new AnonymousClass3(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public boolean isConnected() {
        com.android.billingclient.api.b bVar = this.billingClient;
        if (bVar != null) {
            return bVar.f();
        }
        return false;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void makePurchaseAsync(Activity activity, String appUserID, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, String str, Boolean bool) {
        String optionId;
        String str2;
        GoogleReplacementMode googleReplacementMode;
        q.f(activity, "activity");
        q.f(appUserID, "appUserID");
        q.f(purchasingData, "purchasingData");
        GooglePurchasingData googlePurchasingData = purchasingData instanceof GooglePurchasingData ? (GooglePurchasingData) purchasingData : null;
        if (googlePurchasingData == null) {
            PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.UnknownError;
            String str3 = String.format(PurchaseStrings.INVALID_PURCHASE_TYPE, Arrays.copyOf(new Object[]{"Play", "GooglePurchasingData"}, 2));
            q.e(str3, "format(this, *args)");
            PurchasesError purchasesError = new PurchasesError(purchasesErrorCode, str3);
            LogUtilsKt.errorLog(purchasesError);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
                return;
            }
            return;
        }
        if (googlePurchasingData instanceof GooglePurchasingData.InAppProduct) {
            optionId = null;
        } else {
            if (!(googlePurchasingData instanceof GooglePurchasingData.Subscription)) {
                throw new e6.p();
            }
            optionId = ((GooglePurchasingData.Subscription) googlePurchasingData).getOptionId();
        }
        if (replaceProductInfo != null) {
            LogIntent logIntent = LogIntent.PURCHASE;
            String str4 = String.format(PurchaseStrings.UPGRADING_SKU, Arrays.copyOf(new Object[]{replaceProductInfo.getOldPurchase().getProductIds().get(0), googlePurchasingData.getProductId()}, 2));
            q.e(str4, "format(this, *args)");
            LogWrapperKt.log(logIntent, str4);
        } else {
            LogIntent logIntent2 = LogIntent.PURCHASE;
            String str5 = String.format(PurchaseStrings.PURCHASING_PRODUCT, Arrays.copyOf(new Object[]{googlePurchasingData.getProductId()}, 1));
            q.e(str5, "format(this, *args)");
            LogWrapperKt.log(logIntent2, str5);
        }
        synchronized (this) {
            String productId = googlePurchasingData.getProductId();
            Map<String, PurchaseContext> map = this.purchaseContext;
            ProductType productType = googlePurchasingData.getProductType();
            ReplacementMode replacementMode = replaceProductInfo != null ? replaceProductInfo.getReplacementMode() : null;
            if (replacementMode instanceof GoogleReplacementMode) {
                googleReplacementMode = (GoogleReplacementMode) replacementMode;
                str2 = str;
            } else {
                str2 = str;
                googleReplacementMode = null;
            }
            map.put(productId, new PurchaseContext(productType, str2, optionId, googleReplacementMode));
            i0 i0Var = i0.f21430a;
        }
        executeRequestOnUIThread$default(this, null, new C02602(purchasingData, replaceProductInfo, appUserID, bool, activity), 1, null);
    }

    @Override // j1.d
    public void onBillingServiceDisconnected() {
        LogIntent logIntent = LogIntent.WARNING;
        Object[] objArr = new Object[1];
        com.android.billingclient.api.b bVar = this.billingClient;
        objArr[0] = bVar != null ? bVar.toString() : null;
        String str = String.format(BillingStrings.BILLING_SERVICE_DISCONNECTED_INSTANCE, Arrays.copyOf(objArr, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
    }

    @Override // j1.d
    public void onBillingSetupFinished(final com.android.billingclient.api.f billingResult) {
        q.f(billingResult, "billingResult");
        this.mainHandler.post(new Runnable() { // from class: com.revenuecat.purchases.google.e
            @Override // java.lang.Runnable
            public final void run() {
                BillingWrapper.onBillingSetupFinished$lambda$18(billingResult, this);
            }
        });
    }

    @Override // j1.n
    public void onPurchasesUpdated(com.android.billingclient.api.f billingResult, List<? extends Purchase> list) {
        q.f(billingResult, "billingResult");
        List<? extends Purchase> listD = list == null ? f6.o.d() : list;
        if (billingResult.b() == 0 && (!listD.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                getStoreTransaction((Purchase) it.next(), new BillingWrapper$onPurchasesUpdated$1$1(arrayList, listD, this));
            }
            return;
        }
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        StringBuilder sb = new StringBuilder();
        String str = String.format(BillingStrings.BILLING_WRAPPER_PURCHASES_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(billingResult)}, 1));
        q.e(str, "format(this, *args)");
        sb.append(str);
        String str2 = null;
        List<? extends Purchase> list2 = !listD.isEmpty() ? listD : null;
        if (list2 != null) {
            str2 = "Purchases:" + w.G(list2, ", ", null, null, 0, null, BillingWrapper$onPurchasesUpdated$3$1.INSTANCE, 30, null);
        }
        sb.append(str2);
        LogWrapperKt.log(logIntent, sb.toString());
        String str3 = "Error updating purchases. " + BillingResultExtensionsKt.toHumanReadableDescription(billingResult);
        int iB = billingResult.b();
        if (list == null && billingResult.b() == 0) {
            iB = 6;
            str3 = "Error: onPurchasesUpdated received an OK BillingResult with a Null purchases list.";
        }
        PurchasesError purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(iB, str3);
        LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesErrorBillingResponseToPurchasesError);
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryAllPurchases(String appUserID, l<? super List<StoreTransaction>, i0> onReceivePurchaseHistory, l<? super PurchasesError, i0> onReceivePurchaseHistoryError) {
        q.f(appUserID, "appUserID");
        q.f(onReceivePurchaseHistory, "onReceivePurchaseHistory");
        q.f(onReceivePurchaseHistoryError, "onReceivePurchaseHistoryError");
        queryPurchaseHistoryAsync("subs", new C02611(onReceivePurchaseHistoryError, onReceivePurchaseHistory), onReceivePurchaseHistoryError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryProductDetailsAsync(ProductType productType, Set<String> productIds, l<? super List<? extends StoreProduct>, i0> onReceive, l<? super PurchasesError, i0> onError) {
        q.f(productType, "productType");
        q.f(productIds, "productIds");
        q.f(onReceive, "onReceive");
        q.f(onError, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(OfferingStrings.FETCHING_PRODUCTS, Arrays.copyOf(new Object[]{w.G(productIds, null, null, null, 0, null, null, 63, null)}, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        BillingClientUseCase.run$default(new QueryProductDetailsUseCase(new QueryProductDetailsUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, productIds, productType, getAppInBackground()), onReceive, onError, new BillingWrapper$queryProductDetailsAsync$useCase$1(this), new BillingWrapper$queryProductDetailsAsync$useCase$2(this)), 0L, 1, null);
    }

    public final void queryPurchaseHistoryAsync(String productType, l<? super List<? extends PurchaseHistoryRecord>, i0> onReceivePurchaseHistory, l<? super PurchasesError, i0> onReceivePurchaseHistoryError) {
        q.f(productType, "productType");
        q.f(onReceivePurchaseHistory, "onReceivePurchaseHistory");
        q.f(onReceivePurchaseHistoryError, "onReceivePurchaseHistoryError");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(RestoreStrings.QUERYING_PURCHASE_HISTORY, Arrays.copyOf(new Object[]{productType}, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        BillingClientUseCase.run$default(new QueryPurchaseHistoryUseCase(new QueryPurchaseHistoryUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, productType, getAppInBackground()), onReceivePurchaseHistory, onReceivePurchaseHistoryError, new C02621(this), new C02632(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryPurchases(String appUserID, l<? super Map<String, StoreTransaction>, i0> onSuccess, l<? super PurchasesError, i0> onError) {
        q.f(appUserID, "appUserID");
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.QUERYING_PURCHASE);
        BillingClientUseCase.run$default(new QueryPurchasesUseCase(new QueryPurchasesUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, getAppInBackground()), onSuccess, onError, new C02671(this), new C02682(this)), 0L, 1, null);
    }

    public final synchronized void setBillingClient(com.android.billingclient.api.b bVar) {
        this.billingClient = bVar;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes, p6.a<i0> subscriptionStatusChange) {
        q.f(activity, "activity");
        q.f(inAppMessageTypes, "inAppMessageTypes");
        q.f(subscriptionStatusChange, "subscriptionStatusChange");
        if (inAppMessageTypes.isEmpty()) {
            LogUtilsKt.errorLog$default(BillingStrings.BILLING_UNSPECIFIED_INAPP_MESSAGE_TYPES, null, 2, null);
            return;
        }
        g.a aVarA = com.android.billingclient.api.g.a();
        q.e(aVarA, "newBuilder()");
        Iterator<? extends InAppMessageType> it = inAppMessageTypes.iterator();
        while (it.hasNext()) {
            aVarA.a(it.next().getInAppMessageCategoryId$purchases_defaultsRelease());
        }
        com.android.billingclient.api.g gVarB = aVarA.b();
        q.e(gVarB, "inAppMessageParamsBuilder.build()");
        executeRequestOnUIThread$default(this, null, new C02691(new WeakReference(activity), gVarB, subscriptionStatusChange), 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnection() {
        synchronized (this) {
            if (this.billingClient == null) {
                this.billingClient = this.clientFactory.buildClient(this);
            }
            this.reconnectionAlreadyScheduled = false;
            com.android.billingclient.api.b bVar = this.billingClient;
            if (bVar != null) {
                if (!bVar.f()) {
                    LogIntent logIntent = LogIntent.DEBUG;
                    String str = String.format(BillingStrings.BILLING_CLIENT_STARTING, Arrays.copyOf(new Object[]{bVar}, 1));
                    q.e(str, "format(this, *args)");
                    LogWrapperKt.log(logIntent, str);
                    try {
                        bVar.m(this);
                    } catch (IllegalStateException e8) {
                        LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
                        String str2 = String.format(BillingStrings.ILLEGAL_STATE_EXCEPTION_WHEN_CONNECTING, Arrays.copyOf(new Object[]{e8}, 1));
                        q.e(str2, "format(this, *args)");
                        LogWrapperKt.log(logIntent2, str2);
                        sendErrorsToAllPendingRequests(new PurchasesError(PurchasesErrorCode.StoreProblemError, e8.getMessage()));
                    }
                }
                i0 i0Var = i0.f21430a;
            }
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnectionOnMainThread(long j8) {
        this.mainHandler.postDelayed(new Runnable() { // from class: com.revenuecat.purchases.google.d
            @Override // java.lang.Runnable
            public final void run() {
                BillingWrapper.startConnectionOnMainThread$lambda$4(this.f20906a);
            }
        }, j8);
    }
}
