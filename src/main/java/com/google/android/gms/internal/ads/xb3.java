package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
final class xb3 extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f17162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final z73 f17163b;

    xb3(List list, z73 z73Var) {
        this.f17162a = list;
        this.f17163b = z73Var;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i8) {
        return new wb3(this, this.f17162a.listIterator(i8));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        this.f17162a.subList(i8, i9).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17162a.size();
    }
}
