package com.revenuecat.purchases.google;

import com.revenuecat.purchases.models.PurchaseState;
import e6.p;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class PurchaseStateConversionsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchaseState.values().length];
            try {
                iArr[PurchaseState.UNSPECIFIED_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseState.PURCHASED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseState.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int toGooglePurchaseState(PurchaseState purchaseState) {
        q.f(purchaseState, "<this>");
        int i8 = WhenMappings.$EnumSwitchMapping$0[purchaseState.ordinal()];
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 1;
        }
        if (i8 == 3) {
            return 2;
        }
        throw new p();
    }

    public static final PurchaseState toRevenueCatPurchaseState(int i8) {
        if (i8 != 0) {
            if (i8 == 1) {
                return PurchaseState.PURCHASED;
            }
            if (i8 == 2) {
                return PurchaseState.PENDING;
            }
        }
        return PurchaseState.UNSPECIFIED_STATE;
    }
}
