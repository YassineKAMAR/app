package com.revenuecat.purchases;

import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class PurchasesStateCache implements PurchasesStateProvider {
    private PurchasesState purchasesState;

    public PurchasesStateCache(PurchasesState purchasesState) {
        q.f(purchasesState, "purchasesState");
        this.purchasesState = purchasesState;
    }

    public static /* synthetic */ PurchasesStateCache copy$default(PurchasesStateCache purchasesStateCache, PurchasesState purchasesState, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            purchasesState = purchasesStateCache.getPurchasesState();
        }
        return purchasesStateCache.copy(purchasesState);
    }

    public final PurchasesState component1() {
        return getPurchasesState();
    }

    public final PurchasesStateCache copy(PurchasesState purchasesState) {
        q.f(purchasesState, "purchasesState");
        return new PurchasesStateCache(purchasesState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurchasesStateCache) && q.b(getPurchasesState(), ((PurchasesStateCache) obj).getPurchasesState());
    }

    @Override // com.revenuecat.purchases.PurchasesStateProvider
    public synchronized PurchasesState getPurchasesState() {
        return this.purchasesState;
    }

    public int hashCode() {
        return getPurchasesState().hashCode();
    }

    public synchronized void setPurchasesState(PurchasesState purchasesState) {
        q.f(purchasesState, "<set-?>");
        this.purchasesState = purchasesState;
    }

    public String toString() {
        return "PurchasesStateCache(purchasesState=" + getPurchasesState() + ')';
    }
}
