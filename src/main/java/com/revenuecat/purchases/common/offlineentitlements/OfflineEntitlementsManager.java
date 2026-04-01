package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import e6.i0;
import e6.r;
import e6.x;
import f6.n;
import f6.o;
import f6.w;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
public final class OfflineEntitlementsManager {
    private CustomerInfo _offlineCustomerInfo;
    private final AppConfig appConfig;
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final OfflineCustomerInfoCalculator offlineCustomerInfoCalculator;
    private final Map<String, List<r<l<CustomerInfo, i0>, l<PurchasesError, i0>>>> offlineCustomerInfoCallbackCache;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.jvm.internal.r implements l<CustomerInfo, i0> {
        final /* synthetic */ String $appUserId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str) {
            super(1);
            this.$appUserId = str;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo customerInfo) {
            q.f(customerInfo, "customerInfo");
            OfflineEntitlementsManager offlineEntitlementsManager = OfflineEntitlementsManager.this;
            String str = this.$appUserId;
            synchronized (offlineEntitlementsManager) {
                LogUtilsKt.warnLog(OfflineEntitlementsStrings.USING_OFFLINE_ENTITLEMENTS_CUSTOMER_INFO);
                offlineEntitlementsManager._offlineCustomerInfo = customerInfo;
                String cachedAppUserID = offlineEntitlementsManager.deviceCache.getCachedAppUserID();
                if (cachedAppUserID != null) {
                    offlineEntitlementsManager.deviceCache.clearCustomerInfoCache(cachedAppUserID);
                }
                List list = (List) offlineEntitlementsManager.offlineCustomerInfoCallbackCache.remove(str);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((l) ((r) it.next()).a()).invoke(customerInfo);
                    }
                }
                i0 i0Var = i0.f21430a;
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$3, reason: invalid class name */
    static final class AnonymousClass3 extends kotlin.jvm.internal.r implements l<PurchasesError, i0> {
        final /* synthetic */ String $appUserId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str) {
            super(1);
            this.$appUserId = str;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError it) {
            q.f(it, "it");
            OfflineEntitlementsManager offlineEntitlementsManager = OfflineEntitlementsManager.this;
            String str = this.$appUserId;
            synchronized (offlineEntitlementsManager) {
                List list = (List) offlineEntitlementsManager.offlineCustomerInfoCallbackCache.remove(str);
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((l) ((r) it2.next()).b()).invoke(it);
                    }
                }
                i0 i0Var = i0.f21430a;
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.jvm.internal.r implements l<ProductEntitlementMapping, i0> {
        final /* synthetic */ l<PurchasesError, i0> $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super PurchasesError, i0> lVar) {
            super(1);
            this.$completion = lVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(ProductEntitlementMapping productEntitlementMapping) {
            invoke2(productEntitlementMapping);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ProductEntitlementMapping productEntitlementMapping) {
            q.f(productEntitlementMapping, "productEntitlementMapping");
            OfflineEntitlementsManager.this.deviceCache.cacheProductEntitlementMapping(productEntitlementMapping);
            LogUtilsKt.debugLog(OfflineEntitlementsStrings.SUCCESSFULLY_UPDATED_PRODUCT_ENTITLEMENTS);
            l<PurchasesError, i0> lVar = this.$completion;
            if (lVar != null) {
                lVar.invoke(null);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$2, reason: invalid class name and case insensitive filesystem */
    static final class C02562 extends kotlin.jvm.internal.r implements l<PurchasesError, i0> {
        final /* synthetic */ l<PurchasesError, i0> $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02562(l<? super PurchasesError, i0> lVar) {
            super(1);
            this.$completion = lVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError e8) {
            q.f(e8, "e");
            String str = String.format(OfflineEntitlementsStrings.ERROR_UPDATING_PRODUCT_ENTITLEMENTS, Arrays.copyOf(new Object[]{e8}, 1));
            q.e(str, "format(this, *args)");
            LogUtilsKt.errorLog$default(str, null, 2, null);
            l<PurchasesError, i0> lVar = this.$completion;
            if (lVar != null) {
                lVar.invoke(e8);
            }
        }
    }

    public OfflineEntitlementsManager(Backend backend, OfflineCustomerInfoCalculator offlineCustomerInfoCalculator, DeviceCache deviceCache, AppConfig appConfig) {
        q.f(backend, "backend");
        q.f(offlineCustomerInfoCalculator, "offlineCustomerInfoCalculator");
        q.f(deviceCache, "deviceCache");
        q.f(appConfig, "appConfig");
        this.backend = backend;
        this.offlineCustomerInfoCalculator = offlineCustomerInfoCalculator;
        this.deviceCache = deviceCache;
        this.appConfig = appConfig;
        this.offlineCustomerInfoCallbackCache = new LinkedHashMap();
    }

    private final boolean isOfflineEntitlementsEnabled() {
        return this.appConfig.getFinishTransactions() && this.appConfig.getEnableOfflineEntitlements() && !this.appConfig.getCustomEntitlementComputation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateProductEntitlementMappingCacheIfStale$default(OfflineEntitlementsManager offlineEntitlementsManager, l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            lVar = null;
        }
        offlineEntitlementsManager.updateProductEntitlementMappingCacheIfStale(lVar);
    }

    public final void calculateAndCacheOfflineCustomerInfo(String appUserId, l<? super CustomerInfo, i0> onSuccess, l<? super PurchasesError, i0> onError) {
        q.f(appUserId, "appUserId");
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        if (!this.appConfig.getEnableOfflineEntitlements()) {
            onError.invoke(new PurchasesError(PurchasesErrorCode.UnsupportedError, OfflineEntitlementsStrings.OFFLINE_ENTITLEMENTS_NOT_ENABLED));
            return;
        }
        synchronized (this) {
            boolean zContainsKey = this.offlineCustomerInfoCallbackCache.containsKey(appUserId);
            List<r<l<CustomerInfo, i0>, l<PurchasesError, i0>>> listD = this.offlineCustomerInfoCallbackCache.get(appUserId);
            if (listD == null) {
                listD = o.d();
            }
            this.offlineCustomerInfoCallbackCache.put(appUserId, w.K(listD, n.b(x.a(onSuccess, onError))));
            if (!zContainsKey) {
                i0 i0Var = i0.f21430a;
                this.offlineCustomerInfoCalculator.computeOfflineCustomerInfo(appUserId, new AnonymousClass2(appUserId), new AnonymousClass3(appUserId));
            } else {
                String str = String.format(OfflineEntitlementsStrings.ALREADY_CALCULATING_OFFLINE_CUSTOMER_INFO, Arrays.copyOf(new Object[]{appUserId}, 1));
                q.e(str, "format(this, *args)");
                LogUtilsKt.debugLog(str);
            }
        }
    }

    public final CustomerInfo getOfflineCustomerInfo() {
        return this._offlineCustomerInfo;
    }

    public final synchronized void resetOfflineCustomerInfoCache() {
        if (this._offlineCustomerInfo != null) {
            LogUtilsKt.debugLog(OfflineEntitlementsStrings.RESETTING_OFFLINE_CUSTOMER_INFO_CACHE);
            this._offlineCustomerInfo = null;
        }
    }

    public final boolean shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest(boolean z7, String appUserId) {
        q.f(appUserId, "appUserId");
        return z7 && isOfflineEntitlementsEnabled() && this.deviceCache.getCachedCustomerInfo(appUserId) == null;
    }

    public final boolean shouldCalculateOfflineCustomerInfoInPostReceipt(boolean z7) {
        return z7 && isOfflineEntitlementsEnabled();
    }

    public final void updateProductEntitlementMappingCacheIfStale(l<? super PurchasesError, i0> lVar) {
        if (isOfflineEntitlementsEnabled() && this.deviceCache.isProductEntitlementMappingCacheStale()) {
            LogUtilsKt.debugLog(OfflineEntitlementsStrings.UPDATING_PRODUCT_ENTITLEMENT_MAPPING);
            this.backend.getProductEntitlementMapping(new AnonymousClass1(lVar), new C02562(lVar));
        } else if (lVar != null) {
            lVar.invoke(null);
        }
    }
}
