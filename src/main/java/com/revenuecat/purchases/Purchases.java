package com.revenuecat.purchases;

import android.app.Activity;
import android.content.Context;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.models.GoogleProrationMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.ConfigureStrings;
import e6.h0;
import f6.n;
import f6.o;
import f6.o0;
import f6.w;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class Purchases implements LifecycleDelegate {
    private static /* synthetic */ Purchases backingFieldSharedInstance;
    private final PurchasesOrchestrator purchasesOrchestrator;
    public static final Companion Companion = new Companion(null);
    private static final String frameworkVersion = "7.4.0";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void canMakePayments$default(Companion companion, Context context, List list, Callback callback, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                list = o.d();
            }
            companion.canMakePayments(context, list, callback);
        }

        public static /* synthetic */ void getDebugLogsEnabled$annotations() {
        }

        public static /* synthetic */ void getFrameworkVersion$annotations() {
        }

        public static /* synthetic */ void getLogHandler$annotations() {
        }

        public static /* synthetic */ void getLogLevel$annotations() {
        }

        public static /* synthetic */ void getPlatformInfo$annotations() {
        }

        public static /* synthetic */ void getProxyURL$annotations() {
        }

        public static /* synthetic */ void getSharedInstance$annotations() {
        }

        public static /* synthetic */ void isConfigured$annotations() {
        }

        public final void canMakePayments(Context context, Callback<Boolean> callback) {
            q.f(context, "context");
            q.f(callback, "callback");
            canMakePayments$default(this, context, null, callback, 2, null);
        }

        public final void canMakePayments(Context context, List<? extends BillingFeature> features, Callback<Boolean> callback) {
            q.f(context, "context");
            q.f(features, "features");
            q.f(callback, "callback");
            if (getSharedInstance().getPurchasesOrchestrator$purchases_defaultsRelease().getAppConfig().getStore() == Store.PLAY_STORE) {
                PurchasesOrchestrator.Companion.canMakePayments(context, features, callback);
            } else {
                LogWrapperKt.log(LogIntent.RC_ERROR, BillingStrings.CANNOT_CALL_CAN_MAKE_PAYMENTS);
                callback.onReceived(Boolean.TRUE);
            }
        }

        public final Purchases configure(PurchasesConfiguration configuration) {
            q.f(configuration, "configuration");
            if (isConfigured()) {
                LogUtilsKt.infoLog(ConfigureStrings.INSTANCE_ALREADY_EXISTS);
            }
            Purchases purchasesCreatePurchases = new PurchasesFactory(null, 1, 0 == true ? 1 : 0).createPurchases(configuration, getPlatformInfo(), getProxyURL(), (120 & 8) != 0 ? null : null, (120 & 16) != 0 ? false : false, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? false : false);
            Purchases.Companion.setSharedInstance$purchases_defaultsRelease(purchasesCreatePurchases);
            return purchasesCreatePurchases;
        }

        public final Purchases getBackingFieldSharedInstance$purchases_defaultsRelease() {
            return Purchases.backingFieldSharedInstance;
        }

        public final boolean getDebugLogsEnabled() {
            return PurchasesOrchestrator.Companion.getDebugLogsEnabled();
        }

        public final String getFrameworkVersion() {
            return Purchases.frameworkVersion;
        }

        public final synchronized LogHandler getLogHandler() {
            return PurchasesOrchestrator.Companion.getLogHandler();
        }

        public final LogLevel getLogLevel() {
            return PurchasesOrchestrator.Companion.getLogLevel();
        }

        public final PlatformInfo getPlatformInfo() {
            return PurchasesOrchestrator.Companion.getPlatformInfo();
        }

        public final URL getProxyURL() {
            return PurchasesOrchestrator.Companion.getProxyURL();
        }

        public final Purchases getSharedInstance() {
            Purchases backingFieldSharedInstance$purchases_defaultsRelease = getBackingFieldSharedInstance$purchases_defaultsRelease();
            if (backingFieldSharedInstance$purchases_defaultsRelease != null) {
                return backingFieldSharedInstance$purchases_defaultsRelease;
            }
            throw new h0(ConfigureStrings.NO_SINGLETON_INSTANCE);
        }

        public final boolean isConfigured() {
            return getBackingFieldSharedInstance$purchases_defaultsRelease() != null;
        }

        public final void setBackingFieldSharedInstance$purchases_defaultsRelease(Purchases purchases) {
            Purchases.backingFieldSharedInstance = purchases;
        }

        public final void setDebugLogsEnabled(boolean z7) {
            PurchasesOrchestrator.Companion.setDebugLogsEnabled(z7);
        }

        public final synchronized void setLogHandler(LogHandler value) {
            q.f(value, "value");
            PurchasesOrchestrator.Companion.setLogHandler(value);
        }

        public final void setLogLevel(LogLevel value) {
            q.f(value, "value");
            PurchasesOrchestrator.Companion.setLogLevel(value);
        }

        public final void setPlatformInfo(PlatformInfo value) {
            q.f(value, "value");
            PurchasesOrchestrator.Companion.setPlatformInfo(value);
        }

        public final void setProxyURL(URL url) {
            PurchasesOrchestrator.Companion.setProxyURL(url);
        }

        public final void setSharedInstance$purchases_defaultsRelease(Purchases value) {
            q.f(value, "value");
            Purchases backingFieldSharedInstance$purchases_defaultsRelease = getBackingFieldSharedInstance$purchases_defaultsRelease();
            if (backingFieldSharedInstance$purchases_defaultsRelease != null) {
                backingFieldSharedInstance$purchases_defaultsRelease.close();
            }
            setBackingFieldSharedInstance$purchases_defaultsRelease(value);
        }
    }

    public Purchases(PurchasesOrchestrator purchasesOrchestrator) {
        q.f(purchasesOrchestrator, "purchasesOrchestrator");
        this.purchasesOrchestrator = purchasesOrchestrator;
    }

    public static final void canMakePayments(Context context, Callback<Boolean> callback) {
        Companion.canMakePayments(context, callback);
    }

    public static final void canMakePayments(Context context, List<? extends BillingFeature> list, Callback<Boolean> callback) {
        Companion.canMakePayments(context, list, callback);
    }

    public static final Purchases configure(PurchasesConfiguration purchasesConfiguration) {
        return Companion.configure(purchasesConfiguration);
    }

    public static /* synthetic */ void getAllowSharingPlayStoreAccount$annotations() {
    }

    public static final boolean getDebugLogsEnabled() {
        return Companion.getDebugLogsEnabled();
    }

    public static final String getFrameworkVersion() {
        return Companion.getFrameworkVersion();
    }

    public static final synchronized LogHandler getLogHandler() {
        return Companion.getLogHandler();
    }

    public static final LogLevel getLogLevel() {
        return Companion.getLogLevel();
    }

    public static final PlatformInfo getPlatformInfo() {
        return Companion.getPlatformInfo();
    }

    public static /* synthetic */ void getProducts$default(Purchases purchases, List list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            productType = null;
        }
        purchases.getProducts(list, productType, getStoreProductsCallback);
    }

    public static final URL getProxyURL() {
        return Companion.getProxyURL();
    }

    public static final Purchases getSharedInstance() {
        return Companion.getSharedInstance();
    }

    public static final boolean isConfigured() {
        return Companion.isConfigured();
    }

    public static /* synthetic */ void logIn$default(Purchases purchases, String str, LogInCallback logInCallback, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            logInCallback = null;
        }
        purchases.logIn(str, logInCallback);
    }

    public static /* synthetic */ void logOut$default(Purchases purchases, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchases.logOut(receiveCustomerInfoCallback);
    }

    public static final void setDebugLogsEnabled(boolean z7) {
        Companion.setDebugLogsEnabled(z7);
    }

    public static final synchronized void setLogHandler(LogHandler logHandler) {
        Companion.setLogHandler(logHandler);
    }

    public static final void setLogLevel(LogLevel logLevel) {
        Companion.setLogLevel(logLevel);
    }

    public static final void setPlatformInfo(PlatformInfo platformInfo) {
        Companion.setPlatformInfo(platformInfo);
    }

    public static final void setProxyURL(URL url) {
        Companion.setProxyURL(url);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showInAppMessagesIfNeeded$default(Purchases purchases, Activity activity, List list, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            list = n.b(InAppMessageType.BILLING_ISSUES);
        }
        purchases.showInAppMessagesIfNeeded(activity, list);
    }

    public static /* synthetic */ void syncPurchases$default(Purchases purchases, SyncPurchasesCallback syncPurchasesCallback, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            syncPurchasesCallback = null;
        }
        purchases.syncPurchases(syncPurchasesCallback);
    }

    public final void close() {
        this.purchasesOrchestrator.close();
    }

    public final void collectDeviceIdentifiers() {
        this.purchasesOrchestrator.collectDeviceIdentifiers();
    }

    public final synchronized boolean getAllowSharingPlayStoreAccount() {
        return this.purchasesOrchestrator.getAllowSharingPlayStoreAccount();
    }

    public final synchronized String getAppUserID() {
        return this.purchasesOrchestrator.getAppUserID();
    }

    public final void getCustomerInfo(CacheFetchPolicy fetchPolicy, ReceiveCustomerInfoCallback callback) {
        q.f(fetchPolicy, "fetchPolicy");
        q.f(callback, "callback");
        this.purchasesOrchestrator.getCustomerInfo(fetchPolicy, callback);
    }

    public final void getCustomerInfo(ReceiveCustomerInfoCallback callback) {
        q.f(callback, "callback");
        this.purchasesOrchestrator.getCustomerInfo(CacheFetchPolicy.Companion.m8default(), callback);
    }

    public final synchronized boolean getFinishTransactions() {
        return this.purchasesOrchestrator.getFinishTransactions();
    }

    public final void getNonSubscriptionSkus(List<String> productIds, GetStoreProductsCallback callback) {
        q.f(productIds, "productIds");
        q.f(callback, "callback");
        this.purchasesOrchestrator.getProductsOfTypes(w.Y(productIds), o0.a(ProductType.INAPP), callback);
    }

    public final void getOfferings(ReceiveOfferingsCallback listener) {
        q.f(listener, "listener");
        this.purchasesOrchestrator.getOfferings(listener);
    }

    public final void getProducts(List<String> productIds, ProductType productType, GetStoreProductsCallback callback) {
        q.f(productIds, "productIds");
        q.f(callback, "callback");
        this.purchasesOrchestrator.getProducts(productIds, productType, callback);
    }

    public final void getProducts(List<String> productIds, GetStoreProductsCallback callback) {
        q.f(productIds, "productIds");
        q.f(callback, "callback");
        getProducts(productIds, null, callback);
    }

    public final /* synthetic */ PurchasesOrchestrator getPurchasesOrchestrator$purchases_defaultsRelease() {
        return this.purchasesOrchestrator;
    }

    public final Store getStore() {
        return this.purchasesOrchestrator.getStore();
    }

    public final void getSubscriptionSkus(List<String> productIds, GetStoreProductsCallback callback) {
        q.f(productIds, "productIds");
        q.f(callback, "callback");
        this.purchasesOrchestrator.getProductsOfTypes(w.Y(productIds), o0.a(ProductType.SUBS), callback);
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.purchasesOrchestrator.getUpdatedCustomerInfoListener();
    }

    public final void invalidateCustomerInfoCache() {
        this.purchasesOrchestrator.invalidateCustomerInfoCache();
    }

    public final boolean isAnonymous() {
        return this.purchasesOrchestrator.isAnonymous();
    }

    public final void logIn(String newAppUserID) {
        q.f(newAppUserID, "newAppUserID");
        logIn$default(this, newAppUserID, null, 2, null);
    }

    public final void logIn(String newAppUserID, LogInCallback logInCallback) {
        q.f(newAppUserID, "newAppUserID");
        this.purchasesOrchestrator.logIn(newAppUserID, logInCallback);
    }

    public final void logOut() {
        logOut$default(this, null, 1, null);
    }

    public final void logOut(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.purchasesOrchestrator.logOut(receiveCustomerInfoCallback);
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppBackgrounded() {
        this.purchasesOrchestrator.onAppBackgrounded();
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppForegrounded() {
        this.purchasesOrchestrator.onAppForegrounded();
    }

    public final void purchase(PurchaseParams purchaseParams, PurchaseCallback callback) {
        q.f(purchaseParams, "purchaseParams");
        q.f(callback, "callback");
        this.purchasesOrchestrator.purchase(purchaseParams, callback);
    }

    public final void purchasePackage(Activity activity, Package packageToPurchase, UpgradeInfo upgradeInfo, ProductChangeCallback callback) {
        q.f(activity, "activity");
        q.f(packageToPurchase, "packageToPurchase");
        q.f(upgradeInfo, "upgradeInfo");
        q.f(callback, "callback");
        PurchasesOrchestrator purchasesOrchestrator = this.purchasesOrchestrator;
        PurchasingData purchasingData = packageToPurchase.getProduct().getPurchasingData();
        String offering = packageToPurchase.getOffering();
        String oldSku = upgradeInfo.getOldSku();
        GoogleProrationMode googleProrationModeFromPlayBillingClientMode = GoogleProrationMode.CREATOR.fromPlayBillingClientMode(upgradeInfo.getProrationMode());
        purchasesOrchestrator.startDeprecatedProductChange(activity, purchasingData, offering, oldSku, googleProrationModeFromPlayBillingClientMode != null ? googleProrationModeFromPlayBillingClientMode.getAsGoogleReplacementMode$purchases_defaultsRelease() : null, callback);
    }

    public final void purchasePackage(Activity activity, Package packageToPurchase, PurchaseCallback listener) {
        q.f(activity, "activity");
        q.f(packageToPurchase, "packageToPurchase");
        q.f(listener, "listener");
        this.purchasesOrchestrator.startPurchase(activity, packageToPurchase.getProduct().getPurchasingData(), packageToPurchase.getOffering(), null, listener);
    }

    public final void purchaseProduct(Activity activity, StoreProduct storeProduct, UpgradeInfo upgradeInfo, ProductChangeCallback listener) {
        q.f(activity, "activity");
        q.f(storeProduct, "storeProduct");
        q.f(upgradeInfo, "upgradeInfo");
        q.f(listener, "listener");
        PurchasesOrchestrator purchasesOrchestrator = this.purchasesOrchestrator;
        PurchasingData purchasingData = storeProduct.getPurchasingData();
        String oldSku = upgradeInfo.getOldSku();
        GoogleProrationMode googleProrationModeFromPlayBillingClientMode = GoogleProrationMode.CREATOR.fromPlayBillingClientMode(upgradeInfo.getProrationMode());
        purchasesOrchestrator.startDeprecatedProductChange(activity, purchasingData, null, oldSku, googleProrationModeFromPlayBillingClientMode != null ? googleProrationModeFromPlayBillingClientMode.getAsGoogleReplacementMode$purchases_defaultsRelease() : null, listener);
    }

    public final void purchaseProduct(Activity activity, StoreProduct storeProduct, PurchaseCallback callback) {
        q.f(activity, "activity");
        q.f(storeProduct, "storeProduct");
        q.f(callback, "callback");
        this.purchasesOrchestrator.startPurchase(activity, storeProduct.getPurchasingData(), null, null, callback);
    }

    public final void removeUpdatedCustomerInfoListener() {
        this.purchasesOrchestrator.removeUpdatedCustomerInfoListener();
    }

    public final void restorePurchases(ReceiveCustomerInfoCallback callback) {
        q.f(callback, "callback");
        this.purchasesOrchestrator.restorePurchases(callback);
    }

    public final void setAd(String str) {
        this.purchasesOrchestrator.setAd(str);
    }

    public final void setAdGroup(String str) {
        this.purchasesOrchestrator.setAdGroup(str);
    }

    public final void setAdjustID(String str) {
        this.purchasesOrchestrator.setAdjustID(str);
    }

    public final void setAirshipChannelID(String str) {
        this.purchasesOrchestrator.setAirshipChannelID(str);
    }

    public final synchronized void setAllowSharingPlayStoreAccount(boolean z7) {
        this.purchasesOrchestrator.setAllowSharingPlayStoreAccount(z7);
    }

    public final void setAppsflyerID(String str) {
        this.purchasesOrchestrator.setAppsflyerID(str);
    }

    public final void setAttributes(Map<String, String> attributes) {
        q.f(attributes, "attributes");
        this.purchasesOrchestrator.setAttributes(attributes);
    }

    public final void setCampaign(String str) {
        this.purchasesOrchestrator.setCampaign(str);
    }

    public final void setCleverTapID(String str) {
        this.purchasesOrchestrator.setCleverTapID(str);
    }

    public final void setCreative(String str) {
        this.purchasesOrchestrator.setCreative(str);
    }

    public final void setDisplayName(String str) {
        this.purchasesOrchestrator.setDisplayName(str);
    }

    public final void setEmail(String str) {
        this.purchasesOrchestrator.setEmail(str);
    }

    public final void setFBAnonymousID(String str) {
        this.purchasesOrchestrator.setFBAnonymousID(str);
    }

    public final synchronized void setFinishTransactions(boolean z7) {
        this.purchasesOrchestrator.setFinishTransactions(z7);
    }

    public final void setFirebaseAppInstanceID(String str) {
        this.purchasesOrchestrator.setFirebaseAppInstanceID(str);
    }

    public final void setKeyword(String str) {
        this.purchasesOrchestrator.setKeyword(str);
    }

    public final void setMediaSource(String str) {
        this.purchasesOrchestrator.setMediaSource(str);
    }

    public final void setMixpanelDistinctID(String str) {
        this.purchasesOrchestrator.setMixpanelDistinctID(str);
    }

    public final void setMparticleID(String str) {
        this.purchasesOrchestrator.setMparticleID(str);
    }

    public final void setOnesignalID(String str) {
        this.purchasesOrchestrator.setOnesignalID(str);
    }

    public final void setOnesignalUserID(String str) {
        this.purchasesOrchestrator.setOnesignalUserID(str);
    }

    public final void setPhoneNumber(String str) {
        this.purchasesOrchestrator.setPhoneNumber(str);
    }

    public final void setPushToken(String str) {
        this.purchasesOrchestrator.setPushToken(str);
    }

    public final synchronized void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        this.purchasesOrchestrator.setUpdatedCustomerInfoListener(updatedCustomerInfoListener);
    }

    public final void showInAppMessagesIfNeeded(Activity activity) {
        q.f(activity, "activity");
        showInAppMessagesIfNeeded$default(this, activity, null, 2, null);
    }

    public final void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes) {
        q.f(activity, "activity");
        q.f(inAppMessageTypes, "inAppMessageTypes");
        this.purchasesOrchestrator.showInAppMessagesIfNeeded(activity, inAppMessageTypes);
    }

    public final void syncObserverModeAmazonPurchase(String productID, String receiptID, String amazonUserID, String str, Double d8) {
        q.f(productID, "productID");
        q.f(receiptID, "receiptID");
        q.f(amazonUserID, "amazonUserID");
        this.purchasesOrchestrator.syncObserverModeAmazonPurchase(productID, receiptID, amazonUserID, str, d8);
    }

    public final void syncPurchases() {
        syncPurchases$default(this, null, 1, null);
    }

    public final void syncPurchases(SyncPurchasesCallback syncPurchasesCallback) {
        this.purchasesOrchestrator.syncPurchases(syncPurchasesCallback);
    }

    @ExperimentalPreviewRevenueCatPurchasesAPI
    public final /* synthetic */ void track(PaywallEvent paywallEvent) {
        q.f(paywallEvent, "paywallEvent");
        this.purchasesOrchestrator.track(paywallEvent);
    }
}
