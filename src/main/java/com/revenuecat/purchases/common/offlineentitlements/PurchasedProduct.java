package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class PurchasedProduct {
    private final String basePlanId;
    private final List<String> entitlements;
    private final Date expiresDate;
    private final String productIdentifier;
    private final StoreTransaction storeTransaction;

    public PurchasedProduct(String productIdentifier, String str, StoreTransaction storeTransaction, List<String> entitlements, Date date) {
        q.f(productIdentifier, "productIdentifier");
        q.f(storeTransaction, "storeTransaction");
        q.f(entitlements, "entitlements");
        this.productIdentifier = productIdentifier;
        this.basePlanId = str;
        this.storeTransaction = storeTransaction;
        this.entitlements = entitlements;
        this.expiresDate = date;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PurchasedProduct copy$default(PurchasedProduct purchasedProduct, String str, String str2, StoreTransaction storeTransaction, List list, Date date, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = purchasedProduct.productIdentifier;
        }
        if ((i8 & 2) != 0) {
            str2 = purchasedProduct.basePlanId;
        }
        String str3 = str2;
        if ((i8 & 4) != 0) {
            storeTransaction = purchasedProduct.storeTransaction;
        }
        StoreTransaction storeTransaction2 = storeTransaction;
        if ((i8 & 8) != 0) {
            list = purchasedProduct.entitlements;
        }
        List list2 = list;
        if ((i8 & 16) != 0) {
            date = purchasedProduct.expiresDate;
        }
        return purchasedProduct.copy(str, str3, storeTransaction2, list2, date);
    }

    public final String component1() {
        return this.productIdentifier;
    }

    public final String component2() {
        return this.basePlanId;
    }

    public final StoreTransaction component3() {
        return this.storeTransaction;
    }

    public final List<String> component4() {
        return this.entitlements;
    }

    public final Date component5() {
        return this.expiresDate;
    }

    public final PurchasedProduct copy(String productIdentifier, String str, StoreTransaction storeTransaction, List<String> entitlements, Date date) {
        q.f(productIdentifier, "productIdentifier");
        q.f(storeTransaction, "storeTransaction");
        q.f(entitlements, "entitlements");
        return new PurchasedProduct(productIdentifier, str, storeTransaction, entitlements, date);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasedProduct)) {
            return false;
        }
        PurchasedProduct purchasedProduct = (PurchasedProduct) obj;
        return q.b(this.productIdentifier, purchasedProduct.productIdentifier) && q.b(this.basePlanId, purchasedProduct.basePlanId) && q.b(this.storeTransaction, purchasedProduct.storeTransaction) && q.b(this.entitlements, purchasedProduct.entitlements) && q.b(this.expiresDate, purchasedProduct.expiresDate);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final List<String> getEntitlements() {
        return this.entitlements;
    }

    public final Date getExpiresDate() {
        return this.expiresDate;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final StoreTransaction getStoreTransaction() {
        return this.storeTransaction;
    }

    public int hashCode() {
        int iHashCode = this.productIdentifier.hashCode() * 31;
        String str = this.basePlanId;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.storeTransaction.hashCode()) * 31) + this.entitlements.hashCode()) * 31;
        Date date = this.expiresDate;
        return iHashCode2 + (date != null ? date.hashCode() : 0);
    }

    public String toString() {
        return "PurchasedProduct(productIdentifier=" + this.productIdentifier + ", basePlanId=" + this.basePlanId + ", storeTransaction=" + this.storeTransaction + ", entitlements=" + this.entitlements + ", expiresDate=" + this.expiresDate + ')';
    }
}
