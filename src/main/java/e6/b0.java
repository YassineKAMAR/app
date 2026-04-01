package e6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements Collection<a0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f21406a;

    private static final class a implements Iterator<a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f21407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21408b;

        public a(int[] array) {
            kotlin.jvm.internal.q.f(array, "array");
            this.f21407a = array;
        }

        public int a() {
            int i8 = this.f21408b;
            int[] iArr = this.f21407a;
            if (i8 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f21408b));
            }
            this.f21408b = i8 + 1;
            return a0.c(iArr[i8]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21408b < this.f21407a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ a0 next() {
            return a0.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ b0(int[] iArr) {
        this.f21406a = iArr;
    }

    public static Iterator<a0> A(int[] iArr) {
        return new a(iArr);
    }

    public static final void B(int[] iArr, int i8, int i9) {
        iArr[i8] = i9;
    }

    public static String C(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public static final /* synthetic */ b0 a(int[] iArr) {
        return new b0(iArr);
    }

    public static int[] e(int i8) {
        return g(new int[i8]);
    }

    public static int[] g(int[] storage) {
        kotlin.jvm.internal.q.f(storage, "storage");
        return storage;
    }

    public static boolean n(int[] iArr, int i8) {
        return f6.j.l(iArr, i8);
    }

    public static boolean p(int[] iArr, Collection<a0> elements) {
        kotlin.jvm.internal.q.f(elements, "elements");
        if (!elements.isEmpty()) {
            for (Object obj : elements) {
                if (!((obj instanceof a0) && f6.j.l(iArr, ((a0) obj).h()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean u(int[] iArr, Object obj) {
        return (obj instanceof b0) && kotlin.jvm.internal.q.b(iArr, ((b0) obj).D());
    }

    public static final int v(int[] iArr, int i8) {
        return a0.c(iArr[i8]);
    }

    public static int x(int[] iArr) {
        return iArr.length;
    }

    public static int y(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean z(int[] iArr) {
        return iArr.length == 0;
    }

    public final /* synthetic */ int[] D() {
        return this.f21406a;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(a0 a0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends a0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof a0) {
            return i(((a0) obj).h());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.q.f(elements, "elements");
        return p(this.f21406a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return u(this.f21406a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return y(this.f21406a);
    }

    public boolean i(int i8) {
        return n(this.f21406a, i8);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return z(this.f21406a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<a0> iterator() {
        return A(this.f21406a);
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
        return C(this.f21406a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int size() {
        return x(this.f21406a);
    }
}
