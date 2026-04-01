package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class ob3 extends eb3 implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient jb3 f12439b;

    ob3() {
    }

    public static ob3 A() {
        return ad3.f5217i;
    }

    public static ob3 B(Object obj) {
        return new hd3(obj);
    }

    public static ob3 C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return I(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static ob3 D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return I(12, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ob3 I(int i8, Object... objArr) {
        if (i8 == 0) {
            return ad3.f5217i;
        }
        if (i8 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new hd3(obj);
        }
        int iV = v(i8);
        Object[] objArr2 = new Object[iV];
        int i9 = iV - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            Object obj2 = objArr[i12];
            sc3.a(obj2, i12);
            int iHashCode = obj2.hashCode();
            int iA = bb3.a(iHashCode);
            while (true) {
                int i13 = iA & i9;
                Object obj3 = objArr2[i13];
                if (obj3 == null) {
                    objArr[i11] = obj2;
                    objArr2[i13] = obj2;
                    i10 += iHashCode;
                    i11++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iA++;
                }
            }
        }
        Arrays.fill(objArr, i11, i8, (Object) null);
        if (i11 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new hd3(obj4);
        }
        if (v(i11) < iV / 2) {
            return I(i11, objArr);
        }
        if (J(i11, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new ad3(objArr, i10, objArr2, i9, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean J(int i8, int i9) {
        return i8 < (i9 >> 1) + (i9 >> 2);
    }

    static int v(int i8) {
        int iMax = Math.max(i8, 2);
        if (iMax >= 751619276) {
            l83.f(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static nb3 x(int i8) {
        return new nb3(i8);
    }

    public static ob3 z(Collection collection) {
        Object[] array = collection.toArray();
        return I(array.length, array);
    }

    boolean H() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ob3) && H() && ((ob3) obj).H() && hashCode() != obj.hashCode()) {
            return false;
        }
        return gd3.c(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return gd3.a(this);
    }

    @Override // com.google.android.gms.internal.ads.eb3
    public jb3 i() {
        jb3 jb3Var = this.f12439b;
        if (jb3Var != null) {
            return jb3Var;
        }
        jb3 jb3VarW = w();
        this.f12439b = jb3VarW;
        return jb3VarW;
    }

    @Override // com.google.android.gms.internal.ads.eb3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n */
    public abstract kd3 iterator();

    jb3 w() {
        Object[] array = toArray();
        int i8 = jb3.f9559c;
        return jb3.w(array, array.length);
    }
}
