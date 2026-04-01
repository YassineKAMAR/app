package com.revenuecat.purchases;

import java.util.Map;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class Offerings {
    private final Map<String, Offering> all;
    private final Offering current;

    public Offerings(Offering offering, Map<String, Offering> all) {
        q.f(all, "all");
        this.current = offering;
        this.all = all;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Offerings copy$default(Offerings offerings, Offering offering, Map map, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            offering = offerings.current;
        }
        if ((i8 & 2) != 0) {
            map = offerings.all;
        }
        return offerings.copy(offering, map);
    }

    public final Offering component1() {
        return this.current;
    }

    public final Map<String, Offering> component2() {
        return this.all;
    }

    public final Offerings copy(Offering offering, Map<String, Offering> all) {
        q.f(all, "all");
        return new Offerings(offering, all);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offerings)) {
            return false;
        }
        Offerings offerings = (Offerings) obj;
        return q.b(this.current, offerings.current) && q.b(this.all, offerings.all);
    }

    public final Offering get(String identifier) {
        q.f(identifier, "identifier");
        return getOffering(identifier);
    }

    public final Map<String, Offering> getAll() {
        return this.all;
    }

    public final Offering getCurrent() {
        return this.current;
    }

    public final Offering getOffering(String identifier) {
        q.f(identifier, "identifier");
        return this.all.get(identifier);
    }

    public int hashCode() {
        Offering offering = this.current;
        return ((offering == null ? 0 : offering.hashCode()) * 31) + this.all.hashCode();
    }

    public String toString() {
        return "Offerings(current=" + this.current + ", all=" + this.all + ')';
    }
}
