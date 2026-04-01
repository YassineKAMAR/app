package com.revenuecat.purchases_flutter;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.hybridcommon.CommonKt;
import com.revenuecat.purchases.hybridcommon.ErrorContainer;
import com.revenuecat.purchases.hybridcommon.OnResult;
import com.revenuecat.purchases.hybridcommon.OnResultAny;
import com.revenuecat.purchases.hybridcommon.OnResultList;
import com.revenuecat.purchases.hybridcommon.SubscriberAttributesKt;
import com.revenuecat.purchases.hybridcommon.mappers.CustomerInfoMapperKt;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.InAppMessageType;
import e6.h0;
import e6.i0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l5.a;
import p6.l;
import s5.j;
import s5.k;
import s5.o;
import s5.r;

/* JADX INFO: loaded from: classes.dex */
public class PurchasesFlutterPlugin implements l5.a, k.c, m5.a {
    private static final String CUSTOMER_INFO_UPDATED = "Purchases-CustomerInfoUpdated";
    private static final String INVALID_ARGS_ERROR_CODE = "invalidArgs";
    protected static final String LOG_HANDLER_EVENT = "Purchases-LogHandlerEvent";
    private static final String PLATFORM_NAME = "flutter";
    private static final String PLUGIN_VERSION = "6.18.0";
    private static final String TAG = "PurchasesFlutter";
    private Activity activity;
    private Context applicationContext;
    private k channel;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private o registrar;

    private void canMakePayments(List<Integer> list, final k.d dVar) {
        CommonKt.canMakePayments(this.applicationContext, list, new OnResultAny<Boolean>() { // from class: com.revenuecat.purchases_flutter.PurchasesFlutterPlugin.3
            @Override // com.revenuecat.purchases.hybridcommon.OnResultAny
            public void onError(ErrorContainer errorContainer) {
                PurchasesFlutterPlugin.this.reject(errorContainer, dVar);
            }

            @Override // com.revenuecat.purchases.hybridcommon.OnResultAny
            public void onReceived(Boolean bool) {
                dVar.a(bool);
            }
        });
    }

    private void checkTrialOrIntroductoryPriceEligibility(ArrayList<String> arrayList, k.d dVar) {
        dVar.a(CommonKt.checkTrialOrIntroductoryPriceEligibility(arrayList));
    }

    private void close(k.d dVar) {
        try {
            Purchases.getSharedInstance().close();
        } catch (h0 unused) {
        }
        dVar.a(null);
    }

    private void collectDeviceIdentifiers(k.d dVar) {
        SubscriberAttributesKt.collectDeviceIdentifiers();
        dVar.a(null);
    }

    private void getAppUserID(k.d dVar) {
        dVar.a(CommonKt.getAppUserID());
    }

    private void getCustomerInfo(k.d dVar) {
        CommonKt.getCustomerInfo(getOnResult(dVar));
    }

    private void getOfferings(k.d dVar) {
        CommonKt.getOfferings(getOnResult(dVar));
    }

    private OnResult getOnResult(final k.d dVar) {
        return new OnResult() { // from class: com.revenuecat.purchases_flutter.PurchasesFlutterPlugin.4
            @Override // com.revenuecat.purchases.hybridcommon.OnResult
            public void onError(ErrorContainer errorContainer) {
                PurchasesFlutterPlugin.this.reject(errorContainer, dVar);
            }

            @Override // com.revenuecat.purchases.hybridcommon.OnResult
            public void onReceived(Map<String, ?> map) {
                dVar.a(map);
            }
        };
    }

    private void getProductInfo(ArrayList<String> arrayList, String str, final k.d dVar) {
        CommonKt.getProductInfo(arrayList, str, new OnResultList() { // from class: com.revenuecat.purchases_flutter.PurchasesFlutterPlugin.2
            @Override // com.revenuecat.purchases.hybridcommon.OnResultList
            public void onError(ErrorContainer errorContainer) {
                PurchasesFlutterPlugin.this.reject(errorContainer, dVar);
            }

            @Override // com.revenuecat.purchases.hybridcommon.OnResultList
            public void onReceived(List<Map<String, ?>> list) {
                dVar.a(list);
            }
        });
    }

    private void invalidateCustomerInfoCache(k.d dVar) {
        CommonKt.invalidateCustomerInfoCache();
        dVar.a(null);
    }

