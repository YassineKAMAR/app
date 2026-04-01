package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
class v93 extends n93 implements SortedMap {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    SortedSet f16076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ ba3 f16077f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v93(ba3 ba3Var, SortedMap sortedMap) {
        super(ba3Var, sortedMap);
        this.f16077f = ba3Var;
    }

    SortedMap c() {
        return (SortedMap) this.f11744c;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return c().comparator();
    }

    SortedSet d() {
        return new w93(this.f16077f, c());
    }

    @Override // com.google.android.gms.internal.ads.n93, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f16076e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetD = d();
        this.f16076e = sortedSetD;
        return sortedSetD;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return c().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new v93(this.f16077f, c().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return c().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new v93(this.f16077f, c().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new v93(this.f16077f, c().tailMap(obj));
    }
}
