package com.revenuecat.purchases.hybridcommon.mappers;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.OfferPaymentMode;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import e6.r;
import e6.x;
import f6.j0;
import f6.k0;
import f6.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class StoreProductMapperKt {
    private static final int DAYS_PER_WEEK = 7;
    private static final double MICROS_CONVERSION_METRIC = 1000000.0d;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.INAPP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.SUBS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Period.Unit.values().length];
            try {
                iArr2[Period.Unit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Period.Unit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Period.Unit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Period.Unit.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Period.Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Integer getFreeTrialCycles(StoreProduct storeProduct) {
        PricingPhase freePhase;
        q.f(storeProduct, "<this>");
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption == null || (freePhase = defaultOption.getFreePhase()) == null) {
            return null;
        }
        return freePhase.getBillingCycleCount();
    }

    public static final Period getFreeTrialPeriod(StoreProduct storeProduct) {
        PricingPhase freePhase;
        q.f(storeProduct, "<this>");
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption == null || (freePhase = defaultOption.getFreePhase()) == null) {
            return null;
        }
        return freePhase.getBillingPeriod();
    }

    private static final PricingPhase getIntroductoryPhase(StoreProduct storeProduct) {
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption != null) {
            return defaultOption.getIntroPhase();
        }
        return null;
    }

    public static final String getIntroductoryPrice(StoreProduct storeProduct) {
        Price price;
        q.f(storeProduct, "<this>");
        PricingPhase introductoryPhase = getIntroductoryPhase(storeProduct);
        if (introductoryPhase == null || (price = introductoryPhase.getPrice()) == null) {
            return null;
        }
        return price.getFormatted();
    }

    public static final long getIntroductoryPriceAmountMicros(StoreProduct storeProduct) {
        Price price;
        q.f(storeProduct, "<this>");
        PricingPhase introductoryPhase = getIntroductoryPhase(storeProduct);
        if (introductoryPhase == null || (price = introductoryPhase.getPrice()) == null) {
            return 0L;
        }
        return price.getAmountMicros();
    }

    public static final int getIntroductoryPriceCycles(StoreProduct storeProduct) {
        Integer billingCycleCount;
        q.f(storeProduct, "<this>");
        PricingPhase introductoryPhase = getIntroductoryPhase(storeProduct);
        if (introductoryPhase == null || (billingCycleCount = introductoryPhase.getBillingCycleCount()) == null) {
            return 0;
        }
        return billingCycleCount.intValue();
    }

    public static final Period getIntroductoryPricePeriod(StoreProduct storeProduct) {
        q.f(storeProduct, "<this>");
        PricingPhase introductoryPhase = getIntroductoryPhase(storeProduct);
        if (introductoryPhase != null) {
            return introductoryPhase.getBillingPeriod();
        }
        return null;
    }

    public static final long getPriceAmountMicros(StoreProduct storeProduct) {
        q.f(storeProduct, "<this>");
        return storeProduct.getPrice().getAmountMicros();
    }

    public static final String getPriceCurrencyCode(StoreProduct storeProduct) {
        q.f(storeProduct, "<this>");
        return storeProduct.getPrice().getCurrencyCode();
    }

    public static final String getPriceString(StoreProduct storeProduct) {
        q.f(storeProduct, "<this>");
        return storeProduct.getPrice().getFormatted();
    }

    public static final List<Map<String, Object>> map(List<? extends StoreProduct> list) {
        q.f(list, "<this>");
        ArrayList arrayList = new ArrayList(p.m(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(map((StoreProduct) it.next()));
        }
        return arrayList;
    }

    public static final Map<String, Object> map(StoreProduct storeProduct) {
        q.f(storeProduct, "<this>");
        r[] rVarArr = new r[14];
        rVarArr[0] = x.a("identifier", storeProduct.getId());
        rVarArr[1] = x.a(b.f3893c, storeProduct.getDescription());
        rVarArr[2] = x.a(b.S, storeProduct.getTitle());
        rVarArr[3] = x.a(b.f3914x, Double.valueOf(getPriceAmountMicros(storeProduct) / MICROS_CONVERSION_METRIC));
        rVarArr[4] = x.a("priceString", getPriceString(storeProduct));
        rVarArr[5] = x.a("currencyCode", getPriceCurrencyCode(storeProduct));
        rVarArr[6] = x.a("introPrice", mapIntroPrice(storeProduct));
        ArrayList arrayList = null;
        rVarArr[7] = x.a("discounts", null);
        rVarArr[8] = x.a("productCategory", mapProductCategory(storeProduct).getValue());
        rVarArr[9] = x.a("productType", mapProductType(storeProduct));
        Period period = storeProduct.getPeriod();
        rVarArr[10] = x.a(b.f3905o, period != null ? period.getIso8601() : null);
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        rVarArr[11] = x.a("defaultOption", defaultOption != null ? mapSubscriptionOption(defaultOption, storeProduct) : null);
        SubscriptionOptions subscriptionOptions = storeProduct.getSubscriptionOptions();
        if (subscriptionOptions != null) {
            arrayList = new ArrayList(p.m(subscriptionOptions, 10));
            Iterator<SubscriptionOption> it = subscriptionOptions.iterator();
            while (it.hasNext()) {
                arrayList.add(mapSubscriptionOption(it.next(), storeProduct));
            }
        }
        rVarArr[12] = x.a("subscriptionOptions", arrayList);
        rVarArr[13] = x.a("presentedOfferingIdentifier", storeProduct.getPresentedOfferingIdentifier());
        return k0.g(rVarArr);
    }

    public static final Map<String, Object> mapIntroPrice(StoreProduct storeProduct) {
        Period introductoryPricePeriod;
        Map<String, Object> mapMapPeriodForStoreProduct;
        Map mapG;
        q.f(storeProduct, "<this>");
        if (getFreeTrialPeriod(storeProduct) != null) {
            Period freeTrialPeriod = getFreeTrialPeriod(storeProduct);
            if (freeTrialPeriod == null || (mapMapPeriodForStoreProduct = mapPeriodForStoreProduct(freeTrialPeriod)) == null) {
                return null;
            }
            r[] rVarArr = new r[4];
            rVarArr[0] = x.a(b.f3914x, 0);
            rVarArr[1] = x.a("priceString", MappersHelpersKt.formatUsingDeviceLocale(getPriceCurrencyCode(storeProduct), 0L));
            Period freeTrialPeriod2 = getFreeTrialPeriod(storeProduct);
            rVarArr[2] = x.a("period", freeTrialPeriod2 != null ? freeTrialPeriod2.getIso8601() : null);
            Integer freeTrialCycles = getFreeTrialCycles(storeProduct);
            rVarArr[3] = x.a("cycles", Integer.valueOf(freeTrialCycles != null ? freeTrialCycles.intValue() : 1));
            mapG = k0.g(rVarArr);
        } else {
            if (getIntroductoryPrice(storeProduct) == null || (introductoryPricePeriod = getIntroductoryPricePeriod(storeProduct)) == null || (mapMapPeriodForStoreProduct = mapPeriodForStoreProduct(introductoryPricePeriod)) == null) {
                return null;
            }
            r[] rVarArr2 = new r[4];
            rVarArr2[0] = x.a(b.f3914x, Double.valueOf(getIntroductoryPriceAmountMicros(storeProduct) / MICROS_CONVERSION_METRIC));
            rVarArr2[1] = x.a("priceString", getIntroductoryPrice(storeProduct));
            Period introductoryPricePeriod2 = getIntroductoryPricePeriod(storeProduct);
            rVarArr2[2] = x.a("period", introductoryPricePeriod2 != null ? introductoryPricePeriod2.getIso8601() : null);
            rVarArr2[3] = x.a("cycles", Integer.valueOf(getIntroductoryPriceCycles(storeProduct)));
            mapG = k0.g(rVarArr2);
        }
        return k0.j(mapG, mapMapPeriodForStoreProduct);
    }

    private static final Map<String, Object> mapPeriod(Period period) {
        Map mapG;
        int i8 = WhenMappings.$EnumSwitchMapping$1[period.getUnit().ordinal()];
        if (i8 == 1) {
            mapG = k0.g(x.a("unit", "DAY"), x.a("value", Integer.valueOf(period.getValue())));
        } else if (i8 == 2) {
            mapG = k0.g(x.a("unit", "DAY"), x.a("value", Integer.valueOf(period.getValue() * 7)));
        } else if (i8 == 3) {
            mapG = k0.g(x.a("unit", "MONTH"), x.a("value", Integer.valueOf(period.getValue())));
        } else if (i8 == 4) {
            mapG = k0.g(x.a("unit", "YEAR"), x.a("value", Integer.valueOf(period.getValue())));
        } else {
            if (i8 != 5) {
                throw new e6.p();
            }
            mapG = k0.g(x.a("unit", "DAY"), x.a("value", 0));
        }
        return k0.j(mapG, j0.c(x.a("iso8601", period.getIso8601())));
    }

    private static final Map<String, Object> mapPeriodForStoreProduct(Period period) {
        int i8 = WhenMappings.$EnumSwitchMapping$1[period.getUnit().ordinal()];
        if (i8 == 1) {
            return k0.g(x.a("periodUnit", "DAY"), x.a("periodNumberOfUnits", Integer.valueOf(period.getValue())));
        }
        if (i8 == 2) {
            return k0.g(x.a("periodUnit", "DAY"), x.a("periodNumberOfUnits", Integer.valueOf(period.getValue() * 7)));
        }
        if (i8 == 3) {
            return k0.g(x.a("periodUnit", "MONTH"), x.a("periodNumberOfUnits", Integer.valueOf(period.getValue())));
        }
        if (i8 == 4) {
            return k0.g(x.a("periodUnit", "YEAR"), x.a("periodNumberOfUnits", Integer.valueOf(period.getValue())));
        }
        if (i8 == 5) {
            return k0.g(x.a("periodUnit", "DAY"), x.a("periodNumberOfUnits", 0));
        }
        throw new e6.p();
    }

    private static final Map<String, Object> mapPrice(Price price) {
        return k0.g(x.a("formatted", price.getFormatted()), x.a("amountMicros", Long.valueOf(price.getAmountMicros())), x.a("currencyCode", price.getCurrencyCode()));
    }

    private static final Map<String, Object> mapPricingPhase(PricingPhase pricingPhase) {
        r[] rVarArr = new r[5];
        Period billingPeriod = pricingPhase.getBillingPeriod();
        rVarArr[0] = x.a("billingPeriod", billingPeriod != null ? mapPeriod(billingPeriod) : null);
        rVarArr[1] = x.a("recurrenceMode", pricingPhase.getRecurrenceMode().getIdentifier());
        rVarArr[2] = x.a("billingCycleCount", pricingPhase.getBillingCycleCount());
        rVarArr[3] = x.a(b.f3914x, mapPrice(pricingPhase.getPrice()));
        OfferPaymentMode offerPaymentMode = pricingPhase.getOfferPaymentMode();
        rVarArr[4] = x.a("offerPaymentMode", offerPaymentMode != null ? offerPaymentMode.toString() : null);
        return k0.g(rVarArr);
    }

    public static final MappedProductCategory mapProductCategory(StoreProduct storeProduct) {
        q.f(storeProduct, "<this>");
        int i8 = WhenMappings.$EnumSwitchMapping$0[storeProduct.getType().ordinal()];
        if (i8 == 1) {
            return MappedProductCategory.NON_SUBSCRIPTION;
        }
        if (i8 == 2) {
            return MappedProductCategory.SUBSCRIPTION;
        }
        if (i8 == 3) {
            return MappedProductCategory.UNKNOWN;
        }
        throw new e6.p();
    }

    public static final String mapProductType(StoreProduct storeProduct) {
        q.f(storeProduct, "<this>");
        int i8 = WhenMappings.$EnumSwitchMapping$0[storeProduct.getType().ordinal()];
        if (i8 == 1) {
            return "CONSUMABLE";
        }
        if (i8 == 2) {
            SubscriptionOption defaultOption = storeProduct.getDefaultOption();
            return defaultOption != null && defaultOption.isPrepaid() ? "PREPAID_SUBSCRIPTION" : "AUTO_RENEWABLE_SUBSCRIPTION";
        }
        if (i8 == 3) {
            return "UNKNOWN";
        }
        throw new e6.p();
    }

    private static final Map<String, Object> mapSubscriptionOption(SubscriptionOption subscriptionOption, StoreProduct storeProduct) {
        r[] rVarArr = new r[12];
        rVarArr[0] = x.a("id", subscriptionOption.getId());
        rVarArr[1] = x.a("storeProductId", storeProduct.getId());
        rVarArr[2] = x.a("productId", storeProduct.getPurchasingData().getProductId());
        List<PricingPhase> pricingPhases = subscriptionOption.getPricingPhases();
        ArrayList arrayList = new ArrayList(p.m(pricingPhases, 10));
        Iterator<T> it = pricingPhases.iterator();
        while (it.hasNext()) {
            arrayList.add(mapPricingPhase((PricingPhase) it.next()));
        }
        rVarArr[3] = x.a("pricingPhases", arrayList);
        rVarArr[4] = x.a("tags", subscriptionOption.getTags());
        rVarArr[5] = x.a("isBasePlan", Boolean.valueOf(subscriptionOption.isBasePlan()));
        Period billingPeriod = subscriptionOption.getBillingPeriod();
        rVarArr[6] = x.a("billingPeriod", billingPeriod != null ? mapPeriod(billingPeriod) : null);
        rVarArr[7] = x.a("isPrepaid", Boolean.valueOf(subscriptionOption.isPrepaid()));
        PricingPhase fullPricePhase = subscriptionOption.getFullPricePhase();
        rVarArr[8] = x.a("fullPricePhase", fullPricePhase != null ? mapPricingPhase(fullPricePhase) : null);
        PricingPhase freePhase = subscriptionOption.getFreePhase();
        rVarArr[9] = x.a("freePhase", freePhase != null ? mapPricingPhase(freePhase) : null);
        PricingPhase introPhase = subscriptionOption.getIntroPhase();
        rVarArr[10] = x.a("introPhase", introPhase != null ? mapPricingPhase(introPhase) : null);
        rVarArr[11] = x.a("presentedOfferingIdentifier", subscriptionOption.getPresentedOfferingIdentifier());
        return k0.g(rVarArr);
    }
}
