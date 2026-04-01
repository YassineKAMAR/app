package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import e6.i0;
import java.util.List;
import kotlin.jvm.internal.q;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class ListenerConversionsCommonKt {
    private static final l<PurchasesError, i0> ON_ERROR_STUB = ListenerConversionsCommonKt$ON_ERROR_STUB$1.INSTANCE;
    private static final p<PurchasesError, Boolean, i0> ON_PURCHASE_ERROR_STUB = ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1.INSTANCE;

    public static final l<PurchasesError, i0> getON_ERROR_STUB() {
        return ON_ERROR_STUB;
    }

    public static final p<PurchasesError, Boolean, i0> getON_PURCHASE_ERROR_STUB() {
        return ON_PURCHASE_ERROR_STUB;
    }

    public static final void getOfferingsWith(Purchases purchases, l<? super PurchasesError, i0> onError, l<? super Offerings, i0> onSuccess) {
        q.f(purchases, "<this>");
        q.f(onError, "onError");
        q.f(onSuccess, "onSuccess");
        purchases.getOfferings(receiveOfferingsCallback(onSuccess, onError));
    }

    public static /* synthetic */ void getOfferingsWith$default(Purchases purchases, l lVar, l lVar2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            lVar = ON_ERROR_STUB;
        }
        getOfferingsWith(purchases, lVar, lVar2);
    }

    public static final void getProductsWith(Purchases purchases, List<String> productIds, ProductType productType, l<? super PurchasesError, i0> onError, l<? super List<? extends StoreProduct>, i0> onGetStoreProducts) {
        q.f(purchases, "<this>");
        q.f(productIds, "productIds");
        q.f(onError, "onError");
        q.f(onGetStoreProducts, "onGetStoreProducts");
        purchases.getProducts(productIds, productType, getStoreProductsCallback(onGetStoreProducts, onError));
    }

    public static final void getProductsWith(Purchases purchases, List<String> productIds, l<? super PurchasesError, i0> onError, l<? super List<? extends StoreProduct>, i0> onGetStoreProducts) {
        q.f(purchases, "<this>");
        q.f(productIds, "productIds");
        q.f(onError, "onError");
        q.f(onGetStoreProducts, "onGetStoreProducts");
        purchases.getProducts(productIds, getStoreProductsCallback(onGetStoreProducts, onError));
    }

    public static /* synthetic */ void getProductsWith$default(Purchases purchases, List list, ProductType productType, l lVar, l lVar2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            lVar = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, productType, lVar, lVar2);
    }

    public static /* synthetic */ void getProductsWith$default(Purchases purchases, List list, l lVar, l lVar2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            lVar = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, lVar, lVar2);
    }

    public static final GetStoreProductsCallback getStoreProductsCallback(final l<? super List<? extends StoreProduct>, i0> onReceived, final l<? super PurchasesError, i0> onError) {
        q.f(onReceived, "onReceived");
        q.f(onError, "onError");
        return new GetStoreProductsCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.getStoreProductsCallback.1
            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onError(PurchasesError error) {
                q.f(error, "error");
                onError.invoke(error);
            }

            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onReceived(List<? extends StoreProduct> storeProducts) {
                q.f(storeProducts, "storeProducts");
                onReceived.invoke(storeProducts);
            }
        };
    }

    public static final PurchaseCallback purchaseCompletedCallback(final p<? super StoreTransaction, ? super CustomerInfo, i0> onSuccess, final p<? super PurchasesError, ? super Boolean, i0> onError) {
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        return new PurchaseCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.purchaseCompletedCallback.1
            @Override // com.revenuecat.purchases.interfaces.PurchaseCallback
            public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                q.f(storeTransaction, "storeTransaction");
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

    public static final void purchaseWith(Purchases purchases, PurchaseParams purchaseParams, p<? super PurchasesError, ? super Boolean, i0> onError, p<? super StoreTransaction, ? super CustomerInfo, i0> onSuccess) {
        q.f(purchases, "<this>");
        q.f(purchaseParams, "purchaseParams");
        q.f(onError, "onError");
        q.f(onSuccess, "onSuccess");
        purchases.purchase(purchaseParams, purchaseCompletedCallback(onSuccess, onError));
    }

    public static /* synthetic */ void purchaseWith$default(Purchases purchases, PurchaseParams purchaseParams, p pVar, p pVar2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            pVar = ON_PURCHASE_ERROR_STUB;
        }
        purchaseWith(purchases, purchaseParams, pVar, pVar2);
    }

    public static final ReceiveCustomerInfoCallback receiveCustomerInfoCallback(final l<? super CustomerInfo, i0> onSuccess, final l<? super PurchasesError, i0> onError) {
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        return new ReceiveCustomerInfoCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.receiveCustomerInfoCallback.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onError(PurchasesError error) {
                q.f(error, "error");
                l<PurchasesError, i0> lVar = onError;
                if (lVar != null) {
                    lVar.invoke(error);
                }
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onReceived(CustomerInfo customerInfo) {
                q.f(customerInfo, "customerInfo");
                l<CustomerInfo, i0> lVar = onSuccess;
                if (lVar != null) {
                    lVar.invoke(customerInfo);
                }
            }
        };
    }

    public static final ReceiveOfferingsCallback receiveOfferingsCallback(final l<? super Offerings, i0> onSuccess, final l<? super PurchasesError, i0> onError) {
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        return new ReceiveOfferingsCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.receiveOfferingsCallback.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onError(PurchasesError error) {
                q.f(error, "error");
                onError.invoke(error);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onReceived(Offerings offerings) {
                q.f(offerings, "offerings");
                onSuccess.invoke(offerings);
            }
        };
    }

    public static final void restorePurchasesWith(Purchases purchases, l<? super PurchasesError, i0> onError, l<? super CustomerInfo, i0> onSuccess) {
        q.f(purchases, "<this>");
        q.f(onError, "onError");
        q.f(onSuccess, "onSuccess");
        purchases.restorePurchases(receiveCustomerInfoCallback(onSuccess, onError));
    }

    public static /* synthetic */ void restorePurchasesWith$default(Purchases purchases, l lVar, l lVar2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            lVar = ON_ERROR_STUB;
        }
        restorePurchasesWith(purchases, lVar, lVar2);
    }
}
