package com.revenuecat.purchases.common.networking;

import java.net.URL;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class HTTPRequest {
    public static final Companion Companion = new Companion(null);
    public static final String ETAG_HEADER_NAME = "X-RevenueCat-ETag";
    public static final String ETAG_LAST_REFRESH_NAME = "X-RC-Last-Refresh-Time";
    public static final String POST_PARAMS_HASH = "X-Post-Params-Hash";
    private final JSONObject body;
    private final URL fullURL;
    private final Map<String, String> headers;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public HTTPRequest(URL fullURL, Map<String, String> headers, JSONObject jSONObject) {
        q.f(fullURL, "fullURL");
        q.f(headers, "headers");
        this.fullURL = fullURL;
        this.headers = headers;
        this.body = jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HTTPRequest copy$default(HTTPRequest hTTPRequest, URL url, Map map, JSONObject jSONObject, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            url = hTTPRequest.fullURL;
        }
        if ((i8 & 2) != 0) {
            map = hTTPRequest.headers;
        }
        if ((i8 & 4) != 0) {
            jSONObject = hTTPRequest.body;
        }
        return hTTPRequest.copy(url, map, jSONObject);
    }

    public final URL component1() {
        return this.fullURL;
    }

    public final Map<String, String> component2() {
        return this.headers;
    }

    public final JSONObject component3() {
        return this.body;
    }

    public final HTTPRequest copy(URL fullURL, Map<String, String> headers, JSONObject jSONObject) {
        q.f(fullURL, "fullURL");
        q.f(headers, "headers");
        return new HTTPRequest(fullURL, headers, jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTTPRequest)) {
            return false;
        }
        HTTPRequest hTTPRequest = (HTTPRequest) obj;
        return q.b(this.fullURL, hTTPRequest.fullURL) && q.b(this.headers, hTTPRequest.headers) && q.b(this.body, hTTPRequest.body);
    }

    public final JSONObject getBody() {
        return this.body;
    }

    public final URL getFullURL() {
        return this.fullURL;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public int hashCode() {
        int iHashCode = ((this.fullURL.hashCode() * 31) + this.headers.hashCode()) * 31;
        JSONObject jSONObject = this.body;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "HTTPRequest(fullURL=" + this.fullURL + ", headers=" + this.headers + ", body=" + this.body + ')';
    }
}
