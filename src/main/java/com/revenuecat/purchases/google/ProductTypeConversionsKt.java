package com.revenuecat.purchases.google;

import com.revenuecat.purchases.ProductType;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class ProductTypeConversionsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.INAPP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.SUBS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String toGoogleProductType(ProductType productType) {
        q.f(productType, "<this>");
        int i8 = WhenMappings.$EnumSwitchMapping$0[productType.ordinal()];
        if (i8 == 1) {
            return "inapp";
        }
        if (i8 != 2) {
            return null;
        }
        return "subs";
    }

    public static final ProductType toRevenueCatProductType(String str) {
        return q.b(str, "inapp") ? ProductType.INAPP : q.b(str, "subs") ? ProductType.SUBS : ProductType.UNKNOWN;
    }
}
