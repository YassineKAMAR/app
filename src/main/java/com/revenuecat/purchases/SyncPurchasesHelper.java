package com.revenuecat.purchases;

import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import e6.i0;
import f6.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
public final class SyncPurchasesHelper {
    private final BillingAbstract billing;
    private final CustomerInfoHelper customerInfoHelper;
    private final IdentityManager identityManager;
    private final PostReceiptHelper postReceiptHelper;

    /* JADX INFO: renamed from: com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$1, reason: invalid class name and case insensitive filesystem */
    static final class C02341 extends r implements l<List<? extends StoreTransaction>, i0> {
        final /* synthetic */ boolean $appInBackground;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ boolean $isRestore;
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<CustomerInfo, i0> $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02341(String str, boolean z7, boolean z8, l<? super CustomerInfo, i0> lVar, l<? super PurchasesError, i0> lVar2) {
            super(1);
            this.$appUserID = str;
            this.$appInBackground = z7;
            this.$isRestore = z8;
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$handleLastPurchase(List<PurchasesError> list, SyncPurchasesHelper syncPurchasesHelper, String str, boolean z7, boolean z8, l<? super CustomerInfo, i0> lVar, l<? super PurchasesError, i0> lVar2, StoreTransaction storeTransaction, StoreTransaction storeTransaction2) {
            if (q.b(storeTransaction, storeTransaction2)) {
                if (list.isEmpty()) {
                    LogUtilsKt.debugLog(PurchaseStrings.SYNCED_PURCHASES_SUCCESSFULLY);
                    syncPurchasesHelper.retrieveCustomerInfo(str, z7, z8, lVar, lVar2);
                } else {
                    String str2 = String.format(PurchaseStrings.SYNCING_PURCHASES_ERROR, Arrays.copyOf(new Object[]{list}, 1));
                    q.e(str2, "format(this, *args)");
                    LogUtilsKt.errorLog$default(str2, null, 2, null);
                    lVar2.invoke(w.z(list));
                }
            }
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreTransaction> list) {
            invoke2((List<StoreTransaction>) list);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<StoreTransaction> allPurchases) {
            q.f(allPurchases, "allPurchases");
            if (!(!allPurchases.isEmpty())) {
                SyncPurchasesHelper.this.retrieveCustomerInfo(this.$appUserID, this.$appInBackground, this.$isRestore, this.$onSuccess, this.$onError);
                return;
            }
            StoreTransaction storeTransaction = (StoreTransaction) w.H(allPurchases);
            ArrayList arrayList = new ArrayList();
            SyncPurchasesHelper syncPurchasesHelper = SyncPurchasesHelper.this;
            boolean z7 = this.$isRestore;
            String str = this.$appUserID;
            boolean z8 = this.$appInBackground;
            l<CustomerInfo, i0> lVar = this.$onSuccess;
            l<PurchasesError, i0> lVar2 = this.$onError;
            for (StoreTransaction storeTransaction2 : allPurchases) {
                l<PurchasesError, i0> lVar3 = lVar2;
                boolean z9 = z8;
                syncPurchasesHelper.postReceiptHelper.postTokenWithoutConsuming(storeTransaction2.getPurchaseToken(), storeTransaction2.getStoreUserID(), new ReceiptInfo(storeTransaction2.getProductIds(), null, null, null, null, null, null, 126, null), z7, str, storeTransaction2.getMarketplace(), PostReceiptInitiationSource.RESTORE, new SyncPurchasesHelper$syncPurchases$1$1$1(storeTransaction2, storeTransaction, arrayList, syncPurchasesHelper, str, z8, z7, lVar, lVar3), new SyncPurchasesHelper$syncPurchases$1$1$2(storeTransaction2, arrayList, storeTransaction, syncPurchasesHelper, str, z9, z7, lVar, lVar3));
                lVar2 = lVar3;
                lVar = lVar;
                z8 = z9;
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.SyncPurchasesHelper$syncPurchases$2, reason: invalid class name */
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
        public final void invoke2(PurchasesError it) {
            q.f(it, "it");
            LogIntent logIntent = LogIntent.RC_ERROR;
            String str = String.format(PurchaseStrings.SYNCING_PURCHASES_ERROR, Arrays.copyOf(new Object[]{it}, 1));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            this.$onError.invoke(it);
        }
    }

    public SyncPurchasesHelper(BillingAbstract billing, IdentityManager identityManager, CustomerInfoHelper customerInfoHelper, PostReceiptHelper postReceiptHelper) {
        q.f(billing, "billing");
        q.f(identityManager, "identityManager");
        q.f(customerInfoHelper, "customerInfoHelper");
        q.f(postReceiptHelper, "postReceiptHelper");
        this.billing = billing;
        this.identityManager = identityManager;
        this.customerInfoHelper = customerInfoHelper;
        this.postReceiptHelper = postReceiptHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retrieveCustomerInfo(String str, boolean z7, boolean z8, final l<? super CustomerInfo, i0> lVar, final l<? super PurchasesError, i0> lVar2) {
        this.customerInfoHelper.retrieveCustomerInfo(str, CacheFetchPolicy.CACHED_OR_FETCHED, z7, z8, new ReceiveCustomerInfoCallback() { // from class: com.revenuecat.purchases.SyncPurchasesHelper.retrieveCustomerInfo.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onError(PurchasesError error) {
                q.f(error, "error");
                lVar2.invoke(error);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onReceived(CustomerInfo customerInfo) {
                q.f(customerInfo, "customerInfo");
                lVar.invoke(customerInfo);
            }
        });
    }

    public final void syncPurchases(boolean z7, boolean z8, l<? super CustomerInfo, i0> onSuccess, l<? super PurchasesError, i0> onError) {
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.SYNCING_PURCHASES);
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        this.billing.queryAllPurchases(currentAppUserID, new C02341(currentAppUserID, z8, z7, onSuccess, onError), new AnonymousClass2(onError));
    }
}
