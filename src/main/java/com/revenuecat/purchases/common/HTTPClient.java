package com.revenuecat.purchases.common;

import android.os.Build;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPRequest;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.MapConverter;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.interfaces.StorefrontProvider;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import e6.r;
import e6.x;
import f6.k0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import n6.l;
import org.json.JSONObject;
import w6.v;

/* JADX INFO: loaded from: classes.dex */
public final class HTTPClient {
    public static final Companion Companion = new Companion(null);
    public static final int NO_STATUS_CODE = -1;
    private final AppConfig appConfig;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final ETagManager eTagManager;
    private final MapConverter mapConverter;
    private final SigningManager signingManager;
    private final StorefrontProvider storefrontProvider;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.AMAZON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HTTPClient(AppConfig appConfig, ETagManager eTagManager, DiagnosticsTracker diagnosticsTracker, SigningManager signingManager, StorefrontProvider storefrontProvider, DateProvider dateProvider, MapConverter mapConverter) {
        q.f(appConfig, "appConfig");
        q.f(eTagManager, "eTagManager");
        q.f(signingManager, "signingManager");
        q.f(storefrontProvider, "storefrontProvider");
        q.f(dateProvider, "dateProvider");
        q.f(mapConverter, "mapConverter");
        this.appConfig = appConfig;
        this.eTagManager = eTagManager;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.signingManager = signingManager;
        this.storefrontProvider = storefrontProvider;
        this.dateProvider = dateProvider;
        this.mapConverter = mapConverter;
    }

    public /* synthetic */ HTTPClient(AppConfig appConfig, ETagManager eTagManager, DiagnosticsTracker diagnosticsTracker, SigningManager signingManager, StorefrontProvider storefrontProvider, DateProvider dateProvider, MapConverter mapConverter, int i8, j jVar) {
        this(appConfig, eTagManager, diagnosticsTracker, signingManager, storefrontProvider, (i8 & 32) != 0 ? new DefaultDateProvider() : dateProvider, (i8 & 64) != 0 ? new MapConverter() : mapConverter);
    }

