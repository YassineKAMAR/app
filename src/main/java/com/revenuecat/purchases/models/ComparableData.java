package com.revenuecat.purchases.models;

import androidx.privacysandbox.ads.adservices.topics.d;
import com.revenuecat.purchases.ProductType;
import java.util.List;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
final class ComparableData {
    private final Boolean isAutoRenewing;
    private final String marketplace;
    private final String orderId;
    private final String presentedOfferingIdentifier;
    private final List<String> productIds;
    private final PurchaseState purchaseState;
    private final long purchaseTime;
    private final String purchaseToken;
    private final PurchaseType purchaseType;
    private final String signature;
    private final String storeUserID;
    private final String subscriptionOptionId;
    private final ProductType type;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComparableData(StoreTransaction storeTransaction) {
        this(storeTransaction.getOrderId(), storeTransaction.getProductIds(), storeTransaction.getType(), storeTransaction.getPurchaseTime(), storeTransaction.getPurchaseToken(), storeTransaction.getPurchaseState(), storeTransaction.isAutoRenewing(), storeTransaction.getSignature(), storeTransaction.getPresentedOfferingIdentifier(), storeTransaction.getStoreUserID(), storeTransaction.getPurchaseType(), storeTransaction.getMarketplace(), storeTransaction.getSubscriptionOptionId());
        q.f(storeTransaction, "storeTransaction");
    }

    public ComparableData(String str, List<String> productIds, ProductType type, long j8, String purchaseToken, PurchaseState purchaseState, Boolean bool, String str2, String str3, String str4, PurchaseType purchaseType, String str5, String str6) {
        q.f(productIds, "productIds");
        q.f(type, "type");
        q.f(purchaseToken, "purchaseToken");
        q.f(purchaseState, "purchaseState");
        q.f(purchaseType, "purchaseType");
        this.orderId = str;
        this.productIds = productIds;
        this.type = type;
        this.purchaseTime = j8;
        this.purchaseToken = purchaseToken;
        this.purchaseState = purchaseState;
        this.isAutoRenewing = bool;
        this.signature = str2;
        this.presentedOfferingIdentifier = str3;
        this.storeUserID = str4;
        this.purchaseType = purchaseType;
        this.marketplace = str5;
        this.subscriptionOptionId = str6;
    }

    public final String component1() {
        return this.orderId;
    }

    public final String component10() {
        return this.storeUserID;
    }

    public final PurchaseType component11() {
        return this.purchaseType;
    }

    public final String component12() {
        return this.marketplace;
    }

    public final String component13() {
        return this.subscriptionOptionId;
    }

    public final List<String> component2() {
        return this.productIds;
    }

    public final ProductType component3() {
        return this.type;
    }

    public final long component4() {
        return this.purchaseTime;
    }

    public final String component5() {
        return this.purchaseToken;
    }

    public final PurchaseState component6() {
        return this.purchaseState;
    }

    public final Boolean component7() {
        return this.isAutoRenewing;
    }

    public final String component8() {
        return this.signature;
    }

    public final String component9() {
        return this.presentedOfferingIdentifier;
    }

    public final ComparableData copy(String str, List<String> productIds, ProductType type, long j8, String purchaseToken, PurchaseState purchaseState, Boolean bool, String str2, String str3, String str4, PurchaseType purchaseType, String str5, String str6) {
        q.f(productIds, "productIds");
        q.f(type, "type");
        q.f(purchaseToken, "purchaseToken");
        q.f(purchaseState, "purchaseState");
        q.f(purchaseType, "purchaseType");
        return new ComparableData(str, productIds, type, j8, purchaseToken, purchaseState, bool, str2, str3, str4, purchaseType, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComparableData)) {
            return false;
        }
        ComparableData comparableData = (ComparableData) obj;
        return q.b(this.orderId, comparableData.orderId) && q.b(this.productIds, comparableData.productIds) && this.type == comparableData.type && this.purchaseTime == comparableData.purchaseTime && q.b(this.purchaseToken, comparableData.purchaseToken) && this.purchaseState == comparableData.purchaseState && q.b(this.isAutoRenewing, comparableData.isAutoRenewing) && q.b(this.signature, comparableData.signature) && q.b(this.presentedOfferingIdentifier, comparableData.presentedOfferingIdentifier) && q.b(this.storeUserID, comparableData.storeUserID) && this.purchaseType == comparableData.purchaseType && q.b(this.marketplace, comparableData.marketplace) && q.b(this.subscriptionOptionId, comparableData.subscriptionOptionId);
    }

    public final String getMarketplace() {
        return this.marketplace;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPresentedOfferingIdentifier() {
        return this.presentedOfferingIdentifier;
    }

    public final List<String> getProductIds() {
        return this.productIds;
    }

    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getStoreUserID() {
        return this.storeUserID;
    }

    public final String getSubscriptionOptionId() {
        return this.subscriptionOptionId;
    }

    public final ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (((((((((((str == null ? 0 : str.hashCode()) * 31) + this.productIds.hashCode()) * 31) + this.type.hashCode()) * 31) + d.a(this.purchaseTime)) * 31) + this.purchaseToken.hashCode()) * 31) + this.purchaseState.hashCode()) * 31;
        Boolean bool = this.isAutoRenewing;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.signature;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.presentedOfferingIdentifier;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.storeUserID;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.purchaseType.hashCode()) * 31;
        String str5 = this.marketplace;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subscriptionOptionId;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final Boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public String toString() {
        return "ComparableData(orderId=" + this.orderId + ", productIds=" + this.productIds + ", type=" + this.type + ", purchaseTime=" + this.purchaseTime + ", purchaseToken=" + this.purchaseToken + ", purchaseState=" + this.purchaseState + ", isAutoRenewing=" + this.isAutoRenewing + ", signature=" + this.signature + ", presentedOfferingIdentifier=" + this.presentedOfferingIdentifier + ", storeUserID=" + this.storeUserID + ", purchaseType=" + this.purchaseType + ", marketplace=" + this.marketplace + ", subscriptionOptionId=" + this.subscriptionOptionId + ')';
    }
}
