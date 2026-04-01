package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
final class w3 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ListIterator f19727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f19728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ y3 f19729c;

    w3(y3 y3Var, int i8) {
        this.f19729c = y3Var;
        this.f19728b = i8;
        this.f19727a = y3Var.f19744a.listIterator(i8);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f19727a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19727a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f19727a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19727a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f19727a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19727a.previousIndex();
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
