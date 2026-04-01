package com.revenuecat.purchases;

import e6.p;

/* JADX INFO: loaded from: classes.dex */
public enum PostReceiptInitiationSource {
    RESTORE,
    PURCHASE,
    UNSYNCED_ACTIVE_PURCHASES;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostReceiptInitiationSource.values().length];
            try {
                iArr[PostReceiptInitiationSource.RESTORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostReceiptInitiationSource.PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final String getPostReceiptFieldValue() {
        int i8 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i8 == 1) {
            return "restore";
        }
        if (i8 == 2) {
            return "purchase";
        }
        if (i8 == 3) {
            return "unsynced_active_purchases";
        }
        throw new p();
    }
}
