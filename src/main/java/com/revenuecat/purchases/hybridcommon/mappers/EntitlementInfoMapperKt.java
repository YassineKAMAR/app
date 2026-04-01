package com.revenuecat.purchases.hybridcommon.mappers;

import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import e6.r;
import e6.x;
import f6.k0;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class EntitlementInfoMapperKt {
    public static final Map<String, Object> map(EntitlementInfo entitlementInfo) {
        q.f(entitlementInfo, "<this>");
        r[] rVarArr = new r[20];
        rVarArr[0] = x.a("identifier", entitlementInfo.getIdentifier());
        rVarArr[1] = x.a("isActive", Boolean.valueOf(entitlementInfo.isActive()));
        rVarArr[2] = x.a("willRenew", Boolean.valueOf(entitlementInfo.getWillRenew()));
        rVarArr[3] = x.a("periodType", entitlementInfo.getPeriodType().name());
        rVarArr[4] = x.a("latestPurchaseDateMillis", Long.valueOf(MappersHelpersKt.toMillis(entitlementInfo.getLatestPurchaseDate())));
        rVarArr[5] = x.a("latestPurchaseDate", MappersHelpersKt.toIso8601(entitlementInfo.getLatestPurchaseDate()));
        rVarArr[6] = x.a("originalPurchaseDateMillis", Long.valueOf(MappersHelpersKt.toMillis(entitlementInfo.getOriginalPurchaseDate())));
        rVarArr[7] = x.a("originalPurchaseDate", MappersHelpersKt.toIso8601(entitlementInfo.getOriginalPurchaseDate()));
        Date expirationDate = entitlementInfo.getExpirationDate();
        rVarArr[8] = x.a("expirationDateMillis", expirationDate != null ? Long.valueOf(MappersHelpersKt.toMillis(expirationDate)) : null);
        Date expirationDate2 = entitlementInfo.getExpirationDate();
        rVarArr[9] = x.a("expirationDate", expirationDate2 != null ? MappersHelpersKt.toIso8601(expirationDate2) : null);
        rVarArr[10] = x.a(ProductResponseJsonKeys.STORE, entitlementInfo.getStore().name());
        rVarArr[11] = x.a("productIdentifier", entitlementInfo.getProductIdentifier());
        rVarArr[12] = x.a("productPlanIdentifier", entitlementInfo.getProductPlanIdentifier());
        rVarArr[13] = x.a("isSandbox", Boolean.valueOf(entitlementInfo.isSandbox()));
        Date unsubscribeDetectedAt = entitlementInfo.getUnsubscribeDetectedAt();
        rVarArr[14] = x.a("unsubscribeDetectedAt", unsubscribeDetectedAt != null ? MappersHelpersKt.toIso8601(unsubscribeDetectedAt) : null);
        Date unsubscribeDetectedAt2 = entitlementInfo.getUnsubscribeDetectedAt();
        rVarArr[15] = x.a("unsubscribeDetectedAtMillis", unsubscribeDetectedAt2 != null ? Long.valueOf(MappersHelpersKt.toMillis(unsubscribeDetectedAt2)) : null);
        Date billingIssueDetectedAt = entitlementInfo.getBillingIssueDetectedAt();
        rVarArr[16] = x.a("billingIssueDetectedAt", billingIssueDetectedAt != null ? MappersHelpersKt.toIso8601(billingIssueDetectedAt) : null);
        Date billingIssueDetectedAt2 = entitlementInfo.getBillingIssueDetectedAt();
        rVarArr[17] = x.a("billingIssueDetectedAtMillis", billingIssueDetectedAt2 != null ? Long.valueOf(MappersHelpersKt.toMillis(billingIssueDetectedAt2)) : null);
        rVarArr[18] = x.a("ownershipType", entitlementInfo.getOwnershipType().name());
        rVarArr[19] = x.a("verification", entitlementInfo.getVerification().name());
        return k0.g(rVarArr);
    }
}
