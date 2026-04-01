package com.revenuecat.purchases.google;

import com.android.billingclient.api.h;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import com.revenuecat.purchases.strings.PurchaseStrings;
import f6.k0;
import f6.o;
import f6.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class StoreProductConversionsKt {
    private static final Price createOneTimeProductPrice(h hVar) {
        h.a aVarC;
        if (ProductTypeConversionsKt.toRevenueCatProductType(hVar.e()) != ProductType.INAPP || (aVarC = hVar.c()) == null) {
            return null;
        }
        String strA = aVarC.a();
        q.e(strA, "it.formattedPrice");
        long jB = aVarC.b();
        String strC = aVarC.c();
        q.e(strC, "it.priceCurrencyCode");
        return new Price(strA, jB, strC);
    }

    public static final StoreProduct toInAppStoreProduct(h hVar) {
        q.f(hVar, "<this>");
        return toStoreProduct(hVar, o.d());
    }

    public static final GoogleStoreProduct toStoreProduct(h hVar, List<h.d> offerDetails) {
        SubscriptionOptions subscriptionOptions;
        Price price;
        PricingPhase fullPricePhase;
        q.f(hVar, "<this>");
        q.f(offerDetails, "offerDetails");
        if (ProductTypeConversionsKt.toRevenueCatProductType(hVar.e()) == ProductType.SUBS) {
            ArrayList arrayList = new ArrayList(p.m(offerDetails, 10));
            for (h.d dVar : offerDetails) {
                String productId = hVar.d();
                q.e(productId, "productId");
                arrayList.add(SubscriptionOptionConversionsKt.toSubscriptionOption(dVar, productId, hVar));
            }
            subscriptionOptions = new SubscriptionOptions(arrayList);
        } else {
            subscriptionOptions = null;
        }
        SubscriptionOption basePlan = subscriptionOptions != null ? subscriptionOptions.getBasePlan() : null;
        Price price2 = (basePlan == null || (fullPricePhase = basePlan.getFullPricePhase()) == null) ? null : fullPricePhase.getPrice();
        Price priceCreateOneTimeProductPrice = createOneTimeProductPrice(hVar);
        if (priceCreateOneTimeProductPrice != null) {
            price = priceCreateOneTimeProductPrice;
        } else {
            if (price2 == null) {
                return null;
            }
            price = price2;
        }
        String productId2 = hVar.d();
        q.e(productId2, "productId");
        String id = basePlan != null ? basePlan.getId() : null;
        ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(hVar.e());
        String name = hVar.b();
        q.e(name, "name");
        String title = hVar.g();
        q.e(title, "title");
        String description = hVar.a();
        q.e(description, "description");
        return new GoogleStoreProduct(productId2, id, revenueCatProductType, price, name, title, description, basePlan != null ? basePlan.getBillingPeriod() : null, subscriptionOptions, subscriptionOptions != null ? subscriptionOptions.getDefaultOffer() : null, hVar, null);
    }

    public static final List<StoreProduct> toStoreProducts(List<h> list) {
        List listD;
        Map mapE;
        q.f(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (h hVar : list) {
            List<h.d> subscriptionOfferDetails = hVar.f();
            if (subscriptionOfferDetails != null) {
                q.e(subscriptionOfferDetails, "subscriptionOfferDetails");
                listD = new ArrayList();
                for (Object obj : subscriptionOfferDetails) {
                    h.d it = (h.d) obj;
                    q.e(it, "it");
                    if (SubscriptionOptionConversionsKt.isBasePlan(it)) {
                        listD.add(obj);
                    }
                }
            } else {
                listD = o.d();
            }
            List<h.d> subscriptionOfferDetails2 = hVar.f();
            if (subscriptionOfferDetails2 != null) {
                q.e(subscriptionOfferDetails2, "subscriptionOfferDetails");
                mapE = new LinkedHashMap();
                for (Object obj2 : subscriptionOfferDetails2) {
                    String strA = ((h.d) obj2).a();
                    Object arrayList2 = mapE.get(strA);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        mapE.put(strA, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
            } else {
                mapE = k0.e();
            }
            if (listD.isEmpty()) {
                listD = null;
            }
            if (listD != null) {
                Iterator it2 = listD.iterator();
                while (it2.hasNext()) {
                    List listD2 = (List) mapE.get(((h.d) it2.next()).a());
                    if (listD2 == null) {
                        listD2 = o.d();
                    }
                    GoogleStoreProduct storeProduct = toStoreProduct(hVar, listD2);
                    if (storeProduct != null) {
                        arrayList.add(storeProduct);
                    } else {
                        LogIntent logIntent = LogIntent.RC_ERROR;
                        String str = String.format(PurchaseStrings.INVALID_PRODUCT_NO_PRICE, Arrays.copyOf(new Object[]{hVar.d()}, 1));
                        q.e(str, "format(this, *args)");
                        LogWrapperKt.log(logIntent, str);
                    }
                }
            } else {
                StoreProduct inAppStoreProduct = toInAppStoreProduct(hVar);
                if (inAppStoreProduct != null) {
                    arrayList.add(inAppStoreProduct);
                } else {
                    LogIntent logIntent2 = LogIntent.RC_ERROR;
                    String str2 = String.format(PurchaseStrings.INVALID_PRODUCT_NO_PRICE, Arrays.copyOf(new Object[]{hVar.d()}, 1));
                    q.e(str2, "format(this, *args)");
                    LogWrapperKt.log(logIntent2, str2);
                }
            }
        }
        return arrayList;
    }
}
