package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import e6.i0;
import f6.o;
import f6.p;
import f6.w;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
public final class PurchasedProductsFetcher {
    private final BillingAbstract billing;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.SUBS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.PurchasedProductsFetcher$queryActiveProducts$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<Map<String, ? extends StoreTransaction>, i0> {
        final /* synthetic */ l<List<PurchasedProduct>, i0> $onSuccess;
        final /* synthetic */ ProductEntitlementMapping $productEntitlementMapping;
        final /* synthetic */ PurchasedProductsFetcher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super List<PurchasedProduct>, i0> lVar, PurchasedProductsFetcher purchasedProductsFetcher, ProductEntitlementMapping productEntitlementMapping) {
            super(1);
            this.$onSuccess = lVar;
            this.this$0 = purchasedProductsFetcher;
            this.$productEntitlementMapping = productEntitlementMapping;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends StoreTransaction> map) {
            invoke2((Map<String, StoreTransaction>) map);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, StoreTransaction> activePurchasesByHashedToken) {
            q.f(activePurchasesByHashedToken, "activePurchasesByHashedToken");
            List listU = w.U(activePurchasesByHashedToken.values());
            PurchasedProductsFetcher purchasedProductsFetcher = this.this$0;
            ProductEntitlementMapping productEntitlementMapping = this.$productEntitlementMapping;
            ArrayList arrayList = new ArrayList(p.m(listU, 10));
            Iterator it = listU.iterator();
            while (it.hasNext()) {
                arrayList.add(purchasedProductsFetcher.createPurchasedProduct((StoreTransaction) it.next(), productEntitlementMapping));
            }
            this.$onSuccess.invoke(arrayList);
        }
    }

    public PurchasedProductsFetcher(DeviceCache deviceCache, BillingAbstract billing, DateProvider dateProvider) {
        q.f(deviceCache, "deviceCache");
        q.f(billing, "billing");
        q.f(dateProvider, "dateProvider");
        this.deviceCache = deviceCache;
        this.billing = billing;
        this.dateProvider = dateProvider;
    }

    public /* synthetic */ PurchasedProductsFetcher(DeviceCache deviceCache, BillingAbstract billingAbstract, DateProvider dateProvider, int i8, j jVar) {
        this(deviceCache, billingAbstract, (i8 & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PurchasedProduct createPurchasedProduct(StoreTransaction storeTransaction, ProductEntitlementMapping productEntitlementMapping) {
        List<String> listD;
        Date expirationDate = getExpirationDate(storeTransaction);
        String str = (String) w.z(storeTransaction.getProductIds());
        ProductEntitlementMapping.Mapping mapping = productEntitlementMapping.getMappings().get(str);
        String basePlanId = mapping != null ? mapping.getBasePlanId() : null;
        if (mapping == null || (listD = mapping.getEntitlements()) == null) {
            listD = o.d();
        }
        return new PurchasedProduct(str, basePlanId, storeTransaction, listD, expirationDate);
    }

    private final Date getExpirationDate(StoreTransaction storeTransaction) {
        if (WhenMappings.$EnumSwitchMapping$0[storeTransaction.getType().ordinal()] == 1) {
            return new Date(this.dateProvider.getNow().getTime() + TimeUnit.DAYS.toMillis(1L));
        }
        return null;
    }

    public final void queryActiveProducts(String appUserID, l<? super List<PurchasedProduct>, i0> onSuccess, l<? super PurchasesError, i0> onError) {
        q.f(appUserID, "appUserID");
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        ProductEntitlementMapping productEntitlementMapping = this.deviceCache.getProductEntitlementMapping();
        if (productEntitlementMapping == null) {
            onError.invoke(new PurchasesError(PurchasesErrorCode.CustomerInfoError, OfflineEntitlementsStrings.PRODUCT_ENTITLEMENT_MAPPING_REQUIRED));
        } else {
            this.billing.queryPurchases(appUserID, new AnonymousClass1(onSuccess, this, productEntitlementMapping), onError);
        }
    }
}
