package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.common.responses.EntitlementsResponseJsonKeys;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import com.revenuecat.purchases.utils.Iso8601Utils;
import e6.i0;
import e6.x;
import f6.j0;
import f6.p;
import f6.t;
import f6.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.json.JSONException;
import org.json.JSONObject;
import p6.l;
import x4.a;

/* JADX INFO: loaded from: classes.dex */
public final class OfflineCustomerInfoCalculator {
    private final AppConfig appConfig;
    private final DateProvider dateProvider;
    private final PurchasedProductsFetcher purchasedProductsFetcher;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineCustomerInfoCalculator$computeOfflineCustomerInfo$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<List<? extends PurchasedProduct>, i0> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<CustomerInfo, i0> $onSuccess;
        final /* synthetic */ OfflineCustomerInfoCalculator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super PurchasesError, i0> lVar, OfflineCustomerInfoCalculator offlineCustomerInfoCalculator, String str, l<? super CustomerInfo, i0> lVar2) {
            super(1);
            this.$onError = lVar;
            this.this$0 = offlineCustomerInfoCalculator;
            this.$appUserID = str;
            this.$onSuccess = lVar2;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(List<? extends PurchasedProduct> list) throws JSONException {
            invoke2((List<PurchasedProduct>) list);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<PurchasedProduct> purchasedProducts) throws JSONException {
            boolean z7;
            Object objBuildCustomerInfoUsingListOfPurchases;
            l lVar;
            q.f(purchasedProducts, "purchasedProducts");
            if ((purchasedProducts instanceof Collection) && purchasedProducts.isEmpty()) {
                z7 = false;
            } else {
                Iterator<T> it = purchasedProducts.iterator();
                while (it.hasNext()) {
                    if (((PurchasedProduct) it.next()).getStoreTransaction().getType() == ProductType.INAPP) {
                        z7 = true;
                        break;
                    }
                }
                z7 = false;
            }
            if (z7) {
                objBuildCustomerInfoUsingListOfPurchases = new PurchasesError(PurchasesErrorCode.UnsupportedError, OfflineEntitlementsStrings.OFFLINE_ENTITLEMENTS_UNSUPPORTED_INAPP_PURCHASES);
                String str = String.format(CustomerInfoStrings.COMPUTING_OFFLINE_CUSTOMER_INFO_FAILED, Arrays.copyOf(new Object[]{objBuildCustomerInfoUsingListOfPurchases}, 1));
                q.e(str, "format(this, *args)");
                LogUtilsKt.errorLog$default(str, null, 2, null);
                lVar = this.$onError;
            } else {
                objBuildCustomerInfoUsingListOfPurchases = this.this$0.buildCustomerInfoUsingListOfPurchases(this.$appUserID, purchasedProducts);
                lVar = this.$onSuccess;
            }
            lVar.invoke(objBuildCustomerInfoUsingListOfPurchases);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.OfflineCustomerInfoCalculator$computeOfflineCustomerInfo$2, reason: invalid class name */
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
            String str = String.format(CustomerInfoStrings.COMPUTING_OFFLINE_CUSTOMER_INFO_FAILED, Arrays.copyOf(new Object[]{error}, 1));
            q.e(str, "format(this, *args)");
            LogUtilsKt.errorLog$default(str, null, 2, null);
            this.$onError.invoke(error);
        }
    }

    public OfflineCustomerInfoCalculator(PurchasedProductsFetcher purchasedProductsFetcher, AppConfig appConfig, DateProvider dateProvider) {
        q.f(purchasedProductsFetcher, "purchasedProductsFetcher");
        q.f(appConfig, "appConfig");
        q.f(dateProvider, "dateProvider");
        this.purchasedProductsFetcher = purchasedProductsFetcher;
        this.appConfig = appConfig;
        this.dateProvider = dateProvider;
    }

    public /* synthetic */ OfflineCustomerInfoCalculator(PurchasedProductsFetcher purchasedProductsFetcher, AppConfig appConfig, DateProvider dateProvider, int i8, j jVar) {
        this(purchasedProductsFetcher, appConfig, (i8 & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomerInfo buildCustomerInfoUsingListOfPurchases(String str, List<PurchasedProduct> list) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Date now = this.dateProvider.getNow();
        String str2 = Iso8601Utils.format(now);
        jSONObject.put(CustomerInfoResponseJsonKeys.REQUEST_DATE, str2);
        jSONObject.put(CustomerInfoResponseJsonKeys.REQUEST_DATE_MS, now.getTime());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(CustomerInfoResponseJsonKeys.ORIGINAL_APP_USER_ID, str);
        jSONObject2.put(CustomerInfoResponseJsonKeys.ORIGINAL_APPLICATION_VERSION, "1.0");
        jSONObject2.put(CustomerInfoResponseJsonKeys.ENTITLEMENTS, generateEntitlementsResponse(list));
        jSONObject2.put(CustomerInfoResponseJsonKeys.FIRST_SEEN, str2);
        jSONObject2.put("original_purchase_date", calculateOriginalPurchaseDate(list));
        jSONObject2.put(CustomerInfoResponseJsonKeys.NON_SUBSCRIPTIONS, new JSONObject());
        jSONObject2.put(CustomerInfoResponseJsonKeys.SUBSCRIPTIONS, generateSubscriptions(list));
        jSONObject2.put(CustomerInfoResponseJsonKeys.MANAGEMENT_URL, determineManagementURL());
        i0 i0Var = i0.f21430a;
        jSONObject.put(CustomerInfoResponseJsonKeys.SUBSCRIBER, jSONObject2);
        return CustomerInfoFactory.INSTANCE.buildCustomerInfo(jSONObject, now, VerificationResult.VERIFIED_ON_DEVICE);
    }

    private final String calculateOriginalPurchaseDate(List<PurchasedProduct> list) {
        Long lValueOf;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            lValueOf = Long.valueOf(((PurchasedProduct) it.next()).getStoreTransaction().getPurchaseTime());
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((PurchasedProduct) it.next()).getStoreTransaction().getPurchaseTime());
                if (lValueOf.compareTo(lValueOf2) > 0) {
                    lValueOf = lValueOf2;
                }
            }
        } else {
            lValueOf = null;
        }
        Long l8 = lValueOf;
        if (l8 == null) {
            return null;
        }
        l8.longValue();
        return a.a(new Date(l8.longValue()));
    }

    private final Object determineManagementURL() {
        return this.appConfig.getStore() == Store.PLAY_STORE ? Constants.GOOGLE_PLAY_MANAGEMENT_URL : JSONObject.NULL;
    }

    private final JSONObject generateEntitlementsResponse(List<PurchasedProduct> list) throws JSONException {
        ArrayList<e6.r> arrayList = new ArrayList();
        for (PurchasedProduct purchasedProduct : list) {
            List<String> entitlements = purchasedProduct.getEntitlements();
            ArrayList arrayList2 = new ArrayList(p.m(entitlements, 10));
            Iterator<T> it = entitlements.iterator();
            while (it.hasNext()) {
                arrayList2.add(x.a((String) it.next(), purchasedProduct));
            }
            t.p(arrayList, arrayList2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (e6.r rVar : arrayList) {
            String str = (String) rVar.c();
            Object arrayList3 = linkedHashMap.get(str);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(str, arrayList3);
            }
            ((List) arrayList3).add((PurchasedProduct) rVar.d());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(j0.b(linkedHashMap.size()));
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (true) {
            Object next = null;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            List list2 = (List) entry.getValue();
            Iterator it3 = list2.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    Date expiresDate = ((PurchasedProduct) next).getExpiresDate();
                    long time = expiresDate != null ? expiresDate.getTime() : Long.MAX_VALUE;
                    do {
                        Object next2 = it3.next();
                        Date expiresDate2 = ((PurchasedProduct) next2).getExpiresDate();
                        long time2 = expiresDate2 != null ? expiresDate2.getTime() : Long.MAX_VALUE;
                        if (time < time2) {
                            next = next2;
                            time = time2;
                        }
                    } while (it3.hasNext());
                }
            }
            PurchasedProduct purchasedProduct2 = (PurchasedProduct) next;
            if (purchasedProduct2 == null) {
                purchasedProduct2 = (PurchasedProduct) w.z(list2);
            }
            linkedHashMap2.put(key, purchasedProduct2);
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            String str2 = (String) entry2.getKey();
            PurchasedProduct purchasedProduct3 = (PurchasedProduct) entry2.getValue();
            JSONObject jSONObject2 = new JSONObject();
            Date expiresDate3 = purchasedProduct3.getExpiresDate();
            jSONObject2.put("expires_date", expiresDate3 != null ? Iso8601Utils.format(expiresDate3) : null);
            jSONObject2.put(EntitlementsResponseJsonKeys.PRODUCT_IDENTIFIER, purchasedProduct3.getProductIdentifier());
            jSONObject2.put("purchase_date", Iso8601Utils.format(new Date(purchasedProduct3.getStoreTransaction().getPurchaseTime())));
            String basePlanId = purchasedProduct3.getBasePlanId();
            if (basePlanId != null) {
                jSONObject2.put("product_plan_identifier", basePlanId);
            }
            jSONObject.put(str2, jSONObject2);
        }
        return jSONObject;
    }

    private final JSONObject generateSubscriptions(List<PurchasedProduct> list) throws JSONException {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        for (PurchasedProduct purchasedProduct : list) {
            String productIdentifier = purchasedProduct.getProductIdentifier();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ProductResponseJsonKeys.BILLING_ISSUES_DETECTED_AT, JSONObject.NULL);
            jSONObject2.put(ProductResponseJsonKeys.IS_SANDBOX, false);
            Date date = new Date(purchasedProduct.getStoreTransaction().getPurchaseTime());
            jSONObject2.put("original_purchase_date", Iso8601Utils.format(date));
            jSONObject2.put("purchase_date", Iso8601Utils.format(date));
            String strName = this.appConfig.getStore().name();
            Locale locale = Locale.ROOT;
            String lowerCase = strName.toLowerCase(locale);
            q.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            jSONObject2.put(ProductResponseJsonKeys.STORE, lowerCase);
            jSONObject2.put(ProductResponseJsonKeys.UNSUBSCRIBE_DETECTED_AT, JSONObject.NULL);
            jSONObject2.put("product_plan_identifier", purchasedProduct.getBasePlanId());
            Date expiresDate = purchasedProduct.getExpiresDate();
            if (expiresDate == null || (obj = Iso8601Utils.format(expiresDate)) == null) {
                obj = JSONObject.NULL;
            }
            jSONObject2.put("expires_date", obj);
            String lowerCase2 = "NORMAL".toLowerCase(locale);
            q.e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            jSONObject2.put(ProductResponseJsonKeys.PERIOD_TYPE, lowerCase2);
            i0 i0Var = i0.f21430a;
            jSONObject.put(productIdentifier, jSONObject2);
        }
        return jSONObject;
    }

    public final void computeOfflineCustomerInfo(String appUserID, l<? super CustomerInfo, i0> onSuccess, l<? super PurchasesError, i0> onError) {
        q.f(appUserID, "appUserID");
        q.f(onSuccess, "onSuccess");
        q.f(onError, "onError");
        this.purchasedProductsFetcher.queryActiveProducts(appUserID, new AnonymousClass1(onError, this, appUserID, onSuccess), new AnonymousClass2(onError));
    }
}
