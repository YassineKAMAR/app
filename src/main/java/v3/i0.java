package v3;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import v3.o;

/* JADX INFO: loaded from: classes.dex */
final class i0<K, V> extends o<K, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final o<Object, Object> f26879h = new i0(null, new Object[0], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Object f26880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient Object[] f26881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f26882g;

    static class a<K, V> extends q<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient o<K, V> f26883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient Object[] f26884d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f26885e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final transient int f26886f;

        /* JADX INFO: renamed from: v3.i0$a$a, reason: collision with other inner class name */
        class C0183a extends n<Map.Entry<K, V>> {
            C0183a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i8) {
                u3.h.g(i8, a.this.f26886f);
                int i9 = i8 * 2;
                Object obj = a.this.f26884d[a.this.f26885e + i9];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f26884d[i9 + (a.this.f26885e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // v3.m
            public boolean n() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f26886f;
            }
        }

        a(o<K, V> oVar, Object[] objArr, int i8, int i9) {
            this.f26883c = oVar;
            this.f26884d = objArr;
            this.f26885e = i8;
            this.f26886f = i9;
        }

        @Override // v3.m
        int a(Object[] objArr, int i8) {
            return u().a(objArr, i8);
        }

        @Override // v3.m, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f26883c.get(key));
        }

        @Override // v3.m
        boolean n() {
            return true;
        }

        @Override // v3.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: p */
        public q0<Map.Entry<K, V>> iterator() {
            return u().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f26886f;
        }

        @Override // v3.q
        n<Map.Entry<K, V>> y() {
            return new C0183a();
        }
    }

    static final class b<K> extends q<K> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient o<K, ?> f26888c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient n<K> f26889d;

        b(o<K, ?> oVar, n<K> nVar) {
            this.f26888c = oVar;
            this.f26889d = nVar;
        }

        @Override // v3.m
        int a(Object[] objArr, int i8) {
            return u().a(objArr, i8);
        }

        @Override // v3.m, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f26888c.get(obj) != null;
        }

        @Override // v3.m
        boolean n() {
            return true;
        }

        @Override // v3.q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: p */
        public q0<K> iterator() {
            return u().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f26888c.size();
        }

        @Override // v3.q
        public n<K> u() {
            return this.f26889d;
        }
    }

    static final class c extends n<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient Object[] f26890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient int f26891d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f26892e;

        c(Object[] objArr, int i8, int i9) {
            this.f26890c = objArr;
            this.f26891d = i8;
            this.f26892e = i9;
        }

        @Override // java.util.List
        public Object get(int i8) {
            u3.h.g(i8, this.f26892e);
            Object obj = this.f26890c[(i8 * 2) + this.f26891d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // v3.m
        boolean n() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f26892e;
        }
    }

    private i0(Object obj, Object[] objArr, int i8) {
        this.f26880e = obj;
        this.f26881f = objArr;
        this.f26882g = i8;
    }

    static <K, V> i0<K, V> i(int i8, Object[] objArr, o.a<K, V> aVar) {
        if (i8 == 0) {
            return (i0) f26879h;
        }
        if (i8 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            f.a(obj, obj2);
            return new i0<>(null, objArr, 1);
        }
        u3.h.k(i8, objArr.length >> 1);
        Object objJ = j(objArr, i8, q.v(i8), 0);
        if (objJ instanceof Object[]) {
            Object[] objArr2 = (Object[]) objJ;
            o.a.C0184a c0184a = (o.a.C0184a) objArr2[2];
            if (aVar == null) {
                throw c0184a.a();
            }
            aVar.f26920e = c0184a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objJ = obj3;
            i8 = iIntValue;
        }
        return new i0<>(objJ, objArr, i8);
    }

    private static Object j(Object[] objArr, int i8, int i9, int i10) {
        o.a.C0184a c0184a = null;
        if (i8 == 1) {
            Object obj = objArr[i10];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i10 ^ 1];
            Objects.requireNonNull(obj2);
            f.a(obj, obj2);
            return null;
        }
        int i11 = i9 - 1;
        int i12 = -1;
        if (i9 <= 128) {
            byte[] bArr = new byte[i9];
            Arrays.fill(bArr, (byte) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i8; i14++) {
                int i15 = (i14 * 2) + i10;
                int i16 = (i13 * 2) + i10;
                Object obj3 = objArr[i15];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i15 ^ 1];
                Objects.requireNonNull(obj4);
                f.a(obj3, obj4);
                int iB = l.b(obj3.hashCode());
                while (true) {
                    int i17 = iB & i11;
                    int i18 = bArr[i17] & 255;
                    if (i18 == 255) {
                        bArr[i17] = (byte) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj3;
                            objArr[i16 ^ 1] = obj4;
                        }
                        i13++;
                    } else {
                        if (obj3.equals(objArr[i18])) {
                            int i19 = i18 ^ 1;
                            Object obj5 = objArr[i19];
                            Objects.requireNonNull(obj5);
                            c0184a = new o.a.C0184a(obj3, obj4, obj5);
                            objArr[i19] = obj4;
                            break;
                        }
                        iB = i17 + 1;
                    }
                }
            }
            return i13 == i8 ? bArr : new Object[]{bArr, Integer.valueOf(i13), c0184a};
        }
        if (i9 <= 32768) {
            short[] sArr = new short[i9];
            Arrays.fill(sArr, (short) -1);
            int i20 = 0;
            for (int i21 = 0; i21 < i8; i21++) {
                int i22 = (i21 * 2) + i10;
                int i23 = (i20 * 2) + i10;
                Object obj6 = objArr[i22];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i22 ^ 1];
                Objects.requireNonNull(obj7);
                f.a(obj6, obj7);
                int iB2 = l.b(obj6.hashCode());
                while (true) {
                    int i24 = iB2 & i11;
                    int i25 = sArr[i24] & 65535;
                    if (i25 == 65535) {
                        sArr[i24] = (short) i23;
                        if (i20 < i21) {
                            objArr[i23] = obj6;
                            objArr[i23 ^ 1] = obj7;
                        }
                        i20++;
                    } else {
                        if (obj6.equals(objArr[i25])) {
                            int i26 = i25 ^ 1;
                            Object obj8 = objArr[i26];
                            Objects.requireNonNull(obj8);
                            c0184a = new o.a.C0184a(obj6, obj7, obj8);
                            objArr[i26] = obj7;
                            break;
                        }
                        iB2 = i24 + 1;
                    }
                }
            }
            return i20 == i8 ? sArr : new Object[]{sArr, Integer.valueOf(i20), c0184a};
        }
        int[] iArr = new int[i9];
        Arrays.fill(iArr, -1);
        int i27 = 0;
        int i28 = 0;
        while (i27 < i8) {
            int i29 = (i27 * 2) + i10;
            int i30 = (i28 * 2) + i10;
            Object obj9 = objArr[i29];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i29 ^ 1];
            Objects.requireNonNull(obj10);
            f.a(obj9, obj10);
            int iB3 = l.b(obj9.hashCode());
            while (true) {
                int i31 = iB3 & i11;
                int i32 = iArr[i31];
                if (i32 == i12) {
                    iArr[i31] = i30;
                    if (i28 < i27) {
                        objArr[i30] = obj9;
                        objArr[i30 ^ 1] = obj10;
                    }
                    i28++;
                } else {
                    if (obj9.equals(objArr[i32])) {
                        int i33 = i32 ^ 1;
                        Object obj11 = objArr[i33];
                        Objects.requireNonNull(obj11);
                        c0184a = new o.a.C0184a(obj9, obj10, obj11);
                        objArr[i33] = obj10;
                        break;
                    }
                    iB3 = i31 + 1;
                    i12 = -1;
                }
            }
            i27++;
            i12 = -1;
        }
        return i28 == i8 ? iArr : new Object[]{iArr, Integer.valueOf(i28), c0184a};
    }

    static Object k(Object obj, Object[] objArr, int i8, int i9, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i8 == 1) {
            Object obj3 = objArr[i9];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i9 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iB = l.b(obj2.hashCode());
            while (true) {
                int i10 = iB & length;
                int i11 = bArr[i10] & 255;
                if (i11 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i11])) {
                    return objArr[i11 ^ 1];
                }
                iB = i10 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iB2 = l.b(obj2.hashCode());
            while (true) {
                int i12 = iB2 & length2;
                int i13 = sArr[i12] & 65535;
                if (i13 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iB2 = i12 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iB3 = l.b(obj2.hashCode());
            while (true) {
                int i14 = iB3 & length3;
                int i15 = iArr[i14];
                if (i15 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iB3 = i14 + 1;
            }
        }
    }

    @Override // v3.o
    q<Map.Entry<K, V>> a() {
        return new a(this, this.f26881f, 0, this.f26882g);
    }

    @Override // v3.o
    q<K> b() {
        return new b(this, new c(this.f26881f, 0, this.f26882g));
    }

    @Override // v3.o
    m<V> c() {
        return new c(this.f26881f, 1, this.f26882g);
    }

    @Override // v3.o, java.util.Map
    public V get(Object obj) {
        V v7 = (V) k(this.f26880e, this.f26881f, this.f26882g, 0, obj);
        if (v7 == null) {
            return null;
        }
        return v7;
    }

    @Override // java.util.Map
    public int size() {
        return this.f26882g;
    }
}
