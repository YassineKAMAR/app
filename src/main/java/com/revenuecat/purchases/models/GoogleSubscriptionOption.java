package com.revenuecat.purchases.models;

import com.android.billingclient.api.h;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.SubscriptionOption;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import w6.v;

/* JADX INFO: loaded from: classes.dex */
public final class GoogleSubscriptionOption implements SubscriptionOption {
    private final String basePlanId;
    private final String offerId;
    private final String offerToken;
    private final String presentedOfferingIdentifier;
    private final List<PricingPhase> pricingPhases;
    private final h productDetails;
    private final String productId;
    private final List<String> tags;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(GoogleSubscriptionOption subscriptionOption, String str) {
        this(subscriptionOption.productId, subscriptionOption.basePlanId, subscriptionOption.offerId, subscriptionOption.getPricingPhases(), subscriptionOption.getTags(), subscriptionOption.productDetails, subscriptionOption.offerToken, str);
        q.f(subscriptionOption, "subscriptionOption");
    }

    public GoogleSubscriptionOption(String productId, String basePlanId, String str, List<PricingPhase> pricingPhases, List<String> tags, h productDetails, String offerToken, String str2) {
        q.f(productId, "productId");
        q.f(basePlanId, "basePlanId");
        q.f(pricingPhases, "pricingPhases");
        q.f(tags, "tags");
        q.f(productDetails, "productDetails");
        q.f(offerToken, "offerToken");
        this.productId = productId;
        this.basePlanId = basePlanId;
        this.offerId = str;
        this.pricingPhases = pricingPhases;
        this.tags = tags;
        this.productDetails = productDetails;
        this.offerToken = offerToken;
        this.presentedOfferingIdentifier = str2;
    }

    public /* synthetic */ GoogleSubscriptionOption(String str, String str2, String str3, List list, List list2, h hVar, String str4, String str5, int i8, j jVar) {
        this(str, str2, str3, list, list2, hVar, str4, (i8 & 128) != 0 ? null : str5);
    }

    public final String component1() {
        return this.productId;
    }

    public final String component2() {
        return this.basePlanId;
    }

    public final String component3() {
        return this.offerId;
    }

    public final List<PricingPhase> component4() {
        return getPricingPhases();
    }

    public final List<String> component5() {
        return getTags();
    }

    public final h component6() {
        return this.productDetails;
    }

    public final String component7() {
        return this.offerToken;
    }

    public final String component8() {
        return getPresentedOfferingIdentifier();
    }

    public final GoogleSubscriptionOption copy(String productId, String basePlanId, String str, List<PricingPhase> pricingPhases, List<String> tags, h productDetails, String offerToken, String str2) {
        q.f(productId, "productId");
        q.f(basePlanId, "basePlanId");
        q.f(pricingPhases, "pricingPhases");
        q.f(tags, "tags");
        q.f(productDetails, "productDetails");
        q.f(offerToken, "offerToken");
        return new GoogleSubscriptionOption(productId, basePlanId, str, pricingPhases, tags, productDetails, offerToken, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleSubscriptionOption)) {
            return false;
        }
        GoogleSubscriptionOption googleSubscriptionOption = (GoogleSubscriptionOption) obj;
        return q.b(this.productId, googleSubscriptionOption.productId) && q.b(this.basePlanId, googleSubscriptionOption.basePlanId) && q.b(this.offerId, googleSubscriptionOption.offerId) && q.b(getPricingPhases(), googleSubscriptionOption.getPricingPhases()) && q.b(getTags(), googleSubscriptionOption.getTags()) && q.b(this.productDetails, googleSubscriptionOption.productDetails) && q.b(this.offerToken, googleSubscriptionOption.offerToken) && q.b(getPresentedOfferingIdentifier(), googleSubscriptionOption.getPresentedOfferingIdentifier());
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
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.basePlanId);
        String str2 = this.offerId;
        if (str2 == null || v.p(str2)) {
            str = "";
        } else {
            str = ':' + this.offerId;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getIntroPhase() {
        return SubscriptionOption.DefaultImpls.getIntroPhase(this);
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public String getPresentedOfferingIdentifier() {
        return this.presentedOfferingIdentifier;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final h getProductDetails() {
        return this.productDetails;
    }

    public final String getProductId() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PurchasingData getPurchasingData() {
        return new GooglePurchasingData.Subscription(this.productId, getId(), this.productDetails, this.offerToken);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int iHashCode = ((this.productId.hashCode() * 31) + this.basePlanId.hashCode()) * 31;
        String str = this.offerId;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + getPricingPhases().hashCode()) * 31) + getTags().hashCode()) * 31) + this.productDetails.hashCode()) * 31) + this.offerToken.hashCode()) * 31) + (getPresentedOfferingIdentifier() != null ? getPresentedOfferingIdentifier().hashCode() : 0);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public boolean isBasePlan() {
        return SubscriptionOption.DefaultImpls.isBasePlan(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public boolean isPrepaid() {
        return SubscriptionOption.DefaultImpls.isPrepaid(this);
    }

    public String toString() {
        return "GoogleSubscriptionOption(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ", pricingPhases=" + getPricingPhases() + ", tags=" + getTags() + ", productDetails=" + this.productDetails + ", offerToken=" + this.offerToken + ", presentedOfferingIdentifier=" + getPresentedOfferingIdentifier() + ')';
    }
}
