package m3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class c2 extends y1 implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient b2 f24634b;

    c2() {
    }

    static int p(int i8) {
        int iMax = Math.max(i8, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static c2 w() {
        return f2.f24666i;
    }

    public static c2 x(Object obj, Object obj2, Object obj3, Object obj4) {
        return z(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    }

    private static c2 z(int i8, Object... objArr) {
        if (i8 == 0) {
            return f2.f24666i;
        }
        if (i8 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new g2(obj);
        }
        int iP = p(i8);
        Object[] objArr2 = new Object[iP];
        int i9 = iP - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            Object obj2 = objArr[i12];
            if (obj2 == null) {
                throw new NullPointerException("at index " + i12);
            }
            int iHashCode = obj2.hashCode();
            int iA = x1.a(iHashCode);
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
            return new g2(obj4);
        }
        if (p(i11) < iP / 2) {
            return z(i11, objArr);
        }
        if (i11 < 3) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new f2(objArr, i10, objArr2, i9, i11);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof c2) && y() && ((c2) obj).y() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public abstract h2 iterator();

    public final b2 u() {
        b2 b2Var = this.f24634b;
        if (b2Var != null) {
            return b2Var;
        }
        b2 b2VarV = v();
        this.f24634b = b2VarV;
        return b2VarV;
    }

    b2 v() {
        Object[] array = toArray();
        int i8 = b2.f24629c;
        return b2.p(array, array.length);
    }

    boolean y() {
        return false;
    }
}
