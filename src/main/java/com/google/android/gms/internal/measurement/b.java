package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TreeMap<Integer, s> f18579a = new TreeMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TreeMap<Integer, s> f18580b = new TreeMap<>();

    private static int a(b7 b7Var, s sVar, r rVar) {
        r rVarB = sVar.b(b7Var, Collections.singletonList(rVar));
        if (rVarB instanceof j) {
            return a6.i(rVarB.m().doubleValue());
        }
        return -1;
    }

    public final void b(b7 b7Var, d dVar) {
        dd ddVar = new dd(dVar);
        for (Integer num : this.f18579a.keySet()) {
            e eVar = (e) dVar.d().clone();
            int iA = a(b7Var, this.f18579a.get(num), ddVar);
            if (iA == 2 || iA == -1) {
                dVar.e(eVar);
            }
        }
        Iterator<Integer> it = this.f18580b.keySet().iterator();
        while (it.hasNext()) {
            a(b7Var, this.f18580b.get(it.next()), ddVar);
        }
    }

    public final void c(String str, int i8, s sVar, String str2) {
        TreeMap<Integer, s> treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f18580b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: " + str2);
            }
            treeMap = this.f18579a;
        }
        if (treeMap.containsKey(Integer.valueOf(i8))) {
            i8 = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i8), sVar);
    }
}
