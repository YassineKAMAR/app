package e6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements Collection<c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f21415a;

    private static final class a implements Iterator<c0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long[] f21416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21417b;

        public a(long[] array) {
            kotlin.jvm.internal.q.f(array, "array");
            this.f21416a = array;
        }

        public long a() {
            int i8 = this.f21417b;
            long[] jArr = this.f21416a;
            if (i8 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f21417b));
            }
            this.f21417b = i8 + 1;
            return c0.c(jArr[i8]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21417b < this.f21416a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ c0 next() {
            return c0.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ d0(long[] jArr) {
        this.f21415a = jArr;
    }

    public static Iterator<c0> A(long[] jArr) {
        return new a(jArr);
    }

    public static final void B(long[] jArr, int i8, long j8) {
        jArr[i8] = j8;
    }

    public static String C(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    public static final /* synthetic */ d0 a(long[] jArr) {
        return new d0(jArr);
    }

    public static long[] e(int i8) {
        return g(new long[i8]);
    }

    public static long[] g(long[] storage) {
        kotlin.jvm.internal.q.f(storage, "storage");
        return storage;
    }

    public static boolean n(long[] jArr, long j8) {
        return f6.j.m(jArr, j8);
    }

    public static boolean p(long[] jArr, Collection<c0> elements) {
        kotlin.jvm.internal.q.f(elements, "elements");
        if (!elements.isEmpty()) {
            for (Object obj : elements) {
                if (!((obj instanceof c0) && f6.j.m(jArr, ((c0) obj).h()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean u(long[] jArr, Object obj) {
        return (obj instanceof d0) && kotlin.jvm.internal.q.b(jArr, ((d0) obj).D());
    }

    public static final long v(long[] jArr, int i8) {
        return c0.c(jArr[i8]);
    }

    public static int x(long[] jArr) {
        return jArr.length;
    }

    public static int y(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean z(long[] jArr) {
        return jArr.length == 0;
    }

    public final /* synthetic */ long[] D() {
        return this.f21415a;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(c0 c0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends c0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof c0) {
            return i(((c0) obj).h());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.q.f(elements, "elements");
        return p(this.f21415a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return u(this.f21415a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return y(this.f21415a);
    }

    public boolean i(long j8) {
        return n(this.f21415a, j8);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return z(this.f21415a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<c0> iterator() {
        return A(this.f21415a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.i.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.q.f(array, "array");
        return (T[]) kotlin.jvm.internal.i.b(this, array);
    }

    public String toString() {
        return C(this.f21415a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int size() {
        return x(this.f21415a);
    }
}
