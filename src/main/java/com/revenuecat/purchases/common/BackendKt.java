package com.revenuecat.purchases.common;

import com.revenuecat.purchases.models.PricingPhase;
import e6.x;
import f6.k0;
import java.util.Map;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class BackendKt {
    public static final String ATTRIBUTES_ERROR_RESPONSE_KEY = "attributes_error_response";
    public static final String ATTRIBUTE_ERRORS_KEY = "attribute_errors";

    public static final Map<String, Object> toMap(PricingPhase pricingPhase) {
        q.f(pricingPhase, "<this>");
        return k0.g(x.a("billingPeriod", pricingPhase.getBillingPeriod().getIso8601()), x.a("billingCycleCount", pricingPhase.getBillingCycleCount()), x.a("recurrenceMode", pricingPhase.getRecurrenceMode().getIdentifier()), x.a("formattedPrice", pricingPhase.getPrice().getFormatted()), x.a("priceAmountMicros", Long.valueOf(pricingPhase.getPrice().getAmountMicros())), x.a("priceCurrencyCode", pricingPhase.getPrice().getCurrencyCode()));
    }
}
