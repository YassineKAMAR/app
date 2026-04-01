package com.revenuecat.purchases;

import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public class PurchasesException extends Exception {
    private final PurchasesError error;

    public PurchasesException(PurchasesError error) {
        q.f(error, "error");
        this.error = error;
    }

    public final PurchasesErrorCode getCode() {
        return this.error.getCode();
    }

    public final PurchasesError getError() {
        return this.error;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.error.getMessage();
    }

    public final String getUnderlyingErrorMessage() {
        return this.error.getUnderlyingErrorMessage();
    }
}
