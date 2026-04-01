package com.revenuecat.purchases.interfaces;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;

/* JADX INFO: loaded from: classes.dex */
public interface SyncPurchasesCallback {
    void onError(PurchasesError purchasesError);

    void onSuccess(CustomerInfo customerInfo);
}
