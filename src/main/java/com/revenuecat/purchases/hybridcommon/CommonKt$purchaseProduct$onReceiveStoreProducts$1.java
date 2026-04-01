package com.revenuecat.purchases.hybridcommon;

import android.app.Activity;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.GoogleProrationMode;
import com.revenuecat.purchases.models.StoreProduct;
import e6.i0;
import java.util.List;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
final class CommonKt$purchaseProduct$onReceiveStoreProducts$1 extends r implements l<List<? extends StoreProduct>, i0> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ String $googleBasePlanId;
    final /* synthetic */ Boolean $googleIsPersonalizedPrice;
    final /* synthetic */ String $googleOldProductId;
    final /* synthetic */ GoogleProrationMode $googleProrationMode;
    final /* synthetic */ OnResult $onResult;
    final /* synthetic */ String $presentedOfferingIdentifier;
    final /* synthetic */ String $productIdentifier;
    final /* synthetic */ ProductType $productType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonKt$purchaseProduct$onReceiveStoreProducts$1(String str, Activity activity, String str2, GoogleProrationMode googleProrationMode, Boolean bool, OnResult onResult, String str3, ProductType productType, String str4) {
        super(1);
        this.$presentedOfferingIdentifier = str;
        this.$activity = activity;
        this.$googleOldProductId = str2;
        this.$googleProrationMode = googleProrationMode;
        this.$googleIsPersonalizedPrice = bool;
        this.$onResult = onResult;
        this.$productIdentifier = str3;
        this.$productType = productType;
        this.$googleBasePlanId = str4;
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreProduct> list) {
        invoke2(list);
        return i0.f21430a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0064 A[EDGE_INSN: B:48:0x0064->B:29:0x0064 BREAK  A[LOOP:0: B:3:0x000f->B:51:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[LOOP:0: B:3:0x000f->B:51:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2(java.util.List<? extends com.revenuecat.purchases.models.StoreProduct> r11) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseProduct$onReceiveStoreProducts$1.invoke2(java.util.List):void");
    }
}
