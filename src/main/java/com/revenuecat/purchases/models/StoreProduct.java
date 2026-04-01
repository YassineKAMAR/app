package com.revenuecat.purchases.models;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.utils.PriceExtensionsKt;
import java.util.Locale;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public interface StoreProduct {

    public static final class DefaultImpls {
        public static String formattedPricePerMonth(StoreProduct storeProduct, Locale locale) {
            q.f(locale, "locale");
            Price pricePricePerMonth = storeProduct.pricePerMonth(locale);
            if (pricePricePerMonth != null) {
                return pricePricePerMonth.getFormatted();
            }
            return null;
        }

        public static /* synthetic */ String formattedPricePerMonth$default(StoreProduct storeProduct, Locale locale, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formattedPricePerMonth");
            }
            if ((i8 & 1) != 0) {
                locale = Locale.getDefault();
                q.e(locale, "getDefault()");
            }
            return storeProduct.formattedPricePerMonth(locale);
        }

        public static /* synthetic */ void getSku$annotations() {
        }

        public static Price pricePerMonth(StoreProduct storeProduct, Locale locale) {
            q.f(locale, "locale");
            Period period = storeProduct.getPeriod();
            if (period != null) {
                return PriceExtensionsKt.pricePerMonth(storeProduct.getPrice(), period, locale);
            }
            return null;
        }

        public static /* synthetic */ Price pricePerMonth$default(StoreProduct storeProduct, Locale locale, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pricePerMonth");
            }
            if ((i8 & 1) != 0) {
                locale = Locale.getDefault();
                q.e(locale, "getDefault()");
            }
            return storeProduct.pricePerMonth(locale);
        }

        public static Price pricePerWeek(StoreProduct storeProduct, Locale locale) {
            q.f(locale, "locale");
            Period period = storeProduct.getPeriod();
            if (period != null) {
                return PriceExtensionsKt.pricePerWeek(storeProduct.getPrice(), period, locale);
            }
            return null;
        }

        public static /* synthetic */ Price pricePerWeek$default(StoreProduct storeProduct, Locale locale, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pricePerWeek");
            }
            if ((i8 & 1) != 0) {
                locale = Locale.getDefault();
                q.e(locale, "getDefault()");
            }
            return storeProduct.pricePerWeek(locale);
        }

        public static Price pricePerYear(StoreProduct storeProduct, Locale locale) {
            q.f(locale, "locale");
            Period period = storeProduct.getPeriod();
            if (period != null) {
                return PriceExtensionsKt.pricePerYear(storeProduct.getPrice(), period, locale);
            }
            return null;
        }

        public static /* synthetic */ Price pricePerYear$default(StoreProduct storeProduct, Locale locale, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pricePerYear");
            }
            if ((i8 & 1) != 0) {
                locale = Locale.getDefault();
                q.e(locale, "getDefault()");
            }
            return storeProduct.pricePerYear(locale);
        }
    }

    StoreProduct copyWithOfferingId(String str);

    String formattedPricePerMonth(Locale locale);

    SubscriptionOption getDefaultOption();

    String getDescription();

    String getId();

    String getName();

    Period getPeriod();

    String getPresentedOfferingIdentifier();

    Price getPrice();

    PurchasingData getPurchasingData();

    String getSku();

    SubscriptionOptions getSubscriptionOptions();

    String getTitle();

    ProductType getType();

    Price pricePerMonth(Locale locale);

    Price pricePerWeek(Locale locale);

    Price pricePerYear(Locale locale);
}
