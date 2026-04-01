package v3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class q<E> extends m<E> implements Set<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient n<E> f26929b;

    q() {
    }

    public static <E> q<E> A() {
        return j0.f26895i;
    }

    public static <E> q<E> B(E e8) {
        return new m0(e8);
    }

    public static <E> q<E> C(E e8, E e9, E e10) {
        return w(3, e8, e9, e10);
    }

    private static boolean D(int i8, int i9) {
        return i8 < (i9 >> 1) + (i9 >> 2);
    }

    static int v(int i8) {
        int iMax = Math.max(i8, 2);
        if (iMax >= 751619276) {
            u3.h.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    private static <E> q<E> w(int i8, Object... objArr) {
        if (i8 == 0) {
            return A();
        }
        if (i8 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return B(obj);
        }
        int iV = v(i8);
        Object[] objArr2 = new Object[iV];
        int i9 = iV - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            Object objA = e0.a(objArr[i12], i12);
            int iHashCode = objA.hashCode();
            int iB = l.b(iHashCode);
            while (true) {
                int i13 = iB & i9;
                Object obj2 = objArr2[i13];
                if (obj2 == null) {
                    objArr[i11] = objA;
                    objArr2[i13] = objA;
                    i10 += iHashCode;
                    i11++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i11, i8, (Object) null);
        if (i11 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new m0(obj3);
        }
        if (v(i11) < iV / 2) {
            return w(i11, objArr);
        }
        if (D(i11, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new j0(objArr, i10, objArr2, i9, i11);
    }

    public static <E> q<E> x(Collection<? extends E> collection) {
        if ((collection instanceof q) && !(collection instanceof SortedSet)) {
            q<E> qVar = (q) collection;
            if (!qVar.n()) {
                return qVar;
            }
        }
        Object[] array = collection.toArray();
        return w(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof q) && z() && ((q) obj).z() && hashCode() != obj.hashCode()) {
            return false;
        }
        return l0.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return l0.b(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public abstract q0<E> iterator();

    public n<E> u() {
        n<E> nVar = this.f26929b;
        if (nVar != null) {
            return nVar;
        }
        n<E> nVarY = y();
        this.f26929b = nVarY;
        return nVarY;
    }

    n<E> y() {
        return n.u(toArray());
    }

    boolean z() {
        return false;
    }
}
