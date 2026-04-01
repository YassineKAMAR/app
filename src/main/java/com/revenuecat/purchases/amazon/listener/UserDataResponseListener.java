package com.revenuecat.purchases.amazon.listener;

import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.PurchasesError;
import e6.i0;
import kotlin.jvm.internal.q;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
public interface UserDataResponseListener extends PurchasingListener {

    public static final class DefaultImpls {
        public static void onProductDataResponse(UserDataResponseListener userDataResponseListener, ProductDataResponse response) {
            q.f(response, "response");
        }

        public static void onPurchaseResponse(UserDataResponseListener userDataResponseListener, PurchaseResponse response) {
            q.f(response, "response");
        }

        public static void onPurchaseUpdatesResponse(UserDataResponseListener userDataResponseListener, PurchaseUpdatesResponse response) {
            q.f(response, "response");
        }
    }

    void getUserData(l<? super UserData, i0> lVar, l<? super PurchasesError, i0> lVar2);

    void onProductDataResponse(ProductDataResponse productDataResponse);

    void onPurchaseResponse(PurchaseResponse purchaseResponse);

    void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse);
}
