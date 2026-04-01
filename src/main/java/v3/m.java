package v3;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class m<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object[] f26904a = new Object[0];

    public static abstract class a<E> {
        static int a(int i8, int i9) {
            if (i9 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i8 + (i8 >> 1) + 1;
            if (iHighestOneBit < i9) {
                iHighestOneBit = Integer.highestOneBit(i9 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }
    }

    m() {
    }

    int a(Object[] objArr, int i8) {
        q0<E> q0VarP = iterator();
        while (q0VarP.hasNext()) {
            objArr[i8] = q0VarP.next();
            i8++;
        }
        return i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    Object[] e() {
        return null;
    }

    int g() {
        throw new UnsupportedOperationException();
    }

    int i() {
        throw new UnsupportedOperationException();
    }

    abstract boolean n();

    /* JADX INFO: renamed from: p */
    public abstract q0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f26904a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        u3.h.i(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrE = e();
            if (objArrE != null) {
                return (T[]) g0.a(objArrE, i(), g(), tArr);
            }
            tArr = (T[]) e0.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }
}
