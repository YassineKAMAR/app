package com.revenuecat.purchases.subscriberattributes.caching;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt;
import e6.x;
import f6.k0;
import f6.p;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.q;
import org.json.JSONObject;
import w6.w;

/* JADX INFO: loaded from: classes.dex */
public final class SubscriberAttributesMigrationExtensionsKt {
    public static final synchronized Map<String, Map<String, SubscriberAttribute>> getAllLegacyStoredSubscriberAttributes(SubscriberAttributesCache subscriberAttributesCache) {
        ArrayList arrayList;
        Map<String, SubscriberAttribute> mapE;
        q.f(subscriberAttributesCache, "<this>");
        String strLegacySubscriberAttributesCacheKey = legacySubscriberAttributesCacheKey(subscriberAttributesCache, "");
        Set<String> setFindKeysThatStartWith = subscriberAttributesCache.getDeviceCache$purchases_defaultsRelease().findKeysThatStartWith(strLegacySubscriberAttributesCacheKey);
        arrayList = new ArrayList(p.m(setFindKeysThatStartWith, 10));
        for (String str : setFindKeysThatStartWith) {
            String str2 = (String) w.b0(str, new String[]{strLegacySubscriberAttributesCacheKey}, false, 0, 6, null).get(1);
            JSONObject jSONObjectOrNull = subscriberAttributesCache.getDeviceCache$purchases_defaultsRelease().getJSONObjectOrNull(str);
            if (jSONObjectOrNull == null || (mapE = SubscriberAttributesFactoriesKt.buildLegacySubscriberAttributes(jSONObjectOrNull)) == null) {
                mapE = k0.e();
            }
            arrayList.add(x.a(str2, mapE));
        }
        return k0.n(arrayList);
    }

    public static final String legacySubscriberAttributesCacheKey(SubscriberAttributesCache subscriberAttributesCache, String appUserID) {
        q.f(subscriberAttributesCache, "<this>");
        q.f(appUserID, "appUserID");
        return subscriberAttributesCache.getSubscriberAttributesCacheKey$purchases_defaultsRelease() + '.' + appUserID;
    }

    public static final synchronized void migrateSubscriberAttributes(SubscriberAttributesCache subscriberAttributesCache, Map<String, ? extends Map<String, SubscriberAttribute>> legacySubscriberAttributesForAppUserID) {
        q.f(subscriberAttributesCache, "<this>");
        q.f(legacySubscriberAttributesForAppUserID, "legacySubscriberAttributesForAppUserID");
        Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = subscriberAttributesCache.getAllStoredSubscriberAttributes();
        Map<String, ? extends Map<String, SubscriberAttribute>> mapT = k0.t(allStoredSubscriberAttributes);
        for (Map.Entry<String, ? extends Map<String, SubscriberAttribute>> entry : legacySubscriberAttributesForAppUserID.entrySet()) {
            String key = entry.getKey();
            Map<String, SubscriberAttribute> value = entry.getValue();
            Map<String, SubscriberAttribute> mapE = allStoredSubscriberAttributes.get(key);
            if (mapE == null) {
                mapE = k0.e();
            }
            mapT.put(key, k0.j(value, mapE));
            subscriberAttributesCache.getDeviceCache$purchases_defaultsRelease().remove(legacySubscriberAttributesCacheKey(subscriberAttributesCache, key));
        }
        subscriberAttributesCache.putAttributes$purchases_defaultsRelease(subscriberAttributesCache.getDeviceCache$purchases_defaultsRelease(), mapT);
    }

    public static final synchronized void migrateSubscriberAttributesIfNeeded(SubscriberAttributesCache subscriberAttributesCache) {
        q.f(subscriberAttributesCache, "<this>");
        Map<String, Map<String, SubscriberAttribute>> allLegacyStoredSubscriberAttributes = getAllLegacyStoredSubscriberAttributes(subscriberAttributesCache);
        if (!(!allLegacyStoredSubscriberAttributes.isEmpty())) {
            allLegacyStoredSubscriberAttributes = null;
        }
        if (allLegacyStoredSubscriberAttributes != null) {
            migrateSubscriberAttributes(subscriberAttributesCache, allLegacyStoredSubscriberAttributes);
        }
    }
}
