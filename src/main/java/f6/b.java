package f6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<E> extends f6.a<E> implements List<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21788a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }

        public final void a(int i8, int i9) {
            if (i8 < 0 || i8 >= i9) {
                throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
            }
        }

        public final void b(int i8, int i9) {
            if (i8 < 0 || i8 > i9) {
                throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
            }
        }

        public final void c(int i8, int i9, int i10) {
            if (i8 < 0 || i9 > i10) {
                throw new IndexOutOfBoundsException("fromIndex: " + i8 + ", toIndex: " + i9 + ", size: " + i10);
            }
            if (i8 <= i9) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i8 + " > toIndex: " + i9);
        }

        public final boolean d(Collection<?> c8, Collection<?> other) {
            kotlin.jvm.internal.q.f(c8, "c");
            kotlin.jvm.internal.q.f(other, "other");
            if (c8.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c8.iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.q.b(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int e(Collection<?> c8) {
            kotlin.jvm.internal.q.f(c8, "c");
            Iterator<?> it = c8.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }
    }

    /* JADX INFO: renamed from: f6.b$b, reason: collision with other inner class name */
    private class C0107b implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f21789a;

        public C0107b() {
        }

        protected final int a() {
            return this.f21789a;
        }

        protected final void b(int i8) {
            this.f21789a = i8;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21789a < b.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            b<E> bVar = b.this;
            int i8 = this.f21789a;
            this.f21789a = i8 + 1;
            return bVar.get(i8);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private class c extends b<E>.C0107b implements ListIterator<E> {
        public c(int i8) {
            super();
            b.f21788a.b(i8, b.this.size());
            b(i8);
        }

        @Override // java.util.ListIterator
        public void add(E e8) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            b<E> bVar = b.this;
            b(a() - 1);
            return bVar.get(a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e8) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private static final class d<E> extends b<E> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b<E> f21792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f21793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f21794d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(b<? extends E> list, int i8, int i9) {
            kotlin.jvm.internal.q.f(list, "list");
            this.f21792b = list;
            this.f21793c = i8;
            b.f21788a.c(i8, i9, list.size());
            this.f21794d = i9 - i8;
        }

        @Override // f6.a
        public int a() {
            return this.f21794d;
        }

        @Override // f6.b, java.util.List
        public E get(int i8) {
            b.f21788a.a(i8, this.f21794d);
            return this.f21792b.get(this.f21793c + i8);
        }
    }

    protected b() {
    }

    @Override // java.util.List
    public void add(int i8, E e8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i8, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f21788a.d(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i8);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f21788a.e(this);
    }

    @Override // java.util.List
    public int indexOf(E e8) {
        Iterator<E> it = iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.q.b(it.next(), e8)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new C0107b();
    }

    @Override // java.util.List
    public int lastIndexOf(E e8) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.q.b(listIterator.previous(), e8)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i8) {
        return new c(i8);
    }

    @Override // java.util.List
    public E remove(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i8, E e8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i8, int i9) {
        return new d(this, i8, i9);
    }
}
