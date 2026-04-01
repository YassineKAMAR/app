package com.revenuecat.purchases.common;

import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.EntitlementInfos;
import com.revenuecat.purchases.OwnershipType;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.responses.EntitlementsResponseJsonKeys;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.utils.DateActive;
import com.revenuecat.purchases.utils.DateHelper;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class EntitlementInfoFactoriesKt {
    public static final EntitlementInfo buildEntitlementInfo(JSONObject jSONObject, String identifier, JSONObject productData, Date requestDate, VerificationResult verificationResult) throws JSONException {
        q.f(jSONObject, "<this>");
        q.f(identifier, "identifier");
        q.f(productData, "productData");
        q.f(requestDate, "requestDate");
        q.f(verificationResult, "verificationResult");
        Date dateOptDate = JSONObjectExtensionsKt.optDate(jSONObject, "expires_date");
        Date dateOptDate2 = JSONObjectExtensionsKt.optDate(productData, ProductResponseJsonKeys.UNSUBSCRIBE_DETECTED_AT);
        Date dateOptDate3 = JSONObjectExtensionsKt.optDate(productData, ProductResponseJsonKeys.BILLING_ISSUES_DETECTED_AT);
        Store store = getStore(productData, ProductResponseJsonKeys.STORE);
        boolean zIsDateActive = isDateActive(identifier, dateOptDate, requestDate);
        boolean willRenew = getWillRenew(store, dateOptDate, dateOptDate2, dateOptDate3);
        PeriodType periodTypeOptPeriodType = optPeriodType(productData, ProductResponseJsonKeys.PERIOD_TYPE);
        Date date = JSONObjectExtensionsKt.getDate(jSONObject, "purchase_date");
        Date date2 = JSONObjectExtensionsKt.getDate(productData, "original_purchase_date");
        String string = jSONObject.getString(EntitlementsResponseJsonKeys.PRODUCT_IDENTIFIER);
        q.e(string, "getString(EntitlementsRe…nKeys.PRODUCT_IDENTIFIER)");
        return new EntitlementInfo(identifier, zIsDateActive, willRenew, periodTypeOptPeriodType, date, date2, dateOptDate, store, string, JSONObjectExtensionsKt.optNullableString(jSONObject, "product_plan_identifier"), productData.getBoolean(ProductResponseJsonKeys.IS_SANDBOX), dateOptDate2, dateOptDate3, optOwnershipType(productData, ProductResponseJsonKeys.OWNERSHIP_TYPE), jSONObject, verificationResult);
    }

    public static final EntitlementInfos buildEntitlementInfos(JSONObject jSONObject, JSONObject subscriptions, JSONObject nonSubscriptionsLatestPurchases, Date requestDate, VerificationResult verificationResult) {
        JSONObject jSONObject2;
        String str;
        q.f(jSONObject, "<this>");
        q.f(subscriptions, "subscriptions");
        q.f(nonSubscriptionsLatestPurchases, "nonSubscriptionsLatestPurchases");
        q.f(requestDate, "requestDate");
        q.f(verificationResult, "verificationResult");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        q.e(itKeys, "keys()");
        while (itKeys.hasNext()) {
            String entitlementId = itKeys.next();
            JSONObject entitlement = jSONObject.getJSONObject(entitlementId);
            String it = entitlement.optString(EntitlementsResponseJsonKeys.PRODUCT_IDENTIFIER);
            q.e(it, "it");
            if (!(it.length() > 0)) {
                it = null;
            }
            if (it != null) {
                if (subscriptions.has(it)) {
                    q.e(entitlementId, "entitlementId");
                    q.e(entitlement, "entitlement");
                    jSONObject2 = subscriptions.getJSONObject(it);
                    str = "subscriptions.getJSONObject(productIdentifier)";
                } else if (nonSubscriptionsLatestPurchases.has(it)) {
                    q.e(entitlementId, "entitlementId");
                    q.e(entitlement, "entitlement");
                    jSONObject2 = nonSubscriptionsLatestPurchases.getJSONObject(it);
                    str = "nonSubscriptionsLatestPu…Object(productIdentifier)";
                }
                q.e(jSONObject2, str);
                linkedHashMap.put(entitlementId, buildEntitlementInfo(entitlement, entitlementId, jSONObject2, requestDate, verificationResult));
            }
        }
        return new EntitlementInfos(linkedHashMap, verificationResult);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Store getStore(JSONObject jSONObject, String name) throws JSONException {
        q.f(jSONObject, "<this>");
        q.f(name, "name");
        String string = jSONObject.getString(name);
        if (string != null) {
            switch (string.hashCode()) {
                case -1414265340:
                    if (string.equals("amazon")) {
                        return Store.AMAZON;
                    }
                    break;
                case -891985843:
                    if (string.equals("stripe")) {
                        return Store.STRIPE;
                    }
                    break;
                case 564036179:
                    if (string.equals("mac_app_store")) {
                        return Store.MAC_APP_STORE;
                    }
                    break;
                case 756050958:
                    if (string.equals("promotional")) {
                        return Store.PROMOTIONAL;
                    }
                    break;
                case 1842542915:
                    if (string.equals("app_store")) {
                        return Store.APP_STORE;
                    }
                    break;
                case 1925951510:
                    if (string.equals("play_store")) {
                        return Store.PLAY_STORE;
                    }
                    break;
            }
        }
        return Store.UNKNOWN_STORE;
    }

    private static final boolean getWillRenew(Store store, Date date, Date date2, Date date3) {
        return ((store == Store.PROMOTIONAL) || (date == null) || (date2 != null) || (date3 != null)) ? false : true;
    }

    private static final boolean isDateActive(String str, Date date, Date date2) {
        DateActive dateActiveM19isDateActiveSxA4cEA$default = DateHelper.Companion.m19isDateActiveSxA4cEA$default(DateHelper.Companion, date, date2, 0L, 4, null);
        if (!dateActiveM19isDateActiveSxA4cEA$default.isActive() && !dateActiveM19isDateActiveSxA4cEA$default.getInGracePeriod()) {
            String str2 = String.format(PurchaseStrings.ENTITLEMENT_EXPIRED_OUTSIDE_GRACE_PERIOD, Arrays.copyOf(new Object[]{str, date, date2}, 3));
            q.e(str2, "format(this, *args)");
            LogUtilsKt.warnLog(str2);
        }
        return dateActiveM19isDateActiveSxA4cEA$default.isActive();
    }

    public static final OwnershipType optOwnershipType(JSONObject jSONObject, String name) {
        q.f(jSONObject, "<this>");
        q.f(name, "name");
        String strOptString = jSONObject.optString(name);
        return q.b(strOptString, "PURCHASED") ? OwnershipType.PURCHASED : q.b(strOptString, "FAMILY_SHARED") ? OwnershipType.FAMILY_SHARED : OwnershipType.UNKNOWN;
    }

    public static final PeriodType optPeriodType(JSONObject jSONObject, String name) {
        q.f(jSONObject, "<this>");
        q.f(name, "name");
        String strOptString = jSONObject.optString(name);
        if (strOptString != null) {
            int iHashCode = strOptString.hashCode();
            if (iHashCode == -1039745817) {
                strOptString.equals("normal");
            } else if (iHashCode != 100361836) {
                if (iHashCode == 110628630 && strOptString.equals("trial")) {
                    return PeriodType.TRIAL;
                }
            } else if (strOptString.equals("intro")) {
                return PeriodType.INTRO;
            }
        }
        return PeriodType.NORMAL;
    }
}
