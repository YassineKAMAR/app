package com.revenuecat.purchases.models;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.StoreProduct;
import f6.n;
import f6.o;
import java.util.Locale;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class TestStoreProduct implements StoreProduct {
    private final String description;
    private final Period freeTrialPeriod;
    private final String id;
    private final Price introPrice;
    private final String name;
    private final Period period;
    private final Price price;
    private final String title;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TestStoreProduct(String id, String title, String description, Price price, Period period, Period period2, Price price2) {
        this(id, title, title, description, price, period, period2, price2);
        q.f(id, "id");
        q.f(title, "title");
        q.f(description, "description");
        q.f(price, "price");
    }

    public /* synthetic */ TestStoreProduct(String str, String str2, String str3, Price price, Period period, Period period2, Price price2, int i8, j jVar) {
        this(str, str2, str3, price, period, (i8 & 32) != 0 ? null : period2, (i8 & 64) != 0 ? null : price2);
    }

    public TestStoreProduct(String id, String name, String title, String description, Price price, Period period, Period period2, Price price2) {
        q.f(id, "id");
        q.f(name, "name");
        q.f(title, "title");
        q.f(description, "description");
        q.f(price, "price");
        this.id = id;
        this.name = name;
        this.title = title;
        this.description = description;
        this.price = price;
        this.period = period;
        this.freeTrialPeriod = period2;
        this.introPrice = price2;
    }

    public /* synthetic */ TestStoreProduct(String str, String str2, String str3, String str4, Price price, Period period, Period period2, Price price2, int i8, j jVar) {
        this(str, str2, str3, str4, price, period, (i8 & 64) != 0 ? null : period2, (i8 & 128) != 0 ? null : price2);
    }

    private final SubscriptionOptions buildSubscriptionOptions() {
        if (getPeriod() == null) {
            return null;
        }
        Period period = this.freeTrialPeriod;
        PricingPhase pricingPhase = period != null ? new PricingPhase(period, RecurrenceMode.FINITE_RECURRING, 1, new Price("Free", 0L, getPrice().getCurrencyCode())) : null;
        Price price = this.introPrice;
        PricingPhase pricingPhase2 = price != null ? new PricingPhase(new Period(1, Period.Unit.MONTH, "P1M"), RecurrenceMode.FINITE_RECURRING, 1, price) : null;
        PricingPhase pricingPhase3 = new PricingPhase(getPeriod(), RecurrenceMode.INFINITE_RECURRING, null, getPrice());
        TestSubscriptionOption[] testSubscriptionOptionArr = new TestSubscriptionOption[2];
        testSubscriptionOptionArr[0] = this.freeTrialPeriod != null || pricingPhase2 != null ? new TestSubscriptionOption(getId(), o.i(pricingPhase, pricingPhase2, pricingPhase3), null, null, null, 28, null) : null;
        testSubscriptionOptionArr[1] = new TestSubscriptionOption(getId(), n.b(pricingPhase3), null, null, null, 28, null);
        return new SubscriptionOptions(o.i(testSubscriptionOptionArr));
    }

    private final Period component7() {
        return this.freeTrialPeriod;
    }

    private final Price component8() {
        return this.introPrice;
    }

    public final String component1() {
        return getId();
    }

    public final String component2() {
        return getName();
    }

    public final String component3() {
        return getTitle();
    }

    public final String component4() {
        return getDescription();
    }

    public final Price component5() {
        return getPrice();
    }

    public final Period component6() {
        return getPeriod();
    }

    public final TestStoreProduct copy(String id, String name, String title, String description, Price price, Period period, Period period2, Price price2) {
        q.f(id, "id");
        q.f(name, "name");
        q.f(title, "title");
        q.f(description, "description");
        q.f(price, "price");
        return new TestStoreProduct(id, name, title, description, price, period, period2, price2);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public StoreProduct copyWithOfferingId(String offeringId) {
        q.f(offeringId, "offeringId");
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestStoreProduct)) {
            return false;
        }
        TestStoreProduct testStoreProduct = (TestStoreProduct) obj;
        return q.b(getId(), testStoreProduct.getId()) && q.b(getName(), testStoreProduct.getName()) && q.b(getTitle(), testStoreProduct.getTitle()) && q.b(getDescription(), testStoreProduct.getDescription()) && q.b(getPrice(), testStoreProduct.getPrice()) && q.b(getPeriod(), testStoreProduct.getPeriod()) && q.b(this.freeTrialPeriod, testStoreProduct.freeTrialPeriod) && q.b(this.introPrice, testStoreProduct.introPrice);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String formattedPricePerMonth(Locale locale) {
        return StoreProduct.DefaultImpls.formattedPricePerMonth(this, locale);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOption getDefaultOption() {
        SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions != null) {
            return subscriptionOptions.getDefaultOffer();
        }
        return null;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getDescription() {
        return this.description;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getId() {
        return this.id;
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
        return null;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price getPrice() {
        return this.price;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public PurchasingData getPurchasingData() {
        return new PurchasingData() { // from class: com.revenuecat.purchases.models.TestStoreProduct$purchasingData$1
            @Override // com.revenuecat.purchases.models.PurchasingData
            public String getProductId() {
                return this.this$0.getId();
            }

            @Override // com.revenuecat.purchases.models.PurchasingData
            public ProductType getProductType() {
                return this.this$0.getType();
            }
        };
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getSku() {
        return getId();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOptions getSubscriptionOptions() {
        return buildSubscriptionOptions();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getTitle() {
        return this.title;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public ProductType getType() {
        return getPeriod() == null ? ProductType.INAPP : ProductType.SUBS;
    }

    public int hashCode() {
        int iHashCode = ((((((((((getId().hashCode() * 31) + getName().hashCode()) * 31) + getTitle().hashCode()) * 31) + getDescription().hashCode()) * 31) + getPrice().hashCode()) * 31) + (getPeriod() == null ? 0 : getPeriod().hashCode())) * 31;
        Period period = this.freeTrialPeriod;
        int iHashCode2 = (iHashCode + (period == null ? 0 : period.hashCode())) * 31;
        Price price = this.introPrice;
        return iHashCode2 + (price != null ? price.hashCode() : 0);
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
        return "TestStoreProduct(id=" + getId() + ", name=" + getName() + ", title=" + getTitle() + ", description=" + getDescription() + ", price=" + getPrice() + ", period=" + getPeriod() + ", freeTrialPeriod=" + this.freeTrialPeriod + ", introPrice=" + this.introPrice + ')';
    }
}
