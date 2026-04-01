package com.revenuecat.purchases.amazon.listener;

import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.PurchasesError;
import e6.i0;
import java.util.List;
import kotlin.jvm.internal.q;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public interface PurchaseUpdatesResponseListener extends PurchasingListener {

    public static final class DefaultImpls {
        public static void onProductDataResponse(PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, ProductDataResponse response) {
            q.f(response, "response");
        }

        public static void onPurchaseResponse(PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, PurchaseResponse response) {
            q.f(response, "response");
        }

        public static void onUserDataResponse(PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, UserDataResponse response) {
            q.f(response, "response");
        }
    }

    void onProductDataResponse(ProductDataResponse productDataResponse);

    void onPurchaseResponse(PurchaseResponse purchaseResponse);

    void onUserDataResponse(UserDataResponse userDataResponse);

    void queryPurchases(p<? super List<Receipt>, ? super UserData, i0> pVar, l<? super PurchasesError, i0> lVar);
}