    private void invokeChannelMethodOnUiThread(final String str, final Object obj) {
        runOnUiThread(new Runnable() { // from class: com.revenuecat.purchases_flutter.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f20941a.lambda$invokeChannelMethodOnUiThread$2(str, obj);
            }
        });
    }

    private void isAnonymous(k.d dVar) {
        dVar.a(Boolean.valueOf(CommonKt.isAnonymous()));
    }

    private void isConfigured(k.d dVar) {
        dVar.a(Boolean.valueOf(Purchases.isConfigured()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$invokeChannelMethodOnUiThread$2(String str, Object obj) {
        k kVar = this.channel;
        if (kVar != null) {
            kVar.c(str, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ i0 lambda$setLogHandler$1(Map map) {
        invokeChannelMethodOnUiThread(LOG_HANDLER_EVENT, map);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpdatedCustomerInfoListener$0(CustomerInfo customerInfo) {
        invokeChannelMethodOnUiThread(CUSTOMER_INFO_UPDATED, CustomerInfoMapperKt.map(customerInfo));
    }

    private void logIn(String str, k.d dVar) {
        CommonKt.logIn(str, getOnResult(dVar));
    }

    private void logOut(k.d dVar) {
        CommonKt.logOut(getOnResult(dVar));
    }

    private void onAttachedToEngine(s5.c cVar, Context context) {
        k kVar = new k(cVar, "purchases_flutter");
        this.channel = kVar;
        this.applicationContext = context;
        kVar.e(this);
    }

    private void purchasePackage(String str, String str2, String str3, Integer num, Boolean bool, k.d dVar) {
        CommonKt.purchasePackage(getActivity(), str, str2, str3, num, bool, getOnResult(dVar));
    }

    private void purchaseProduct(String str, String str2, String str3, Integer num, Boolean bool, String str4, k.d dVar) {
        CommonKt.purchaseProduct(getActivity(), str, str2, null, str3, num, bool, str4, getOnResult(dVar));
    }

    private void purchaseSubscriptionOption(String str, String str2, String str3, Integer num, Boolean bool, String str4, k.d dVar) {
        CommonKt.purchaseSubscriptionOption(getActivity(), str, str2, str3, num, bool, str4, getOnResult(dVar));
    }

    public static void registerWith(o oVar) {
        PurchasesFlutterPlugin purchasesFlutterPlugin = new PurchasesFlutterPlugin();
        purchasesFlutterPlugin.onAttachedToEngine(oVar.d(), oVar.a());
        purchasesFlutterPlugin.registrar = oVar;
        oVar.b(new r() { // from class: com.revenuecat.purchases_flutter.PurchasesFlutterPlugin.1
            public boolean onViewDestroy(io.flutter.view.r rVar) {
                try {
                    Purchases.getSharedInstance().close();
                    return false;
                } catch (h0 unused) {
                    return false;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reject(ErrorContainer errorContainer, k.d dVar) {
        dVar.b(String.valueOf(errorContainer.getCode()), errorContainer.getMessage(), errorContainer.getInfo());
    }

    private void restorePurchases(k.d dVar) {
        CommonKt.restorePurchases(getOnResult(dVar));
    }

    private void runOnUiThread(Runnable runnable) {
        this.handler.post(runnable);
    }

    private void setAd(String str, k.d dVar) {
        SubscriberAttributesKt.setAd(str);
        dVar.a(null);
    }

    private void setAdGroup(String str, k.d dVar) {
        SubscriberAttributesKt.setAdGroup(str);
        dVar.a(null);
    }

    private void setAdjustID(String str, k.d dVar) {
        SubscriberAttributesKt.setAdjustID(str);
        dVar.a(null);
    }

    private void setAirshipChannelID(String str, k.d dVar) {
        SubscriberAttributesKt.setAirshipChannelID(str);
        dVar.a(null);
    }

    private void setAllowSharingAppStoreAccount(Boolean bool, k.d dVar) {
        if (bool == null) {
            dVar.b(INVALID_ARGS_ERROR_CODE, "Missing allowSharing argument", null);
        } else {
            CommonKt.setAllowSharingAppStoreAccount(bool.booleanValue());
            dVar.a(null);
        }
    }

    private void setAppsflyerID(String str, k.d dVar) {
        SubscriberAttributesKt.setAppsflyerID(str);
        dVar.a(null);
    }

    private void setAttributes(Map<String, String> map, k.d dVar) {
        SubscriberAttributesKt.setAttributes(map);
        dVar.a(null);
    }

    private void setCampaign(String str, k.d dVar) {
        SubscriberAttributesKt.setCampaign(str);
        dVar.a(null);
    }

    private void setCleverTapID(String str, k.d dVar) {
        SubscriberAttributesKt.setCleverTapID(str);
        dVar.a(null);
    }

    private void setCreative(String str, k.d dVar) {
        SubscriberAttributesKt.setCreative(str);
        dVar.a(null);
    }

    private void setDebugLogsEnabled(boolean z7, k.d dVar) {
        CommonKt.setLogLevel(z7 ? "DEBUG" : "INFO");
        dVar.a(null);
    }

    private void setDisplayName(String str, k.d dVar) {
        SubscriberAttributesKt.setDisplayName(str);
        dVar.a(null);
    }

    private void setEmail(String str, k.d dVar) {
        SubscriberAttributesKt.setEmail(str);
        dVar.a(null);
    }

    private void setFBAnonymousID(String str, k.d dVar) {
        SubscriberAttributesKt.setFBAnonymousID(str);
        dVar.a(null);
    }

    private void setFinishTransactions(Boolean bool, k.d dVar) {
        if (bool == null) {
            dVar.b(INVALID_ARGS_ERROR_CODE, "Missing finishTransactions argument", null);
        } else {
            CommonKt.setFinishTransactions(bool.booleanValue());
            dVar.a(null);
        }
    }

    private void setFirebaseAppInstanceID(String str, k.d dVar) {
        SubscriberAttributesKt.setFirebaseAppInstanceID(str);
        dVar.a(null);
    }

    private void setKeyword(String str, k.d dVar) {
        SubscriberAttributesKt.setKeyword(str);
        dVar.a(null);
    }

    private void setLogHandler(k.d dVar) {
        CommonKt.setLogHandler(new l() { // from class: com.revenuecat.purchases_flutter.c
            @Override // p6.l
            public final Object invoke(Object obj) {
                return this.f20944a.lambda$setLogHandler$1((Map) obj);
            }
        });
        dVar.a(null);
    }

    private void setLogLevel(String str, k.d dVar) {
        CommonKt.setLogLevel(str);
        dVar.a(null);
    }

    private void setMediaSource(String str, k.d dVar) {
        SubscriberAttributesKt.setMediaSource(str);
        dVar.a(null);
    }

    private void setMixpanelDistinctID(String str, k.d dVar) {
        SubscriberAttributesKt.setMixpanelDistinctID(str);
        dVar.a(null);
    }

    private void setMparticleID(String str, k.d dVar) {
        SubscriberAttributesKt.setMparticleID(str);
        dVar.a(null);
    }

    private void setOnesignalID(String str, k.d dVar) {
        SubscriberAttributesKt.setOnesignalID(str);
        dVar.a(null);
    }

    private void setPhoneNumber(String str, k.d dVar) {
        SubscriberAttributesKt.setPhoneNumber(str);
        dVar.a(null);
    }

    private void setProxyURLString(String str, k.d dVar) {
        CommonKt.setProxyURLString(str);
        dVar.a(null);
    }

    private void setPushToken(String str, k.d dVar) {
        SubscriberAttributesKt.setPushToken(str);
        dVar.a(null);
    }

    private void setUpdatedCustomerInfoListener() {
        Purchases.getSharedInstance().setUpdatedCustomerInfoListener(new UpdatedCustomerInfoListener() { // from class: com.revenuecat.purchases_flutter.a
            @Override // com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener
            public final void onReceived(CustomerInfo customerInfo) {
                this.f20940a.lambda$setUpdatedCustomerInfoListener$0(customerInfo);
            }
        });
    }

    private void setupPurchases(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, k.d dVar) {
        if (this.applicationContext == null) {
            dVar.b(String.valueOf(PurchasesErrorCode.UnknownError.getCode()), "Purchases can't be setup. There is no Application context", null);
            return;
        }
        PlatformInfo platformInfo = new PlatformInfo(PLATFORM_NAME, PLUGIN_VERSION);
        Store store = Store.PLAY_STORE;
        if (bool2 != null && bool2.booleanValue()) {
            store = Store.AMAZON;
        }
        CommonKt.configure(this.applicationContext, str, str2, bool, platformInfo, store, new DangerousSettings(), bool3, str3);
        setUpdatedCustomerInfoListener();
        dVar.a(null);
    }

    private void showInAppMessages(ArrayList<Integer> arrayList, k.d dVar) {
        if (arrayList == null) {
            CommonKt.showInAppMessagesIfNeeded(this.activity);
        } else {
            ArrayList arrayList2 = new ArrayList();
            InAppMessageType[] inAppMessageTypeArrValues = InAppMessageType.values();
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                int iIntValue = arrayList.get(i8).intValue();
                InAppMessageType inAppMessageType = iIntValue < inAppMessageTypeArrValues.length ? inAppMessageTypeArrValues[iIntValue] : null;
                if (inAppMessageType != null) {
                    arrayList2.add(inAppMessageType);
                } else {
                    Log.e(TAG, "Unsupported in-app message type: " + iIntValue);
                }
            }
            CommonKt.showInAppMessagesIfNeeded(this.activity, arrayList2);
        }
        dVar.a(null);
    }

    private void syncObserverModeAmazonPurchase(String str, String str2, String str3, String str4, Double d8, k.d dVar) {
        Purchases.getSharedInstance().syncObserverModeAmazonPurchase(str, str2, str3, str4, d8);
        dVar.a(null);
    }

    private void syncPurchases(k.d dVar) {
        CommonKt.syncPurchases();
        dVar.a(null);
    }

    public Activity getActivity() {
        o oVar = this.registrar;
        return oVar != null ? oVar.c() : this.activity;
    }

    @Override // m5.a
    public void onAttachedToActivity(m5.c cVar) {
        this.activity = cVar.g();
    }

    @Override // l5.a
    public void onAttachedToEngine(a.b bVar) {
        onAttachedToEngine(bVar.b(), bVar.a());
    }

    @Override // m5.a
    public void onDetachedFromActivity() {
        this.activity = null;
    }

    @Override // m5.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // l5.a
    public void onDetachedFromEngine(a.b bVar) {
        k kVar = this.channel;
        if (kVar != null) {
            kVar.e(null);
        }
        this.channel = null;
        this.applicationContext = null;
    }

    @Override // s5.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f26252a;
        str.hashCode();
        switch (str) {
            case "setKeyword":
                setKeyword((String) jVar.a("keyword"), dVar);
                break;
            case "getProductInfo":
                getProductInfo((ArrayList) jVar.a("productIdentifiers"), (String) jVar.a("type"), dVar);
                break;
            case "restorePurchases":
                restorePurchases(dVar);
                break;
            case "invalidateCustomerInfoCache":
                invalidateCustomerInfoCache(dVar);
                break;
            case "checkTrialOrIntroductoryPriceEligibility":
                checkTrialOrIntroductoryPriceEligibility((ArrayList) jVar.a("productIdentifiers"), dVar);
                break;
            case "setOnesignalID":
                setOnesignalID((String) jVar.a("onesignalID"), dVar);
                break;
            case "getPromotionalOffer":
            case "beginRefundRequestForEntitlement":
            case "setSimulatesAskToBuyInSandbox":
            case "setAutomaticAppleSearchAdsAttributionCollection":
            case "enableAdServicesAttributionTokenCollection":
            case "presentCodeRedemptionSheet":
            case "beginRefundRequestForProduct":
            case "beginRefundRequestForActiveEntitlement":
                dVar.a(null);
                break;
            case "purchasePackage":
                purchasePackage((String) jVar.a("packageIdentifier"), (String) jVar.a("offeringIdentifier"), (String) jVar.a("googleOldProductIdentifier"), (Integer) jVar.a("googleProrationMode"), (Boolean) jVar.a("googleIsPersonalizedPrice"), dVar);
                break;
            case "setFirebaseAppInstanceID":
                setFirebaseAppInstanceID((String) jVar.a("firebaseAppInstanceID"), dVar);
                break;
            case "getCustomerInfo":
                getCustomerInfo(dVar);
                break;
            case "showInAppMessages":
                showInAppMessages((ArrayList) jVar.a("types"), dVar);
                break;
            case "purchaseProduct":
                purchaseProduct((String) jVar.a("productIdentifier"), (String) jVar.a("type"), (String) jVar.a("googleOldProductIdentifier"), (Integer) jVar.a("googleProrationMode"), (Boolean) jVar.a("googleIsPersonalizedPrice"), (String) jVar.a("presentedOfferingIdentifier"), dVar);
                break;
            case "isConfigured":
                isConfigured(dVar);
                break;
            case "setFinishTransactions":
                setFinishTransactions((Boolean) jVar.a("finishTransactions"), dVar);
                break;
            case "logOut":
                logOut(dVar);
                break;
            case "purchaseSubscriptionOption":
                purchaseSubscriptionOption((String) jVar.a("productIdentifier"), (String) jVar.a("optionIdentifier"), (String) jVar.a("googleOldProductIdentifier"), (Integer) jVar.a("googleProrationMode"), (Boolean) jVar.a("googleIsPersonalizedPrice"), (String) jVar.a("presentedOfferingIdentifier"), dVar);
                break;
            case "setFBAnonymousID":
                setFBAnonymousID((String) jVar.a("fbAnonymousID"), dVar);
                break;
            case "isAnonymous":
                isAnonymous(dVar);
                break;
            case "setLogHandler":
                setLogHandler(dVar);
                break;
            case "setDisplayName":
                setDisplayName((String) jVar.a("displayName"), dVar);
                break;
            case "setMparticleID":
                setMparticleID((String) jVar.a("mparticleID"), dVar);
                break;
            case "setDebugLogsEnabled":
                setDebugLogsEnabled(jVar.a("enabled") != null && ((Boolean) jVar.a("enabled")).booleanValue(), dVar);
                break;
            case "setCreative":
                setCreative((String) jVar.a("creative"), dVar);
                break;
            case "setLogLevel":
                setLogLevel((String) jVar.a("level"), dVar);
                break;
            case "setAllowSharingStoreAccount":
                setAllowSharingAppStoreAccount((Boolean) jVar.a("allowSharing"), dVar);
                break;
            case "close":
                close(dVar);
                break;
            case "setupPurchases":
                String str2 = (String) jVar.a("apiKey");
                String str3 = (String) jVar.a("appUserId");
                Boolean bool = (Boolean) jVar.a("observerMode");
                Boolean bool2 = (Boolean) jVar.a("useAmazon");
                setupPurchases(str2, str3, bool, bool2, (Boolean) jVar.a("shouldShowInAppMessagesAutomatically"), (String) jVar.a("entitlementVerificationMode"), dVar);
                break;
            case "logIn":
                logIn((String) jVar.a("appUserID"), dVar);
                break;
            case "setAd":
                setAd((String) jVar.a("ad"), dVar);
                break;
            case "setAppsflyerID":
                setAppsflyerID((String) jVar.a("appsflyerID"), dVar);
                break;
            case "setCleverTapID":
                setCleverTapID((String) jVar.a("cleverTapID"), dVar);
                break;
            case "setProxyURLString":
                setProxyURLString((String) jVar.a("proxyURLString"), dVar);
                break;
            case "collectDeviceIdentifiers":
                collectDeviceIdentifiers(dVar);
                break;
            case "setPhoneNumber":
                setPhoneNumber((String) jVar.a("phoneNumber"), dVar);
                break;
            case "setPushToken":
                setPushToken((String) jVar.a("pushToken"), dVar);
                break;
            case "setAttributes":
                setAttributes((Map) jVar.a("attributes"), dVar);
                break;
            case "setAdjustID":
                setAdjustID((String) jVar.a("adjustID"), dVar);
                break;
            case "setAirshipChannelID":
                setAirshipChannelID((String) jVar.a("airshipChannelID"), dVar);
                break;
            case "syncPurchases":
                syncPurchases(dVar);
                break;
            case "syncObserverModeAmazonPurchase":
                syncObserverModeAmazonPurchase((String) jVar.a("productID"), (String) jVar.a("receiptID"), (String) jVar.a("amazonUserID"), (String) jVar.a("isoCurrencyCode"), (Double) jVar.a(com.amazon.a.a.o.b.f3914x), dVar);
                break;
            case "setEmail":
                setEmail((String) jVar.a("email"), dVar);
                break;
            case "setMediaSource":
                setMediaSource((String) jVar.a("mediaSource"), dVar);
                break;
            case "getAppUserID":
                getAppUserID(dVar);
                break;
            case "setAdGroup":
                setAdGroup((String) jVar.a("adGroup"), dVar);
                break;
            case "setCampaign":
                setCampaign((String) jVar.a("campaign"), dVar);
                break;
            case "getOfferings":
                getOfferings(dVar);
                break;
            case "setMixpanelDistinctID":
                setMixpanelDistinctID((String) jVar.a("mixpanelDistinctID"), dVar);
                break;
            case "canMakePayments":
                canMakePayments((List) jVar.a("features"), dVar);
                break;
            default:
                dVar.c();
                break;
        }
    }

    @Override // m5.a
    public void onReattachedToActivityForConfigChanges(m5.c cVar) {
        onAttachedToActivity(cVar);
    }
}
