package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreTransaction;
import e6.i0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
final class PostTransactionWithProductDetailsHelper$postTransactions$1$2 extends r implements l<PurchasesError, i0> {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ PostReceiptInitiationSource $initiationSource;
    final /* synthetic */ StoreTransaction $transaction;
    final /* synthetic */ p<StoreTransaction, PurchasesError, i0> $transactionPostError;
    final /* synthetic */ p<StoreTransaction, CustomerInfo, i0> $transactionPostSuccess;
    final /* synthetic */ PostTransactionWithProductDetailsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PostTransactionWithProductDetailsHelper$postTransactions$1$2(PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, StoreTransaction storeTransaction, boolean z7, String str, PostReceiptInitiationSource postReceiptInitiationSource, p<? super StoreTransaction, ? super CustomerInfo, i0> pVar, p<? super StoreTransaction, ? super PurchasesError, i0> pVar2) {
        super(1);
        this.this$0 = postTransactionWithProductDetailsHelper;
        this.$transaction = storeTransaction;
        this.$allowSharingPlayStoreAccount = z7;
        this.$appUserID = str;
        this.$initiationSource = postReceiptInitiationSource;
        this.$transactionPostSuccess = pVar;
        this.$transactionPostError = pVar2;
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError it) {
        q.f(it, "it");
        this.this$0.postReceiptHelper.postTransactionAndConsumeIfNeeded(this.$transaction, null, this.$allowSharingPlayStoreAccount, this.$appUserID, this.$initiationSource, this.$transactionPostSuccess, this.$transactionPostError);
    }
}
