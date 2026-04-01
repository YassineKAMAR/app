package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import com.revenuecat.purchases.utils.serializers.DateSerializer;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import i7.b;
import i7.h;
import java.util.Date;
import java.util.UUID;
import k7.f;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import l7.d;
import m7.b2;
import m7.f0;
import m7.q1;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalPreviewRevenueCatPurchasesAPI
@h
public final class PaywallEvent {
    public static final Companion Companion = new Companion(null);
    private final CreationData creationData;
    private final Data data;
    private final PaywallEventType type;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<PaywallEvent> serializer() {
            return PaywallEvent$$serializer.INSTANCE;
        }
    }

    @h
    public static final class CreationData {
        public static final Companion Companion = new Companion(null);
        private final Date date;
        private final UUID id;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<CreationData> serializer() {
                return PaywallEvent$CreationData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ CreationData(int i8, @h(with = UUIDSerializer.class) UUID uuid, @h(with = DateSerializer.class) Date date, b2 b2Var) {
            if (3 != (i8 & 3)) {
                q1.a(i8, 3, PaywallEvent$CreationData$$serializer.INSTANCE.getDescriptor());
            }
            this.id = uuid;
            this.date = date;
        }

        public CreationData(UUID id, Date date) {
            q.f(id, "id");
            q.f(date, "date");
            this.id = id;
            this.date = date;
        }

        public static /* synthetic */ CreationData copy$default(CreationData creationData, UUID uuid, Date date, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                uuid = creationData.id;
            }
            if ((i8 & 2) != 0) {
                date = creationData.date;
            }
            return creationData.copy(uuid, date);
        }

        @h(with = DateSerializer.class)
        public static /* synthetic */ void getDate$annotations() {
        }

        @h(with = UUIDSerializer.class)
        public static /* synthetic */ void getId$annotations() {
        }

        public static final void write$Self(CreationData self, d output, f serialDesc) {
            q.f(self, "self");
            q.f(output, "output");
            q.f(serialDesc, "serialDesc");
            output.l(serialDesc, 0, UUIDSerializer.INSTANCE, self.id);
            output.l(serialDesc, 1, DateSerializer.INSTANCE, self.date);
        }

        public final UUID component1() {
            return this.id;
        }

        public final Date component2() {
            return this.date;
        }

        public final CreationData copy(UUID id, Date date) {
            q.f(id, "id");
            q.f(date, "date");
            return new CreationData(id, date);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreationData)) {
                return false;
            }
            CreationData creationData = (CreationData) obj;
            return q.b(this.id, creationData.id) && q.b(this.date, creationData.date);
        }

        public final Date getDate() {
            return this.date;
        }

        public final UUID getId() {
            return this.id;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.date.hashCode();
        }

        public String toString() {
            return "CreationData(id=" + this.id + ", date=" + this.date + ')';
        }
    }

    @h
    public static final class Data {
        public static final Companion Companion = new Companion(null);
        private final boolean darkMode;
        private final String displayMode;
        private final String localeIdentifier;
        private final String offeringIdentifier;
        private final int paywallRevision;
        private final UUID sessionIdentifier;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final b<Data> serializer() {
                return PaywallEvent$Data$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Data(int i8, String str, int i9, @h(with = UUIDSerializer.class) UUID uuid, String str2, String str3, boolean z7, b2 b2Var) {
            if (63 != (i8 & 63)) {
                q1.a(i8, 63, PaywallEvent$Data$$serializer.INSTANCE.getDescriptor());
            }
            this.offeringIdentifier = str;
            this.paywallRevision = i9;
            this.sessionIdentifier = uuid;
            this.displayMode = str2;
            this.localeIdentifier = str3;
            this.darkMode = z7;
        }

        public Data(String offeringIdentifier, int i8, UUID sessionIdentifier, String displayMode, String localeIdentifier, boolean z7) {
            q.f(offeringIdentifier, "offeringIdentifier");
            q.f(sessionIdentifier, "sessionIdentifier");
            q.f(displayMode, "displayMode");
            q.f(localeIdentifier, "localeIdentifier");
            this.offeringIdentifier = offeringIdentifier;
            this.paywallRevision = i8;
            this.sessionIdentifier = sessionIdentifier;
            this.displayMode = displayMode;
            this.localeIdentifier = localeIdentifier;
            this.darkMode = z7;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, int i8, UUID uuid, String str2, String str3, boolean z7, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                str = data.offeringIdentifier;
            }
            if ((i9 & 2) != 0) {
                i8 = data.paywallRevision;
            }
            int i10 = i8;
            if ((i9 & 4) != 0) {
                uuid = data.sessionIdentifier;
            }
            UUID uuid2 = uuid;
            if ((i9 & 8) != 0) {
                str2 = data.displayMode;
            }
            String str4 = str2;
            if ((i9 & 16) != 0) {
                str3 = data.localeIdentifier;
            }
            String str5 = str3;
            if ((i9 & 32) != 0) {
                z7 = data.darkMode;
            }
            return data.copy(str, i10, uuid2, str4, str5, z7);
        }

        @h(with = UUIDSerializer.class)
        public static /* synthetic */ void getSessionIdentifier$annotations() {
        }

        public static final void write$Self(Data self, d output, f serialDesc) {
            q.f(self, "self");
            q.f(output, "output");
            q.f(serialDesc, "serialDesc");
            output.g(serialDesc, 0, self.offeringIdentifier);
            output.D(serialDesc, 1, self.paywallRevision);
            output.l(serialDesc, 2, UUIDSerializer.INSTANCE, self.sessionIdentifier);
            output.g(serialDesc, 3, self.displayMode);
            output.g(serialDesc, 4, self.localeIdentifier);
            output.C(serialDesc, 5, self.darkMode);
        }

        public final String component1() {
            return this.offeringIdentifier;
        }

        public final int component2() {
            return this.paywallRevision;
        }

        public final UUID component3() {
            return this.sessionIdentifier;
        }

        public final String component4() {
            return this.displayMode;
        }

        public final String component5() {
            return this.localeIdentifier;
        }

        public final boolean component6() {
            return this.darkMode;
        }

        public final Data copy(String offeringIdentifier, int i8, UUID sessionIdentifier, String displayMode, String localeIdentifier, boolean z7) {
            q.f(offeringIdentifier, "offeringIdentifier");
            q.f(sessionIdentifier, "sessionIdentifier");
            q.f(displayMode, "displayMode");
            q.f(localeIdentifier, "localeIdentifier");
            return new Data(offeringIdentifier, i8, sessionIdentifier, displayMode, localeIdentifier, z7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return q.b(this.offeringIdentifier, data.offeringIdentifier) && this.paywallRevision == data.paywallRevision && q.b(this.sessionIdentifier, data.sessionIdentifier) && q.b(this.displayMode, data.displayMode) && q.b(this.localeIdentifier, data.localeIdentifier) && this.darkMode == data.darkMode;
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

        public final String getOfferingIdentifier() {
            return this.offeringIdentifier;
        }

        public final int getPaywallRevision() {
            return this.paywallRevision;
        }

        public final UUID getSessionIdentifier() {
            return this.sessionIdentifier;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v8, types: [int] */
        /* JADX WARN: Type inference failed for: r1v9 */
        public int hashCode() {
            int iHashCode = ((((((((this.offeringIdentifier.hashCode() * 31) + this.paywallRevision) * 31) + this.sessionIdentifier.hashCode()) * 31) + this.displayMode.hashCode()) * 31) + this.localeIdentifier.hashCode()) * 31;
            boolean z7 = this.darkMode;
            ?? r12 = z7;
            if (z7) {
                r12 = 1;
            }
            return iHashCode + r12;
        }

        public String toString() {
            return "Data(offeringIdentifier=" + this.offeringIdentifier + ", paywallRevision=" + this.paywallRevision + ", sessionIdentifier=" + this.sessionIdentifier + ", displayMode=" + this.displayMode + ", localeIdentifier=" + this.localeIdentifier + ", darkMode=" + this.darkMode + ')';
        }
    }

    public /* synthetic */ PaywallEvent(int i8, CreationData creationData, Data data, PaywallEventType paywallEventType, b2 b2Var) {
        if (7 != (i8 & 7)) {
            q1.a(i8, 7, PaywallEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.creationData = creationData;
        this.data = data;
        this.type = paywallEventType;
    }

    public PaywallEvent(CreationData creationData, Data data, PaywallEventType type) {
        q.f(creationData, "creationData");
        q.f(data, "data");
        q.f(type, "type");
        this.creationData = creationData;
        this.data = data;
        this.type = type;
    }

    public static /* synthetic */ PaywallEvent copy$default(PaywallEvent paywallEvent, CreationData creationData, Data data, PaywallEventType paywallEventType, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            creationData = paywallEvent.creationData;
        }
        if ((i8 & 2) != 0) {
            data = paywallEvent.data;
        }
        if ((i8 & 4) != 0) {
            paywallEventType = paywallEvent.type;
        }
        return paywallEvent.copy(creationData, data, paywallEventType);
    }

    public static final void write$Self(PaywallEvent self, d output, f serialDesc) {
        q.f(self, "self");
        q.f(output, "output");
        q.f(serialDesc, "serialDesc");
        output.l(serialDesc, 0, PaywallEvent$CreationData$$serializer.INSTANCE, self.creationData);
        output.l(serialDesc, 1, PaywallEvent$Data$$serializer.INSTANCE, self.data);
        output.l(serialDesc, 2, f0.a("com.revenuecat.purchases.paywalls.events.PaywallEventType", PaywallEventType.values()), self.type);
    }

    public final CreationData component1() {
        return this.creationData;
    }

    public final Data component2() {
        return this.data;
    }

    public final PaywallEventType component3() {
        return this.type;
    }

    public final PaywallEvent copy(CreationData creationData, Data data, PaywallEventType type) {
        q.f(creationData, "creationData");
        q.f(data, "data");
        q.f(type, "type");
        return new PaywallEvent(creationData, data, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallEvent)) {
            return false;
        }
        PaywallEvent paywallEvent = (PaywallEvent) obj;
        return q.b(this.creationData, paywallEvent.creationData) && q.b(this.data, paywallEvent.data) && this.type == paywallEvent.type;
    }

    public final CreationData getCreationData() {
        return this.creationData;
    }

    public final Data getData() {
        return this.data;
    }

    public final PaywallEventType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.creationData.hashCode() * 31) + this.data.hashCode()) * 31) + this.type.hashCode();
    }

    public final PaywallPostReceiptData toPaywallPostReceiptData$purchases_defaultsRelease() {
        String string = this.data.getSessionIdentifier().toString();
        q.e(string, "data.sessionIdentifier.toString()");
        return new PaywallPostReceiptData(string, this.data.getPaywallRevision(), this.data.getDisplayMode(), this.data.getDarkMode(), this.data.getLocaleIdentifier());
    }

    public String toString() {
        return "PaywallEvent(creationData=" + this.creationData + ", data=" + this.data + ", type=" + this.type + ')';
    }
}
