package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class ec extends AbstractList<String> implements r9, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r9 f18684a;

    public ec(r9 r9Var) {
        this.f18684a = r9Var;
    }

    @Override // com.google.android.gms.internal.measurement.r9
    public final Object d(int i8) {
        return this.f18684a.d(i8);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        return (String) this.f18684a.get(i8);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new gc(this);
    }

    @Override // com.google.android.gms.internal.measurement.r9
    public final List<?> k() {
        return this.f18684a.k();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i8) {
        return new hc(this, i8);
    }

    @Override // com.google.android.gms.internal.measurement.r9
    public final r9 q() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.r9
    public final void r(o7 o7Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18684a.size();
    }
}
