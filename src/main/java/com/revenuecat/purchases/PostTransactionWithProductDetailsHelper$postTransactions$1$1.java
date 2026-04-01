package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import e6.i0;
import f6.w;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
final class PostTransactionWithProductDetailsHelper$postTransactions$1$1 extends r implements l<List<? extends StoreProduct>, i0> {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ PostReceiptInitiationSource $initiationSource;
    final /* synthetic */ StoreTransaction $transaction;
    final /* synthetic */ p<StoreTransaction, PurchasesError, i0> $transactionPostError;
    final /* synthetic */ p<StoreTransaction, CustomerInfo, i0> $transactionPostSuccess;
    final /* synthetic */ PostTransactionWithProductDetailsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PostTransactionWithProductDetailsHelper$postTransactions$1$1(StoreTransaction storeTransaction, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, boolean z7, String str, PostReceiptInitiationSource postReceiptInitiationSource, p<? super StoreTransaction, ? super CustomerInfo, i0> pVar, p<? super StoreTransaction, ? super PurchasesError, i0> pVar2) {
        super(1);
        this.$transaction = storeTransaction;
        this.this$0 = postTransactionWithProductDetailsHelper;
        this.$allowSharingPlayStoreAccount = z7;
        this.$appUserID = str;
        this.$initiationSource = postReceiptInitiationSource;
        this.$transactionPostSuccess = pVar;
        this.$transactionPostError = pVar2;
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreProduct> list) {
        invoke2(list);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends StoreProduct> storeProducts) {
        q.f(storeProducts, "storeProducts");
        Object obj = null;
        if (this.$transaction.getType() != ProductType.SUBS) {
            StoreTransaction storeTransaction = this.$transaction;
            for (Object obj2 : storeProducts) {
                if (q.b(((StoreProduct) obj2).getId(), w.B(storeTransaction.getProductIds()))) {
                    obj = obj2;
                    break;
                }
            }
        } else {
            StoreTransaction storeTransaction2 = this.$transaction;
            for (Object obj22 : storeProducts) {
                SubscriptionOptions subscriptionOptions = ((StoreProduct) obj22).getSubscriptionOptions();
                boolean z7 = false;
                if (subscriptionOptions != null && !subscriptionOptions.isEmpty()) {
                    Iterator<SubscriptionOption> it = subscriptionOptions.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (q.b(it.next().getId(), storeTransaction2.getSubscriptionOptionId())) {
                                z7 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z7) {
                    obj = obj22;
                    break;
                }
            }
        }
        this.this$0.postReceiptHelper.postTransactionAndConsumeIfNeeded(this.$transaction, (StoreProduct) obj, this.$allowSharingPlayStoreAccount, this.$appUserID, this.$initiationSource, this.$transactionPostSuccess, this.$transactionPostError);
    }
}
