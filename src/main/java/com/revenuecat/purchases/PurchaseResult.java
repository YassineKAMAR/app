package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class PurchaseResult {
    private final CustomerInfo customerInfo;
    private final StoreTransaction storeTransaction;

    public PurchaseResult(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        q.f(storeTransaction, "storeTransaction");
        q.f(customerInfo, "customerInfo");
        this.storeTransaction = storeTransaction;
        this.customerInfo = customerInfo;
    }

    public static /* synthetic */ PurchaseResult copy$default(PurchaseResult purchaseResult, StoreTransaction storeTransaction, CustomerInfo customerInfo, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            storeTransaction = purchaseResult.storeTransaction;
        }
        if ((i8 & 2) != 0) {
            customerInfo = purchaseResult.customerInfo;
        }
        return purchaseResult.copy(storeTransaction, customerInfo);
    }

    public final StoreTransaction component1() {
        return this.storeTransaction;
    }

    public final CustomerInfo component2() {
        return this.customerInfo;
    }

    public final PurchaseResult copy(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        q.f(storeTransaction, "storeTransaction");
        q.f(customerInfo, "customerInfo");
        return new PurchaseResult(storeTransaction, customerInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseResult)) {
            return false;
        }
        PurchaseResult purchaseResult = (PurchaseResult) obj;
        return q.b(this.storeTransaction, purchaseResult.storeTransaction) && q.b(this.customerInfo, purchaseResult.customerInfo);
    }

    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public final StoreTransaction getStoreTransaction() {
        return this.storeTransaction;
    }

    public int hashCode() {
        return (this.storeTransaction.hashCode() * 31) + this.customerInfo.hashCode();
    }

    public String toString() {
        return "PurchaseResult(storeTransaction=" + this.storeTransaction + ", customerInfo=" + this.customerInfo + ')';
    }
}
