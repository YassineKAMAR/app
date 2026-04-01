package com.revenuecat.purchases;

import com.revenuecat.purchases.models.Transaction;
import f6.p;
import f6.q0;
import f6.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.r;

/* JADX INFO: loaded from: classes.dex */
final class CustomerInfo$allPurchasedProductIds$2 extends r implements p6.a<Set<? extends String>> {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerInfo$allPurchasedProductIds$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // p6.a
    public final Set<? extends String> invoke() {
        List<Transaction> nonSubscriptionTransactions = this.this$0.getNonSubscriptionTransactions();
        ArrayList arrayList = new ArrayList(p.m(nonSubscriptionTransactions, 10));
        Iterator<T> it = nonSubscriptionTransactions.iterator();
        while (it.hasNext()) {
            arrayList.add(((Transaction) it.next()).getProductIdentifier());
        }
        return q0.f(w.Y(arrayList), this.this$0.getAllExpirationDatesByProduct().keySet());
    }
}
