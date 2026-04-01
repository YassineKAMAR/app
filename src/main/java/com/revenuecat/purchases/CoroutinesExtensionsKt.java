package com.revenuecat.purchases;

import h6.i;

/* JADX INFO: loaded from: classes.dex */
public final class CoroutinesExtensionsKt {
    public static final /* synthetic */ Object awaitCustomerInfo(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, h6.d dVar) throws Throwable {
        i iVar = new i(i6.c.c(dVar));
        ListenerConversionsKt.getCustomerInfoWith(purchases, cacheFetchPolicy, new CoroutinesExtensionsKt$awaitCustomerInfo$2$2(iVar), new CoroutinesExtensionsKt$awaitCustomerInfo$2$1(iVar));
        Object objA = iVar.a();
        if (objA == i6.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objA;
    }

    public static /* synthetic */ Object awaitCustomerInfo$default(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, h6.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cacheFetchPolicy = CacheFetchPolicy.Companion.m8default();
        }
        return awaitCustomerInfo(purchases, cacheFetchPolicy, dVar);
    }

    public static final /* synthetic */ Object awaitLogIn(Purchases purchases, String str, h6.d dVar) throws Throwable {
        i iVar = new i(i6.c.c(dVar));
        ListenerConversionsKt.logInWith(purchases, str, new CoroutinesExtensionsKt$awaitLogIn$2$1(iVar), new CoroutinesExtensionsKt$awaitLogIn$2$2(iVar));
        Object objA = iVar.a();
        if (objA == i6.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitLogOut(Purchases purchases, h6.d dVar) throws Throwable {
        i iVar = new i(i6.c.c(dVar));
        ListenerConversionsKt.logOutWith(purchases, new CoroutinesExtensionsKt$awaitLogOut$2$1(iVar), new CoroutinesExtensionsKt$awaitLogOut$2$2(iVar));
        Object objA = iVar.a();
        if (objA == i6.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitSyncPurchases(Purchases purchases, h6.d dVar) throws Throwable {
        i iVar = new i(i6.c.c(dVar));
        ListenerConversionsKt.syncPurchasesWith(purchases, new CoroutinesExtensionsKt$awaitSyncPurchases$2$2(iVar), new CoroutinesExtensionsKt$awaitSyncPurchases$2$1(iVar));
        Object objA = iVar.a();
        if (objA == i6.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objA;
    }
}
