package com.revenuecat.purchases.common;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import e6.i0;
import e6.r;
import e6.x;
import f6.j0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;
import org.json.JSONException;
import org.json.JSONObject;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
public final class BackendHelper {
    private final String apiKey;
    private final AppConfig appConfig;
    private final Map<String, String> authenticationHeaders;
    private final Dispatcher dispatcher;
    private final HTTPClient httpClient;

    public BackendHelper(String apiKey, Dispatcher dispatcher, AppConfig appConfig, HTTPClient httpClient) {
        q.f(apiKey, "apiKey");
        q.f(dispatcher, "dispatcher");
        q.f(appConfig, "appConfig");
        q.f(httpClient, "httpClient");
        this.apiKey = apiKey;
        this.dispatcher = dispatcher;
        this.appConfig = appConfig;
        this.httpClient = httpClient;
        this.authenticationHeaders = j0.c(x.a("Authorization", "Bearer " + apiKey));
    }

    public static /* synthetic */ void enqueue$default(BackendHelper backendHelper, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, Delay delay, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            delay = Delay.NONE;
        }
        backendHelper.enqueue(asyncCall, dispatcher, delay);
    }

    public final void enqueue(Dispatcher.AsyncCall call, Dispatcher dispatcher, Delay delay) {
        q.f(call, "call");
        q.f(dispatcher, "dispatcher");
        q.f(delay, "delay");
        if (dispatcher.isClosed()) {
            LogUtilsKt.errorLog$default("Enqueuing operation in closed dispatcher.", null, 2, null);
        } else {
            dispatcher.enqueue(call, delay);
        }
    }

    public final Map<String, String> getAuthenticationHeaders$purchases_defaultsRelease() {
        return this.authenticationHeaders;
    }

    public final void performRequest(final Endpoint endpoint, final Map<String, ? extends Object> map, final List<r<String, String>> list, Delay delay, final l<? super PurchasesError, i0> onError, final p6.q<? super PurchasesError, ? super Integer, ? super JSONObject, i0> onCompleted) {
        q.f(endpoint, "endpoint");
        q.f(delay, "delay");
        q.f(onError, "onError");
        q.f(onCompleted, "onCompleted");
        enqueue(new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.BackendHelper.performRequest.1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return BackendHelper.this.httpClient.performRequest(BackendHelper.this.appConfig.getBaseURL(), endpoint, map, list, BackendHelper.this.getAuthenticationHeaders$purchases_defaultsRelease(), (32 & 32) != 0 ? false : false);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) throws JSONException {
                PurchasesError purchasesError;
                q.f(result, "result");
                if (BackendHelperKt.isSuccessful(result)) {
                    purchasesError = null;
                } else {
                    purchasesError = ErrorsKt.toPurchasesError(result);
                    LogUtilsKt.errorLog(purchasesError);
                }
                onCompleted.invoke(purchasesError, Integer.valueOf(result.getResponseCode()), result.getBody());
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                q.f(error, "error");
                onError.invoke(error);
            }
        }, this.dispatcher, delay);
    }
}
