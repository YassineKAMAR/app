package com.revenuecat.purchases;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public class PurchasesConfiguration {
    private final String apiKey;
    private final String appUserID;
    private final Context context;
    private final DangerousSettings dangerousSettings;
    private final boolean diagnosticsEnabled;
    private final boolean observerMode;
    private final ExecutorService service;
    private final boolean showInAppMessagesAutomatically;
    private final Store store;
    private final EntitlementVerificationMode verificationMode;

    public static class Builder {
        private final String apiKey;
        private String appUserID;
        private final Context context;
        private DangerousSettings dangerousSettings;
        private boolean diagnosticsEnabled;
        private boolean observerMode;
        private ExecutorService service;
        private boolean showInAppMessagesAutomatically;
        private Store store;
        private EntitlementVerificationMode verificationMode;

        public Builder(Context context, String apiKey) {
            q.f(context, "context");
            q.f(apiKey, "apiKey");
            this.context = context;
            this.apiKey = apiKey;
            this.showInAppMessagesAutomatically = true;
            this.store = Store.PLAY_STORE;
            this.verificationMode = EntitlementVerificationMode.Companion.getDefault();
            this.dangerousSettings = new DangerousSettings(false, 1, null);
        }

        public final Builder appUserID(String str) {
            this.appUserID = str;
            return this;
        }

        public PurchasesConfiguration build() {
            return new PurchasesConfiguration(this);
        }

        public final Builder dangerousSettings(DangerousSettings dangerousSettings) {
            q.f(dangerousSettings, "dangerousSettings");
            this.dangerousSettings = dangerousSettings;
            return this;
        }

        public final Builder diagnosticsEnabled(boolean z7) {
            this.diagnosticsEnabled = z7;
            return this;
        }

        public final Builder entitlementVerificationMode(EntitlementVerificationMode verificationMode) {
            q.f(verificationMode, "verificationMode");
            this.verificationMode = verificationMode;
            return this;
        }

        public final /* synthetic */ String getApiKey$purchases_defaultsRelease() {
            return this.apiKey;
        }

        public final /* synthetic */ String getAppUserID$purchases_defaultsRelease() {
            return this.appUserID;
        }

        public final /* synthetic */ Context getContext$purchases_defaultsRelease() {
            return this.context;
        }

        public final /* synthetic */ DangerousSettings getDangerousSettings$purchases_defaultsRelease() {
            return this.dangerousSettings;
        }

        public final /* synthetic */ boolean getDiagnosticsEnabled$purchases_defaultsRelease() {
            return this.diagnosticsEnabled;
        }

        public final /* synthetic */ boolean getObserverMode$purchases_defaultsRelease() {
            return this.observerMode;
        }

        public final /* synthetic */ ExecutorService getService$purchases_defaultsRelease() {
            return this.service;
        }

        public final /* synthetic */ boolean getShowInAppMessagesAutomatically$purchases_defaultsRelease() {
            return this.showInAppMessagesAutomatically;
        }

        public final /* synthetic */ Store getStore$purchases_defaultsRelease() {
            return this.store;
        }

        public final /* synthetic */ EntitlementVerificationMode getVerificationMode$purchases_defaultsRelease() {
            return this.verificationMode;
        }

        @ExperimentalPreviewRevenueCatPurchasesAPI
        public final /* synthetic */ Builder informationalVerificationModeAndDiagnosticsEnabled(boolean z7) {
            boolean z8;
            if (z7) {
                this.verificationMode = EntitlementVerificationMode.INFORMATIONAL;
                z8 = true;
            } else {
                this.verificationMode = EntitlementVerificationMode.DISABLED;
                z8 = false;
            }
            this.diagnosticsEnabled = z8;
            return this;
        }

        public final Builder observerMode(boolean z7) {
            this.observerMode = z7;
            return this;
        }

        public final Builder service(ExecutorService service) {
            q.f(service, "service");
            this.service = service;
            return this;
        }

        public final /* synthetic */ void setAppUserID$purchases_defaultsRelease(String str) {
            this.appUserID = str;
        }

        public final /* synthetic */ void setDangerousSettings$purchases_defaultsRelease(DangerousSettings dangerousSettings) {
            q.f(dangerousSettings, "<set-?>");
            this.dangerousSettings = dangerousSettings;
        }

        public final /* synthetic */ void setDiagnosticsEnabled$purchases_defaultsRelease(boolean z7) {
            this.diagnosticsEnabled = z7;
        }

        public final /* synthetic */ void setObserverMode$purchases_defaultsRelease(boolean z7) {
            this.observerMode = z7;
        }

        public final /* synthetic */ void setService$purchases_defaultsRelease(ExecutorService executorService) {
            this.service = executorService;
        }

        public final /* synthetic */ void setShowInAppMessagesAutomatically$purchases_defaultsRelease(boolean z7) {
            this.showInAppMessagesAutomatically = z7;
        }

        public final /* synthetic */ void setStore$purchases_defaultsRelease(Store store) {
            q.f(store, "<set-?>");
            this.store = store;
        }

        public final /* synthetic */ void setVerificationMode$purchases_defaultsRelease(EntitlementVerificationMode entitlementVerificationMode) {
            q.f(entitlementVerificationMode, "<set-?>");
            this.verificationMode = entitlementVerificationMode;
        }

        public final Builder showInAppMessagesAutomatically(boolean z7) {
            this.showInAppMessagesAutomatically = z7;
            return this;
        }

        public final Builder store(Store store) {
            q.f(store, "store");
            this.store = store;
            return this;
        }
    }

    public PurchasesConfiguration(Builder builder) {
        q.f(builder, "builder");
        this.context = builder.getContext$purchases_defaultsRelease();
        this.apiKey = builder.getApiKey$purchases_defaultsRelease();
        this.appUserID = builder.getAppUserID$purchases_defaultsRelease();
        this.observerMode = builder.getObserverMode$purchases_defaultsRelease();
        this.service = builder.getService$purchases_defaultsRelease();
        this.store = builder.getStore$purchases_defaultsRelease();
        this.diagnosticsEnabled = builder.getDiagnosticsEnabled$purchases_defaultsRelease();
        this.verificationMode = builder.getVerificationMode$purchases_defaultsRelease();
        this.dangerousSettings = builder.getDangerousSettings$purchases_defaultsRelease();
        this.showInAppMessagesAutomatically = builder.getShowInAppMessagesAutomatically$purchases_defaultsRelease();
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getAppUserID() {
        return this.appUserID;
    }

    public final Context getContext() {
        return this.context;
    }

    public final DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    public final boolean getDiagnosticsEnabled() {
        return this.diagnosticsEnabled;
    }

    public final boolean getObserverMode() {
        return this.observerMode;
    }

    public final ExecutorService getService() {
        return this.service;
    }

    public final boolean getShowInAppMessagesAutomatically() {
        return this.showInAppMessagesAutomatically;
    }

    public final Store getStore() {
        return this.store;
    }

    public final EntitlementVerificationMode getVerificationMode() {
        return this.verificationMode;
    }
}
