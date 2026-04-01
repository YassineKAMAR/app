package com.revenuecat.purchases.models;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.SubscriptionOption;
import f6.o;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
final class TestSubscriptionOption implements SubscriptionOption {
    private final String basePlanId;
    private final String presentedOfferingIdentifier;
    private final List<PricingPhase> pricingPhases;
    private final String productIdentifier;
    private final List<String> tags;

    public TestSubscriptionOption(String productIdentifier, List<PricingPhase> pricingPhases, String basePlanId, List<String> tags, String str) {
        q.f(productIdentifier, "productIdentifier");
        q.f(pricingPhases, "pricingPhases");
        q.f(basePlanId, "basePlanId");
        q.f(tags, "tags");
        this.productIdentifier = productIdentifier;
        this.pricingPhases = pricingPhases;
        this.basePlanId = basePlanId;
        this.tags = tags;
        this.presentedOfferingIdentifier = str;
    }

    public /* synthetic */ TestSubscriptionOption(String str, List list, String str2, List list2, String str3, int i8, j jVar) {
        this(str, list, (i8 & 4) != 0 ? "testBasePlanId" : str2, (i8 & 8) != 0 ? o.d() : list2, (i8 & 16) != 0 ? "offering" : str3);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public Period getBillingPeriod() {
        return SubscriptionOption.DefaultImpls.getBillingPeriod(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getFreePhase() {
        return SubscriptionOption.DefaultImpls.getFreePhase(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getFullPricePhase() {
        return SubscriptionOption.DefaultImpls.getFullPricePhase(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public String getId() {
        if (getPricingPhases().size() == 1) {
            return this.basePlanId;
        }
        return this.basePlanId + ":testOfferId";
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getIntroPhase() {
        return SubscriptionOption.DefaultImpls.getIntroPhase(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public String getPresentedOfferingIdentifier() {
        return this.presentedOfferingIdentifier;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PurchasingData getPurchasingData() {
        return new PurchasingData() { // from class: com.revenuecat.purchases.models.TestSubscriptionOption$purchasingData$1
            @Override // com.revenuecat.purchases.models.PurchasingData
            public String getProductId() {
                return this.this$0.getProductIdentifier();
            }

            @Override // com.revenuecat.purchases.models.PurchasingData
            public ProductType getProductType() {
                return ProductType.SUBS;
            }
        };
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<String> getTags() {
        return this.tags;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public boolean isBasePlan() {
        return SubscriptionOption.DefaultImpls.isBasePlan(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public boolean isPrepaid() {
        return SubscriptionOption.DefaultImpls.isPrepaid(this);
    }
}
