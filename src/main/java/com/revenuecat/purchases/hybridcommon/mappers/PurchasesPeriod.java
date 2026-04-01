package com.revenuecat.purchases.hybridcommon.mappers;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class PurchasesPeriod {
    final int days;
    final int months;
    final int years;
    private static final PurchasesPeriod ZERO = new PurchasesPeriod(0, 0, 0);
    private static final Pattern PATTERN = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);

    private PurchasesPeriod(int i8, int i9, int i10) {
        this.years = i8;
        this.months = i9;
        this.days = i10;
    }

    private static PurchasesPeriod create(int i8, int i9, int i10) {
        return ((i8 | i9) | i10) == 0 ? ZERO : new PurchasesPeriod(i8, i9, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.revenuecat.purchases.hybridcommon.mappers.PurchasesPeriod parse(java.lang.CharSequence r9) {
        /*
            java.util.regex.Pattern r0 = com.revenuecat.purchases.hybridcommon.mappers.PurchasesPeriod.PATTERN
            java.util.regex.Matcher r0 = r0.matcher(r9)
            boolean r1 = r0.matches()
            r2 = 0
            java.lang.String r3 = "Text cannot be parsed to a Period: "
            java.lang.String r4 = "PURCHASES"
            if (r1 == 0) goto L6c
            r1 = 1
            java.lang.String r5 = r0.group(r1)
            java.lang.String r6 = "-"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L1f
            r1 = -1
        L1f:
            r5 = 2
            java.lang.String r5 = r0.group(r5)
            r6 = 3
            java.lang.String r6 = r0.group(r6)
            r7 = 4
            java.lang.String r7 = r0.group(r7)
            r8 = 5
            java.lang.String r0 = r0.group(r8)
            if (r5 != 0) goto L3b
            if (r6 != 0) goto L3b
            if (r0 != 0) goto L3b
            if (r7 == 0) goto L6c
        L3b:
            int r5 = parseNumber(r9, r5, r1)     // Catch: java.lang.Throwable -> L59
            int r6 = parseNumber(r9, r6, r1)     // Catch: java.lang.Throwable -> L59
            int r7 = parseNumber(r9, r7, r1)     // Catch: java.lang.Throwable -> L59
            int r0 = parseNumber(r9, r0, r1)     // Catch: java.lang.Throwable -> L59
            r1 = 7
            int r1 = com.revenuecat.purchases.hybridcommon.mappers.PurchasesMath.multiplyExact(r7, r1)     // Catch: java.lang.Throwable -> L59
            int r0 = com.revenuecat.purchases.hybridcommon.mappers.PurchasesMath.addExact(r0, r1)     // Catch: java.lang.Throwable -> L59
            com.revenuecat.purchases.hybridcommon.mappers.PurchasesPeriod r9 = create(r5, r6, r0)     // Catch: java.lang.Throwable -> L59
            return r9
        L59:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L5e:
            r0.append(r3)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            android.util.Log.e(r4, r9)
            return r2
        L6c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.hybridcommon.mappers.PurchasesPeriod.parse(java.lang.CharSequence):com.revenuecat.purchases.hybridcommon.mappers.PurchasesPeriod");
    }

    private static int parseNumber(CharSequence charSequence, String str, int i8) {
        if (str == null) {
            return 0;
        }
        return PurchasesMath.multiplyExact(Integer.parseInt(str), i8);
    }
}
