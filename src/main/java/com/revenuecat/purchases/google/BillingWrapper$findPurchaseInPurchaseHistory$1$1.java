package com.revenuecat.purchases.google;

import com.android.billingclient.api.PurchaseHistoryRecord;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import e6.i0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
final class BillingWrapper$findPurchaseInPurchaseHistory$1$1 extends r implements l<List<? extends PurchaseHistoryRecord>, i0> {
    final /* synthetic */ l<StoreTransaction, i0> $onCompletion;
    final /* synthetic */ l<PurchasesError, i0> $onError;
    final /* synthetic */ String $productId;
    final /* synthetic */ ProductType $productType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BillingWrapper$findPurchaseInPurchaseHistory$1$1(ProductType productType, l<? super StoreTransaction, i0> lVar, String str, l<? super PurchasesError, i0> lVar2) {
        super(1);
        this.$productType = productType;
        this.$onCompletion = lVar;
        this.$productId = str;
        this.$onError = lVar2;
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(List<? extends PurchaseHistoryRecord> list) {
        invoke2(list);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends PurchaseHistoryRecord> purchasesList) {
        Object next;
        q.f(purchasesList, "purchasesList");
        String str = this.$productId;
        Iterator<T> it = purchasesList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((PurchaseHistoryRecord) next).b().contains(str)) {
                    break;
                }
            }
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) next;
        StoreTransaction storeTransaction = purchaseHistoryRecord != null ? StoreTransactionConversionsKt.toStoreTransaction(purchaseHistoryRecord, this.$productType) : null;
        if (storeTransaction != null) {
            this.$onCompletion.invoke(storeTransaction);
            return;
        }
        String str2 = String.format(PurchaseStrings.NO_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{this.$productId}, 1));
        q.e(str2, "format(this, *args)");
        this.$onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, str2));
    }
}
