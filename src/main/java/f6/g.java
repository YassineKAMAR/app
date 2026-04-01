package f6;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
class g {
    public static final <T> T[] a(T[] reference, int i8) {
        kotlin.jvm.internal.q.f(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i8);
        kotlin.jvm.internal.q.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) objNewInstance);
    }

    public static final void b(int i8, int i9) {
        if (i8 <= i9) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i8 + ") is greater than size (" + i9 + ").");
    }
}
