package f6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class n {
    public static final <T> Object[] a(T[] tArr, boolean z7) {
        kotlin.jvm.internal.q.f(tArr, "<this>");
        if (z7 && kotlin.jvm.internal.q.b(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.q.e(objArrCopyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return objArrCopyOf;
    }

    public static <T> List<T> b(T t7) {
        List<T> listSingletonList = Collections.singletonList(t7);
        kotlin.jvm.internal.q.e(listSingletonList, "singletonList(element)");
        return listSingletonList;
    }
}
