package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.models.StoreProduct;
import e6.i0;
import e6.x;
import f6.k0;
import f6.n;
import f6.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
final class OfferingsFactory$getStoreProductsById$1$1$1 extends r implements l<List<? extends StoreProduct>, i0> {
    final /* synthetic */ l<Map<String, ? extends List<? extends StoreProduct>>, i0> $onCompleted;
    final /* synthetic */ Map<String, List<StoreProduct>> $productsById;
    final /* synthetic */ OfferingsFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OfferingsFactory$getStoreProductsById$1$1$1(OfferingsFactory offeringsFactory, Map<String, List<StoreProduct>> map, l<? super Map<String, ? extends List<? extends StoreProduct>>, i0> lVar) {
        super(1);
        this.this$0 = offeringsFactory;
        this.$productsById = map;
        this.$onCompleted = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(Map productsById, List inAppProducts, l onCompleted) {
        q.f(productsById, "$productsById");
        q.f(inAppProducts, "$inAppProducts");
        q.f(onCompleted, "$onCompleted");
        ArrayList arrayList = new ArrayList(p.m(inAppProducts, 10));
        Iterator it = inAppProducts.iterator();
        while (it.hasNext()) {
            StoreProduct storeProduct = (StoreProduct) it.next();
            arrayList.add(x.a(storeProduct.getPurchasingData().getProductId(), n.b(storeProduct)));
        }
        k0.k(productsById, arrayList);
        onCompleted.invoke(productsById);
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreProduct> list) {
        invoke2(list);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final List<? extends StoreProduct> inAppProducts) {
        q.f(inAppProducts, "inAppProducts");
        Dispatcher dispatcher = this.this$0.dispatcher;
        final Map<String, List<StoreProduct>> map = this.$productsById;
        final l<Map<String, ? extends List<? extends StoreProduct>>, i0> lVar = this.$onCompleted;
        Dispatcher.enqueue$default(dispatcher, new Runnable() { // from class: com.revenuecat.purchases.common.offerings.b
            @Override // java.lang.Runnable
            public final void run() {
                OfferingsFactory$getStoreProductsById$1$1$1.invoke$lambda$1(map, inAppProducts, lVar);
            }
        }, null, 2, null);
    }
}
