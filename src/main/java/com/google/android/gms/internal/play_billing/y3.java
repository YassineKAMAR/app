package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class y3 extends AbstractList implements RandomAccess, y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1 f19744a;

    public y3(y1 y1Var) {
        this.f19744a = y1Var;
    }

    @Override // com.google.android.gms.internal.play_billing.y1
    public final Object c(int i8) {
        return this.f19744a.c(i8);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        return ((x1) this.f19744a).get(i8);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new x3(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i8) {
        return new w3(this, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.y1
    public final y1 m() {
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.y1
    public final List o() {
        return this.f19744a.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19744a.size();
    }
}
