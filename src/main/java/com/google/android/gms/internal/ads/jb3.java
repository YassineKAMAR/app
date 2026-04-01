package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class jb3<E> extends eb3<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ld3 f9558b = new hb3(uc3.f15606f, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9559c = 0;

    jb3() {
    }

    public static jb3 A(Object obj) {
        Object[] objArr = {obj};
        sc3.b(objArr, 1);
        return w(objArr, 1);
    }

    public static jb3 B(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        sc3.b(objArr, 2);
        return w(objArr, 2);
    }

    public static jb3 C(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        sc3.b(objArr, 3);
        return w(objArr, 3);
    }

    public static jb3 D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        sc3.b(objArr, 5);
        return w(objArr, 5);
    }

    public static jb3 E(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        sc3.b(objArr, 6);
        return w(objArr, 6);
    }

    static jb3 w(Object[] objArr, int i8) {
        return i8 == 0 ? uc3.f15606f : new uc3(objArr, i8);
    }

    public static jb3 x(Collection collection) {
        if (!(collection instanceof eb3)) {
            Object[] array = collection.toArray();
            int length = array.length;
            sc3.b(array, length);
            return w(array, length);
        }
        jb3 jb3VarI = ((eb3) collection).i();
        if (!jb3VarI.p()) {
            return jb3VarI;
        }
        Object[] array2 = jb3VarI.toArray();
        return w(array2, array2.length);
    }

    public static jb3 y(Object[] objArr) {
        if (objArr.length == 0) {
            return uc3.f15606f;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        sc3.b(objArr2, length);
        return w(objArr2, length);
    }

    public static jb3 z() {
        return uc3.f15606f;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final ld3 listIterator(int i8) {
        l83.b(i8, size(), "index");
        return isEmpty() ? f9558b : new hb3(this, i8);
    }

    @Override // com.google.android.gms.internal.ads.eb3
    int a(Object[] objArr, int i8) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i8 + i9] = get(i9);
        }
        return i8 + size;
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

    @Override // com.google.android.gms.internal.ads.eb3, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
                        if (g83.a(get(i8), list.get(i8))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !g83.a(it.next(), it2.next())) {
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

    @Override // com.google.android.gms.internal.ads.eb3
    @Deprecated
    public final jb3 i() {
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

    @Override // com.google.android.gms.internal.ads.eb3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
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

    @Override // com.google.android.gms.internal.ads.eb3
    /* JADX INFO: renamed from: n */
    public final kd3 iterator() {
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
    public jb3 subList(int i8, int i9) {
        l83.h(i8, i9, size());
        int i10 = i9 - i8;
        return i10 == size() ? this : i10 == 0 ? uc3.f15606f : new ib3(this, i8, i10);
    }
}
