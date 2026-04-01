package f6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class i extends h {
    public static <T> List<T> c(T[] tArr) {
        kotlin.jvm.internal.q.f(tArr, "<this>");
        List<T> listA = k.a(tArr);
        kotlin.jvm.internal.q.e(listA, "asList(this)");
        return listA;
    }

    public static final <T> T[] d(T[] tArr, T[] destination, int i8, int i9, int i10) {
        kotlin.jvm.internal.q.f(tArr, "<this>");
        kotlin.jvm.internal.q.f(destination, "destination");
        System.arraycopy(tArr, i9, destination, i8, i10 - i9);
        return destination;
    }

    public static /* synthetic */ Object[] e(Object[] objArr, Object[] objArr2, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = objArr.length;
        }
        return d(objArr, objArr2, i8, i9, i10);
    }

    public static byte[] f(byte[] bArr, int i8, int i9) {
        kotlin.jvm.internal.q.f(bArr, "<this>");
        g.b(i9, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i8, i9);
        kotlin.jvm.internal.q.e(bArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return bArrCopyOfRange;
    }

    public static <T> T[] g(T[] tArr, int i8, int i9) {
        kotlin.jvm.internal.q.f(tArr, "<this>");
        g.b(i9, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i8, i9);
        kotlin.jvm.internal.q.e(tArr2, "copyOfRange(this, fromIndex, toIndex)");
        return tArr2;
    }

    public static final <T> void h(T[] tArr, T t7, int i8, int i9) {
        kotlin.jvm.internal.q.f(tArr, "<this>");
        Arrays.fill(tArr, i8, i9, t7);
    }

    public static byte[] i(byte[] bArr, byte[] elements) {
        kotlin.jvm.internal.q.f(bArr, "<this>");
        kotlin.jvm.internal.q.f(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] result = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.q.e(result, "result");
        return result;
    }

    public static final <T> void j(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.q.f(tArr, "<this>");
        kotlin.jvm.internal.q.f(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
