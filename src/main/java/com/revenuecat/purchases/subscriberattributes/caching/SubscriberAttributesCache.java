package com.revenuecat.purchases.subscriberattributes.caching;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt;
import e6.k;
import e6.m;
import e6.r;
import e6.x;
import f6.j0;
import f6.k0;
import f6.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.q;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class SubscriberAttributesCache {
    private final DeviceCache deviceCache;
    private final k subscriberAttributesCacheKey$delegate;

    public SubscriberAttributesCache(DeviceCache deviceCache) {
        q.f(deviceCache, "deviceCache");
        this.deviceCache = deviceCache;
        this.subscriberAttributesCacheKey$delegate = m.b(new SubscriberAttributesCache$subscriberAttributesCacheKey$2(this));
    }

    private final synchronized void deleteSyncedSubscriberAttributesForOtherUsers(String str) {
        r rVarA;
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.DELETING_ATTRIBUTES_OTHER_USERS, Arrays.copyOf(new Object[]{str}, 1));
        q.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
        ArrayList arrayList = new ArrayList(allStoredSubscriberAttributes.size());
        for (Map.Entry<String, Map<String, SubscriberAttribute>> entry : allStoredSubscriberAttributes.entrySet()) {
            String key = entry.getKey();
            Map<String, SubscriberAttribute> value = entry.getValue();
            if (q.b(str, key)) {
                rVarA = x.a(key, value);
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, SubscriberAttribute> entry2 : value.entrySet()) {
                    if (!entry2.getValue().isSynced()) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                rVarA = x.a(key, linkedHashMap);
            }
            arrayList.add(rVarA);
        }
        Map mapN = k0.n(arrayList);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry3 : mapN.entrySet()) {
            if (!((Map) entry3.getValue()).isEmpty()) {
                linkedHashMap2.put(entry3.getKey(), entry3.getValue());
            }
        }
        putAttributes$purchases_defaultsRelease(this.deviceCache, linkedHashMap2);
    }

    private final Map<String, SubscriberAttribute> filterUnsynced(Map<String, SubscriberAttribute> map, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, SubscriberAttribute> entry : map.entrySet()) {
            if (true ^ entry.getValue().isSynced()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LogIntent logIntent = LogIntent.DEBUG;
        StringBuilder sb = new StringBuilder();
        String str2 = String.format(AttributionStrings.UNSYNCED_ATTRIBUTES_COUNT, Arrays.copyOf(new Object[]{Integer.valueOf(linkedHashMap.size()), str}, 2));
        q.e(str2, "format(this, *args)");
        sb.append(str2);
        sb.append(linkedHashMap.isEmpty() ^ true ? w.G(linkedHashMap.values(), "\n", null, null, 0, null, null, 62, null) : "");
        LogWrapperKt.log(logIntent, sb.toString());
        return linkedHashMap;
    }

    public final synchronized void cleanUpSubscriberAttributeCache(String currentAppUserID) {
        q.f(currentAppUserID, "currentAppUserID");
        SubscriberAttributesMigrationExtensionsKt.migrateSubscriberAttributesIfNeeded(this);
        deleteSyncedSubscriberAttributesForOtherUsers(currentAppUserID);
    }

    public final synchronized void clearAllSubscriberAttributesFromUser(String appUserID) {
        q.f(appUserID, "appUserID");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.DELETING_ATTRIBUTES, Arrays.copyOf(new Object[]{appUserID}, 1));
        q.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        Map mapT = k0.t(getAllStoredSubscriberAttributes());
        mapT.remove(appUserID);
        putAttributes$purchases_defaultsRelease(this.deviceCache, k0.p(mapT));
    }

    public final synchronized void clearSubscriberAttributesIfSyncedForSubscriber(String appUserID) {
        q.f(appUserID, "appUserID");
        if (getUnsyncedSubscriberAttributes(appUserID).isEmpty()) {
            clearAllSubscriberAttributesFromUser(appUserID);
        }
    }

    public final synchronized Map<String, Map<String, SubscriberAttribute>> getAllStoredSubscriberAttributes() {
        Map<String, Map<String, SubscriberAttribute>> mapE;
        JSONObject jSONObjectOrNull = this.deviceCache.getJSONObjectOrNull(getSubscriberAttributesCacheKey$purchases_defaultsRelease());
        if (jSONObjectOrNull == null || (mapE = SubscriberAttributesFactoriesKt.buildSubscriberAttributesMapPerUser(jSONObjectOrNull)) == null) {
            mapE = k0.e();
        }
        return mapE;
    }

    public final synchronized Map<String, SubscriberAttribute> getAllStoredSubscriberAttributes(String appUserID) {
        Map<String, SubscriberAttribute> mapE;
        q.f(appUserID, "appUserID");
        mapE = getAllStoredSubscriberAttributes().get(appUserID);
        if (mapE == null) {
            mapE = k0.e();
        }
        return mapE;
    }

    public final DeviceCache getDeviceCache$purchases_defaultsRelease() {
        return this.deviceCache;
    }

    public final String getSubscriberAttributesCacheKey$purchases_defaultsRelease() {
        return (String) this.subscriberAttributesCacheKey$delegate.getValue();
    }

    public final synchronized Map<String, Map<String, SubscriberAttribute>> getUnsyncedSubscriberAttributes() {
        LinkedHashMap linkedHashMap;
        Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(j0.b(allStoredSubscriberAttributes.size()));
        for (Object obj : allStoredSubscriberAttributes.entrySet()) {
            Object key = ((Map.Entry) obj).getKey();
            Map.Entry entry = (Map.Entry) obj;
            linkedHashMap2.put(key, filterUnsynced((Map) entry.getValue(), (String) entry.getKey()));
        }
        linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!((Map) entry2.getValue()).isEmpty()) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap;
    }

    public final synchronized Map<String, SubscriberAttribute> getUnsyncedSubscriberAttributes(String appUserID) {
        q.f(appUserID, "appUserID");
        return filterUnsynced(getAllStoredSubscriberAttributes(appUserID), appUserID);
    }

    public final void putAttributes$purchases_defaultsRelease(DeviceCache deviceCache, Map<String, ? extends Map<String, SubscriberAttribute>> updatedSubscriberAttributesForAll) {
        q.f(deviceCache, "<this>");
        q.f(updatedSubscriberAttributesForAll, "updatedSubscriberAttributesForAll");
        DeviceCache deviceCache2 = this.deviceCache;
        String subscriberAttributesCacheKey$purchases_defaultsRelease = getSubscriberAttributesCacheKey$purchases_defaultsRelease();
        String string = CachingHelpersKt.toJSONObject(updatedSubscriberAttributesForAll).toString();
        q.e(string, "updatedSubscriberAttribu…toJSONObject().toString()");
        deviceCache2.putString(subscriberAttributesCacheKey$purchases_defaultsRelease, string);
    }

    public final synchronized void setAttributes(String appUserID, Map<String, SubscriberAttribute> attributesToBeSet) {
        q.f(appUserID, "appUserID");
        q.f(attributesToBeSet, "attributesToBeSet");
        Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
        Map<String, SubscriberAttribute> mapE = allStoredSubscriberAttributes.get(appUserID);
        if (mapE == null) {
            mapE = k0.e();
        }
        putAttributes$purchases_defaultsRelease(this.deviceCache, k0.j(allStoredSubscriberAttributes, j0.c(x.a(appUserID, k0.j(mapE, attributesToBeSet)))));
    }
}
