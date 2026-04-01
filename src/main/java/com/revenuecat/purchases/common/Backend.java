package com.revenuecat.purchases.common;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.models.GoogleProrationMode;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.events.PaywallEventRequest;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.JsonElementExtensionsKt;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import e6.i0;
import e6.r;
import e6.x;
import f6.j0;
import f6.k0;
import f6.n;
import f6.o;
import f6.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p6.l;
import p6.p;
import p6.q;

/* JADX INFO: loaded from: classes.dex */
public final class Backend {

    @Deprecated
    public static final String APP_USER_ID = "app_user_id";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String FETCH_TOKEN = "fetch_token";

    @Deprecated
    public static final String NEW_APP_USER_ID = "new_app_user_id";
    private final AppConfig appConfig;
    private final BackendHelper backendHelper;
    private volatile Map<BackgroundAwareCallbackCacheKey, List<r<l<CustomerInfo, i0>, p<PurchasesError, Boolean, i0>>>> callbacks;
    private volatile Map<List<String>, List<r<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>>> diagnosticsCallbacks;
    private final Dispatcher dispatcher;
    private final Dispatcher eventsDispatcher;
    private final HTTPClient httpClient;
    private volatile Map<List<String>, List<r<p<CustomerInfo, Boolean, i0>, l<PurchasesError, i0>>>> identifyCallbacks;
    private volatile Map<BackgroundAwareCallbackCacheKey, List<r<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>>> offeringsCallbacks;
    private volatile Map<List<String>, List<r<p6.a<i0>, p<PurchasesError, Boolean, i0>>>> paywallEventsCallbacks;
    private volatile Map<List<String>, List<r<p<CustomerInfo, JSONObject, i0>, q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0>>>> postReceiptCallbacks;
    private volatile Map<String, List<r<l<ProductEntitlementMapping, i0>, l<PurchasesError, i0>>>> productEntitlementCallbacks;

    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public Backend(AppConfig appConfig, Dispatcher dispatcher, Dispatcher eventsDispatcher, HTTPClient httpClient, BackendHelper backendHelper) {
        kotlin.jvm.internal.q.f(appConfig, "appConfig");
        kotlin.jvm.internal.q.f(dispatcher, "dispatcher");
        kotlin.jvm.internal.q.f(eventsDispatcher, "eventsDispatcher");
        kotlin.jvm.internal.q.f(httpClient, "httpClient");
        kotlin.jvm.internal.q.f(backendHelper, "backendHelper");
        this.appConfig = appConfig;
        this.dispatcher = dispatcher;
        this.eventsDispatcher = eventsDispatcher;
        this.httpClient = httpClient;
        this.backendHelper = backendHelper;
        this.callbacks = new LinkedHashMap();
        this.postReceiptCallbacks = new LinkedHashMap();
        this.offeringsCallbacks = new LinkedHashMap();
        this.identifyCallbacks = new LinkedHashMap();
        this.diagnosticsCallbacks = new LinkedHashMap();
        this.paywallEventsCallbacks = new LinkedHashMap();
        this.productEntitlementCallbacks = new LinkedHashMap();
    }

