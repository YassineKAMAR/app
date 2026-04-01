package com.revenuecat.purchases.utils;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class JSONArrayExtensionsKt {
    public static final <T> List<T> toList(JSONArray jSONArray) throws JSONException {
        q.f(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            Object list = jSONArray.get(i8);
            if (list instanceof JSONObject) {
                list = JSONObjectExtensionsKt.toMap((JSONObject) list, true);
            } else if (list instanceof JSONArray) {
                list = toList((JSONArray) list);
            }
            arrayList.add(list);
        }
        return arrayList;
    }
}
