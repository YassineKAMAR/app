package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class y93 extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f17702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Collection f17703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final y93 f17704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Collection f17705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ba3 f17706e;

    y93(ba3 ba3Var, Object obj, Collection collection, y93 y93Var) {
        this.f17706e = ba3Var;
        this.f17702a = obj;
        this.f17703b = collection;
        this.f17704c = y93Var;
        this.f17705d = y93Var == null ? null : y93Var.f17703b;
    }

    final void a() {
        y93 y93Var = this.f17704c;
        if (y93Var != null) {
            y93Var.a();
            return;
        }
        ba3 ba3Var = this.f17706e;
        ba3Var.f5679d.put(this.f17702a, this.f17703b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        k();
        boolean zIsEmpty = this.f17703b.isEmpty();
        boolean zAdd = this.f17703b.add(obj);
        if (zAdd) {
            this.f17706e.f5680e++;
            if (zIsEmpty) {
                a();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f17703b.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f17703b.size();
        this.f17706e.f5680e += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        a();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f17703b.clear();
        this.f17706e.f5680e -= size;
        e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        k();
        return this.f17703b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        k();
        return this.f17703b.containsAll(collection);
    }

    final void e() {
        y93 y93Var = this.f17704c;
        if (y93Var != null) {
            y93Var.e();
        } else if (this.f17703b.isEmpty()) {
            ba3 ba3Var = this.f17706e;
            ba3Var.f5679d.remove(this.f17702a);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        k();
        return this.f17703b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        k();
        return this.f17703b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        k();
        return new x93(this);
    }

    final void k() {
        y93 y93Var = this.f17704c;
        if (y93Var != null) {
            y93Var.k();
            y93 y93Var2 = this.f17704c;
            if (y93Var2.f17703b != this.f17705d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f17703b.isEmpty()) {
            ba3 ba3Var = this.f17706e;
            Collection collection = (Collection) ba3Var.f5679d.get(this.f17702a);
            if (collection != null) {
                this.f17703b = collection;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        k();
        boolean zRemove = this.f17703b.remove(obj);
        if (zRemove) {
            ba3 ba3Var = this.f17706e;
            ba3Var.f5680e--;
            e();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f17703b.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f17703b.size();
            this.f17706e.f5680e += size2 - size;
            e();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f17703b.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f17703b.size();
            this.f17706e.f5680e += size2 - size;
            e();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        k();
        return this.f17703b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        k();
        return this.f17703b.toString();
    }
}
