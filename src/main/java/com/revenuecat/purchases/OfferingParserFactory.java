package com.revenuecat.purchases;

import com.revenuecat.purchases.amazon.AmazonOfferingParser;
import com.revenuecat.purchases.common.GoogleOfferingParser;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.OfferingParser;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class OfferingParserFactory {
    public static final OfferingParserFactory INSTANCE = new OfferingParserFactory();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.PLAY_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Store.AMAZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private OfferingParserFactory() {
    }

    public final OfferingParser createOfferingParser(Store store) {
        q.f(store, "store");
        int i8 = WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
        if (i8 == 1) {
            return new GoogleOfferingParser();
        }
        if (i8 == 2) {
            try {
                int i9 = AmazonOfferingParser.f20870a;
                Object objNewInstance = AmazonOfferingParser.class.getConstructor(new Class[0]).newInstance(new Object[0]);
                q.d(objNewInstance, "null cannot be cast to non-null type com.revenuecat.purchases.common.OfferingParser");
                return (OfferingParser) objNewInstance;
            } catch (ClassNotFoundException e8) {
                LogUtilsKt.errorLog("Make sure purchases-amazon is added as dependency", e8);
                throw e8;
            }
        }
        LogUtilsKt.errorLog$default("Incompatible store (" + store + ") used", null, 2, null);
        throw new IllegalArgumentException("Couldn't configure SDK. Incompatible store (" + store + ") used");
    }
}
