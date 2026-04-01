package com.revenuecat.purchases;

import com.revenuecat.purchases.SyncPurchasesHelper;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import e6.i0;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
final class SyncPurchasesHelper$syncPurchases$1$1$2 extends r implements l<PurchasesError, i0> {
    final /* synthetic */ boolean $appInBackground;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ List<PurchasesError> $errors;
    final /* synthetic */ boolean $isRestore;
    final /* synthetic */ StoreTransaction $lastPurchase;
    final /* synthetic */ l<PurchasesError, i0> $onError;
    final /* synthetic */ l<CustomerInfo, i0> $onSuccess;
    final /* synthetic */ StoreTransaction $purchase;
    final /* synthetic */ SyncPurchasesHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SyncPurchasesHelper$syncPurchases$1$1$2(StoreTransaction storeTransaction, List<PurchasesError> list, StoreTransaction storeTransaction2, SyncPurchasesHelper syncPurchasesHelper, String str, boolean z7, boolean z8, l<? super CustomerInfo, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        super(1);
        this.$purchase = storeTransaction;
        this.$errors = list;
        this.$lastPurchase = storeTransaction2;
        this.this$0 = syncPurchasesHelper;
        this.$appUserID = str;
        this.$appInBackground = z7;
        this.$isRestore = z8;
        this.$onSuccess = lVar;
        this.$onError = lVar2;
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError error) {
        q.f(error, "error");
        LogIntent logIntent = LogIntent.RC_ERROR;
        String str = String.format(PurchaseStrings.SYNCING_PURCHASES_ERROR_DETAILS, Arrays.copyOf(new Object[]{this.$purchase, error}, 2));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.$errors.add(error);
        SyncPurchasesHelper.C02341.invoke$handleLastPurchase(this.$errors, this.this$0, this.$appUserID, this.$appInBackground, this.$isRestore, this.$onSuccess, this.$onError, this.$purchase, this.$lastPurchase);
    }
}
