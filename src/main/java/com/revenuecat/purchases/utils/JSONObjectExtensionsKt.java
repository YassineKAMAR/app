package com.revenuecat.purchases.utils;

import e6.x;
import f6.k0;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p6.l;
import v6.f;
import v6.h;

/* JADX INFO: loaded from: classes.dex */
public final class JSONObjectExtensionsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.JSONObjectExtensionsKt$toMap$1, reason: invalid class name */
    static final class AnonymousClass1<T> extends r implements l<String, e6.r<? extends String, ? extends T>> {
        final /* synthetic */ boolean $deep;
        final /* synthetic */ JSONObject $this_toMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z7, JSONObject jSONObject) {
            super(1);
            this.$deep = z7;
            this.$this_toMap = jSONObject;
        }

        @Override // p6.l
        public final e6.r<String, T> invoke(String str) throws JSONException {
            Object list;
            if (this.$deep) {
                list = this.$this_toMap.get(str);
                if (list instanceof JSONObject) {
                    list = JSONObjectExtensionsKt.toMap((JSONObject) list, true);
                } else if (list instanceof JSONArray) {
                    list = JSONArrayExtensionsKt.toList((JSONArray) list);
                }
            } else {
                list = this.$this_toMap.get(str);
            }
            return x.a(str, list);
        }
    }

    public static final Date getDate(JSONObject jSONObject, String jsonKey) {
        q.f(jSONObject, "<this>");
        q.f(jsonKey, "jsonKey");
        Date date = Iso8601Utils.parse(jSONObject.getString(jsonKey));
        q.e(date, "parse(getString(jsonKey))");
        return date;
    }

    public static final String getNullableString(JSONObject jSONObject, String name) {
        q.f(jSONObject, "<this>");
        q.f(name, "name");
        if (jSONObject.isNull(name)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.getString(name);
        }
        return null;
    }

    public static final Date optDate(JSONObject jSONObject, String jsonKey) {
        q.f(jSONObject, "<this>");
        q.f(jsonKey, "jsonKey");
        if (jSONObject.isNull(jsonKey)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getDate(jSONObject, jsonKey);
        }
        return null;
    }

    public static final String optNullableString(JSONObject jSONObject, String name) {
        q.f(jSONObject, "<this>");
        q.f(name, "name");
        if (!jSONObject.has(name)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getNullableString(jSONObject, name);
        }
        return null;
    }

    public static final <T> Map<String, T> toMap(JSONObject jSONObject, boolean z7) {
        v6.b bVarA;
        v6.b bVarD;
        q.f(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        if (itKeys == null || (bVarA = f.a(itKeys)) == null || (bVarD = h.d(bVarA, new AnonymousClass1(z7, jSONObject))) == null) {
            return null;
        }
        return k0.q(bVarD);
    }

    public static /* synthetic */ Map toMap$default(JSONObject jSONObject, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        return toMap(jSONObject, z7);
    }
}
