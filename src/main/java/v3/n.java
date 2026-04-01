package v3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class n<E> extends m<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r0<Object> f26906b = new a(h0.f26876e, 0);

    static class a<E> extends v3.a<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final n<E> f26907c;

        a(n<E> nVar, int i8) {
            super(nVar.size(), i8);
            this.f26907c = nVar;
        }

        @Override // v3.a
        protected E a(int i8) {
            return this.f26907c.get(i8);
        }
    }

    private static class b<E> extends n<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient n<E> f26908c;

        b(n<E> nVar) {
            this.f26908c = nVar;
        }

        private int D(int i8) {
            return (size() - 1) - i8;
        }

        private int E(int i8) {
            return size() - i8;
        }

        @Override // v3.n, java.util.List
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public n<E> subList(int i8, int i9) {
            u3.h.m(i8, i9, size());
            return this.f26908c.subList(E(i9), E(i8)).z();
        }

        @Override // v3.n, v3.m, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f26908c.contains(obj);
        }

        @Override // java.util.List
        public E get(int i8) {
            u3.h.g(i8, size());
            return this.f26908c.get(D(i8));
        }

        @Override // v3.n, java.util.List
        public int indexOf(Object obj) {
            int iLastIndexOf = this.f26908c.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return D(iLastIndexOf);
            }
            return -1;
        }

        @Override // v3.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // v3.n, java.util.List
        public int lastIndexOf(Object obj) {
            int iIndexOf = this.f26908c.indexOf(obj);
            if (iIndexOf >= 0) {
                return D(iIndexOf);
            }
            return -1;
        }

        @Override // v3.n, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // v3.n, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i8) {
            return super.listIterator(i8);
        }

        @Override // v3.m
        boolean n() {
            return this.f26908c.n();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f26908c.size();
        }

        @Override // v3.n
        public n<E> z() {
            return this.f26908c;
        }
    }

    class c extends n<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final transient int f26909c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final transient int f26910d;

        c(int i8, int i9) {
            this.f26909c = i8;
            this.f26910d = i9;
        }

        @Override // v3.n, java.util.List
        /* JADX INFO: renamed from: B */
        public n<E> subList(int i8, int i9) {
            u3.h.m(i8, i9, this.f26910d);
            n nVar = n.this;
            int i10 = this.f26909c;
            return nVar.subList(i8 + i10, i9 + i10);
        }

        @Override // v3.m
        Object[] e() {
            return n.this.e();
        }

        @Override // v3.m
        int g() {
            return n.this.i() + this.f26909c + this.f26910d;
        }

        @Override // java.util.List
        public E get(int i8) {
            u3.h.g(i8, this.f26910d);
            return n.this.get(i8 + this.f26909c);
        }

        @Override // v3.m
        int i() {
            return n.this.i() + this.f26909c;
        }

        @Override // v3.n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // v3.n, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // v3.n, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i8) {
            return super.listIterator(i8);
        }

        @Override // v3.m
        boolean n() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f26910d;
        }
    }

    n() {
    }

    public static <E> n<E> A(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        u3.h.i(comparator);
        Object[] objArrC = u.c(iterable);
        e0.b(objArrC);
        Arrays.sort(objArrC, comparator);
        return u(objArrC);
    }

    static <E> n<E> u(Object[] objArr) {
        return v(objArr, objArr.length);
    }

    static <E> n<E> v(Object[] objArr, int i8) {
        return i8 == 0 ? y() : new h0(objArr, i8);
    }

    public static <E> n<E> y() {
        return (n<E>) h0.f26876e;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: B */
    public n<E> subList(int i8, int i9) {
        u3.h.m(i8, i9, size());
        int i10 = i9 - i8;
        return i10 == size() ? this : i10 == 0 ? y() : C(i8, i9);
    }

    n<E> C(int i8, int i9) {
        return new c(i8, i9 - i8);
    }

    @Override // v3.m
    int a(Object[] objArr, int i8) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i8 + i9] = get(i9);
        }
        return i8 + size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i8, E e8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i8, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // v3.m, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return w.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i8 = 1;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = ~(~((i8 * 31) + get(i9).hashCode()));
        }
        return i8;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return w.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return w.d(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: p */
    public q0<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i8, E e8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public r0<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public r0<E> listIterator(int i8) {
        u3.h.k(i8, size());
        return isEmpty() ? (r0<E>) f26906b : new a(this, i8);
    }

    public n<E> z() {
        return size() <= 1 ? this : new b(this);
    }
}
