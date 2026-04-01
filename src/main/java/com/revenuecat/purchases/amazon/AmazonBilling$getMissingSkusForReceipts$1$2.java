package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.Receipt;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import e6.i0;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.x;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
final class AmazonBilling$getMissingSkusForReceipts$1$2 extends r implements l<PurchasesError, i0> {
    final /* synthetic */ Map<String, PurchasesError> $errorMap;
    final /* synthetic */ p<Map<String, String>, Map<String, PurchasesError>, i0> $onCompletion;
    final /* synthetic */ Receipt $receipt;
    final /* synthetic */ x $receiptsLeft;
    final /* synthetic */ Map<String, String> $successMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AmazonBilling$getMissingSkusForReceipts$1$2(Map<String, PurchasesError> map, Receipt receipt, x xVar, p<? super Map<String, String>, ? super Map<String, PurchasesError>, i0> pVar, Map<String, String> map2) {
        super(1);
        this.$errorMap = map;
        this.$receipt = receipt;
        this.$receiptsLeft = xVar;
        this.$onCompletion = pVar;
        this.$successMap = map2;
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError error) {
        q.f(error, "error");
        LogIntent logIntent = LogIntent.AMAZON_ERROR;
        String str = String.format(AmazonStrings.ERROR_FETCHING_RECEIPT_INFO, Arrays.copyOf(new Object[]{error}, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        Map<String, PurchasesError> map = this.$errorMap;
        String receiptId = this.$receipt.getReceiptId();
        q.e(receiptId, "receipt.receiptId");
        map.put(receiptId, error);
        x xVar = this.$receiptsLeft;
        int i8 = xVar.f24324a - 1;
        xVar.f24324a = i8;
        if (i8 == 0) {
            this.$onCompletion.invoke(this.$successMap, this.$errorMap);
        }
    }
}
