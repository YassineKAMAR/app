package com.revenuecat.purchases.strings;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkStrings {
    public static final String API_REQUEST_COMPLETED = "API request completed with status: %s %s %s";
    public static final String API_REQUEST_STARTED = "API request started: %s %s";
    public static final String ETAG_CALL_ALREADY_RETRIED = "We can't find the cached response, but call has already been retried. Returning result from backend: %s";
    public static final String ETAG_RETRYING_CALL = "We were expecting to be able to return a cached response, but we can't find it. Retrying call with a new ETag";
    public static final String HTTP_RESPONSE_PAYLOAD_NULL = "HTTP Response payload is null";
    public static final NetworkStrings INSTANCE = new NetworkStrings();
    public static final String PROBLEM_CONNECTING = "Unable to start a network connection due to a network configuration issue: %s";
    public static final String SAME_CALL_ALREADY_IN_PROGRESS = "Same call already in progress, adding to callbacks map with key: %s";
    public static final String SAME_CALL_SCHEDULED_WITHOUT_JITTER = "Request already scheduled without jitter delay, adding callbacks to unjittered request with key: %s";
    public static final String SAME_CALL_SCHEDULED_WITH_JITTER = "Request already scheduled with jitter delay, adding existing callbacks to unjittered request with key: %s";
    public static final String VERIFICATION_ERROR = "Verification: Request to '%s' failed verification.";
    public static final String VERIFICATION_INTERMEDIATE_KEY_FAILED = "Verification: Request to '%s' provided an intermediate key that did not verify correctly. Reason %s";
    public static final String VERIFICATION_INVALID_SIZE = "Verification: Request to '%s' has signature with wrong size. '%s'";
    public static final String VERIFICATION_MISSING_BODY_OR_ETAG = "Verification: Request to '%s' requires a body or etag but none provided.";
    public static final String VERIFICATION_MISSING_REQUEST_TIME = "Verification: Request to '%s' requires a request time but none provided.";
    public static final String VERIFICATION_MISSING_SIGNATURE = "Verification: Request to '%s' requires a signature but none provided.";
    public static final String VERIFICATION_SUCCESS = "Verification: Request to '%s' verified successfully.";

    private NetworkStrings() {
    }
}
