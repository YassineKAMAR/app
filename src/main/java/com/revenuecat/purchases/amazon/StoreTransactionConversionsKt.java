package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.StoreTransaction;
import f6.n;
import java.util.List;
import kotlin.jvm.internal.q;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class StoreTransactionConversionsKt {
    public static final StoreTransaction toStoreTransaction(Receipt receipt, String productId, String str, PurchaseState purchaseState, UserData userData) {
        q.f(receipt, "<this>");
        q.f(productId, "productId");
        q.f(purchaseState, "purchaseState");
        q.f(userData, "userData");
        ProductType productType = receipt.getProductType();
        q.e(productType, "this.productType");
        com.revenuecat.purchases.ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(productType);
        List listB = n.b(productId);
        long time = receipt.getPurchaseDate().getTime();
        String receiptId = receipt.getReceiptId();
        q.e(receiptId, "this.receiptId");
        boolean z7 = false;
        if (revenueCatProductType == com.revenuecat.purchases.ProductType.SUBS && !receipt.isCanceled()) {
            z7 = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z7);
        JSONObject json = receipt.toJSON();
        q.e(json, "this.toJSON()");
        return new StoreTransaction((String) null, (List<String>) listB, revenueCatProductType, time, receiptId, purchaseState, boolValueOf, (String) null, json, str, userData.getUserId(), PurchaseType.AMAZON_PURCHASE, userData.getMarketplace(), (String) null, (ReplacementMode) null);
    }
}
