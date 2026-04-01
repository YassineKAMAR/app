package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
final class hc implements ListIterator<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ListIterator<String> f18780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f18781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ ec f18782c;

    hc(ec ecVar, int i8) {
        this.f18782c = ecVar;
        this.f18781b = i8;
        this.f18780a = ecVar.f18684a.listIterator(i8);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f18780a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18780a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f18780a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18780a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f18780a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18780a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
