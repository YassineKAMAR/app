package com.revenuecat.purchases;

import com.revenuecat.purchases.paywalls.PaywallData;
import e6.k;
import e6.m;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class Offering {
    private final k annual$delegate;
    private final List<Package> availablePackages;
    private final String identifier;
    private final k lifetime$delegate;
    private final Map<String, Object> metadata;
    private final k monthly$delegate;
    private final PaywallData paywall;
    private final String serverDescription;
    private final k sixMonth$delegate;
    private final k threeMonth$delegate;
    private final k twoMonth$delegate;
    private final k weekly$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Offering(String identifier, String serverDescription, Map<String, ? extends Object> metadata, List<Package> availablePackages) {
        this(identifier, serverDescription, metadata, availablePackages, null, 16, null);
        q.f(identifier, "identifier");
        q.f(serverDescription, "serverDescription");
        q.f(metadata, "metadata");
        q.f(availablePackages, "availablePackages");
    }

    public Offering(String identifier, String serverDescription, Map<String, ? extends Object> metadata, List<Package> availablePackages, PaywallData paywallData) {
        q.f(identifier, "identifier");
        q.f(serverDescription, "serverDescription");
        q.f(metadata, "metadata");
        q.f(availablePackages, "availablePackages");
        this.identifier = identifier;
        this.serverDescription = serverDescription;
        this.metadata = metadata;
        this.availablePackages = availablePackages;
        this.paywall = paywallData;
        this.lifetime$delegate = m.b(new Offering$lifetime$2(this));
        this.annual$delegate = m.b(new Offering$annual$2(this));
        this.sixMonth$delegate = m.b(new Offering$sixMonth$2(this));
        this.threeMonth$delegate = m.b(new Offering$threeMonth$2(this));
        this.twoMonth$delegate = m.b(new Offering$twoMonth$2(this));
        this.monthly$delegate = m.b(new Offering$monthly$2(this));
        this.weekly$delegate = m.b(new Offering$weekly$2(this));
    }

    public /* synthetic */ Offering(String str, String str2, Map map, List list, PaywallData paywallData, int i8, j jVar) {
        this(str, str2, map, list, (i8 & 16) != 0 ? null : paywallData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Offering copy$default(Offering offering, String str, String str2, Map map, List list, PaywallData paywallData, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = offering.identifier;
        }
        if ((i8 & 2) != 0) {
            str2 = offering.serverDescription;
        }
        String str3 = str2;
        if ((i8 & 4) != 0) {
            map = offering.metadata;
        }
        Map map2 = map;
        if ((i8 & 8) != 0) {
            list = offering.availablePackages;
        }
        List list2 = list;
        if ((i8 & 16) != 0) {
            paywallData = offering.paywall;
        }
        return offering.copy(str, str3, map2, list2, paywallData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Package findPackage(PackageType packageType) {
        Object next;
        Iterator<T> it = this.availablePackages.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (q.b(((Package) next).getIdentifier(), packageType.getIdentifier())) {
                break;
            }
        }
        return (Package) next;
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.serverDescription;
    }

    public final Map<String, Object> component3() {
        return this.metadata;
    }

    public final List<Package> component4() {
        return this.availablePackages;
    }

    public final PaywallData component5() {
        return this.paywall;
    }

    public final Offering copy(String identifier, String serverDescription, Map<String, ? extends Object> metadata, List<Package> availablePackages, PaywallData paywallData) {
        q.f(identifier, "identifier");
        q.f(serverDescription, "serverDescription");
        q.f(metadata, "metadata");
        q.f(availablePackages, "availablePackages");
        return new Offering(identifier, serverDescription, metadata, availablePackages, paywallData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offering)) {
            return false;
        }
        Offering offering = (Offering) obj;
        return q.b(this.identifier, offering.identifier) && q.b(this.serverDescription, offering.serverDescription) && q.b(this.metadata, offering.metadata) && q.b(this.availablePackages, offering.availablePackages) && q.b(this.paywall, offering.paywall);
    }

    public final Package get(String s8) {
        q.f(s8, "s");
        return getPackage(s8);
    }

    public final Package getAnnual() {
        return (Package) this.annual$delegate.getValue();
    }

    public final List<Package> getAvailablePackages() {
        return this.availablePackages;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Package getLifetime() {
        return (Package) this.lifetime$delegate.getValue();
    }

    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public final String getMetadataString(String key, String str) {
        q.f(key, "key");
        q.f(str, "default");
        Object obj = this.metadata.get(key);
        String str2 = obj instanceof String ? (String) obj : null;
        return str2 == null ? str : str2;
    }

    public final Package getMonthly() {
        return (Package) this.monthly$delegate.getValue();
    }

    public final Package getPackage(String identifier) {
        q.f(identifier, "identifier");
        for (Package r12 : this.availablePackages) {
            if (q.b(r12.getIdentifier(), identifier)) {
                return r12;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final PaywallData getPaywall() {
        return this.paywall;
    }

    public final String getServerDescription() {
        return this.serverDescription;
    }

    public final Package getSixMonth() {
        return (Package) this.sixMonth$delegate.getValue();
    }

    public final Package getThreeMonth() {
        return (Package) this.threeMonth$delegate.getValue();
    }

    public final Package getTwoMonth() {
        return (Package) this.twoMonth$delegate.getValue();
    }

    public final Package getWeekly() {
        return (Package) this.weekly$delegate.getValue();
    }

    public int hashCode() {
        int iHashCode = ((((((this.identifier.hashCode() * 31) + this.serverDescription.hashCode()) * 31) + this.metadata.hashCode()) * 31) + this.availablePackages.hashCode()) * 31;
        PaywallData paywallData = this.paywall;
        return iHashCode + (paywallData == null ? 0 : paywallData.hashCode());
    }

    public String toString() {
        return "Offering(identifier=" + this.identifier + ", serverDescription=" + this.serverDescription + ", metadata=" + this.metadata + ", availablePackages=" + this.availablePackages + ", paywall=" + this.paywall + ')';
    }
}
