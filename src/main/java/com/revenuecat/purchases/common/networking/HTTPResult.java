package com.revenuecat.purchases.common.networking;

import com.revenuecat.purchases.VerificationResult;
import java.util.Date;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import org.json.JSONException;
import org.json.JSONObject;
import w6.v;

/* JADX INFO: loaded from: classes.dex */
public final class HTTPResult {
    public static final Companion Companion = new Companion(null);
    public static final String ETAG_HEADER_NAME = "X-RevenueCat-ETag";
    public static final String REQUEST_TIME_HEADER_NAME = "X-RevenueCat-Request-Time";
    public static final String SIGNATURE_HEADER_NAME = "X-Signature";
    private final JSONObject body;
    private final Origin origin;
    private final String payload;
    private final Date requestDate;
    private final int responseCode;
    private final VerificationResult verificationResult;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final HTTPResult deserialize(String serialized) throws JSONException {
            Origin originValueOf;
            VerificationResult verificationResultValueOf;
            q.f(serialized, "serialized");
            JSONObject jSONObject = new JSONObject(serialized);
            int i8 = jSONObject.getInt("responseCode");
            String payload = jSONObject.getString("payload");
            if (jSONObject.has("origin")) {
                String string = jSONObject.getString("origin");
                q.e(string, "jsonObject.getString(SERIALIZATION_NAME_ORIGIN)");
                originValueOf = Origin.valueOf(string);
            } else {
                originValueOf = Origin.CACHE;
            }
            Origin origin = originValueOf;
            Date date = jSONObject.has("requestDate") ? new Date(jSONObject.getLong("requestDate")) : null;
            if (jSONObject.has("verificationResult")) {
                String string2 = jSONObject.getString("verificationResult");
                q.e(string2, "jsonObject.getString(SER…NAME_VERIFICATION_RESULT)");
                verificationResultValueOf = VerificationResult.valueOf(string2);
            } else {
                verificationResultValueOf = VerificationResult.NOT_REQUESTED;
            }
            q.e(payload, "payload");
            return new HTTPResult(i8, payload, origin, date, verificationResultValueOf);
        }
    }

    public enum Origin {
        BACKEND,
        CACHE
    }

    public HTTPResult(int i8, String payload, Origin origin, Date date, VerificationResult verificationResult) {
        q.f(payload, "payload");
        q.f(origin, "origin");
        q.f(verificationResult, "verificationResult");
        this.responseCode = i8;
        this.payload = payload;
        this.origin = origin;
        this.requestDate = date;
        this.verificationResult = verificationResult;
        payload = v.p(payload) ^ true ? payload : null;
        this.body = payload != null ? new JSONObject(payload) : new JSONObject();
    }

    public static /* synthetic */ HTTPResult copy$default(HTTPResult hTTPResult, int i8, String str, Origin origin, Date date, VerificationResult verificationResult, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = hTTPResult.responseCode;
        }
        if ((i9 & 2) != 0) {
            str = hTTPResult.payload;
        }
        String str2 = str;
        if ((i9 & 4) != 0) {
            origin = hTTPResult.origin;
        }
        Origin origin2 = origin;
        if ((i9 & 8) != 0) {
            date = hTTPResult.requestDate;
        }
        Date date2 = date;
        if ((i9 & 16) != 0) {
            verificationResult = hTTPResult.verificationResult;
        }
        return hTTPResult.copy(i8, str2, origin2, date2, verificationResult);
    }

    public final int component1() {
        return this.responseCode;
    }

    public final String component2() {
        return this.payload;
    }

    public final Origin component3() {
        return this.origin;
    }

    public final Date component4() {
        return this.requestDate;
    }

    public final VerificationResult component5() {
        return this.verificationResult;
    }

    public final HTTPResult copy(int i8, String payload, Origin origin, Date date, VerificationResult verificationResult) {
        q.f(payload, "payload");
        q.f(origin, "origin");
        q.f(verificationResult, "verificationResult");
        return new HTTPResult(i8, payload, origin, date, verificationResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTTPResult)) {
            return false;
        }
        HTTPResult hTTPResult = (HTTPResult) obj;
        return this.responseCode == hTTPResult.responseCode && q.b(this.payload, hTTPResult.payload) && this.origin == hTTPResult.origin && q.b(this.requestDate, hTTPResult.requestDate) && this.verificationResult == hTTPResult.verificationResult;
    }

    public final JSONObject getBody() {
        return this.body;
    }

    public final Origin getOrigin() {
        return this.origin;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final Date getRequestDate() {
        return this.requestDate;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final VerificationResult getVerificationResult() {
        return this.verificationResult;
    }

    public int hashCode() {
        int iHashCode = ((((this.responseCode * 31) + this.payload.hashCode()) * 31) + this.origin.hashCode()) * 31;
        Date date = this.requestDate;
        return ((iHashCode + (date == null ? 0 : date.hashCode())) * 31) + this.verificationResult.hashCode();
    }

    public final String serialize() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("responseCode", this.responseCode);
        jSONObject.put("payload", this.payload);
        jSONObject.put("origin", this.origin.name());
        Date date = this.requestDate;
        jSONObject.put("requestDate", date != null ? Long.valueOf(date.getTime()) : null);
        jSONObject.put("verificationResult", this.verificationResult.name());
        String string = jSONObject.toString();
        q.e(string, "jsonObject.toString()");
        return string;
    }

    public String toString() {
        return "HTTPResult(responseCode=" + this.responseCode + ", payload=" + this.payload + ", origin=" + this.origin + ", requestDate=" + this.requestDate + ", verificationResult=" + this.verificationResult + ')';
    }
}
