package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f18631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f18632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<e> f18633c;

    public d() {
        this.f18631a = new e("", 0L, null);
        this.f18632b = new e("", 0L, null);
        this.f18633c = new ArrayList();
    }

    private d(e eVar) {
        this.f18631a = eVar;
        this.f18632b = (e) eVar.clone();
        this.f18633c = new ArrayList();
    }

    public final e a() {
        return this.f18631a;
    }

    public final void b(e eVar) {
        this.f18631a = eVar;
        this.f18632b = (e) eVar.clone();
        this.f18633c.clear();
    }

    public final void c(String str, long j8, Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, e.c(str2, this.f18631a.b(str2), map.get(str2)));
        }
        this.f18633c.add(new e(str, j8, map2));
    }

    public final /* synthetic */ Object clone() {
        d dVar = new d((e) this.f18631a.clone());
        Iterator<e> it = this.f18633c.iterator();
        while (it.hasNext()) {
            dVar.f18633c.add((e) it.next().clone());
        }
        return dVar;
    }

    public final e d() {
        return this.f18632b;
    }

    public final void e(e eVar) {
        this.f18632b = eVar;
    }

    public final List<e> f() {
        return this.f18633c;
    }
}
