package com.revenuecat.purchases.interfaces;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface GetStoreProductsCallback {
    void onError(PurchasesError purchasesError);

    void onReceived(List<StoreProduct> list);
}
