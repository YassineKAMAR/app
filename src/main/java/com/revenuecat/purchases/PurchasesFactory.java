package com.revenuecat.purchases;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.preference.PreferenceManager;
import com.revenuecat.purchases.PurchasesFactory;
import com.revenuecat.purchases.common.Anonymizer;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsAnonymizer;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsFileHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.common.offerings.OfferingsFactory;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.common.offlineentitlements.OfflineCustomerInfoCalculator;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.offlineentitlements.PurchasedProductsFetcher;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallEventsManager;
import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.CoilImageDownloader;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import p6.l;
import w6.v;

/* JADX INFO: loaded from: classes.dex */
public final class PurchasesFactory {
    private final APIKeyValidator apiKeyValidator;

    /* JADX INFO: Access modifiers changed from: private */
    static final class LowPriorityThreadFactory implements ThreadFactory {
        private final String threadName;

        public LowPriorityThreadFactory(String threadName) {
            q.f(threadName, "threadName");
            this.threadName = threadName;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void newThread$lambda$1(Runnable runnable) {
            if (runnable != null) {
                Process.setThreadPriority(19);
                runnable.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            return new Thread(new Runnable() { // from class: com.revenuecat.purchases.d
                @Override // java.lang.Runnable
                public final void run() {
                    PurchasesFactory.LowPriorityThreadFactory.newThread$lambda$1(runnable);
                }
            }, this.threadName);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesFactory$createPaywallEventsManager$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends o implements l<String, PaywallStoredEvent> {
        AnonymousClass1(Object obj) {
            super(1, obj, PaywallStoredEvent.Companion.class, "fromString", "fromString(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;", 0);
        }

        @Override // p6.l
        public final PaywallStoredEvent invoke(String p02) {
            q.f(p02, "p0");
            return ((PaywallStoredEvent.Companion) this.receiver).fromString(p02);
        }
    }

    public PurchasesFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public PurchasesFactory(APIKeyValidator apiKeyValidator) {
        q.f(apiKeyValidator, "apiKeyValidator");
        this.apiKeyValidator = apiKeyValidator;
    }

    public /* synthetic */ PurchasesFactory(APIKeyValidator aPIKeyValidator, int i8, j jVar) {
        this((i8 & 1) != 0 ? new APIKeyValidator() : aPIKeyValidator);
    }

    private final ExecutorService createDefaultExecutor() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        q.e(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    private final ExecutorService createEventsExecutor() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new LowPriorityThreadFactory("revenuecat-events-thread"));
        q.e(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduled…venuecat-events-thread\"))");
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    private final PaywallEventsManager createPaywallEventsManager(Context context, IdentityManager identityManager, Dispatcher dispatcher, Backend backend) {
        if (AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            return new PaywallEventsManager(new EventsFileHelper(new FileHelper(context), PaywallEventsManager.PAYWALL_EVENTS_FILE_PATH, new AnonymousClass1(PaywallStoredEvent.Companion)), identityManager, dispatcher, backend);
        }
        LogUtilsKt.debugLog("Paywall events are only supported on Android N or newer.");
        return null;
    }

    private final Application getApplication(Context context) {
        Context applicationContext = context.getApplicationContext();
        q.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return (Application) applicationContext;
    }

    private final boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public final Purchases createPurchases(PurchasesConfiguration configuration, PlatformInfo platformInfo, URL url, BillingAbstract billingAbstract, boolean z7, boolean z8, boolean z9) {
        DiagnosticsFileHelper diagnosticsFileHelper;
        DiagnosticsTracker diagnosticsTracker;
        PurchasesStateCache purchasesStateCache;
        DiagnosticsSynchronizer diagnosticsSynchronizer;
        q.f(configuration, "configuration");
        q.f(platformInfo, "platformInfo");
        validateConfiguration(configuration);
        Application application = getApplication(configuration.getContext());
        AppConfig appConfig = new AppConfig(configuration.getContext(), configuration.getObserverMode(), configuration.getShowInAppMessagesAutomatically(), platformInfo, url, configuration.getStore(), configuration.getDangerousSettings(), z9, z7, z8);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(application);
        ETagManager eTagManager = new ETagManager(configuration.getContext(), null, null, 6, null);
        Dispatcher dispatcher = new Dispatcher(createDefaultExecutor(), null, z9, 2, null);
        ExecutorService service = configuration.getService();
        if (service == null) {
            service = createDefaultExecutor();
        }
        Dispatcher dispatcher2 = new Dispatcher(service, null, z9, 2, null);
        Dispatcher dispatcher3 = new Dispatcher(createEventsExecutor(), null, z9, 2, null);
        if (configuration.getDiagnosticsEnabled() && AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            DiagnosticsFileHelper diagnosticsFileHelper2 = new DiagnosticsFileHelper(new FileHelper(configuration.getContext()));
            diagnosticsFileHelper = diagnosticsFileHelper2;
            diagnosticsTracker = new DiagnosticsTracker(appConfig, diagnosticsFileHelper2, new DiagnosticsAnonymizer(new Anonymizer()), dispatcher3);
        } else {
            if (configuration.getDiagnosticsEnabled()) {
                LogUtilsKt.warnLog("Diagnostics are only supported on Android N or newer.");
            }
            diagnosticsFileHelper = null;
            diagnosticsTracker = null;
        }
        SigningManager signingManager = new SigningManager(SignatureVerificationMode.Companion.fromEntitlementVerificationMode$default(SignatureVerificationMode.Companion, configuration.getVerificationMode(), null, 2, null), appConfig, configuration.getApiKey());
        q.e(prefs, "prefs");
        DeviceCache deviceCache = new DeviceCache(prefs, configuration.getApiKey(), null, 4, null);
        HTTPClient hTTPClient = new HTTPClient(appConfig, eTagManager, diagnosticsTracker, signingManager, deviceCache, null, null, 96, null);
        BackendHelper backendHelper = new BackendHelper(configuration.getApiKey(), dispatcher2, appConfig, hTTPClient);
        Backend backend = new Backend(appConfig, dispatcher2, dispatcher3, hTTPClient, backendHelper);
        PurchasesStateCache purchasesStateCache2 = new PurchasesStateCache(new PurchasesState(null, null, null, false, false, 31, null));
        BillingAbstract billingAbstractCreateBilling = billingAbstract == null ? BillingFactory.INSTANCE.createBilling(configuration.getStore(), application, backendHelper, deviceCache, configuration.getObserverMode(), diagnosticsTracker, purchasesStateCache2) : billingAbstract;
        SubscriberAttributesPoster subscriberAttributesPoster = new SubscriberAttributesPoster(backendHelper);
        DeviceIdentifiersFetcher deviceIdentifiersFetcherCreateAttributionFetcher = AttributionFetcherFactory.INSTANCE.createAttributionFetcher(configuration.getStore(), dispatcher2);
        SubscriberAttributesCache subscriberAttributesCache = new SubscriberAttributesCache(deviceCache);
        SubscriberAttributesManager subscriberAttributesManager = new SubscriberAttributesManager(subscriberAttributesCache, subscriberAttributesPoster, deviceIdentifiersFetcherCreateAttributionFetcher);
        DateProvider dateProvider = null;
        int i8 = 4;
        j jVar = null;
        OfflineEntitlementsManager offlineEntitlementsManager = new OfflineEntitlementsManager(backend, new OfflineCustomerInfoCalculator(new PurchasedProductsFetcher(deviceCache, billingAbstractCreateBilling, dateProvider, i8, jVar), appConfig, dateProvider, i8, jVar), deviceCache, appConfig);
        OfferingsCache offeringsCache = new OfferingsCache(deviceCache, null, null, 6, null);
        IdentityManager identityManager = new IdentityManager(deviceCache, subscriberAttributesCache, subscriberAttributesManager, offeringsCache, backend, offlineEntitlementsManager);
        CustomerInfoUpdateHandler customerInfoUpdateHandler = new CustomerInfoUpdateHandler(deviceCache, identityManager, offlineEntitlementsManager, appConfig, null, 16, null);
        PaywallPresentedCache paywallPresentedCache = new PaywallPresentedCache();
        BillingAbstract billingAbstract2 = billingAbstractCreateBilling;
        PostReceiptHelper postReceiptHelper = new PostReceiptHelper(appConfig, backend, billingAbstract2, customerInfoUpdateHandler, deviceCache, subscriberAttributesManager, offlineEntitlementsManager, paywallPresentedCache);
        PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper = new PostTransactionWithProductDetailsHelper(billingAbstractCreateBilling, postReceiptHelper);
        PostPendingTransactionsHelper postPendingTransactionsHelper = new PostPendingTransactionsHelper(appConfig, deviceCache, billingAbstract2, dispatcher2, identityManager, postTransactionWithProductDetailsHelper);
        CustomerInfoHelper customerInfoHelper = new CustomerInfoHelper(deviceCache, backend, offlineEntitlementsManager, customerInfoUpdateHandler, postPendingTransactionsHelper, null, 32, null);
        OfferingParser offeringParserCreateOfferingParser = OfferingParserFactory.INSTANCE.createOfferingParser(configuration.getStore());
        if (diagnosticsFileHelper == null || diagnosticsTracker == null || !AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            purchasesStateCache = purchasesStateCache2;
            diagnosticsSynchronizer = null;
        } else {
            purchasesStateCache = purchasesStateCache2;
            diagnosticsSynchronizer = new DiagnosticsSynchronizer(configuration.getContext(), diagnosticsFileHelper, diagnosticsTracker, backend, dispatcher3, null, 32, null);
        }
        SyncPurchasesHelper syncPurchasesHelper = new SyncPurchasesHelper(billingAbstractCreateBilling, identityManager, customerInfoHelper, postReceiptHelper);
        OfferingsManager offeringsManager = new OfferingsManager(offeringsCache, backend, new OfferingsFactory(billingAbstractCreateBilling, offeringParserCreateOfferingParser, dispatcher), new OfferingImagePreDownloader(false, new CoilImageDownloader(application), 1, null), null, 16, null);
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, ConfigureStrings.DEBUG_ENABLED);
        String str = String.format(ConfigureStrings.SDK_VERSION, Arrays.copyOf(new Object[]{Purchases.Companion.getFrameworkVersion()}, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        String str2 = String.format(ConfigureStrings.PACKAGE_NAME, Arrays.copyOf(new Object[]{appConfig.getPackageName()}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        LogIntent logIntent2 = LogIntent.USER;
        String str3 = String.format(ConfigureStrings.INITIAL_APP_USER_ID, Arrays.copyOf(new Object[]{configuration.getAppUserID()}, 1));
        q.e(str3, "format(this, *args)");
        LogWrapperKt.log(logIntent2, str3);
        String str4 = String.format(ConfigureStrings.VERIFICATION_MODE_SELECTED, Arrays.copyOf(new Object[]{configuration.getVerificationMode().name()}, 1));
        q.e(str4, "format(this, *args)");
        LogWrapperKt.log(logIntent, str4);
        return new Purchases(new PurchasesOrchestrator(application, configuration.getAppUserID(), backend, billingAbstractCreateBilling, deviceCache, identityManager, subscriberAttributesManager, appConfig, customerInfoHelper, customerInfoUpdateHandler, diagnosticsSynchronizer, offlineEntitlementsManager, postReceiptHelper, postTransactionWithProductDetailsHelper, postPendingTransactionsHelper, syncPurchasesHelper, offeringsManager, createPaywallEventsManager(application, identityManager, dispatcher3, backend), paywallPresentedCache, purchasesStateCache, null, 1048576, null));
    }

    public final void validateConfiguration(PurchasesConfiguration configuration) {
        q.f(configuration, "configuration");
        if (!hasPermission(configuration.getContext(), "android.permission.INTERNET")) {
            throw new IllegalArgumentException("Purchases requires INTERNET permission.".toString());
        }
        if (!(!v.p(configuration.getApiKey()))) {
            throw new IllegalArgumentException("API key must be set. Get this from the RevenueCat web app".toString());
        }
        if (!(configuration.getContext().getApplicationContext() instanceof Application)) {
            throw new IllegalArgumentException("Needs an application context.".toString());
        }
        this.apiKeyValidator.validateAndLog(configuration.getApiKey(), configuration.getStore());
    }
}
