package com.revenuecat.purchases.common.networking;

import android.content.Context;
import android.content.SharedPreferences;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.strings.NetworkStrings;
import e6.k;
import e6.m;
import e6.p;
import e6.x;
import f6.k0;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.a;

/* JADX INFO: loaded from: classes.dex */
public final class ETagManager {
    public static final Companion Companion = new Companion(null);
    private final DateProvider dateProvider;
    private final k<SharedPreferences> prefs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.revenuecat.purchases.common.networking.ETagManager$1, reason: invalid class name */
    public static final class AnonymousClass1 extends r implements a<SharedPreferences> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p6.a
        public final SharedPreferences invoke() {
            return ETagManager.Companion.initializeSharedPreferences(this.$context);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final SharedPreferences initializeSharedPreferences(Context context) {
            q.f(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences_etags", 0);
            q.e(sharedPreferences, "context.getSharedPrefere…DE_PRIVATE,\n            )");
            return sharedPreferences;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationResult.values().length];
            try {
                iArr[VerificationResult.VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationResult.NOT_REQUESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationResult.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VerificationResult.VERIFIED_ON_DEVICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ETagManager(Context context, k<? extends SharedPreferences> prefs, DateProvider dateProvider) {
        q.f(context, "context");
        q.f(prefs, "prefs");
        q.f(dateProvider, "dateProvider");
        this.prefs = prefs;
        this.dateProvider = dateProvider;
    }

    public /* synthetic */ ETagManager(Context context, k kVar, DateProvider dateProvider, int i8, j jVar) {
        this(context, (i8 & 2) != 0 ? m.b(new AnonymousClass1(context)) : kVar, (i8 & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    public static /* synthetic */ Map getETagHeaders$purchases_defaultsRelease$default(ETagManager eTagManager, String str, boolean z7, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        return eTagManager.getETagHeaders$purchases_defaultsRelease(str, z7, z8);
    }

    private final HTTPResultWithETag getStoredResultSavedInSharedPreferences(String str) {
        String string = this.prefs.getValue().getString(str, null);
        if (string != null) {
            return HTTPResultWithETag.Companion.deserialize(string);
        }
        return null;
    }

    private final boolean shouldStoreBackendResult(HTTPResult hTTPResult) {
        int responseCode = hTTPResult.getResponseCode();
        return (responseCode == 304 || responseCode >= 500 || hTTPResult.getVerificationResult() == VerificationResult.FAILED) ? false : true;
    }

    private final boolean shouldUseETag(HTTPResultWithETag hTTPResultWithETag, boolean z7) {
        int i8 = WhenMappings.$EnumSwitchMapping$0[hTTPResultWithETag.getHttpResult().getVerificationResult().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3 || i8 == 4) {
                    return false;
                }
                throw new p();
            }
            if (z7) {
                return false;
            }
        }
        return true;
    }

    private final synchronized void storeResult(String str, HTTPResult hTTPResult, String str2) {
        this.prefs.getValue().edit().putString(str, new HTTPResultWithETag(new ETagData(str2, this.dateProvider.getNow()), HTTPResult.copy$default(hTTPResult, 0, null, HTTPResult.Origin.CACHE, null, null, 27, null)).serialize()).apply();
    }

    public final synchronized void clearCaches$purchases_defaultsRelease() {
        this.prefs.getValue().edit().clear().apply();
    }

    public final Map<String, String> getETagHeaders$purchases_defaultsRelease(String path, boolean z7, boolean z8) {
        ETagData eTagData;
        Date lastRefreshTime;
        q.f(path, "path");
        String string = null;
        HTTPResultWithETag storedResultSavedInSharedPreferences = z8 ? null : getStoredResultSavedInSharedPreferences(path);
        if (storedResultSavedInSharedPreferences == null || (eTagData = storedResultSavedInSharedPreferences.getETagData()) == null || !shouldUseETag(storedResultSavedInSharedPreferences, z7)) {
            eTagData = null;
        }
        e6.r[] rVarArr = new e6.r[2];
        String eTag = eTagData != null ? eTagData.getETag() : null;
        if (eTag == null) {
            eTag = "";
        }
        rVarArr[0] = x.a("X-RevenueCat-ETag", eTag);
        if (eTagData != null && (lastRefreshTime = eTagData.getLastRefreshTime()) != null) {
            string = Long.valueOf(lastRefreshTime.getTime()).toString();
        }
        rVarArr[1] = x.a(HTTPRequest.ETAG_LAST_REFRESH_NAME, string);
        return k0.g(rVarArr);
    }

    public final HTTPResult getHTTPResultFromCacheOrBackend$purchases_defaultsRelease(int i8, String payload, String str, String urlPathWithVersion, boolean z7, Date date, VerificationResult verificationResult) {
        HTTPResult hTTPResultCopy$default;
        q.f(payload, "payload");
        q.f(urlPathWithVersion, "urlPathWithVersion");
        q.f(verificationResult, "verificationResult");
        HTTPResult hTTPResult = new HTTPResult(i8, payload, HTTPResult.Origin.BACKEND, date, verificationResult);
        if (str != null) {
            if (shouldUseCachedVersion$purchases_defaultsRelease(i8)) {
                HTTPResult storedResult$purchases_defaultsRelease = getStoredResult$purchases_defaultsRelease(urlPathWithVersion);
                if (storedResult$purchases_defaultsRelease != null) {
                    hTTPResultCopy$default = HTTPResult.copy$default(storedResult$purchases_defaultsRelease, 0, null, null, date == null ? storedResult$purchases_defaultsRelease.getRequestDate() : date, verificationResult, 7, null);
                } else {
                    hTTPResultCopy$default = null;
                }
                if (hTTPResultCopy$default != null) {
                    return hTTPResultCopy$default;
                }
                if (!z7) {
                    return null;
                }
                LogIntent logIntent = LogIntent.WARNING;
                String str2 = String.format(NetworkStrings.ETAG_CALL_ALREADY_RETRIED, Arrays.copyOf(new Object[]{hTTPResult}, 1));
                q.e(str2, "format(this, *args)");
                LogWrapperKt.log(logIntent, str2);
                return hTTPResult;
            }
            storeBackendResultIfNoError$purchases_defaultsRelease(urlPathWithVersion, hTTPResult, str);
        }
        return hTTPResult;
    }

    public final HTTPResult getStoredResult$purchases_defaultsRelease(String path) {
        q.f(path, "path");
        HTTPResultWithETag storedResultSavedInSharedPreferences = getStoredResultSavedInSharedPreferences(path);
        if (storedResultSavedInSharedPreferences != null) {
            return storedResultSavedInSharedPreferences.getHttpResult();
        }
        return null;
    }

    public final boolean shouldUseCachedVersion$purchases_defaultsRelease(int i8) {
        return i8 == 304;
    }

    public final void storeBackendResultIfNoError$purchases_defaultsRelease(String path, HTTPResult resultFromBackend, String eTagInResponse) {
        q.f(path, "path");
        q.f(resultFromBackend, "resultFromBackend");
        q.f(eTagInResponse, "eTagInResponse");
        if (shouldStoreBackendResult(resultFromBackend)) {
            storeResult(path, resultFromBackend, eTagInResponse);
        }
    }
}
