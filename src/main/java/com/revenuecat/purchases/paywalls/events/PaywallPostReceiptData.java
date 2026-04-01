package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.utils.JsonElementExtensionsKt;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import i7.b;
import i7.h;
import i7.l;
import java.util.Map;
import k7.f;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.z;
import l7.d;
import m7.b2;
import m7.q1;
import n7.a;

/* JADX INFO: loaded from: classes.dex */
@h
public final class PaywallPostReceiptData {
    public static final Companion Companion = new Companion(null);
    private static final a.C0153a json = n7.a.f25157d;
    private final boolean darkMode;
    private final String displayMode;
    private final String localeIdentifier;
    private final int paywallRevision;
    private final String sessionID;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final a.C0153a getJson() {
            return PaywallPostReceiptData.json;
        }

        public final b<PaywallPostReceiptData> serializer() {
            return PaywallPostReceiptData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaywallPostReceiptData(int i8, String str, int i9, String str2, boolean z7, String str3, b2 b2Var) {
        if (31 != (i8 & 31)) {
            q1.a(i8, 31, PaywallPostReceiptData$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionID = str;
        this.paywallRevision = i9;
        this.displayMode = str2;
        this.darkMode = z7;
        this.localeIdentifier = str3;
    }

    public PaywallPostReceiptData(String sessionID, int i8, String displayMode, boolean z7, String localeIdentifier) {
        q.f(sessionID, "sessionID");
        q.f(displayMode, "displayMode");
        q.f(localeIdentifier, "localeIdentifier");
        this.sessionID = sessionID;
        this.paywallRevision = i8;
        this.displayMode = displayMode;
        this.darkMode = z7;
        this.localeIdentifier = localeIdentifier;
    }

    public static /* synthetic */ PaywallPostReceiptData copy$default(PaywallPostReceiptData paywallPostReceiptData, String str, int i8, String str2, boolean z7, String str3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = paywallPostReceiptData.sessionID;
        }
        if ((i9 & 2) != 0) {
            i8 = paywallPostReceiptData.paywallRevision;
        }
        int i10 = i8;
        if ((i9 & 4) != 0) {
            str2 = paywallPostReceiptData.displayMode;
        }
        String str4 = str2;
        if ((i9 & 8) != 0) {
            z7 = paywallPostReceiptData.darkMode;
        }
        boolean z8 = z7;
        if ((i9 & 16) != 0) {
            str3 = paywallPostReceiptData.localeIdentifier;
        }
        return paywallPostReceiptData.copy(str, i10, str4, z8, str3);
    }

    public static /* synthetic */ void getDarkMode$annotations() {
    }

    public static /* synthetic */ void getDisplayMode$annotations() {
    }

    public static /* synthetic */ void getLocaleIdentifier$annotations() {
    }

    public static /* synthetic */ void getPaywallRevision$annotations() {
    }

    public static /* synthetic */ void getSessionID$annotations() {
    }

    public static final void write$Self(PaywallPostReceiptData self, d output, f serialDesc) {
        q.f(self, "self");
        q.f(output, "output");
        q.f(serialDesc, "serialDesc");
        output.g(serialDesc, 0, self.sessionID);
        output.D(serialDesc, 1, self.paywallRevision);
        output.g(serialDesc, 2, self.displayMode);
        output.C(serialDesc, 3, self.darkMode);
        output.g(serialDesc, 4, self.localeIdentifier);
    }

    public final String component1() {
        return this.sessionID;
    }

    public final int component2() {
        return this.paywallRevision;
    }

    public final String component3() {
        return this.displayMode;
    }

    public final boolean component4() {
        return this.darkMode;
    }

    public final String component5() {
        return this.localeIdentifier;
    }

    public final PaywallPostReceiptData copy(String sessionID, int i8, String displayMode, boolean z7, String localeIdentifier) {
        q.f(sessionID, "sessionID");
        q.f(displayMode, "displayMode");
        q.f(localeIdentifier, "localeIdentifier");
        return new PaywallPostReceiptData(sessionID, i8, displayMode, z7, localeIdentifier);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallPostReceiptData)) {
            return false;
        }
        PaywallPostReceiptData paywallPostReceiptData = (PaywallPostReceiptData) obj;
        return q.b(this.sessionID, paywallPostReceiptData.sessionID) && this.paywallRevision == paywallPostReceiptData.paywallRevision && q.b(this.displayMode, paywallPostReceiptData.displayMode) && this.darkMode == paywallPostReceiptData.darkMode && q.b(this.localeIdentifier, paywallPostReceiptData.localeIdentifier);
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    public final int getPaywallRevision() {
        return this.paywallRevision;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        int iHashCode = ((((this.sessionID.hashCode() * 31) + this.paywallRevision) * 31) + this.displayMode.hashCode()) * 31;
        boolean z7 = this.darkMode;
        ?? r12 = z7;
        if (z7) {
            r12 = 1;
        }
        return ((iHashCode + r12) * 31) + this.localeIdentifier.hashCode();
    }

    public final Map<String, Object> toMap() {
        a.C0153a c0153a = json;
        b<Object> bVarB = l.b(c0153a.a(), z.g(PaywallPostReceiptData.class));
        q.d(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        Map<String, Object> mapAsMap = JsonElementExtensionsKt.asMap(c0153a.d(bVarB, this));
        if (mapAsMap == null) {
            return null;
        }
        return MapExtensionsKt.filterNotNullValues(mapAsMap);
    }

    public String toString() {
        return "PaywallPostReceiptData(sessionID=" + this.sessionID + ", paywallRevision=" + this.paywallRevision + ", displayMode=" + this.displayMode + ", darkMode=" + this.darkMode + ", localeIdentifier=" + this.localeIdentifier + ')';
    }
}