    private final synchronized <S, E> void addBackgroundAwareCallback(Map<BackgroundAwareCallbackCacheKey, List<r<S, E>>> map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, r<? extends S, ? extends E> rVar, Delay delay) {
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2;
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKeyCopy$default = BackgroundAwareCallbackCacheKey.copy$default(backgroundAwareCallbackCacheKey, null, false, 1, null);
        boolean zContainsKey = map.containsKey(backgroundAwareCallbackCacheKeyCopy$default);
        if (backgroundAwareCallbackCacheKey.getAppInBackground() && zContainsKey) {
            String str = String.format(NetworkStrings.SAME_CALL_SCHEDULED_WITHOUT_JITTER, Arrays.copyOf(new Object[]{backgroundAwareCallbackCacheKeyCopy$default}, 1));
            kotlin.jvm.internal.q.e(str, "format(this, *args)");
            LogUtilsKt.debugLog(str);
            backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKeyCopy$default;
        } else {
            backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
        }
        addCallback(map, asyncCall, dispatcher, backgroundAwareCallbackCacheKey2, rVar, delay);
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKeyCopy$default2 = BackgroundAwareCallbackCacheKey.copy$default(backgroundAwareCallbackCacheKey, null, true, 1, null);
        boolean zContainsKey2 = map.containsKey(backgroundAwareCallbackCacheKeyCopy$default);
        if (!backgroundAwareCallbackCacheKey.getAppInBackground() && zContainsKey2) {
            String str2 = String.format(NetworkStrings.SAME_CALL_SCHEDULED_WITH_JITTER, Arrays.copyOf(new Object[]{backgroundAwareCallbackCacheKeyCopy$default}, 1));
            kotlin.jvm.internal.q.e(str2, "format(this, *args)");
            LogUtilsKt.debugLog(str2);
            List<r<S, E>> listRemove = map.remove(backgroundAwareCallbackCacheKeyCopy$default2);
            if (listRemove != null) {
                List<r<S, E>> list = listRemove.isEmpty() ^ true ? listRemove : null;
                if (list != null) {
                    if (map.containsKey(backgroundAwareCallbackCacheKey)) {
                        List<r<S, E>> list2 = map.get(backgroundAwareCallbackCacheKey);
                        if (list2 != null) {
                            list2.addAll(list);
                        }
                    } else {
                        map.put(backgroundAwareCallbackCacheKey, list);
                    }
                }
            }
        }
    }

    static /* synthetic */ void addBackgroundAwareCallback$default(Backend backend, Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, r rVar, Delay delay, int i8, Object obj) {
        if ((i8 & 16) != 0) {
            delay = Delay.NONE;
        }
        backend.addBackgroundAwareCallback(map, asyncCall, dispatcher, backgroundAwareCallbackCacheKey, rVar, delay);
    }

    private final <K, S, E> void addCallback(Map<K, List<r<S, E>>> map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, K k8, r<? extends S, ? extends E> rVar, Delay delay) {
        if (!map.containsKey(k8)) {
            map.put(k8, o.j(rVar));
            this.backendHelper.enqueue(asyncCall, dispatcher, delay);
            return;
        }
        c0 c0Var = c0.f24298a;
        String str = String.format(NetworkStrings.SAME_CALL_ALREADY_IN_PROGRESS, Arrays.copyOf(new Object[]{k8}, 1));
        kotlin.jvm.internal.q.e(str, "format(format, *args)");
        LogUtilsKt.debugLog(str);
        List<r<S, E>> list = map.get(k8);
        kotlin.jvm.internal.q.c(list);
        list.add(rVar);
    }

