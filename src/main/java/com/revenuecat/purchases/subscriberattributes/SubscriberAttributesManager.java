package com.revenuecat.purchases.subscriberattributes;

import android.app.Application;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import e6.i0;
import e6.x;
import f6.j0;
import f6.k0;
import f6.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;
import w6.v;

/* JADX INFO: loaded from: classes.dex */
public final class SubscriberAttributesManager {
    private final SubscriberAttributesPoster backend;
    private final SubscriberAttributesCache deviceCache;
    private final DeviceIdentifiersFetcher deviceIdentifiersFetcher;
    private final ObtainDeviceIdentifiersObservable obtainingDeviceIdentifiersObservable;

    /* JADX INFO: Access modifiers changed from: private */
    static final class ObtainDeviceIdentifiersObservable extends Observable {
        private final ArrayList<p6.a<i0>> listeners = new ArrayList<>();
        private int numberOfProcesses;

        public ObtainDeviceIdentifiersObservable() {
            addObserver(new Observer() { // from class: com.revenuecat.purchases.subscriberattributes.a
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    SubscriberAttributesManager.ObtainDeviceIdentifiersObservable._init_$lambda$2(this.f20937a, observable, obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$2(ObtainDeviceIdentifiersObservable this$0, Observable observable, Object obj) {
            q.f(this$0, "this$0");
            q.d(observable, "null cannot be cast to non-null type com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.ObtainDeviceIdentifiersObservable");
            if (((ObtainDeviceIdentifiersObservable) observable).numberOfProcesses == 0) {
                synchronized (this$0) {
                    Iterator<T> it = this$0.listeners.iterator();
                    while (it.hasNext()) {
                        ((p6.a) it.next()).invoke();
                    }
                    this$0.listeners.clear();
                    i0 i0Var = i0.f21430a;
                }
            }
        }

        public final synchronized int getNumberOfProcesses() {
            return this.numberOfProcesses;
        }

        public final synchronized void setNumberOfProcesses(int i8) {
            if (this.numberOfProcesses == i8) {
                return;
            }
            this.numberOfProcesses = i8;
            setChanged();
            notifyObservers();
        }

        public final synchronized void waitUntilIdle(p6.a<i0> completion) {
            q.f(completion, "completion");
            if (this.numberOfProcesses == 0) {
                completion.invoke();
            } else {
                this.listeners.add(new SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1(completion));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$collectDeviceIdentifiers$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<Map<String, ? extends String>, i0> {
        final /* synthetic */ String $appUserID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str) {
            super(1);
            this.$appUserID = str;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends String> map) {
            invoke2((Map<String, String>) map);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, String> deviceIdentifiers) {
            q.f(deviceIdentifiers, "deviceIdentifiers");
            SubscriberAttributesManager.this.setAttributes(deviceIdentifiers, this.$appUserID);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$getDeviceIdentifiers$1, reason: invalid class name and case insensitive filesystem */
    static final class C02911 extends r implements l<Map<String, ? extends String>, i0> {
        final /* synthetic */ l<Map<String, String>, i0> $completion;
        final /* synthetic */ SubscriberAttributesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02911(l<? super Map<String, String>, i0> lVar, SubscriberAttributesManager subscriberAttributesManager) {
            super(1);
            this.$completion = lVar;
            this.this$0 = subscriberAttributesManager;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends String> map) {
            invoke2((Map<String, String>) map);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, String> deviceIdentifiers) {
            q.f(deviceIdentifiers, "deviceIdentifiers");
            this.$completion.invoke(deviceIdentifiers);
            this.this$0.obtainingDeviceIdentifiersObservable.setNumberOfProcesses(r2.getNumberOfProcesses() - 1);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$getUnsyncedSubscriberAttributes$1, reason: invalid class name and case insensitive filesystem */
    static final class C02921 extends r implements p6.a<i0> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ l<Map<String, SubscriberAttribute>, i0> $completion;
        final /* synthetic */ SubscriberAttributesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02921(l<? super Map<String, SubscriberAttribute>, i0> lVar, SubscriberAttributesManager subscriberAttributesManager, String str) {
            super(0);
            this.$completion = lVar;
            this.this$0 = subscriberAttributesManager;
            this.$appUserID = str;
        }

        @Override // p6.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$completion.invoke(this.this$0.getDeviceCache().getUnsyncedSubscriberAttributes(this.$appUserID));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$setAttributionID$1, reason: invalid class name and case insensitive filesystem */
    static final class C02931 extends r implements l<Map<String, ? extends String>, i0> {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ SubscriberAttributeKey.AttributionIds $attributionKey;
        final /* synthetic */ String $value;
        final /* synthetic */ SubscriberAttributesManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02931(SubscriberAttributeKey.AttributionIds attributionIds, String str, SubscriberAttributesManager subscriberAttributesManager, String str2) {
            super(1);
            this.$attributionKey = attributionIds;
            this.$value = str;
            this.this$0 = subscriberAttributesManager;
            this.$appUserID = str2;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends String> map) {
            invoke2((Map<String, String>) map);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, String> deviceIdentifiers) {
            q.f(deviceIdentifiers, "deviceIdentifiers");
            this.this$0.setAttributes(k0.j(j0.c(x.a(this.$attributionKey.getBackendKey(), this.$value)), deviceIdentifiers), this.$appUserID);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1, reason: invalid class name and case insensitive filesystem */
    static final class C02941 extends r implements p6.a<i0> {
        final /* synthetic */ p6.a<i0> $completion;
        final /* synthetic */ String $currentAppUserID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02941(p6.a<i0> aVar, String str) {
            super(0);
            this.$completion = aVar;
            this.$currentAppUserID = str;
        }

        @Override // p6.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Map<String, Map<String, SubscriberAttribute>> unsyncedSubscriberAttributes = SubscriberAttributesManager.this.getDeviceCache().getUnsyncedSubscriberAttributes();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Map<String, SubscriberAttribute>> entry : unsyncedSubscriberAttributes.entrySet()) {
                if (!v.p(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap.isEmpty()) {
                LogWrapperKt.log(LogIntent.DEBUG, AttributionStrings.NO_SUBSCRIBER_ATTRIBUTES_TO_SYNCHRONIZE);
                p6.a<i0> aVar = this.$completion;
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            }
            int size = linkedHashMap.size();
            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
            SubscriberAttributesManager subscriberAttributesManager = SubscriberAttributesManager.this;
            String str = this.$currentAppUserID;
            p6.a<i0> aVar2 = this.$completion;
            for (Iterator it = linkedHashMap.entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String str2 = (String) entry2.getKey();
                Map map = (Map) entry2.getValue();
                subscriberAttributesManager.getBackend().postSubscriberAttributes(BackendHelpersKt.toBackendMap(map), str2, new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1(subscriberAttributesManager, str2, map, str, xVar, aVar2, size), new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$2(subscriberAttributesManager, str2, map, xVar, aVar2, size));
                str = str;
            }
        }
    }

    public SubscriberAttributesManager(SubscriberAttributesCache deviceCache, SubscriberAttributesPoster backend, DeviceIdentifiersFetcher deviceIdentifiersFetcher) {
        q.f(deviceCache, "deviceCache");
        q.f(backend, "backend");
        q.f(deviceIdentifiersFetcher, "deviceIdentifiersFetcher");
        this.deviceCache = deviceCache;
        this.backend = backend;
        this.deviceIdentifiersFetcher = deviceIdentifiersFetcher;
        this.obtainingDeviceIdentifiersObservable = new ObtainDeviceIdentifiersObservable();
    }

    private final void getDeviceIdentifiers(Application application, l<? super Map<String, String>, i0> lVar) {
        ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable = this.obtainingDeviceIdentifiersObservable;
        obtainDeviceIdentifiersObservable.setNumberOfProcesses(obtainDeviceIdentifiersObservable.getNumberOfProcesses() + 1);
        this.deviceIdentifiersFetcher.getDeviceIdentifiers(application, new C02911(lVar, this));
    }

    private final void storeAttributesIfNeeded(Map<String, SubscriberAttribute> map, String str) {
        Map<String, SubscriberAttribute> allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, SubscriberAttribute>> it = map.entrySet().iterator();
        while (true) {
            boolean z7 = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, SubscriberAttribute> next = it.next();
            String key = next.getKey();
            SubscriberAttribute value = next.getValue();
            if (allStoredSubscriberAttributes.containsKey(key)) {
                SubscriberAttribute subscriberAttribute = allStoredSubscriberAttributes.get(key);
                if (q.b(subscriberAttribute != null ? subscriberAttribute.getValue() : null, value.getValue())) {
                    z7 = false;
                }
            }
            if (z7) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        if (!linkedHashMap.isEmpty()) {
            this.deviceCache.setAttributes(str, linkedHashMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void synchronizeSubscriberAttributesForAllUsers$default(SubscriberAttributesManager subscriberAttributesManager, String str, p6.a aVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            aVar = null;
        }
        subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(str, aVar);
    }

    public final void collectDeviceIdentifiers(String appUserID, Application applicationContext) {
        q.f(appUserID, "appUserID");
        q.f(applicationContext, "applicationContext");
        getDeviceIdentifiers(applicationContext, new AnonymousClass1(appUserID));
    }

    public final synchronized void copyUnsyncedSubscriberAttributes(String originalAppUserId, String newAppUserID) {
        q.f(originalAppUserId, "originalAppUserId");
        q.f(newAppUserID, "newAppUserID");
        Map<String, SubscriberAttribute> unsyncedSubscriberAttributes = this.deviceCache.getUnsyncedSubscriberAttributes(originalAppUserId);
        if (unsyncedSubscriberAttributes.isEmpty()) {
            return;
        }
        String str = String.format(AttributionStrings.COPYING_ATTRIBUTES_FROM_TO_USER, Arrays.copyOf(new Object[]{originalAppUserId, newAppUserID}, 2));
        q.e(str, "format(this, *args)");
        LogUtilsKt.infoLog(str);
        this.deviceCache.setAttributes(newAppUserID, unsyncedSubscriberAttributes);
        this.deviceCache.clearAllSubscriberAttributesFromUser(originalAppUserId);
    }

    public final SubscriberAttributesPoster getBackend() {
        return this.backend;
    }

    public final SubscriberAttributesCache getDeviceCache() {
        return this.deviceCache;
    }

    public final synchronized void getUnsyncedSubscriberAttributes(String appUserID, l<? super Map<String, SubscriberAttribute>, i0> completion) {
        q.f(appUserID, "appUserID");
        q.f(completion, "completion");
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new C02921(completion, this, appUserID));
    }

    public final synchronized void markAsSynced(String appUserID, Map<String, SubscriberAttribute> attributesToMarkAsSynced, List<SubscriberAttributeError> attributeErrors) {
        q.f(appUserID, "appUserID");
        q.f(attributesToMarkAsSynced, "attributesToMarkAsSynced");
        q.f(attributeErrors, "attributeErrors");
        if (!attributeErrors.isEmpty()) {
            LogIntent logIntent = LogIntent.RC_ERROR;
            String str = String.format(AttributionStrings.SUBSCRIBER_ATTRIBUTES_ERROR, Arrays.copyOf(new Object[]{attributeErrors}, 1));
            q.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
        if (attributesToMarkAsSynced.isEmpty()) {
            return;
        }
        LogIntent logIntent2 = LogIntent.INFO;
        StringBuilder sb = new StringBuilder();
        String str2 = String.format(AttributionStrings.MARKING_ATTRIBUTES_SYNCED, Arrays.copyOf(new Object[]{appUserID}, 1));
        q.e(str2, "format(this, *args)");
        sb.append(str2);
        sb.append(w.G(attributesToMarkAsSynced.values(), "\n", null, null, 0, null, null, 62, null));
        LogWrapperKt.log(logIntent2, sb.toString());
        Map<String, SubscriberAttribute> allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(appUserID);
        Map<String, SubscriberAttribute> mapT = k0.t(allStoredSubscriberAttributes);
        for (Map.Entry<String, SubscriberAttribute> entry : attributesToMarkAsSynced.entrySet()) {
            String key = entry.getKey();
            SubscriberAttribute value = entry.getValue();
            SubscriberAttribute subscriberAttribute = allStoredSubscriberAttributes.get(key);
            if (subscriberAttribute != null) {
                if (subscriberAttribute.isSynced()) {
                    subscriberAttribute = null;
                }
                if (subscriberAttribute != null) {
                    if ((q.b(subscriberAttribute.getValue(), value.getValue()) ? subscriberAttribute : null) != null) {
                        mapT.put(key, SubscriberAttribute.copy$default(value, null, null, null, null, true, 15, null));
                    }
                }
            }
        }
        this.deviceCache.setAttributes(appUserID, mapT);
    }

    public final synchronized void setAttribute(SubscriberAttributeKey key, String str, String appUserID) {
        q.f(key, "key");
        q.f(appUserID, "appUserID");
        setAttributes(j0.c(x.a(key.getBackendKey(), str)), appUserID);
    }

    public final synchronized void setAttributes(Map<String, String> attributesToSet, String appUserID) {
        q.f(attributesToSet, "attributesToSet");
        q.f(appUserID, "appUserID");
        ArrayList arrayList = new ArrayList(attributesToSet.size());
        for (Map.Entry<String, String> entry : attributesToSet.entrySet()) {
            String key = entry.getKey();
            arrayList.add(x.a(key, new SubscriberAttribute(key, entry.getValue(), (DateProvider) null, (Date) null, false, 28, (j) null)));
        }
        storeAttributesIfNeeded(k0.n(arrayList), appUserID);
    }

    public final void setAttributionID(SubscriberAttributeKey.AttributionIds attributionKey, String str, String appUserID, Application applicationContext) {
        q.f(attributionKey, "attributionKey");
        q.f(appUserID, "appUserID");
        q.f(applicationContext, "applicationContext");
        getDeviceIdentifiers(applicationContext, new C02931(attributionKey, str, this, appUserID));
    }

    public final void synchronizeSubscriberAttributesForAllUsers(String currentAppUserID, p6.a<i0> aVar) {
        q.f(currentAppUserID, "currentAppUserID");
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new C02941(aVar, currentAppUserID));
    }
}
