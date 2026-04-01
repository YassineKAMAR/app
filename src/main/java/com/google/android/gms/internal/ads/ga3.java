package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class ga3 extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Collection f8277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final m83 f8278b;

    ga3(Collection collection, m83 m83Var) {
        this.f8277a = collection;
        this.f8278b = m83Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        l83.e(this.f8278b.a(obj));
        return this.f8277a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            l83.e(this.f8278b.a(it.next()));
        }
        return this.f8277a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        pb3.a(this.f8277a, this.f8278b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (ha3.a(this.f8277a, obj)) {
            return this.f8278b.a(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        m83 m83Var = this.f8278b;
        Iterator it = this.f8277a.iterator();
        l83.c(m83Var, "predicate");
        int i8 = 0;
        while (it.hasNext()) {
            if (m83Var.a(it.next())) {
                return i8 == -1;
            }
            i8++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f8277a.iterator();
        it.getClass();
        m83 m83Var = this.f8278b;
        m83Var.getClass();
        return new qb3(it, m83Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f8277a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f8277a.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f8278b.a(next) && collection.contains(next)) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f8277a.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f8278b.a(next) && !collection.contains(next)) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f8277a.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (this.f8278b.a(it.next())) {
                i8++;
            }
        }
        return i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        ub3.c(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        ub3.c(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
