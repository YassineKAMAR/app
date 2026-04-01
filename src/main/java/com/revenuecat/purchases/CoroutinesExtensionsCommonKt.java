package com.revenuecat.purchases;

import h6.i;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CoroutinesExtensionsCommonKt {
    public static final /* synthetic */ Object awaitGetProducts(Purchases purchases, List list, ProductType productType, h6.d dVar) throws Throwable {
        i iVar = new i(i6.c.c(dVar));
        ListenerConversionsCommonKt.getProductsWith(purchases, list, productType, new CoroutinesExtensionsCommonKt$awaitGetProducts$2$2(iVar), new CoroutinesExtensionsCommonKt$awaitGetProducts$2$1(iVar));
        Object objA = iVar.a();
        if (objA == i6.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objA;
    }

    public static /* synthetic */ Object awaitGetProducts$default(Purchases purchases, List list, ProductType productType, h6.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            productType = null;
        }
        return awaitGetProducts(purchases, list, productType, dVar);
    }

    public static final /* synthetic */ Object awaitOfferings(Purchases purchases, h6.d dVar) throws Throwable {
        i iVar = new i(i6.c.c(dVar));
        ListenerConversionsCommonKt.getOfferingsWith(purchases, new CoroutinesExtensionsCommonKt$awaitOfferings$2$2(iVar), new CoroutinesExtensionsCommonKt$awaitOfferings$2$1(iVar));
        Object objA = iVar.a();
        if (objA == i6.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitPurchase(Purchases purchases, PurchaseParams purchaseParams, h6.d dVar) throws Throwable {
        i iVar = new i(i6.c.c(dVar));
        purchases.purchase(purchaseParams, ListenerConversionsCommonKt.purchaseCompletedCallback(new CoroutinesExtensionsCommonKt$awaitPurchase$2$1(iVar), new CoroutinesExtensionsCommonKt$awaitPurchase$2$2(iVar)));
        Object objA = iVar.a();
        if (objA == i6.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitRestore(Purchases purchases, h6.d dVar) throws Throwable {
        i iVar = new i(i6.c.c(dVar));
        ListenerConversionsCommonKt.restorePurchasesWith(purchases, new CoroutinesExtensionsCommonKt$awaitRestore$2$1(iVar), new CoroutinesExtensionsCommonKt$awaitRestore$2$2(iVar));
        Object objA = iVar.a();
        if (objA == i6.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objA;
    }
}
