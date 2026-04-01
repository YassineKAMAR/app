package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class z74 extends AbstractList {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a84 f18092c = a84.b(z74.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f18093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Iterator f18094b;

    public z74(List list, Iterator it) {
        this.f18093a = list;
        this.f18094b = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i8) {
        if (this.f18093a.size() > i8) {
            return this.f18093a.get(i8);
        }
        if (!this.f18094b.hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18093a.add(this.f18094b.next());
        return get(i8);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new y74(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        a84 a84Var = f18092c;
        a84Var.a("potentially expensive size() call");
        a84Var.a("blowup running");
        while (this.f18094b.hasNext()) {
            this.f18093a.add(this.f18094b.next());
        }
        return this.f18093a.size();
    }
}
