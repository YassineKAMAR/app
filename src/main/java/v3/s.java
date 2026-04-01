package v3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class s<E> extends t<E> implements NavigableSet<E>, n0<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Comparator<? super E> f26931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient s<E> f26932d;

    s(Comparator<? super E> comparator) {
        this.f26931c = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> s<E> E(Comparator<? super E> comparator, int i8, E... eArr) {
        if (i8 == 0) {
            return M(comparator);
        }
        e0.c(eArr, i8);
        Arrays.sort(eArr, 0, i8, comparator);
        int i9 = 1;
        for (int i10 = 1; i10 < i8; i10++) {
            a.a aVar = (Object) eArr[i10];
            if (comparator.compare(aVar, (Object) eArr[i9 - 1]) != 0) {
                eArr[i9] = aVar;
                i9++;
            }
        }
        Arrays.fill(eArr, i9, i8, (Object) null);
        if (i9 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i9);
        }
        return new k0(n.v(eArr, i9), comparator);
    }

    public static <E> s<E> H(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        u3.h.i(comparator);
        if (o0.b(comparator, iterable) && (iterable instanceof s)) {
            s<E> sVar = (s) iterable;
            if (!sVar.n()) {
                return sVar;
            }
        }
        Object[] objArrC = u.c(iterable);
        return E(comparator, objArrC.length, objArrC);
    }

    public static <E> s<E> I(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return H(comparator, collection);
    }

    static <E> k0<E> M(Comparator<? super E> comparator) {
        return f0.c().equals(comparator) ? (k0<E>) k0.f26902f : new k0<>(n.y(), comparator);
    }

    static int Y(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    abstract s<E> J();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: K */
    public abstract q0<E> descendingIterator();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public s<E> descendingSet() {
        s<E> sVar = this.f26932d;
        if (sVar != null) {
            return sVar;
        }
        s<E> sVarJ = J();
        this.f26932d = sVarJ;
        sVarJ.f26932d = this;
        return sVarJ;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public s<E> headSet(E e8) {
        return headSet(e8, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public s<E> headSet(E e8, boolean z7) {
        return P(u3.h.i(e8), z7);
    }

    abstract s<E> P(E e8, boolean z7);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public s<E> subSet(E e8, E e9) {
        return subSet(e8, true, e9, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public s<E> subSet(E e8, boolean z7, E e9, boolean z8) {
        u3.h.i(e8);
        u3.h.i(e9);
        u3.h.d(this.f26931c.compare(e8, e9) <= 0);
        return T(e8, z7, e9, z8);
    }

    abstract s<E> T(E e8, boolean z7, E e9, boolean z8);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public s<E> tailSet(E e8) {
        return tailSet(e8, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public s<E> tailSet(E e8, boolean z7) {
        return W(u3.h.i(e8), z7);
    }

    abstract s<E> W(E e8, boolean z7);

    int X(Object obj, Object obj2) {
        return Y(this.f26931c, obj, obj2);
    }

    public E ceiling(E e8) {
        return (E) u.b(tailSet(e8, true), null);
    }

    @Override // java.util.SortedSet, v3.n0
    public Comparator<? super E> comparator() {
        return this.f26931c;
    }

    public E first() {
        return iterator().next();
    }

    public E floor(E e8) {
        return (E) v.c(headSet(e8, true).descendingIterator(), null);
    }

    public E higher(E e8) {
        return (E) u.b(tailSet(e8, false), null);
    }

    public E last() {
        return descendingIterator().next();
    }

    public E lower(E e8) {
        return (E) v.c(headSet(e8, false).descendingIterator(), null);
    }

    @Override // v3.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: p */
    public abstract q0<E> iterator();

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }
}
