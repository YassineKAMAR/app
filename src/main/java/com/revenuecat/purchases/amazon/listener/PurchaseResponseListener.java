package com.revenuecat.purchases.amazon.listener;

import android.app.Activity;
import android.os.Handler;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreProduct;
import e6.i0;
import kotlin.jvm.internal.q;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public interface PurchaseResponseListener extends PurchasingListener {

    public static final class DefaultImpls {
        public static void onProductDataResponse(PurchaseResponseListener purchaseResponseListener, ProductDataResponse response) {
            q.f(response, "response");
        }

        public static void onPurchaseUpdatesResponse(PurchaseResponseListener purchaseResponseListener, PurchaseUpdatesResponse response) {
            q.f(response, "response");
        }

        public static void onUserDataResponse(PurchaseResponseListener purchaseResponseListener, UserDataResponse response) {
            q.f(response, "response");
        }
    }

    void onProductDataResponse(ProductDataResponse productDataResponse);

    void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse);

    void onUserDataResponse(UserDataResponse userDataResponse);

    void purchase(Handler handler, Activity activity, String str, StoreProduct storeProduct, String str2, p<? super Receipt, ? super UserData, i0> pVar, l<? super PurchasesError, i0> lVar);
}
