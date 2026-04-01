package com.revenuecat.purchases.amazon;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.amazon.AmazonPurchasingData;
import com.revenuecat.purchases.amazon.handler.ProductDataHandler;
import com.revenuecat.purchases.amazon.handler.PurchaseHandler;
import com.revenuecat.purchases.amazon.handler.PurchaseUpdatesHandler;
import com.revenuecat.purchases.amazon.handler.UserDataHandler;
import com.revenuecat.purchases.amazon.listener.ProductDataResponseListener;
import com.revenuecat.purchases.amazon.listener.PurchaseResponseListener;
import com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener;
import com.revenuecat.purchases.amazon.listener.UserDataResponseListener;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import e6.i0;
import e6.x;
import f6.j0;
import f6.k0;
import f6.n;
import f6.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.json.JSONException;
import org.json.JSONObject;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class AmazonBilling extends BillingAbstract implements ProductDataResponseListener, PurchaseResponseListener, PurchaseUpdatesResponseListener, UserDataResponseListener {
    private final AmazonBackend amazonBackend;
    private final Context applicationContext;
    private final AmazonCache cache;
    private boolean connected;
    private final DateProvider dateProvider;
    private final Handler mainHandler;
    private final boolean observerMode;
    private final ProductDataResponseListener productDataHandler;
    private final PurchaseResponseListener purchaseHandler;
    private final PurchaseUpdatesResponseListener purchaseUpdatesHandler;
    private final PurchasingServiceProvider purchasingServiceProvider;
    private final ConcurrentLinkedQueue<l<PurchasesError, i0>> serviceRequests;
    private final UserDataResponseListener userDataHandler;

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$consumeAndSave$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ StoreTransaction $purchase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(StoreTransaction storeTransaction) {
            super(1);
            this.$purchase = storeTransaction;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.purchasingServiceProvider.notifyFulfillment(this.$purchase.getPurchaseToken(), FulfillmentResult.FULFILLED);
            } else {
                LogUtilsKt.errorLog(purchasesError);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$findPurchaseInPurchaseHistory$1, reason: invalid class name and case insensitive filesystem */
    static final class C02351 extends r implements l<List<? extends StoreTransaction>, i0> {
        final /* synthetic */ l<StoreTransaction, i0> $onCompletion;
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ String $productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02351(l<? super StoreTransaction, i0> lVar, String str, l<? super PurchasesError, i0> lVar2) {
            super(1);
            this.$onCompletion = lVar;
            this.$productId = str;
            this.$onError = lVar2;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreTransaction> list) {
            invoke2((List<StoreTransaction>) list);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<StoreTransaction> it) {
            Object next;
            q.f(it, "it");
            String str = this.$productId;
            Iterator<T> it2 = it.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (q.b(str, ((StoreTransaction) next).getProductIds().get(0))) {
                        break;
                    }
                }
            }
            StoreTransaction storeTransaction = (StoreTransaction) next;
            if (storeTransaction != null) {
                this.$onCompletion.invoke(storeTransaction);
                return;
            }
            String str2 = String.format(PurchaseStrings.NO_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{this.$productId}, 1));
            q.e(str2, "format(this, *args)");
            this.$onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, str2));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getStorefront$1, reason: invalid class name and case insensitive filesystem */
    static final class C02361 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<String, i0> $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getStorefront$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00831 extends r implements l<UserData, i0> {
            final /* synthetic */ l<PurchasesError, i0> $onError;
            final /* synthetic */ l<String, i0> $onSuccess;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00831(AmazonBilling amazonBilling, l<? super String, i0> lVar, l<? super PurchasesError, i0> lVar2) {
                super(1);
                this.this$0 = amazonBilling;
                this.$onSuccess = lVar;
                this.$onError = lVar2;
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ i0 invoke(UserData userData) {
                invoke2(userData);
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(UserData userData) {
                q.f(userData, "userData");
                String marketplace = userData.getMarketplace();
                if (marketplace == null) {
                    this.$onError.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, AmazonStrings.ERROR_USER_DATA_MARKETPLACE_NULL_STORE_PROBLEM));
                } else {
                    this.$onSuccess.invoke(marketplace);
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$getStorefront$1$2, reason: invalid class name */
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
                String str = String.format(BillingStrings.BILLING_AMAZON_ERROR_STOREFRONT, Arrays.copyOf(new Object[]{error}, 1));
                q.e(str, "format(this, *args)");
                LogUtilsKt.errorLog$default(str, null, 2, null);
                this.$onError.invoke(error);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02361(l<? super PurchasesError, i0> lVar, l<? super String, i0> lVar2) {
            super(1);
            this.$onError = lVar;
            this.$onSuccess = lVar2;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.userDataHandler.getUserData(new C00831(AmazonBilling.this, this.$onSuccess, this.$onError), new AnonymousClass2(this.$onError));
                return;
            }
            String str = String.format(BillingStrings.BILLING_CONNECTION_ERROR_STORE_COUNTRY, Arrays.copyOf(new Object[]{purchasesError}, 1));
            q.e(str, "format(this, *args)");
            LogUtilsKt.errorLog$default(str, null, 2, null);
            this.$onError.invoke(purchasesError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$handleReceipt$1, reason: invalid class name and case insensitive filesystem */
    static final class C02371 extends r implements l<JSONObject, i0> {
        final /* synthetic */ String $presentedOfferingIdentifier;
        final /* synthetic */ Receipt $receipt;
        final /* synthetic */ UserData $userData;
        final /* synthetic */ AmazonBilling this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02371(Receipt receipt, String str, UserData userData, AmazonBilling amazonBilling) {
            super(1);
            this.$receipt = receipt;
            this.$presentedOfferingIdentifier = str;
            this.$userData = userData;
            this.this$0 = amazonBilling;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(JSONObject jSONObject) throws JSONException {
            invoke2(jSONObject);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(JSONObject response) throws JSONException {
            q.f(response, "response");
            Object obj = response.get(com.amazon.a.a.o.b.L);
            q.d(obj, "null cannot be cast to non-null type kotlin.String");
            StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(this.$receipt, (String) obj, this.$presentedOfferingIdentifier, PurchaseState.PURCHASED, this.$userData);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = this.this$0.getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(n.b(storeTransaction));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$handleReceipt$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends o implements l<PurchasesError, i0> {
        AnonymousClass2(Object obj) {
            super(1, obj, AmazonBilling.class, "onPurchaseError", "onPurchaseError(Lcom/revenuecat/purchases/PurchasesError;)V", 0);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError p02) {
            q.f(p02, "p0");
            ((AmazonBilling) this.receiver).onPurchaseError(p02);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$makePurchaseAsync$1, reason: invalid class name and case insensitive filesystem */
    static final class C02381 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ String $presentedOfferingIdentifier;
        final /* synthetic */ AmazonStoreProduct $storeProduct;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$makePurchaseAsync$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00841 extends r implements p<Receipt, UserData, i0> {
            final /* synthetic */ String $presentedOfferingIdentifier;
            final /* synthetic */ AmazonStoreProduct $storeProduct;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00841(AmazonBilling amazonBilling, AmazonStoreProduct amazonStoreProduct, String str) {
                super(2);
                this.this$0 = amazonBilling;
                this.$storeProduct = amazonStoreProduct;
                this.$presentedOfferingIdentifier = str;
            }

            @Override // p6.p
            public /* bridge */ /* synthetic */ i0 invoke(Receipt receipt, UserData userData) {
                invoke2(receipt, userData);
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Receipt receipt, UserData userData) {
                q.f(receipt, "receipt");
                q.f(userData, "userData");
                this.this$0.handleReceipt(receipt, userData, this.$storeProduct, this.$presentedOfferingIdentifier);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$makePurchaseAsync$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends r implements l<PurchasesError, i0> {
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AmazonBilling amazonBilling) {
                super(1);
                this.this$0 = amazonBilling;
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError it) {
                q.f(it, "it");
                this.this$0.onPurchaseError(it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02381(Activity activity, String str, AmazonStoreProduct amazonStoreProduct, String str2) {
            super(1);
            this.$activity = activity;
            this.$appUserID = str;
            this.$storeProduct = amazonStoreProduct;
            this.$presentedOfferingIdentifier = str2;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError != null) {
                AmazonBilling.this.onPurchaseError(purchasesError);
                return;
            }
            PurchaseResponseListener purchaseResponseListener = AmazonBilling.this.purchaseHandler;
            Handler handler = AmazonBilling.this.mainHandler;
            Activity activity = this.$activity;
            String str = this.$appUserID;
            AmazonStoreProduct amazonStoreProduct = this.$storeProduct;
            String str2 = this.$presentedOfferingIdentifier;
            purchaseResponseListener.purchase(handler, activity, str, amazonStoreProduct, str2, new C00841(AmazonBilling.this, amazonStoreProduct, str2), new AnonymousClass2(AmazonBilling.this));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$normalizePurchaseData$2, reason: invalid class name and case insensitive filesystem */
    static final class C02392 extends r implements l<JSONObject, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<String, i0> $onSuccess;
        final /* synthetic */ String $purchaseToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02392(l<? super PurchasesError, i0> lVar, String str, l<? super String, i0> lVar2) {
            super(1);
            this.$onError = lVar;
            this.$purchaseToken = str;
            this.$onSuccess = lVar2;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(JSONObject jSONObject) {
            invoke2(jSONObject);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(JSONObject response) {
            q.f(response, "response");
            LogIntent logIntent = LogIntent.DEBUG;
            String str = String.format(AmazonStrings.RECEIPT_DATA_RECEIVED, Arrays.copyOf(new Object[]{response.toString()}, 1));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            String termSkuFromJSON = AmazonBilling.this.getTermSkuFromJSON(response);
            if (termSkuFromJSON == null) {
                this.$onError.invoke(ErrorsKt.missingTermSkuError(response));
            } else {
                AmazonBilling.this.cache.cacheSkusByToken(j0.c(x.a(this.$purchaseToken, termSkuFromJSON)));
                this.$onSuccess.invoke(termSkuFromJSON);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$normalizePurchaseData$3, reason: invalid class name */
    static final class AnonymousClass3 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(l<? super PurchasesError, i0> lVar) {
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
            this.$onError.invoke(ErrorsKt.errorGettingReceiptInfo(error));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryAllPurchases$1, reason: invalid class name and case insensitive filesystem */
    static final class C02401 extends r implements l<Map<String, ? extends StoreTransaction>, i0> {
        final /* synthetic */ l<List<StoreTransaction>, i0> $onReceivePurchaseHistory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02401(l<? super List<StoreTransaction>, i0> lVar) {
            super(1);
            this.$onReceivePurchaseHistory = lVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends StoreTransaction> map) {
            invoke2((Map<String, StoreTransaction>) map);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, StoreTransaction> it) {
            q.f(it, "it");
            this.$onReceivePurchaseHistory.invoke(w.U(it.values()));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryProductDetailsAsync$1, reason: invalid class name and case insensitive filesystem */
    static final class C02411 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<List<? extends StoreProduct>, i0> $onReceive;
        final /* synthetic */ Set<String> $productIds;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryProductDetailsAsync$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00851 extends r implements l<UserData, i0> {
            final /* synthetic */ l<PurchasesError, i0> $onError;
            final /* synthetic */ l<List<? extends StoreProduct>, i0> $onReceive;
            final /* synthetic */ Set<String> $productIds;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00851(AmazonBilling amazonBilling, Set<String> set, l<? super List<? extends StoreProduct>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
                super(1);
                this.this$0 = amazonBilling;
                this.$productIds = set;
                this.$onReceive = lVar;
                this.$onError = lVar2;
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ i0 invoke(UserData userData) {
                invoke2(userData);
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(UserData userData) {
                q.f(userData, "userData");
                ProductDataResponseListener productDataResponseListener = this.this$0.productDataHandler;
                Set<String> set = this.$productIds;
                String marketplace = userData.getMarketplace();
                q.e(marketplace, "userData.marketplace");
                productDataResponseListener.getProductData(set, marketplace, this.$onReceive, this.$onError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02411(l<? super PurchasesError, i0> lVar, Set<String> set, l<? super List<? extends StoreProduct>, i0> lVar2) {
            super(1);
            this.$onError = lVar;
            this.$productIds = set;
            this.$onReceive = lVar2;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.userDataHandler.getUserData(new C00851(AmazonBilling.this, this.$productIds, this.$onReceive, this.$onError), this.$onError);
            } else {
                this.$onError.invoke(purchasesError);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1, reason: invalid class name and case insensitive filesystem */
    static final class C02421 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ boolean $filterOnlyActivePurchases;
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<Map<String, StoreTransaction>, i0> $onSuccess;

        /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00861 extends r implements p<List<? extends Receipt>, UserData, i0> {
            final /* synthetic */ boolean $filterOnlyActivePurchases;
            final /* synthetic */ l<PurchasesError, i0> $onError;
            final /* synthetic */ l<Map<String, StoreTransaction>, i0> $onSuccess;
            final /* synthetic */ AmazonBilling this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.amazon.AmazonBilling$queryPurchases$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C00871 extends r implements p<Map<String, ? extends String>, Map<String, ? extends PurchasesError>, i0> {
                final /* synthetic */ List<Receipt> $filteredReceipts;
                final /* synthetic */ l<PurchasesError, i0> $onError;
                final /* synthetic */ l<Map<String, StoreTransaction>, i0> $onSuccess;
                final /* synthetic */ UserData $userData;
                final /* synthetic */ AmazonBilling this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00871(AmazonBilling amazonBilling, l<? super PurchasesError, i0> lVar, List<Receipt> list, UserData userData, l<? super Map<String, StoreTransaction>, i0> lVar2) {
                    super(2);
                    this.this$0 = amazonBilling;
                    this.$onError = lVar;
                    this.$filteredReceipts = list;
                    this.$userData = userData;
                    this.$onSuccess = lVar2;
                }

                @Override // p6.p
                public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends String> map, Map<String, ? extends PurchasesError> map2) {
                    invoke2((Map<String, String>) map, (Map<String, PurchasesError>) map2);
                    return i0.f21430a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Map<String, String> tokensToSkusMap, Map<String, PurchasesError> errors) {
                    Object mapOfReceiptHashesToRestoredPurchases;
                    l lVar;
                    q.f(tokensToSkusMap, "tokensToSkusMap");
                    q.f(errors, "errors");
                    this.this$0.logErrorsIfAny(errors);
                    if (tokensToSkusMap.isEmpty()) {
                        mapOfReceiptHashesToRestoredPurchases = new PurchasesError(PurchasesErrorCode.InvalidReceiptError, AmazonStrings.ERROR_FETCHING_PURCHASE_HISTORY_ALL_RECEIPTS_INVALID);
                        lVar = this.$onError;
                    } else {
                        mapOfReceiptHashesToRestoredPurchases = this.this$0.toMapOfReceiptHashesToRestoredPurchases(this.$filteredReceipts, tokensToSkusMap, this.$userData);
                        lVar = this.$onSuccess;
                    }
                    lVar.invoke(mapOfReceiptHashesToRestoredPurchases);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00861(boolean z7, l<? super Map<String, StoreTransaction>, i0> lVar, AmazonBilling amazonBilling, l<? super PurchasesError, i0> lVar2) {
                super(2);
                this.$filterOnlyActivePurchases = z7;
                this.$onSuccess = lVar;
                this.this$0 = amazonBilling;
                this.$onError = lVar2;
            }

            @Override // p6.p
            public /* bridge */ /* synthetic */ i0 invoke(List<? extends Receipt> list, UserData userData) {
                invoke2((List<Receipt>) list, userData);
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<Receipt> receipts, UserData userData) {
                q.f(receipts, "receipts");
                q.f(userData, "userData");
                if (this.$filterOnlyActivePurchases) {
                    AmazonBilling amazonBilling = this.this$0;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : receipts) {
                        Receipt receipt = (Receipt) obj;
                        if (receipt.getCancelDate() == null || receipt.getCancelDate().compareTo(amazonBilling.dateProvider.getNow()) > 0) {
                            arrayList.add(obj);
                        }
                    }
                    receipts = arrayList;
                }
                if (receipts.isEmpty()) {
                    this.$onSuccess.invoke(k0.e());
                    return;
                }
                AmazonBilling amazonBilling2 = this.this$0;
                String userId = userData.getUserId();
                q.e(userId, "userData.userId");
                amazonBilling2.getMissingSkusForReceipts(userId, receipts, new C00871(this.this$0, this.$onError, receipts, userData, this.$onSuccess));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02421(l<? super PurchasesError, i0> lVar, boolean z7, l<? super Map<String, StoreTransaction>, i0> lVar2) {
            super(1);
            this.$onError = lVar;
            this.$filterOnlyActivePurchases = z7;
            this.$onSuccess = lVar2;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            if (purchasesError == null) {
                AmazonBilling.this.purchaseUpdatesHandler.queryPurchases(new C00861(this.$filterOnlyActivePurchases, this.$onSuccess, AmazonBilling.this, this.$onError), this.$onError);
            } else {
                this.$onError.invoke(purchasesError);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling(Context applicationContext, AmazonBackend amazonBackend, AmazonCache cache, boolean z7, Handler mainHandler, PurchasesStateProvider stateProvider, PurchasingServiceProvider purchasingServiceProvider, ProductDataResponseListener productDataHandler, PurchaseResponseListener purchaseHandler, PurchaseUpdatesResponseListener purchaseUpdatesHandler, UserDataResponseListener userDataHandler, DateProvider dateProvider) {
        super(stateProvider);
        q.f(applicationContext, "applicationContext");
        q.f(amazonBackend, "amazonBackend");
        q.f(cache, "cache");
        q.f(mainHandler, "mainHandler");
        q.f(stateProvider, "stateProvider");
        q.f(purchasingServiceProvider, "purchasingServiceProvider");
        q.f(productDataHandler, "productDataHandler");
        q.f(purchaseHandler, "purchaseHandler");
        q.f(purchaseUpdatesHandler, "purchaseUpdatesHandler");
        q.f(userDataHandler, "userDataHandler");
        q.f(dateProvider, "dateProvider");
        this.applicationContext = applicationContext;
        this.amazonBackend = amazonBackend;
        this.cache = cache;
        this.observerMode = z7;
        this.mainHandler = mainHandler;
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.productDataHandler = productDataHandler;
        this.purchaseHandler = purchaseHandler;
        this.purchaseUpdatesHandler = purchaseUpdatesHandler;
        this.userDataHandler = userDataHandler;
        this.dateProvider = dateProvider;
        this.serviceRequests = new ConcurrentLinkedQueue<>();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AmazonBilling(Context context, AmazonBackend amazonBackend, AmazonCache amazonCache, boolean z7, Handler handler, PurchasesStateProvider purchasesStateProvider, PurchasingServiceProvider purchasingServiceProvider, ProductDataResponseListener productDataResponseListener, PurchaseResponseListener purchaseResponseListener, PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, UserDataResponseListener userDataResponseListener, DateProvider dateProvider, int i8, j jVar) {
        PurchasingServiceProvider defaultPurchasingServiceProvider = (i8 & 64) != 0 ? new DefaultPurchasingServiceProvider() : purchasingServiceProvider;
        this(context, amazonBackend, amazonCache, z7, handler, purchasesStateProvider, defaultPurchasingServiceProvider, (i8 & 128) != 0 ? new ProductDataHandler(defaultPurchasingServiceProvider, handler) : productDataResponseListener, (i8 & 256) != 0 ? new PurchaseHandler(defaultPurchasingServiceProvider, context) : purchaseResponseListener, (i8 & 512) != 0 ? new PurchaseUpdatesHandler(defaultPurchasingServiceProvider) : purchaseUpdatesResponseListener, (i8 & 1024) != 0 ? new UserDataHandler(defaultPurchasingServiceProvider, handler, null, 4, null) : userDataResponseListener, (i8 & 2048) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmazonBilling(Context applicationContext, DeviceCache cache, boolean z7, Handler mainHandler, BackendHelper backendHelper, PurchasesStateProvider stateProvider) {
        this(applicationContext, new AmazonBackend(backendHelper), new AmazonCache(cache), z7, mainHandler, stateProvider, null, null, null, null, null, null, 4032, null);
        q.f(applicationContext, "applicationContext");
        q.f(cache, "cache");
        q.f(mainHandler, "mainHandler");
        q.f(backendHelper, "backendHelper");
        q.f(stateProvider, "stateProvider");
    }

    private final boolean checkObserverMode() {
        if (!this.observerMode) {
            return false;
        }
        LogWrapperKt.log(LogIntent.AMAZON_WARNING, AmazonStrings.WARNING_AMAZON_OBSERVER_MODE);
        return true;
    }

    private final void executePendingRequests() {
        synchronized (this) {
            while (isConnected() && !this.serviceRequests.isEmpty()) {
                final l<PurchasesError, i0> lVarRemove = this.serviceRequests.remove();
                runOnUIThread(new Runnable() { // from class: com.revenuecat.purchases.amazon.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        lVarRemove.invoke(null);
                    }
                });
            }
            i0 i0Var = i0.f21430a;
        }
    }

    private final synchronized void executeRequestOnUIThread(l<? super PurchasesError, i0> lVar) {
        if (getPurchasesUpdatedListener() != null) {
            this.serviceRequests.add(lVar);
            if (isConnected()) {
                executePendingRequests();
            } else {
                BillingAbstract.startConnectionOnMainThread$default(this, 0L, 1, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getMissingSkusForReceipts(String str, List<Receipt> list, p<? super Map<String, String>, ? super Map<String, PurchasesError>, i0> pVar) {
        AmazonBilling amazonBilling = this;
        Map<String, String> receiptSkus = amazonBilling.cache.getReceiptSkus();
        Map mapT = k0.t(receiptSkus);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<Receipt> arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Receipt) next).getProductType() == ProductType.SUBSCRIPTION)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(f6.p.m(arrayList, 10));
        for (Receipt receipt : arrayList) {
            arrayList2.add(x.a(receipt.getReceiptId(), receipt.getSku()));
        }
        k0.k(mapT, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (((Receipt) obj).getProductType() == ProductType.SUBSCRIPTION) {
                arrayList3.add(obj);
            }
        }
        ArrayList<Receipt> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (!receiptSkus.containsKey(((Receipt) obj2).getReceiptId())) {
                arrayList4.add(obj2);
            }
        }
        if (arrayList4.isEmpty()) {
            pVar.invoke(mapT, linkedHashMap);
            return;
        }
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.f24324a = arrayList4.size();
        for (Receipt receipt2 : arrayList4) {
            AmazonBackend amazonBackend = amazonBilling.amazonBackend;
            String receiptId = receipt2.getReceiptId();
            q.e(receiptId, "receipt.receiptId");
            amazonBackend.getAmazonReceiptData(receiptId, str, new AmazonBilling$getMissingSkusForReceipts$1$1(mapT, receipt2, xVar, this, pVar, linkedHashMap), new AmazonBilling$getMissingSkusForReceipts$1$2(linkedHashMap, receipt2, xVar, pVar, mapT));
            amazonBilling = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getTermSkuFromJSON(JSONObject jSONObject) {
        try {
            return jSONObject.getString(com.amazon.a.a.o.b.L);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleReceipt(Receipt receipt, UserData userData, StoreProduct storeProduct, String str) {
        if (receipt.getProductType() != ProductType.SUBSCRIPTION) {
            StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(receipt, storeProduct.getId(), str, PurchaseState.PURCHASED, userData);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(n.b(storeTransaction));
                return;
            }
            return;
        }
        AmazonBackend amazonBackend = this.amazonBackend;
        String receiptId = receipt.getReceiptId();
        q.e(receiptId, "receipt.receiptId");
        String userId = userData.getUserId();
        q.e(userId, "userData.userId");
        amazonBackend.getAmazonReceiptData(receiptId, userId, new C02371(receipt, str, userData, this), new AnonymousClass2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logErrorsIfAny(Map<String, PurchasesError> map) {
        if (!map.isEmpty()) {
            String strG = w.G(map.keySet(), "\n", null, null, 0, null, null, 62, null);
            LogIntent logIntent = LogIntent.AMAZON_ERROR;
            String str = String.format(AmazonStrings.ERROR_FETCHING_RECEIPTS, Arrays.copyOf(new Object[]{strG}, 1));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPurchaseError(PurchasesError purchasesError) {
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
        }
    }

    private final void queryPurchases(boolean z7, l<? super Map<String, StoreTransaction>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        executeRequestOnUIThread(new C02421(lVar2, z7, lVar));
    }

    private final void runOnUIThread(Runnable runnable) {
        if (q.b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            runnable.run();
        } else {
            this.mainHandler.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startConnectionOnMainThread$lambda$0(AmazonBilling this$0) {
        q.f(this$0, "this$0");
        this$0.startConnection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, StoreTransaction> toMapOfReceiptHashesToRestoredPurchases(List<Receipt> list, Map<String, String> map, UserData userData) {
        ArrayList arrayList = new ArrayList();
        for (Receipt receipt : list) {
            String str = map.get(receipt.getReceiptId());
            e6.r rVarA = null;
            if (str == null) {
                LogWrapperKt.log(LogIntent.AMAZON_ERROR, AmazonStrings.ERROR_FINDING_RECEIPT_SKU);
            } else {
                StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(receipt, str, null, PurchaseState.UNSPECIFIED_STATE, userData);
                String receiptId = receipt.getReceiptId();
                q.e(receiptId, "receipt.receiptId");
                rVarA = x.a(UtilsKt.sha1(receiptId), storeTransaction);
            }
            if (rVarA != null) {
                arrayList.add(rVarA);
            }
        }
        return k0.n(arrayList);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void consumeAndSave(boolean z7, StoreTransaction purchase, PostReceiptInitiationSource initiationSource) {
        q.f(purchase, "purchase");
        q.f(initiationSource, "initiationSource");
        if (checkObserverMode() || purchase.getType() == com.revenuecat.purchases.ProductType.UNKNOWN || purchase.getPurchaseState() == PurchaseState.PENDING) {
            return;
        }
        if (z7) {
            executeRequestOnUIThread(new AnonymousClass1(purchase));
        }
        this.cache.addSuccessfullyPostedToken(purchase.getPurchaseToken());
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    protected void endConnection() {
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void findPurchaseInPurchaseHistory(String appUserID, com.revenuecat.purchases.ProductType productType, String productId, l<? super StoreTransaction, i0> onCompletion, l<? super PurchasesError, i0> onError) {
        q.f(appUserID, "appUserID");
        q.f(productType, "productType");
        q.f(productId, "productId");
        q.f(onCompletion, "onCompletion");
        q.f(onError, "onError");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(RestoreStrings.QUERYING_PURCHASE_WITH_TYPE, Arrays.copyOf(new Object[]{productId, productType.name()}, 2));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        queryAllPurchases(appUserID, new C02351(onCompletion, productId, onError), onError);
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener
    public void getProductData(Set<String> skus, String marketplace, l<? super List<? extends StoreProduct>, i0> onReceive, l<? super PurchasesError, i0> onError) {
        q.f(skus, "skus");
        q.f(marketplace, "marketplace");
        q.f(onReceive, "onReceive");
        q.f(onError, "onError");
        this.productDataHandler.getProductData(skus, marketplace, onReceive, onError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void getStorefront(l<? super String, i0> onSuccess, l<? super PurchasesError, i0> onError) {
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        executeRequestOnUIThread(new C02361(onError, onSuccess));
    }

    @Override // com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void getUserData(l<? super UserData, i0> onSuccess, l<? super PurchasesError, i0> onError) {
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        this.userDataHandler.getUserData(onSuccess, onError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public boolean isConnected() {
        return this.connected;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void makePurchaseAsync(Activity activity, String appUserID, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, String str, Boolean bool) {
        q.f(activity, "activity");
        q.f(appUserID, "appUserID");
        q.f(purchasingData, "purchasingData");
        AmazonPurchasingData.Product product = purchasingData instanceof AmazonPurchasingData.Product ? (AmazonPurchasingData.Product) purchasingData : null;
        if (product != null) {
            AmazonStoreProduct storeProduct = product.getStoreProduct();
            if (checkObserverMode()) {
                return;
            }
            if (replaceProductInfo != null) {
                LogWrapperKt.log(LogIntent.AMAZON_WARNING, AmazonStrings.PRODUCT_CHANGES_NOT_SUPPORTED);
                return;
            } else {
                executeRequestOnUIThread(new C02381(activity, appUserID, storeProduct, str));
                return;
            }
        }
        PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.UnknownError;
        String str2 = String.format(PurchaseStrings.INVALID_PURCHASE_TYPE, Arrays.copyOf(new Object[]{"Amazon", "AmazonPurchaseInfo"}, 2));
        q.e(str2, "format(this, *args)");
        PurchasesError purchasesError = new PurchasesError(purchasesErrorCode, str2);
        LogUtilsKt.errorLog(purchasesError);
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void normalizePurchaseData(String productID, String purchaseToken, String storeUserID, l<? super String, i0> onSuccess, l<? super PurchasesError, i0> onError) {
        q.f(productID, "productID");
        q.f(purchaseToken, "purchaseToken");
        q.f(storeUserID, "storeUserID");
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        String str = this.cache.getReceiptSkus().get(purchaseToken);
        if (str != null) {
            onSuccess.invoke(str);
        } else {
            this.amazonBackend.getAmazonReceiptData(purchaseToken, storeUserID, new C02392(onError, purchaseToken, onSuccess), new AnonymousClass3(onError));
        }
    }

    @Override // com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onProductDataResponse(ProductDataResponse response) {
        q.f(response, "response");
        if (checkObserverMode()) {
            return;
        }
        this.productDataHandler.onProductDataResponse(response);
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseResponse(PurchaseResponse response) {
        q.f(response, "response");
        if (checkObserverMode()) {
            return;
        }
        this.purchaseHandler.onPurchaseResponse(response);
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse response) {
        q.f(response, "response");
        if (checkObserverMode()) {
            return;
        }
        this.purchaseUpdatesHandler.onPurchaseUpdatesResponse(response);
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void onUserDataResponse(UserDataResponse response) {
        q.f(response, "response");
        if (checkObserverMode()) {
            return;
        }
        this.userDataHandler.onUserDataResponse(response);
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener
    public void purchase(Handler mainHandler, Activity activity, String appUserID, StoreProduct storeProduct, String str, p<? super Receipt, ? super UserData, i0> onSuccess, l<? super PurchasesError, i0> onError) {
        q.f(mainHandler, "mainHandler");
        q.f(activity, "activity");
        q.f(appUserID, "appUserID");
        q.f(storeProduct, "storeProduct");
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        this.purchaseHandler.purchase(mainHandler, activity, appUserID, storeProduct, str, onSuccess, onError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryAllPurchases(String appUserID, l<? super List<StoreTransaction>, i0> onReceivePurchaseHistory, l<? super PurchasesError, i0> onReceivePurchaseHistoryError) {
        q.f(appUserID, "appUserID");
        q.f(onReceivePurchaseHistory, "onReceivePurchaseHistory");
        q.f(onReceivePurchaseHistoryError, "onReceivePurchaseHistoryError");
        queryPurchases(false, (l<? super Map<String, StoreTransaction>, i0>) new C02401(onReceivePurchaseHistory), onReceivePurchaseHistoryError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryProductDetailsAsync(com.revenuecat.purchases.ProductType productType, Set<String> productIds, l<? super List<? extends StoreProduct>, i0> onReceive, l<? super PurchasesError, i0> onError) {
        q.f(productType, "productType");
        q.f(productIds, "productIds");
        q.f(onReceive, "onReceive");
        q.f(onError, "onError");
        if (checkObserverMode()) {
            return;
        }
        executeRequestOnUIThread(new C02411(onError, productIds, onReceive));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryPurchases(String appUserID, l<? super Map<String, StoreTransaction>, i0> onSuccess, l<? super PurchasesError, i0> onError) {
        q.f(appUserID, "appUserID");
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        if (checkObserverMode()) {
            return;
        }
        queryPurchases(true, onSuccess, onError);
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void queryPurchases(p<? super List<Receipt>, ? super UserData, i0> onSuccess, l<? super PurchasesError, i0> onError) {
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        this.purchaseUpdatesHandler.queryPurchases(onSuccess, onError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes, p6.a<i0> subscriptionStatusChange) {
        q.f(activity, "activity");
        q.f(inAppMessageTypes, "inAppMessageTypes");
        q.f(subscriptionStatusChange, "subscriptionStatusChange");
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnection() {
        if (checkObserverMode()) {
            return;
        }
        this.purchasingServiceProvider.registerListener(this.applicationContext, this);
        this.connected = true;
        BillingAbstract.StateListener stateListener = getStateListener();
        if (stateListener != null) {
            stateListener.onConnected();
        }
        executePendingRequests();
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnectionOnMainThread(long j8) {
        runOnUIThread(new Runnable() { // from class: com.revenuecat.purchases.amazon.a
            @Override // java.lang.Runnable
            public final void run() {
                AmazonBilling.startConnectionOnMainThread$lambda$0(this.f20871a);
            }
        });
    }
}
