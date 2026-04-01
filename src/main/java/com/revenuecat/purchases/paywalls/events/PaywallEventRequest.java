package com.revenuecat.purchases.paywalls.events;

import f6.p;
import i7.b;
import i7.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k7.f;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import l7.d;
import m7.b2;
import m7.q1;

/* JADX INFO: loaded from: classes.dex */
@h
public final class PaywallEventRequest {
    public static final Companion Companion = new Companion(null);
    private static final n7.a json = n7.a.f25157d;
    private final List<PaywallBackendEvent> events;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final n7.a getJson() {
            return PaywallEventRequest.json;
        }

        public final b<PaywallEventRequest> serializer() {
            return PaywallEventRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaywallEventRequest(int i8, List list, b2 b2Var) {
        if (1 != (i8 & 1)) {
            q1.a(i8, 1, PaywallEventRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.events = list;
    }

    public PaywallEventRequest(List<PaywallBackendEvent> events) {
        q.f(events, "events");
        this.events = events;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaywallEventRequest copy$default(PaywallEventRequest paywallEventRequest, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = paywallEventRequest.events;
        }
        return paywallEventRequest.copy(list);
    }

    public static final void write$Self(PaywallEventRequest self, d output, f serialDesc) {
        q.f(self, "self");
        q.f(output, "output");
        q.f(serialDesc, "serialDesc");
        output.l(serialDesc, 0, new m7.f(PaywallBackendEvent$$serializer.INSTANCE), self.events);
    }

    public final List<PaywallBackendEvent> component1() {
        return this.events;
    }

    public final PaywallEventRequest copy(List<PaywallBackendEvent> events) {
        q.f(events, "events");
        return new PaywallEventRequest(events);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaywallEventRequest) && q.b(this.events, ((PaywallEventRequest) obj).events);
    }

    public final List<String> getCacheKey() {
        List<PaywallBackendEvent> list = this.events;
        ArrayList arrayList = new ArrayList(p.m(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((PaywallBackendEvent) it.next()).hashCode()));
        }
        return arrayList;
    }

    public final List<PaywallBackendEvent> getEvents() {
        return this.events;
    }

    public int hashCode() {
        return this.events.hashCode();
    }

    public String toString() {
        return "PaywallEventRequest(events=" + this.events + ')';
    }
}
