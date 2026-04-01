package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
final class y34 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ListIterator f17581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f17582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ a44 f17583c;

    y34(a44 a44Var, int i8) {
        this.f17583c = a44Var;
        this.f17582b = i8;
        this.f17581a = a44Var.f5025a.listIterator(i8);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f17581a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f17581a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f17581a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f17581a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f17581a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f17581a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
