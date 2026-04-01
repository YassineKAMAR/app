package com.revenuecat.purchases;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.revenuecat.purchases.amazon.AmazonBilling;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingWrapper;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class BillingFactory {
    public static final BillingFactory INSTANCE = new BillingFactory();

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

    private BillingFactory() {
    }

    public final BillingAbstract createBilling(Store store, Application application, BackendHelper backendHelper, DeviceCache cache, boolean z7, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider stateProvider) {
        q.f(store, "store");
        q.f(application, "application");
        q.f(backendHelper, "backendHelper");
        q.f(cache, "cache");
        q.f(stateProvider, "stateProvider");
        int i8 = WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
        if (i8 == 1) {
            return new BillingWrapper(new BillingWrapper.ClientFactory(application), new Handler(application.getMainLooper()), cache, diagnosticsTracker, stateProvider, null, 32, null);
        }
        if (i8 == 2) {
            try {
                Context applicationContext = application.getApplicationContext();
                q.e(applicationContext, "application.applicationContext");
                return new AmazonBilling(applicationContext, cache, z7, new Handler(application.getMainLooper()), backendHelper, stateProvider);
            } catch (NoClassDefFoundError e8) {
                LogUtilsKt.errorLog("Make sure purchases-amazon is added as dependency", e8);
                throw e8;
            }
        }
        LogUtilsKt.errorLog$default("Incompatible store (" + store + ") used", null, 2, null);
        throw new IllegalArgumentException("Couldn't configure SDK. Incompatible store (" + store + ") used");
    }
}
