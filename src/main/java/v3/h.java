package v3;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f26853j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Object f26854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int[] f26855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient Object[] f26856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient Object[] f26857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f26858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f26859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Set<K> f26860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f26861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient Collection<V> f26862i;

    class a extends h<K, V>.e<K> {
        a() {
            super(h.this, null);
        }

        @Override // v3.h.e
        K b(int i8) {
            return (K) h.this.H(i8);
        }
    }

    class b extends h<K, V>.e<Map.Entry<K, V>> {
        b() {
            super(h.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // v3.h.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> b(int i8) {
            return new g(i8);
        }
    }

    class c extends h<K, V>.e<V> {
        c() {
            super(h.this, null);
        }

        @Override // v3.h.e
        V b(int i8) {
            return (V) h.this.X(i8);
        }
    }

    class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> mapX = h.this.x();
            if (mapX != null) {
                return mapX.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iE = h.this.E(entry.getKey());
            return iE != -1 && u3.f.a(h.this.X(iE), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return h.this.z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapX = h.this.x();
            if (mapX != null) {
                return mapX.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (h.this.K()) {
                return false;
            }
            int iC = h.this.C();
            int iF = i.f(entry.getKey(), entry.getValue(), iC, h.this.O(), h.this.M(), h.this.N(), h.this.P());
            if (iF == -1) {
                return false;
            }
            h.this.J(iF, iC);
            h.f(h.this);
            h.this.D();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.size();
        }
    }

    private abstract class e<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f26868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f26869c;

        private e() {
            this.f26867a = h.this.f26858e;
            this.f26868b = h.this.A();
            this.f26869c = -1;
        }

        /* synthetic */ e(h hVar, a aVar) {
            this();
        }

        private void a() {
            if (h.this.f26858e != this.f26867a) {
                throw new ConcurrentModificationException();
            }
        }

        abstract T b(int i8);

        void c() {
            this.f26867a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26868b >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i8 = this.f26868b;
            this.f26869c = i8;
            T tB = b(i8);
            this.f26868b = h.this.B(this.f26868b);
            return tB;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            v3.f.c(this.f26869c >= 0);
            c();
            h hVar = h.this;
            hVar.remove(hVar.H(this.f26869c));
            this.f26868b = h.this.p(this.f26868b, this.f26869c);
            this.f26869c = -1;
        }
    }

    class f extends AbstractSet<K> {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return h.this.I();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapX = h.this.x();
            return mapX != null ? mapX.keySet().remove(obj) : h.this.L(obj) != h.f26853j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.size();
        }
    }

    final class g extends v3.b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f26872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f26873b;

        g(int i8) {
            this.f26872a = (K) h.this.H(i8);
            this.f26873b = i8;
        }

        private void a() {
            int i8 = this.f26873b;
            if (i8 == -1 || i8 >= h.this.size() || !u3.f.a(this.f26872a, h.this.H(this.f26873b))) {
                this.f26873b = h.this.E(this.f26872a);
            }
        }

        @Override // v3.b, java.util.Map.Entry
        public K getKey() {
            return this.f26872a;
        }

        @Override // v3.b, java.util.Map.Entry
        public V getValue() {
            Map<K, V> mapX = h.this.x();
            if (mapX != null) {
                return (V) d0.a(mapX.get(this.f26872a));
            }
            a();
            int i8 = this.f26873b;
            return i8 == -1 ? (V) d0.b() : (V) h.this.X(i8);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v7) {
            Map<K, V> mapX = h.this.x();
            if (mapX != null) {
                return (V) d0.a(mapX.put(this.f26872a, v7));
            }
            a();
            int i8 = this.f26873b;
            if (i8 == -1) {
                h.this.put(this.f26872a, v7);
                return (V) d0.b();
            }
            V v8 = (V) h.this.X(i8);
            h.this.W(this.f26873b, v7);
            return v8;
        }
    }

    /* JADX INFO: renamed from: v3.h$h, reason: collision with other inner class name */
    class C0182h extends AbstractCollection<V> {
        C0182h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return h.this.Y();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return h.this.size();
        }
    }

    h() {
        F(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int C() {
        return (1 << (this.f26858e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int E(Object obj) {
        if (K()) {
            return -1;
        }
        int iC = l.c(obj);
        int iC2 = C();
        int iH = i.h(O(), iC & iC2);
        if (iH == 0) {
            return -1;
        }
        int iB = i.b(iC, iC2);
        do {
            int i8 = iH - 1;
            int iY = y(i8);
            if (i.b(iY, iC2) == iB && u3.f.a(obj, H(i8))) {
                return i8;
            }
            iH = i.c(iY, iC2);
        } while (iH != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K H(int i8) {
        return (K) N()[i8];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object L(Object obj) {
        if (K()) {
            return f26853j;
        }
        int iC = C();
        int iF = i.f(obj, null, iC, O(), M(), N(), null);
        if (iF == -1) {
            return f26853j;
        }
        V vX = X(iF);
        J(iF, iC);
        this.f26859f--;
        D();
        return vX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] M() {
        int[] iArr = this.f26855b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] N() {
        Object[] objArr = this.f26856c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object O() {
        Object obj = this.f26854a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] P() {
        Object[] objArr = this.f26857d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void R(int i8) {
        int iMin;
        int length = M().length;
        if (i8 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        Q(iMin);
    }

    private int S(int i8, int i9, int i10, int i11) {
        Object objA = i.a(i9);
        int i12 = i9 - 1;
        if (i11 != 0) {
            i.i(objA, i10 & i12, i11 + 1);
        }
        Object objO = O();
        int[] iArrM = M();
        for (int i13 = 0; i13 <= i8; i13++) {
            int iH = i.h(objO, i13);
            while (iH != 0) {
                int i14 = iH - 1;
                int i15 = iArrM[i14];
                int iB = i.b(i15, i8) | i13;
                int i16 = iB & i12;
                int iH2 = i.h(objA, i16);
                i.i(objA, i16, iH);
                iArrM[i14] = i.d(iB, iH2, i12);
                iH = i.c(i15, i8);
            }
        }
        this.f26854a = objA;
        U(i12);
        return i12;
    }

    private void T(int i8, int i9) {
        M()[i8] = i9;
    }

    private void U(int i8) {
        this.f26858e = i.d(this.f26858e, 32 - Integer.numberOfLeadingZeros(i8), 31);
    }

    private void V(int i8, K k8) {
        N()[i8] = k8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i8, V v7) {
        P()[i8] = v7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V X(int i8) {
        return (V) P()[i8];
    }

    static /* synthetic */ int f(h hVar) {
        int i8 = hVar.f26859f;
        hVar.f26859f = i8 - 1;
        return i8;
    }

    public static <K, V> h<K, V> s() {
        return new h<>();
    }

    private int y(int i8) {
        return M()[i8];
    }

    int A() {
        return isEmpty() ? -1 : 0;
    }

    int B(int i8) {
        int i9 = i8 + 1;
        if (i9 < this.f26859f) {
            return i9;
        }
        return -1;
    }

    void D() {
        this.f26858e += 32;
    }

    void F(int i8) {
        u3.h.e(i8 >= 0, "Expected size must be >= 0");
        this.f26858e = w3.a.a(i8, 1, 1073741823);
    }

    void G(int i8, K k8, V v7, int i9, int i10) {
        T(i8, i.d(i9, 0, i10));
        V(i8, k8);
        W(i8, v7);
    }

    Iterator<K> I() {
        Map<K, V> mapX = x();
        return mapX != null ? mapX.keySet().iterator() : new a();
    }

    void J(int i8, int i9) {
        Object objO = O();
        int[] iArrM = M();
        Object[] objArrN = N();
        Object[] objArrP = P();
        int size = size() - 1;
        if (i8 >= size) {
            objArrN[i8] = null;
            objArrP[i8] = null;
            iArrM[i8] = 0;
            return;
        }
        Object obj = objArrN[size];
        objArrN[i8] = obj;
        objArrP[i8] = objArrP[size];
        objArrN[size] = null;
        objArrP[size] = null;
        iArrM[i8] = iArrM[size];
        iArrM[size] = 0;
        int iC = l.c(obj) & i9;
        int iH = i.h(objO, iC);
        int i10 = size + 1;
        if (iH == i10) {
            i.i(objO, iC, i8 + 1);
            return;
        }
        while (true) {
            int i11 = iH - 1;
            int i12 = iArrM[i11];
            int iC2 = i.c(i12, i9);
            if (iC2 == i10) {
                iArrM[i11] = i.d(i12, i8 + 1, i9);
                return;
            }
            iH = iC2;
        }
    }

    boolean K() {
        return this.f26854a == null;
    }

    void Q(int i8) {
        this.f26855b = Arrays.copyOf(M(), i8);
        this.f26856c = Arrays.copyOf(N(), i8);
        this.f26857d = Arrays.copyOf(P(), i8);
    }

    Iterator<V> Y() {
        Map<K, V> mapX = x();
        return mapX != null ? mapX.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (K()) {
            return;
        }
        D();
        Map<K, V> mapX = x();
        if (mapX != null) {
            this.f26858e = w3.a.a(size(), 3, 1073741823);
            mapX.clear();
            this.f26854a = null;
        } else {
            Arrays.fill(N(), 0, this.f26859f, (Object) null);
            Arrays.fill(P(), 0, this.f26859f, (Object) null);
            i.g(O());
            Arrays.fill(M(), 0, this.f26859f, 0);
        }
        this.f26859f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> mapX = x();
        return mapX != null ? mapX.containsKey(obj) : E(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> mapX = x();
        if (mapX != null) {
            return mapX.containsValue(obj);
        }
        for (int i8 = 0; i8 < this.f26859f; i8++) {
            if (u3.f.a(obj, X(i8))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f26861h;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setT = t();
        this.f26861h = setT;
        return setT;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> mapX = x();
        if (mapX != null) {
            return mapX.get(obj);
        }
        int iE = E(obj);
        if (iE == -1) {
            return null;
        }
        o(iE);
        return X(iE);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f26860g;
        if (set != null) {
            return set;
        }
        Set<K> setV = v();
        this.f26860g = setV;
        return setV;
    }

    void o(int i8) {
    }

    int p(int i8, int i9) {
        return i8 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k8, V v7) {
        int iS;
        if (K()) {
            q();
        }
        Map<K, V> mapX = x();
        if (mapX != null) {
            return mapX.put(k8, v7);
        }
        int[] iArrM = M();
        Object[] objArrN = N();
        Object[] objArrP = P();
        int i8 = this.f26859f;
        int i9 = i8 + 1;
        int iC = l.c(k8);
        int iC2 = C();
        int i10 = iC & iC2;
        int iH = i.h(O(), i10);
        if (iH == 0) {
            if (i9 <= iC2) {
                i.i(O(), i10, i9);
                iS = iC2;
            }
            iS = S(iC2, i.e(iC2), iC, i8);
        } else {
            int iB = i.b(iC, iC2);
            int i11 = 0;
            while (true) {
                int i12 = iH - 1;
                int i13 = iArrM[i12];
                if (i.b(i13, iC2) == iB && u3.f.a(k8, objArrN[i12])) {
                    V v8 = (V) objArrP[i12];
                    objArrP[i12] = v7;
                    o(i12);
                    return v8;
                }
                int iC3 = i.c(i13, iC2);
                i11++;
                if (iC3 != 0) {
                    iH = iC3;
                } else {
                    if (i11 >= 9) {
                        return r().put(k8, v7);
                    }
                    if (i9 <= iC2) {
                        iArrM[i12] = i.d(i13, i9, iC2);
                    }
                }
            }
            iS = iC2;
        }
        R(i9);
        G(i8, k8, v7, iC, iS);
        this.f26859f = i9;
        D();
        return null;
    }

    int q() {
        u3.h.n(K(), "Arrays already allocated");
        int i8 = this.f26858e;
        int iJ = i.j(i8);
        this.f26854a = i.a(iJ);
        U(iJ - 1);
        this.f26855b = new int[i8];
        this.f26856c = new Object[i8];
        this.f26857d = new Object[i8];
        return i8;
    }

    Map<K, V> r() {
        Map<K, V> mapU = u(C() + 1);
        int iA = A();
        while (iA >= 0) {
            mapU.put(H(iA), X(iA));
            iA = B(iA);
        }
        this.f26854a = mapU;
        this.f26855b = null;
        this.f26856c = null;
        this.f26857d = null;
        D();
        return mapU;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> mapX = x();
        if (mapX != null) {
            return mapX.remove(obj);
        }
        V v7 = (V) L(obj);
        if (v7 == f26853j) {
            return null;
        }
        return v7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapX = x();
        return mapX != null ? mapX.size() : this.f26859f;
    }

    Set<Map.Entry<K, V>> t() {
        return new d();
    }

    Map<K, V> u(int i8) {
        return new LinkedHashMap(i8, 1.0f);
    }

    Set<K> v() {
        return new f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f26862i;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionW = w();
        this.f26862i = collectionW;
        return collectionW;
    }

    Collection<V> w() {
        return new C0182h();
    }

    Map<K, V> x() {
        Object obj = this.f26854a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    Iterator<Map.Entry<K, V>> z() {
        Map<K, V> mapX = x();
        return mapX != null ? mapX.entrySet().iterator() : new b();
    }
}
