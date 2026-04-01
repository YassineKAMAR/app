package com.revenuecat.purchases.common;

import e6.x;
import f6.k0;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class GooglePlatformProductId extends PlatformProductId {
    private final String basePlanId;
    private final String offerId;
    private final String productId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePlatformProductId(String productId, String str, String str2) {
        super(productId);
        q.f(productId, "productId");
        this.productId = productId;
        this.basePlanId = str;
        this.offerId = str2;
    }

    public /* synthetic */ GooglePlatformProductId(String str, String str2, String str3, int i8, j jVar) {
        this(str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3);
    }

    @Override // com.revenuecat.purchases.common.PlatformProductId
    public Map<String, String> getAsMap() {
        return k0.g(x.a("product_id", getProductId()), x.a("base_plan_id", this.basePlanId), x.a("offer_id", this.offerId));
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    @Override // com.revenuecat.purchases.common.PlatformProductId
    public String getProductId() {
        return this.productId;
    }
}
