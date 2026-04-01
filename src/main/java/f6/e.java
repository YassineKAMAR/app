package f6;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class e<E> extends c<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f21802d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object[] f21803e = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f21805b = f21803e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21806c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }

        public final int a(int i8, int i9) {
            int i10 = i8 + (i8 >> 1);
            if (i10 - i9 < 0) {
                i10 = i9;
            }
            return i10 - 2147483639 > 0 ? i9 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i10;
        }
    }

    private final void g(int i8, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f21805b.length;
        while (i8 < length && it.hasNext()) {
            this.f21805b[i8] = it.next();
            i8++;
        }
        int i9 = this.f21804a;
        for (int i10 = 0; i10 < i9 && it.hasNext(); i10++) {
            this.f21805b[i10] = it.next();
        }
        this.f21806c = size() + collection.size();
    }

    private final void i(int i8) {
        Object[] objArr = new Object[i8];
        Object[] objArr2 = this.f21805b;
        i.d(objArr2, objArr, 0, this.f21804a, objArr2.length);
        Object[] objArr3 = this.f21805b;
        int length = objArr3.length;
        int i9 = this.f21804a;
        i.d(objArr3, objArr, length - i9, 0, i9);
        this.f21804a = 0;
        this.f21805b = objArr;
    }

    private final int n(int i8) {
        return i8 == 0 ? j.s(this.f21805b) : i8 - 1;
    }

    private final void p(int i8) {
        if (i8 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f21805b;
        if (i8 <= objArr.length) {
            return;
        }
        if (objArr == f21803e) {
            this.f21805b = new Object[t6.l.b(i8, 10)];
        } else {
            i(f21802d.a(objArr.length, i8));
        }
    }

    private final int u(int i8) {
        if (i8 == j.s(this.f21805b)) {
            return 0;
        }
        return i8 + 1;
    }

    private final int v(int i8) {
        return i8 < 0 ? i8 + this.f21805b.length : i8;
    }

    private final int w(int i8) {
        Object[] objArr = this.f21805b;
        return i8 >= objArr.length ? i8 - objArr.length : i8;
    }

    @Override // f6.c
    public int a() {
        return this.f21806c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i8, E e8) {
        b.f21788a.b(i8, size());
        if (i8 == size()) {
            addLast(e8);
            return;
        }
        if (i8 == 0) {
            addFirst(e8);
            return;
        }
        p(size() + 1);
        int iW = w(this.f21804a + i8);
        if (i8 < ((size() + 1) >> 1)) {
            int iN = n(iW);
            int iN2 = n(this.f21804a);
            int i9 = this.f21804a;
            if (iN >= i9) {
                Object[] objArr = this.f21805b;
                objArr[iN2] = objArr[i9];
                i.d(objArr, objArr, i9, i9 + 1, iN + 1);
            } else {
                Object[] objArr2 = this.f21805b;
                i.d(objArr2, objArr2, i9 - 1, i9, objArr2.length);
                Object[] objArr3 = this.f21805b;
                objArr3[objArr3.length - 1] = objArr3[0];
                i.d(objArr3, objArr3, 0, 1, iN + 1);
            }
            this.f21805b[iN] = e8;
            this.f21804a = iN2;
        } else {
            int iW2 = w(this.f21804a + size());
            Object[] objArr4 = this.f21805b;
            if (iW < iW2) {
                i.d(objArr4, objArr4, iW + 1, iW, iW2);
            } else {
                i.d(objArr4, objArr4, 1, 0, iW2);
                Object[] objArr5 = this.f21805b;
                objArr5[0] = objArr5[objArr5.length - 1];
                i.d(objArr5, objArr5, iW + 1, iW, objArr5.length - 1);
            }
            this.f21805b[iW] = e8;
        }
        this.f21806c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e8) {
        addLast(e8);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection<? extends E> elements) {
        kotlin.jvm.internal.q.f(elements, "elements");
        b.f21788a.b(i8, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i8 == size()) {
            return addAll(elements);
        }
        p(size() + elements.size());
        int iW = w(this.f21804a + size());
        int iW2 = w(this.f21804a + i8);
        int size = elements.size();
        if (i8 < ((size() + 1) >> 1)) {
            int i9 = this.f21804a;
            int length = i9 - size;
            if (iW2 < i9) {
                Object[] objArr = this.f21805b;
                i.d(objArr, objArr, length, i9, objArr.length);
                Object[] objArr2 = this.f21805b;
                if (size >= iW2) {
                    i.d(objArr2, objArr2, objArr2.length - size, 0, iW2);
                } else {
                    i.d(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.f21805b;
                    i.d(objArr3, objArr3, 0, size, iW2);
                }
            } else if (length >= 0) {
                Object[] objArr4 = this.f21805b;
                i.d(objArr4, objArr4, length, i9, iW2);
            } else {
                Object[] objArr5 = this.f21805b;
                length += objArr5.length;
                int i10 = iW2 - i9;
                int length2 = objArr5.length - length;
                if (length2 >= i10) {
                    i.d(objArr5, objArr5, length, i9, iW2);
                } else {
                    i.d(objArr5, objArr5, length, i9, i9 + length2);
                    Object[] objArr6 = this.f21805b;
                    i.d(objArr6, objArr6, 0, this.f21804a + length2, iW2);
                }
            }
            this.f21804a = length;
            g(v(iW2 - size), elements);
        } else {
            int length3 = iW2 + size;
            if (iW2 < iW) {
                int i11 = size + iW;
                Object[] objArr7 = this.f21805b;
                if (i11 <= objArr7.length) {
                    i.d(objArr7, objArr7, length3, iW2, iW);
                } else if (length3 >= objArr7.length) {
                    length3 -= objArr7.length;
                    i.d(objArr7, objArr7, length3, iW2, iW);
                } else {
                    int length4 = iW - (i11 - objArr7.length);
                    i.d(objArr7, objArr7, 0, length4, iW);
                    Object[] objArr8 = this.f21805b;
                    i.d(objArr8, objArr8, length3, iW2, length4);
                }
            } else {
                Object[] objArr9 = this.f21805b;
                i.d(objArr9, objArr9, size, 0, iW);
                Object[] objArr10 = this.f21805b;
                if (length3 >= objArr10.length) {
                    i.d(objArr10, objArr10, length3 - objArr10.length, iW2, objArr10.length);
                } else {
                    i.d(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f21805b;
                    i.d(objArr11, objArr11, length3, iW2, objArr11.length - size);
                }
            }
            g(iW2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.q.f(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        p(size() + elements.size());
        g(w(this.f21804a + size()), elements);
        return true;
    }

    public final void addFirst(E e8) {
        p(size() + 1);
        int iN = n(this.f21804a);
        this.f21804a = iN;
        this.f21805b[iN] = e8;
        this.f21806c = size() + 1;
    }

    public final void addLast(E e8) {
        p(size() + 1);
        this.f21805b[w(this.f21804a + size())] = e8;
        this.f21806c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int iW = w(this.f21804a + size());
        int i8 = this.f21804a;
        if (i8 < iW) {
            i.h(this.f21805b, null, i8, iW);
        } else if (!isEmpty()) {
            Object[] objArr = this.f21805b;
            i.h(objArr, null, this.f21804a, objArr.length);
            i.h(this.f21805b, null, 0, iW);
        }
        this.f21804a = 0;
        this.f21806c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // f6.c
    public E e(int i8) {
        b.f21788a.a(i8, size());
        if (i8 == o.f(this)) {
            return removeLast();
        }
        if (i8 == 0) {
            return removeFirst();
        }
        int iW = w(this.f21804a + i8);
        E e8 = (E) this.f21805b[iW];
        if (i8 < (size() >> 1)) {
            int i9 = this.f21804a;
            if (iW >= i9) {
                Object[] objArr = this.f21805b;
                i.d(objArr, objArr, i9 + 1, i9, iW);
            } else {
                Object[] objArr2 = this.f21805b;
                i.d(objArr2, objArr2, 1, 0, iW);
                Object[] objArr3 = this.f21805b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i10 = this.f21804a;
                i.d(objArr3, objArr3, i10 + 1, i10, objArr3.length - 1);
            }
            Object[] objArr4 = this.f21805b;
            int i11 = this.f21804a;
            objArr4[i11] = null;
            this.f21804a = u(i11);
        } else {
            int iW2 = w(this.f21804a + o.f(this));
            Object[] objArr5 = this.f21805b;
            if (iW <= iW2) {
                i.d(objArr5, objArr5, iW, iW + 1, iW2 + 1);
            } else {
                i.d(objArr5, objArr5, iW, iW + 1, objArr5.length);
                Object[] objArr6 = this.f21805b;
                objArr6[objArr6.length - 1] = objArr6[0];
                i.d(objArr6, objArr6, 0, 1, iW2 + 1);
            }
            this.f21805b[iW2] = null;
        }
        this.f21806c = size() - 1;
        return e8;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i8) {
        b.f21788a.a(i8, size());
        return (E) this.f21805b[w(this.f21804a + i8)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int iW = w(this.f21804a + size());
        int length = this.f21804a;
        if (length < iW) {
            while (length < iW) {
                if (!kotlin.jvm.internal.q.b(obj, this.f21805b[length])) {
                    length++;
                }
            }
            return -1;
        }
        if (length < iW) {
            return -1;
        }
        int length2 = this.f21805b.length;
        while (true) {
            if (length >= length2) {
                for (int i8 = 0; i8 < iW; i8++) {
                    if (kotlin.jvm.internal.q.b(obj, this.f21805b[i8])) {
                        length = i8 + this.f21805b.length;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.q.b(obj, this.f21805b[length])) {
                break;
            }
            length++;
        }
        return length - this.f21804a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iS;
        int iW = w(this.f21804a + size());
        int i8 = this.f21804a;
        if (i8 < iW) {
            iS = iW - 1;
            if (i8 <= iS) {
                while (!kotlin.jvm.internal.q.b(obj, this.f21805b[iS])) {
                    if (iS != i8) {
                        iS--;
                    }
                }
                return iS - this.f21804a;
            }
            return -1;
        }
        if (i8 > iW) {
            int i9 = iW - 1;
            while (true) {
                if (-1 >= i9) {
                    iS = j.s(this.f21805b);
                    int i10 = this.f21804a;
                    if (i10 <= iS) {
                        while (!kotlin.jvm.internal.q.b(obj, this.f21805b[iS])) {
                            if (iS != i10) {
                                iS--;
                            }
                        }
                    }
                } else {
                    if (kotlin.jvm.internal.q.b(obj, this.f21805b[i9])) {
                        iS = i9 + this.f21805b.length;
                        break;
                    }
                    i9--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        int iW;
        kotlin.jvm.internal.q.f(elements, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty()) {
            if (!(this.f21805b.length == 0)) {
                int iW2 = w(this.f21804a + size());
                int i8 = this.f21804a;
                if (i8 < iW2) {
                    iW = i8;
                    while (i8 < iW2) {
                        Object obj = this.f21805b[i8];
                        if (!elements.contains(obj)) {
                            this.f21805b[iW] = obj;
                            iW++;
                        } else {
                            z7 = true;
                        }
                        i8++;
                    }
                    i.h(this.f21805b, null, iW, iW2);
                } else {
                    int length = this.f21805b.length;
                    int i9 = i8;
                    boolean z8 = false;
                    while (i8 < length) {
                        Object[] objArr = this.f21805b;
                        Object obj2 = objArr[i8];
                        objArr[i8] = null;
                        if (!elements.contains(obj2)) {
                            this.f21805b[i9] = obj2;
                            i9++;
                        } else {
                            z8 = true;
                        }
                        i8++;
                    }
                    iW = w(i9);
                    for (int i10 = 0; i10 < iW2; i10++) {
                        Object[] objArr2 = this.f21805b;
                        Object obj3 = objArr2[i10];
                        objArr2[i10] = null;
                        if (!elements.contains(obj3)) {
                            this.f21805b[iW] = obj3;
                            iW = u(iW);
                        } else {
                            z8 = true;
                        }
                    }
                    z7 = z8;
                }
                if (z7) {
                    this.f21806c = v(iW - this.f21804a);
                }
            }
        }
        return z7;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f21805b;
        int i8 = this.f21804a;
        E e8 = (E) objArr[i8];
        objArr[i8] = null;
        this.f21804a = u(i8);
        this.f21806c = size() - 1;
        return e8;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iW = w(this.f21804a + o.f(this));
        Object[] objArr = this.f21805b;
        E e8 = (E) objArr[iW];
        objArr[iW] = null;
        this.f21806c = size() - 1;
        return e8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        int iW;
        kotlin.jvm.internal.q.f(elements, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty()) {
            if (!(this.f21805b.length == 0)) {
                int iW2 = w(this.f21804a + size());
                int i8 = this.f21804a;
                if (i8 < iW2) {
                    iW = i8;
                    while (i8 < iW2) {
                        Object obj = this.f21805b[i8];
                        if (elements.contains(obj)) {
                            this.f21805b[iW] = obj;
                            iW++;
                        } else {
                            z7 = true;
                        }
                        i8++;
                    }
                    i.h(this.f21805b, null, iW, iW2);
                } else {
                    int length = this.f21805b.length;
                    int i9 = i8;
                    boolean z8 = false;
                    while (i8 < length) {
                        Object[] objArr = this.f21805b;
                        Object obj2 = objArr[i8];
                        objArr[i8] = null;
                        if (elements.contains(obj2)) {
                            this.f21805b[i9] = obj2;
                            i9++;
                        } else {
                            z8 = true;
                        }
                        i8++;
                    }
                    iW = w(i9);
                    for (int i10 = 0; i10 < iW2; i10++) {
                        Object[] objArr2 = this.f21805b;
                        Object obj3 = objArr2[i10];
                        objArr2[i10] = null;
                        if (elements.contains(obj3)) {
                            this.f21805b[iW] = obj3;
                            iW = u(iW);
                        } else {
                            z8 = true;
                        }
                    }
                    z7 = z8;
                }
                if (z7) {
                    this.f21806c = v(iW - this.f21804a);
                }
            }
        }
        return z7;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i8, E e8) {
        b.f21788a.a(i8, size());
        int iW = w(this.f21804a + i8);
        Object[] objArr = this.f21805b;
        E e9 = (E) objArr[iW];
        objArr[iW] = e8;
        return e9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.q.f(array, "array");
        if (array.length < size()) {
            array = (T[]) g.a(array, size());
        }
        int iW = w(this.f21804a + size());
        int i8 = this.f21804a;
        if (i8 < iW) {
            i.e(this.f21805b, array, 0, i8, iW, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f21805b;
            i.d(objArr, array, 0, this.f21804a, objArr.length);
            Object[] objArr2 = this.f21805b;
            i.d(objArr2, array, objArr2.length - this.f21804a, 0, iW);
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }

    public final E x() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E y() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }
}
