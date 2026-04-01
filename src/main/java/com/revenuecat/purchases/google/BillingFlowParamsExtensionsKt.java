package com.revenuecat.purchases.google;

import com.android.billingclient.api.e;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class BillingFlowParamsExtensionsKt {
    public static final void setUpgradeInfo(e.a aVar, ReplaceProductInfo replaceProductInfo) {
        q.f(aVar, "<this>");
        q.f(replaceProductInfo, "replaceProductInfo");
        e.c.a aVarA = e.c.a();
        aVarA.b(replaceProductInfo.getOldPurchase().getPurchaseToken());
        ReplacementMode replacementMode = replaceProductInfo.getReplacementMode();
        if (replacementMode != null) {
            GoogleReplacementMode googleReplacementMode = replacementMode instanceof GoogleReplacementMode ? (GoogleReplacementMode) replacementMode : null;
            if (googleReplacementMode == null) {
                LogUtilsKt.errorLog$default("Got non-Google replacement mode", null, 2, null);
            } else {
                aVarA.f(googleReplacementMode.getPlayBillingClientMode());
            }
        }
        q.e(aVarA, "newBuilder().apply {\n   …        }\n        }\n    }");
        aVar.e(aVarA.a());
    }
}
