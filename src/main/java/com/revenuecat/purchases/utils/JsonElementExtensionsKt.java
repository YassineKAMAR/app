package com.revenuecat.purchases.utils;

import e6.r;
import e6.x;
import f6.j0;
import f6.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.q;
import n7.h;
import n7.i;
import n7.t;
import n7.v;
import t6.l;

/* JADX INFO: loaded from: classes.dex */
public final class JsonElementExtensionsKt {
    public static final Map<String, Object> asMap(h hVar) {
        q.f(hVar, "<this>");
        if (!(hVar instanceof t)) {
            return null;
        }
        Set<Map.Entry<String, h>> setEntrySet = i.n(hVar).entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(l.b(j0.b(p.m(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            r rVarA = x.a(entry.getKey(), getExtractedContent((h) entry.getValue()));
            linkedHashMap.put(rVarA.c(), rVarA.d());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    private static final Object getExtractedContent(h hVar) {
        ?? arrayList;
        if (hVar instanceof v) {
            v vVarO = i.o(hVar);
            if (vVarO.g()) {
                return vVarO.a();
            }
            arrayList = i.e(vVarO);
            if (arrayList == 0 && (arrayList = i.l(vVarO)) == 0 && (arrayList = i.q(vVarO)) == 0 && (arrayList = i.j(vVarO)) == 0 && (arrayList = i.h(vVarO)) == 0) {
                return i.f(vVarO);
            }
        } else {
            if (!(hVar instanceof n7.b)) {
                if (!(hVar instanceof t)) {
                    return null;
                }
                Set<Map.Entry<String, h>> setEntrySet = i.n(hVar).entrySet();
                LinkedHashMap linkedHashMap = new LinkedHashMap(l.b(j0.b(p.m(setEntrySet, 10)), 16));
                Iterator it = setEntrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    r rVarA = x.a(entry.getKey(), getExtractedContent((h) entry.getValue()));
                    linkedHashMap.put(rVarA.c(), rVarA.d());
                }
                return linkedHashMap;
            }
            n7.b bVarM = i.m(hVar);
            arrayList = new ArrayList(p.m(bVarM, 10));
            Iterator<h> it2 = bVarM.iterator();
            while (it2.hasNext()) {
                arrayList.add(getExtractedContent(it2.next()));
            }
        }
        return arrayList;
    }
}
