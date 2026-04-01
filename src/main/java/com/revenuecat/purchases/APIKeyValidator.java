package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.ConfigureStrings;
import kotlin.jvm.internal.q;
import w6.v;
import w6.w;

/* JADX INFO: loaded from: classes.dex */
public final class APIKeyValidator {

    private enum APIKeyPlatform {
        GOOGLE,
        AMAZON,
        LEGACY,
        OTHER_PLATFORM
    }

    public enum ValidationResult {
        VALID,
        GOOGLE_KEY_AMAZON_STORE,
        AMAZON_KEY_GOOGLE_STORE,
        LEGACY,
        OTHER_PLATFORM
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ValidationResult.values().length];
            try {
                iArr[ValidationResult.AMAZON_KEY_GOOGLE_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValidationResult.GOOGLE_KEY_AMAZON_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValidationResult.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ValidationResult.OTHER_PLATFORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ValidationResult.VALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final APIKeyPlatform getApiKeyPlatform(String str) {
        return v.u(str, "goog_", false, 2, null) ? APIKeyPlatform.GOOGLE : v.u(str, "amzn_", false, 2, null) ? APIKeyPlatform.AMAZON : !w.y(str, '_', false, 2, null) ? APIKeyPlatform.LEGACY : APIKeyPlatform.OTHER_PLATFORM;
    }

    public final ValidationResult validate(String apiKey, Store configuredStore) {
        APIKeyPlatform aPIKeyPlatform;
        q.f(apiKey, "apiKey");
        q.f(configuredStore, "configuredStore");
        APIKeyPlatform apiKeyPlatform = getApiKeyPlatform(apiKey);
        APIKeyPlatform aPIKeyPlatform2 = APIKeyPlatform.GOOGLE;
        if ((apiKeyPlatform == aPIKeyPlatform2 && configuredStore == Store.PLAY_STORE) || (apiKeyPlatform == (aPIKeyPlatform = APIKeyPlatform.AMAZON) && configuredStore == Store.AMAZON)) {
            return ValidationResult.VALID;
        }
        if (apiKeyPlatform == aPIKeyPlatform2 && configuredStore == Store.AMAZON) {
            return ValidationResult.GOOGLE_KEY_AMAZON_STORE;
        }
        if (apiKeyPlatform == aPIKeyPlatform && configuredStore == Store.PLAY_STORE) {
            return ValidationResult.AMAZON_KEY_GOOGLE_STORE;
        }
        if (apiKeyPlatform == APIKeyPlatform.LEGACY) {
            return ValidationResult.LEGACY;
        }
        APIKeyPlatform aPIKeyPlatform3 = APIKeyPlatform.OTHER_PLATFORM;
        return ValidationResult.OTHER_PLATFORM;
    }

    public final void validateAndLog(String apiKey, Store configuredStore) {
        String str;
        q.f(apiKey, "apiKey");
        q.f(configuredStore, "configuredStore");
        int i8 = WhenMappings.$EnumSwitchMapping$0[validate(apiKey, configuredStore).ordinal()];
        if (i8 == 1) {
            str = ConfigureStrings.AMAZON_API_KEY_GOOGLE_STORE;
        } else if (i8 == 2) {
            str = ConfigureStrings.GOOGLE_API_KEY_AMAZON_STORE;
        } else if (i8 == 3) {
            LogUtilsKt.debugLog(ConfigureStrings.LEGACY_API_KEY);
            return;
        } else if (i8 != 4) {
            return;
        } else {
            str = ConfigureStrings.INVALID_API_KEY;
        }
        LogUtilsKt.errorLog$default(str, null, 2, null);
    }
}