    static /* synthetic */ void addCallback$default(Backend backend, Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, Object obj, r rVar, Delay delay, int i8, Object obj2) {
        if ((i8 & 16) != 0) {
            delay = Delay.NONE;
        }
        backend.addCallback(map, asyncCall, dispatcher, obj, rVar, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostReceiptErrorHandlingBehavior determinePostReceiptErrorHandlingBehavior(int i8, PurchasesError purchasesError) {
        return RCHTTPStatusCodes.INSTANCE.isServerError(i8) ? PostReceiptErrorHandlingBehavior.SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME : purchasesError.getCode() == PurchasesErrorCode.UnsupportedError ? PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME : PostReceiptErrorHandlingBehavior.SHOULD_BE_CONSUMED;
    }

    public final void clearCaches() {
        this.httpClient.clearCaches();
    }

    public final void close() {
        this.dispatcher.close();
    }

    public final synchronized Map<BackgroundAwareCallbackCacheKey, List<r<l<CustomerInfo, i0>, p<PurchasesError, Boolean, i0>>>> getCallbacks() {
        return this.callbacks;
    }

    public final void getCustomerInfo(String appUserID, boolean z7, l<? super CustomerInfo, i0> onSuccess, p<? super PurchasesError, ? super Boolean, i0> onError) {
        final BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey;
        kotlin.jvm.internal.q.f(appUserID, "appUserID");
        kotlin.jvm.internal.q.f(onSuccess, "onSuccess");
        kotlin.jvm.internal.q.f(onError, "onError");
        final Endpoint.GetCustomerInfo getCustomerInfo = new Endpoint.GetCustomerInfo(appUserID);
        String path = getCustomerInfo.getPath();
        synchronized (this) {
            backgroundAwareCallbackCacheKey = this.postReceiptCallbacks.isEmpty() ? new BackgroundAwareCallbackCacheKey(n.b(path), z7) : new BackgroundAwareCallbackCacheKey(w.L(n.b(path), String.valueOf(this.callbacks.size())), z7);
        }
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getCustomerInfo$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return this.this$0.httpClient.performRequest(this.this$0.appConfig.getBaseURL(), getCustomerInfo, null, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), (32 & 32) != 0 ? false : false);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) {
                List<r<l<CustomerInfo, i0>, p<PurchasesError, Boolean, i0>>> listRemove;
                kotlin.jvm.internal.q.f(result, "result");
                Backend backend = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend) {
                    listRemove = backend.getCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        r rVar = (r) it.next();
                        l lVar = (l) rVar.a();
                        p pVar = (p) rVar.b();
                        try {
                            if (BackendHelperKt.isSuccessful(result)) {
                                lVar.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(result));
                            } else {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                                LogUtilsKt.errorLog(purchasesError);
                                pVar.invoke(purchasesError, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(result.getResponseCode())));
                            }
                        } catch (JSONException e8) {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e8);
                            LogUtilsKt.errorLog(purchasesError2);
                            pVar.invoke(purchasesError2, Boolean.FALSE);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<r<l<CustomerInfo, i0>, p<PurchasesError, Boolean, i0>>> listRemove;
                kotlin.jvm.internal.q.f(error, "error");
                Backend backend = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend) {
                    listRemove = backend.getCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((p) ((r) it.next()).b()).invoke(error, Boolean.FALSE);
                    }
                }
            }
        };
        synchronized (this) {
            addBackgroundAwareCallback(this.callbacks, asyncCall, this.dispatcher, backgroundAwareCallbackCacheKey, x.a(onSuccess, onError), z7 ? Delay.DEFAULT : Delay.NONE);
            i0 i0Var = i0.f21430a;
        }
    }

    public final synchronized Map<List<String>, List<r<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>>> getDiagnosticsCallbacks() {
        return this.diagnosticsCallbacks;
    }

    public final synchronized Map<List<String>, List<r<p<CustomerInfo, Boolean, i0>, l<PurchasesError, i0>>>> getIdentifyCallbacks() {
        return this.identifyCallbacks;
    }

    public final void getOfferings(String appUserID, boolean z7, l<? super JSONObject, i0> onSuccess, p<? super PurchasesError, ? super Boolean, i0> onError) {
        kotlin.jvm.internal.q.f(appUserID, "appUserID");
        kotlin.jvm.internal.q.f(onSuccess, "onSuccess");
        kotlin.jvm.internal.q.f(onError, "onError");
        final Endpoint.GetOfferings getOfferings = new Endpoint.GetOfferings(appUserID);
        final BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(n.b(getOfferings.getPath()), z7);
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getOfferings$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return this.this$0.httpClient.performRequest(this.this$0.appConfig.getBaseURL(), getOfferings, null, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), (32 & 32) != 0 ? false : false);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) throws JSONException {
                List<r<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>> listRemove;
                PurchasesError purchasesError;
                Boolean boolValueOf;
                kotlin.jvm.internal.q.f(result, "result");
                Backend backend = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend) {
                    listRemove = backend.getOfferingsCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        r rVar = (r) it.next();
                        l lVar = (l) rVar.a();
                        p pVar = (p) rVar.b();
                        if (BackendHelperKt.isSuccessful(result)) {
                            try {
                                lVar.invoke(result.getBody());
                            } catch (JSONException e8) {
                                purchasesError = ErrorsKt.toPurchasesError(e8);
                                LogUtilsKt.errorLog(purchasesError);
                                boolValueOf = Boolean.FALSE;
                                pVar.invoke(purchasesError, boolValueOf);
                            }
                        } else {
                            purchasesError = ErrorsKt.toPurchasesError(result);
                            LogUtilsKt.errorLog(purchasesError);
                            boolValueOf = Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(result.getResponseCode()));
                        }
                        pVar.invoke(purchasesError, boolValueOf);
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<r<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>> listRemove;
                kotlin.jvm.internal.q.f(error, "error");
                Backend backend = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend) {
                    listRemove = backend.getOfferingsCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((p) ((r) it.next()).b()).invoke(error, Boolean.FALSE);
                    }
                }
            }
        };
        synchronized (this) {
            addBackgroundAwareCallback(this.offeringsCallbacks, asyncCall, this.dispatcher, backgroundAwareCallbackCacheKey, x.a(onSuccess, onError), z7 ? Delay.DEFAULT : Delay.NONE);
            i0 i0Var = i0.f21430a;
        }
    }

    public final synchronized Map<BackgroundAwareCallbackCacheKey, List<r<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>>> getOfferingsCallbacks() {
        return this.offeringsCallbacks;
    }

    public final synchronized Map<List<String>, List<r<p6.a<i0>, p<PurchasesError, Boolean, i0>>>> getPaywallEventsCallbacks() {
        return this.paywallEventsCallbacks;
    }

    public final synchronized Map<List<String>, List<r<p<CustomerInfo, JSONObject, i0>, q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0>>>> getPostReceiptCallbacks() {
        return this.postReceiptCallbacks;
    }

    public final synchronized Map<String, List<r<l<ProductEntitlementMapping, i0>, l<PurchasesError, i0>>>> getProductEntitlementCallbacks() {
        return this.productEntitlementCallbacks;
    }

    public final void getProductEntitlementMapping(l<? super ProductEntitlementMapping, i0> onSuccessHandler, l<? super PurchasesError, i0> onErrorHandler) {
        kotlin.jvm.internal.q.f(onSuccessHandler, "onSuccessHandler");
        kotlin.jvm.internal.q.f(onErrorHandler, "onErrorHandler");
        final Endpoint.GetProductEntitlementMapping getProductEntitlementMapping = Endpoint.GetProductEntitlementMapping.INSTANCE;
        final String path = getProductEntitlementMapping.getPath();
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getProductEntitlementMapping$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return this.this$0.httpClient.performRequest(this.this$0.appConfig.getBaseURL(), getProductEntitlementMapping, null, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), (32 & 32) != 0 ? false : false);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) throws JSONException {
                List<r<l<ProductEntitlementMapping, i0>, l<PurchasesError, i0>>> listRemove;
                PurchasesError purchasesError;
                kotlin.jvm.internal.q.f(result, "result");
                Backend backend = this.this$0;
                String str = path;
                synchronized (backend) {
                    listRemove = backend.getProductEntitlementCallbacks().remove(str);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        r rVar = (r) it.next();
                        l lVar = (l) rVar.a();
                        l lVar2 = (l) rVar.b();
                        if (BackendHelperKt.isSuccessful(result)) {
                            try {
                                lVar.invoke(ProductEntitlementMapping.Companion.fromJson(result.getBody()));
                            } catch (JSONException e8) {
                                purchasesError = ErrorsKt.toPurchasesError(e8);
                                LogUtilsKt.errorLog(purchasesError);
                                lVar2.invoke(purchasesError);
                            }
                        } else {
                            purchasesError = ErrorsKt.toPurchasesError(result);
                        }
                        LogUtilsKt.errorLog(purchasesError);
                        lVar2.invoke(purchasesError);
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<r<l<ProductEntitlementMapping, i0>, l<PurchasesError, i0>>> listRemove;
                kotlin.jvm.internal.q.f(error, "error");
                Backend backend = this.this$0;
                String str = path;
                synchronized (backend) {
                    listRemove = backend.getProductEntitlementCallbacks().remove(str);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((l) ((r) it.next()).b()).invoke(error);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback(this.productEntitlementCallbacks, asyncCall, this.dispatcher, path, x.a(onSuccessHandler, onErrorHandler), Delay.LONG);
            i0 i0Var = i0.f21430a;
        }
    }

    public final SignatureVerificationMode getVerificationMode() {
        return this.httpClient.getSigningManager().getSignatureVerificationMode();
    }

    public final void logIn(final String appUserID, final String newAppUserID, p<? super CustomerInfo, ? super Boolean, i0> onSuccessHandler, l<? super PurchasesError, i0> onErrorHandler) {
        kotlin.jvm.internal.q.f(appUserID, "appUserID");
        kotlin.jvm.internal.q.f(newAppUserID, "newAppUserID");
        kotlin.jvm.internal.q.f(onSuccessHandler, "onSuccessHandler");
        kotlin.jvm.internal.q.f(onErrorHandler, "onErrorHandler");
        final List listI = o.i(appUserID, newAppUserID);
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$logIn$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return this.httpClient.performRequest(this.appConfig.getBaseURL(), Endpoint.LogIn.INSTANCE, k0.g(x.a(Backend.APP_USER_ID, appUserID), x.a(Backend.NEW_APP_USER_ID, newAppUserID)), o.g(x.a(Backend.APP_USER_ID, appUserID), x.a(Backend.NEW_APP_USER_ID, newAppUserID)), this.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), (32 & 32) != 0 ? false : false);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) throws JSONException {
                List<r<p<CustomerInfo, Boolean, i0>, l<PurchasesError, i0>>> listRemove;
                kotlin.jvm.internal.q.f(result, "result");
                if (!BackendHelperKt.isSuccessful(result)) {
                    PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                    LogUtilsKt.errorLog(purchasesError);
                    onError(purchasesError);
                    return;
                }
                Backend backend = this;
                List<String> list = listI;
                synchronized (backend) {
                    listRemove = backend.getIdentifyCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        r rVar = (r) it.next();
                        p pVar = (p) rVar.a();
                        l lVar = (l) rVar.b();
                        boolean z7 = result.getResponseCode() == 201;
                        if (result.getBody().length() > 0) {
                            pVar.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(result), Boolean.valueOf(z7));
                        } else {
                            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.UnknownError, null, 2, null);
                            LogUtilsKt.errorLog(purchasesError2);
                            lVar.invoke(purchasesError2);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<r<p<CustomerInfo, Boolean, i0>, l<PurchasesError, i0>>> listRemove;
                kotlin.jvm.internal.q.f(error, "error");
                Backend backend = this;
                List<String> list = listI;
                synchronized (backend) {
                    listRemove = backend.getIdentifyCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((l) ((r) it.next()).b()).invoke(error);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback$default(this, this.identifyCallbacks, asyncCall, this.dispatcher, listI, x.a(onSuccessHandler, onErrorHandler), null, 16, null);
            i0 i0Var = i0.f21430a;
        }
    }

    public final void postDiagnostics(List<? extends JSONObject> diagnosticsList, l<? super JSONObject, i0> onSuccessHandler, p<? super PurchasesError, ? super Boolean, i0> onErrorHandler) {
        kotlin.jvm.internal.q.f(diagnosticsList, "diagnosticsList");
        kotlin.jvm.internal.q.f(onSuccessHandler, "onSuccessHandler");
        kotlin.jvm.internal.q.f(onErrorHandler, "onErrorHandler");
        final ArrayList arrayList = new ArrayList(f6.p.m(diagnosticsList, 10));
        Iterator<T> it = diagnosticsList.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((JSONObject) it.next()).hashCode()));
        }
        final Map mapC = j0.c(x.a("entries", new JSONArray((Collection) diagnosticsList)));
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$postDiagnostics$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return this.this$0.httpClient.performRequest(AppConfig.Companion.getDiagnosticsURL(), Endpoint.PostDiagnostics.INSTANCE, mapC, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), (32 & 32) != 0 ? false : false);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) throws JSONException {
                List<r<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>> listRemove;
                kotlin.jvm.internal.q.f(result, "result");
                Backend backend = this.this$0;
                List<String> list = arrayList;
                synchronized (backend) {
                    listRemove = backend.getDiagnosticsCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it2 = listRemove.iterator();
                    while (it2.hasNext()) {
                        r rVar = (r) it2.next();
                        l lVar = (l) rVar.a();
                        p pVar = (p) rVar.b();
                        if (BackendHelperKt.isSuccessful(result)) {
                            lVar.invoke(result.getBody());
                        } else {
                            PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                            pVar.invoke(purchasesError, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(result.getResponseCode()) || purchasesError.getCode() == PurchasesErrorCode.NetworkError));
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<r<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>> listRemove;
                kotlin.jvm.internal.q.f(error, "error");
                Backend backend = this.this$0;
                List<String> list = arrayList;
                synchronized (backend) {
                    listRemove = backend.getDiagnosticsCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it2 = listRemove.iterator();
                    while (it2.hasNext()) {
                        ((p) ((r) it2.next()).b()).invoke(error, Boolean.valueOf(error.getCode() == PurchasesErrorCode.NetworkError));
                    }
                }
            }
        };
        synchronized (this) {
            addCallback(this.diagnosticsCallbacks, asyncCall, this.eventsDispatcher, arrayList, x.a(onSuccessHandler, onErrorHandler), Delay.LONG);
            i0 i0Var = i0.f21430a;
        }
    }

    public final void postPaywallEvents(final PaywallEventRequest paywallEventRequest, p6.a<i0> onSuccessHandler, p<? super PurchasesError, ? super Boolean, i0> onErrorHandler) {
        kotlin.jvm.internal.q.f(paywallEventRequest, "paywallEventRequest");
        kotlin.jvm.internal.q.f(onSuccessHandler, "onSuccessHandler");
        kotlin.jvm.internal.q.f(onErrorHandler, "onErrorHandler");
        n7.a json = PaywallEventRequest.Companion.getJson();
        i7.b<Object> bVarB = i7.l.b(json.a(), z.g(PaywallEventRequest.class));
        kotlin.jvm.internal.q.d(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        final Map<String, Object> mapAsMap = JsonElementExtensionsKt.asMap(json.d(bVarB, paywallEventRequest));
        if (mapAsMap == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, "Error encoding paywall event request");
            LogUtilsKt.errorLog(purchasesError);
            onErrorHandler.invoke(purchasesError, Boolean.TRUE);
        } else {
            Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$postPaywallEvents$call$1
                @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
                public HTTPResult call() {
                    return this.this$0.httpClient.performRequest(AppConfig.Companion.getPaywallEventsURL(), Endpoint.PostPaywallEvents.INSTANCE, mapAsMap, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), (32 & 32) != 0 ? false : false);
                }

                @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
                public void onCompletion(HTTPResult result) {
                    List<r<p6.a<i0>, p<PurchasesError, Boolean, i0>>> listRemove;
                    kotlin.jvm.internal.q.f(result, "result");
                    Backend backend = this.this$0;
                    PaywallEventRequest paywallEventRequest2 = paywallEventRequest;
                    synchronized (backend) {
                        listRemove = backend.getPaywallEventsCallbacks().remove(paywallEventRequest2.getCacheKey());
                    }
                    if (listRemove != null) {
                        Iterator<T> it = listRemove.iterator();
                        while (it.hasNext()) {
                            r rVar = (r) it.next();
                            p6.a aVar = (p6.a) rVar.a();
                            p pVar = (p) rVar.b();
                            if (BackendHelperKt.isSuccessful(result)) {
                                aVar.invoke();
                            } else {
                                pVar.invoke(ErrorsKt.toPurchasesError(result), Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isSynced(result.getResponseCode())));
                            }
                        }
                    }
                }

                @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
                public void onError(PurchasesError error) {
                    List<r<p6.a<i0>, p<PurchasesError, Boolean, i0>>> listRemove;
                    kotlin.jvm.internal.q.f(error, "error");
                    Backend backend = this.this$0;
                    PaywallEventRequest paywallEventRequest2 = paywallEventRequest;
                    synchronized (backend) {
                        listRemove = backend.getPaywallEventsCallbacks().remove(paywallEventRequest2.getCacheKey());
                    }
                    if (listRemove != null) {
                        Iterator<T> it = listRemove.iterator();
                        while (it.hasNext()) {
                            ((p) ((r) it.next()).b()).invoke(error, Boolean.TRUE);
                        }
                    }
                }
            };
            synchronized (this) {
                addCallback(this.paywallEventsCallbacks, asyncCall, this.eventsDispatcher, paywallEventRequest.getCacheKey(), x.a(onSuccessHandler, onErrorHandler), Delay.LONG);
                i0 i0Var = i0.f21430a;
            }
        }
    }

    public final void postReceiptData(String purchaseToken, String appUserID, boolean z7, boolean z8, Map<String, ? extends Map<String, ? extends Object>> map, ReceiptInfo receiptInfo, String str, String str2, PostReceiptInitiationSource initiationSource, PaywallPostReceiptData paywallPostReceiptData, p<? super CustomerInfo, ? super JSONObject, i0> onSuccess, q<? super PurchasesError, ? super PostReceiptErrorHandlingBehavior, ? super JSONObject, i0> onError) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Price price;
        GoogleProrationMode asGoogleProrationMode$purchases_defaultsRelease;
        kotlin.jvm.internal.q.f(purchaseToken, "purchaseToken");
        kotlin.jvm.internal.q.f(appUserID, "appUserID");
        Map<String, ? extends Map<String, ? extends Object>> subscriberAttributes = map;
        kotlin.jvm.internal.q.f(subscriberAttributes, "subscriberAttributes");
        kotlin.jvm.internal.q.f(receiptInfo, "receiptInfo");
        kotlin.jvm.internal.q.f(initiationSource, "initiationSource");
        kotlin.jvm.internal.q.f(onSuccess, "onSuccess");
        kotlin.jvm.internal.q.f(onError, "onError");
        final List listI = o.i(purchaseToken, appUserID, String.valueOf(z7), String.valueOf(z8), map.toString(), receiptInfo.toString(), str);
        r[] rVarArr = new r[16];
        rVarArr[0] = x.a(FETCH_TOKEN, purchaseToken);
        rVarArr[1] = x.a("product_ids", receiptInfo.getProductIDs());
        List<PlatformProductId> platformProductIds$purchases_defaultsRelease = receiptInfo.getPlatformProductIds$purchases_defaultsRelease();
        String formatted = null;
        if (platformProductIds$purchases_defaultsRelease != null) {
            arrayList = new ArrayList(f6.p.m(platformProductIds$purchases_defaultsRelease, 10));
            Iterator<T> it = platformProductIds$purchases_defaultsRelease.iterator();
            while (it.hasNext()) {
                arrayList.add(((PlatformProductId) it.next()).getAsMap());
            }
        } else {
            arrayList = null;
        }
        rVarArr[2] = x.a("platform_product_ids", arrayList);
        rVarArr[3] = x.a(APP_USER_ID, appUserID);
        rVarArr[4] = x.a("is_restore", Boolean.valueOf(z7));
        rVarArr[5] = x.a("presented_offering_identifier", receiptInfo.getOfferingIdentifier());
        rVarArr[6] = x.a("observer_mode", Boolean.valueOf(z8));
        rVarArr[7] = x.a(com.amazon.a.a.o.b.f3914x, receiptInfo.getPrice());
        rVarArr[8] = x.a(com.amazon.a.a.o.b.f3891a, receiptInfo.getCurrency());
        if (map.isEmpty() || this.appConfig.getCustomEntitlementComputation()) {
            subscriberAttributes = null;
        }
        rVarArr[9] = x.a("attributes", subscriberAttributes);
        rVarArr[10] = x.a("normal_duration", receiptInfo.getDuration());
        rVarArr[11] = x.a("store_user_id", str);
        List<PricingPhase> pricingPhases = receiptInfo.getPricingPhases();
        if (pricingPhases != null) {
            arrayList2 = new ArrayList(f6.p.m(pricingPhases, 10));
            Iterator<T> it2 = pricingPhases.iterator();
            while (it2.hasNext()) {
                arrayList2.add(BackendKt.toMap((PricingPhase) it2.next()));
            }
        } else {
            arrayList2 = null;
        }
        rVarArr[12] = x.a("pricing_phases", arrayList2);
        ReplacementMode replacementMode = receiptInfo.getReplacementMode();
        GoogleReplacementMode googleReplacementMode = replacementMode instanceof GoogleReplacementMode ? (GoogleReplacementMode) replacementMode : null;
        rVarArr[13] = x.a("proration_mode", (googleReplacementMode == null || (asGoogleProrationMode$purchases_defaultsRelease = googleReplacementMode.getAsGoogleProrationMode$purchases_defaultsRelease()) == null) ? null : asGoogleProrationMode$purchases_defaultsRelease.name());
        rVarArr[14] = x.a("initiation_source", initiationSource.getPostReceiptFieldValue());
        rVarArr[15] = x.a("paywall", paywallPostReceiptData != null ? paywallPostReceiptData.toMap() : null);
        final Map mapFilterNotNullValues = MapExtensionsKt.filterNotNullValues(k0.g(rVarArr));
        final List listG = o.g(x.a(APP_USER_ID, appUserID), x.a(FETCH_TOKEN, purchaseToken));
        r[] rVarArr2 = new r[2];
        StoreProduct storeProduct = receiptInfo.getStoreProduct();
        if (storeProduct != null && (price = storeProduct.getPrice()) != null) {
            formatted = price.getFormatted();
        }
        rVarArr2[0] = x.a("price_string", formatted);
        rVarArr2[1] = x.a(com.amazon.a.a.o.b.f3903m, str2);
        final Map mapFilterNotNullValues2 = MapExtensionsKt.filterNotNullValues(k0.g(rVarArr2));
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$postReceiptData$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return this.this$0.httpClient.performRequest(this.this$0.appConfig.getBaseURL(), Endpoint.PostReceipt.INSTANCE, mapFilterNotNullValues, listG, k0.j(this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), mapFilterNotNullValues2), (32 & 32) != 0 ? false : false);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) {
                List<r<p<CustomerInfo, JSONObject, i0>, q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0>>> listRemove;
                kotlin.jvm.internal.q.f(result, "result");
                Backend backend = this.this$0;
                List<String> list = listI;
                synchronized (backend) {
                    listRemove = backend.getPostReceiptCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Backend backend2 = this.this$0;
                    Iterator<T> it3 = listRemove.iterator();
                    while (it3.hasNext()) {
                        r rVar = (r) it3.next();
                        p pVar = (p) rVar.a();
                        q qVar = (q) rVar.b();
                        try {
                            if (BackendHelperKt.isSuccessful(result)) {
                                pVar.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(result), result.getBody());
                            } else {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                                LogUtilsKt.errorLog(purchasesError);
                                qVar.invoke(purchasesError, backend2.determinePostReceiptErrorHandlingBehavior(result.getResponseCode(), purchasesError), result.getBody());
                            }
                        } catch (JSONException e8) {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e8);
                            LogUtilsKt.errorLog(purchasesError2);
                            qVar.invoke(purchasesError2, PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME, null);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<r<p<CustomerInfo, JSONObject, i0>, q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0>>> listRemove;
                kotlin.jvm.internal.q.f(error, "error");
                Backend backend = this.this$0;
                List<String> list = listI;
                synchronized (backend) {
                    listRemove = backend.getPostReceiptCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it3 = listRemove.iterator();
                    while (it3.hasNext()) {
                        ((q) ((r) it3.next()).b()).invoke(error, PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME, null);
                    }
                }
            }
        };
        synchronized (this) {
            addCallback$default(this, this.postReceiptCallbacks, asyncCall, this.dispatcher, listI, x.a(onSuccess, onError), null, 16, null);
            i0 i0Var = i0.f21430a;
        }
    }

    public final synchronized void setCallbacks(Map<BackgroundAwareCallbackCacheKey, List<r<l<CustomerInfo, i0>, p<PurchasesError, Boolean, i0>>>> map) {
        kotlin.jvm.internal.q.f(map, "<set-?>");
        this.callbacks = map;
    }

    public final synchronized void setDiagnosticsCallbacks(Map<List<String>, List<r<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>>> map) {
        kotlin.jvm.internal.q.f(map, "<set-?>");
        this.diagnosticsCallbacks = map;
    }

    public final synchronized void setIdentifyCallbacks(Map<List<String>, List<r<p<CustomerInfo, Boolean, i0>, l<PurchasesError, i0>>>> map) {
        kotlin.jvm.internal.q.f(map, "<set-?>");
        this.identifyCallbacks = map;
    }

    public final synchronized void setOfferingsCallbacks(Map<BackgroundAwareCallbackCacheKey, List<r<l<JSONObject, i0>, p<PurchasesError, Boolean, i0>>>> map) {
        kotlin.jvm.internal.q.f(map, "<set-?>");
        this.offeringsCallbacks = map;
    }

    public final synchronized void setPaywallEventsCallbacks(Map<List<String>, List<r<p6.a<i0>, p<PurchasesError, Boolean, i0>>>> map) {
        kotlin.jvm.internal.q.f(map, "<set-?>");
        this.paywallEventsCallbacks = map;
    }

    public final synchronized void setPostReceiptCallbacks(Map<List<String>, List<r<p<CustomerInfo, JSONObject, i0>, q<PurchasesError, PostReceiptErrorHandlingBehavior, JSONObject, i0>>>> map) {
        kotlin.jvm.internal.q.f(map, "<set-?>");
        this.postReceiptCallbacks = map;
    }

    public final synchronized void setProductEntitlementCallbacks(Map<String, List<r<l<ProductEntitlementMapping, i0>, l<PurchasesError, i0>>>> map) {
        kotlin.jvm.internal.q.f(map, "<set-?>");
        this.productEntitlementCallbacks = map;
    }
}
