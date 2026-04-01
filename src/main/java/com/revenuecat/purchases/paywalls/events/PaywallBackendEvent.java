package com.revenuecat.purchases.paywalls.events;

import i7.b;
import i7.h;
import k7.f;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import l7.d;
import m7.b2;
import m7.q1;

/* JADX INFO: loaded from: classes.dex */
@h
public final class PaywallBackendEvent {
    public static final Companion Companion = new Companion(null);
    public static final int PAYWALL_EVENT_SCHEMA_VERSION = 1;
    private final String appUserID;
    private final boolean darkMode;
    private final String displayMode;
    private final String id;
    private final String localeIdentifier;
    private final String offeringID;
    private final int paywallRevision;
    private final String sessionID;
    private final long timestamp;
    private final String type;
    private final int version;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<PaywallBackendEvent> serializer() {
            return PaywallBackendEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaywallBackendEvent(int i8, String str, int i9, String str2, String str3, String str4, String str5, int i10, long j8, String str6, boolean z7, String str7, b2 b2Var) {
        if (2047 != (i8 & 2047)) {
            q1.a(i8, 2047, PaywallBackendEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.version = i9;
        this.type = str2;
        this.appUserID = str3;
        this.sessionID = str4;
        this.offeringID = str5;
        this.paywallRevision = i10;
        this.timestamp = j8;
        this.displayMode = str6;
        this.darkMode = z7;
        this.localeIdentifier = str7;
    }

    public PaywallBackendEvent(String id, int i8, String type, String appUserID, String sessionID, String offeringID, int i9, long j8, String displayMode, boolean z7, String localeIdentifier) {
        q.f(id, "id");
        q.f(type, "type");
        q.f(appUserID, "appUserID");
        q.f(sessionID, "sessionID");
        q.f(offeringID, "offeringID");
        q.f(displayMode, "displayMode");
        q.f(localeIdentifier, "localeIdentifier");
        this.id = id;
        this.version = i8;
        this.type = type;
        this.appUserID = appUserID;
        this.sessionID = sessionID;
        this.offeringID = offeringID;
        this.paywallRevision = i9;
        this.timestamp = j8;
        this.displayMode = displayMode;
        this.darkMode = z7;
        this.localeIdentifier = localeIdentifier;
    }

    public static /* synthetic */ void getAppUserID$annotations() {
    }

    public static /* synthetic */ void getDarkMode$annotations() {
    }

    public static /* synthetic */ void getDisplayMode$annotations() {
    }

    public static /* synthetic */ void getLocaleIdentifier$annotations() {
    }

    public static /* synthetic */ void getOfferingID$annotations() {
    }

    public static /* synthetic */ void getPaywallRevision$annotations() {
    }

    public static /* synthetic */ void getSessionID$annotations() {
    }

    public static final void write$Self(PaywallBackendEvent self, d output, f serialDesc) {
        q.f(self, "self");
        q.f(output, "output");
        q.f(serialDesc, "serialDesc");
        output.g(serialDesc, 0, self.id);
        output.D(serialDesc, 1, self.version);
        output.g(serialDesc, 2, self.type);
        output.g(serialDesc, 3, self.appUserID);
        output.g(serialDesc, 4, self.sessionID);
        output.g(serialDesc, 5, self.offeringID);
        output.D(serialDesc, 6, self.paywallRevision);
        output.m(serialDesc, 7, self.timestamp);
        output.g(serialDesc, 8, self.displayMode);
        output.C(serialDesc, 9, self.darkMode);
        output.g(serialDesc, 10, self.localeIdentifier);
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.darkMode;
    }

    public final String component11() {
        return this.localeIdentifier;
    }

    public final int component2() {
        return this.version;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.appUserID;
    }

    public final String component5() {
        return this.sessionID;
    }

    public final String component6() {
        return this.offeringID;
    }

    public final int component7() {
        return this.paywallRevision;
    }

    public final long component8() {
        return this.timestamp;
    }

    public final String component9() {
        return this.displayMode;
    }

    public final PaywallBackendEvent copy(String id, int i8, String type, String appUserID, String sessionID, String offeringID, int i9, long j8, String displayMode, boolean z7, String localeIdentifier) {
        q.f(id, "id");
        q.f(type, "type");
        q.f(appUserID, "appUserID");
        q.f(sessionID, "sessionID");
        q.f(offeringID, "offeringID");
        q.f(displayMode, "displayMode");
        q.f(localeIdentifier, "localeIdentifier");
        return new PaywallBackendEvent(id, i8, type, appUserID, sessionID, offeringID, i9, j8, displayMode, z7, localeIdentifier);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallBackendEvent)) {
            return false;
        }
        PaywallBackendEvent paywallBackendEvent = (PaywallBackendEvent) obj;
        return q.b(this.id, paywallBackendEvent.id) && this.version == paywallBackendEvent.version && q.b(this.type, paywallBackendEvent.type) && q.b(this.appUserID, paywallBackendEvent.appUserID) && q.b(this.sessionID, paywallBackendEvent.sessionID) && q.b(this.offeringID, paywallBackendEvent.offeringID) && this.paywallRevision == paywallBackendEvent.paywallRevision && this.timestamp == paywallBackendEvent.timestamp && q.b(this.displayMode, paywallBackendEvent.displayMode) && this.darkMode == paywallBackendEvent.darkMode && q.b(this.localeIdentifier, paywallBackendEvent.localeIdentifier);
    }

    public final String getAppUserID() {
        return this.appUserID;
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    public final String getOfferingID() {
        return this.offeringID;
    }

    public final int getPaywallRevision() {
        return this.paywallRevision;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((this.id.hashCode() * 31) + this.version) * 31) + this.type.hashCode()) * 31) + this.appUserID.hashCode()) * 31) + this.sessionID.hashCode()) * 31) + this.offeringID.hashCode()) * 31) + this.paywallRevision) * 31) + androidx.privacysandbox.ads.adservices.topics.d.a(this.timestamp)) * 31) + this.displayMode.hashCode()) * 31;
        boolean z7 = this.darkMode;
        ?? r12 = z7;
        if (z7) {
            r12 = 1;
        }
        return ((iHashCode + r12) * 31) + this.localeIdentifier.hashCode();
    }

    public String toString() {
        return "PaywallBackendEvent(id=" + this.id + ", version=" + this.version + ", type=" + this.type + ", appUserID=" + this.appUserID + ", sessionID=" + this.sessionID + ", offeringID=" + this.offeringID + ", paywallRevision=" + this.paywallRevision + ", timestamp=" + this.timestamp + ", displayMode=" + this.displayMode + ", darkMode=" + this.darkMode + ", localeIdentifier=" + this.localeIdentifier + ')';
    }
}
