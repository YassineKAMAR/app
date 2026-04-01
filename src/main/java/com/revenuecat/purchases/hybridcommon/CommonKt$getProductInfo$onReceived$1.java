package com.revenuecat.purchases.hybridcommon;

import com.revenuecat.purchases.hybridcommon.mappers.StoreProductMapperKt;
import com.revenuecat.purchases.models.StoreProduct;
import e6.i0;
import java.util.List;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
final class CommonKt$getProductInfo$onReceived$1 extends r implements l<List<? extends StoreProduct>, i0> {
    final /* synthetic */ OnResultList $onResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonKt$getProductInfo$onReceived$1(OnResultList onResultList) {
        super(1);
        this.$onResult = onResultList;
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreProduct> list) {
        invoke2(list);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends StoreProduct> it) {
        q.f(it, "it");
        this.$onResult.onReceived(StoreProductMapperKt.map(it));
    }
}
