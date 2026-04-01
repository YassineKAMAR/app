package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.utils.Event;
import i7.b;
import i7.h;
import i7.l;
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
public final class PaywallStoredEvent implements Event {
    public static final Companion Companion = new Companion(null);
    private static final a.C0153a json = n7.a.f25157d;
    private final PaywallEvent event;
    private final String userID;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final PaywallStoredEvent fromString(String string) {
            q.f(string, "string");
            a.C0153a json = getJson();
            b<Object> bVarB = l.b(json.a(), z.g(PaywallStoredEvent.class));
            q.d(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            return (PaywallStoredEvent) json.c(bVarB, string);
        }

        public final a.C0153a getJson() {
            return PaywallStoredEvent.json;
        }

        public final b<PaywallStoredEvent> serializer() {
            return PaywallStoredEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaywallStoredEvent(int i8, PaywallEvent paywallEvent, String str, b2 b2Var) {
        if (3 != (i8 & 3)) {
            q1.a(i8, 3, PaywallStoredEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.event = paywallEvent;
        this.userID = str;
    }

    public PaywallStoredEvent(PaywallEvent event, String userID) {
        q.f(event, "event");
        q.f(userID, "userID");
        this.event = event;
        this.userID = userID;
    }

    public static /* synthetic */ PaywallStoredEvent copy$default(PaywallStoredEvent paywallStoredEvent, PaywallEvent paywallEvent, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            paywallEvent = paywallStoredEvent.event;
        }
        if ((i8 & 2) != 0) {
            str = paywallStoredEvent.userID;
        }
        return paywallStoredEvent.copy(paywallEvent, str);
    }

    public static final void write$Self(PaywallStoredEvent self, d output, f serialDesc) {
        q.f(self, "self");
        q.f(output, "output");
        q.f(serialDesc, "serialDesc");
        output.l(serialDesc, 0, PaywallEvent$$serializer.INSTANCE, self.event);
        output.g(serialDesc, 1, self.userID);
    }

    public final PaywallEvent component1() {
        return this.event;
    }

    public final String component2() {
        return this.userID;
    }

    public final PaywallStoredEvent copy(PaywallEvent event, String userID) {
        q.f(event, "event");
        q.f(userID, "userID");
        return new PaywallStoredEvent(event, userID);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallStoredEvent)) {
            return false;
        }
        PaywallStoredEvent paywallStoredEvent = (PaywallStoredEvent) obj;
        return q.b(this.event, paywallStoredEvent.event) && q.b(this.userID, paywallStoredEvent.userID);
    }

    public final PaywallEvent getEvent() {
        return this.event;
    }

    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        return (this.event.hashCode() * 31) + this.userID.hashCode();
    }

    public final PaywallBackendEvent toPaywallBackendEvent() {
        String string = this.event.getCreationData().getId().toString();
        q.e(string, "event.creationData.id.toString()");
        String value = this.event.getType().getValue();
        String str = this.userID;
        String string2 = this.event.getData().getSessionIdentifier().toString();
        q.e(string2, "event.data.sessionIdentifier.toString()");
        return new PaywallBackendEvent(string, 1, value, str, string2, this.event.getData().getOfferingIdentifier(), this.event.getData().getPaywallRevision(), this.event.getCreationData().getDate().getTime(), this.event.getData().getDisplayMode(), this.event.getData().getDarkMode(), this.event.getData().getLocaleIdentifier());
    }

    @Override // com.revenuecat.purchases.utils.Event
    public String toString() {
        a.C0153a c0153a = json;
        b<Object> bVarB = l.b(c0153a.a(), z.g(PaywallStoredEvent.class));
        q.d(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return c0153a.b(bVarB, this);
    }
}
