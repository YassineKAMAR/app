package com.revenuecat.purchases.common;

import com.android.billingclient.api.Purchase;
import f6.w;
import java.util.List;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class PurchaseExtensionsKt {
    public static final String getFirstProductId(Purchase purchase) {
        q.f(purchase, "<this>");
        String str = purchase.c().get(0);
        String str2 = str;
        if (purchase.c().size() > 1) {
            LogWrapperKt.log(LogIntent.GOOGLE_WARNING, "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.");
        }
        q.e(str, "products[0].also {\n     …_ONE_SKU)\n        }\n    }");
        return str2;
    }

    public static final String toHumanReadableDescription(Purchase purchase) {
        q.f(purchase, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("productIds: ");
        List<String> listC = purchase.c();
        q.e(listC, "this.products");
        sb.append(w.G(listC, null, "[", "]", 0, null, null, 57, null));
        sb.append(", orderId: ");
        sb.append(purchase.a());
        sb.append(", purchaseToken: ");
        sb.append(purchase.f());
        return sb.toString();
    }
}
