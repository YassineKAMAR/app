package com.revenuecat.purchases.google;

import com.android.billingclient.api.h;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.RecurrenceMode;
import com.revenuecat.purchases.models.RecurrenceModeKt;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class PricingPhaseConversionsKt {
    public static final PricingPhase toRevenueCatPricingPhase(h.b bVar) {
        q.f(bVar, "<this>");
        Period.Factory factory = Period.Factory;
        String billingPeriod = bVar.b();
        q.e(billingPeriod, "billingPeriod");
        Period periodCreate = factory.create(billingPeriod);
        RecurrenceMode recurrenceMode = RecurrenceModeKt.toRecurrenceMode(Integer.valueOf(bVar.f()));
        Integer numValueOf = Integer.valueOf(bVar.a());
        String formattedPrice = bVar.c();
        q.e(formattedPrice, "formattedPrice");
        long jD = bVar.d();
        String priceCurrencyCode = bVar.e();
        q.e(priceCurrencyCode, "priceCurrencyCode");
        return new PricingPhase(periodCreate, recurrenceMode, numValueOf, new Price(formattedPrice, jD, priceCurrencyCode));
    }
}
