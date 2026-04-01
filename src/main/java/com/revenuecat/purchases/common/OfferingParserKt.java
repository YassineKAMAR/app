package com.revenuecat.purchases.common;

import com.revenuecat.purchases.PackageType;
import kotlin.jvm.internal.q;
import w6.v;

/* JADX INFO: loaded from: classes.dex */
public final class OfferingParserKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageType toPackageType(String str) {
        PackageType packageType;
        PackageType[] packageTypeArrValues = PackageType.values();
        int length = packageTypeArrValues.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                packageType = null;
                break;
            }
            packageType = packageTypeArrValues[i8];
            if (q.b(packageType.getIdentifier(), str)) {
                break;
            }
            i8++;
        }
        return packageType == null ? v.u(str, "$rc_", false, 2, null) ? PackageType.UNKNOWN : PackageType.CUSTOM : packageType;
    }
}
