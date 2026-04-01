package com.revenuecat.purchases.amazon;

import com.amazon.a.a.o.b.f;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductType;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.q;
import org.json.JSONException;
import org.json.JSONObject;
import w6.u;
import w6.v;
import w6.w;
import w6.y;

/* JADX INFO: loaded from: classes.dex */
public final class StoreProductConversionsKt {
    private static final Pattern pattern;

    static {
        Pattern patternCompile = Pattern.compile("(\\d+[[\\.,\\s]\\d+]*)");
        q.e(patternCompile, "compile(\"(\\\\d+[[\\\\.,\\\\s]\\\\d+]*)\")");
        pattern = patternCompile;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Period createPeriod(String str) {
        String str2;
        Integer numI;
        q.f(str, "<this>");
        switch (str.hashCode()) {
            case -2115097178:
                if (str.equals("BiMonthly")) {
                    return new Period(2, Period.Unit.MONTH, "P2M");
                }
                break;
            case -1707840351:
                if (str.equals("Weekly")) {
                    return new Period(1, Period.Unit.WEEK, "P1W");
                }
                break;
            case -1393678355:
                if (str.equals("Monthly")) {
                    return new Period(1, Period.Unit.MONTH, "P1M");
                }
                break;
            case -580032564:
                if (str.equals("Annually")) {
                    return new Period(1, Period.Unit.YEAR, "P1Y");
                }
                break;
            case -308855462:
                if (str.equals("SemiAnnually")) {
                    return new Period(6, Period.Unit.MONTH, "P6M");
                }
                break;
            case 347098056:
                if (str.equals("BiWeekly")) {
                    return new Period(2, Period.Unit.WEEK, "P2W");
                }
                break;
            case 937940249:
                if (str.equals("Quarterly")) {
                    return new Period(3, Period.Unit.MONTH, "P3M");
                }
                break;
        }
        List listB0 = w.b0(str, new String[]{" "}, false, 0, 6, null);
        if (!(listB0.size() == 2)) {
            listB0 = null;
        }
        if (listB0 == null || (str2 = (String) f6.w.B(listB0)) == null || (numI = u.i(str2)) == null) {
            return null;
        }
        int iIntValue = numI.intValue();
        String strValueOf = String.valueOf(y.u0((CharSequence) listB0.get(1)));
        q.d(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        q.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return Period.Factory.create('P' + iIntValue + upperCase);
    }

    public static final Price createPrice(String str, String marketplace) {
        q.f(str, "<this>");
        q.f(marketplace, "marketplace");
        BigDecimal priceNumeric = parsePriceUsingRegex(str);
        if (priceNumeric == null) {
            priceNumeric = BigDecimal.ZERO;
        }
        q.e(priceNumeric, "priceNumeric");
        BigDecimal bigDecimalMultiply = priceNumeric.multiply(new BigDecimal(UtilsKt.MICROS_MULTIPLIER));
        q.e(bigDecimalMultiply, "this.multiply(other)");
        return new Price(str, bigDecimalMultiply.longValue(), ISO3166Alpha2ToISO42170Converter.INSTANCE.convertOrEmpty(marketplace));
    }

    public static final BigDecimal parsePriceUsingRegex(String str) {
        q.f(str, "<this>");
        Matcher matcher = pattern.matcher(str);
        if ((matcher.find() ? matcher : null) == null) {
            return null;
        }
        String dirtyPrice = matcher.group();
        q.e(dirtyPrice, "dirtyPrice");
        String string = w.r0(v.s(v.s(v.s(dirtyPrice, " ", "", false, 4, null), " ", "", false, 4, null), " ", "", false, 4, null)).toString();
        List listB0 = w.b0(string, new String[]{".", f.f3942a}, false, 0, 6, null);
        if (listB0.size() != 1) {
            if (((String) f6.w.H(listB0)).length() == 3) {
                string = v.s(v.s(string, ".", "", false, 4, null), f.f3942a, "", false, 4, null);
            } else {
                string = f6.w.G(f6.w.v(listB0, 1), "", null, null, 0, null, null, 62, null) + '.' + ((String) f6.w.H(listB0));
            }
        }
        return new BigDecimal(w.r0(string).toString());
    }

    public static final StoreProduct toStoreProduct(Product product, String marketplace) throws JSONException {
        q.f(product, "<this>");
        q.f(marketplace, "marketplace");
        if (product.getPrice() == null) {
            LogIntent logIntent = LogIntent.AMAZON_ERROR;
            String str = String.format(AmazonStrings.PRODUCT_PRICE_MISSING, Arrays.copyOf(new Object[]{product.getSku()}, 1));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            return null;
        }
        String price = product.getPrice();
        q.e(price, "price");
        Price priceCreatePrice = createPrice(price, marketplace);
        String sku = product.getSku();
        q.e(sku, "sku");
        ProductType productType = product.getProductType();
        q.e(productType, "productType");
        com.revenuecat.purchases.ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(productType);
        String title = product.getTitle();
        q.e(title, "title");
        String title2 = product.getTitle();
        q.e(title2, "title");
        String description = product.getDescription();
        q.e(description, "description");
        String subscriptionPeriod = product.getSubscriptionPeriod();
        Period periodCreatePeriod = subscriptionPeriod != null ? createPeriod(subscriptionPeriod) : null;
        String smallIconUrl = product.getSmallIconUrl();
        q.e(smallIconUrl, "smallIconUrl");
        String freeTrialPeriod = product.getFreeTrialPeriod();
        Period periodCreatePeriod2 = freeTrialPeriod != null ? createPeriod(freeTrialPeriod) : null;
        JSONObject json = product.toJSON();
        q.e(json, "this.toJSON()");
        return new AmazonStoreProduct(sku, revenueCatProductType, title, title2, description, periodCreatePeriod, priceCreatePrice, null, null, smallIconUrl, periodCreatePeriod2, json, null);
    }
}
