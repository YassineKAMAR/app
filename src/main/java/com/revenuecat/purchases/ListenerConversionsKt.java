package com.revenuecat.purchases;

import android.app.Activity;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import e6.i0;
import java.util.List;
import kotlin.jvm.internal.q;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class ListenerConversionsKt {
    public static final void getCustomerInfoWith(Purchases purchases, CacheFetchPolicy fetchPolicy, l<? super PurchasesError, i0> onError, l<? super CustomerInfo, i0> onSuccess) {
        q.f(purchases, "<this>");
        q.f(fetchPolicy, "fetchPolicy");
        q.f(onError, "onError");
        q.f(onSuccess, "onSuccess");
        purchases.getCustomerInfo(fetchPolicy, ListenerConversionsCommonKt.receiveCustomerInfoCallback(onSuccess, onError));
    }

    public static final void getCustomerInfoWith(Purchases purchases, l<? super PurchasesError, i0> onError, l<? super CustomerInfo, i0> onSuccess) {
        q.f(purchases, "<this>");
        q.f(onError, "onError");
        q.f(onSuccess, "onSuccess");
        purchases.getCustomerInfo(ListenerConversionsCommonKt.receiveCustomerInfoCallback(onSuccess, onError));
    }

    public static /* synthetic */ void getCustomerInfoWith$default(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, l lVar, l lVar2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getCustomerInfoWith(purchases, cacheFetchPolicy, lVar, lVar2);
    }

    public static /* synthetic */ void getCustomerInfoWith$default(Purchases purchases, l lVar, l lVar2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getCustomerInfoWith(purchases, lVar, lVar2);
    }

    public static final void getNonSubscriptionSkusWith(Purchases purchases, List<String> skus, l<? super PurchasesError, i0> onError, l<? super List<? extends StoreProduct>, i0> onReceiveSkus) {
        q.f(purchases, "<this>");
        q.f(skus, "skus");
        q.f(onError, "onError");
        q.f(onReceiveSkus, "onReceiveSkus");
        purchases.getProducts(skus, ProductType.INAPP, ListenerConversionsCommonKt.getStoreProductsCallback(onReceiveSkus, onError));
    }

    public static final void getSubscriptionSkusWith(Purchases purchases, List<String> skus, l<? super PurchasesError, i0> onError, l<? super List<? extends StoreProduct>, i0> onReceiveSkus) {
        q.f(purchases, "<this>");
        q.f(skus, "skus");
        q.f(onError, "onError");
        q.f(onReceiveSkus, "onReceiveSkus");
        purchases.getProducts(skus, ProductType.SUBS, ListenerConversionsCommonKt.getStoreProductsCallback(onReceiveSkus, onError));
    }

    public static /* synthetic */ void getSubscriptionSkusWith$default(Purchases purchases, List list, l lVar, l lVar2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getSubscriptionSkusWith(purchases, list, lVar, lVar2);
    }

    public static final LogInCallback logInSuccessListener(final p<? super CustomerInfo, ? super Boolean, i0> onSuccess, final l<? super PurchasesError, i0> onError) {
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        return new LogInCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.logInSuccessListener.1
            @Override // com.revenuecat.purchases.interfaces.LogInCallback
            public void onError(PurchasesError error) {
                q.f(error, "error");
                l<PurchasesError, i0> lVar = onError;
                if (lVar != null) {
                    lVar.invoke(error);
                }
            }

            @Override // com.revenuecat.purchases.interfaces.LogInCallback
            public void onReceived(CustomerInfo customerInfo, boolean z7) {
                q.f(customerInfo, "customerInfo");
                p<CustomerInfo, Boolean, i0> pVar = onSuccess;
                if (pVar != null) {
                    pVar.invoke(customerInfo, Boolean.valueOf(z7));
                }
            }
        };
    }

    public static final void logInWith(Purchases purchases, String appUserID, l<? super PurchasesError, i0> onError, p<? super CustomerInfo, ? super Boolean, i0> onSuccess) {
        q.f(purchases, "<this>");
        q.f(appUserID, "appUserID");
        q.f(onError, "onError");
        q.f(onSuccess, "onSuccess");
        purchases.logIn(appUserID, logInSuccessListener(onSuccess, onError));
    }

    public static /* synthetic */ void logInWith$default(Purchases purchases, String str, l lVar, p pVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        logInWith(purchases, str, lVar, pVar);
    }

    public static final void logOutWith(Purchases purchases, l<? super PurchasesError, i0> onError, l<? super CustomerInfo, i0> onSuccess) {
        q.f(purchases, "<this>");
        q.f(onError, "onError");
        q.f(onSuccess, "onSuccess");
        purchases.logOut(ListenerConversionsCommonKt.receiveCustomerInfoCallback(onSuccess, onError));
    }

    public static /* synthetic */ void logOutWith$default(Purchases purchases, l lVar, l lVar2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        logOutWith(purchases, lVar, lVar2);
    }

    public static final ProductChangeCallback productChangeCompletedListener(final p<? super StoreTransaction, ? super CustomerInfo, i0> onSuccess, final p<? super PurchasesError, ? super Boolean, i0> onError) {
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        return new ProductChangeCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.productChangeCompletedListener.1
            @Override // com.revenuecat.purchases.interfaces.ProductChangeCallback
            public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                q.f(customerInfo, "customerInfo");
                onSuccess.invoke(storeTransaction, customerInfo);
            }

            @Override // com.revenuecat.purchases.interfaces.PurchaseErrorCallback
            public void onError(PurchasesError error, boolean z7) {
                q.f(error, "error");
                onError.invoke(error, Boolean.valueOf(z7));
            }
        };
    }

    public static final void purchasePackageWith(Purchases purchases, Activity activity, Package packageToPurchase, UpgradeInfo upgradeInfo, p<? super PurchasesError, ? super Boolean, i0> onError, p<? super StoreTransaction, ? super CustomerInfo, i0> onSuccess) {
        q.f(purchases, "<this>");
        q.f(activity, "activity");
        q.f(packageToPurchase, "packageToPurchase");
        q.f(upgradeInfo, "upgradeInfo");
        q.f(onError, "onError");
        q.f(onSuccess, "onSuccess");
        purchases.purchasePackage(activity, packageToPurchase, upgradeInfo, productChangeCompletedListener(onSuccess, onError));
    }

    public static final void purchasePackageWith(Purchases purchases, Activity activity, Package packageToPurchase, p<? super PurchasesError, ? super Boolean, i0> onError, p<? super StoreTransaction, ? super CustomerInfo, i0> onSuccess) {
        q.f(purchases, "<this>");
        q.f(activity, "activity");
        q.f(packageToPurchase, "packageToPurchase");
        q.f(onError, "onError");
        q.f(onSuccess, "onSuccess");
        purchases.purchasePackage(activity, packageToPurchase, ListenerConversionsCommonKt.purchaseCompletedCallback(onSuccess, onError));
    }

    public static /* synthetic */ void purchasePackageWith$default(Purchases purchases, Activity activity, Package r8, UpgradeInfo upgradeInfo, p pVar, p pVar2, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            pVar = ListenerConversionsCommonKt.getON_PURCHASE_ERROR_STUB();
        }
        purchasePackageWith(purchases, activity, r8, upgradeInfo, pVar, pVar2);
    }

    public static /* synthetic */ void purchasePackageWith$default(Purchases purchases, Activity activity, Package r22, p pVar, p pVar2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            pVar = ListenerConversionsCommonKt.getON_PURCHASE_ERROR_STUB();
        }
        purchasePackageWith(purchases, activity, r22, pVar, pVar2);
    }

    public static final void purchaseProductWith(Purchases purchases, Activity activity, StoreProduct storeProduct, UpgradeInfo upgradeInfo, p<? super PurchasesError, ? super Boolean, i0> onError, p<? super StoreTransaction, ? super CustomerInfo, i0> onSuccess) {
        q.f(purchases, "<this>");
        q.f(activity, "activity");
        q.f(storeProduct, "storeProduct");
        q.f(upgradeInfo, "upgradeInfo");
        q.f(onError, "onError");
        q.f(onSuccess, "onSuccess");
        purchases.purchaseProduct(activity, storeProduct, upgradeInfo, productChangeCompletedListener(onSuccess, onError));
    }

    public static final void purchaseProductWith(Purchases purchases, Activity activity, StoreProduct storeProduct, p<? super PurchasesError, ? super Boolean, i0> onError, p<? super StoreTransaction, ? super CustomerInfo, i0> onSuccess) {
        q.f(purchases, "<this>");
        q.f(activity, "activity");
        q.f(storeProduct, "storeProduct");
        q.f(onError, "onError");
        q.f(onSuccess, "onSuccess");
        purchases.purchaseProduct(activity, storeProduct, ListenerConversionsCommonKt.purchaseCompletedCallback(onSuccess, onError));
    }

    public static /* synthetic */ void purchaseProductWith$default(Purchases purchases, Activity activity, StoreProduct storeProduct, UpgradeInfo upgradeInfo, p pVar, p pVar2, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            pVar = ListenerConversionsCommonKt.getON_PURCHASE_ERROR_STUB();
        }
        purchaseProductWith(purchases, activity, storeProduct, upgradeInfo, pVar, pVar2);
    }

    public static /* synthetic */ void purchaseProductWith$default(Purchases purchases, Activity activity, StoreProduct storeProduct, p pVar, p pVar2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            pVar = ListenerConversionsCommonKt.getON_PURCHASE_ERROR_STUB();
        }
        purchaseProductWith(purchases, activity, storeProduct, pVar, pVar2);
    }

    public static final SyncPurchasesCallback syncPurchasesListener(final l<? super CustomerInfo, i0> onSuccess, final l<? super PurchasesError, i0> onError) {
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        return new SyncPurchasesCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.syncPurchasesListener.1
            @Override // com.revenuecat.purchases.interfaces.SyncPurchasesCallback
            public void onError(PurchasesError error) {
                q.f(error, "error");
                onError.invoke(error);
            }

            @Override // com.revenuecat.purchases.interfaces.SyncPurchasesCallback
            public void onSuccess(CustomerInfo customerInfo) {
                q.f(customerInfo, "customerInfo");
                onSuccess.invoke(customerInfo);
            }
        };
    }

    public static final void syncPurchasesWith(Purchases purchases, l<? super PurchasesError, i0> onError, l<? super CustomerInfo, i0> onSuccess) {
        q.f(purchases, "<this>");
        q.f(onError, "onError");
        q.f(onSuccess, "onSuccess");
        purchases.syncPurchases(syncPurchasesListener(onSuccess, onError));
    }

    public static /* synthetic */ void syncPurchasesWith$default(Purchases purchases, l lVar, l lVar2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            lVar = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        syncPurchasesWith(purchases, lVar, lVar2);
    }
}
