package com.revenuecat.purchases.google;

import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class BillingResultExtensionsKt {
    public static final boolean isSuccessful(com.android.billingclient.api.f fVar) {
        q.f(fVar, "<this>");
        return fVar.b() == 0;
    }

    public static final String toHumanReadableDescription(com.android.billingclient.api.f fVar) {
        q.f(fVar, "<this>");
        return "DebugMessage: " + fVar.a() + ". ErrorCode: " + ErrorsKt.getBillingResponseCodeName(fVar.b()) + '.';
    }
}
