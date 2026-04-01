package com.revenuecat.purchases;

import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.StoreTransaction;
import e6.i0;
import f6.w;
import java.util.List;
import kotlin.jvm.internal.q;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class PostTransactionWithProductDetailsHelper {
    private final BillingAbstract billing;
    private final PostReceiptHelper postReceiptHelper;

    public PostTransactionWithProductDetailsHelper(BillingAbstract billing, PostReceiptHelper postReceiptHelper) {
        q.f(billing, "billing");
        q.f(postReceiptHelper, "postReceiptHelper");
        this.billing = billing;
        this.postReceiptHelper = postReceiptHelper;
    }

    public final void postTransactions(List<StoreTransaction> transactions, boolean z7, String appUserID, PostReceiptInitiationSource initiationSource, p<? super StoreTransaction, ? super CustomerInfo, i0> pVar, p<? super StoreTransaction, ? super PurchasesError, i0> pVar2) {
        q.f(transactions, "transactions");
        q.f(appUserID, "appUserID");
        q.f(initiationSource, "initiationSource");
        for (StoreTransaction storeTransaction : transactions) {
            if (storeTransaction.getPurchaseState() != PurchaseState.PENDING) {
                this.billing.queryProductDetailsAsync(storeTransaction.getType(), w.Y(storeTransaction.getProductIds()), new PostTransactionWithProductDetailsHelper$postTransactions$1$1(storeTransaction, this, z7, appUserID, initiationSource, pVar, pVar2), new PostTransactionWithProductDetailsHelper$postTransactions$1$2(this, storeTransaction, z7, appUserID, initiationSource, pVar, pVar2));
            } else if (pVar2 != null) {
                PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PaymentPendingError, null, 2, null);
                LogUtilsKt.errorLog(purchasesError);
                i0 i0Var = i0.f21430a;
                pVar2.invoke(storeTransaction, purchasesError);
            }
        }
    }
}
