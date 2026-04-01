package com.revenuecat.purchases.common;

import com.revenuecat.purchases.common.networking.HTTPResult;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class BackendHelperKt {
    public static final boolean isSuccessful(HTTPResult hTTPResult) {
        q.f(hTTPResult, "<this>");
        return hTTPResult.getResponseCode() < 300;
    }
}
