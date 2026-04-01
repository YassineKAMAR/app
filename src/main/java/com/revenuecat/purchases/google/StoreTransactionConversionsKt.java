package com.revenuecat.purchases.google;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.jvm.internal.q;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class StoreTransactionConversionsKt {
    public static final Purchase getOriginalGooglePurchase(StoreTransaction storeTransaction) {
        q.f(storeTransaction, "<this>");
        String signature = storeTransaction.getSignature();
        if (signature == null) {
            return null;
        }
        if (!(storeTransaction.getPurchaseType() == PurchaseType.GOOGLE_PURCHASE)) {
            signature = null;
        }
        if (signature != null) {
            return new Purchase(storeTransaction.getOriginalJson().toString(), signature);
        }
        return null;
    }

    public static final StoreTransaction toStoreTransaction(Purchase purchase, ProductType productType, String str, String str2, GoogleReplacementMode googleReplacementMode) {
        q.f(purchase, "<this>");
        q.f(productType, "productType");
        String strA = purchase.a();
        List<String> listC = purchase.c();
        q.e(listC, "this.products");
        long jE = purchase.e();
        String strF = purchase.f();
        q.e(strF, "this.purchaseToken");
        return new StoreTransaction(strA, listC, productType, jE, strF, PurchaseStateConversionsKt.toRevenueCatPurchaseState(purchase.d()), Boolean.valueOf(purchase.i()), purchase.g(), new JSONObject(purchase.b()), str, (String) null, PurchaseType.GOOGLE_PURCHASE, (String) null, str2, googleReplacementMode);
    }

    public static final StoreTransaction toStoreTransaction(Purchase purchase, PurchaseContext purchaseContext) {
        q.f(purchase, "<this>");
        q.f(purchaseContext, "purchaseContext");
        return toStoreTransaction(purchase, purchaseContext.getProductType(), purchaseContext.getPresentedOfferingId(), purchaseContext.getSelectedSubscriptionOptionId(), purchaseContext.getReplacementMode());
    }

    public static final StoreTransaction toStoreTransaction(PurchaseHistoryRecord purchaseHistoryRecord, ProductType type) {
        q.f(purchaseHistoryRecord, "<this>");
        q.f(type, "type");
        List<String> listB = purchaseHistoryRecord.b();
        q.e(listB, "this.products");
        long jC = purchaseHistoryRecord.c();
        String strD = purchaseHistoryRecord.d();
        q.e(strD, "this.purchaseToken");
        return new StoreTransaction((String) null, listB, type, jC, strD, PurchaseState.UNSPECIFIED_STATE, (Boolean) null, purchaseHistoryRecord.e(), new JSONObject(purchaseHistoryRecord.a()), (String) null, (String) null, PurchaseType.GOOGLE_RESTORED_PURCHASE, (String) null, (String) null, (ReplacementMode) null);
    }

    public static /* synthetic */ StoreTransaction toStoreTransaction$default(Purchase purchase, ProductType productType, String str, String str2, GoogleReplacementMode googleReplacementMode, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str = null;
        }
        if ((i8 & 4) != 0) {
            str2 = null;
        }
        if ((i8 & 8) != 0) {
            googleReplacementMode = null;
        }
        return toStoreTransaction(purchase, productType, str, str2, googleReplacementMode);
    }
}
