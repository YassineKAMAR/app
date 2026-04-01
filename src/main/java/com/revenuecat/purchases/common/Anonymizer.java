package com.revenuecat.purchases.common;

import f6.j0;
import f6.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;
import w6.j;

/* JADX INFO: loaded from: classes.dex */
public final class Anonymizer {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String EMAIL_REGEX = "[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.]+@[a-zA-Z0-9]+\\.[a-zA-Z]+";

    @Deprecated
    public static final String IP_REGEX = "((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}";

    @Deprecated
    public static final String REDACTED = "*****";

    @Deprecated
    public static final String UUID_REGEX = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}";
    private final j anonymizeRegex = new j("[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.]+@[a-zA-Z0-9]+\\.[a-zA-Z]+|[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}|((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}");

    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    private final Object anonymizedAny(Object obj) {
        ?? linkedHashMap;
        if (obj instanceof String) {
            return anonymizedString((String) obj);
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            linkedHashMap = new ArrayList(p.m(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                linkedHashMap.add(next == null ? null : anonymizedAny(next));
            }
        } else {
            if (!(obj instanceof Map)) {
                return obj;
            }
            Map map = (Map) obj;
            linkedHashMap = new LinkedHashMap(j0.b(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.put(key, value == null ? null : anonymizedAny(value));
            }
        }
        return linkedHashMap;
    }

    public final Map<String, Object> anonymizedMap(Map<String, ? extends Object> mapToAnonymize) {
        q.f(mapToAnonymize, "mapToAnonymize");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0.b(mapToAnonymize.size()));
        Iterator<T> it = mapToAnonymize.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), anonymizedAny(entry.getValue()));
        }
        return linkedHashMap;
    }

    public final String anonymizedString(String textToAnonymize) {
        q.f(textToAnonymize, "textToAnonymize");
        return this.anonymizeRegex.c(textToAnonymize, REDACTED);
    }

    public final Map<String, String> anonymizedStringMap(Map<String, String> mapToAnonymize) {
        q.f(mapToAnonymize, "mapToAnonymize");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0.b(mapToAnonymize.size()));
        Iterator<T> it = mapToAnonymize.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), anonymizedString((String) entry.getValue()));
        }
        return linkedHashMap;
    }
}
