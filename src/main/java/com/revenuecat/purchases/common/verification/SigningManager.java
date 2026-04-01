package com.revenuecat.purchases.common.verification;

import android.util.Base64;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.Result;
import e6.i0;
import e6.r;
import f6.o;
import f6.p;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import w6.d;
import w6.w;

/* JADX INFO: loaded from: classes.dex */
public final class SigningManager {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int NONCE_BYTES_SIZE = 12;

    @Deprecated
    public static final String POST_PARAMS_ALGORITHM = "sha256";

    @Deprecated
    public static final byte POST_PARAMS_SEPARATOR = 0;
    private final String apiKey;
    private final AppConfig appConfig;
    private final SignatureVerificationMode signatureVerificationMode;

    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    private static final class Parameters {
        private final String apiKey;
        private final String body;
        private final String eTag;
        private final String nonce;
        private final String postParamsHashHeader;
        private final String requestTime;
        private final byte[] salt;
        private final String urlPath;

        public Parameters(byte[] salt, String apiKey, String str, String urlPath, String str2, String requestTime, String str3, String str4) {
            q.f(salt, "salt");
            q.f(apiKey, "apiKey");
            q.f(urlPath, "urlPath");
            q.f(requestTime, "requestTime");
            this.salt = salt;
            this.apiKey = apiKey;
            this.nonce = str;
            this.urlPath = urlPath;
            this.postParamsHashHeader = str2;
            this.requestTime = requestTime;
            this.eTag = str3;
            this.body = str4;
        }

        public final byte[] component1() {
            return this.salt;
        }

        public final String component2() {
            return this.apiKey;
        }

        public final String component3() {
            return this.nonce;
        }

        public final String component4() {
            return this.urlPath;
        }

        public final String component5() {
            return this.postParamsHashHeader;
        }

        public final String component6() {
            return this.requestTime;
        }

        public final String component7() {
            return this.eTag;
        }

        public final String component8() {
            return this.body;
        }

        public final Parameters copy(byte[] salt, String apiKey, String str, String urlPath, String str2, String requestTime, String str3, String str4) {
            q.f(salt, "salt");
            q.f(apiKey, "apiKey");
            q.f(urlPath, "urlPath");
            q.f(requestTime, "requestTime");
            return new Parameters(salt, apiKey, str, urlPath, str2, requestTime, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!q.b(Parameters.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            q.d(obj, "null cannot be cast to non-null type com.revenuecat.purchases.common.verification.SigningManager.Parameters");
            Parameters parameters = (Parameters) obj;
            return Arrays.equals(this.salt, parameters.salt) && q.b(this.apiKey, parameters.apiKey) && q.b(this.nonce, parameters.nonce) && q.b(this.urlPath, parameters.urlPath) && q.b(this.postParamsHashHeader, parameters.postParamsHashHeader) && q.b(this.requestTime, parameters.requestTime) && q.b(this.eTag, parameters.eTag) && q.b(this.body, parameters.body);
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final String getBody() {
            return this.body;
        }

        public final String getETag() {
            return this.eTag;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final String getPostParamsHashHeader() {
            return this.postParamsHashHeader;
        }

        public final String getRequestTime() {
            return this.requestTime;
        }

        public final byte[] getSalt() {
            return this.salt;
        }

        public final String getUrlPath() {
            return this.urlPath;
        }

        public int hashCode() {
            int iHashCode = ((Arrays.hashCode(this.salt) * 31) + this.apiKey.hashCode()) * 31;
            String str = this.nonce;
            int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.urlPath.hashCode()) * 31;
            String str2 = this.postParamsHashHeader;
            int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.requestTime.hashCode()) * 31;
            String str3 = this.eTag;
            int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.body;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final byte[] toSignatureToVerify() {
            /*
                r5 = this;
                byte[] r0 = r5.salt
                java.lang.String r1 = r5.apiKey
                java.nio.charset.Charset r2 = w6.d.f27129b
                byte[] r1 = r1.getBytes(r2)
                java.lang.String r3 = "this as java.lang.String).getBytes(charset)"
                kotlin.jvm.internal.q.e(r1, r3)
                byte[] r0 = f6.f.i(r0, r1)
                java.lang.String r1 = r5.nonce
                r4 = 0
                if (r1 == 0) goto L1d
                byte[] r1 = android.util.Base64.decode(r1, r4)
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L22
                byte[] r1 = new byte[r4]
            L22:
                byte[] r0 = f6.f.i(r0, r1)
                java.lang.String r1 = r5.urlPath
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.q.e(r1, r3)
                byte[] r0 = f6.f.i(r0, r1)
                java.lang.String r1 = r5.postParamsHashHeader
                if (r1 == 0) goto L40
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.q.e(r1, r3)
                if (r1 != 0) goto L42
            L40:
                byte[] r1 = new byte[r4]
            L42:
                byte[] r0 = f6.f.i(r0, r1)
                java.lang.String r1 = r5.requestTime
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.q.e(r1, r3)
                byte[] r0 = f6.f.i(r0, r1)
                java.lang.String r1 = r5.eTag
                if (r1 == 0) goto L60
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.q.e(r1, r3)
                if (r1 != 0) goto L62
            L60:
                byte[] r1 = new byte[r4]
            L62:
                byte[] r0 = f6.f.i(r0, r1)
                java.lang.String r1 = r5.body
                if (r1 == 0) goto L73
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.q.e(r1, r3)
                if (r1 != 0) goto L75
            L73:
                byte[] r1 = new byte[r4]
            L75:
                byte[] r0 = f6.f.i(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.verification.SigningManager.Parameters.toSignatureToVerify():byte[]");
        }

        public String toString() {
            return "Parameters(salt=" + Arrays.toString(this.salt) + ", apiKey=" + this.apiKey + ", nonce=" + this.nonce + ", urlPath=" + this.urlPath + ", postParamsHashHeader=" + this.postParamsHashHeader + ", requestTime=" + this.requestTime + ", eTag=" + this.eTag + ", body=" + this.body + ')';
        }
    }

    public SigningManager(SignatureVerificationMode signatureVerificationMode, AppConfig appConfig, String apiKey) {
        q.f(signatureVerificationMode, "signatureVerificationMode");
        q.f(appConfig, "appConfig");
        q.f(apiKey, "apiKey");
        this.signatureVerificationMode = signatureVerificationMode;
        this.appConfig = appConfig;
        this.apiKey = apiKey;
    }

    public final String createRandomNonce() {
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        byte[] bArrEncode = Base64.encode(bArr, 0);
        q.e(bArrEncode, "encode(bytes, Base64.DEFAULT)");
        return w.r0(new String(bArrEncode, d.f27129b)).toString();
    }

    public final String getPostParamsForSigningHeaderIfNeeded(Endpoint endpoint, List<r<String, String>> list) {
        q.f(endpoint, "endpoint");
        if ((list == null || list.isEmpty()) || !shouldVerifyEndpoint(endpoint)) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        ArrayList arrayList = new ArrayList(p.m(list, 10));
        int i8 = 0;
        for (Object obj : list) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                o.l();
            }
            r rVar = (r) obj;
            if (i8 > 0) {
                messageDigest.update((byte) 0);
            }
            byte[] bytes = ((String) rVar.d()).getBytes(d.f27129b);
            q.e(bytes, "this as java.lang.String).getBytes(charset)");
            messageDigest.update(bytes);
            arrayList.add(i0.f21430a);
            i8 = i9;
        }
        byte[] bArrDigest = messageDigest.digest();
        q.e(bArrDigest, "sha256Digest.digest()");
        String string = "";
        for (byte b8 : bArrDigest) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b8)}, 1));
            q.e(str, "format(this, *args)");
            sb.append(str);
            string = sb.toString();
        }
        return f6.w.G(o.g(f6.w.G(list, f.f3942a, null, null, 0, null, SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1.INSTANCE, 30, null), POST_PARAMS_ALGORITHM, string), Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, null, null, 0, null, null, 62, null);
    }

    public final SignatureVerificationMode getSignatureVerificationMode() {
        return this.signatureVerificationMode;
    }

    public final boolean shouldVerifyEndpoint(Endpoint endpoint) {
        q.f(endpoint, "endpoint");
        return endpoint.getSupportsSignatureVerification() && this.signatureVerificationMode.getShouldVerify();
    }

    public final VerificationResult verifyResponse(String urlPath, String str, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        q.f(urlPath, "urlPath");
        if (this.appConfig.getForceSigningErrors()) {
            LogUtilsKt.warnLog("Forcing signing error for request with path: " + urlPath);
        } else {
            IntermediateSignatureHelper intermediateSignatureHelper = this.signatureVerificationMode.getIntermediateSignatureHelper();
            if (intermediateSignatureHelper == null) {
                return VerificationResult.NOT_REQUESTED;
            }
            if (str == null) {
                str7 = String.format(NetworkStrings.VERIFICATION_MISSING_SIGNATURE, Arrays.copyOf(new Object[]{urlPath}, 1));
            } else if (str4 == null) {
                str7 = String.format(NetworkStrings.VERIFICATION_MISSING_REQUEST_TIME, Arrays.copyOf(new Object[]{urlPath}, 1));
            } else if (str3 == null && str5 == null) {
                str7 = String.format(NetworkStrings.VERIFICATION_MISSING_BODY_OR_ETAG, Arrays.copyOf(new Object[]{urlPath}, 1));
            } else {
                try {
                    Signature signatureFromString$purchases_defaultsRelease = Signature.Companion.fromString$purchases_defaultsRelease(str);
                    Result<SignatureVerifier, PurchasesError> resultCreateIntermediateKeyVerifierIfVerified = intermediateSignatureHelper.createIntermediateKeyVerifierIfVerified(signatureFromString$purchases_defaultsRelease);
                    if (!(resultCreateIntermediateKeyVerifierIfVerified instanceof Result.Error)) {
                        if (!(resultCreateIntermediateKeyVerifierIfVerified instanceof Result.Success)) {
                            throw new e6.p();
                        }
                        if (((SignatureVerifier) ((Result.Success) resultCreateIntermediateKeyVerifierIfVerified).getValue()).verify(signatureFromString$purchases_defaultsRelease.getPayload(), new Parameters(signatureFromString$purchases_defaultsRelease.getSalt(), this.apiKey, str2, urlPath, str6, str4, str5, str3).toSignatureToVerify())) {
                            String str8 = String.format(NetworkStrings.VERIFICATION_SUCCESS, Arrays.copyOf(new Object[]{urlPath}, 1));
                            q.e(str8, "format(this, *args)");
                            LogUtilsKt.verboseLog(str8);
                            return VerificationResult.VERIFIED;
                        }
                        String str9 = String.format(NetworkStrings.VERIFICATION_ERROR, Arrays.copyOf(new Object[]{urlPath}, 1));
                        q.e(str9, "format(this, *args)");
                        LogUtilsKt.errorLog$default(str9, null, 2, null);
                        return VerificationResult.FAILED;
                    }
                    str7 = String.format(NetworkStrings.VERIFICATION_INTERMEDIATE_KEY_FAILED, Arrays.copyOf(new Object[]{urlPath, ((PurchasesError) ((Result.Error) resultCreateIntermediateKeyVerifierIfVerified).getValue()).getUnderlyingErrorMessage()}, 2));
                } catch (InvalidSignatureSizeException e8) {
                    String str10 = String.format(NetworkStrings.VERIFICATION_INVALID_SIZE, Arrays.copyOf(new Object[]{urlPath, e8.getMessage()}, 2));
                    q.e(str10, "format(this, *args)");
                    LogUtilsKt.errorLog$default(str10, null, 2, null);
                }
            }
            q.e(str7, "format(this, *args)");
            LogUtilsKt.errorLog$default(str7, null, 2, null);
        }
        return VerificationResult.FAILED;
    }
}
