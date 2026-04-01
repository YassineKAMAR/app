package e6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements Collection<f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short[] f21421a;

    private static final class a implements Iterator<f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final short[] f21422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21423b;

        public a(short[] array) {
            kotlin.jvm.internal.q.f(array, "array");
            this.f21422a = array;
        }

        public short a() {
            int i8 = this.f21423b;
            short[] sArr = this.f21422a;
            if (i8 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f21423b));
            }
            this.f21423b = i8 + 1;
            return f0.c(sArr[i8]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21423b < this.f21422a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ f0 next() {
            return f0.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ g0(short[] sArr) {
        this.f21421a = sArr;
    }

    public static Iterator<f0> A(short[] sArr) {
        return new a(sArr);
    }

    public static final void B(short[] sArr, int i8, short s8) {
        sArr[i8] = s8;
    }

    public static String C(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public static final /* synthetic */ g0 a(short[] sArr) {
        return new g0(sArr);
    }

    public static short[] e(int i8) {
        return g(new short[i8]);
    }

    public static short[] g(short[] storage) {
        kotlin.jvm.internal.q.f(storage, "storage");
        return storage;
    }

    public static boolean n(short[] sArr, short s8) {
        return f6.j.o(sArr, s8);
    }

    public static boolean p(short[] sArr, Collection<f0> elements) {
        kotlin.jvm.internal.q.f(elements, "elements");
        if (!elements.isEmpty()) {
            for (Object obj : elements) {
                if (!((obj instanceof f0) && f6.j.o(sArr, ((f0) obj).h()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean u(short[] sArr, Object obj) {
        return (obj instanceof g0) && kotlin.jvm.internal.q.b(sArr, ((g0) obj).D());
    }

    public static final short v(short[] sArr, int i8) {
        return f0.c(sArr[i8]);
    }

    public static int x(short[] sArr) {
        return sArr.length;
    }

    public static int y(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean z(short[] sArr) {
        return sArr.length == 0;
    }

    public final /* synthetic */ short[] D() {
        return this.f21421a;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(f0 f0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends f0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof f0) {
            return i(((f0) obj).h());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.q.f(elements, "elements");
        return p(this.f21421a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return u(this.f21421a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return y(this.f21421a);
    }

    public boolean i(short s8) {
        return n(this.f21421a, s8);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return z(this.f21421a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<f0> iterator() {
        return A(this.f21421a);
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
        return C(this.f21421a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int size() {
        return x(this.f21421a);
    }
}
