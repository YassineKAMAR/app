package com.revenuecat.purchases.amazon.listener;

import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreProduct;
import e6.i0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.q;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
public interface ProductDataResponseListener extends PurchasingListener {

    public static final class DefaultImpls {
        public static void onPurchaseResponse(ProductDataResponseListener productDataResponseListener, PurchaseResponse response) {
            q.f(response, "response");
        }

        public static void onPurchaseUpdatesResponse(ProductDataResponseListener productDataResponseListener, PurchaseUpdatesResponse response) {
            q.f(response, "response");
        }

        public static void onUserDataResponse(ProductDataResponseListener productDataResponseListener, UserDataResponse response) {
            q.f(response, "response");
        }
    }

    void getProductData(Set<String> set, String str, l<? super List<? extends StoreProduct>, i0> lVar, l<? super PurchasesError, i0> lVar2);

    @Override // com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    void onPurchaseResponse(PurchaseResponse purchaseResponse);

    @Override // com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse);

    @Override // com.amazon.device.iap.PurchasingListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    void onUserDataResponse(UserDataResponse userDataResponse);
}
