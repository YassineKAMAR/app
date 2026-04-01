package com.amazon.a.a.m;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b implements com.amazon.a.a.e.b<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f3740a = new com.amazon.a.a.o.c("ExpirableValueDataStore");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.k.b f3741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, a> f3742c = new HashMap();

    @Override // com.amazon.a.a.e.b
    public synchronized void a(a aVar) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3740a.a("Observed expiration: " + aVar + " removing from store!");
        }
        Iterator<Map.Entry<String, a>> it = this.f3742c.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue() == aVar) {
                if (com.amazon.a.a.o.c.f3947a) {
                    f3740a.a("Removing entry from store: " + aVar);
                }
                it.remove();
            }
        }
    }

    public synchronized void a(String str, a aVar) {
        com.amazon.a.a.o.a.a.a((Object) str, SubscriberAttributeKt.JSON_NAME_KEY);
        com.amazon.a.a.o.a.a.a((Object) aVar, "value");
        if (com.amazon.a.a.o.c.f3947a) {
            f3740a.a("Placing value into store with key: " + str + ", expiration: " + aVar.a());
        }
        this.f3741b.b(aVar);
        aVar.a(this);
        this.f3742c.put(str, aVar);
    }

    public synchronized <T> void a(String str, T t7) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3740a.a("Placing non-expiring value into store with key: " + str);
        }
        this.f3742c.put(str, new a(t7, new Date()) { // from class: com.amazon.a.a.m.b.1
            @Override // com.amazon.a.a.e.a
            protected void d() {
                if (com.amazon.a.a.o.c.f3948b) {
                    b.f3740a.b("Woah, non-expirable value was expired!!!!");
                }
            }
        });
    }

    public synchronized boolean a(String str) {
        return b(str) != null;
    }

    public synchronized <T> T b(String str) {
        if (com.amazon.a.a.o.c.f3947a) {
            f3740a.a("Fetching value: " + str);
        }
        a aVar = this.f3742c.get(str);
        if (aVar != null) {
            return (T) aVar.h();
        }
        if (com.amazon.a.a.o.c.f3947a) {
            f3740a.a("Value not present in store, returning null");
        }
        return null;
    }

    public synchronized void c(String str) {
        a aVar = this.f3742c.get(str);
        if (aVar == null) {
            return;
        }
        if (com.amazon.a.a.o.c.f3947a) {
            f3740a.a("Removing value associated with key: " + str + ", value: " + aVar);
        }
        this.f3742c.remove(str);
        aVar.f();
    }

    public String toString() {
        return this.f3742c.toString();
    }
}
