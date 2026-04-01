package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.common.offerings.OfferingsFactory;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.OfferingStrings;
import e6.i0;
import f6.k0;
import f6.q0;
import f6.w;
import i7.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p6.l;
import w6.v;

/* JADX INFO: loaded from: classes.dex */
public final class OfferingsFactory {
    private final BillingAbstract billing;
    private final Dispatcher dispatcher;
    private final OfferingParser offeringParser;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$createOfferings$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<Map<String, ? extends List<? extends StoreProduct>>, i0> {
        final /* synthetic */ Set<String> $allRequestedProductIdentifiers;
        final /* synthetic */ JSONObject $offeringsJSON;
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<Offerings, i0> $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Set<String> set, JSONObject jSONObject, l<? super PurchasesError, i0> lVar, l<? super Offerings, i0> lVar2) {
            super(1);
            this.$allRequestedProductIdentifiers = set;
            this.$offeringsJSON = jSONObject;
            this.$onError = lVar;
            this.$onSuccess = lVar2;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends List<? extends StoreProduct>> map) throws Exception {
            invoke2(map);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, ? extends List<? extends StoreProduct>> productsById) throws Exception {
            q.f(productsById, "productsById");
            try {
                OfferingsFactory.this.logMissingProducts(this.$allRequestedProductIdentifiers, productsById);
                Offerings offeringsCreateOfferings = OfferingsFactory.this.offeringParser.createOfferings(this.$offeringsJSON, productsById);
                if (offeringsCreateOfferings.getAll().isEmpty()) {
                    this.$onError.invoke(new PurchasesError(PurchasesErrorCode.ConfigurationError, OfferingStrings.CONFIGURATION_ERROR_PRODUCTS_NOT_FOUND));
                } else {
                    this.$onSuccess.invoke(offeringsCreateOfferings);
                }
            } catch (Exception e8) {
                if (!(e8 instanceof JSONException ? true : e8 instanceof i)) {
                    throw e8;
                }
                LogIntent logIntent = LogIntent.RC_ERROR;
                String str = String.format(OfferingStrings.JSON_EXCEPTION_ERROR, Arrays.copyOf(new Object[]{e8.getLocalizedMessage()}, 1));
                q.e(str, "format(this, *args)");
                LogWrapperKt.log(logIntent, str);
                this.$onError.invoke(new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, e8.getLocalizedMessage()));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$createOfferings$2, reason: invalid class name */
    static final class AnonymousClass2 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(l<? super PurchasesError, i0> lVar) {
            super(1);
            this.$onError = lVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError error) {
            q.f(error, "error");
            this.$onError.invoke(error);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$getStoreProductsById$1, reason: invalid class name and case insensitive filesystem */
    static final class C02501 extends r implements l<List<? extends StoreProduct>, i0> {
        final /* synthetic */ l<Map<String, ? extends List<? extends StoreProduct>>, i0> $onCompleted;
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ Set<String> $productIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02501(Set<String> set, l<? super Map<String, ? extends List<? extends StoreProduct>>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
            super(1);
            this.$productIds = set;
            this.$onCompleted = lVar;
            this.$onError = lVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1(List subscriptionProducts, Set productIds, OfferingsFactory this$0, l onCompleted, l onError) {
            q.f(subscriptionProducts, "$subscriptionProducts");
            q.f(productIds, "$productIds");
            q.f(this$0, "this$0");
            q.f(onCompleted, "$onCompleted");
            q.f(onError, "$onError");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : subscriptionProducts) {
                String productId = ((StoreProduct) obj).getPurchasingData().getProductId();
                Object arrayList = linkedHashMap.get(productId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(productId, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            Map mapT = k0.t(linkedHashMap);
            Set<String> setE = q0.e(productIds, mapT.keySet());
            if (!setE.isEmpty()) {
                this$0.billing.queryProductDetailsAsync(ProductType.INAPP, setE, new OfferingsFactory$getStoreProductsById$1$1$1(this$0, mapT, onCompleted), new OfferingsFactory$getStoreProductsById$1$1$2(onError));
            } else {
                onCompleted.invoke(mapT);
            }
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreProduct> list) {
            invoke2(list);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(final List<? extends StoreProduct> subscriptionProducts) {
            q.f(subscriptionProducts, "subscriptionProducts");
            Dispatcher dispatcher = OfferingsFactory.this.dispatcher;
            final Set<String> set = this.$productIds;
            final OfferingsFactory offeringsFactory = OfferingsFactory.this;
            final l<Map<String, ? extends List<? extends StoreProduct>>, i0> lVar = this.$onCompleted;
            final l<PurchasesError, i0> lVar2 = this.$onError;
            Dispatcher.enqueue$default(dispatcher, new Runnable() { // from class: com.revenuecat.purchases.common.offerings.a
                @Override // java.lang.Runnable
                public final void run() {
                    OfferingsFactory.C02501.invoke$lambda$1(subscriptionProducts, set, offeringsFactory, lVar, lVar2);
                }
            }, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$getStoreProductsById$2, reason: invalid class name and case insensitive filesystem */
    static final class C02512 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02512(l<? super PurchasesError, i0> lVar) {
            super(1);
            this.$onError = lVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError it) {
            q.f(it, "it");
            this.$onError.invoke(it);
        }
    }

    public OfferingsFactory(BillingAbstract billing, OfferingParser offeringParser, Dispatcher dispatcher) {
        q.f(billing, "billing");
        q.f(offeringParser, "offeringParser");
        q.f(dispatcher, "dispatcher");
        this.billing = billing;
        this.offeringParser = offeringParser;
        this.dispatcher = dispatcher;
    }

    private final Set<String> extractProductIdentifiers(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("offerings");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            JSONArray jSONArray2 = jSONArray.getJSONObject(i8).getJSONArray("packages");
            int length2 = jSONArray2.length();
            for (int i9 = 0; i9 < length2; i9++) {
                String it = jSONArray2.getJSONObject(i9).optString("platform_product_identifier");
                q.e(it, "it");
                if (!(!v.p(it))) {
                    it = null;
                }
                if (it != null) {
                    linkedHashSet.add(it);
                }
            }
        }
        return linkedHashSet;
    }

    private final void getStoreProductsById(Set<String> set, l<? super Map<String, ? extends List<? extends StoreProduct>>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        this.billing.queryProductDetailsAsync(ProductType.SUBS, set, new C02501(set, lVar, lVar2), new C02512(lVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i0 logMissingProducts(Set<String> set, Map<String, ? extends List<? extends StoreProduct>> map) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!map.containsKey((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList.isEmpty() ^ true ? arrayList : null;
        if (arrayList2 == null) {
            return null;
        }
        LogIntent logIntent = LogIntent.GOOGLE_WARNING;
        String str = String.format(OfferingStrings.CANNOT_FIND_PRODUCT_CONFIGURATION_ERROR, Arrays.copyOf(new Object[]{w.G(arrayList2, ", ", null, null, 0, null, null, 62, null)}, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        return i0.f21430a;
    }

    public final void createOfferings(JSONObject offeringsJSON, l<? super PurchasesError, i0> onError, l<? super Offerings, i0> onSuccess) {
        q.f(offeringsJSON, "offeringsJSON");
        q.f(onError, "onError");
        q.f(onSuccess, "onSuccess");
        try {
            Set<String> setExtractProductIdentifiers = extractProductIdentifiers(offeringsJSON);
            if (setExtractProductIdentifiers.isEmpty()) {
                onError.invoke(new PurchasesError(PurchasesErrorCode.ConfigurationError, OfferingStrings.CONFIGURATION_ERROR_NO_PRODUCTS_FOR_OFFERINGS));
            } else {
                getStoreProductsById(setExtractProductIdentifiers, new AnonymousClass1(setExtractProductIdentifiers, offeringsJSON, onError, onSuccess), new AnonymousClass2(onError));
            }
        } catch (JSONException e8) {
            LogIntent logIntent = LogIntent.RC_ERROR;
            String str = String.format(OfferingStrings.JSON_EXCEPTION_ERROR, Arrays.copyOf(new Object[]{e8.getLocalizedMessage()}, 1));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            onError.invoke(new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, e8.getLocalizedMessage()));
        }
    }
}
