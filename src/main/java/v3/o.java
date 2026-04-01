package v3;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import v3.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class o<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Map.Entry<?, ?>[] f26912d = new Map.Entry[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient q<Map.Entry<K, V>> f26913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient q<K> f26914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient m<V> f26915c;

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Comparator<? super V> f26916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object[] f26917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f26918c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f26919d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        C0184a f26920e;

        /* JADX INFO: renamed from: v3.o$a$a, reason: collision with other inner class name */
        static final class C0184a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f26921a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f26922b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Object f26923c;

            C0184a(Object obj, Object obj2, Object obj3) {
                this.f26921a = obj;
                this.f26922b = obj2;
                this.f26923c = obj3;
            }

            IllegalArgumentException a() {
                String strValueOf = String.valueOf(this.f26921a);
                String strValueOf2 = String.valueOf(this.f26922b);
                String strValueOf3 = String.valueOf(this.f26921a);
                String strValueOf4 = String.valueOf(this.f26923c);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 39 + strValueOf2.length() + strValueOf3.length() + strValueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(strValueOf);
                sb.append(com.amazon.a.a.o.b.f.f3943b);
                sb.append(strValueOf2);
                sb.append(" and ");
                sb.append(strValueOf3);
                sb.append(com.amazon.a.a.o.b.f.f3943b);
                sb.append(strValueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        a(int i8) {
            this.f26917b = new Object[i8 * 2];
        }

        private o<K, V> a(boolean z7) {
            Object[] objArrD;
            C0184a c0184a;
            C0184a c0184a2;
            if (z7 && (c0184a2 = this.f26920e) != null) {
                throw c0184a2.a();
            }
            int length = this.f26918c;
            if (this.f26916a == null) {
                objArrD = this.f26917b;
            } else {
                if (this.f26919d) {
                    this.f26917b = Arrays.copyOf(this.f26917b, length * 2);
                }
                objArrD = this.f26917b;
                if (!z7) {
                    objArrD = d(objArrD, this.f26918c);
                    if (objArrD.length < this.f26917b.length) {
                        length = objArrD.length >>> 1;
                    }
                }
                f(objArrD, length, this.f26916a);
            }
            this.f26919d = true;
            i0 i0VarI = i0.i(length, objArrD, this);
            if (!z7 || (c0184a = this.f26920e) == null) {
                return i0VarI;
            }
            throw c0184a.a();
        }

        private void c(int i8) {
            int i9 = i8 * 2;
            Object[] objArr = this.f26917b;
            if (i9 > objArr.length) {
                this.f26917b = Arrays.copyOf(objArr, m.a.a(objArr.length, i9));
                this.f26919d = false;
            }
        }

        private Object[] d(Object[] objArr, int i8) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i9 = i8 - 1; i9 >= 0; i9--) {
                Object obj = objArr[i9 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i9);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i8 - bitSet.cardinality()) * 2];
            int i10 = 0;
            int i11 = 0;
            while (i10 < i8 * 2) {
                if (bitSet.get(i10 >>> 1)) {
                    i10 += 2;
                } else {
                    int i12 = i11 + 1;
                    int i13 = i10 + 1;
                    Object obj2 = objArr[i10];
                    Objects.requireNonNull(obj2);
                    objArr2[i11] = obj2;
                    i11 = i12 + 1;
                    i10 = i13 + 1;
                    Object obj3 = objArr[i13];
                    Objects.requireNonNull(obj3);
                    objArr2[i12] = obj3;
                }
            }
            return objArr2;
        }

        static <V> void f(Object[] objArr, int i8, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = i9 * 2;
                Object obj = objArr[i10];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i10 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i9] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i8, f0.a(comparator).e(y.d()));
            for (int i11 = 0; i11 < i8; i11++) {
                int i12 = i11 * 2;
                objArr[i12] = entryArr[i11].getKey();
                objArr[i12 + 1] = entryArr[i11].getValue();
            }
        }

        public o<K, V> b() {
            return a(true);
        }

        public a<K, V> e(K k8, V v7) {
            c(this.f26918c + 1);
            f.a(k8, v7);
            Object[] objArr = this.f26917b;
            int i8 = this.f26918c;
            objArr[i8 * 2] = k8;
            objArr[(i8 * 2) + 1] = v7;
            this.f26918c = i8 + 1;
            return this;
        }
    }

    o() {
    }

    public static <K, V> o<K, V> g() {
        return (o<K, V>) i0.f26879h;
    }

    abstract q<Map.Entry<K, V>> a();

    abstract q<K> b();

    abstract m<V> c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public q<Map.Entry<K, V>> entrySet() {
        q<Map.Entry<K, V>> qVar = this.f26913a;
        if (qVar != null) {
            return qVar;
        }
        q<Map.Entry<K, V>> qVarA = a();
        this.f26913a = qVarA;
        return qVarA;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return y.a(this, obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public q<K> keySet() {
        q<K> qVar = this.f26914b;
        if (qVar != null) {
            return qVar;
        }
        q<K> qVarB = b();
        this.f26914b = qVarB;
        return qVarB;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v7) {
        V v8 = get(obj);
        return v8 != null ? v8 : v7;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public m<V> values() {
        m<V> mVar = this.f26915c;
        if (mVar != null) {
            return mVar;
        }
        m<V> mVarC = c();
        this.f26915c = mVarC;
        return mVarC;
    }

    @Override // java.util.Map
    public int hashCode() {
        return l0.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k8, V v7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return y.c(this);
    }
}
