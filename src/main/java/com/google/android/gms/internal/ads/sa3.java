package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class sa3 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f14581j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Object f14582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int[] f14583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient Object[] f14584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient Object[] f14585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f14586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient int f14587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Set f14588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient Set f14589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient Collection f14590i;

    sa3(int i8) {
        n(8);
    }

    static /* synthetic */ Object i(sa3 sa3Var) {
        Object obj = sa3Var.f14582a;
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int q() {
        return (1 << (this.f14586e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r(Object obj) {
        if (p()) {
            return -1;
        }
        int iB = bb3.b(obj);
        int iQ = q();
        Object obj2 = this.f14582a;
        obj2.getClass();
        int iC = ta3.c(obj2, iB & iQ);
        if (iC != 0) {
            int i8 = ~iQ;
            int i9 = iB & i8;
            do {
                int i10 = iC - 1;
                int[] iArr = this.f14583b;
                iArr.getClass();
                int i11 = iArr[i10];
                if ((i11 & i8) == i9) {
                    Object[] objArr = this.f14584c;
                    objArr.getClass();
                    if (g83.a(obj, objArr[i10])) {
                        return i10;
                    }
                }
                iC = i11 & iQ;
            } while (iC != 0);
        }
        return -1;
    }

    private final int s(int i8, int i9, int i10, int i11) {
        int i12 = i9 - 1;
        Object objD = ta3.d(i9);
        if (i11 != 0) {
            ta3.e(objD, i10 & i12, i11 + 1);
        }
        Object obj = this.f14582a;
        obj.getClass();
        int[] iArr = this.f14583b;
        iArr.getClass();
        for (int i13 = 0; i13 <= i8; i13++) {
            int iC = ta3.c(obj, i13);
            while (iC != 0) {
                int i14 = iC - 1;
                int i15 = iArr[i14];
                int i16 = ((~i8) & i15) | i13;
                int i17 = i16 & i12;
                int iC2 = ta3.c(objD, i17);
                ta3.e(objD, i17, iC);
                iArr[i14] = ((~i12) & i16) | (iC2 & i12);
                iC = i15 & i8;
            }
        }
        this.f14582a = objD;
        u(i12);
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(Object obj) {
        if (p()) {
            return f14581j;
        }
        int iQ = q();
        Object obj2 = this.f14582a;
        obj2.getClass();
        int[] iArr = this.f14583b;
        iArr.getClass();
        Object[] objArr = this.f14584c;
        objArr.getClass();
        int iB = ta3.b(obj, null, iQ, obj2, iArr, objArr, null);
        if (iB == -1) {
            return f14581j;
        }
        Object[] objArr2 = this.f14585d;
        objArr2.getClass();
        Object obj3 = objArr2[iB];
        o(iB, iQ);
        this.f14587f--;
        m();
        return obj3;
    }

    private final void u(int i8) {
        this.f14586e = ((32 - Integer.numberOfLeadingZeros(i8)) & 31) | (this.f14586e & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (p()) {
            return;
        }
        m();
        Map mapK = k();
        if (mapK == null) {
            Object[] objArr = this.f14584c;
            objArr.getClass();
            Arrays.fill(objArr, 0, this.f14587f, (Object) null);
            Object[] objArr2 = this.f14585d;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, this.f14587f, (Object) null);
            Object obj = this.f14582a;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            int[] iArr = this.f14583b;
            iArr.getClass();
            Arrays.fill(iArr, 0, this.f14587f, 0);
        } else {
            this.f14586e = td3.b(size(), 3, 1073741823);
            mapK.clear();
            this.f14582a = null;
        }
        this.f14587f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapK = k();
        return mapK != null ? mapK.containsKey(obj) : r(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapK = k();
        if (mapK != null) {
            return mapK.containsValue(obj);
        }
        for (int i8 = 0; i8 < this.f14587f; i8++) {
            Object[] objArr = this.f14585d;
            objArr.getClass();
            if (g83.a(obj, objArr[i8])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f14589h;
        if (set != null) {
            return set;
        }
        la3 la3Var = new la3(this);
        this.f14589h = la3Var;
        return la3Var;
    }

    final int f() {
        return isEmpty() ? -1 : 0;
    }

    final int g(int i8) {
        int i9 = i8 + 1;
        if (i9 < this.f14587f) {
            return i9;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapK = k();
        if (mapK != null) {
            return mapK.get(obj);
        }
        int iR = r(obj);
        if (iR == -1) {
            return null;
        }
        Object[] objArr = this.f14585d;
        objArr.getClass();
        return objArr[iR];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    final Map k() {
        Object obj = this.f14582a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f14588g;
        if (set != null) {
            return set;
        }
        oa3 oa3Var = new oa3(this);
        this.f14588g = oa3Var;
        return oa3Var;
    }

    final void m() {
        this.f14586e += 32;
    }

    final void n(int i8) {
        this.f14586e = td3.b(8, 1, 1073741823);
    }

    final void o(int i8, int i9) {
        Object obj = this.f14582a;
        obj.getClass();
        int[] iArr = this.f14583b;
        iArr.getClass();
        Object[] objArr = this.f14584c;
        objArr.getClass();
        Object[] objArr2 = this.f14585d;
        objArr2.getClass();
        int size = size() - 1;
        if (i8 >= size) {
            objArr[i8] = null;
            objArr2[i8] = null;
            iArr[i8] = 0;
            return;
        }
        int i10 = i8 + 1;
        Object obj2 = objArr[size];
        objArr[i8] = obj2;
        objArr2[i8] = objArr2[size];
        objArr[size] = null;
        objArr2[size] = null;
        iArr[i8] = iArr[size];
        iArr[size] = 0;
        int iB = bb3.b(obj2) & i9;
        int iC = ta3.c(obj, iB);
        int i11 = size + 1;
        if (iC == i11) {
            ta3.e(obj, iB, i10);
            return;
        }
        while (true) {
            int i12 = iC - 1;
            int i13 = iArr[i12];
            int i14 = i13 & i9;
            if (i14 == i11) {
                iArr[i12] = (i13 & (~i9)) | (i9 & i10);
                return;
            }
            iC = i14;
        }
    }

    final boolean p() {
        return this.f14582a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        if (p()) {
            l83.j(p(), "Arrays already allocated");
            int i8 = this.f14586e;
            int iMax = Math.max(i8 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f14582a = ta3.d(iMax2);
            u(iMax2 - 1);
            this.f14583b = new int[i8];
            this.f14584c = new Object[i8];
            this.f14585d = new Object[i8];
        }
        Map mapK = k();
        if (mapK != null) {
            return mapK.put(obj, obj2);
        }
        int[] iArr = this.f14583b;
        iArr.getClass();
        Object[] objArr = this.f14584c;
        objArr.getClass();
        Object[] objArr2 = this.f14585d;
        objArr2.getClass();
        int i9 = this.f14587f;
        int i10 = i9 + 1;
        int iB = bb3.b(obj);
        int iQ = q();
        int i11 = iB & iQ;
        Object obj3 = this.f14582a;
        obj3.getClass();
        int iC = ta3.c(obj3, i11);
        if (iC != 0) {
            int i12 = ~iQ;
            int i13 = iB & i12;
            int i14 = 0;
            while (true) {
                int i15 = iC - 1;
                int i16 = iArr[i15];
                int i17 = i16 & i12;
                if (i17 == i13 && g83.a(obj, objArr[i15])) {
                    Object obj4 = objArr2[i15];
                    objArr2[i15] = obj2;
                    return obj4;
                }
                int i18 = i16 & iQ;
                i14++;
                if (i18 != 0) {
                    iC = i18;
                } else {
                    if (i14 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q() + 1, 1.0f);
                        int iF = f();
                        while (iF >= 0) {
                            Object[] objArr3 = this.f14584c;
                            objArr3.getClass();
                            Object obj5 = objArr3[iF];
                            Object[] objArr4 = this.f14585d;
                            objArr4.getClass();
                            linkedHashMap.put(obj5, objArr4[iF]);
                            iF = g(iF);
                        }
                        this.f14582a = linkedHashMap;
                        this.f14583b = null;
                        this.f14584c = null;
                        this.f14585d = null;
                        m();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i10 <= iQ) {
                        iArr[i15] = (i10 & iQ) | i17;
                    }
                }
            }
        } else if (i10 > iQ) {
            iQ = s(iQ, ta3.a(iQ), iB, i9);
        } else {
            Object obj6 = this.f14582a;
            obj6.getClass();
            ta3.e(obj6, i11, i10);
        }
        int[] iArr2 = this.f14583b;
        iArr2.getClass();
        int length = iArr2.length;
        if (i10 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            int[] iArr3 = this.f14583b;
            iArr3.getClass();
            this.f14583b = Arrays.copyOf(iArr3, iMin);
            Object[] objArr5 = this.f14584c;
            objArr5.getClass();
            this.f14584c = Arrays.copyOf(objArr5, iMin);
            Object[] objArr6 = this.f14585d;
            objArr6.getClass();
            this.f14585d = Arrays.copyOf(objArr6, iMin);
        }
        int i19 = (~iQ) & iB;
        int[] iArr4 = this.f14583b;
        iArr4.getClass();
        iArr4[i9] = i19;
        Object[] objArr7 = this.f14584c;
        objArr7.getClass();
        objArr7[i9] = obj;
        Object[] objArr8 = this.f14585d;
        objArr8.getClass();
        objArr8[i9] = obj2;
        this.f14587f = i10;
        m();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapK = k();
        if (mapK != null) {
            return mapK.remove(obj);
        }
        Object objT = t(obj);
        if (objT == f14581j) {
            return null;
        }
        return objT;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapK = k();
        return mapK != null ? mapK.size() : this.f14587f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f14590i;
        if (collection != null) {
            return collection;
        }
        ra3 ra3Var = new ra3(this);
        this.f14590i = ra3Var;
        return ra3Var;
    }
}
