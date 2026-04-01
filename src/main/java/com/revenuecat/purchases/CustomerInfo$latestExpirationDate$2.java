package com.revenuecat.purchases;

import f6.w;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.r;

/* JADX INFO: loaded from: classes.dex */
final class CustomerInfo$latestExpirationDate$2 extends r implements p6.a<Date> {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerInfo$latestExpirationDate$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // p6.a
    public final Date invoke() {
        List listP = w.P(this.this$0.getAllExpirationDatesByProduct().values(), new Comparator() { // from class: com.revenuecat.purchases.CustomerInfo$latestExpirationDate$2$invoke$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t8) {
                return g6.b.a((Date) t7, (Date) t8);
            }
        });
        if (listP.isEmpty()) {
            listP = null;
        }
        if (listP != null) {
            return (Date) w.H(listP);
        }
        return null;
    }
}
