package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class xc3 extends ob3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient mb3 f17170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient jb3 f17171d;

    xc3(mb3 mb3Var, jb3 jb3Var) {
        this.f17170c = mb3Var;
        this.f17171d = jb3Var;
    }

    @Override // com.google.android.gms.internal.ads.eb3
    final int a(Object[] objArr, int i8) {
        return this.f17171d.a(objArr, i8);
    }

    @Override // com.google.android.gms.internal.ads.eb3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f17170c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.ob3, com.google.android.gms.internal.ads.eb3
    public final jb3 i() {
        return this.f17171d;
    }

    @Override // com.google.android.gms.internal.ads.ob3, com.google.android.gms.internal.ads.eb3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f17171d.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.ob3, com.google.android.gms.internal.ads.eb3
    /* JADX INFO: renamed from: n */
    public final kd3 iterator() {
        return this.f17171d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f17170c.size();
    }
}
