package com.revenuecat.purchases.common.verification;

import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class InvalidSignatureSizeException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidSignatureSizeException(String message) {
        super(message);
        q.f(message, "message");
    }
}
