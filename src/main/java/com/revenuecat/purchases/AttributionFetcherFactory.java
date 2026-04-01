package com.revenuecat.purchases;

import com.revenuecat.purchases.amazon.attribution.AmazonDeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class AttributionFetcherFactory {
    public static final AttributionFetcherFactory INSTANCE = new AttributionFetcherFactory();

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

    private AttributionFetcherFactory() {
    }

    public final DeviceIdentifiersFetcher createAttributionFetcher(Store store, Dispatcher dispatcher) {
        q.f(store, "store");
        q.f(dispatcher, "dispatcher");
        int i8 = WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
        if (i8 == 1) {
            return new GoogleDeviceIdentifiersFetcher(dispatcher);
        }
        if (i8 == 2) {
            try {
                Object objNewInstance = AmazonDeviceIdentifiersFetcher.class.getConstructor(new Class[0]).newInstance(new Object[0]);
                q.d(objNewInstance, "null cannot be cast to non-null type com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher");
                return (DeviceIdentifiersFetcher) objNewInstance;
            } catch (ClassNotFoundException e8) {
                LogUtilsKt.errorLog("Make sure purchases-amazon is added as dependency", e8);
                throw e8;
            }
        }
        LogUtilsKt.errorLog$default("Incompatible store (" + store + ") used", null, 2, null);
        throw new IllegalArgumentException("Couldn't configure SDK. Incompatible store (" + store + ") used");
    }
}
