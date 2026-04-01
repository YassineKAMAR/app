package com.revenuecat.purchases.google;

import com.android.billingclient.api.h;
import com.revenuecat.purchases.models.GoogleSubscriptionOption;
import f6.p;
import f6.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class SubscriptionOptionConversionsKt {
    public static final String getSubscriptionBillingPeriod(h.d dVar) {
        q.f(dVar, "<this>");
        List<h.b> listA = dVar.e().a();
        q.e(listA, "this.pricingPhases.pricingPhaseList");
        h.b bVar = (h.b) w.I(listA);
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    public static final boolean isBasePlan(h.d dVar) {
        q.f(dVar, "<this>");
        return dVar.e().a().size() == 1;
    }

    public static final GoogleSubscriptionOption toSubscriptionOption(h.d dVar, String productId, h productDetails) {
        q.f(dVar, "<this>");
        q.f(productId, "productId");
        q.f(productDetails, "productDetails");
        List<h.b> listA = dVar.e().a();
        q.e(listA, "pricingPhases.pricingPhaseList");
        ArrayList arrayList = new ArrayList(p.m(listA, 10));
        for (h.b it : listA) {
            q.e(it, "it");
            arrayList.add(PricingPhaseConversionsKt.toRevenueCatPricingPhase(it));
        }
        String basePlanId = dVar.a();
        q.e(basePlanId, "basePlanId");
        String strB = dVar.b();
        List<String> offerTags = dVar.c();
        q.e(offerTags, "offerTags");
        String offerToken = dVar.d();
        q.e(offerToken, "offerToken");
        return new GoogleSubscriptionOption(productId, basePlanId, strB, arrayList, offerTags, productDetails, offerToken, null, 128, null);
    }
}
