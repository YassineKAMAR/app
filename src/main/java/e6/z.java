package e6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements Collection<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f21458a;

    private static final class a implements Iterator<y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f21459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21460b;

        public a(byte[] array) {
            kotlin.jvm.internal.q.f(array, "array");
            this.f21459a = array;
        }

        public byte a() {
            int i8 = this.f21460b;
            byte[] bArr = this.f21459a;
            if (i8 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f21460b));
            }
            this.f21460b = i8 + 1;
            return y.c(bArr[i8]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21460b < this.f21459a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ y next() {
            return y.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ z(byte[] bArr) {
        this.f21458a = bArr;
    }

    public static Iterator<y> A(byte[] bArr) {
        return new a(bArr);
    }

    public static final void B(byte[] bArr, int i8, byte b8) {
        bArr[i8] = b8;
    }

    public static String C(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    public static final /* synthetic */ z a(byte[] bArr) {
        return new z(bArr);
    }

    public static byte[] e(int i8) {
        return g(new byte[i8]);
    }

    public static byte[] g(byte[] storage) {
        kotlin.jvm.internal.q.f(storage, "storage");
        return storage;
    }

    public static boolean n(byte[] bArr, byte b8) {
        return f6.j.k(bArr, b8);
    }

    public static boolean p(byte[] bArr, Collection<y> elements) {
        kotlin.jvm.internal.q.f(elements, "elements");
        if (!elements.isEmpty()) {
            for (Object obj : elements) {
                if (!((obj instanceof y) && f6.j.k(bArr, ((y) obj).h()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean u(byte[] bArr, Object obj) {
        return (obj instanceof z) && kotlin.jvm.internal.q.b(bArr, ((z) obj).D());
    }

    public static final byte v(byte[] bArr, int i8) {
        return y.c(bArr[i8]);
    }

    public static int x(byte[] bArr) {
        return bArr.length;
    }

    public static int y(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean z(byte[] bArr) {
        return bArr.length == 0;
    }

    public final /* synthetic */ byte[] D() {
        return this.f21458a;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(y yVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends y> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof y) {
            return i(((y) obj).h());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.q.f(elements, "elements");
        return p(this.f21458a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return u(this.f21458a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return y(this.f21458a);
    }

    public boolean i(byte b8) {
        return n(this.f21458a, b8);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return z(this.f21458a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<y> iterator() {
        return A(this.f21458a);
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
        return C(this.f21458a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int size() {
        return x(this.f21458a);
    }
}
