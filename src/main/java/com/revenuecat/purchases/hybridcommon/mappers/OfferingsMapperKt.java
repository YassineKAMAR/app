package com.revenuecat.purchases.hybridcommon.mappers;

import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import e6.r;
import e6.x;
import f6.j0;
import f6.k0;
import f6.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class OfferingsMapperKt {
    private static final Map<String, Object> map(Offering offering) {
        r[] rVarArr = new r[11];
        rVarArr[0] = x.a("identifier", offering.getIdentifier());
        rVarArr[1] = x.a("serverDescription", offering.getServerDescription());
        rVarArr[2] = x.a("metadata", offering.getMetadata());
        List<Package> availablePackages = offering.getAvailablePackages();
        ArrayList arrayList = new ArrayList(p.m(availablePackages, 10));
        Iterator<T> it = availablePackages.iterator();
        while (it.hasNext()) {
            arrayList.add(map((Package) it.next(), offering.getIdentifier()));
        }
        rVarArr[3] = x.a("availablePackages", arrayList);
        Package lifetime = offering.getLifetime();
        rVarArr[4] = x.a("lifetime", lifetime != null ? map(lifetime, offering.getIdentifier()) : null);
        Package annual = offering.getAnnual();
        rVarArr[5] = x.a("annual", annual != null ? map(annual, offering.getIdentifier()) : null);
        Package sixMonth = offering.getSixMonth();
        rVarArr[6] = x.a("sixMonth", sixMonth != null ? map(sixMonth, offering.getIdentifier()) : null);
        Package threeMonth = offering.getThreeMonth();
        rVarArr[7] = x.a("threeMonth", threeMonth != null ? map(threeMonth, offering.getIdentifier()) : null);
        Package twoMonth = offering.getTwoMonth();
        rVarArr[8] = x.a("twoMonth", twoMonth != null ? map(twoMonth, offering.getIdentifier()) : null);
        Package monthly = offering.getMonthly();
        rVarArr[9] = x.a("monthly", monthly != null ? map(monthly, offering.getIdentifier()) : null);
        Package weekly = offering.getWeekly();
        rVarArr[10] = x.a("weekly", weekly != null ? map(weekly, offering.getIdentifier()) : null);
        return k0.g(rVarArr);
    }

    public static final Map<String, Object> map(Offerings offerings) {
        q.f(offerings, "<this>");
        r[] rVarArr = new r[2];
        Map<String, Offering> all = offerings.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0.b(all.size()));
        Iterator<T> it = all.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), map((Offering) entry.getValue()));
        }
        rVarArr[0] = x.a("all", linkedHashMap);
        Offering current = offerings.getCurrent();
        rVarArr[1] = x.a("current", current != null ? map(current) : null);
        return k0.g(rVarArr);
    }

    private static final Map<String, Object> map(Package r32, String str) {
        return k0.g(x.a("identifier", r32.getIdentifier()), x.a("packageType", r32.getPackageType().name()), x.a("product", StoreProductMapperKt.map(r32.getProduct())), x.a("offeringIdentifier", str));
    }
}
