package com.revenuecat.purchases.models;

import com.android.billingclient.api.h;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import f6.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class GoogleStoreProduct implements StoreProduct {
    private final String basePlanId;
    private final SubscriptionOption defaultOption;
    private final String description;
    private final String name;
    private final Period period;
    private final String presentedOfferingIdentifier;
    private final Price price;
    private final h productDetails;
    private final String productId;
    private final SubscriptionOptions subscriptionOptions;
    private final String title;
    private final ProductType type;

    private GoogleStoreProduct(GoogleStoreProduct googleStoreProduct, SubscriptionOption subscriptionOption, SubscriptionOptions subscriptionOptions, String str) {
        this(googleStoreProduct.productId, googleStoreProduct.basePlanId, googleStoreProduct.getType(), googleStoreProduct.getPrice(), googleStoreProduct.getName(), googleStoreProduct.getTitle(), googleStoreProduct.getDescription(), googleStoreProduct.getPeriod(), subscriptionOptions, subscriptionOption, googleStoreProduct.productDetails, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleStoreProduct(String productId, String str, ProductType type, Price price, String title, String description, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, h productDetails, String str2) {
        this(productId, str, type, price, title, title, description, period, subscriptionOptions, subscriptionOption, productDetails, str2);
        q.f(productId, "productId");
        q.f(type, "type");
        q.f(price, "price");
        q.f(title, "title");
        q.f(description, "description");
        q.f(productDetails, "productDetails");
    }

    public /* synthetic */ GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, h hVar, String str5, int i8, j jVar) {
        this(str, str2, productType, price, str3, str4, period, subscriptionOptions, subscriptionOption, hVar, (i8 & 1024) != 0 ? null : str5);
    }

    public GoogleStoreProduct(String productId, String str, ProductType type, Price price, String name, String title, String description, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, h productDetails, String str2) {
        q.f(productId, "productId");
        q.f(type, "type");
        q.f(price, "price");
        q.f(name, "name");
        q.f(title, "title");
        q.f(description, "description");
        q.f(productDetails, "productDetails");
        this.productId = productId;
        this.basePlanId = str;
        this.type = type;
        this.price = price;
        this.name = name;
        this.title = title;
        this.description = description;
        this.period = period;
        this.subscriptionOptions = subscriptionOptions;
        this.defaultOption = subscriptionOption;
        this.productDetails = productDetails;
        this.presentedOfferingIdentifier = str2;
    }

    public /* synthetic */ GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, h hVar, String str6, int i8, j jVar) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, hVar, (i8 & 2048) != 0 ? null : str6);
    }

    public static /* synthetic */ void getSku$annotations() {
    }

    public final String component1() {
        return this.productId;
    }

    public final SubscriptionOption component10() {
        return getDefaultOption();
    }

    public final h component11() {
        return this.productDetails;
    }

    public final String component12() {
        return getPresentedOfferingIdentifier();
    }

    public final String component2() {
        return this.basePlanId;
    }

    public final ProductType component3() {
        return getType();
    }

    public final Price component4() {
        return getPrice();
    }

    public final String component5() {
        return getName();
    }

    public final String component6() {
        return getTitle();
    }

    public final String component7() {
        return getDescription();
    }

    public final Period component8() {
        return getPeriod();
    }

    public final SubscriptionOptions component9() {
        return getSubscriptionOptions();
    }

    public final GoogleStoreProduct copy(String productId, String str, ProductType type, Price price, String name, String title, String description, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, h productDetails, String str2) {
        q.f(productId, "productId");
        q.f(type, "type");
        q.f(price, "price");
        q.f(name, "name");
        q.f(title, "title");
        q.f(description, "description");
        q.f(productDetails, "productDetails");
        return new GoogleStoreProduct(productId, str, type, price, name, title, description, period, subscriptionOptions, subscriptionOption, productDetails, str2);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public StoreProduct copyWithOfferingId(String offeringId) {
        ArrayList arrayList;
        q.f(offeringId, "offeringId");
        SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions != null) {
            arrayList = new ArrayList();
            for (SubscriptionOption subscriptionOption : subscriptionOptions) {
                GoogleSubscriptionOption googleSubscriptionOption = subscriptionOption instanceof GoogleSubscriptionOption ? (GoogleSubscriptionOption) subscriptionOption : null;
                GoogleSubscriptionOption googleSubscriptionOption2 = googleSubscriptionOption != null ? new GoogleSubscriptionOption(googleSubscriptionOption, offeringId) : null;
                if (googleSubscriptionOption2 != null) {
                    arrayList.add(googleSubscriptionOption2);
                }
            }
        } else {
            arrayList = null;
        }
        SubscriptionOption defaultOption = getDefaultOption();
        GoogleSubscriptionOption googleSubscriptionOption3 = defaultOption instanceof GoogleSubscriptionOption ? (GoogleSubscriptionOption) defaultOption : null;
        return new GoogleStoreProduct(this, googleSubscriptionOption3 != null ? new GoogleSubscriptionOption(googleSubscriptionOption3, offeringId) : null, arrayList != null ? new SubscriptionOptions(arrayList) : null, offeringId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleStoreProduct)) {
            return false;
        }
        GoogleStoreProduct googleStoreProduct = (GoogleStoreProduct) obj;
        return q.b(this.productId, googleStoreProduct.productId) && q.b(this.basePlanId, googleStoreProduct.basePlanId) && getType() == googleStoreProduct.getType() && q.b(getPrice(), googleStoreProduct.getPrice()) && q.b(getName(), googleStoreProduct.getName()) && q.b(getTitle(), googleStoreProduct.getTitle()) && q.b(getDescription(), googleStoreProduct.getDescription()) && q.b(getPeriod(), googleStoreProduct.getPeriod()) && q.b(getSubscriptionOptions(), googleStoreProduct.getSubscriptionOptions()) && q.b(getDefaultOption(), googleStoreProduct.getDefaultOption()) && q.b(this.productDetails, googleStoreProduct.productDetails) && q.b(getPresentedOfferingIdentifier(), googleStoreProduct.getPresentedOfferingIdentifier());
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String formattedPricePerMonth(Locale locale) {
        SubscriptionOption basePlan;
        List<PricingPhase> pricingPhases;
        PricingPhase pricingPhase;
        q.f(locale, "locale");
        SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions == null || (basePlan = subscriptionOptions.getBasePlan()) == null || (pricingPhases = basePlan.getPricingPhases()) == null || (pricingPhase = (PricingPhase) w.H(pricingPhases)) == null) {
            return null;
        }
        return pricingPhase.formattedPriceInMonths(locale);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getDescription() {
        return this.description;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getId() {
        if (this.basePlanId != null) {
            String str = this.productId + ':' + this.basePlanId;
            if (str != null) {
                return str;
            }
        }
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getName() {
        return this.name;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Period getPeriod() {
        return this.period;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getPresentedOfferingIdentifier() {
        return this.presentedOfferingIdentifier;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price getPrice() {
        return this.price;
    }

    public final h getProductDetails() {
        return this.productDetails;
    }

    public final String getProductId() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public PurchasingData getPurchasingData() {
        return (getType() != ProductType.SUBS || getDefaultOption() == null) ? new GooglePurchasingData.InAppProduct(getId(), this.productDetails) : getDefaultOption().getPurchasingData();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getSku() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOptions getSubscriptionOptions() {
        return this.subscriptionOptions;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getTitle() {
        return this.title;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.productId.hashCode() * 31;
        String str = this.basePlanId;
        return ((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + getType().hashCode()) * 31) + getPrice().hashCode()) * 31) + getName().hashCode()) * 31) + getTitle().hashCode()) * 31) + getDescription().hashCode()) * 31) + (getPeriod() == null ? 0 : getPeriod().hashCode())) * 31) + (getSubscriptionOptions() == null ? 0 : getSubscriptionOptions().hashCode())) * 31) + (getDefaultOption() == null ? 0 : getDefaultOption().hashCode())) * 31) + this.productDetails.hashCode()) * 31) + (getPresentedOfferingIdentifier() != null ? getPresentedOfferingIdentifier().hashCode() : 0);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price pricePerMonth(Locale locale) {
        return StoreProduct.DefaultImpls.pricePerMonth(this, locale);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price pricePerWeek(Locale locale) {
        return StoreProduct.DefaultImpls.pricePerWeek(this, locale);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price pricePerYear(Locale locale) {
        return StoreProduct.DefaultImpls.pricePerYear(this, locale);
    }

    public String toString() {
        return "GoogleStoreProduct(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", type=" + getType() + ", price=" + getPrice() + ", name=" + getName() + ", title=" + getTitle() + ", description=" + getDescription() + ", period=" + getPeriod() + ", subscriptionOptions=" + getSubscriptionOptions() + ", defaultOption=" + getDefaultOption() + ", productDetails=" + this.productDetails + ", presentedOfferingIdentifier=" + getPresentedOfferingIdentifier() + ')';
    }
}
