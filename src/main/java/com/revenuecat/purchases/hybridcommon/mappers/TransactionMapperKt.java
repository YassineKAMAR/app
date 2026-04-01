package com.revenuecat.purchases.hybridcommon.mappers;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.models.Transaction;
import e6.x;
import f6.k0;
import java.util.Map;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class TransactionMapperKt {
    public static final Map<String, Object> map(Transaction transaction) {
        q.f(transaction, "<this>");
        return k0.g(x.a("transactionIdentifier", transaction.getTransactionIdentifier()), x.a("revenueCatId", transaction.getTransactionIdentifier()), x.a("productIdentifier", transaction.getProductIdentifier()), x.a("productId", transaction.getProductIdentifier()), x.a("purchaseDateMillis", Long.valueOf(MappersHelpersKt.toMillis(transaction.getPurchaseDate()))), x.a(b.Q, MappersHelpersKt.toIso8601(transaction.getPurchaseDate())));
    }
}
