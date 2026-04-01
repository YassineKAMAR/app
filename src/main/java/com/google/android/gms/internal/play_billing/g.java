package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends d implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final u f19513b = new e(m.f19626f, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f19514c = 0;

    g() {
    }

    static g w(Object[] objArr, int i8) {
        return i8 == 0 ? m.f19626f : new m(objArr, i8);
    }

    public static g x(Collection collection) {
        if (collection instanceof d) {
            g gVarI = ((d) collection).i();
            if (!gVarI.p()) {
                return gVarI;
            }
            Object[] array = gVarI.toArray();
            return w(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (array2[i8] == null) {
                throw new NullPointerException("at index " + i8);
            }
        }
        return w(array2, length);
    }

    public static g y() {
        return m.f19626f;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    int a(Object[] objArr, int i8) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i9] = get(i9);
        }
        return size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i8, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.d, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i8 = 0; i8 < size; i8++) {
                        if (z5.a(get(i8), list.get(i8))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !z5.a(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i8 = 0; i8 < size; i8++) {
            iHashCode = (iHashCode * 31) + get(i8).hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.d
    @Deprecated
    public final g i() {
        return this;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (obj.equals(get(i8))) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.d, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.d
    /* JADX INFO: renamed from: n */
    public final t iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public g subList(int i8, int i9) {
        a6.d(i8, i9, size());
        int i10 = i9 - i8;
        return i10 == size() ? this : i10 == 0 ? m.f19626f : new f(this, i8, i10);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final u listIterator(int i8) {
        a6.b(i8, size(), "index");
        return isEmpty() ? f19513b : new e(this, i8);
    }
}
