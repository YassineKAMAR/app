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
import org.json.JSONException;
import org.json.JSONObject;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
final class AmazonBilling$getMissingSkusForReceipts$1$1 extends r implements l<JSONObject, i0> {
    final /* synthetic */ Map<String, PurchasesError> $errorMap;
    final /* synthetic */ p<Map<String, String>, Map<String, PurchasesError>, i0> $onCompletion;
    final /* synthetic */ Receipt $receipt;
    final /* synthetic */ x $receiptsLeft;
    final /* synthetic */ Map<String, String> $successMap;
    final /* synthetic */ AmazonBilling this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AmazonBilling$getMissingSkusForReceipts$1$1(Map<String, String> map, Receipt receipt, x xVar, AmazonBilling amazonBilling, p<? super Map<String, String>, ? super Map<String, PurchasesError>, i0> pVar, Map<String, PurchasesError> map2) {
        super(1);
        this.$successMap = map;
        this.$receipt = receipt;
        this.$receiptsLeft = xVar;
        this.this$0 = amazonBilling;
        this.$onCompletion = pVar;
        this.$errorMap = map2;
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(JSONObject jSONObject) throws JSONException {
        invoke2(jSONObject);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject response) throws JSONException {
        q.f(response, "response");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AmazonStrings.RECEIPT_DATA_RECEIVED, Arrays.copyOf(new Object[]{response.toString()}, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        Map<String, String> map = this.$successMap;
        String receiptId = this.$receipt.getReceiptId();
        q.e(receiptId, "receipt.receiptId");
        Object obj = response.get(com.amazon.a.a.o.b.L);
        q.d(obj, "null cannot be cast to non-null type kotlin.String");
        map.put(receiptId, (String) obj);
        x xVar = this.$receiptsLeft;
        int i8 = xVar.f24324a - 1;
        xVar.f24324a = i8;
        if (i8 == 0) {
            this.this$0.cache.cacheSkusByToken(this.$successMap);
            this.$onCompletion.invoke(this.$successMap, this.$errorMap);
        }
    }
}
