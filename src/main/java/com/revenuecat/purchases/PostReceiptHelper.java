package com.revenuecat.purchases;

import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.subscriberattributes.BackendHelpersKt;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import e6.i0;
import java.util.Map;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.json.JSONObject;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class PostReceiptHelper {
    private final AppConfig appConfig;
    private final Backend backend;
    private final BillingAbstract billing;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DeviceCache deviceCache;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PaywallPresentedCache paywallPresentedCache;
    private final SubscriberAttributesManager subscriberAttributesManager;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$calculateOfflineCustomerInfo$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<CustomerInfo, i0> {
        final /* synthetic */ l<CustomerInfo, i0> $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super CustomerInfo, i0> lVar) {
            super(1);
            this.$onSuccess = lVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo) {
            q.f(customerInfo, "customerInfo");
            PostReceiptHelper.this.customerInfoUpdateHandler.notifyListeners(customerInfo);
            this.$onSuccess.invoke(customerInfo);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$calculateOfflineCustomerInfo$2, reason: invalid class name */
    static final class AnonymousClass2 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(l<? super PurchasesError, i0> lVar) {
            super(1);
            this.$onError = lVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError error) {
            q.f(error, "error");
            this.$onError.invoke(error);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postReceiptAndSubscriberAttributes$1, reason: invalid class name and case insensitive filesystem */
    static final class C02121 extends r implements l<Map<String, ? extends SubscriberAttribute>, i0> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ PostReceiptInitiationSource $initiationSource;
        final /* synthetic */ boolean $isRestore;
        final /* synthetic */ String $marketplace;
        final /* synthetic */ p6.q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0> $onError;
        final /* synthetic */ l<CustomerInfo, i0> $onSuccess;
        final /* synthetic */ PaywallEvent $presentedPaywall;
        final /* synthetic */ String $purchaseToken;
        final /* synthetic */ ReceiptInfo $receiptInfo;
        final /* synthetic */ String $storeUserID;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postReceiptAndSubscriberAttributes$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00801 extends r implements p<CustomerInfo, JSONObject, i0> {
            final /* synthetic */ String $appUserID;
            final /* synthetic */ l<CustomerInfo, i0> $onSuccess;
            final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
            final /* synthetic */ PostReceiptHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00801(PostReceiptHelper postReceiptHelper, String str, Map<String, SubscriberAttribute> map, l<? super CustomerInfo, i0> lVar) {
                super(2);
                this.this$0 = postReceiptHelper;
                this.$appUserID = str;
                this.$unsyncedSubscriberAttributesByKey = map;
                this.$onSuccess = lVar;
            }

            @Override // p6.p
            public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo, JSONObject jSONObject) {
                invoke2(customerInfo, jSONObject);
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CustomerInfo customerInfo, JSONObject responseBody) {
                q.f(customerInfo, "customerInfo");
                q.f(responseBody, "responseBody");
                this.this$0.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
                this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(responseBody));
                this.this$0.customerInfoUpdateHandler.cacheAndNotifyListeners(customerInfo);
                this.$onSuccess.invoke(customerInfo);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postReceiptAndSubscriberAttributes$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends r implements p6.q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0> {
            final /* synthetic */ String $appUserID;
            final /* synthetic */ p6.q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0> $onError;
            final /* synthetic */ PaywallEvent $presentedPaywall;
            final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
            final /* synthetic */ PostReceiptHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(PaywallEvent paywallEvent, PostReceiptHelper postReceiptHelper, String str, Map<String, SubscriberAttribute> map, p6.q<? super PurchasesError, ? super PostReceiptErrorHandlingBehavior, ? super JSONObject, i0> qVar) {
                super(3);
                this.$presentedPaywall = paywallEvent;
                this.this$0 = postReceiptHelper;
                this.$appUserID = str;
                this.$unsyncedSubscriberAttributesByKey = map;
                this.$onError = qVar;
            }

            @Override // p6.q
            public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
                invoke2(purchasesError, postReceiptErrorHandlingBehavior, jSONObject);
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError error, PostReceiptErrorHandlingBehavior errorHandlingBehavior, JSONObject jSONObject) {
                q.f(error, "error");
                q.f(errorHandlingBehavior, "errorHandlingBehavior");
                PaywallEvent paywallEvent = this.$presentedPaywall;
                if (paywallEvent != null) {
                    this.this$0.paywallPresentedCache.cachePresentedPaywall(paywallEvent);
                }
                if (errorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_CONSUMED) {
                    this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(jSONObject));
                }
                this.$onError.invoke(error, errorHandlingBehavior, jSONObject);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02121(String str, String str2, boolean z7, ReceiptInfo receiptInfo, String str3, String str4, PostReceiptInitiationSource postReceiptInitiationSource, PaywallEvent paywallEvent, l<? super CustomerInfo, i0> lVar, p6.q<? super PurchasesError, ? super PostReceiptErrorHandlingBehavior, ? super JSONObject, i0> qVar) {
            super(1);
            this.$purchaseToken = str;
            this.$appUserID = str2;
            this.$isRestore = z7;
            this.$receiptInfo = receiptInfo;
            this.$storeUserID = str3;
            this.$marketplace = str4;
            this.$initiationSource = postReceiptInitiationSource;
            this.$presentedPaywall = paywallEvent;
            this.$onSuccess = lVar;
            this.$onError = qVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends SubscriberAttribute> map) {
            invoke2((Map<String, SubscriberAttribute>) map);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, SubscriberAttribute> unsyncedSubscriberAttributesByKey) {
            q.f(unsyncedSubscriberAttributesByKey, "unsyncedSubscriberAttributesByKey");
            Backend backend = PostReceiptHelper.this.backend;
            String str = this.$purchaseToken;
            String str2 = this.$appUserID;
            boolean z7 = this.$isRestore;
            boolean z8 = !PostReceiptHelper.this.getFinishTransactions();
            Map<String, Map<String, Object>> backendMap = BackendHelpersKt.toBackendMap(unsyncedSubscriberAttributesByKey);
            ReceiptInfo receiptInfo = this.$receiptInfo;
            String str3 = this.$storeUserID;
            String str4 = this.$marketplace;
            PostReceiptInitiationSource postReceiptInitiationSource = this.$initiationSource;
            PaywallEvent paywallEvent = this.$presentedPaywall;
            backend.postReceiptData(str, str2, z7, z8, backendMap, receiptInfo, str3, str4, postReceiptInitiationSource, paywallEvent != null ? paywallEvent.toPaywallPostReceiptData$purchases_defaultsRelease() : null, new C00801(PostReceiptHelper.this, this.$appUserID, unsyncedSubscriberAttributesByKey, this.$onSuccess), new AnonymousClass2(this.$presentedPaywall, PostReceiptHelper.this, this.$appUserID, unsyncedSubscriberAttributesByKey, this.$onError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$1, reason: invalid class name and case insensitive filesystem */
    static final class C02131 extends r implements l<CustomerInfo, i0> {
        final /* synthetic */ l<CustomerInfo, i0> $onSuccess;
        final /* synthetic */ String $purchaseToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02131(String str, l<? super CustomerInfo, i0> lVar) {
            super(1);
            this.$purchaseToken = str;
            this.$onSuccess = lVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo it) {
            q.f(it, "it");
            PostReceiptHelper.this.deviceCache.addSuccessfullyPostedToken(this.$purchaseToken);
            this.$onSuccess.invoke(it);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2, reason: invalid class name and case insensitive filesystem */
    static final class C02142 extends r implements p6.q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<CustomerInfo, i0> $onSuccess;
        final /* synthetic */ String $purchaseToken;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends r implements l<CustomerInfo, i0> {
            final /* synthetic */ l<CustomerInfo, i0> $onSuccess;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(l<? super CustomerInfo, i0> lVar) {
                super(1);
                this.$onSuccess = lVar;
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
                invoke2(customerInfo);
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CustomerInfo it) {
                q.f(it, "it");
                this.$onSuccess.invoke(it);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2$2, reason: invalid class name and collision with other inner class name */
        static final class C00812 extends r implements p6.a<i0> {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ l<PurchasesError, i0> $onError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00812(l<? super PurchasesError, i0> lVar, PurchasesError purchasesError) {
                super(0);
                this.$onError = lVar;
                this.$backendError = purchasesError;
            }

            @Override // p6.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$onError.invoke(this.$backendError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02142(String str, String str2, l<? super CustomerInfo, i0> lVar, l<? super PurchasesError, i0> lVar2) {
            super(3);
            this.$purchaseToken = str;
            this.$appUserID = str2;
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        @Override // p6.q
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
            invoke2(purchasesError, postReceiptErrorHandlingBehavior, jSONObject);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError backendError, PostReceiptErrorHandlingBehavior errorHandlingBehavior, JSONObject jSONObject) {
            q.f(backendError, "backendError");
            q.f(errorHandlingBehavior, "errorHandlingBehavior");
            if (errorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_CONSUMED) {
                PostReceiptHelper.this.deviceCache.addSuccessfullyPostedToken(this.$purchaseToken);
            }
            PostReceiptHelper.this.useOfflineEntitlementsCustomerInfoIfNeeded(errorHandlingBehavior, this.$appUserID, new AnonymousClass1(this.$onSuccess), new C00812(this.$onError, backendError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    static final class C02151 extends r implements l<CustomerInfo, i0> {
        final /* synthetic */ PostReceiptInitiationSource $initiationSource;
        final /* synthetic */ p<StoreTransaction, CustomerInfo, i0> $onSuccess;
        final /* synthetic */ StoreTransaction $purchase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02151(StoreTransaction storeTransaction, PostReceiptInitiationSource postReceiptInitiationSource, p<? super StoreTransaction, ? super CustomerInfo, i0> pVar) {
            super(1);
            this.$purchase = storeTransaction;
            this.$initiationSource = postReceiptInitiationSource;
            this.$onSuccess = pVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo info) {
            q.f(info, "info");
            PostReceiptHelper.this.billing.consumeAndSave(PostReceiptHelper.this.getFinishTransactions(), this.$purchase, this.$initiationSource);
            p<StoreTransaction, CustomerInfo, i0> pVar = this.$onSuccess;
            if (pVar != null) {
                pVar.invoke(this.$purchase, info);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$2, reason: invalid class name and case insensitive filesystem */
    static final class C02162 extends r implements p6.q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ PostReceiptInitiationSource $initiationSource;
        final /* synthetic */ p<StoreTransaction, PurchasesError, i0> $onError;
        final /* synthetic */ p<StoreTransaction, CustomerInfo, i0> $onSuccess;
        final /* synthetic */ StoreTransaction $purchase;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends r implements l<CustomerInfo, i0> {
            final /* synthetic */ p<StoreTransaction, CustomerInfo, i0> $onSuccess;
            final /* synthetic */ StoreTransaction $purchase;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(p<? super StoreTransaction, ? super CustomerInfo, i0> pVar, StoreTransaction storeTransaction) {
                super(1);
                this.$onSuccess = pVar;
                this.$purchase = storeTransaction;
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
                invoke2(customerInfo);
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CustomerInfo customerInfo) {
                q.f(customerInfo, "customerInfo");
                p<StoreTransaction, CustomerInfo, i0> pVar = this.$onSuccess;
                if (pVar != null) {
                    pVar.invoke(this.$purchase, customerInfo);
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$2$2, reason: invalid class name and collision with other inner class name */
        static final class C00822 extends r implements p6.a<i0> {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ p<StoreTransaction, PurchasesError, i0> $onError;
            final /* synthetic */ StoreTransaction $purchase;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00822(p<? super StoreTransaction, ? super PurchasesError, i0> pVar, StoreTransaction storeTransaction, PurchasesError purchasesError) {
                super(0);
                this.$onError = pVar;
                this.$purchase = storeTransaction;
                this.$backendError = purchasesError;
            }

            @Override // p6.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                p<StoreTransaction, PurchasesError, i0> pVar = this.$onError;
                if (pVar != null) {
                    pVar.invoke(this.$purchase, this.$backendError);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02162(StoreTransaction storeTransaction, PostReceiptInitiationSource postReceiptInitiationSource, String str, p<? super StoreTransaction, ? super CustomerInfo, i0> pVar, p<? super StoreTransaction, ? super PurchasesError, i0> pVar2) {
            super(3);
            this.$purchase = storeTransaction;
            this.$initiationSource = postReceiptInitiationSource;
            this.$appUserID = str;
            this.$onSuccess = pVar;
            this.$onError = pVar2;
        }

        @Override // p6.q
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
            invoke2(purchasesError, postReceiptErrorHandlingBehavior, jSONObject);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError backendError, PostReceiptErrorHandlingBehavior errorHandlingBehavior, JSONObject jSONObject) {
            q.f(backendError, "backendError");
            q.f(errorHandlingBehavior, "errorHandlingBehavior");
            if (errorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_CONSUMED) {
                PostReceiptHelper.this.billing.consumeAndSave(PostReceiptHelper.this.getFinishTransactions(), this.$purchase, this.$initiationSource);
            }
            PostReceiptHelper.this.useOfflineEntitlementsCustomerInfoIfNeeded(errorHandlingBehavior, this.$appUserID, new AnonymousClass1(this.$onSuccess, this.$purchase), new C00822(this.$onError, this.$purchase, backendError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$useOfflineEntitlementsCustomerInfoIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    static final class C02171 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ p6.a<i0> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02171(p6.a<i0> aVar) {
            super(1);
            this.$onError = aVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError it) {
            q.f(it, "it");
            this.$onError.invoke();
        }
    }

    public PostReceiptHelper(AppConfig appConfig, Backend backend, BillingAbstract billing, CustomerInfoUpdateHandler customerInfoUpdateHandler, DeviceCache deviceCache, SubscriberAttributesManager subscriberAttributesManager, OfflineEntitlementsManager offlineEntitlementsManager, PaywallPresentedCache paywallPresentedCache) {
        q.f(appConfig, "appConfig");
        q.f(backend, "backend");
        q.f(billing, "billing");
        q.f(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        q.f(deviceCache, "deviceCache");
        q.f(subscriberAttributesManager, "subscriberAttributesManager");
        q.f(offlineEntitlementsManager, "offlineEntitlementsManager");
        q.f(paywallPresentedCache, "paywallPresentedCache");
        this.appConfig = appConfig;
        this.backend = backend;
        this.billing = billing;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.deviceCache = deviceCache;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.paywallPresentedCache = paywallPresentedCache;
    }

    private final void calculateOfflineCustomerInfo(String str, l<? super CustomerInfo, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        this.offlineEntitlementsManager.calculateAndCacheOfflineCustomerInfo(str, new AnonymousClass1(lVar), new AnonymousClass2(lVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getFinishTransactions() {
        return this.appConfig.getFinishTransactions();
    }

    private final void postReceiptAndSubscriberAttributes(String str, String str2, boolean z7, ReceiptInfo receiptInfo, String str3, String str4, PostReceiptInitiationSource postReceiptInitiationSource, l<? super CustomerInfo, i0> lVar, p6.q<? super PurchasesError, ? super PostReceiptErrorHandlingBehavior, ? super JSONObject, i0> qVar) {
        this.subscriberAttributesManager.getUnsyncedSubscriberAttributes(str, new C02121(str2, str, z7, receiptInfo, str3, str4, postReceiptInitiationSource, this.paywallPresentedCache.getAndRemovePresentedEvent(), lVar, qVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void useOfflineEntitlementsCustomerInfoIfNeeded(PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, String str, l<? super CustomerInfo, i0> lVar, p6.a<i0> aVar) {
        if (this.offlineEntitlementsManager.shouldCalculateOfflineCustomerInfoInPostReceipt(postReceiptErrorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME)) {
            calculateOfflineCustomerInfo(str, lVar, new C02171(aVar));
        } else {
            aVar.invoke();
        }
    }

    public final void postTokenWithoutConsuming(String purchaseToken, String str, ReceiptInfo receiptInfo, boolean z7, String appUserID, String str2, PostReceiptInitiationSource initiationSource, l<? super CustomerInfo, i0> onSuccess, l<? super PurchasesError, i0> onError) {
        q.f(purchaseToken, "purchaseToken");
        q.f(receiptInfo, "receiptInfo");
        q.f(appUserID, "appUserID");
        q.f(initiationSource, "initiationSource");
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        postReceiptAndSubscriberAttributes(appUserID, purchaseToken, z7, receiptInfo, str, str2, initiationSource, new C02131(purchaseToken, onSuccess), new C02142(purchaseToken, appUserID, onSuccess, onError));
    }

    public final void postTransactionAndConsumeIfNeeded(StoreTransaction purchase, StoreProduct storeProduct, boolean z7, String appUserID, PostReceiptInitiationSource initiationSource, p<? super StoreTransaction, ? super CustomerInfo, i0> pVar, p<? super StoreTransaction, ? super PurchasesError, i0> pVar2) {
        q.f(purchase, "purchase");
        q.f(appUserID, "appUserID");
        q.f(initiationSource, "initiationSource");
        postReceiptAndSubscriberAttributes(appUserID, purchase.getPurchaseToken(), z7, new ReceiptInfo(purchase.getProductIds(), purchase.getPresentedOfferingIdentifier(), purchase.getSubscriptionOptionId(), storeProduct, null, null, purchase.getReplacementMode(), 48, null), purchase.getStoreUserID(), purchase.getMarketplace(), initiationSource, new C02151(purchase, initiationSource, pVar), new C02162(purchase, initiationSource, appUserID, pVar, pVar2));
    }
}
