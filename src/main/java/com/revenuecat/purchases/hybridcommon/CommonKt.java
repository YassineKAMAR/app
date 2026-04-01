package com.revenuecat.purchases.hybridcommon;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.EntitlementVerificationMode;
import com.revenuecat.purchases.ListenerConversionsCommonKt;
import com.revenuecat.purchases.ListenerConversionsKt;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesConfiguration;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.hybridcommon.mappers.CustomerInfoMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.LogHandlerWithMapping;
import com.revenuecat.purchases.hybridcommon.mappers.MappedProductCategory;
import com.revenuecat.purchases.hybridcommon.mappers.OfferingsMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.StoreTransactionMapperKt;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.models.GoogleProrationMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import e6.i0;
import e6.x;
import f6.j0;
import f6.k0;
import f6.n;
import f6.w;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;
import p6.p;
import w6.v;

/* JADX INFO: loaded from: classes.dex */
public final class CommonKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getCustomerInfo$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError it) {
            q.f(it, "it");
            this.$onResult.onError(CommonKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getCustomerInfo$2, reason: invalid class name */
    static final class AnonymousClass2 extends r implements l<CustomerInfo, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo it) {
            q.f(it, "it");
            this.$onResult.onReceived(CustomerInfoMapperKt.map(it));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getOfferings$1, reason: invalid class name and case insensitive filesystem */
    static final class C02721 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02721(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError it) {
            q.f(it, "it");
            this.$onResult.onError(CommonKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getOfferings$2, reason: invalid class name and case insensitive filesystem */
    static final class C02732 extends r implements l<Offerings, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02732(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Offerings offerings) {
            invoke2(offerings);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Offerings it) {
            q.f(it, "it");
            this.$onResult.onReceived(OfferingsMapperKt.map(it));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getPurchaseCompletedFunction$1, reason: invalid class name and case insensitive filesystem */
    static final class C02741 extends r implements p<StoreTransaction, CustomerInfo, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02741(OnResult onResult) {
            super(2);
            this.$onResult = onResult;
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ i0 invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
            invoke2(storeTransaction, customerInfo);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
            i0 i0Var;
            q.f(customerInfo, "customerInfo");
            if (storeTransaction != null) {
                this.$onResult.onReceived(k0.g(x.a("productIdentifier", storeTransaction.getProductIds().get(0)), x.a("customerInfo", CustomerInfoMapperKt.map(customerInfo)), x.a("transaction", StoreTransactionMapperKt.map(storeTransaction))));
                i0Var = i0.f21430a;
            } else {
                i0Var = null;
            }
            if (i0Var == null) {
                this.$onResult.onError(new ErrorContainer(PurchasesErrorCode.UnsupportedError.getCode(), "Error purchasing. Null transaction returned from a successful non-upgrade purchase.", k0.e()));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$getPurchaseErrorFunction$1, reason: invalid class name and case insensitive filesystem */
    static final class C02751 extends r implements p<PurchasesError, Boolean, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02751(OnResult onResult) {
            super(2);
            this.$onResult = onResult;
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Boolean bool) {
            invoke(purchasesError, bool.booleanValue());
            return i0.f21430a;
        }

        public final void invoke(PurchasesError error, boolean z7) {
            q.f(error, "error");
            this.$onResult.onError(CommonKt.map(error, j0.c(x.a("userCancelled", Boolean.valueOf(z7)))));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$logIn$1, reason: invalid class name and case insensitive filesystem */
    static final class C02761 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02761(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError it) {
            q.f(it, "it");
            this.$onResult.onError(CommonKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$logIn$2, reason: invalid class name and case insensitive filesystem */
    static final class C02772 extends r implements p<CustomerInfo, Boolean, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02772(OnResult onResult) {
            super(2);
            this.$onResult = onResult;
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo, Boolean bool) {
            invoke(customerInfo, bool.booleanValue());
            return i0.f21430a;
        }

        public final void invoke(CustomerInfo customerInfo, boolean z7) {
            q.f(customerInfo, "customerInfo");
            this.$onResult.onReceived(k0.g(x.a("customerInfo", CustomerInfoMapperKt.map(customerInfo)), x.a("created", Boolean.valueOf(z7))));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$logOut$1, reason: invalid class name and case insensitive filesystem */
    static final class C02781 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02781(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError it) {
            q.f(it, "it");
            this.$onResult.onError(CommonKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$logOut$2, reason: invalid class name and case insensitive filesystem */
    static final class C02792 extends r implements l<CustomerInfo, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02792(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo it) {
            q.f(it, "it");
            this.$onResult.onReceived(CustomerInfoMapperKt.map(it));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$purchasePackage$1, reason: invalid class name and case insensitive filesystem */
    static final class C02801 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02801(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError it) {
            q.f(it, "it");
            this.$onResult.onError(CommonKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$purchasePackage$2, reason: invalid class name and case insensitive filesystem */
    static final class C02812 extends r implements l<Offerings, i0> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Boolean $googleIsPersonalizedPrice;
        final /* synthetic */ String $googleOldProductId;
        final /* synthetic */ GoogleProrationMode $googleProrationMode;
        final /* synthetic */ String $offeringIdentifier;
        final /* synthetic */ OnResult $onResult;
        final /* synthetic */ String $packageIdentifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02812(String str, Activity activity, String str2, GoogleProrationMode googleProrationMode, Boolean bool, OnResult onResult, String str3) {
            super(1);
            this.$offeringIdentifier = str;
            this.$activity = activity;
            this.$googleOldProductId = str2;
            this.$googleProrationMode = googleProrationMode;
            this.$googleIsPersonalizedPrice = bool;
            this.$onResult = onResult;
            this.$packageIdentifier = str3;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Offerings offerings) {
            invoke2(offerings);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Offerings offerings) {
            Package r32;
            List<Package> availablePackages;
            Object next;
            q.f(offerings, "offerings");
            Offering offering = offerings.get(this.$offeringIdentifier);
            if (offering == null || (availablePackages = offering.getAvailablePackages()) == null) {
                r32 = null;
            } else {
                String str = this.$packageIdentifier;
                Iterator<T> it = availablePackages.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (v.o(((Package) next).getIdentifier(), str, true)) {
                            break;
                        }
                    }
                }
                r32 = (Package) next;
            }
            if (r32 == null) {
                this.$onResult.onError(CommonKt.map$default(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "Couldn't find product for package " + this.$packageIdentifier), null, 1, null));
                return;
            }
            PurchaseParams.Builder builder = new PurchaseParams.Builder(this.$activity, r32);
            String str2 = this.$googleOldProductId;
            if (str2 != null && (true ^ v.p(str2))) {
                builder.oldProductId(this.$googleOldProductId);
                GoogleProrationMode googleProrationMode = this.$googleProrationMode;
                if (googleProrationMode != null) {
                    builder.googleProrationMode(googleProrationMode);
                }
            }
            Boolean bool = this.$googleIsPersonalizedPrice;
            if (bool != null) {
                bool.booleanValue();
                builder.isPersonalizedPrice(bool.booleanValue());
            }
            ListenerConversionsCommonKt.purchaseWith(Purchases.Companion.getSharedInstance(), builder.build(), CommonKt.getPurchaseErrorFunction(this.$onResult), CommonKt.getPurchaseCompletedFunction(this.$onResult));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseProduct$1, reason: invalid class name and case insensitive filesystem */
    static final class C02821 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02821(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError it) {
            q.f(it, "it");
            this.$onResult.onError(CommonKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseProduct$2, reason: invalid class name and case insensitive filesystem */
    static final class C02832 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02832(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError it) {
            q.f(it, "it");
            this.$onResult.onError(CommonKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseSubscriptionOption$1, reason: invalid class name and case insensitive filesystem */
    static final class C02841 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02841(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError it) {
            q.f(it, "it");
            this.$onResult.onError(CommonKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$restorePurchases$1, reason: invalid class name and case insensitive filesystem */
    static final class C02851 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02851(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError it) {
            q.f(it, "it");
            this.$onResult.onError(CommonKt.map$default(it, null, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$restorePurchases$2, reason: invalid class name and case insensitive filesystem */
    static final class C02862 extends r implements l<CustomerInfo, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02862(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(CustomerInfo customerInfo) {
            invoke2(customerInfo);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CustomerInfo it) {
            q.f(it, "it");
            this.$onResult.onReceived(CustomerInfoMapperKt.map(it));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.hybridcommon.CommonKt$setLogHandlerWithOnResult$1, reason: invalid class name and case insensitive filesystem */
    static final class C02871 extends r implements l<Map<String, ? extends String>, i0> {
        final /* synthetic */ OnResult $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02871(OnResult onResult) {
            super(1);
            this.$onResult = onResult;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends String> map) {
            invoke2((Map<String, String>) map);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, String> logDetails) {
            q.f(logDetails, "logDetails");
            this.$onResult.onReceived(logDetails);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StoreProduct applyOfferingIdentifier(StoreProduct storeProduct, String str) {
        StoreProduct storeProductCopyWithOfferingId;
        return (str == null || (storeProductCopyWithOfferingId = storeProduct.copyWithOfferingId(str)) == null) ? storeProduct : storeProductCopyWithOfferingId;
    }

    public static final void canMakePayments(Context context, List<Integer> features, final OnResultAny<Boolean> onResult) {
        q.f(context, "context");
        q.f(features, "features");
        q.f(onResult, "onResult");
        ArrayList arrayList = new ArrayList();
        try {
            BillingFeature[] billingFeatureArrValues = BillingFeature.values();
            ArrayList arrayList2 = new ArrayList(f6.p.m(features, 10));
            Iterator<T> it = features.iterator();
            while (it.hasNext()) {
                arrayList2.add(billingFeatureArrValues[((Number) it.next()).intValue()]);
            }
            arrayList.addAll(arrayList2);
            Purchases.Companion.canMakePayments(context, arrayList, new Callback() { // from class: com.revenuecat.purchases.hybridcommon.a
                @Override // com.revenuecat.purchases.interfaces.Callback
                public final void onReceived(Object obj) {
                    CommonKt.canMakePayments$lambda$2(onResult, (Boolean) obj);
                }
            });
        } catch (IndexOutOfBoundsException unused) {
            onResult.onError(map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid feature type passed to canMakePayments."), null, 1, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void canMakePayments$lambda$2(OnResultAny onResult, Boolean it) {
        q.f(onResult, "$onResult");
        q.e(it, "it");
        onResult.onReceived(it);
    }

    public static final Map<String, Map<String, Object>> checkTrialOrIntroductoryPriceEligibility(List<String> productIdentifiers) {
        q.f(productIdentifiers, "productIdentifiers");
        ArrayList arrayList = new ArrayList(f6.p.m(productIdentifiers, 10));
        Iterator<T> it = productIdentifiers.iterator();
        while (it.hasNext()) {
            arrayList.add(x.a((String) it.next(), k0.g(x.a("status", 0), x.a(b.f3893c, "Status indeterminate."))));
        }
        return k0.n(arrayList);
    }

    public static final void configure(Context context, String apiKey, String str, Boolean bool, PlatformInfo platformInfo) {
        q.f(context, "context");
        q.f(apiKey, "apiKey");
        q.f(platformInfo, "platformInfo");
        configure$default(context, apiKey, str, bool, platformInfo, null, null, null, null, 480, null);
    }

    public static final void configure(Context context, String apiKey, String str, Boolean bool, PlatformInfo platformInfo, Store store) {
        q.f(context, "context");
        q.f(apiKey, "apiKey");
        q.f(platformInfo, "platformInfo");
        q.f(store, "store");
        configure$default(context, apiKey, str, bool, platformInfo, store, null, null, null, 448, null);
    }

    public static final void configure(Context context, String apiKey, String str, Boolean bool, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings) {
        q.f(context, "context");
        q.f(apiKey, "apiKey");
        q.f(platformInfo, "platformInfo");
        q.f(store, "store");
        q.f(dangerousSettings, "dangerousSettings");
        configure$default(context, apiKey, str, bool, platformInfo, store, dangerousSettings, null, null, 384, null);
    }

    public static final void configure(Context context, String apiKey, String str, Boolean bool, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool2) {
        q.f(context, "context");
        q.f(apiKey, "apiKey");
        q.f(platformInfo, "platformInfo");
        q.f(store, "store");
        q.f(dangerousSettings, "dangerousSettings");
        configure$default(context, apiKey, str, bool, platformInfo, store, dangerousSettings, bool2, null, 256, null);
    }

    public static final void configure(Context context, String apiKey, String str, Boolean bool, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool2, String str2) {
        q.f(context, "context");
        q.f(apiKey, "apiKey");
        q.f(platformInfo, "platformInfo");
        q.f(store, "store");
        q.f(dangerousSettings, "dangerousSettings");
        Purchases.Companion.setPlatformInfo(platformInfo);
        PurchasesConfiguration.Builder builderDangerousSettings = new PurchasesConfiguration.Builder(context, apiKey).appUserID(str).store(store).dangerousSettings(dangerousSettings);
        if (bool != null) {
            builderDangerousSettings.observerMode(bool.booleanValue());
        }
        if (bool2 != null) {
            builderDangerousSettings.showInAppMessagesAutomatically(bool2.booleanValue());
        }
        if (str2 != null) {
            try {
                builderDangerousSettings.entitlementVerificationMode(EntitlementVerificationMode.valueOf(str2));
            } catch (IllegalArgumentException unused) {
                warnLog("Attempted to configure with unknown verification mode: " + str2 + '.');
            }
        }
        Purchases.Companion.configure(builderDangerousSettings.build());
    }

    public static /* synthetic */ void configure$default(Context context, String str, String str2, Boolean bool, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool2, String str3, int i8, Object obj) {
        configure(context, str, str2, bool, platformInfo, (i8 & 32) != 0 ? Store.PLAY_STORE : store, (i8 & 64) != 0 ? new DangerousSettings(true) : dangerousSettings, (i8 & 128) != 0 ? null : bool2, (i8 & 256) != 0 ? null : str3);
    }

    public static final void errorLog(String message) {
        q.f(message, "message");
        if (Purchases.Companion.getLogLevel().compareTo(LogLevel.ERROR) <= 0) {
            Log.e("PurchasesHybridCommon", message);
        }
    }

    public static final String getAppUserID() {
        return Purchases.Companion.getSharedInstance().getAppUserID();
    }

    public static final void getCustomerInfo(OnResult onResult) {
        q.f(onResult, "onResult");
        ListenerConversionsKt.getCustomerInfoWith(Purchases.Companion.getSharedInstance(), new AnonymousClass1(onResult), new AnonymousClass2(onResult));
    }

    public static final GoogleProrationMode getGoogleProrationMode(Integer num) throws InvalidProrationModeException {
        GoogleProrationMode googleProrationMode = null;
        if (num != null) {
            int iIntValue = num.intValue();
            GoogleProrationMode[] googleProrationModeArrValues = GoogleProrationMode.values();
            int length = googleProrationModeArrValues.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                GoogleProrationMode googleProrationMode2 = googleProrationModeArrValues[i8];
                if (googleProrationMode2.getPlayBillingClientMode() == iIntValue) {
                    googleProrationMode = googleProrationMode2;
                    break;
                }
                i8++;
            }
            if (googleProrationMode == null) {
                throw new InvalidProrationModeException();
            }
        }
        return googleProrationMode;
    }

    public static final void getOfferings(OnResult onResult) {
        q.f(onResult, "onResult");
        ListenerConversionsCommonKt.getOfferingsWith(Purchases.Companion.getSharedInstance(), new C02721(onResult), new C02732(onResult));
    }

    public static final void getProductInfo(List<String> productIDs, String type, OnResultList onResult) {
        Purchases sharedInstance;
        q.f(productIDs, "productIDs");
        q.f(type, "type");
        q.f(onResult, "onResult");
        CommonKt$getProductInfo$onError$1 commonKt$getProductInfo$onError$1 = new CommonKt$getProductInfo$onError$1(onResult);
        CommonKt$getProductInfo$onReceived$1 commonKt$getProductInfo$onReceived$1 = new CommonKt$getProductInfo$onReceived$1(onResult);
        ProductType productTypeMapStringToProductType = mapStringToProductType(type);
        ProductType productType = ProductType.SUBS;
        if (productTypeMapStringToProductType == productType) {
            sharedInstance = Purchases.Companion.getSharedInstance();
        } else {
            sharedInstance = Purchases.Companion.getSharedInstance();
            productType = ProductType.INAPP;
        }
        ListenerConversionsCommonKt.getProductsWith(sharedInstance, productIDs, productType, commonKt$getProductInfo$onError$1, commonKt$getProductInfo$onReceived$1);
    }

    public static final ErrorContainer getPromotionalOffer() {
        return new ErrorContainer(PurchasesErrorCode.UnsupportedError.getCode(), "Android platform doesn't support promotional offers", k0.e());
    }

    public static final String getProxyURLString() {
        return String.valueOf(Purchases.Companion.getProxyURL());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<StoreTransaction, CustomerInfo, i0> getPurchaseCompletedFunction(OnResult onResult) {
        return new C02741(onResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<PurchasesError, Boolean, i0> getPurchaseErrorFunction(OnResult onResult) {
        return new C02751(onResult);
    }

    public static final void invalidateCustomerInfoCache() {
        Purchases.Companion.getSharedInstance().invalidateCustomerInfoCache();
    }

    public static final boolean isAnonymous() {
        return Purchases.Companion.getSharedInstance().isAnonymous();
    }

    public static final void logIn(String appUserID, OnResult onResult) {
        q.f(appUserID, "appUserID");
        q.f(onResult, "onResult");
        ListenerConversionsKt.logInWith(Purchases.Companion.getSharedInstance(), appUserID, new C02761(onResult), new C02772(onResult));
    }

    public static final void logOut(OnResult onResult) {
        q.f(onResult, "onResult");
        ListenerConversionsKt.logOutWith(Purchases.Companion.getSharedInstance(), new C02781(onResult), new C02792(onResult));
    }

    public static final ErrorContainer map(PurchasesError purchasesError, Map<String, ? extends Object> extra) {
        q.f(purchasesError, "<this>");
        q.f(extra, "extra");
        int code = purchasesError.getCode().getCode();
        String message = purchasesError.getMessage();
        e6.r[] rVarArr = new e6.r[5];
        rVarArr[0] = x.a("code", Integer.valueOf(purchasesError.getCode().getCode()));
        rVarArr[1] = x.a("message", purchasesError.getMessage());
        rVarArr[2] = x.a("readableErrorCode", purchasesError.getCode().name());
        rVarArr[3] = x.a("readable_error_code", purchasesError.getCode().name());
        String underlyingErrorMessage = purchasesError.getUnderlyingErrorMessage();
        if (underlyingErrorMessage == null) {
            underlyingErrorMessage = "";
        }
        rVarArr[4] = x.a("underlyingErrorMessage", underlyingErrorMessage);
        return new ErrorContainer(code, message, k0.j(k0.g(rVarArr), extra));
    }

    public static /* synthetic */ ErrorContainer map$default(PurchasesError purchasesError, Map map, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            map = k0.e();
        }
        return map(purchasesError, map);
    }

    public static final ProductType mapStringToProductType(String type) {
        MappedProductCategory mappedProductCategory;
        q.f(type, "type");
        MappedProductCategory[] mappedProductCategoryArrValues = MappedProductCategory.values();
        int length = mappedProductCategoryArrValues.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                mappedProductCategory = null;
                break;
            }
            mappedProductCategory = mappedProductCategoryArrValues[i8];
            if (v.o(mappedProductCategory.getValue(), type, true)) {
                break;
            }
            i8++;
        }
        if (mappedProductCategory != null) {
            return mappedProductCategory.getToProductType();
        }
        String lowerCase = type.toLowerCase(Locale.ROOT);
        q.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (q.b(lowerCase, "subs")) {
            return ProductType.SUBS;
        }
        if (!q.b(lowerCase, "inapp")) {
            warnLog("Unrecognized product type: " + type + "... Defaulting to INAPP");
        }
        return ProductType.INAPP;
    }

    public static final void purchasePackage(Activity activity, String packageIdentifier, String offeringIdentifier, String str, Integer num, Boolean bool, OnResult onResult) {
        q.f(packageIdentifier, "packageIdentifier");
        q.f(offeringIdentifier, "offeringIdentifier");
        q.f(onResult, "onResult");
        try {
            GoogleProrationMode googleProrationMode = getGoogleProrationMode(num);
            if (activity != null) {
                ListenerConversionsCommonKt.getOfferingsWith(Purchases.Companion.getSharedInstance(), new C02801(onResult), new C02812(offeringIdentifier, activity, str, googleProrationMode, bool, onResult, packageIdentifier));
            } else {
                onResult.onError(map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no current Activity"), null, 1, null));
            }
        } catch (InvalidProrationModeException unused) {
            onResult.onError(map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid google proration mode passed to purchasePackage."), null, 1, null));
        }
    }

    public static final void purchaseProduct(Activity activity, String productIdentifier, String type, String str, String str2, Integer num, Boolean bool, String str3, OnResult onResult) {
        q.f(productIdentifier, "productIdentifier");
        q.f(type, "type");
        q.f(onResult, "onResult");
        try {
            GoogleProrationMode googleProrationMode = getGoogleProrationMode(num);
            ProductType productTypeMapStringToProductType = mapStringToProductType(type);
            if (activity == null) {
                onResult.onError(map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no current Activity"), null, 1, null));
                return;
            }
            CommonKt$purchaseProduct$onReceiveStoreProducts$1 commonKt$purchaseProduct$onReceiveStoreProducts$1 = new CommonKt$purchaseProduct$onReceiveStoreProducts$1(str3, activity, str2, googleProrationMode, bool, onResult, productIdentifier, productTypeMapStringToProductType, str);
            ProductType productType = ProductType.SUBS;
            if (productTypeMapStringToProductType != productType) {
                ListenerConversionsCommonKt.getProductsWith(Purchases.Companion.getSharedInstance(), n.b(productIdentifier), ProductType.INAPP, new C02832(onResult), commonKt$purchaseProduct$onReceiveStoreProducts$1);
            } else {
                ListenerConversionsCommonKt.getProductsWith(Purchases.Companion.getSharedInstance(), n.b((String) w.z(w6.w.b0(productIdentifier, new String[]{Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR}, false, 0, 6, null))), productType, new C02821(onResult), commonKt$purchaseProduct$onReceiveStoreProducts$1);
            }
        } catch (InvalidProrationModeException unused) {
            onResult.onError(map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid google proration mode passed to purchaseProduct."), null, 1, null));
        }
    }

    public static final void purchaseSubscriptionOption(Activity activity, String productIdentifier, String optionIdentifier, String str, Integer num, Boolean bool, String str2, OnResult onResult) {
        PurchasesError purchasesError;
        q.f(productIdentifier, "productIdentifier");
        q.f(optionIdentifier, "optionIdentifier");
        q.f(onResult, "onResult");
        Purchases.Companion companion = Purchases.Companion;
        if (companion.getSharedInstance().getStore() != Store.PLAY_STORE) {
            purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, "purchaseSubscriptionOption() is only supported on the Play Store.");
        } else {
            try {
                GoogleProrationMode googleProrationMode = getGoogleProrationMode(num);
                if (activity == null) {
                    onResult.onError(map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no current Activity"), null, 1, null));
                    return;
                } else {
                    ListenerConversionsCommonKt.getProductsWith(companion.getSharedInstance(), n.b(productIdentifier), ProductType.SUBS, new C02841(onResult), new CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1(activity, str, bool, onResult, productIdentifier, optionIdentifier, str2, googleProrationMode));
                    return;
                }
            } catch (InvalidProrationModeException unused) {
                purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid google proration mode passed to purchaseSubscriptionOption.");
            }
        }
        onResult.onError(map$default(purchasesError, null, 1, null));
    }

    public static final void restorePurchases(OnResult onResult) {
        q.f(onResult, "onResult");
        ListenerConversionsCommonKt.restorePurchasesWith(Purchases.Companion.getSharedInstance(), new C02851(onResult), new C02862(onResult));
    }

    public static final void setAllowSharingAppStoreAccount(boolean z7) {
        Purchases.Companion.getSharedInstance().setAllowSharingPlayStoreAccount(z7);
    }

    public static final void setDebugLogsEnabled(boolean z7) {
        Purchases.Companion.setDebugLogsEnabled(z7);
    }

    public static final void setFinishTransactions(boolean z7) {
        Purchases.Companion.getSharedInstance().setFinishTransactions(z7);
    }

    public static final void setLogHandler(l<? super Map<String, String>, i0> callback) {
        q.f(callback, "callback");
        Purchases.Companion.setLogHandler(new LogHandlerWithMapping(callback));
    }

    public static final void setLogHandlerWithOnResult(OnResult onResult) {
        q.f(onResult, "onResult");
        setLogHandler(new C02871(onResult));
    }

    public static final void setLogLevel(String level) {
        q.f(level, "level");
        try {
            Purchases.Companion.setLogLevel(LogLevel.valueOf(level));
        } catch (IllegalArgumentException unused) {
            warnLog("Unrecognized log level: " + level);
        }
    }

    public static final void setProxyURLString(String str) {
        Purchases.Companion.setProxyURL(str != null ? new URL(str) : null);
    }

    public static final void showInAppMessagesIfNeeded(Activity activity) {
        showInAppMessagesIfNeeded$default(activity, null, 2, null);
    }

    public static final void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list) {
        if (activity == null) {
            errorLog("showInAppMessages called with null activity");
        } else if (list == null) {
            Purchases.showInAppMessagesIfNeeded$default(Purchases.Companion.getSharedInstance(), activity, null, 2, null);
        } else {
            Purchases.Companion.getSharedInstance().showInAppMessagesIfNeeded(activity, list);
        }
    }

    public static /* synthetic */ void showInAppMessagesIfNeeded$default(Activity activity, List list, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            list = null;
        }
        showInAppMessagesIfNeeded(activity, list);
    }

    public static final void syncPurchases() {
        Purchases.syncPurchases$default(Purchases.Companion.getSharedInstance(), null, 1, null);
    }

    public static final void warnLog(String message) {
        q.f(message, "message");
        if (Purchases.Companion.getLogLevel().compareTo(LogLevel.WARN) <= 0) {
            Log.w("PurchasesHybridCommon", message);
        }
    }
}
