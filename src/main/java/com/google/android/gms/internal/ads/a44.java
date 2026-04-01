package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class a44 extends AbstractList implements RandomAccess, r14 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r14 f5025a;

    public a44(r14 r14Var) {
        this.f5025a = r14Var;
    }

    @Override // com.google.android.gms.internal.ads.r14
    public final Object c(int i8) {
        return this.f5025a.c(i8);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        return ((q14) this.f5025a).get(i8);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new z34(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i8) {
        return new y34(this, i8);
    }

    @Override // com.google.android.gms.internal.ads.r14
    public final r14 m() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.r14
    public final List o() {
        return this.f5025a.o();
    }

    @Override // com.google.android.gms.internal.ads.r14
    public final void s(rz3 rz3Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5025a.size();
    }
}
