package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object[] f24316a = new Object[0];

    public static final Object[] a(Collection<?> collection) {
        q.f(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i8 = 0;
                while (true) {
                    int i9 = i8 + 1;
                    objArrCopyOf[i8] = it.next();
                    if (i9 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i10 = ((i9 * 3) + 1) >>> 1;
                        if (i10 <= i9) {
                            if (i9 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            i10 = 2147483645;
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i10);
                        q.e(objArrCopyOf, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i9);
                        q.e(objArrCopyOf2, "copyOf(result, size)");
                        return objArrCopyOf2;
                    }
                    i8 = i9;
                }
            }
        }
        return f24316a;
    }

    public static final Object[] b(Collection<?> collection, Object[] objArr) {
        Object[] objArrCopyOf;
        q.f(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i8 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            q.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i9 = i8 + 1;
            objArrCopyOf[i8] = it.next();
            if (i9 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i10 = ((i9 * 3) + 1) >>> 1;
                if (i10 <= i9) {
                    if (i9 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    i10 = 2147483645;
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i10);
                q.e(objArrCopyOf, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i9] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i9);
                q.e(objArrCopyOf2, "copyOf(result, size)");
                return objArrCopyOf2;
            }
            i8 = i9;
        }
    }
}
