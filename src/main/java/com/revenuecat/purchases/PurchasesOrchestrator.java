package com.revenuecat.purchases;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.lifecycle.t;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.PurchaseErrorCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallEventsManager;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import com.revenuecat.purchases.strings.IdentityStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.CustomActivityLifecycleHandler;
import e6.i0;
import e6.k;
import e6.m;
import e6.x;
import f6.j0;
import f6.k0;
import f6.o;
import f6.o0;
import f6.p0;
import f6.w;
import j1.n;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.y;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class PurchasesOrchestrator implements LifecycleDelegate, CustomActivityLifecycleHandler {
    public static final String frameworkVersion = "7.4.0";
    private static URL proxyURL;
    private AppConfig appConfig;
    private final Application application;
    private final Backend backend;
    private final BillingAbstract billing;
    private final CustomerInfoHelper customerInfoHelper;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DeviceCache deviceCache;
    private final IdentityManager identityManager;
    private final k lifecycleHandler$delegate;
    private final Handler mainHandler;
    private final OfferingsManager offeringsManager;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PaywallEventsManager paywallEventsManager;
    private final PaywallPresentedCache paywallPresentedCache;
    private final PostPendingTransactionsHelper postPendingTransactionsHelper;
    private final PostReceiptHelper postReceiptHelper;
    private final PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper;
    private final PurchasesStateCache purchasesStateCache;
    private final SubscriberAttributesManager subscriberAttributesManager;
    private final SyncPurchasesHelper syncPurchasesHelper;
    public static final Companion Companion = new Companion(null);
    private static PlatformInfo platformInfo = new PlatformInfo("native", null);

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$2, reason: invalid class name */
    static final class AnonymousClass2 extends r implements p6.a<i0> {
        AnonymousClass2() {
            super(0);
        }

        @Override // p6.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            t.n().a().a(PurchasesOrchestrator.this.getLifecycleHandler());
            PurchasesOrchestrator.this.application.registerActivityLifecycleCallbacks(PurchasesOrchestrator.this);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void canMakePayments$default(Companion companion, Context context, List list, Callback callback, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                list = o.d();
            }
            companion.canMakePayments(context, list, callback);
        }

        public final void canMakePayments(Context context, List<? extends BillingFeature> features, Callback<Boolean> callback) {
            q.f(context, "context");
            q.f(features, "features");
            q.f(callback, "callback");
            com.android.billingclient.api.b bVarA = com.android.billingclient.api.b.h(context).b().c(new n() { // from class: com.revenuecat.purchases.f
                @Override // j1.n
                public final void onPurchasesUpdated(com.android.billingclient.api.f fVar, List list) {
                    q.f(fVar, "<anonymous parameter 0>");
                }
            }).a();
            bVarA.m(new PurchasesOrchestrator$Companion$canMakePayments$2$1(new Handler(context.getMainLooper()), callback, bVarA, features));
        }

        public final boolean getDebugLogsEnabled() {
            return LogUtilsKt.getDebugLogsEnabled(getLogLevel());
        }

        public final synchronized LogHandler getLogHandler() {
            return LogWrapperKt.getCurrentLogHandler();
        }

        public final LogLevel getLogLevel() {
            return Config.INSTANCE.getLogLevel();
        }

        public final PlatformInfo getPlatformInfo() {
            return PurchasesOrchestrator.platformInfo;
        }

        public final URL getProxyURL() {
            return PurchasesOrchestrator.proxyURL;
        }

        public final void setDebugLogsEnabled(boolean z7) {
            setLogLevel(LogUtilsKt.debugLogsEnabled(LogLevel.Companion, z7));
        }

        public final synchronized void setLogHandler(LogHandler value) {
            q.f(value, "value");
            LogWrapperKt.setCurrentLogHandler(value);
        }

        public final void setLogLevel(LogLevel value) {
            q.f(value, "value");
            Config.INSTANCE.setLogLevel(value);
        }

        public final void setPlatformInfo(PlatformInfo platformInfo) {
            q.f(platformInfo, "<set-?>");
            PurchasesOrchestrator.platformInfo = platformInfo;
        }

        public final void setProxyURL(URL url) {
            PurchasesOrchestrator.proxyURL = url;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$close$2, reason: invalid class name and case insensitive filesystem */
    static final class C02182 extends r implements p6.a<i0> {
        C02182() {
            super(0);
        }

        @Override // p6.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            t.n().a().c(PurchasesOrchestrator.this.getLifecycleHandler());
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$dispatch$1, reason: invalid class name and case insensitive filesystem */
    static final class C02191 extends r implements p6.a<i0> {
        final /* synthetic */ PurchasesError $error;
        final /* synthetic */ PurchaseErrorCallback $this_dispatch;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02191(PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
            super(0);
            this.$this_dispatch = purchaseErrorCallback;
            this.$error = purchasesError;
        }

        @Override // p6.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PurchaseErrorCallback purchaseErrorCallback = this.$this_dispatch;
            PurchasesError purchasesError = this.$error;
            purchaseErrorCallback.onError(purchasesError, purchasesError.getCode() == PurchasesErrorCode.PurchaseCancelledError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getOfferings$1, reason: invalid class name and case insensitive filesystem */
    static final class C02201 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ ReceiveOfferingsCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02201(ReceiveOfferingsCallback receiveOfferingsCallback) {
            super(1);
            this.$listener = receiveOfferingsCallback;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError it) {
            q.f(it, "it");
            this.$listener.onError(it);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getOfferings$2, reason: invalid class name and case insensitive filesystem */
    static final class C02212 extends r implements l<Offerings, i0> {
        final /* synthetic */ ReceiveOfferingsCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02212(ReceiveOfferingsCallback receiveOfferingsCallback) {
            super(1);
            this.$listener = receiveOfferingsCallback;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Offerings offerings) {
            invoke2(offerings);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Offerings it) {
            q.f(it, "it");
            this.$listener.onReceived(it);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$3, reason: invalid class name */
    static final class AnonymousClass3 extends r implements l<CustomerInfo, i0> {
        final /* synthetic */ LogInCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends r implements p6.a<i0> {
            final /* synthetic */ LogInCallback $callback;
            final /* synthetic */ CustomerInfo $customerInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LogInCallback logInCallback, CustomerInfo customerInfo) {
                super(0);
                this.$callback = logInCallback;
                this.$customerInfo = customerInfo;
            }

            @Override // p6.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onReceived(this.$customerInfo, false);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(LogInCallback logInCallback) {
            super(1);
            this.$callback = logInCallback;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo) {
            q.f(customerInfo, "customerInfo");
            PurchasesOrchestrator.this.dispatch(new AnonymousClass1(this.$callback, customerInfo));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$4, reason: invalid class name */
    static final class AnonymousClass4 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ LogInCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends r implements p6.a<i0> {
            final /* synthetic */ LogInCallback $callback;
            final /* synthetic */ PurchasesError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LogInCallback logInCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = logInCallback;
                this.$error = purchasesError;
            }

            @Override // p6.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onError(this.$error);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(LogInCallback logInCallback) {
            super(1);
            this.$callback = logInCallback;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError error) {
            q.f(error, "error");
            PurchasesOrchestrator.this.dispatch(new AnonymousClass1(this.$callback, error));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logOut$1, reason: invalid class name and case insensitive filesystem */
    static final class C02241 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02241(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesOrchestrator purchasesOrchestrator) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
            this.this$0 = purchasesOrchestrator;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError != null) {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onError(purchasesError);
                    return;
                }
                return;
            }
            PurchasesOrchestrator purchasesOrchestrator = this.this$0;
            synchronized (purchasesOrchestrator) {
                PurchasesState state$purchases_defaultsRelease = purchasesOrchestrator.getState$purchases_defaultsRelease();
                Map mapEmptyMap = Collections.emptyMap();
                q.e(mapEmptyMap, "emptyMap()");
                purchasesOrchestrator.setState$purchases_defaultsRelease(PurchasesState.copy$default(state$purchases_defaultsRelease, null, mapEmptyMap, null, false, false, 29, null));
                i0 i0Var = i0.f21430a;
            }
            PurchasesOrchestrator purchasesOrchestrator2 = this.this$0;
            purchasesOrchestrator2.updateAllCaches(purchasesOrchestrator2.identityManager.getCurrentAppUserID(), this.$callback);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$2, reason: invalid class name and case insensitive filesystem */
    static final class C02252 extends r implements l<StoreTransaction, i0> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ GoogleReplacementMode $googleReplacementMode;
        final /* synthetic */ Boolean $isPersonalizedPrice;
        final /* synthetic */ String $presentedOfferingIdentifier;
        final /* synthetic */ y<String> $previousProductId;
        final /* synthetic */ PurchasingData $purchasingData;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02252(y<String> yVar, PurchasesOrchestrator purchasesOrchestrator, Activity activity, String str, PurchasingData purchasingData, GoogleReplacementMode googleReplacementMode, String str2, Boolean bool) {
            super(1);
            this.$previousProductId = yVar;
            this.this$0 = purchasesOrchestrator;
            this.$activity = activity;
            this.$appUserID = str;
            this.$purchasingData = purchasingData;
            this.$googleReplacementMode = googleReplacementMode;
            this.$presentedOfferingIdentifier = str2;
            this.$isPersonalizedPrice = bool;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(StoreTransaction storeTransaction) {
            invoke2(storeTransaction);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(StoreTransaction purchaseRecord) {
            q.f(purchaseRecord, "purchaseRecord");
            LogIntent logIntent = LogIntent.PURCHASE;
            String str = String.format(PurchaseStrings.FOUND_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{this.$previousProductId.f24325a}, 1));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            this.this$0.billing.makePurchaseAsync(this.$activity, this.$appUserID, this.$purchasingData, new ReplaceProductInfo(purchaseRecord, this.$googleReplacementMode), this.$presentedOfferingIdentifier, this.$isPersonalizedPrice);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$3, reason: invalid class name and case insensitive filesystem */
    static final class C02263 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ PurchaseErrorCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02263(PurchaseErrorCallback purchaseErrorCallback) {
            super(1);
            this.$listener = purchaseErrorCallback;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError error) {
            q.f(error, "error");
            LogWrapperKt.log(LogIntent.GOOGLE_ERROR, error.toString());
            PurchasesOrchestrator.this.getAndClearProductChangeCallback();
            PurchasesOrchestrator.this.getAndClearAllPurchaseCallbacks();
            PurchasesOrchestrator.this.dispatch(this.$listener, error);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$1, reason: invalid class name and case insensitive filesystem */
    static final class C02271 extends r implements l<List<? extends StoreTransaction>, i0> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02271(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, String str) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
            this.$appUserID = str;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreTransaction> list) {
            invoke2((List<StoreTransaction>) list);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<StoreTransaction> allPurchases) {
            q.f(allPurchases, "allPurchases");
            if (allPurchases.isEmpty()) {
                PurchasesOrchestrator.this.getCustomerInfo(this.$callback);
                return;
            }
            List<StoreTransaction> listP = w.P(allPurchases, new Comparator() { // from class: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$1$invoke$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t7, T t8) {
                    return g6.b.a(Long.valueOf(((StoreTransaction) t7).getPurchaseTime()), Long.valueOf(((StoreTransaction) t8).getPurchaseTime()));
                }
            });
            PurchasesOrchestrator purchasesOrchestrator = PurchasesOrchestrator.this;
            String str = this.$appUserID;
            ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
            for (StoreTransaction storeTransaction : listP) {
                purchasesOrchestrator.postReceiptHelper.postTransactionAndConsumeIfNeeded(storeTransaction, null, true, str, PostReceiptInitiationSource.RESTORE, new PurchasesOrchestrator$restorePurchases$1$2$1$1(storeTransaction, listP, purchasesOrchestrator, receiveCustomerInfoCallback), new PurchasesOrchestrator$restorePurchases$1$2$1$2(storeTransaction, listP, purchasesOrchestrator, receiveCustomerInfoCallback));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$2, reason: invalid class name and case insensitive filesystem */
    static final class C02282 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends r implements p6.a<i0> {
            final /* synthetic */ ReceiveCustomerInfoCallback $callback;
            final /* synthetic */ PurchasesError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = receiveCustomerInfoCallback;
                this.$error = purchasesError;
            }

            @Override // p6.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$callback.onError(this.$error);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02282(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
            super(1);
            this.$callback = receiveCustomerInfoCallback;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError error) {
            q.f(error, "error");
            PurchasesOrchestrator.this.dispatch(new AnonymousClass1(this.$callback, error));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$showInAppMessagesIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    static final class C02291 extends r implements p6.a<i0> {
        C02291() {
            super(0);
        }

        @Override // p6.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PurchasesOrchestrator.syncPurchases$default(PurchasesOrchestrator.this, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncObserverModeAmazonPurchase$3, reason: invalid class name and case insensitive filesystem */
    static final class C02303 extends r implements l<String, i0> {
        final /* synthetic */ String $amazonUserID;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ String $isoCurrencyCode;
        final /* synthetic */ Double $price;
        final /* synthetic */ String $receiptID;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncObserverModeAmazonPurchase$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends r implements l<CustomerInfo, i0> {
            final /* synthetic */ String $amazonUserID;
            final /* synthetic */ String $receiptID;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, String str2) {
                super(1);
                this.$receiptID = str;
                this.$amazonUserID = str2;
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
                invoke2(customerInfo);
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CustomerInfo it) {
                q.f(it, "it");
                String str = String.format(PurchaseStrings.PURCHASE_SYNCED_USER_ID, Arrays.copyOf(new Object[]{this.$receiptID, this.$amazonUserID}, 2));
                q.e(str, "format(this, *args)");
                LogWrapperKt.log(LogIntent.PURCHASE, str);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncObserverModeAmazonPurchase$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends r implements l<PurchasesError, i0> {
            final /* synthetic */ String $amazonUserID;
            final /* synthetic */ String $receiptID;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(String str, String str2) {
                super(1);
                this.$receiptID = str;
                this.$amazonUserID = str2;
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError error) {
                q.f(error, "error");
                String str = String.format(PurchaseStrings.SYNCING_PURCHASE_ERROR_DETAILS_USER_ID, Arrays.copyOf(new Object[]{this.$receiptID, this.$amazonUserID, error}, 3));
                q.e(str, "format(this, *args)");
                LogWrapperKt.log(LogIntent.RC_ERROR, str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02303(Double d8, String str, PurchasesOrchestrator purchasesOrchestrator, String str2, String str3, String str4) {
            super(1);
            this.$price = d8;
            this.$isoCurrencyCode = str;
            this.this$0 = purchasesOrchestrator;
            this.$receiptID = str2;
            this.$amazonUserID = str3;
            this.$appUserID = str4;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(String str) {
            invoke2(str);
            return i0.f21430a;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void invoke2(java.lang.String r23) {
            /*
                r22 = this;
                r0 = r22
                java.lang.String r1 = "normalizedProductID"
                r2 = r23
                kotlin.jvm.internal.q.f(r2, r1)
                java.util.List r3 = f6.m.b(r23)
                java.lang.Double r1 = r0.$price
                r2 = 0
                if (r1 == 0) goto L23
                double r4 = r1.doubleValue()
                r6 = 0
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 != 0) goto L1e
                r4 = 1
                goto L1f
            L1e:
                r4 = 0
            L1f:
                if (r4 != 0) goto L23
                r7 = r1
                goto L24
            L23:
                r7 = r2
            L24:
                java.lang.String r1 = r0.$isoCurrencyCode
                if (r1 == 0) goto L30
                boolean r4 = w6.m.p(r1)
                if (r4 != 0) goto L30
                r8 = r1
                goto L31
            L30:
                r8 = r2
            L31:
                r9 = 0
                r10 = 78
                r11 = 0
                com.revenuecat.purchases.common.ReceiptInfo r15 = new com.revenuecat.purchases.common.ReceiptInfo
                r4 = 0
                r5 = 0
                r6 = 0
                r2 = r15
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                com.revenuecat.purchases.PurchasesOrchestrator r1 = r0.this$0
                com.revenuecat.purchases.PostReceiptHelper r12 = com.revenuecat.purchases.PurchasesOrchestrator.access$getPostReceiptHelper$p(r1)
                java.lang.String r13 = r0.$receiptID
                java.lang.String r14 = r0.$amazonUserID
                com.revenuecat.purchases.PurchasesOrchestrator r1 = r0.this$0
                boolean r16 = r1.getAllowSharingPlayStoreAccount()
                java.lang.String r1 = r0.$appUserID
                r18 = 0
                com.revenuecat.purchases.PostReceiptInitiationSource r19 = com.revenuecat.purchases.PostReceiptInitiationSource.RESTORE
                com.revenuecat.purchases.PurchasesOrchestrator$syncObserverModeAmazonPurchase$3$1 r2 = new com.revenuecat.purchases.PurchasesOrchestrator$syncObserverModeAmazonPurchase$3$1
                java.lang.String r3 = r0.$receiptID
                java.lang.String r4 = r0.$amazonUserID
                r2.<init>(r3, r4)
                com.revenuecat.purchases.PurchasesOrchestrator$syncObserverModeAmazonPurchase$3$2 r3 = new com.revenuecat.purchases.PurchasesOrchestrator$syncObserverModeAmazonPurchase$3$2
                java.lang.String r4 = r0.$receiptID
                java.lang.String r5 = r0.$amazonUserID
                r3.<init>(r4, r5)
                r17 = r1
                r20 = r2
                r21 = r3
                r12.postTokenWithoutConsuming(r13, r14, r15, r16, r17, r18, r19, r20, r21)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PurchasesOrchestrator.C02303.invoke2(java.lang.String):void");
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncObserverModeAmazonPurchase$4, reason: invalid class name and case insensitive filesystem */
    static final class C02314 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ String $amazonUserID;
        final /* synthetic */ String $receiptID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02314(String str, String str2) {
            super(1);
            this.$receiptID = str;
            this.$amazonUserID = str2;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError error) {
            q.f(error, "error");
            String str = String.format(PurchaseStrings.SYNCING_PURCHASE_ERROR_DETAILS_USER_ID, Arrays.copyOf(new Object[]{this.$receiptID, this.$amazonUserID, error}, 3));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(LogIntent.RC_ERROR, str);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncPurchases$1, reason: invalid class name and case insensitive filesystem */
    static final class C02321 extends r implements l<CustomerInfo, i0> {
        final /* synthetic */ SyncPurchasesCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02321(SyncPurchasesCallback syncPurchasesCallback) {
            super(1);
            this.$listener = syncPurchasesCallback;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo it) {
            q.f(it, "it");
            SyncPurchasesCallback syncPurchasesCallback = this.$listener;
            if (syncPurchasesCallback != null) {
                syncPurchasesCallback.onSuccess(it);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$syncPurchases$2, reason: invalid class name and case insensitive filesystem */
    static final class C02332 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ SyncPurchasesCallback $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02332(SyncPurchasesCallback syncPurchasesCallback) {
            super(1);
            this.$listener = syncPurchasesCallback;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError it) {
            q.f(it, "it");
            SyncPurchasesCallback syncPurchasesCallback = this.$listener;
            if (syncPurchasesCallback != null) {
                syncPurchasesCallback.onError(it);
            }
        }
    }

    public PurchasesOrchestrator(Application application, String str, Backend backend, BillingAbstract billing, DeviceCache deviceCache, IdentityManager identityManager, SubscriberAttributesManager subscriberAttributesManager, AppConfig appConfig, CustomerInfoHelper customerInfoHelper, CustomerInfoUpdateHandler customerInfoUpdateHandler, DiagnosticsSynchronizer diagnosticsSynchronizer, OfflineEntitlementsManager offlineEntitlementsManager, PostReceiptHelper postReceiptHelper, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, PostPendingTransactionsHelper postPendingTransactionsHelper, SyncPurchasesHelper syncPurchasesHelper, OfferingsManager offeringsManager, PaywallEventsManager paywallEventsManager, PaywallPresentedCache paywallPresentedCache, PurchasesStateCache purchasesStateCache, Handler handler) {
        q.f(application, "application");
        q.f(backend, "backend");
        q.f(billing, "billing");
        q.f(deviceCache, "deviceCache");
        q.f(identityManager, "identityManager");
        q.f(subscriberAttributesManager, "subscriberAttributesManager");
        q.f(appConfig, "appConfig");
        q.f(customerInfoHelper, "customerInfoHelper");
        q.f(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        q.f(offlineEntitlementsManager, "offlineEntitlementsManager");
        q.f(postReceiptHelper, "postReceiptHelper");
        q.f(postTransactionWithProductDetailsHelper, "postTransactionWithProductDetailsHelper");
        q.f(postPendingTransactionsHelper, "postPendingTransactionsHelper");
        q.f(syncPurchasesHelper, "syncPurchasesHelper");
        q.f(offeringsManager, "offeringsManager");
        q.f(paywallPresentedCache, "paywallPresentedCache");
        q.f(purchasesStateCache, "purchasesStateCache");
        this.application = application;
        this.backend = backend;
        this.billing = billing;
        this.deviceCache = deviceCache;
        this.identityManager = identityManager;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.appConfig = appConfig;
        this.customerInfoHelper = customerInfoHelper;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.postReceiptHelper = postReceiptHelper;
        this.postTransactionWithProductDetailsHelper = postTransactionWithProductDetailsHelper;
        this.postPendingTransactionsHelper = postPendingTransactionsHelper;
        this.syncPurchasesHelper = syncPurchasesHelper;
        this.offeringsManager = offeringsManager;
        this.paywallEventsManager = paywallEventsManager;
        this.paywallPresentedCache = paywallPresentedCache;
        this.purchasesStateCache = purchasesStateCache;
        this.mainHandler = handler;
        this.lifecycleHandler$delegate = m.b(new PurchasesOrchestrator$lifecycleHandler$2(this));
        identityManager.configure(str);
        billing.setStateListener(new BillingAbstract.StateListener() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.1
            @Override // com.revenuecat.purchases.common.BillingAbstract.StateListener
            public void onConnected() {
                PostPendingTransactionsHelper.syncPendingPurchaseQueue$default(PurchasesOrchestrator.this.postPendingTransactionsHelper, PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), null, null, 6, null);
                PurchasesOrchestrator.this.billing.getStorefront(PurchasesOrchestrator$1$onConnected$1.INSTANCE, PurchasesOrchestrator$1$onConnected$2.INSTANCE);
            }
        });
        billing.setPurchasesUpdatedListener(getPurchasesUpdatedListener());
        BillingAbstract.startConnectionOnMainThread$default(billing, 0L, 1, null);
        dispatch(new AnonymousClass2());
        if (!this.appConfig.getDangerousSettings().getAutoSyncPurchases()) {
            LogWrapperKt.log(LogIntent.WARNING, ConfigureStrings.AUTO_SYNC_PURCHASES_DISABLED);
        }
        if (AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            if (diagnosticsSynchronizer != null) {
                diagnosticsSynchronizer.clearDiagnosticsFileIfTooBig();
            }
            if (diagnosticsSynchronizer != null) {
                diagnosticsSynchronizer.syncDiagnosticsFileIfNeeded();
            }
        }
    }

    public /* synthetic */ PurchasesOrchestrator(Application application, String str, Backend backend, BillingAbstract billingAbstract, DeviceCache deviceCache, IdentityManager identityManager, SubscriberAttributesManager subscriberAttributesManager, AppConfig appConfig, CustomerInfoHelper customerInfoHelper, CustomerInfoUpdateHandler customerInfoUpdateHandler, DiagnosticsSynchronizer diagnosticsSynchronizer, OfflineEntitlementsManager offlineEntitlementsManager, PostReceiptHelper postReceiptHelper, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, PostPendingTransactionsHelper postPendingTransactionsHelper, SyncPurchasesHelper syncPurchasesHelper, OfferingsManager offeringsManager, PaywallEventsManager paywallEventsManager, PaywallPresentedCache paywallPresentedCache, PurchasesStateCache purchasesStateCache, Handler handler, int i8, j jVar) {
        this(application, str, backend, billingAbstract, deviceCache, identityManager, subscriberAttributesManager, appConfig, customerInfoHelper, customerInfoUpdateHandler, diagnosticsSynchronizer, offlineEntitlementsManager, postReceiptHelper, postTransactionWithProductDetailsHelper, postPendingTransactionsHelper, syncPurchasesHelper, offeringsManager, paywallEventsManager, paywallPresentedCache, purchasesStateCache, (i8 & 1048576) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
        dispatch(new C02191(purchaseErrorCallback, purchasesError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(final p6.a<i0> aVar) {
        if (q.b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            aVar.invoke();
            return;
        }
        Handler handler = this.mainHandler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new Runnable() { // from class: com.revenuecat.purchases.e
            @Override // java.lang.Runnable
            public final void run() {
                PurchasesOrchestrator.dispatch$lambda$16(aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatch$lambda$16(p6.a tmp0) {
        q.f(tmp0, "$tmp0");
        tmp0.invoke();
    }

    private final void flushPaywallEvents() {
        PaywallEventsManager paywallEventsManager;
        if (!AndroidVersionUtilsKt.isAndroidNOrNewer() || (paywallEventsManager = this.paywallEventsManager) == null) {
            return;
        }
        paywallEventsManager.flushEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<PurchaseCallback> getAndClearAllPurchaseCallbacks() {
        List<PurchaseCallback> listU;
        synchronized (this) {
            Map<String, PurchaseCallback> purchaseCallbacksByProductId = getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId();
            PurchasesState state$purchases_defaultsRelease = getState$purchases_defaultsRelease();
            Map mapEmptyMap = Collections.emptyMap();
            q.e(mapEmptyMap, "emptyMap()");
            setState$purchases_defaultsRelease(PurchasesState.copy$default(state$purchases_defaultsRelease, null, mapEmptyMap, null, false, false, 29, null));
            listU = w.U(purchaseCallbacksByProductId.values());
        }
        return listU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductChangeCallback getAndClearProductChangeCallback() {
        ProductChangeCallback deprecatedProductChangeCallback = getState$purchases_defaultsRelease().getDeprecatedProductChangeCallback();
        setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), null, null, null, false, false, 27, null));
        return deprecatedProductChangeCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppLifecycleHandler getLifecycleHandler() {
        return (AppLifecycleHandler) this.lifecycleHandler$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<p<StoreTransaction, CustomerInfo, i0>, p<StoreTransaction, PurchasesError, i0>> getProductChangeCompletedCallbacks(ProductChangeCallback productChangeCallback) {
        return new Pair<>(new PurchasesOrchestrator$getProductChangeCompletedCallbacks$onSuccess$1(productChangeCallback, this), new PurchasesOrchestrator$getProductChangeCompletedCallbacks$onError$1(productChangeCallback, this));
    }

    public static /* synthetic */ void getProducts$default(PurchasesOrchestrator purchasesOrchestrator, List list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            productType = null;
        }
        purchasesOrchestrator.getProducts(list, productType, getStoreProductsCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getProductsOfTypes(Set<String> set, Set<? extends ProductType> set2, List<? extends StoreProduct> list, GetStoreProductsCallback getStoreProductsCallback) {
        Set setX = w.X(set2);
        ProductType productType = (ProductType) w.A(setX);
        i0 i0Var = null;
        if (productType != null) {
            setX.remove(productType);
        } else {
            productType = null;
        }
        if (productType != null) {
            this.billing.queryProductDetailsAsync(productType, set, new PurchasesOrchestrator$getProductsOfTypes$1$1(this, set, setX, list, getStoreProductsCallback), new PurchasesOrchestrator$getProductsOfTypes$1$2(this, getStoreProductsCallback));
            i0Var = i0.f21430a;
        }
        if (i0Var == null) {
            getStoreProductsCallback.onReceived(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PurchaseCallback getPurchaseCallback(String str) {
        PurchaseCallback purchaseCallback = getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId().get(str);
        PurchasesState state$purchases_defaultsRelease = getState$purchases_defaultsRelease();
        Map<String, PurchaseCallback> purchaseCallbacksByProductId = getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, PurchaseCallback> entry : purchaseCallbacksByProductId.entrySet()) {
            if (!q.b(entry.getKey(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        setState$purchases_defaultsRelease(PurchasesState.copy$default(state$purchases_defaultsRelease, null, linkedHashMap, null, false, false, 29, null));
        return purchaseCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<p<StoreTransaction, CustomerInfo, i0>, p<StoreTransaction, PurchasesError, i0>> getPurchaseCompletedCallbacks() {
        return new Pair<>(new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1(this), new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onError$1(this));
    }

    private final BillingAbstract.PurchasesUpdatedListener getPurchasesUpdatedListener() {
        return new BillingAbstract.PurchasesUpdatedListener() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.getPurchasesUpdatedListener.1
            @Override // com.revenuecat.purchases.common.BillingAbstract.PurchasesUpdatedListener
            public void onPurchasesFailedToUpdate(PurchasesError purchasesError) {
                i0 i0Var;
                q.f(purchasesError, "purchasesError");
                PurchasesOrchestrator purchasesOrchestrator = PurchasesOrchestrator.this;
                synchronized (purchasesOrchestrator) {
                    ProductChangeCallback andClearProductChangeCallback = purchasesOrchestrator.getAndClearProductChangeCallback();
                    if (andClearProductChangeCallback != null) {
                        purchasesOrchestrator.dispatch(andClearProductChangeCallback, purchasesError);
                        i0Var = i0.f21430a;
                    } else {
                        i0Var = null;
                    }
                    if (i0Var == null) {
                        Iterator it = purchasesOrchestrator.getAndClearAllPurchaseCallbacks().iterator();
                        while (it.hasNext()) {
                            purchasesOrchestrator.dispatch((PurchaseCallback) it.next(), purchasesError);
                        }
                    }
                    i0 i0Var2 = i0.f21430a;
                }
            }

            @Override // com.revenuecat.purchases.common.BillingAbstract.PurchasesUpdatedListener
            public void onPurchasesUpdated(List<StoreTransaction> purchases) {
                Pair productChangeCompletedCallbacks;
                q.f(purchases, "purchases");
                PurchasesOrchestrator purchasesOrchestrator = PurchasesOrchestrator.this;
                synchronized (purchasesOrchestrator) {
                    productChangeCompletedCallbacks = purchasesOrchestrator.getState$purchases_defaultsRelease().getDeprecatedProductChangeCallback() != null ? purchasesOrchestrator.getProductChangeCompletedCallbacks(purchasesOrchestrator.getAndClearProductChangeCallback()) : purchasesOrchestrator.getPurchaseCompletedCallbacks();
                    i0 i0Var = i0.f21430a;
                }
                PurchasesOrchestrator.this.postTransactionWithProductDetailsHelper.postTransactions(purchases, PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), PurchasesOrchestrator.this.getAppUserID(), PostReceiptInitiationSource.PURCHASE, (p) productChangeCompletedCallbacks.first, (p) productChangeCompletedCallbacks.second);
            }
        };
    }

    public static /* synthetic */ void logIn$default(PurchasesOrchestrator purchasesOrchestrator, String str, LogInCallback logInCallback, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            logInCallback = null;
        }
        purchasesOrchestrator.logIn(str, logInCallback);
    }

    public static /* synthetic */ void logOut$default(PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchasesOrchestrator.logOut(receiveCustomerInfoCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.String] */
    private final void replaceOldPurchaseWithNewProduct(PurchasingData purchasingData, String str, GoogleReplacementMode googleReplacementMode, Activity activity, String str2, String str3, Boolean bool, PurchaseErrorCallback purchaseErrorCallback) {
        ProductType productType = purchasingData.getProductType();
        ProductType productType2 = ProductType.SUBS;
        if (productType != productType2) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            ProductChangeCallback andClearProductChangeCallback = getAndClearProductChangeCallback();
            if (andClearProductChangeCallback != null) {
                dispatch(andClearProductChangeCallback, purchasesError);
            }
            Iterator<T> it = getAndClearAllPurchaseCallbacks().iterator();
            while (it.hasNext()) {
                dispatch((PurchaseCallback) it.next(), purchasesError);
            }
            return;
        }
        y yVar = new y();
        yVar.f24325a = str;
        if (w6.w.z(str, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, false, 2, null)) {
            yVar.f24325a = w6.w.q0(str, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, null, 2, null);
            LogUtilsKt.warnLog("Using incorrect oldProductId: " + str + ". The productId should not contain the basePlanId. Using productId: " + ((String) yVar.f24325a) + '.');
        }
        this.billing.findPurchaseInPurchaseHistory(str2, productType2, (String) yVar.f24325a, new C02252(yVar, this, activity, str2, purchasingData, googleReplacementMode, str3, bool), new C02263(purchaseErrorCallback));
    }

    private final boolean shouldRefreshCustomerInfo(boolean z7) {
        if (this.appConfig.getCustomEntitlementComputation()) {
            return false;
        }
        return z7 || this.deviceCache.isCustomerInfoCacheStale(getAppUserID(), false);
    }

    public static /* synthetic */ void syncPurchases$default(PurchasesOrchestrator purchasesOrchestrator, SyncPurchasesCallback syncPurchasesCallback, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            syncPurchasesCallback = null;
        }
        purchasesOrchestrator.syncPurchases(syncPurchasesCallback);
    }

    private final void synchronizeSubscriberAttributesIfNeeded() {
        SubscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers$default(this.subscriberAttributesManager, getAppUserID(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAllCaches(String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        boolean appInBackground = getState$purchases_defaultsRelease().getAppInBackground();
        this.customerInfoHelper.retrieveCustomerInfo(str, CacheFetchPolicy.FETCH_CURRENT, appInBackground, getAllowSharingPlayStoreAccount(), receiveCustomerInfoCallback);
        OfferingsManager.fetchAndCacheOfferings$default(this.offeringsManager, str, appInBackground, null, null, 12, null);
    }

    static /* synthetic */ void updateAllCaches$default(PurchasesOrchestrator purchasesOrchestrator, String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchasesOrchestrator.updateAllCaches(str, receiveCustomerInfoCallback);
    }

    public final void close() {
        synchronized (this) {
            PurchasesState state$purchases_defaultsRelease = getState$purchases_defaultsRelease();
            Map mapEmptyMap = Collections.emptyMap();
            q.e(mapEmptyMap, "emptyMap()");
            setState$purchases_defaultsRelease(PurchasesState.copy$default(state$purchases_defaultsRelease, null, mapEmptyMap, null, false, false, 29, null));
            i0 i0Var = i0.f21430a;
        }
        this.backend.close();
        this.billing.close();
        setUpdatedCustomerInfoListener(null);
        dispatch(new C02182());
    }

    public final void collectDeviceIdentifiers() {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"collectDeviceIdentifiers"}, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.collectDeviceIdentifiers(getAppUserID(), this.application);
    }

    public final synchronized boolean getAllowSharingPlayStoreAccount() {
        Boolean allowSharingPlayStoreAccount;
        allowSharingPlayStoreAccount = getState$purchases_defaultsRelease().getAllowSharingPlayStoreAccount();
        return allowSharingPlayStoreAccount != null ? allowSharingPlayStoreAccount.booleanValue() : this.identityManager.currentUserIsAnonymous();
    }

    public final AppConfig getAppConfig() {
        return this.appConfig;
    }

    public final synchronized String getAppUserID() {
        return this.identityManager.getCurrentAppUserID();
    }

    public final void getCustomerInfo(CacheFetchPolicy fetchPolicy, ReceiveCustomerInfoCallback callback) {
        q.f(fetchPolicy, "fetchPolicy");
        q.f(callback, "callback");
        this.customerInfoHelper.retrieveCustomerInfo(this.identityManager.getCurrentAppUserID(), fetchPolicy, getState$purchases_defaultsRelease().getAppInBackground(), getAllowSharingPlayStoreAccount(), callback);
    }

    public final void getCustomerInfo(ReceiveCustomerInfoCallback callback) {
        q.f(callback, "callback");
        getCustomerInfo(CacheFetchPolicy.Companion.m8default(), callback);
    }

    public final synchronized boolean getFinishTransactions() {
        return this.appConfig.getFinishTransactions();
    }

    public final void getOfferings(ReceiveOfferingsCallback listener) {
        q.f(listener, "listener");
        this.offeringsManager.getOfferings(this.identityManager.getCurrentAppUserID(), getState$purchases_defaultsRelease().getAppInBackground(), new C02201(listener), new C02212(listener));
    }

    public final OfflineEntitlementsManager getOfflineEntitlementsManager() {
        return this.offlineEntitlementsManager;
    }

    public final void getProducts(List<String> productIds, ProductType productType, final GetStoreProductsCallback callback) {
        Set<? extends ProductType> setD;
        q.f(productIds, "productIds");
        q.f(callback, "callback");
        if (productType == null || (setD = o0.a(productType)) == null) {
            setD = p0.d(ProductType.SUBS, ProductType.INAPP);
        }
        getProductsOfTypes(w.Y(productIds), setD, new GetStoreProductsCallback() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.getProducts.1
            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onError(PurchasesError error) {
                q.f(error, "error");
                callback.onError(error);
            }

            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onReceived(List<? extends StoreProduct> storeProducts) {
                q.f(storeProducts, "storeProducts");
                callback.onReceived(storeProducts);
            }
        });
    }

    public final void getProductsOfTypes(Set<String> productIds, Set<? extends ProductType> types, GetStoreProductsCallback callback) {
        q.f(productIds, "productIds");
        q.f(types, "types");
        q.f(callback, "callback");
        ArrayList arrayList = new ArrayList();
        for (Object obj : types) {
            if (((ProductType) obj) != ProductType.UNKNOWN) {
                arrayList.add(obj);
            }
        }
        getProductsOfTypes(productIds, w.Y(arrayList), o.d(), callback);
    }

    public final PurchasesState getState$purchases_defaultsRelease() {
        return this.purchasesStateCache.getPurchasesState();
    }

    public final Store getStore() {
        return this.appConfig.getStore();
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.customerInfoUpdateHandler.getUpdatedCustomerInfoListener();
    }

    public final void invalidateCustomerInfoCache() {
        LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.INVALIDATING_CUSTOMERINFO_CACHE);
        this.deviceCache.clearCustomerInfoCache(getAppUserID());
    }

    public final boolean isAnonymous() {
        return this.identityManager.currentUserIsAnonymous();
    }

    public final void logIn(String newAppUserID, LogInCallback logInCallback) {
        q.f(newAppUserID, "newAppUserID");
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        i0 i0Var = null;
        if (q.b(currentAppUserID, newAppUserID)) {
            currentAppUserID = null;
        }
        if (currentAppUserID != null) {
            this.identityManager.logIn(newAppUserID, new PurchasesOrchestrator$logIn$2$1(this, newAppUserID, logInCallback), new PurchasesOrchestrator$logIn$2$2(this, logInCallback));
            i0Var = i0.f21430a;
        }
        if (i0Var == null) {
            this.customerInfoHelper.retrieveCustomerInfo(this.identityManager.getCurrentAppUserID(), CacheFetchPolicy.Companion.m8default(), getState$purchases_defaultsRelease().getAppInBackground(), getAllowSharingPlayStoreAccount(), ListenerConversionsCommonKt.receiveCustomerInfoCallback(new AnonymousClass3(logInCallback), new AnonymousClass4(logInCallback)));
        }
    }

    public final void logOut(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.identityManager.logOut(new C02241(receiveCustomerInfoCallback, this));
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityDestroyed(this, activity);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityPaused(this, activity);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityResumed(this, activity);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        q.f(activity, "activity");
        if (this.appConfig.getShowInAppMessagesAutomatically()) {
            showInAppMessagesIfNeeded(activity, f6.j.C(InAppMessageType.values()));
        }
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityStopped(this, activity);
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppBackgrounded() {
        synchronized (this) {
            setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), null, null, null, true, false, 23, null));
            i0 i0Var = i0.f21430a;
        }
        LogWrapperKt.log(LogIntent.DEBUG, ConfigureStrings.APP_BACKGROUNDED);
        synchronizeSubscriberAttributesIfNeeded();
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppForegrounded() {
        boolean firstTimeInForeground;
        synchronized (this) {
            firstTimeInForeground = getState$purchases_defaultsRelease().getFirstTimeInForeground();
            setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), null, null, null, false, false, 7, null));
            i0 i0Var = i0.f21430a;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, ConfigureStrings.APP_FOREGROUNDED);
        if (shouldRefreshCustomerInfo(firstTimeInForeground)) {
            LogWrapperKt.log(logIntent, CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_FOREGROUND);
            CustomerInfoHelper.retrieveCustomerInfo$default(this.customerInfoHelper, this.identityManager.getCurrentAppUserID(), CacheFetchPolicy.FETCH_CURRENT, false, getAllowSharingPlayStoreAccount(), null, 16, null);
        }
        this.offeringsManager.onAppForeground(this.identityManager.getCurrentAppUserID());
        PostPendingTransactionsHelper.syncPendingPurchaseQueue$default(this.postPendingTransactionsHelper, getAllowSharingPlayStoreAccount(), null, null, 6, null);
        synchronizeSubscriberAttributesIfNeeded();
        OfflineEntitlementsManager.updateProductEntitlementMappingCacheIfStale$default(this.offlineEntitlementsManager, null, 1, null);
        flushPaywallEvents();
    }

    public final void purchase(PurchaseParams purchaseParams, PurchaseCallback callback) {
        i0 i0Var;
        q.f(purchaseParams, "purchaseParams");
        q.f(callback, "callback");
        String oldProductId = purchaseParams.getOldProductId();
        if (oldProductId != null) {
            startProductChange(purchaseParams.getActivity$purchases_defaultsRelease(), purchaseParams.getPurchasingData$purchases_defaultsRelease(), purchaseParams.getPresentedOfferingIdentifier$purchases_defaultsRelease(), oldProductId, purchaseParams.getGoogleReplacementMode(), purchaseParams.isPersonalizedPrice(), callback);
            i0Var = i0.f21430a;
        } else {
            i0Var = null;
        }
        if (i0Var == null) {
            startPurchase(purchaseParams.getActivity$purchases_defaultsRelease(), purchaseParams.getPurchasingData$purchases_defaultsRelease(), purchaseParams.getPresentedOfferingIdentifier$purchases_defaultsRelease(), purchaseParams.isPersonalizedPrice(), callback);
        }
    }

    public final void removeUpdatedCustomerInfoListener() {
        setUpdatedCustomerInfoListener(null);
    }

    public final void restorePurchases(ReceiveCustomerInfoCallback callback) {
        q.f(callback, "callback");
        LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.RESTORING_PURCHASE);
        if (!getAllowSharingPlayStoreAccount()) {
            LogWrapperKt.log(LogIntent.WARNING, RestoreStrings.SHARING_ACC_RESTORE_FALSE);
        }
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        this.billing.queryAllPurchases(currentAppUserID, new C02271(callback, currentAppUserID), new C02282(callback));
    }

    public final void setAd(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAd"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Ad.INSTANCE, str, getAppUserID());
    }

    public final void setAdGroup(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAdGroup"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.AdGroup.INSTANCE, str, getAppUserID());
    }

    public final void setAdjustID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAdjustID"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Adjust.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setAirshipChannelID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAirshipChannelID"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.Airship.INSTANCE, str, getAppUserID());
    }

    public final synchronized void setAllowSharingPlayStoreAccount(boolean z7) {
        setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), Boolean.valueOf(z7), null, null, false, false, 30, null));
    }

    public final void setAppConfig(AppConfig appConfig) {
        q.f(appConfig, "<set-?>");
        this.appConfig = appConfig;
    }

    public final void setAppsflyerID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAppsflyerID"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.AppsFlyer.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setAttributes(Map<String, String> attributes) {
        q.f(attributes, "attributes");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setAttributes"}, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.subscriberAttributesManager.setAttributes(attributes, getAppUserID());
    }

    public final void setCampaign(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setCampaign"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Campaign.INSTANCE, str, getAppUserID());
    }

    public final void setCleverTapID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setCleverTapID"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.CleverTap.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setCreative(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setCreative"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Creative.INSTANCE, str, getAppUserID());
    }

    public final void setDisplayName(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setDisplayName"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.DisplayName.INSTANCE, str, getAppUserID());
    }

    public final void setEmail(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setEmail"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.Email.INSTANCE, str, getAppUserID());
    }

    public final void setFBAnonymousID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setFBAnonymousID"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Facebook.INSTANCE, str, getAppUserID(), this.application);
    }

    public final synchronized void setFinishTransactions(boolean z7) {
        this.appConfig.setFinishTransactions(z7);
    }

    public final void setFirebaseAppInstanceID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setFirebaseAppInstanceID"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.FirebaseAppInstanceId.INSTANCE, str, getAppUserID());
    }

    public final void setKeyword(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"seKeyword"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Keyword.INSTANCE, str, getAppUserID());
    }

    public final void setMediaSource(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setMediaSource"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE, str, getAppUserID());
    }

    public final void setMixpanelDistinctID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setMixpanelDistinctID"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.MixpanelDistinctId.INSTANCE, str, getAppUserID());
    }

    public final void setMparticleID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setMparticleID"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Mparticle.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setOnesignalID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setOnesignalID"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.OneSignal.INSTANCE, str, getAppUserID());
    }

    public final void setOnesignalUserID(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setOnesignalUserID"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.OneSignalUserId.INSTANCE, str, getAppUserID());
    }

    public final void setPhoneNumber(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setPhoneNumber"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.PhoneNumber.INSTANCE, str, getAppUserID());
    }

    public final void setPushToken(String str) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.METHOD_CALLED, Arrays.copyOf(new Object[]{"setPushToken"}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.FCMTokens.INSTANCE, str, getAppUserID());
    }

    public final void setState$purchases_defaultsRelease(PurchasesState value) {
        q.f(value, "value");
        this.purchasesStateCache.setPurchasesState(value);
    }

    public final synchronized void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        this.customerInfoUpdateHandler.setUpdatedCustomerInfoListener(updatedCustomerInfoListener);
    }

    public final void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes) {
        q.f(activity, "activity");
        q.f(inAppMessageTypes, "inAppMessageTypes");
        this.billing.showInAppMessagesIfNeeded(activity, inAppMessageTypes, new C02291());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void startDeprecatedProductChange(Activity activity, PurchasingData purchasingData, String str, String oldProductId, GoogleReplacementMode googleReplacementMode, ProductChangeCallback listener) {
        String str2;
        i0 i0Var;
        String currentAppUserID;
        ProductChangeCallback productChangeCallback;
        i0 i0Var2;
        ?? r02;
        q.f(activity, "activity");
        q.f(purchasingData, "purchasingData");
        q.f(oldProductId, "oldProductId");
        q.f(listener, "listener");
        if (purchasingData.getProductType() != ProductType.SUBS) {
            getAndClearProductChangeCallback();
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            i0 i0Var3 = i0.f21430a;
            dispatch(listener, purchasesError);
            return;
        }
        LogIntent logIntent = LogIntent.PURCHASE;
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append(' ');
        sb.append(purchasingData);
        sb.append(' ');
        if (str != null) {
            str2 = PurchaseStrings.OFFERING + str;
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(" oldProductId: ");
        sb.append(oldProductId);
        sb.append(" googleReplacementMode ");
        sb.append(googleReplacementMode);
        objArr[0] = sb.toString();
        String str3 = String.format(PurchaseStrings.PRODUCT_CHANGE_STARTED, Arrays.copyOf(objArr, 1));
        q.e(str3, "format(this, *args)");
        LogWrapperKt.log(logIntent, str3);
        synchronized (this) {
            if (!this.appConfig.getFinishTransactions()) {
                LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
            }
            if (getState$purchases_defaultsRelease().getDeprecatedProductChangeCallback() == null) {
                i0Var = null;
                setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), null, null, listener, false, false, 27, null));
                currentAppUserID = this.identityManager.getCurrentAppUserID();
            } else {
                i0Var = null;
                currentAppUserID = null;
            }
            i0 i0Var4 = i0.f21430a;
        }
        if (currentAppUserID != null) {
            r02 = i0Var;
            productChangeCallback = listener;
            replaceOldPurchaseWithNewProduct(purchasingData, oldProductId, googleReplacementMode, activity, currentAppUserID, str, null, listener);
            i0Var2 = i0.f21430a;
        } else {
            i0 i0Var5 = i0Var;
            productChangeCallback = listener;
            i0Var2 = i0Var5;
            r02 = i0Var5;
        }
        if (i0Var2 == null) {
            getAndClearProductChangeCallback();
            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, r02, 2, r02);
            LogUtilsKt.errorLog(purchasesError2);
            dispatch(productChangeCallback, purchasesError2);
        }
    }

    public final void startProductChange(Activity activity, PurchasingData purchasingData, String str, String oldProductId, GoogleReplacementMode googleReplacementMode, Boolean bool, PurchaseCallback purchaseCallback) {
        String str2;
        String currentAppUserID;
        i0 i0Var;
        q.f(activity, "activity");
        q.f(purchasingData, "purchasingData");
        q.f(oldProductId, "oldProductId");
        q.f(googleReplacementMode, "googleReplacementMode");
        q.f(purchaseCallback, "purchaseCallback");
        if (purchasingData.getProductType() != ProductType.SUBS) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            i0 i0Var2 = i0.f21430a;
            dispatch(purchaseCallback, purchasesError);
            return;
        }
        LogIntent logIntent = LogIntent.PURCHASE;
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append(' ');
        sb.append(purchasingData);
        sb.append(' ');
        if (str != null) {
            str2 = PurchaseStrings.OFFERING + str;
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(" oldProductId: ");
        sb.append(oldProductId);
        sb.append(" googleReplacementMode ");
        sb.append(googleReplacementMode);
        objArr[0] = sb.toString();
        String str3 = String.format(PurchaseStrings.PRODUCT_CHANGE_STARTED, Arrays.copyOf(objArr, 1));
        q.e(str3, "format(this, *args)");
        LogWrapperKt.log(logIntent, str3);
        synchronized (this) {
            if (!this.appConfig.getFinishTransactions()) {
                LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
            }
            if (getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId().containsKey(purchasingData.getProductId())) {
                currentAppUserID = null;
            } else {
                setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), null, k0.j(getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId(), j0.c(x.a(purchasingData.getProductId(), purchaseCallback))), null, false, false, 29, null));
                currentAppUserID = this.identityManager.getCurrentAppUserID();
            }
            i0 i0Var3 = i0.f21430a;
        }
        if (currentAppUserID != null) {
            replaceOldPurchaseWithNewProduct(purchasingData, oldProductId, googleReplacementMode, activity, currentAppUserID, str, bool, purchaseCallback);
            i0Var = i0.f21430a;
        } else {
            i0Var = null;
        }
        if (i0Var == null) {
            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, null, 2, null);
            LogUtilsKt.errorLog(purchasesError2);
            Iterator<T> it = getAndClearAllPurchaseCallbacks().iterator();
            while (it.hasNext()) {
                dispatch((PurchaseCallback) it.next(), purchasesError2);
            }
        }
    }

    public final void startPurchase(Activity activity, PurchasingData purchasingData, String str, Boolean bool, PurchaseCallback listener) {
        String str2;
        String currentAppUserID;
        i0 i0Var;
        q.f(activity, "activity");
        q.f(purchasingData, "purchasingData");
        q.f(listener, "listener");
        LogIntent logIntent = LogIntent.PURCHASE;
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append(' ');
        sb.append(purchasingData);
        sb.append(' ');
        if (str != null) {
            str2 = PurchaseStrings.OFFERING + str;
        } else {
            str2 = null;
        }
        sb.append(str2);
        objArr[0] = sb.toString();
        String str3 = String.format(PurchaseStrings.PURCHASE_STARTED, Arrays.copyOf(objArr, 1));
        q.e(str3, "format(this, *args)");
        LogWrapperKt.log(logIntent, str3);
        synchronized (this) {
            if (!this.appConfig.getFinishTransactions()) {
                LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
            }
            if (getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId().containsKey(purchasingData.getProductId())) {
                currentAppUserID = null;
            } else {
                setState$purchases_defaultsRelease(PurchasesState.copy$default(getState$purchases_defaultsRelease(), null, k0.j(getState$purchases_defaultsRelease().getPurchaseCallbacksByProductId(), j0.c(x.a(purchasingData.getProductId(), listener))), null, false, false, 29, null));
                currentAppUserID = this.identityManager.getCurrentAppUserID();
            }
            i0 i0Var2 = i0.f21430a;
        }
        if (currentAppUserID != null) {
            this.billing.makePurchaseAsync(activity, currentAppUserID, purchasingData, null, str, bool);
            i0Var = i0.f21430a;
        } else {
            i0Var = null;
        }
        if (i0Var == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, null, 2, null);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(listener, purchasesError);
        }
    }

    public final void switchUser(String newAppUserID) {
        q.f(newAppUserID, "newAppUserID");
        if (!q.b(this.identityManager.getCurrentAppUserID(), newAppUserID)) {
            this.identityManager.switchUser(newAppUserID);
            OfferingsManager.fetchAndCacheOfferings$default(this.offeringsManager, newAppUserID, getState$purchases_defaultsRelease().getAppInBackground(), null, null, 12, null);
        } else {
            String str = String.format(IdentityStrings.SWITCHING_USER_SAME_APP_USER_ID, Arrays.copyOf(new Object[]{newAppUserID}, 1));
            q.e(str, "format(this, *args)");
            LogUtilsKt.warnLog(str);
        }
    }

    public final void syncObserverModeAmazonPurchase(String productID, String receiptID, String amazonUserID, String str, Double d8) {
        q.f(productID, "productID");
        q.f(receiptID, "receiptID");
        q.f(amazonUserID, "amazonUserID");
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(PurchaseStrings.SYNCING_PURCHASE_STORE_USER_ID, Arrays.copyOf(new Object[]{receiptID, amazonUserID}, 2));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        Set<String> previouslySentHashedTokens = this.deviceCache.getPreviouslySentHashedTokens();
        if (!previouslySentHashedTokens.contains(UtilsKt.sha1(receiptID))) {
            previouslySentHashedTokens = null;
        }
        if (previouslySentHashedTokens == null) {
            this.billing.normalizePurchaseData(productID, receiptID, amazonUserID, new C02303(d8, str, this, receiptID, amazonUserID, this.identityManager.getCurrentAppUserID()), new C02314(receiptID, amazonUserID));
            return;
        }
        String str3 = String.format(PurchaseStrings.SYNCING_PURCHASE_SKIPPING, Arrays.copyOf(new Object[]{receiptID, amazonUserID}, 2));
        q.e(str3, "format(this, *args)");
        LogWrapperKt.log(logIntent, str3);
    }

    public final void syncPurchases(SyncPurchasesCallback syncPurchasesCallback) {
        this.syncPurchasesHelper.syncPurchases(getAllowSharingPlayStoreAccount(), getState$purchases_defaultsRelease().getAppInBackground(), new C02321(syncPurchasesCallback), new C02332(syncPurchasesCallback));
    }

    @ExperimentalPreviewRevenueCatPurchasesAPI
    public final void track(PaywallEvent paywallEvent) {
        PaywallEventsManager paywallEventsManager;
        q.f(paywallEvent, "paywallEvent");
        this.paywallPresentedCache.receiveEvent(paywallEvent);
        if (!AndroidVersionUtilsKt.isAndroidNOrNewer() || (paywallEventsManager = this.paywallEventsManager) == null) {
            return;
        }
        paywallEventsManager.track(paywallEvent);
    }
}
