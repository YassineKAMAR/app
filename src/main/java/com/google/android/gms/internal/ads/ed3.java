package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
final class ed3 extends dd3 implements SortedSet {
    ed3(SortedSet sortedSet, m83 m83Var) {
        super(sortedSet, m83Var);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f8277a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f8277a.iterator();
        it.getClass();
        m83 m83Var = this.f8278b;
        m83Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (m83Var.a(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new ed3(((SortedSet) this.f8277a).headSet(obj), this.f8278b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f8277a;
        while (true) {
            m83 m83Var = this.f8278b;
            Object objLast = sortedSetHeadSet.last();
            if (m83Var.a(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new ed3(((SortedSet) this.f8277a).subSet(obj, obj2), this.f8278b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new ed3(((SortedSet) this.f8277a).tailSet(obj), this.f8278b);
    }
}
