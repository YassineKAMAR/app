package p;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static Object[] f25452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static int f25453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static Object[] f25454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static int f25455g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int[] f25456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object[] f25457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25458c;

    public h() {
        this.f25456a = d.f25421a;
        this.f25457b = d.f25423c;
        this.f25458c = 0;
    }

    public h(int i8) {
        if (i8 == 0) {
            this.f25456a = d.f25421a;
            this.f25457b = d.f25423c;
        } else {
            a(i8);
        }
        this.f25458c = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(h<K, V> hVar) {
        this();
        if (hVar != 0) {
            k(hVar);
        }
    }

    private void a(int i8) {
        if (i8 == 8) {
            synchronized (h.class) {
                Object[] objArr = f25454f;
                if (objArr != null) {
                    this.f25457b = objArr;
                    f25454f = (Object[]) objArr[0];
                    this.f25456a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f25455g--;
                    return;
                }
            }
        } else if (i8 == 4) {
            synchronized (h.class) {
                Object[] objArr2 = f25452d;
                if (objArr2 != null) {
                    this.f25457b = objArr2;
                    f25452d = (Object[]) objArr2[0];
                    this.f25456a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f25453e--;
                    return;
                }
            }
        }
        this.f25456a = new int[i8];
        this.f25457b = new Object[i8 << 1];
    }

    private static int b(int[] iArr, int i8, int i9) {
        try {
            return d.a(iArr, i8, i9);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i8) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                if (f25455g < 10) {
                    objArr[0] = f25454f;
                    objArr[1] = iArr;
                    for (int i9 = (i8 << 1) - 1; i9 >= 2; i9--) {
                        objArr[i9] = null;
                    }
                    f25454f = objArr;
                    f25455g++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (h.class) {
                if (f25453e < 10) {
                    objArr[0] = f25452d;
                    objArr[1] = iArr;
                    for (int i10 = (i8 << 1) - 1; i10 >= 2; i10--) {
                        objArr[i10] = null;
                    }
                    f25452d = objArr;
                    f25453e++;
                }
            }
        }
    }

    public void c(int i8) {
        int i9 = this.f25458c;
        int[] iArr = this.f25456a;
        if (iArr.length < i8) {
            Object[] objArr = this.f25457b;
            a(i8);
            if (this.f25458c > 0) {
                System.arraycopy(iArr, 0, this.f25456a, 0, i9);
                System.arraycopy(objArr, 0, this.f25457b, 0, i9 << 1);
            }
            d(iArr, objArr, i9);
        }
        if (this.f25458c != i9) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i8 = this.f25458c;
        if (i8 > 0) {
            int[] iArr = this.f25456a;
            Object[] objArr = this.f25457b;
            this.f25456a = d.f25421a;
            this.f25457b = d.f25423c;
            this.f25458c = 0;
            d(iArr, objArr, i8);
        }
        if (this.f25458c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (size() != hVar.size()) {
                return false;
            }
            for (int i8 = 0; i8 < this.f25458c; i8++) {
                try {
                    K kJ = j(i8);
                    V vN = n(i8);
                    Object obj2 = hVar.get(kJ);
                    if (vN == null) {
                        if (obj2 != null || !hVar.containsKey(kJ)) {
                            return false;
                        }
                    } else if (!vN.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i9 = 0; i9 < this.f25458c; i9++) {
                try {
                    K kJ2 = j(i9);
                    V vN2 = n(i9);
                    Object obj3 = map.get(kJ2);
                    if (vN2 == null) {
                        if (obj3 != null || !map.containsKey(kJ2)) {
                            return false;
                        }
                    } else if (!vN2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    int f(Object obj, int i8) {
        int i9 = this.f25458c;
        if (i9 == 0) {
            return -1;
        }
        int iB = b(this.f25456a, i9, i8);
        if (iB < 0 || obj.equals(this.f25457b[iB << 1])) {
            return iB;
        }
        int i10 = iB + 1;
        while (i10 < i9 && this.f25456a[i10] == i8) {
            if (obj.equals(this.f25457b[i10 << 1])) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iB - 1; i11 >= 0 && this.f25456a[i11] == i8; i11--) {
            if (obj.equals(this.f25457b[i11 << 1])) {
                return i11;
            }
        }
        return ~i10;
    }

    public int g(Object obj) {
        return obj == null ? h() : f(obj, obj.hashCode());
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v7) {
        int iG = g(obj);
        return iG >= 0 ? (V) this.f25457b[(iG << 1) + 1] : v7;
    }

    int h() {
        int i8 = this.f25458c;
        if (i8 == 0) {
            return -1;
        }
        int iB = b(this.f25456a, i8, 0);
        if (iB < 0 || this.f25457b[iB << 1] == null) {
            return iB;
        }
        int i9 = iB + 1;
        while (i9 < i8 && this.f25456a[i9] == 0) {
            if (this.f25457b[i9 << 1] == null) {
                return i9;
            }
            i9++;
        }
        for (int i10 = iB - 1; i10 >= 0 && this.f25456a[i10] == 0; i10--) {
            if (this.f25457b[i10 << 1] == null) {
                return i10;
            }
        }
        return ~i9;
    }

    public int hashCode() {
        int[] iArr = this.f25456a;
        Object[] objArr = this.f25457b;
        int i8 = this.f25458c;
        int i9 = 1;
        int i10 = 0;
        int iHashCode = 0;
        while (i10 < i8) {
            Object obj = objArr[i9];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i10];
            i10++;
            i9 += 2;
        }
        return iHashCode;
    }

    int i(Object obj) {
        int i8 = this.f25458c * 2;
        Object[] objArr = this.f25457b;
        if (obj == null) {
            for (int i9 = 1; i9 < i8; i9 += 2) {
                if (objArr[i9] == null) {
                    return i9 >> 1;
                }
            }
            return -1;
        }
        for (int i10 = 1; i10 < i8; i10 += 2) {
            if (obj.equals(objArr[i10])) {
                return i10 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f25458c <= 0;
    }

    public K j(int i8) {
        return (K) this.f25457b[i8 << 1];
    }

    public void k(h<? extends K, ? extends V> hVar) {
        int i8 = hVar.f25458c;
        c(this.f25458c + i8);
        if (this.f25458c != 0) {
            for (int i9 = 0; i9 < i8; i9++) {
                put(hVar.j(i9), hVar.n(i9));
            }
        } else if (i8 > 0) {
            System.arraycopy(hVar.f25456a, 0, this.f25456a, 0, i8);
            System.arraycopy(hVar.f25457b, 0, this.f25457b, 0, i8 << 1);
            this.f25458c = i8;
        }
    }

    public V l(int i8) {
        Object[] objArr = this.f25457b;
        int i9 = i8 << 1;
        V v7 = (V) objArr[i9 + 1];
        int i10 = this.f25458c;
        int i11 = 0;
        if (i10 <= 1) {
            d(this.f25456a, objArr, i10);
            this.f25456a = d.f25421a;
            this.f25457b = d.f25423c;
        } else {
            int i12 = i10 - 1;
            int[] iArr = this.f25456a;
            if (iArr.length <= 8 || i10 >= iArr.length / 3) {
                if (i8 < i12) {
                    int i13 = i8 + 1;
                    int i14 = i12 - i8;
                    System.arraycopy(iArr, i13, iArr, i8, i14);
                    Object[] objArr2 = this.f25457b;
                    System.arraycopy(objArr2, i13 << 1, objArr2, i9, i14 << 1);
                }
                Object[] objArr3 = this.f25457b;
                int i15 = i12 << 1;
                objArr3[i15] = null;
                objArr3[i15 + 1] = null;
            } else {
                a(i10 > 8 ? i10 + (i10 >> 1) : 8);
                if (i10 != this.f25458c) {
                    throw new ConcurrentModificationException();
                }
                if (i8 > 0) {
                    System.arraycopy(iArr, 0, this.f25456a, 0, i8);
                    System.arraycopy(objArr, 0, this.f25457b, 0, i9);
                }
                if (i8 < i12) {
                    int i16 = i8 + 1;
                    int i17 = i12 - i8;
                    System.arraycopy(iArr, i16, this.f25456a, i8, i17);
                    System.arraycopy(objArr, i16 << 1, this.f25457b, i9, i17 << 1);
                }
            }
            i11 = i12;
        }
        if (i10 != this.f25458c) {
            throw new ConcurrentModificationException();
        }
        this.f25458c = i11;
        return v7;
    }

    public V m(int i8, V v7) {
        int i9 = (i8 << 1) + 1;
        Object[] objArr = this.f25457b;
        V v8 = (V) objArr[i9];
        objArr[i9] = v7;
        return v8;
    }

    public V n(int i8) {
        return (V) this.f25457b[(i8 << 1) + 1];
    }

    public V put(K k8, V v7) {
        int i8;
        int iF;
        int i9 = this.f25458c;
        if (k8 == null) {
            iF = h();
            i8 = 0;
        } else {
            int iHashCode = k8.hashCode();
            i8 = iHashCode;
            iF = f(k8, iHashCode);
        }
        if (iF >= 0) {
            int i10 = (iF << 1) + 1;
            Object[] objArr = this.f25457b;
            V v8 = (V) objArr[i10];
            objArr[i10] = v7;
            return v8;
        }
        int i11 = ~iF;
        int[] iArr = this.f25456a;
        if (i9 >= iArr.length) {
            int i12 = 4;
            if (i9 >= 8) {
                i12 = (i9 >> 1) + i9;
            } else if (i9 >= 4) {
                i12 = 8;
            }
            Object[] objArr2 = this.f25457b;
            a(i12);
            if (i9 != this.f25458c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f25456a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f25457b, 0, objArr2.length);
            }
            d(iArr, objArr2, i9);
        }
        if (i11 < i9) {
            int[] iArr3 = this.f25456a;
            int i13 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i13, i9 - i11);
            Object[] objArr3 = this.f25457b;
            System.arraycopy(objArr3, i11 << 1, objArr3, i13 << 1, (this.f25458c - i11) << 1);
        }
        int i14 = this.f25458c;
        if (i9 == i14) {
            int[] iArr4 = this.f25456a;
            if (i11 < iArr4.length) {
                iArr4[i11] = i8;
                Object[] objArr4 = this.f25457b;
                int i15 = i11 << 1;
                objArr4[i15] = k8;
                objArr4[i15 + 1] = v7;
                this.f25458c = i14 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k8, V v7) {
        V v8 = get(k8);
        return v8 == null ? put(k8, v7) : v8;
    }

    public V remove(Object obj) {
        int iG = g(obj);
        if (iG >= 0) {
            return l(iG);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int iG = g(obj);
        if (iG < 0) {
            return false;
        }
        V vN = n(iG);
        if (obj2 != vN && (obj2 == null || !obj2.equals(vN))) {
            return false;
        }
        l(iG);
        return true;
    }

    public V replace(K k8, V v7) {
        int iG = g(k8);
        if (iG >= 0) {
            return m(iG, v7);
        }
        return null;
    }

    public boolean replace(K k8, V v7, V v8) {
        int iG = g(k8);
        if (iG < 0) {
            return false;
        }
        V vN = n(iG);
        if (vN != v7 && (v7 == null || !v7.equals(vN))) {
            return false;
        }
        m(iG, v8);
        return true;
    }

    public int size() {
        return this.f25458c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f25458c * 28);
        sb.append('{');
        for (int i8 = 0; i8 < this.f25458c; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            K kJ = j(i8);
            if (kJ != this) {
                sb.append(kJ);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vN = n(i8);
            if (vN != this) {
                sb.append(vN);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
