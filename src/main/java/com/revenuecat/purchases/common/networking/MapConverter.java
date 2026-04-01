package com.revenuecat.purchases.common.networking;

import e6.x;
import f6.j0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
public final class MapConverter {
    private final /* synthetic */ <T> Object tryCast(Object obj, l<? super T, ? extends Object> lVar) {
        q.j(3, "T");
        return obj instanceof Object ? lVar.invoke(obj) : obj;
    }

    public final JSONObject convertToJSON$purchases_defaultsRelease(Map<String, ? extends Object> inputMap) throws JSONException {
        q.f(inputMap, "inputMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0.b(inputMap.size()));
        Iterator<T> it = inputMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                Iterable iterable = (Iterable) value;
                boolean z7 = true;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it2 = iterable.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (!(it2.next() instanceof String)) {
                            z7 = false;
                            break;
                        }
                    }
                }
                if (z7) {
                    value = new JSONObject(j0.c(x.a("temp_key", new JSONArray((Collection) value)))).getJSONArray("temp_key");
                }
            } else if (value instanceof Map) {
                value = convertToJSON$purchases_defaultsRelease((Map) value);
            }
            linkedHashMap.put(key, value);
        }
        return createJSONObject$purchases_defaultsRelease(linkedHashMap);
    }

    public final JSONObject createJSONObject$purchases_defaultsRelease(Map<String, ? extends Object> inputMap) {
        q.f(inputMap, "inputMap");
        return new JSONObject(inputMap);
    }
}
