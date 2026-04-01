package com.revenuecat.purchases;

import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class PurchasesTransactionException extends PurchasesException {
    private final boolean userCancelled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesTransactionException(PurchasesError purchasesError, boolean z7) {
        super(purchasesError);
        q.f(purchasesError, "purchasesError");
        this.userCancelled = z7;
    }

    public final boolean getUserCancelled() {
        return this.userCancelled;
    }
}
