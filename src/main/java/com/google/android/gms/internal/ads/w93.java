package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
class w93 extends r93 implements SortedSet {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ba3 f16665c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w93(ba3 ba3Var, SortedMap sortedMap) {
        super(ba3Var, sortedMap);
        this.f16665c = ba3Var;
    }

    SortedMap a() {
        return (SortedMap) this.f5718a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new w93(this.f16665c, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new w93(this.f16665c, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new w93(this.f16665c, a().tailMap(obj));
    }
}
