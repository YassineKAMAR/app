package com.revenuecat.purchases.common;

import android.content.Context;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.strings.ConfigureStrings;
import java.net.URL;
import java.util.Locale;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class AppConfig {
    public static final Companion Companion = new Companion(null);
    private static final URL diagnosticsURL = new URL("https://api-diagnostics.revenuecat.com/");
    private static final URL paywallEventsURL = new URL("https://api-paywalls.revenuecat.com/");
    private final URL baseURL;
    private final DangerousSettings dangerousSettings;
    private final boolean enableOfflineEntitlements;
    private boolean finishTransactions;
    private boolean forceServerErrors;
    private boolean forceSigningErrors;
    private final String languageTag;
    private final String packageName;
    private final PlatformInfo platformInfo;
    private final String playServicesVersionName;
    private final String playStoreVersionName;
    private final boolean runningTests;
    private final boolean showInAppMessagesAutomatically;
    private final Store store;
    private final String versionName;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final URL getDiagnosticsURL() {
            return AppConfig.diagnosticsURL;
        }

        public final URL getPaywallEventsURL() {
            return AppConfig.paywallEventsURL;
        }
    }

    public AppConfig(Context context, boolean z7, boolean z8, PlatformInfo platformInfo, URL url, Store store, DangerousSettings dangerousSettings, boolean z9, boolean z10, boolean z11) {
        String bcp47;
        q.f(context, "context");
        q.f(platformInfo, "platformInfo");
        q.f(store, "store");
        q.f(dangerousSettings, "dangerousSettings");
        this.showInAppMessagesAutomatically = z8;
        this.platformInfo = platformInfo;
        this.store = store;
        this.dangerousSettings = dangerousSettings;
        this.runningTests = z9;
        this.forceServerErrors = z10;
        this.forceSigningErrors = z11;
        this.enableOfflineEntitlements = true;
        Locale locale = UtilsKt.getLocale(context);
        this.languageTag = (locale == null || (bcp47 = UtilsKt.toBCP47(locale)) == null) ? "" : bcp47;
        String versionName = UtilsKt.getVersionName(context);
        this.versionName = versionName != null ? versionName : "";
        String packageName = context.getPackageName();
        q.e(packageName, "context.packageName");
        this.packageName = packageName;
        this.finishTransactions = !z7;
        if (url != null) {
            LogWrapperKt.log(LogIntent.INFO, ConfigureStrings.CONFIGURING_PURCHASES_PROXY_URL_SET);
        } else {
            url = new URL("https://api.revenuecat.com/");
        }
        this.baseURL = url;
        this.playStoreVersionName = UtilsKt.getPlayStoreVersionName(context);
        this.playServicesVersionName = UtilsKt.getPlayServicesVersionName(context);
    }

    public /* synthetic */ AppConfig(Context context, boolean z7, boolean z8, PlatformInfo platformInfo, URL url, Store store, DangerousSettings dangerousSettings, boolean z9, boolean z10, boolean z11, int i8, j jVar) {
        this(context, z7, z8, platformInfo, url, store, (i8 & 64) != 0 ? new DangerousSettings(true) : dangerousSettings, (i8 & 128) != 0 ? false : z9, (i8 & 256) != 0 ? false : z10, (i8 & 512) != 0 ? false : z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!q.b(AppConfig.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        q.d(obj, "null cannot be cast to non-null type com.revenuecat.purchases.common.AppConfig");
        AppConfig appConfig = (AppConfig) obj;
        return q.b(this.platformInfo, appConfig.platformInfo) && this.store == appConfig.store && q.b(this.dangerousSettings, appConfig.dangerousSettings) && q.b(this.languageTag, appConfig.languageTag) && q.b(this.versionName, appConfig.versionName) && q.b(this.packageName, appConfig.packageName) && this.finishTransactions == appConfig.finishTransactions && getForceServerErrors() == appConfig.getForceServerErrors() && getForceSigningErrors() == appConfig.getForceSigningErrors() && q.b(this.baseURL, appConfig.baseURL) && this.showInAppMessagesAutomatically == appConfig.showInAppMessagesAutomatically;
    }

    public final URL getBaseURL() {
        return this.baseURL;
    }

    public final boolean getCustomEntitlementComputation() {
        return this.dangerousSettings.getCustomEntitlementComputation$purchases_defaultsRelease();
    }

    public final DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    public final boolean getEnableOfflineEntitlements() {
        return this.enableOfflineEntitlements;
    }

    public final boolean getFinishTransactions() {
        return this.finishTransactions;
    }

    public final boolean getForceServerErrors() {
        return this.runningTests && this.forceServerErrors;
    }

    public final boolean getForceSigningErrors() {
        return this.runningTests && this.forceSigningErrors;
    }

    public final String getLanguageTag() {
        return this.languageTag;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final PlatformInfo getPlatformInfo() {
        return this.platformInfo;
    }

    public final String getPlayServicesVersionName() {
        return this.playServicesVersionName;
    }

    public final String getPlayStoreVersionName() {
        return this.playStoreVersionName;
    }

    public final boolean getShowInAppMessagesAutomatically() {
        return this.showInAppMessagesAutomatically;
    }

    public final Store getStore() {
        return this.store;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return (((((((((((((((((((this.platformInfo.hashCode() * 31) + this.store.hashCode()) * 31) + this.dangerousSettings.hashCode()) * 31) + this.languageTag.hashCode()) * 31) + this.versionName.hashCode()) * 31) + this.packageName.hashCode()) * 31) + androidx.privacysandbox.ads.adservices.topics.a.a(this.finishTransactions)) * 31) + androidx.privacysandbox.ads.adservices.topics.a.a(getForceServerErrors())) * 31) + androidx.privacysandbox.ads.adservices.topics.a.a(getForceSigningErrors())) * 31) + this.baseURL.hashCode()) * 31) + androidx.privacysandbox.ads.adservices.topics.a.a(this.showInAppMessagesAutomatically);
    }

    public final void setFinishTransactions(boolean z7) {
        this.finishTransactions = z7;
    }

    public final void setForceServerErrors(boolean z7) {
        this.forceServerErrors = z7;
    }

    public final void setForceSigningErrors(boolean z7) {
        this.forceSigningErrors = z7;
    }

    public String toString() {
        return "AppConfig(platformInfo=" + this.platformInfo + ", store=" + this.store + ", dangerousSettings=" + this.dangerousSettings + ", languageTag='" + this.languageTag + "', versionName='" + this.versionName + "', packageName='" + this.packageName + "', finishTransactions=" + this.finishTransactions + ", showInAppMessagesAutomatically=" + this.showInAppMessagesAutomatically + ", baseURL=" + this.baseURL + ')';
    }
}
