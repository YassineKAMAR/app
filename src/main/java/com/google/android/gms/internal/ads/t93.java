package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
final class t93 extends w93 implements NavigableSet {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ba3 f15018d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t93(ba3 ba3Var, NavigableMap navigableMap) {
        super(ba3Var, navigableMap);
        this.f15018d = ba3Var;
    }

    @Override // com.google.android.gms.internal.ads.w93
    final /* synthetic */ SortedMap a() {
        return (NavigableMap) ((SortedMap) this.f5718a);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f5718a)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new t93(this.f15018d, ((NavigableMap) ((SortedMap) this.f5718a)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f5718a)).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z7) {
        return new t93(this.f15018d, ((NavigableMap) ((SortedMap) this.f5718a)).headMap(obj, z7));
    }

    @Override // com.google.android.gms.internal.ads.w93, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f5718a)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f5718a)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return ub3.a(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return ub3.a(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z7, Object obj2, boolean z8) {
        return new t93(this.f15018d, ((NavigableMap) ((SortedMap) this.f5718a)).subMap(obj, z7, obj2, z8));
    }

    @Override // com.google.android.gms.internal.ads.w93, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z7) {
        return new t93(this.f15018d, ((NavigableMap) ((SortedMap) this.f5718a)).tailMap(obj, z7));
    }

    @Override // com.google.android.gms.internal.ads.w93, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
