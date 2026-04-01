package com.revenuecat.purchases;

import e6.p;

/* JADX INFO: loaded from: classes.dex */
public enum VerificationResult {
    NOT_REQUESTED,
    VERIFIED,
    FAILED,
    VERIFIED_ON_DEVICE;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationResult.values().length];
            try {
                iArr[VerificationResult.VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationResult.VERIFIED_ON_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationResult.NOT_REQUESTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VerificationResult.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final boolean isVerified() {
        int i8 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i8 == 1 || i8 == 2) {
            return true;
        }
        if (i8 == 3 || i8 == 4) {
            return false;
        }
        throw new p();
    }
}
