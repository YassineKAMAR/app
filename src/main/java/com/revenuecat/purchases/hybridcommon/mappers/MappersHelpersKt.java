package com.revenuecat.purchases.hybridcommon.mappers;

import com.revenuecat.purchases.utils.Iso8601Utils;
import e6.r;
import e6.x;
import f6.i;
import f6.j;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v6.b;
import v6.f;

/* JADX INFO: loaded from: classes.dex */
public final class MappersHelpersKt {
    public static final JSONObject convertToJson(Map<String, ?> map) throws JSONException {
        List listC;
        q.f(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = JSONObject.NULL;
            } else if (value instanceof Map) {
                q.d(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                value = convertToJson((Map) value);
            } else {
                if (value instanceof List) {
                    listC = (List) value;
                } else if (value instanceof Object[]) {
                    listC = j.C((Object[]) value);
                }
                value = convertToJsonArray(listC);
            }
            jSONObject.put(key, value);
        }
        return jSONObject;
    }

    public static final JSONArray convertToJsonArray(List<?> list) throws JSONException {
        List listC;
        q.f(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (Object objConvertToJsonArray : list) {
            if (objConvertToJsonArray == null) {
                objConvertToJsonArray = JSONObject.NULL;
            } else if (objConvertToJsonArray instanceof Map) {
                q.d(objConvertToJsonArray, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                objConvertToJsonArray = convertToJson((Map) objConvertToJsonArray);
            } else {
                if (objConvertToJsonArray instanceof Object[]) {
                    listC = i.c((Object[]) objConvertToJsonArray);
                } else if (objConvertToJsonArray instanceof List) {
                    listC = (List) objConvertToJsonArray;
                }
                objConvertToJsonArray = convertToJsonArray(listC);
            }
            jSONArray.put(objConvertToJsonArray);
        }
        return jSONArray;
    }

    public static final Map<String, String> convertToMap(JSONObject jSONObject) {
        q.f(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        q.e(itKeys, "this.keys()");
        b<String> bVarA = f.a(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bVarA) {
            r rVarA = x.a(str, jSONObject.isNull(str) ? null : jSONObject.getString(str));
            linkedHashMap.put(rVarA.c(), rVarA.d());
        }
        return linkedHashMap;
    }

    public static final String formatUsingDeviceLocale(String priceCurrencyCode, long j8) {
        q.f(priceCurrencyCode, "priceCurrencyCode");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(Currency.getInstance(priceCurrencyCode));
        String str = currencyInstance.format(j8);
        q.e(str, "getCurrencyInstance().ap…ode)\n    }.format(number)");
        return str;
    }

    public static final String toIso8601(Date date) {
        q.f(date, "<this>");
        String str = Iso8601Utils.format(date);
        q.e(str, "format(this)");
        return str;
    }

    public static final long toMillis(Date date) {
        q.f(date, "<this>");
        return date.getTime();
    }
}
