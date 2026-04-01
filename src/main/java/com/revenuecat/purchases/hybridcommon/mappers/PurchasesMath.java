package com.revenuecat.purchases.hybridcommon.mappers;

/* JADX INFO: loaded from: classes.dex */
class PurchasesMath {
    PurchasesMath() {
    }

    static int addExact(int i8, int i9) {
        int i10 = i8 + i9;
        if (((i8 ^ i10) & (i9 ^ i10)) >= 0) {
            return i10;
        }
        throw new ArithmeticException("integer overflow");
    }

    static int multiplyExact(int i8, int i9) {
        long j8 = ((long) i8) * ((long) i9);
        int i10 = (int) j8;
        if (i10 == j8) {
            return i10;
        }
        throw new ArithmeticException("integer overflow");
    }
}
