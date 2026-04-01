package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class x93 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f17140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Collection f17141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ y93 f17142c;

    x93(y93 y93Var) {
        this.f17142c = y93Var;
        Collection collection = y93Var.f17703b;
        this.f17141b = collection;
        this.f17140a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    x93(y93 y93Var, Iterator it) {
        this.f17142c = y93Var;
        this.f17141b = y93Var.f17703b;
        this.f17140a = it;
    }

    final void a() {
        this.f17142c.k();
        if (this.f17142c.f17703b != this.f17141b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f17140a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f17140a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f17140a.remove();
        ba3 ba3Var = this.f17142c.f17706e;
        ba3Var.f5680e--;
        this.f17142c.e();
    }
}
