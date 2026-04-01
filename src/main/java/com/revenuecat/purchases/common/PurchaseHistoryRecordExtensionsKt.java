package com.revenuecat.purchases.common;

import com.android.billingclient.api.PurchaseHistoryRecord;
import f6.w;
import java.util.ArrayList;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class PurchaseHistoryRecordExtensionsKt {
    public static final String getFirstSku(PurchaseHistoryRecord purchaseHistoryRecord) {
        q.f(purchaseHistoryRecord, "<this>");
        String str = purchaseHistoryRecord.f().get(0);
        String str2 = str;
        if (purchaseHistoryRecord.f().size() > 1) {
            LogWrapperKt.log(LogIntent.GOOGLE_WARNING, "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.");
        }
        q.e(str, "skus[0].also {\n        i…_ONE_SKU)\n        }\n    }");
        return str2;
    }

    public static final ArrayList<String> getListOfSkus(PurchaseHistoryRecord purchaseHistoryRecord) {
        q.f(purchaseHistoryRecord, "<this>");
        ArrayList<String> arrayListF = purchaseHistoryRecord.f();
        q.e(arrayListF, "this.skus");
        return arrayListF;
    }

    public static final String toHumanReadableDescription(PurchaseHistoryRecord purchaseHistoryRecord) {
        q.f(purchaseHistoryRecord, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("skus: ");
        ArrayList<String> arrayListF = purchaseHistoryRecord.f();
        q.e(arrayListF, "this.skus");
        sb.append(w.G(arrayListF, null, "[", "]", 0, null, null, 57, null));
        sb.append(", purchaseTime: ");
        sb.append(purchaseHistoryRecord.c());
        sb.append(", purchaseToken: ");
        sb.append(purchaseHistoryRecord.d());
        return sb.toString();
    }
}
