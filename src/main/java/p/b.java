package p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f25406e = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object[] f25407f = new Object[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Object[] f25408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f25409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Object[] f25410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f25411j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f25412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object[] f25413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g<E, E> f25415d;

    class a extends g<E, E> {
        a() {
        }

        @Override // p.g
        protected void a() {
            b.this.clear();
        }

        @Override // p.g
        protected Object b(int i8, int i9) {
            return b.this.f25413b[i8];
        }

        @Override // p.g
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p.g
        protected int d() {
            return b.this.f25414c;
        }

        @Override // p.g
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // p.g
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // p.g
        protected void g(E e8, E e9) {
            b.this.add(e8);
        }

        @Override // p.g
        protected void h(int i8) {
            b.this.u(i8);
        }

        @Override // p.g
        protected E i(int i8, E e8) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int i8) {
        if (i8 == 0) {
            this.f25412a = f25406e;
            this.f25413b = f25407f;
        } else {
            a(i8);
        }
        this.f25414c = 0;
    }

    private void a(int i8) {
        if (i8 == 8) {
            synchronized (b.class) {
                Object[] objArr = f25410i;
                if (objArr != null) {
                    this.f25413b = objArr;
                    f25410i = (Object[]) objArr[0];
                    this.f25412a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f25411j--;
                    return;
                }
            }
        } else if (i8 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f25408g;
                if (objArr2 != null) {
                    this.f25413b = objArr2;
                    f25408g = (Object[]) objArr2[0];
                    this.f25412a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f25409h--;
                    return;
                }
            }
        }
        this.f25412a = new int[i8];
        this.f25413b = new Object[i8];
    }

    private static void g(int[] iArr, Object[] objArr, int i8) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f25411j < 10) {
                    objArr[0] = f25410i;
                    objArr[1] = iArr;
                    for (int i9 = i8 - 1; i9 >= 2; i9--) {
                        objArr[i9] = null;
                    }
                    f25410i = objArr;
                    f25411j++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                if (f25409h < 10) {
                    objArr[0] = f25408g;
                    objArr[1] = iArr;
                    for (int i10 = i8 - 1; i10 >= 2; i10--) {
                        objArr[i10] = null;
                    }
                    f25408g = objArr;
                    f25409h++;
                }
            }
        }
    }

    private g<E, E> i() {
        if (this.f25415d == null) {
            this.f25415d = new a();
        }
        return this.f25415d;
    }

    private int n(Object obj, int i8) {
        int i9 = this.f25414c;
        if (i9 == 0) {
            return -1;
        }
        int iA = d.a(this.f25412a, i9, i8);
        if (iA < 0 || obj.equals(this.f25413b[iA])) {
            return iA;
        }
        int i10 = iA + 1;
        while (i10 < i9 && this.f25412a[i10] == i8) {
            if (obj.equals(this.f25413b[i10])) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iA - 1; i11 >= 0 && this.f25412a[i11] == i8; i11--) {
            if (obj.equals(this.f25413b[i11])) {
                return i11;
            }
        }
        return ~i10;
    }

    private int p() {
        int i8 = this.f25414c;
        if (i8 == 0) {
            return -1;
        }
        int iA = d.a(this.f25412a, i8, 0);
        if (iA < 0 || this.f25413b[iA] == null) {
            return iA;
        }
        int i9 = iA + 1;
        while (i9 < i8 && this.f25412a[i9] == 0) {
            if (this.f25413b[i9] == null) {
                return i9;
            }
            i9++;
        }
        for (int i10 = iA - 1; i10 >= 0 && this.f25412a[i10] == 0; i10--) {
            if (this.f25413b[i10] == null) {
                return i10;
            }
        }
        return ~i9;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e8) {
        int i8;
        int iN;
        if (e8 == null) {
            iN = p();
            i8 = 0;
        } else {
            int iHashCode = e8.hashCode();
            i8 = iHashCode;
            iN = n(e8, iHashCode);
        }
        if (iN >= 0) {
            return false;
        }
        int i9 = ~iN;
        int i10 = this.f25414c;
        int[] iArr = this.f25412a;
        if (i10 >= iArr.length) {
            int i11 = 4;
            if (i10 >= 8) {
                i11 = (i10 >> 1) + i10;
            } else if (i10 >= 4) {
                i11 = 8;
            }
            Object[] objArr = this.f25413b;
            a(i11);
            int[] iArr2 = this.f25412a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f25413b, 0, objArr.length);
            }
            g(iArr, objArr, this.f25414c);
        }
        int i12 = this.f25414c;
        if (i9 < i12) {
            int[] iArr3 = this.f25412a;
            int i13 = i9 + 1;
            System.arraycopy(iArr3, i9, iArr3, i13, i12 - i9);
            Object[] objArr2 = this.f25413b;
            System.arraycopy(objArr2, i9, objArr2, i13, this.f25414c - i9);
        }
        this.f25412a[i9] = i8;
        this.f25413b[i9] = e8;
        this.f25414c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        e(this.f25414c + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i8 = this.f25414c;
        if (i8 != 0) {
            g(this.f25412a, this.f25413b, i8);
            this.f25412a = f25406e;
            this.f25413b = f25407f;
            this.f25414c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public void e(int i8) {
        int[] iArr = this.f25412a;
        if (iArr.length < i8) {
            Object[] objArr = this.f25413b;
            a(i8);
            int i9 = this.f25414c;
            if (i9 > 0) {
                System.arraycopy(iArr, 0, this.f25412a, 0, i9);
                System.arraycopy(objArr, 0, this.f25413b, 0, this.f25414c);
            }
            g(iArr, objArr, this.f25414c);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i8 = 0; i8 < this.f25414c; i8++) {
                try {
                    if (!set.contains(v(i8))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f25412a;
        int i8 = this.f25414c;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 += iArr[i10];
        }
        return i9;
    }

    public int indexOf(Object obj) {
        return obj == null ? p() : n(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f25414c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return i().m().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        u(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z7 = false;
        for (int i8 = this.f25414c - 1; i8 >= 0; i8--) {
            if (!collection.contains(this.f25413b[i8])) {
                u(i8);
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f25414c;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i8 = this.f25414c;
        Object[] objArr = new Object[i8];
        System.arraycopy(this.f25413b, 0, objArr, 0, i8);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f25414c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f25414c));
        }
        System.arraycopy(this.f25413b, 0, tArr, 0, this.f25414c);
        int length = tArr.length;
        int i8 = this.f25414c;
        if (length > i8) {
            tArr[i8] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f25414c * 14);
        sb.append('{');
        for (int i8 = 0; i8 < this.f25414c; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            E eV = v(i8);
            if (eV != this) {
                sb.append(eV);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public E u(int i8) {
        Object[] objArr = this.f25413b;
        E e8 = (E) objArr[i8];
        int i9 = this.f25414c;
        if (i9 <= 1) {
            g(this.f25412a, objArr, i9);
            this.f25412a = f25406e;
            this.f25413b = f25407f;
            this.f25414c = 0;
        } else {
            int[] iArr = this.f25412a;
            if (iArr.length <= 8 || i9 >= iArr.length / 3) {
                int i10 = i9 - 1;
                this.f25414c = i10;
                if (i8 < i10) {
                    int i11 = i8 + 1;
                    System.arraycopy(iArr, i11, iArr, i8, i10 - i8);
                    Object[] objArr2 = this.f25413b;
                    System.arraycopy(objArr2, i11, objArr2, i8, this.f25414c - i8);
                }
                this.f25413b[this.f25414c] = null;
            } else {
                a(i9 > 8 ? i9 + (i9 >> 1) : 8);
                this.f25414c--;
                if (i8 > 0) {
                    System.arraycopy(iArr, 0, this.f25412a, 0, i8);
                    System.arraycopy(objArr, 0, this.f25413b, 0, i8);
                }
                int i12 = this.f25414c;
                if (i8 < i12) {
                    int i13 = i8 + 1;
                    System.arraycopy(iArr, i13, this.f25412a, i8, i12 - i8);
                    System.arraycopy(objArr, i13, this.f25413b, i8, this.f25414c - i8);
                }
            }
        }
        return e8;
    }

    public E v(int i8) {
        return (E) this.f25413b[i8];
    }
}