    private final BufferedReader buffer(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    private final BufferedWriter buffer(OutputStream outputStream) {
        return new BufferedWriter(new OutputStreamWriter(outputStream));
    }

    private final HttpURLConnection getConnection(HTTPRequest hTTPRequest) throws IOException {
        URLConnection uRLConnectionOpenConnection = hTTPRequest.getFullURL().openConnection();
        q.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        for (Map.Entry<String, String> entry : hTTPRequest.getHeaders().entrySet()) {
            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
        }
        JSONObject body = hTTPRequest.getBody();
        if (body != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            OutputStream os = httpURLConnection.getOutputStream();
            q.e(os, "os");
            BufferedWriter bufferedWriterBuffer = buffer(os);
            String string = body.toString();
            q.e(string, "body.toString()");
            writeFully(bufferedWriterBuffer, string);
        }
        return httpURLConnection;
    }

    private final String getETagHeader(URLConnection uRLConnection) {
        return uRLConnection.getHeaderField("X-RevenueCat-ETag");
    }

    private final Map<String, String> getHeaders(Map<String, String> map, String str, boolean z7, String str2, boolean z8, String str3) {
        r[] rVarArr = new r[14];
        rVarArr[0] = x.a("Content-Type", "application/json");
        rVarArr[1] = x.a("X-Platform", getXPlatformHeader());
        rVarArr[2] = x.a("X-Platform-Flavor", this.appConfig.getPlatformInfo().getFlavor());
        rVarArr[3] = x.a("X-Platform-Flavor-Version", this.appConfig.getPlatformInfo().getVersion());
        rVarArr[4] = x.a("X-Platform-Version", String.valueOf(Build.VERSION.SDK_INT));
        rVarArr[5] = x.a("X-Version", "7.4.0");
        rVarArr[6] = x.a("X-Client-Locale", this.appConfig.getLanguageTag());
        rVarArr[7] = x.a("X-Client-Version", this.appConfig.getVersionName());
        rVarArr[8] = x.a("X-Client-Bundle-ID", this.appConfig.getPackageName());
        boolean finishTransactions = this.appConfig.getFinishTransactions();
        String str4 = com.amazon.a.a.o.b.ac;
        rVarArr[9] = x.a("X-Observer-Mode-Enabled", finishTransactions ? com.amazon.a.a.o.b.ad : com.amazon.a.a.o.b.ac);
        rVarArr[10] = x.a("X-Nonce", str2);
        rVarArr[11] = x.a(HTTPRequest.POST_PARAMS_HASH, str3);
        if (!this.appConfig.getCustomEntitlementComputation()) {
            str4 = null;
        }
        rVarArr[12] = x.a("X-Custom-Entitlements-Computation", str4);
        rVarArr[13] = x.a("X-Storefront", this.storefrontProvider.getStorefront());
        return MapExtensionsKt.filterNotNullValues(k0.j(k0.j(k0.g(rVarArr), map), this.eTagManager.getETagHeaders$purchases_defaultsRelease(str, z8, z7)));
    }

    private final InputStream getInputStream(HttpURLConnection httpURLConnection) throws Exception {
        try {
            return httpURLConnection.getInputStream();
        } catch (Exception e8) {
            if (!(e8 instanceof IllegalArgumentException ? true : e8 instanceof IOException)) {
                throw e8;
            }
            LogIntent logIntent = LogIntent.WARNING;
            String str = String.format(NetworkStrings.PROBLEM_CONNECTING, Arrays.copyOf(new Object[]{e8.getMessage()}, 1));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            return httpURLConnection.getErrorStream();
        }
    }

    private final Date getRequestDateHeader(URLConnection uRLConnection) {
        String requestTimeHeader = getRequestTimeHeader(uRLConnection);
        if (requestTimeHeader != null) {
            return new Date(Long.parseLong(requestTimeHeader));
        }
        return null;
    }

    private final String getRequestTimeHeader(URLConnection uRLConnection) {
        String headerField = uRLConnection.getHeaderField(HTTPResult.REQUEST_TIME_HEADER_NAME);
        if (headerField == null || !(!v.p(headerField))) {
            return null;
        }
        return headerField;
    }

    private final String getXPlatformHeader() {
        return WhenMappings.$EnumSwitchMapping$0[this.appConfig.getStore().ordinal()] == 1 ? "amazon" : "android";
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.revenuecat.purchases.common.networking.HTTPResult performCall(java.net.URL r22, com.revenuecat.purchases.common.networking.Endpoint r23, java.util.Map<java.lang.String, ? extends java.lang.Object> r24, java.util.List<e6.r<java.lang.String, java.lang.String>> r25, java.util.Map<java.lang.String, java.lang.String> r26, boolean r27) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.HTTPClient.performCall(java.net.URL, com.revenuecat.purchases.common.networking.Endpoint, java.util.Map, java.util.List, java.util.Map, boolean):com.revenuecat.purchases.common.networking.HTTPResult");
    }

    private final String readFully(InputStream inputStream) {
        return l.d(buffer(inputStream));
    }

    private final void trackHttpRequestPerformedIfNeeded(Endpoint endpoint, Date date, boolean z7, HTTPResult hTTPResult) {
        VerificationResult verificationResult;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            long jBetween = DurationExtensionsKt.between(x6.a.f27324b, date, this.dateProvider.getNow());
            int responseCode = z7 ? hTTPResult != null ? hTTPResult.getResponseCode() : RCHTTPStatusCodes.NOT_MODIFIED : -1;
            HTTPResult.Origin origin = hTTPResult != null ? hTTPResult.getOrigin() : null;
            if (hTTPResult == null || (verificationResult = hTTPResult.getVerificationResult()) == null) {
                verificationResult = VerificationResult.NOT_REQUESTED;
            }
            diagnosticsTracker.m18trackHttpRequestPerformedNcHsxvU(endpoint, jBetween, z7 && RCHTTPStatusCodes.INSTANCE.isSuccessful(responseCode), responseCode, origin, verificationResult);
        }
    }

    private final VerificationResult verifyResponse(String str, URLConnection uRLConnection, String str2, String str3, String str4) {
        return this.signingManager.verifyResponse(str, uRLConnection.getHeaderField(HTTPResult.SIGNATURE_HEADER_NAME), str3, str2, getRequestTimeHeader(uRLConnection), getETagHeader(uRLConnection), str4);
    }

    private final void writeFully(BufferedWriter bufferedWriter, String str) throws IOException {
        bufferedWriter.write(str);
        bufferedWriter.flush();
    }

    public final void clearCaches() {
        this.eTagManager.clearCaches$purchases_defaultsRelease();
    }

    public final SigningManager getSigningManager() {
        return this.signingManager;
    }

    public final HTTPResult performRequest(URL baseURL, Endpoint endpoint, Map<String, ? extends Object> map, List<r<String, String>> list, Map<String, String> requestHeaders, boolean z7) {
        q.f(baseURL, "baseURL");
        q.f(endpoint, "endpoint");
        q.f(requestHeaders, "requestHeaders");
        if (this.appConfig.getForceServerErrors()) {
            LogUtilsKt.warnLog("Forcing server error for request to " + endpoint.getPath());
            return new HTTPResult(500, "", HTTPResult.Origin.BACKEND, null, VerificationResult.NOT_REQUESTED);
        }
        Date now = this.dateProvider.getNow();
        try {
            HTTPResult hTTPResultPerformCall = performCall(baseURL, endpoint, map, list, requestHeaders, z7);
            trackHttpRequestPerformedIfNeeded(endpoint, now, true, hTTPResultPerformCall);
            if (hTTPResultPerformCall != null) {
                return hTTPResultPerformCall;
            }
            LogWrapperKt.log(LogIntent.WARNING, NetworkStrings.ETAG_RETRYING_CALL);
            return performRequest(baseURL, endpoint, map, list, requestHeaders, true);
        } catch (Throwable th) {
            trackHttpRequestPerformedIfNeeded(endpoint, now, false, null);
            throw th;
        }
    }
}
