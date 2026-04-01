package com.revenuecat.purchases.google;

import com.android.billingclient.api.i;
import f6.p;
import j1.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class BillingClientParamBuildersKt {
    public static final i buildQueryProductDetailsParams(String str, Set<String> productIds) {
        q.f(str, "<this>");
        q.f(productIds, "productIds");
        ArrayList arrayList = new ArrayList(p.m(productIds, 10));
        Iterator<T> it = productIds.iterator();
        while (it.hasNext()) {
            arrayList.add(i.b.a().b((String) it.next()).c(str).a());
        }
        i iVarA = i.a().b(arrayList).a();
        q.e(iVarA, "newBuilder()\n        .se…List(productList).build()");
        return iVarA;
    }

    public static final o buildQueryPurchaseHistoryParams(String str) {
        q.f(str, "<this>");
        if (q.b(str, "inapp") ? true : q.b(str, "subs")) {
            return o.a().b(str).a();
        }
        return null;
    }

    public static final j1.p buildQueryPurchasesParams(String str) {
        q.f(str, "<this>");
        if (q.b(str, "inapp") ? true : q.b(str, "subs")) {
            return j1.p.a().b(str).a();
        }
        return null;
    }
}
