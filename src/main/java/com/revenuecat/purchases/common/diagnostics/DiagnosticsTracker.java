package com.revenuecat.purchases.common.diagnostics;

import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.EventsFileHelper;
import e6.r;
import e6.x;
import f6.k0;
import java.io.IOException;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticsTracker {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String ENDPOINT_NAME_KEY = "endpoint_name";

    @Deprecated
    public static final String ETAG_HIT_KEY = "etag_hit";

    @Deprecated
    public static final String PRODUCT_TYPE_QUERIED_KEY = "product_type_queried";

    @Deprecated
    public static final String RESPONSE_CODE_KEY = "response_code";

    @Deprecated
    public static final String RESPONSE_TIME_MILLIS_KEY = "response_time_millis";

    @Deprecated
    public static final String SUCCESSFUL_KEY = "successful";

    @Deprecated
    public static final String VERIFICATION_RESULT_KEY = "verification_result";
    private final AppConfig appConfig;
    private final DiagnosticsAnonymizer diagnosticsAnonymizer;
    private final Dispatcher diagnosticsDispatcher;
    private final EventsFileHelper<DiagnosticsEntry> diagnosticsFileHelper;

    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public DiagnosticsTracker(AppConfig appConfig, EventsFileHelper<DiagnosticsEntry> diagnosticsFileHelper, DiagnosticsAnonymizer diagnosticsAnonymizer, Dispatcher diagnosticsDispatcher) {
        q.f(appConfig, "appConfig");
        q.f(diagnosticsFileHelper, "diagnosticsFileHelper");
        q.f(diagnosticsAnonymizer, "diagnosticsAnonymizer");
        q.f(diagnosticsDispatcher, "diagnosticsDispatcher");
        this.appConfig = appConfig;
        this.diagnosticsFileHelper = diagnosticsFileHelper;
        this.diagnosticsAnonymizer = diagnosticsAnonymizer;
        this.diagnosticsDispatcher = diagnosticsDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trackEvent$lambda$0(DiagnosticsTracker this$0, DiagnosticsEntry diagnosticsEntry) {
        q.f(this$0, "this$0");
        q.f(diagnosticsEntry, "$diagnosticsEntry");
        this$0.trackEventInCurrentThread$purchases_defaultsRelease(diagnosticsEntry);
    }

    public static /* synthetic */ void trackMaxEventsStoredLimitReached$default(DiagnosticsTracker diagnosticsTracker, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = true;
        }
        diagnosticsTracker.trackMaxEventsStoredLimitReached(z7);
    }

    public final void trackEvent(final DiagnosticsEntry diagnosticsEntry) {
        q.f(diagnosticsEntry, "diagnosticsEntry");
        Dispatcher.enqueue$default(this.diagnosticsDispatcher, new Runnable() { // from class: com.revenuecat.purchases.common.diagnostics.b
            @Override // java.lang.Runnable
            public final void run() {
                DiagnosticsTracker.trackEvent$lambda$0(this.f20888a, diagnosticsEntry);
            }
        }, null, 2, null);
    }

    public final void trackEventInCurrentThread$purchases_defaultsRelease(DiagnosticsEntry diagnosticsEntry) {
        q.f(diagnosticsEntry, "diagnosticsEntry");
        if (AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            DiagnosticsEntry diagnosticsEntryAnonymizeEntryIfNeeded = this.diagnosticsAnonymizer.anonymizeEntryIfNeeded(diagnosticsEntry);
            LogUtilsKt.verboseLog("Tracking diagnostics event: " + diagnosticsEntryAnonymizeEntryIfNeeded);
            try {
                this.diagnosticsFileHelper.appendEvent(diagnosticsEntryAnonymizeEntryIfNeeded);
            } catch (IOException e8) {
                LogUtilsKt.verboseLog("Error tracking diagnostics event: " + e8);
            }
        }
    }

    /* JADX INFO: renamed from: trackGoogleQueryProductDetailsRequest-Wn2Vu4Y, reason: not valid java name */
    public final void m15trackGoogleQueryProductDetailsRequestWn2Vu4Y(String productType, int i8, String billingDebugMessage, long j8) {
        q.f(productType, "productType");
        q.f(billingDebugMessage, "billingDebugMessage");
        trackEvent(new DiagnosticsEntry.Event(DiagnosticsEventName.GOOGLE_QUERY_PRODUCT_DETAILS_REQUEST, k0.g(x.a(PRODUCT_TYPE_QUERIED_KEY, productType), x.a("billing_response_code", Integer.valueOf(i8)), x.a("billing_debug_message", billingDebugMessage), x.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(x6.a.u(j8)))), null, null, 12, null));
    }

    /* JADX INFO: renamed from: trackGoogleQueryPurchaseHistoryRequest-Wn2Vu4Y, reason: not valid java name */
    public final void m16trackGoogleQueryPurchaseHistoryRequestWn2Vu4Y(String productType, int i8, String billingDebugMessage, long j8) {
        q.f(productType, "productType");
        q.f(billingDebugMessage, "billingDebugMessage");
        trackEvent(new DiagnosticsEntry.Event(DiagnosticsEventName.GOOGLE_QUERY_PURCHASE_HISTORY_REQUEST, k0.g(x.a(PRODUCT_TYPE_QUERIED_KEY, productType), x.a("billing_response_code", Integer.valueOf(i8)), x.a("billing_debug_message", billingDebugMessage), x.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(x6.a.u(j8)))), null, null, 12, null));
    }

    /* JADX INFO: renamed from: trackGoogleQueryPurchasesRequest-Wn2Vu4Y, reason: not valid java name */
    public final void m17trackGoogleQueryPurchasesRequestWn2Vu4Y(String productType, int i8, String billingDebugMessage, long j8) {
        q.f(productType, "productType");
        q.f(billingDebugMessage, "billingDebugMessage");
        trackEvent(new DiagnosticsEntry.Event(DiagnosticsEventName.GOOGLE_QUERY_PURCHASES_REQUEST, k0.g(x.a(PRODUCT_TYPE_QUERIED_KEY, productType), x.a("billing_response_code", Integer.valueOf(i8)), x.a("billing_debug_message", billingDebugMessage), x.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(x6.a.u(j8)))), null, null, 12, null));
    }

    /* JADX INFO: renamed from: trackHttpRequestPerformed-NcHsxvU, reason: not valid java name */
    public final void m18trackHttpRequestPerformedNcHsxvU(Endpoint endpoint, long j8, boolean z7, int i8, HTTPResult.Origin origin, VerificationResult verificationResult) {
        q.f(endpoint, "endpoint");
        q.f(verificationResult, "verificationResult");
        boolean z8 = origin == HTTPResult.Origin.CACHE;
        trackEvent(new DiagnosticsEntry.Event(DiagnosticsEventName.HTTP_REQUEST_PERFORMED, k0.g(x.a(ENDPOINT_NAME_KEY, endpoint.getName()), x.a(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(x6.a.u(j8))), x.a(SUCCESSFUL_KEY, Boolean.valueOf(z7)), x.a(RESPONSE_CODE_KEY, Integer.valueOf(i8)), x.a(ETAG_HIT_KEY, Boolean.valueOf(z8)), x.a(VERIFICATION_RESULT_KEY, verificationResult.name())), null, null, 12, null));
        trackEvent(new DiagnosticsEntry.Counter(DiagnosticsCounterName.HTTP_REQUEST_PERFORMED, k0.g(x.a(ENDPOINT_NAME_KEY, endpoint.getName()), x.a(SUCCESSFUL_KEY, String.valueOf(z7)), x.a(RESPONSE_CODE_KEY, String.valueOf(i8)), x.a(ETAG_HIT_KEY, String.valueOf(z8)), x.a(VERIFICATION_RESULT_KEY, verificationResult.name())), 1));
    }

    public final void trackMaxEventsStoredLimitReached(boolean z7) {
        DiagnosticsEntry.Event event = new DiagnosticsEntry.Event(DiagnosticsEventName.MAX_EVENTS_STORED_LIMIT_REACHED, k0.e(), null, null, 12, null);
        if (z7) {
            trackEventInCurrentThread$purchases_defaultsRelease(event);
        } else {
            trackEvent(event);
        }
    }

    public final void trackProductDetailsNotSupported(int i8, String billingDebugMessage) {
        q.f(billingDebugMessage, "billingDebugMessage");
        DiagnosticsCounterName diagnosticsCounterName = DiagnosticsCounterName.PRODUCT_DETAILS_NOT_SUPPORTED;
        r[] rVarArr = new r[4];
        String playStoreVersionName = this.appConfig.getPlayStoreVersionName();
        if (playStoreVersionName == null) {
            playStoreVersionName = "";
        }
        rVarArr[0] = x.a("play_store_version", playStoreVersionName);
        String playServicesVersionName = this.appConfig.getPlayServicesVersionName();
        rVarArr[1] = x.a("play_services_version", playServicesVersionName != null ? playServicesVersionName : "");
        rVarArr[2] = x.a("billing_response_code", String.valueOf(i8));
        rVarArr[3] = x.a("billing_debug_message", billingDebugMessage);
        trackEvent(new DiagnosticsEntry.Counter(diagnosticsCounterName, k0.g(rVarArr), 1));
    }
}
