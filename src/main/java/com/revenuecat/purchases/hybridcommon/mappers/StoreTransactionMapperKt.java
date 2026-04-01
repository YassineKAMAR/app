package com.revenuecat.purchases.hybridcommon.mappers;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.models.StoreTransaction;
import e6.x;
import f6.k0;
import f6.w;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class StoreTransactionMapperKt {
    public static final Map<String, Object> map(StoreTransaction storeTransaction) {
        q.f(storeTransaction, "<this>");
        return k0.g(x.a("transactionIdentifier", storeTransaction.getOrderId()), x.a("productIdentifier", w.z(storeTransaction.getProductIds())), x.a("purchaseDateMillis", Long.valueOf(storeTransaction.getPurchaseTime())), x.a(b.Q, MappersHelpersKt.toIso8601(new Date(storeTransaction.getPurchaseTime()))));
    }
}
