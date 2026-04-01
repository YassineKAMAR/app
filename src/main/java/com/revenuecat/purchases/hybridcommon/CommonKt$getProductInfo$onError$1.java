package com.revenuecat.purchases.hybridcommon;

import com.revenuecat.purchases.PurchasesError;
import e6.i0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
final class CommonKt$getProductInfo$onError$1 extends r implements l<PurchasesError, i0> {
    final /* synthetic */ OnResultList $onResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonKt$getProductInfo$onError$1(OnResultList onResultList) {
        super(1);
        this.$onResult = onResultList;
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
        invoke2(purchasesError);
        return i0.f21430a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchasesError it) {
        q.f(it, "it");
        this.$onResult.onError(CommonKt.map$default(it, null, 1, null));
    }
}
